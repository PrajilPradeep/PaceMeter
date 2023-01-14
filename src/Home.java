import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField_NoOfUsers;
	private JTextField textField_RT;
	private JTextField textField_NoIteration;
	private JTextField textField_TT;
	private JTextField textField_Result;
	int xx,xy;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(true);
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
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 346, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 xx = e.getX();
			     xy = e.getY();
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            Home.this.setLocation(x - xx, y - xy);  
			}
		});
		label.setBounds(-38, 0, 420, 275);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(Home.class.getResource("/images/bg2.jpg")));
		panel.add(label);

		//adding heading and description

		JLabel lblNewLabel_4 = new JLabel("PaceMeter DE");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(0, 292, 350, 27);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Gives you fixed pacing value");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(0, 330, 350, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("to design an accurate");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(0, 350, 350, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("workload model !");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(0, 370, 350, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblMadeWithLove = new JLabel("Made with ♥");
		lblMadeWithLove.setForeground(Color.WHITE);
		lblMadeWithLove.setBounds(136, 396, 98, 44);
		panel.add(lblMadeWithLove);
		
		JLabel lblPrajilPradeep = new JLabel("Prajil Pradeep");
		lblPrajilPradeep.setForeground(Color.GRAY);
		lblPrajilPradeep.setBounds(234, 425, 100, 15);
		panel.add(lblPrajilPradeep);
		
		Button button = new Button("Calculate Pacing");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 0, 51));
		button.setBounds(395, 350, 283, 36);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(383, 435, 296, 15);
		contentPane.add(label_1);
		
		
		
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
	                double numUsers = Double.parseDouble(textField_NoOfUsers.getText());
	                double e2eResponse = Double.parseDouble(textField_RT.getText());
	                double iterationPerHour = Double.parseDouble(textField_NoIteration.getText());
	                double thinkTime = Double.parseDouble(textField_TT.getText());
	                double pacing = (numUsers / (iterationPerHour/3600)) - (e2eResponse + thinkTime);
	                double roundedValue = Math.round(pacing * 100.0) / 100.0;
	                System.out.println(roundedValue);
	                textField_Result.setText(String.valueOf(roundedValue));
	                label_1.setText("");
            	}
            	catch (NumberFormatException er) {
	                System.out.println("The value is not a number.");
	                label_1.setText("Please enter valid values !");
	                textField_Result.setText("");
	                
            	}	
            }
        });
		
		textField_NoOfUsers = new JTextField();
		textField_NoOfUsers.setBounds(395, 83, 283, 36);
		contentPane.add(textField_NoOfUsers);
		textField_NoOfUsers.setColumns(10);
		
		JLabel noOfUsers = new JLabel("No. of Users (Threads)*:");
		noOfUsers.setBounds(395, 58, 206, 14);
		contentPane.add(noOfUsers);
		
		JLabel responseTime = new JLabel("End to End Response Time (seconds)*:"); 
		responseTime.setBounds(395, 132, 283, 14);
		contentPane.add(responseTime);
		
		textField_RT = new JTextField();
		textField_RT.setColumns(10);
		textField_RT.setBounds(395, 157, 283, 36);
		contentPane.add(textField_RT);
		
		JLabel iterationPerHour = new JLabel("Iterations per hour*:");
		iterationPerHour.setBounds(395, 204, 283, 14);
		contentPane.add(iterationPerHour);
		
		JLabel lblRepeatPassword = new JLabel("Total Think Time (seconds)*:");
		lblRepeatPassword.setBounds(395, 275, 283, 14);
		contentPane.add(lblRepeatPassword);
		
		textField_NoIteration = new JTextField();
		textField_NoIteration.setBounds(395, 229, 283, 36);
		contentPane.add(textField_NoIteration);
		
		textField_Result = new JTextField();
		textField_Result.setColumns(10);
		textField_Result.setBounds(469, 398, 70, 36);
		contentPane.add(textField_Result);
		
		textField_TT = new JTextField();
		textField_TT.setBounds(395, 293, 283, 36);
		contentPane.add(textField_TT);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
		
		JLabel lblPacing = new JLabel("Pacing:");
		lblPacing.setBounds(396, 408, 70, 15);
		contentPane.add(lblPacing);
		
		JLabel lblSeconds = new JLabel("seconds");
		lblSeconds.setBounds(542, 408, 70, 15);
		contentPane.add(lblSeconds);

	}
}
