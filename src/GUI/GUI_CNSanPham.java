package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Others.MyButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.Box;

public class GUI_CNSanPham extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tblVPP;
	private JTable tblSach;

	/**
	 * Create the panel.
	 */
	public GUI_CNSanPham() {
		
		setLayout(new BorderLayout(0, 0));
		setSize(1399,700);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel.setOpaque(false);
		add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(7, 1, 30, 20));
		
		MyButton btnThemSanPham = new MyButton("Thêm Sản Phẩm");
		btnThemSanPham.setBorder(null);
		btnThemSanPham.setIcon(new ImageIcon(GUI_CNSanPham.class.getResource("/images/themsp.png")));
		btnThemSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_ThemSP().setVisible(true);
			}
		});
		btnThemSanPham.setColorOver(new Color(60, 179, 113));
		btnThemSanPham.setColorClick(new Color(0, 100, 0));
		btnThemSanPham.setFont(new Font("Cambria Math", Font.BOLD, 20));
		btnThemSanPham.setBorderColor(new Color(0, 100, 0));
		panel.add(btnThemSanPham);
		
		MyButton btnXoaSanPham = new MyButton("Xóa Sản Phẩm");
		btnXoaSanPham.setBorder(null);
		btnXoaSanPham.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel.add(btnXoaSanPham);
		
		MyButton btnSuaTTSanPham = new MyButton("Cập nhật thông tin sản phẩm");
		btnSuaTTSanPham.setBorder(null);
		btnSuaTTSanPham.setIcon(new ImageIcon(GUI_CNSanPham.class.getResource("/images/suathongtin.png")));
		btnSuaTTSanPham.setText("Sửa thông tin SP");
		btnSuaTTSanPham.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel.add(btnSuaTTSanPham);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		
		JPanel pnlVPP = new JPanel();
		tabbedPane.addTab("Văn Phòng Phẩm", null, pnlVPP, null);
		pnlVPP.setLayout(new BorderLayout(0, 0));
		
		JSplitPane spltVPP = new JSplitPane();
		spltVPP.setOrientation(JSplitPane.VERTICAL_SPLIT);
		pnlVPP.add(spltVPP);
		
		JLabel lblVPP = new JLabel("Danh Sách Văn Phòng Phẩm");
		lblVPP.setHorizontalAlignment(SwingConstants.CENTER);
		lblVPP.setFont(new Font("Cambria Math", Font.BOLD, 30));
		spltVPP.setLeftComponent(lblVPP);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		spltVPP.setRightComponent(scrollPane_1);
		
		tblVPP = new JTable();
		scrollPane_1.setViewportView(tblVPP);
		
		JPanel pnlSach = new JPanel();
		tabbedPane.addTab("Sách", null, pnlSach, null);
		pnlSach.setLayout(new BorderLayout(0, 0));
		
		JSplitPane spltSach = new JSplitPane();
		spltSach.setOrientation(JSplitPane.VERTICAL_SPLIT);
		pnlSach.add(spltSach);
		
		JLabel lblSach = new JLabel("Danh Sách Sách");
		lblSach.setHorizontalAlignment(SwingConstants.CENTER);
		lblSach.setFont(new Font("Cambria Math", Font.BOLD, 30));
		spltSach.setLeftComponent(lblSach);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		spltSach.setRightComponent(scrollPane_2);
		
		tblSach = new JTable();
		scrollPane_2.setViewportView(tblSach);
		
		String[] title = {"Mã sản phẩm","Tên sản phẩm","Chất "};
		
		JLabel lblNewLabel_2 = new JLabel("Cập nhật thông tin Sản Phẩm");
		splitPane.setLeftComponent(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 30));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		add(verticalStrut, BorderLayout.SOUTH);
	}
}
