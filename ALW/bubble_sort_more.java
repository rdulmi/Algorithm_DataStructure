package ALW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JFormattedTextField;

public class bubble_sort_more extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bubble_sort_more frame = new bubble_sort_more();
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
	public bubble_sort_more() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(bubble_sort_more.class.getResource("/image/logo.jpg")));
		setTitle("Bubble sort");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUBBLE SORT");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(325, 11, 168, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EX  :");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(10, 112, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Bubble sort is a sorting algorithm that works by repeatedly stepping through liststhat need to be sorted, comparing each pair of adjacent ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 42, 819, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("items and swapping and swapping them if they are in the wrong order. ");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setBounds(10, 60, 819, 21);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("This passing procedure is repeated until no swaps are required, indicating that the list is sorted.");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setBounds(10, 78, 819, 21);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setToolTipText("");
		lblNewLabel_4.setIcon(new ImageIcon(bubble_sort_more.class.getResource("/image/bubble_sort-min.gif")));
		lblNewLabel_4.setBounds(48, 112, 576, 170);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Algo_groupWork ob =new Algo_groupWork();
				ob.setVisible(true);
			}
		});
		btnNewButton.setBounds(753, 503, 76, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Bubble Sort Time Complexity");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 306, 249, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(bubble_sort_more.class.getResource("/image/Screenshot 2022-03-07 092006.png")));
		lblNewLabel_5.setBounds(10, 340, 609, 175);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("More details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri = new URI("https://www.javatpoint.com/bubble-sort");
					java.awt.Desktop.getDesktop().browse(uri);
				}
				catch (Exception ex) {
					
				}
			}
		});
		btnNewButton_1.setBounds(629, 503, 111, 23);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnAdvantagesOfBubble = new JTextPane();
		txtpnAdvantagesOfBubble.setText("Advantages of Bubble Sort Algorithm\r\n\r\n1. Besides the memory that the array or list occupies, the bubble sort requires very little memory.\r\n2.The bubble sort is made up of only a few lines of code. \r\n3. The same is true for data sets with only a few items that must be swapped a few times.");
		txtpnAdvantagesOfBubble.setBounds(643, 92, 186, 211);
		contentPane.add(txtpnAdvantagesOfBubble);
		
		JTextPane txtpnDisadvantagesOfBubble = new JTextPane();
		txtpnDisadvantagesOfBubble.setText("Disadvantages of Bubble Sort Algorithm\r\n\r\n1. The main disadvantage is the amount of time it takes. It is highly inefficient for large data sets, with a running time of O(n2).\r\n2. Furthermore, the presence of turtles can significantly slow the sort.\r\n");
		txtpnDisadvantagesOfBubble.setBounds(643, 306, 186, 186);
		contentPane.add(txtpnDisadvantagesOfBubble);
	}
}

