package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.Box;

public class GUI_DSNhanVien extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GUI_DSNhanVien() {
		setSize(1399,700);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Danh Sách Nhân Viên");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 30));
		add(lblNewLabel_2, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		add(table, BorderLayout.SOUTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(37);
		add(horizontalStrut, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(37);
		add(horizontalStrut_1, BorderLayout.EAST);
	}
}
