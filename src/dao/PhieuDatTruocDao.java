package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.KhachHang;
import entity.NhanVien;
import entity.PhieuDatTruoc;

public class PhieuDatTruocDao {
private ArrayList<PhieuDatTruoc> list;
	
	
	/*
	 * thêm PhieuDatTruoc
	 */
	public boolean themPhieuDatTruoc(PhieuDatTruoc p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into PhieuDatTruoc values(?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getMaphieudat());
			stmt.setDate(2, p.getNgaylap());
			stmt.setDate(3, p.getNgaynhanhang());
			stmt.setDouble(4, p.getTongtienhoadon());
			stmt.setString(5, p.getNv().getManhanvien());
			stmt.setString(6, p.getKh().getMakh());
			stmt.setString(7, p.getTrangthai());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa PhieuDatTruoc
	 */
	public boolean xoaPhieuDatTruoc(String p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from PhieuDatTruoc where maphieudat = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p);
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	
	/*
	 * sửa PhieuDatTruoc
	 */
	public boolean suaPhieuDatTruoc(PhieuDatTruoc p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update PhieuDatTruoc set ngaylap = ?, ngaynhanhang = ? , tongtienphieudat = ? , manhanvien = ? , makhachhang = ? , trangthai = ?  where maphieudat = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(7, p.getMaphieudat());
			stmt.setDate(1, p.getNgaylap());
			stmt.setDate(2, p.getNgaynhanhang());
			stmt.setDouble(3, p.getTongtienhoadon());
			stmt.setString(4, p.getNv().getManhanvien());
			stmt.setString(5, p.getKh().getMakh());
			stmt.setString(6, p.getTrangthai());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các PhieuDatTruoc
	 */
	public ArrayList<PhieuDatTruoc> layDsPhieuDatTruoc(){
		list = new ArrayList<PhieuDatTruoc>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from PhieuDatTruoc");
			while(rs.next()) {
				
				PhieuDatTruoc kh = new PhieuDatTruoc(rs.getString(1),rs.getDate(2),rs.getDate(3),rs.getDouble(4),new NhanVien(rs.getString(5)),new KhachHang(rs.getString(6)),rs.getString(7));
				
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
