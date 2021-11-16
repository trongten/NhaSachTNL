package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Others.DateLabelFormatter;
import Others.MyButton;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class GUI_ThemNV extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTennhanvien;
	private JTextField txtCmnd;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtDiachi;
	private JTextField txtSdt;
	private UtilDateModel dateModel;
	private Properties dateProperties;
	private JDatePanelImpl datePanel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUI_ThemNV().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_ThemNV() {
		setResizable(false);
		setMaximumSize(new Dimension(550, 600));
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI_ThemNV.class.getResource("/images/themnhanvien.png")));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Th\u00EAm nh\u00E2n vi\u00EAn");
		setSize(513, 580);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton btnThemNV = new MyButton("L\u01B0u");
		getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_5 = new JLabel("Th\u00EAm Nh\u00E2n Vi\u00EAn");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Cambria Math", Font.BOLD, 28));
		getContentPane().add(lblNewLabel_5, BorderLayout.NORTH);
		// thanh ngày giờ
		dateModel = new UtilDateModel();
		dateProperties = new Properties();
		dateProperties.put("text.today", "Today");
		dateProperties.put("text.month", "Month");
		dateProperties.put("text.year", "Year");
		datePanel = new JDatePanelImpl(dateModel, dateProperties);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(7, 2, 15, 30));

		JLabel lblNewLabel = new JLabel("T\u00EAn nh\u00E2n vi\u00EAn:");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		txtTennhanvien = new JTextField();
		txtTennhanvien.setText("Trần Công Nguyên");
		panel.add(txtTennhanvien);
		txtTennhanvien.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtTennhanvien.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 CMND:");
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		txtCmnd = new JTextField();
		txtCmnd.setText("07546548721");
		panel.add(txtCmnd);
		txtCmnd.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtCmnd.setColumns(10);

		lblNewLabel_3 = new JLabel("Ng\u00E0y sinh:");
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		JDatePickerImpl dateNgaySinh = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		panel.add(dateNgaySinh);

		dateNgaySinh.getJFormattedTextField().setEditable(true);
		dateNgaySinh.getJFormattedTextField().setBackground(SystemColor.textHighlightText);

		JLabel lblNewLabel_3_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		txtSdt = new JTextField();
		txtSdt.setText("0345789654");
		panel.add(txtSdt);
		txtSdt.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtSdt.setColumns(10);

		lblNewLabel_2 = new JLabel("\u0110\u1ECBa ch\u1EC9:");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		txtDiachi = new JTextField();
		txtDiachi.setText("Long An");
		panel.add(txtDiachi);
		txtDiachi.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		txtDiachi.setColumns(10);

		lblNewLabel_4 = new JLabel("Gi\u1EDBi t\u00EDnh:");
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel.add(panel_1);

		JRadioButton radNam = new JRadioButton("Nam");
		radNam.setOpaque(false);
		panel_1.add(radNam);
		radNam.setBackground(new Color(230, 230, 250));
		buttonGroup.add(radNam);
		radNam.setSelected(true);
		radNam.setHorizontalAlignment(SwingConstants.CENTER);

		radNam.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		JRadioButton radNu = new JRadioButton("N\u1EEF");
		radNu.setOpaque(false);
		panel_1.add(radNu);
		radNu.setBackground(new Color(230, 230, 250));
		buttonGroup.add(radNu);
		radNu.setHorizontalAlignment(SwingConstants.CENTER);
		radNu.setFont(new Font("Cambria Math", Font.PLAIN, 20));

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 5, 0));
		MyButton btnLuu = new MyButton("L\u01B0u");
		panel_3.add(btnLuu);
		btnLuu.setText(" Lưu ");
		btnLuu.setForeground(new Color(255, 255, 255));
		btnLuu.setBorder(null);
		btnLuu.setColor(new Color(60, 179, 113));
		btnLuu.setBackground(new Color(60, 179, 113));
		btnLuu.setBorderColor(new Color(0, 100, 0));
		btnLuu.setColorOver(new Color(0, 100, 0));
		btnLuu.setColorClick(new Color(67, 102, 62));
		btnThemNV = btnLuu;
		btnThemNV.setFont(new Font("Dialog", Font.BOLD, 20));
				
				MyButton btnNewButton = new MyButton("Xóa rỗng");
				btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
				panel_3.add(btnNewButton);
		
				MyButton btnThoat = new MyButton("Thoát");
				panel_3.add(btnThoat);
				btnThoat.setText(" Thoát ");
				btnThoat.setBorderColor(new Color(139, 0, 0));
				btnThoat.setColorOver(new Color(178, 34, 34));
				btnThoat.setColor(new Color(255, 69, 0));
				btnThoat.setForeground(Color.WHITE);
				btnThoat.setBorder(null);
				btnThoat.setFont(new Font("Dialog", Font.BOLD, 20));
				
				Component horizontalStrut = Box.createHorizontalStrut(20);
				panel_2.add(horizontalStrut);
				
				Component horizontalStrut_1 = Box.createHorizontalStrut(20);
				getContentPane().add(horizontalStrut_1, BorderLayout.EAST);

	}
}
