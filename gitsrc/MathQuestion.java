import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;

public class MathQuestion extends JFrame {


	private JPanel contentPane;
	private JTextField txtEnterAnswerHere;
	private JTextField question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathQuestion frame = new MathQuestion();
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
	public MathQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		txtEnterAnswerHere = new JTextField();
		txtEnterAnswerHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAnswerHere.setText("Enter Answer Here");
		contentPane.add(txtEnterAnswerHere, BorderLayout.SOUTH);
		txtEnterAnswerHere.setColumns(10);
		
		question = new JTextField();
		question.setEditable(false);
		question.setText("Question text");
		contentPane.add(question, BorderLayout.NORTH);
		question.setColumns(10);
		
		MathPanel myMathPanel = new MathPanel(3);
		contentPane.add(myMathPanel, BorderLayout.CENTER);
	}

	

	
}
