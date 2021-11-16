package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

public class HoaDonDao {
private ArrayList<HoaDon> list;
	
	
	/*
	 * thêm HoaDon
	 */
	public boolean themHoaDon(HoaDon p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into HoaDon values(?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getMahoadon());
			stmt.setDate(3, p.getNgaylaphoadon());
			stmt.setDouble(2, p.getTongtienhoadon());
			stmt.setString(4, p.getNhanvien().getManhanvien());
			stmt.setString(5, p.getKhachhang().getMakh());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa HoaDon
	 */
	public boolean xoaHoaDon(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from HoaDon where mahoadon = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa HoaDon
	 */
	public boolean suaHoaDon(HoaDon p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update HoaDon set  tongtienhoadon = ? , ngaylaphoadon = ?, manhanvien= ? , makhachhang = ? where mahoadon = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(5, p.getMahoadon());
			stmt.setDate(2, p.getNgaylaphoadon());
			stmt.setDouble(1, p.getTongtienhoadon());
			stmt.setString(3, p.getNhanvien().getManhanvien());
			stmt.setString(4, p.getKhachhang().getMakh());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các HoaDon
	 */
	public ArrayList<HoaDon> layDsHoaDon(){
		list = new ArrayList<HoaDon>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from HoaDon");
			while(rs.next()) {
				
				HoaDon kh = new HoaDon(rs.getString(1),rs.getDate(2),rs.getDouble(3),new NhanVien(rs.getString(4)),new KhachHang(rs.getString(5)));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
