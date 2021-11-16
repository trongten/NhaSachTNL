package entity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PhieuDatTruoc {


	private String maphieudat;
	private Date ngaylap;
	private Date ngaynhanhang;
	private double tongtienhoadon;
	private NhanVien nv;
	private KhachHang kh;
	private String trangthai;
	
	
	

	@Override
	public String toString() {
		return "PhieuDatTruoc [maphieudat=" + maphieudat + ", ngaylap=" + ngaylap + ", ngaynhanhang=" + ngaynhanhang
				+ ", tongtienhoadon=" + tongtienhoadon + ", nv=" + nv + ", kh=" + kh + ", trangthai=" + trangthai + "]";
	}

	public String getMaphieudat() {
		return maphieudat;
	}

	public void setMaphieudat(String maphieudat) {
		this.maphieudat = maphieudat;
	}

	public Date getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	public Date getNgaynhanhang() {
		return ngaynhanhang;
	}

	public void setNgaynhanhang(Date ngaynhanhang) {
		this.ngaynhanhang = ngaynhanhang;
	}

	public double getTongtienhoadon() {
		return tongtienhoadon;
	}

	public void setTongtienhoadon(double tongtienhoadon) {
		this.tongtienhoadon = tongtienhoadon;
	}

	public NhanVien getNv() {
		return nv;
	}

	public void setNv(NhanVien nv) {
		this.nv = nv;
	}

	public KhachHang getKh() {
		return kh;
	}

	public void setKh(KhachHang kh) {
		this.kh = kh;
	}

	public PhieuDatTruoc(String maphieudat, Date ngaylap, Date ngaynhanhang, double tongtienhoadon) {
		super();
		this.maphieudat = maphieudat;
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
		this.tongtienhoadon = tongtienhoadon;
	}

	
	
	public PhieuDatTruoc() {
		
	}

	public PhieuDatTruoc(String maphieudat, Date ngaylap, Date ngaynhanhang, double tongtienhoadon, NhanVien nv,
			KhachHang kh) {
		super();
		this.maphieudat = maphieudat;
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
		this.tongtienhoadon = tongtienhoadon;
		this.nv = nv;
		this.kh = kh;
		this.trangthai = "Chưa nhận hàng";
	}
	
	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public PhieuDatTruoc(String maphieudat, Date ngaylap, Date ngaynhanhang, double tongtienhoadon, NhanVien nv,
			KhachHang kh,String trangthai) {
		super();
		this.maphieudat = maphieudat;
		this.ngaylap = ngaylap;
		this.ngaynhanhang = ngaynhanhang;
		this.tongtienhoadon = tongtienhoadon;
		this.nv = nv;
		this.kh = kh;
		this.trangthai = trangthai;
	}
	
	public PhieuDatTruoc(String maphieudat) {
		super();
		this.maphieudat = maphieudat;
		
	}
	
	
	
}
