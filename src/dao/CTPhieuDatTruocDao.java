package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.Database;
import entity.CTPhieuDatTruoc;
import entity.CTPhieuDatTruoc;
import entity.HoaDon;
import entity.PhieuDatTruoc;
import entity.SanPham;

public class CTPhieuDatTruocDao {

	private ArrayList<CTPhieuDatTruoc> list;


	/*
	 * thêm CTPhieuDatTruoc
	 */
	public boolean themCTPhieuDatTruoc(CTPhieuDatTruoc p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " insert into CTPhieuDatTruoc values(?,?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, p.getPdt().getMaphieudat());
			stmt.setDouble(2, p.getThanhtien());
			stmt.setString(3, p.getSp().getMasanpham());
			stmt.setInt(4, p.getSoluongsanpham());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * xóa CTPhieuDatTruoc
	 */
	public boolean xoaCTPhieuDatTruoc(String mahd, String masp){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " delete from CTPhieuDatTruoc where maphieudat = ? and masanpham = ?";
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
	 * sửa CTPhieuDatTruoc
	 */
	public boolean suaCTPhieuDatTruoc(CTPhieuDatTruoc p){
		Connection con = Database.getInstance().getConnection();
		int n = 0;
		try {
			String sql = " update CTPhieuDatTruoc set thanhtien = ? , soluongsanpham = ? where where maphieudat = ? and masanpham = ? ";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setDouble(1, p.getThanhtien());
			stmt.setInt(2, p.getSoluongsanpham());
			stmt.setString(3, p.getPdt().getMaphieudat());
			stmt.setString(4, p.getSp().getMasanpham());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	
	
	/*
	 * lấy danh sách tất cả các CTPhieuDatTruoc
	 */
	public ArrayList<CTPhieuDatTruoc> layDsCTPhieuDatTruoc(){
		list = new ArrayList<CTPhieuDatTruoc>();
		Connection con = Database.getInstance().getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from CTPhieuDatTruoc");
			while(rs.next()) {
				
				CTPhieuDatTruoc kh = new CTPhieuDatTruoc(rs.getInt(4),rs.getDouble(2),  new SanPham(rs.getString(3)), new PhieuDatTruoc(rs.getString(1)) );
				 
				list.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	
	
}
