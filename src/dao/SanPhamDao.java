package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.Loai;
import entity.SanPham;

public class SanPhamDao {
private ArrayList<SanPham> list;
	
	
	/*
	 * thêm SanPham
	 */
	public boolean themSanPham(SanPham p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into SanPham values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getMasanpham());
			stmt.setString(2, p.getTensanpham());
			stmt.setInt(3, p.getSoluong());
			stmt.setDouble(4, p.getGiadonvi());
			stmt.setDouble(5, p.getGianhap());
			stmt.setString(6, p.getAnhsanpham());
			stmt.setString(7, p.getXuatxu());
			stmt.setString(8, p.getChatlieu());
			stmt.setInt(9, p.getSotrang());
			stmt.setString(10, p.getTentacgia());
			stmt.setString(11, p.getNhaxuatban());
			stmt.setString(12, p.getNhacungcap());
			stmt.setString(13, p.getLoai().getMaloai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	public boolean themSach(SanPham p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into SanPham values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getMasanpham());
			stmt.setString(2, p.getTensanpham());
			stmt.setInt(3, p.getSoluong());
			stmt.setDouble(4, p.getGiadonvi());
			stmt.setDouble(5, p.getGianhap());
			stmt.setString(6, p.getAnhsanpham());
			stmt.setString(7, null);
			stmt.setString(8,null);
			stmt.setInt(9, p.getSotrang());
			stmt.setString(10, p.getTentacgia());
			stmt.setString(11, p.getNhaxuatban());
			stmt.setString(12,null);
			stmt.setString(13, p.getLoai().getMaloai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	public boolean themVanPhongPham(SanPham p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into SanPham values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getMasanpham());
			stmt.setString(2, p.getTensanpham());
			stmt.setInt(3, p.getSoluong());
			stmt.setDouble(4, p.getGiadonvi());
			stmt.setDouble(5, p.getGianhap());
			stmt.setString(6, p.getAnhsanpham());
			stmt.setString(7, p.getXuatxu());
			stmt.setString(8, p.getChatlieu());
			stmt.setInt(9, 0);
			stmt.setString(10, null);
			stmt.setString(11, null);
			stmt.setString(12, p.getNhacungcap());
			stmt.setString(13, p.getLoai().getMaloai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa SanPham
	 */
	public boolean xoaSanPham(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from SanPham where masanpham = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa SanPham
	 */
	public boolean suaSanPham(SanPham p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update SanPham set tensanpham = ? , soluong = ?, giadonvi= ? , gianhap = ?, anhsanpham = ? , xuatxu = ?, chatlieu = ?, sotrang = ? , tentacgia = ?, nhaxuatban = ? , nhacungcap = ? , maloai = ? where masanpham = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(13, p.getMasanpham());
			stmt.setString(1, p.getTensanpham());
			stmt.setInt(2, p.getSoluong());
			stmt.setDouble(3, p.getGiadonvi());
			stmt.setDouble(4, p.getGianhap());
			stmt.setString(5, p.getAnhsanpham());
			stmt.setString(6, p.getXuatxu());
			stmt.setString(7, p.getChatlieu());
			stmt.setInt(8, p.getSotrang());
			stmt.setString(9, p.getTentacgia());
			stmt.setString(10, p.getNhaxuatban());
			stmt.setString(11, p.getNhacungcap());
			stmt.setString(12, p.getLoai().getMaloai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các SanPham
	 */
	public ArrayList<SanPham> layDsSanPham(){
		list = new ArrayList<SanPham>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from SanPham");
			while(rs.next()) {
		
				
				SanPham kh = new SanPham(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getDouble(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11),
						rs.getString(12),new Loai(rs.getString(13)));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	public SanPham timSanPham(String masp){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		SanPham sp = null;
		try {
			String sql = " select *  from SanPham where masanpham = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, masp);
			
			
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
			 sp = new SanPham(rs.getString(1),rs.getString(2),rs.getInt(3),
					rs.getDouble(4),rs.getDouble(5),rs.getString(6),rs.getString(7),
					rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11),
					rs.getString(12),new Loai(rs.getString(13)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sp;
	}
	
	
	
	
	
	
	
	
	
	
}
