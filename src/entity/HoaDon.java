package entity;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HoaDon {
	private String mahoadon;
	private Date ngaylaphoadon;
	private double tongtienhoadon;
	private NhanVien nhanvien;
	private KhachHang khachhang;


	public HoaDon() {
		// TODO Auto-generated constructor stub
	}


	public HoaDon(String mahoadon, Date ngaylaphoadon, double tongtienhoadon, NhanVien nhanvien,KhachHang khachhang) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.tongtienhoadon = tongtienhoadon;
		this.nhanvien = nhanvien;
		this.khachhang=khachhang;
	}


	public HoaDon(String mahoadon, Date ngaylaphoadon, double tongtienhoadon) {
		super();
		this.mahoadon = mahoadon;
		this.ngaylaphoadon = ngaylaphoadon;
		this.tongtienhoadon = tongtienhoadon;
		
	}
	

	public KhachHang getKhachhang() {
		return khachhang;
	}


	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}


	public HoaDon(String mahoadon) {
		super();
		this.mahoadon = mahoadon;
	}


	public String getMahoadon() {
		return mahoadon;
	}


	public void setMahoadon(String mahoadon) {
		this.mahoadon = mahoadon;
	}


	public Date getNgaylaphoadon() {
		return ngaylaphoadon;
	}


	public void setNgaylaphoadon(Date ngaylaphoadon) {
		this.ngaylaphoadon = ngaylaphoadon;
	}


	public double getTongtienhoadon() {
		return tongtienhoadon;
	}


	public void setTongtienhoadon(double tongtienhoadon) {
		this.tongtienhoadon = tongtienhoadon;
	}


	public NhanVien getNhanvien() {
		return nhanvien;
	}


	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}


	@Override
	public String toString() {
		return "HoaDon [mahoadon=" + mahoadon + ", ngaylaphoadon=" + ngaylaphoadon + ", tongtienhoadon="
				+ tongtienhoadon + ", nhanvien=" + nhanvien + "]";
	}
	
	
	
}
