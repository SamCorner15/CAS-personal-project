import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class HistoryQuestion extends JFrame {
	private JPanel contentPane;
	private JButton btnSubmit;
	private JTextField txtQuestion;
	private JTextField txtEnterAnswerHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoryQuestion frame = new HistoryQuestion();
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
	public HistoryQuestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnSubmit = new JButton("Submit");
		contentPane.add(btnSubmit, BorderLayout.SOUTH);
		
		txtQuestion = new JTextField();
		txtQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuestion.setText("Question");
		contentPane.add(txtQuestion, BorderLayout.NORTH);
		txtQuestion.setColumns(10);
		
		txtEnterAnswerHere = new JTextField();
		txtEnterAnswerHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAnswerHere.setText("Enter Answer Here");
		contentPane.add(txtEnterAnswerHere, BorderLayout.CENTER);
		txtEnterAnswerHere.setColumns(10);
	}
	private class SearchButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			System.out.println(b.getActionCommand());

		}
	}

}


}