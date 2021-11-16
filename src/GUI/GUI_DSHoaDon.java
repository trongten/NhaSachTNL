package GUI;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;
import java.awt.ComponentOrientation;

public class GUI_DSHoaDon extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel model;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GUI_DSHoaDon() {
		setSize(1399,700);
		setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		splitPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Danh Sách Hóa Đơn");
		lblNewLabel_2.setMaximumSize(new Dimension(100, 13));
		splitPane.setLeftComponent(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 30));
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
	
		
		String[] tieude = {"Mã hóa đơn","Tên sản phẩm","Thành tiền"};
		model=new DefaultTableModel(tieude,0);
	}
}
