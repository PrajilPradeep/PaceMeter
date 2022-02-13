import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PaceMeter extends JFrame {

	private JPanel contentPane;
	private JTextField tF_NoUsers;
	private JTextField tF_E2ERT;
	private JTextField tF_IterationPerH;
	private JTextField tF_TotalTT;
	private JTextField tF_PacingVal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaceMeter frame = new PaceMeter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaceMeter() {
		
		//Logic goes here
		


		//JFormattedTextField field = new JFormattedTextField(numberFormatter);
		
		
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 452);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 239, 413);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("PaceMeter");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(0, 292, 238, 27);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Gives you fixed pacing value");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(0, 330, 238, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("to design an accurate");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(0, 350, 238, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("workload model !");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(0, 370, 238, 14);
		panel.add(lblNewLabel_3_1_1);
		
		Button buttonCalcPacing = new Button("Calculate Pacing");
		buttonCalcPacing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=buttonCalcPacing.getLabel();
				tF_PacingVal.setText(text);
			}
		});
		buttonCalcPacing.setBackground(new Color(241, 57, 83));
		buttonCalcPacing.setBounds(271, 306, 202, 35);
		contentPane.add(buttonCalcPacing);
		
		tF_NoUsers = new JTextField();
		tF_NoUsers.setBounds(271, 64, 202, 27);
		contentPane.add(tF_NoUsers);
		tF_NoUsers.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("No. of Users (Threads)*");
		lblNewLabel.setBounds(271, 49, 202, 14);
		contentPane.add(lblNewLabel);
		
		tF_E2ERT = new JTextField();
		tF_E2ERT.setColumns(10);
		tF_E2ERT.setBounds(271, 129, 202, 27);
		contentPane.add(tF_E2ERT);
		
		JLabel lblNewLabel_1 = new JLabel("End to End Response Time (in seconds)*");
		lblNewLabel_1.setBounds(271, 114, 245, 14);
		contentPane.add(lblNewLabel_1);
		
		tF_IterationPerH = new JTextField();
		tF_IterationPerH.setColumns(10);
		tF_IterationPerH.setBounds(271, 194, 202, 27);
		contentPane.add(tF_IterationPerH);
		
		JLabel lblNewLabel_2 = new JLabel("Iterations per hour*");
		lblNewLabel_2.setBounds(271, 179, 202, 14);
		contentPane.add(lblNewLabel_2);
		
		tF_TotalTT = new JTextField();
		tF_TotalTT.setColumns(10);
		tF_TotalTT.setBounds(271, 259, 202, 27);
		contentPane.add(tF_TotalTT);
		
		JLabel lblTotalThinkTime = new JLabel("Total Think Time (in seconds)*");
		lblTotalThinkTime.setBounds(271, 244, 202, 14);
		contentPane.add(lblTotalThinkTime);
		
		JLabel lblCalculatedPacingin = new JLabel("Calculated Pacing (in seconds)");
		lblCalculatedPacingin.setBounds(271, 365, 183, 14);
		contentPane.add(lblCalculatedPacingin);
		
		tF_PacingVal = new JTextField();
		tF_PacingVal.setBounds(464, 359, 96, 27);
		contentPane.add(tF_PacingVal);
		tF_PacingVal.setColumns(10);
	}
}
