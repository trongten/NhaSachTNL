package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.CTHoaDon;
import entity.HoaDon;
import entity.SanPham;

public class CTHoaDonDao {
	private ArrayList<CTHoaDon> list;


	/*
	 * thêm CTHoaDon
	 */
	public boolean themCTHoaDon(CTHoaDon p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into CTHoaDon values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDouble(1, p.getThanhtien());
			stmt.setInt(2, p.getSoluongsanpham());
			stmt.setString(3, p.getHd().getMahoadon());
			stmt.setString(4, p.getSp().getMasanpham());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa CTHoaDon
	 */
	public boolean xoaCTHoaDon(String mahd, String masp){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from CTHoaDon where mahoadon = ? and masanpham = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, mahd);
			stmt.setString(1, masp);
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa CTHoaDon
	 */
	public boolean suaCTHoaDon(CTHoaDon p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update CTHoaDon set thanhtien = ? , soluongsanpham = ? where where mahoadon = ? and masanpham = ? ";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setDouble(1, p.getThanhtien());
			stmt.setInt(2, p.getSoluongsanpham());
			stmt.setString(3, p.getHd().getMahoadon());
			stmt.setString(4, p.getSp().getMasanpham());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các CTHoaDon
	 */
	public ArrayList<CTHoaDon> layDsCTHoaDon(){
		list = new ArrayList<CTHoaDon>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from CTHoaDon");
			while(rs.next()) {
				
				CTHoaDon kh = new CTHoaDon(rs.getInt(2), new HoaDon(rs.getString(3)), new SanPham(rs.getString(4)) );
				 
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
