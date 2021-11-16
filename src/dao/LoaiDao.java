package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.Loai;

public class LoaiDao {
	private ArrayList<Loai> list;
	
	
	/*
	 * thêm loai
	 */
	public boolean themLoai(Loai p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into LoaiSanPham values(?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(2, p.getMaloai());
			stmt.setString(1, p.getTenloai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa loai
	 */
	public boolean xoaLoai(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from LoaiSanPham where maloai = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa loai
	 */
	public boolean suaLoai(Loai p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update LoaiSanPham set tenloai = ? where maloai = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, p.getTenloai());
			stmt.setString(2, p.getMaloai());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các loai
	 */
	public ArrayList<Loai> layDsLoai(){
		list = new ArrayList<Loai>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from LoaiSanPham");
			while(rs.next()) {
				
				Loai kh = new Loai(rs.getString(1),rs.getString(2));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
