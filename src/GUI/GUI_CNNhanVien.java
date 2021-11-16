package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import Others.MyButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI_CNNhanVien extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tblDSNhanVien;

	/**
	 * Create the panel.
	 */
	public GUI_CNNhanVien() {
		setSize(1517, 700);
		
		setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("Cập nhật Nhân Viên");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 30));
		add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.WEST);
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Chức Năng", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel.setLayout(new GridLayout(7, 1, 30, 20));

		MyButton btnThemNhanVien = new MyButton("Thêm Nhân viên");
		btnThemNhanVien.setBorder(new CompoundBorder(null, new CompoundBorder()));
		btnThemNhanVien.setColorClick(new Color(60, 179, 113));
		btnThemNhanVien.setColorOver(new Color(154, 205, 50));
		btnThemNhanVien.setBorderColor(new Color(154, 205, 50));
		btnThemNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnThemNhanVien.setIcon(new ImageIcon(GUI_CNNhanVien.class.getResource("/images/themnhanvien.png")));
		btnThemNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_ThemNV().setVisible(true);
			}
		});
		btnThemNhanVien.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel.add(btnThemNhanVien);

		MyButton btnXoaNhanVien = new MyButton("Xa thải Nhân viên");
		btnXoaNhanVien.setBorder(new CompoundBorder(null, new CompoundBorder()));
		btnXoaNhanVien.setBorderColor(new Color(255, 0, 0));
		btnXoaNhanVien.setColorOver(new Color(255, 0, 0));
		btnXoaNhanVien.setColorClick(new Color(160, 82, 45));
		btnXoaNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnXoaNhanVien.setIcon(new ImageIcon(GUI_CNNhanVien.class.getResource("/images/xoanhanvien.png")));
		btnXoaNhanVien.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel.add(btnXoaNhanVien);

		MyButton btnSuaTTNhanVien = new MyButton("Sửa Nhân viên");
		btnSuaTTNhanVien.setBorder(new CompoundBorder(null, new CompoundBorder()));
		btnSuaTTNhanVien.setColorClick(new Color(255, 204, 0));
		btnSuaTTNhanVien.setColorOver(new Color(255, 255, 102));
		btnSuaTTNhanVien.setBorderColor(new Color(255, 215, 0));
		btnSuaTTNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnSuaTTNhanVien.setIcon(new ImageIcon(GUI_CNNhanVien.class.getResource("/images/suathongtin.png")));
		btnSuaTTNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI_SuaNV().setVisible(true);
			}
		});
		btnSuaTTNhanVien.setFont(new Font("Cambria Math", Font.BOLD, 20));
		panel.add(btnSuaTTNhanVien);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel_1.add(splitPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2_1 = new JLabel("Danh Sách Nhân Viên");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Cambria Math", Font.BOLD, 30));
		splitPane.setLeftComponent(lblNewLabel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		tblDSNhanVien = new JTable();
		scrollPane.setViewportView(tblDSNhanVien);
	}
}
