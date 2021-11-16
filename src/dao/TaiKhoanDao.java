package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.NhanVien;
import entity.TaiKhoan;

public class TaiKhoanDao {
private ArrayList<TaiKhoan> list;
	
	
	/*
	 * thêm TaiKhoan
	 */
	public boolean themTaiKhoan(TaiKhoan p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into TaiKhoan values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getTaikhoan());
			stmt.setString(2, p.getMatkhau());
			stmt.setString(3, p.getNv().getManhanvien());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa TaiKhoan
	 */
	public boolean xoaTaiKhoan(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from TaiKhoan where tentaikhoan = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa TaiKhoan
	 */
	public boolean suaMatKhau(TaiKhoan p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update TaiKhoan set matkhau = ? where tentaikhoan = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			

			stmt.setString(2, p.getTaikhoan());
			stmt.setString(1, p.getMatkhau());

			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các TaiKhoan
	 */
	public ArrayList<TaiKhoan> layDsTaiKhoan(){
		list = new ArrayList<TaiKhoan>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from TaiKhoan");
			while(rs.next()) {
				
				TaiKhoan kh = new TaiKhoan(rs.getString(1),rs.getString(2),new NhanVien(rs.getString(3)));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
