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
import javax.swing.JTextField;

public class SplashScreen extends JFrame {

	private JPanel contentPane;
	private JRadioButton historyOption_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField textField;

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

	public SplashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		historyOption_1 = new JRadioButton("Easy History", true);
		buttonGroup.add(historyOption_1);

		contentPane.add(historyOption_1);

		JRadioButton rdbtnEasyGrammer = new JRadioButton("Easy Math");
		rdbtnEasyGrammer.setSelected(true);
		buttonGroup_2.add(rdbtnEasyGrammer);
		contentPane.add(rdbtnEasyGrammer);

		JRadioButton rdbtnEasyGrammer_1 = new JRadioButton("Easy Grammer");
		rdbtnEasyGrammer_1.setSelected(true);
		buttonGroup_1.add(rdbtnEasyGrammer_1);
		contentPane.add(rdbtnEasyGrammer_1);

		JRadioButton rdbtnMediumHistory = new JRadioButton("Medium History");
		buttonGroup.add(rdbtnMediumHistory);
		contentPane.add(rdbtnMediumHistory);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Medium Math");
		buttonGroup_2.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnMediumGrammer = new JRadioButton("Medium Grammer");
		buttonGroup_1.add(rdbtnMediumGrammer);
		contentPane.add(rdbtnMediumGrammer);
		// contentPane.add(historyOption, BorderLayout.WEST);
		JRadioButton historyOption = new JRadioButton("Hard History", false);
		buttonGroup.add(historyOption);
		contentPane.add(historyOption);

		JRadioButton rdbtnHardMath = new JRadioButton("Hard Math");
		buttonGroup_2.add(rdbtnHardMath);
		contentPane.add(rdbtnHardMath);

		JRadioButton rdbtnHardGrammer = new JRadioButton("Hard Grammer");
		buttonGroup_1.add(rdbtnHardGrammer);
		contentPane.add(rdbtnHardGrammer);

		JLabel label = new JLabel("");
		contentPane.add(label);

		JLabel lblHighScore = new JLabel("High Score");
		lblHighScore.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHighScore);

		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);

		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);

		JButton btnStart = new JButton("START");
		contentPane.add(btnStart);
	}
}
