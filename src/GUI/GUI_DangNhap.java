package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Others.MyButton;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.Cursor;
import java.awt.ComponentOrientation;

public class GUI_DangNhap {
	private JFrame frmPhnMmQun;
	private JFrame frmngNhp;
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_DangNhap window = new GUI_DangNhap();
					window.frmngNhp.setVisible(true);
					window.frmngNhp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					window.frmngNhp.setLocationRelativeTo(null);
					window.frmngNhp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_DangNhap() {
		initialize();
		txtTaiKhoan.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtTaiKhoan.getText().equals("Nhập tài khoản")) {
					txtTaiKhoan.setText("");
					txtTaiKhoan.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtTaiKhoan.getText().isEmpty()) {
					txtTaiKhoan.setForeground(Color.GRAY);
					txtTaiKhoan.setText("Nhập tài khoản");
				}
			}
		});
		txtMatKhau.addFocusListener(new FocusListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				if (txtMatKhau.getText().equals("Nhập mã quản lý")) {
					txtMatKhau.setText("");
					txtMatKhau.setForeground(Color.BLACK);
				}
			}

			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (txtMatKhau.getText().isEmpty()) {
					txtMatKhau.setForeground(Color.GRAY);
					txtMatKhau.setText("Nhập mã quản lý");
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmngNhp = new JFrame();
		frmngNhp.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI_DangNhap.class.getResource("/images/icon.png")));
		frmngNhp.setTitle("\u0110\u0103ng Nh\u1EADp");
		frmngNhp.getContentPane().setBackground(new Color(0, 0, 128));
		frmngNhp.setBounds(100, 100, 1000, 503);
		frmngNhp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmngNhp.getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PhatTrienUngDung\\pictures\\login.jpg"));
		lblNewLabel_2.setBounds(0, 0, 616, 466);
		frmngNhp.getContentPane().add(lblNewLabel_2);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(0, 0, 128));
		tabbedPane.setBounds(616, 0, 370, 466);
		frmngNhp.getContentPane().add(tabbedPane);

		JPanel pnlDangNhap = new JPanel();
		pnlDangNhap.setForeground(new Color(255, 215, 0));
		pnlDangNhap.setBorder(null);
		tabbedPane.addTab("\u0110\u0103ng Nh\u1EADp", null, pnlDangNhap, null);
		pnlDangNhap.setLayout(null);
		pnlDangNhap.setBackground(new Color(230, 230, 250));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(39, 107, 290, 177);
		pnlDangNhap.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("T\u00E0i kho\u1EA3n");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(25, 25, 112));
				lblNewLabel.setLabelFor(txtTaiKhoan);
				
						txtTaiKhoan = new JTextField();
						panel.add(txtTaiKhoan);
						txtTaiKhoan.setFont(new Font("Dialog", Font.PLAIN, 16));
						txtTaiKhoan.setText("NV001");
						txtTaiKhoan.setForeground(Color.BLACK);
						txtTaiKhoan.setToolTipText("Nhập tài khoản");
						txtTaiKhoan.setColumns(10);
		
				JLabel lblNewLabel_1 = new JLabel("M\u1EADt kh\u1EA9u");
				panel.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 18));
				lblNewLabel_1.setForeground(new Color(25, 25, 112));
				lblNewLabel_1.setLabelFor(txtMatKhau);
				
						txtMatKhau = new JPasswordField();
						panel.add(txtMatKhau);
						txtMatKhau.setForeground(new Color(0, 0, 128));
						txtMatKhau.setToolTipText("Nhập mật khẩu");

		JButton btnDangNhap = new MyButton("\u0110\u0103ng Nh\u1EADp");
		btnDangNhap.setBorder(null);
		btnDangNhap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIChinh_NhanVien windowNV = new GUIChinh_NhanVien("NV001");
				windowNV.frmPhnMmQun.setVisible(true);
				windowNV.frmPhnMmQun.setLocationRelativeTo(null);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDangNhap.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDangNhap.setForeground(Color.black);
			}
		});
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtTaiKhoan.getText().equals("NV001") && txtMatKhau.equals("1234"))
					new GUIChinh_NhanVien("NV002").setVisible(true);
				else
					try {
						new GUIChinh_QuanLy().setVisible(true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnDangNhap.setBounds(39, 332, 140, 50);
		btnDangNhap.setFont(new Font("Cambria Math", Font.BOLD, 15));
		pnlDangNhap.add(btnDangNhap);

		JLabel lblngNhp = new JLabel("Đăng Nhập");
		lblngNhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblngNhp.setForeground(new Color(0, 0, 128));
		lblngNhp.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblngNhp.setBounds(0, 0, 365, 95);
		pnlDangNhap.add(lblngNhp);

		MyButton btnThoat = new MyButton("Thoát");
		btnThoat.setBorder(null);
		btnThoat.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnThoat.setBounds(188, 332, 140, 50);
		pnlDangNhap.add(btnThoat);

		JPanel pnlDoiMK = new JPanel();
		tabbedPane.addTab("\u0110\u1ED5i m\u1EADt kh\u1EA9u", null, pnlDoiMK,
				"D\u00E0nh cho nh\u00E2n vi\u00EAn \u0111\u0103ng nh\u1EADp l\u1EA7n \u0111\u1EA7u");
		pnlDoiMK.setLayout(null);
		pnlDoiMK.setBackground(new Color(230, 230, 250));
		
		JPanel pnlDoiMatKhau = new JPanel();
		pnlDoiMatKhau.setBackground(new Color(230, 230, 250));
		pnlDoiMatKhau.setBounds(44, 100, 283, 215);
		pnlDoiMK.add(pnlDoiMatKhau);
		pnlDoiMatKhau.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Tài Khoản:");
		lblNewLabel_4.setBackground(new Color(230, 230, 250));
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.BOLD, 16));
		pnlDoiMatKhau.add(lblNewLabel_4);
		
		textField = new JTextField();
		pnlDoiMatKhau.add(textField);
		textField.setColumns(10);
		
		JLabel lblMKCu = new JLabel("Mật khẩu cũ:");
		lblMKCu.setBackground(new Color(230, 230, 250));
		lblMKCu.setFont(new Font("Cambria Math", Font.BOLD, 16));
		pnlDoiMatKhau.add(lblMKCu);
		
		textField_1 = new JTextField();
		pnlDoiMatKhau.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mật khẩu mới:");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 16));
		pnlDoiMatKhau.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		pnlDoiMatKhau.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Đổi Mật Khẩu");
		lblNewLabel_5.setBounds(0, 0, 365, 88);
		pnlDoiMK.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Cambria Math", Font.BOLD, 25));
		
		MyButton btnDoiMatKhau = new MyButton("Đăng Nhập");
		btnDoiMatKhau.setText("Lưu");
		btnDoiMatKhau.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnDoiMatKhau.setBounds(188, 332, 140, 50);
		pnlDoiMK.add(btnDoiMatKhau);
	}
}
