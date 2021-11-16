package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import connectDB.Database;
import entity.*;


public class KhachHangDao {

	private ArrayList<KhachHang> list;
	
	
		/*
		 * thêm chi tiết hóa đơn
		 */
		public boolean themKH(KhachHang p){
			Connection con = Database.getInstance().getConnection();
			int n = 0;
			try {
				String sql = " insert into KhachHang values(?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, p.getMakh());
				stmt.setString(2, p.getTenkhachhang());
				stmt.setString(3, p.getSodienthoai());
				n = stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n > 0;
		}
		
		public boolean xoaKH(String p){
			Connection con = Database.getInstance().getConnection();
			int n = 0;
			try {
				String sql = " delete from KhachHang where makhachhang = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, p);
				
				n = stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n > 0;
		}
		
		
		public boolean suaKH(KhachHang p){
			Connection con = Database.getInstance().getConnection();
			int n = 0;
			try {
				String sql = " update KhachHang set tenkhachhang = ?, sodienthoai = ? where makhachhang = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(3, p.getMakh());
				stmt.setString(1, p.getTenkhachhang());
				stmt.setString(2, p.getSodienthoai());
				n = stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return n > 0;
		}
		
		
		
		public ArrayList<KhachHang> layDsKhachHang(){
			list = new ArrayList<KhachHang>();
			Connection con = Database.getInstance().getConnection();
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from KhachHang");
				while(rs.next()) {
					
					KhachHang kh = new  KhachHang(rs.getString(1),rs.getString(2),rs.getString(3));
					
					list.add(kh);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return list;
		}
		
		

	
	
}
