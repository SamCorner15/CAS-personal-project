import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.GridLayout;

public class SplashScreen extends JFrame {

	private JPanel contentPane;
	private JRadioButton historyOption_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen frame = new SplashScreen();
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
	public SplashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
				historyOption_1 = new JRadioButton("Easy History", true);
				historyDifficulty.add(historyOption_1);
				contentPane.add(historyOption_1);
				
				JLabel label = new JLabel("");
				contentPane.add(label);
				
				JLabel label_1 = new JLabel("");
				contentPane.add(label_1);
				historyOption = new JRadioButton("Medium History", false);
				historyDifficulty.add(historyOption);
				contentPane.add(historyOption);
		
				JRadioButton rdbtnHardMath = new JRadioButton("Hard Math");
				contentPane.add(rdbtnHardMath);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
				//contentPane.add(historyOption, BorderLayout.WEST);
				JRadioButton historyOption = new JRadioButton("Hard History", false);
				historyDifficulty.add(historyOption);
				contentPane.add(historyOption);
		
				JButton btnStart = new JButton("START");
				contentPane.add(btnStart);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		ButtonGroup historyDifficulty = new ButtonGroup();
	}
}
