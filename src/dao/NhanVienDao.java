package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.Loai;
import entity.NhanVien;
import entity.SanPham;

public class NhanVienDao {
private ArrayList<NhanVien> list;
	
	
	/*
	 * thêm NhanVien
	 */
	public boolean themNhanVien(NhanVien p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into NhanVien values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getManhanvien());
			stmt.setString(2, p.getHoten());
			stmt.setDate(3, (Date) p.getNgaysinh());
			stmt.setString(4, p.getDiachi());
			stmt.setString(5, p.getCmnd());
			stmt.setBoolean(6, p.isChucvu());
			stmt.setBoolean(7, p.isGioitinh());
			stmt.setInt(8, p.getCa());
			stmt.setString(9, p.getQuanly().getManhanvien());
			stmt.setString(10, p.getSdt());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa NhanVien
	 */
	public boolean xoaNhanVien(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from NhanVien where manhanvien = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa NhanVien
	 */
	public boolean suaNhanVien(NhanVien p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update NhanVien set hoten = ? , ngaysinh = ?, diachi = ?, sochungminh = ?,"
					+ "chucvu = ?, gioitinh = ?, ca  = ?, maquanly = ?, sodienthoai = ?  where manhanvien = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(10, p.getManhanvien());
			stmt.setString(1, p.getHoten());
			stmt.setDate(2, (Date) p.getNgaysinh());
			stmt.setString(3, p.getDiachi());
			stmt.setString(4, p.getCmnd());
			stmt.setBoolean(5, p.isChucvu());
			stmt.setBoolean(6, p.isGioitinh());
			stmt.setInt(7, p.getCa());
			stmt.setString(8, p.getQuanly().getManhanvien());
			stmt.setString(9, p.getSdt());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các NhanVien
	 */
	public ArrayList<NhanVien> layDsNhanVien(){
		list = new ArrayList<NhanVien>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from NhanVien");
			while(rs.next()) {
				
				NhanVien kh = new NhanVien(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),
						rs.getString(5),
						rs.getBoolean(6),rs.getBoolean(7),rs.getInt(8),
						new NhanVien(rs.getString(9)),rs.getString(10));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	public NhanVien timNhanVien(String manv){
		Connection con = Database.getInstance().getConnection();
		
		NhanVien nv=null;
		try {
			String sql = " select *  from NhanVien where manhanvien = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, manv);
			
			
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
			 nv = new NhanVien(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),
						rs.getString(5),
						rs.getBoolean(6),rs.getBoolean(7),rs.getInt(8),
						new NhanVien(rs.getString(9)),rs.getString(10));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nv;
	}
	
	
	
}
