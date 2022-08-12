package ALW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import java.awt.Point;
import java.awt.Component;


public class Algo_groupWork {

	private JFrame frmAlgos;

	private JTextField txtEnterSixNumbers;
	private JTextField textField;
	private int[] Number;
	String answerLabel="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algo_groupWork window = new Algo_groupWork();
					window.frmAlgos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Algo_groupWork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmAlgos = new JFrame();
		frmAlgos.setIconImage(Toolkit.getDefaultToolkit().getImage(Algo_groupWork.class.getResource("/image/logo.jpg")));
		frmAlgos.setTitle("Algo7s\r\n");
		frmAlgos.getContentPane().setBackground(new Color(169, 169, 169));
		frmAlgos.getContentPane().setForeground(SystemColor.infoText);
		frmAlgos.setBounds(100, 100, 855, 577);
		frmAlgos.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmAlgos.setResizable(false);
		frmAlgos.setLocationRelativeTo(null);
		frmAlgos.getContentPane().setLayout(null);

		
		JButton btnNewButton_1 = new JButton("Data Structures");
		btnNewButton_1.setForeground(new Color(0, 51, 0));
		btnNewButton_1.setBackground(new Color(102, 153, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					URI uri = new URI("https://www.geeksforgeeks.org/data-structures/");
					java.awt.Desktop.getDesktop().browse(uri);
				}
				catch (Exception ex) {
					
				}
			}
		});
		
		JTextPane txtpnBinarySearchTree = new JTextPane();
		txtpnBinarySearchTree.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnBinarySearchTree.setText("Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one.");
		txtpnBinarySearchTree.setBounds(30, 63, 227, 67);
		txtpnBinarySearchTree.setBackground(new Color(169, 169, 169));
		frmAlgos.getContentPane().add(txtpnBinarySearchTree);
		
		JTextPane txtpnSimplestSortingAlgorithm = new JTextPane();
		txtpnSimplestSortingAlgorithm.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtpnSimplestSortingAlgorithm.setLocation(new Point(2, 0));
		txtpnSimplestSortingAlgorithm.setToolTipText("");
		txtpnSimplestSortingAlgorithm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnSimplestSortingAlgorithm.setBackground(new Color(169, 169, 169));
		txtpnSimplestSortingAlgorithm.setText("Simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.");
		txtpnSimplestSortingAlgorithm.setBounds(30, 240, 227, 67);
		frmAlgos.getContentPane().add(txtpnSimplestSortingAlgorithm);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(63, 473, 154, 23);
		frmAlgos.getContentPane().add(btnNewButton_1);

		JLabel lblOutputResult = new JLabel("");
		lblOutputResult.setForeground(SystemColor.controlText);
		lblOutputResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutputResult.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblOutputResult.setBorder(null);
		lblOutputResult.setBounds(322, 170, 489, 60);
		frmAlgos.getContentPane().add(lblOutputResult);
		
		JButton btnNewButton_1_1 = new JButton("Algorithms");
		btnNewButton_1_1.setForeground(new Color(0, 51, 0));
		btnNewButton_1_1.setBackground(new Color(102, 153, 102));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//more about algorithm
				
				try {
					URI uri = new URI("https://www.geeksforgeeks.org/fundamentals-of-algorithms/");
					java.awt.Desktop.getDesktop().browse(uri);
				}
				catch (Exception ex) {
					
				}	
			}
			
		});
		btnNewButton_1_1.setBounds(63, 439, 154, 23);
		frmAlgos.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Sort");
		btnNewButton.setBackground(new Color(0, 153, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//run the main function
				
				JOptionPane.showConfirmDialog(frmAlgos,"Sort? ",
						"Algo7s_Sort", 0);
				
				//if (rdbtnNewRadioButton_1.isSelected()) {
					bubble();
					lblOutputResult.setText(answerLabel);}
				
				//else if (rdbtnNewRadioButton.isSelected()) {
					//AVL tree function
					
					
				//}
				//else {
					//showError();
				//}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(421, 279, 89, 28);
		frmAlgos.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				txtEnterSixNumbers.setText(null);
				txtEnterSixNumbers.setText("");
			lblOutputResult.setText(null);
			lblOutputResult.setText("");
			//rdbtnNewRadioButton_1.setSelected(false);
			//rdbtnNewRadioButton.setSelected(false);
			JOptionPane.showConfirmDialog(frmAlgos,"This will Clear All Inputs...  You want to clear?",
						"Algo7s_Clear", 0);


			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(590, 279, 89, 28);
		frmAlgos.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setBackground(new Color(204, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			//JFrame.SetDefaultCloseOperation(JFrame.DISPOSE
					public void actionPerformed(ActionEvent e) {
						JFrame frameExit = new JFrame("Exit");
						if(JOptionPane.showConfirmDialog(frameExit,"Confirm exit ?...." , "Algo7s_Exit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
							System.exit(0);}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(740, 482, 89, 28);
		frmAlgos.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("* All Rights Reserved *|| * Algo7s Creation *");
		lblNewLabel_2.setBounds(431, 524, 261, 14);
		frmAlgos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Input :");
		lblNewLabel_3.setForeground(SystemColor.desktop);
		lblNewLabel_3.setFont(new Font("Times CG ATT", Font.BOLD, 17));
		lblNewLabel_3.setBounds(410, 66, 65, 23);
		frmAlgos.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Output :");
		lblNewLabel_4.setForeground(SystemColor.desktop);
		lblNewLabel_4.setFont(new Font("Times CG ATT", Font.BOLD, 17));
		lblNewLabel_4.setBounds(312, 136, 89, 23);

		frmAlgos.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("AVL Tree");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 26, 110, 23);
		frmAlgos.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("More");
		btnNewButton_4.setForeground(new Color(0, 0, 102));
		btnNewButton_4.setBackground(new Color(102, 153, 204));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treesAVL.main(null);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(175, 150, 89, 23);

		frmAlgos.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("Bubble Sort");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setBounds(82, 198, 110, 31);
		frmAlgos.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_5 = new JButton("More");
		btnNewButton_5.setForeground(new Color(0, 0, 102));
		btnNewButton_5.setBackground(new Color(102, 153, 204));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				bubble_sort_more ob =new bubble_sort_more();
				ob.setVisible(true);
				//more about bubble sort
			}
		});

		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(175, 326, 89, 23);
		frmAlgos.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_7 = new JLabel("More About..");
		lblNewLabel_7.setForeground(new Color(0, 102, 0));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(82, 382, 120, 33);
		frmAlgos.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255)));
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\file\\Desktop\\ftur\\images\\Background2.jpg"));
		lblNewLabel_8.setBounds(10, 184, 265, 177);
		frmAlgos.getContentPane().add(lblNewLabel_8);
		
	
		txtEnterSixNumbers = new JTextField();
		txtEnterSixNumbers.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEnterSixNumbers.setToolTipText("Enter Six Numbers..");
		txtEnterSixNumbers.setBounds(485, 63, 313, 31);
		frmAlgos.getContentPane().add(txtEnterSixNumbers);
		txtEnterSixNumbers.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(153, 153, 153));
		lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255)));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\file\\Desktop\\ftur\\images\\main_background.jpg"));
		lblNewLabel_1.setBounds(285, 11, 544, 309);
		frmAlgos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("\r\n");
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255)));
		lblNewLabel_5.setBounds(10, 11, 265, 170);
		frmAlgos.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 255, 204), new Color(204, 255, 204), new Color(204, 255, 204), new Color(204, 255, 204)));
		lblNewLabel_9.setBounds(10, 365, 265, 162);
		frmAlgos.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(302, 61, 496, 137);
		frmAlgos.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBackground(new Color(153, 153, 153));
		lblNewLabel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255), new Color(204, 204, 255)));
		lblNewLabel_11.setBounds(285, 331, 544, 131);
		frmAlgos.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 255, 204), new Color(204, 255, 204), new Color(204, 255, 204), new Color(204, 255, 204)));
		lblNewLabel_12.setBounds(10, 11, 265, 516);
		frmAlgos.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Play Bubble Sort...!");
		lblNewLabel_13.setForeground(new Color(102, 51, 51));
		lblNewLabel_13.setFont(new Font("Lucida Console", Font.BOLD, 17));
		lblNewLabel_13.setBounds(295, 26, 215, 17);
		frmAlgos.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("AVL Tree...!");
		lblNewLabel_14.setForeground(new Color(102, 51, 51));
		lblNewLabel_14.setFont(new Font("Lucida Console", Font.BOLD, 17));
		lblNewLabel_14.setBounds(312, 348, 198, 17);
		frmAlgos.getContentPane().add(lblNewLabel_14);
		
		JButton btnNewButton_6 = new JButton("GO..");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avltree.Start.main(null);
				
			}
		});
		btnNewButton_6.setForeground(new Color(204, 51, 153));
		btnNewButton_6.setBackground(new Color(255, 204, 204));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_6.setBounds(490, 402, 77, 33);
		frmAlgos.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_15 = new JLabel("\r\n");
		lblNewLabel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204), new Color(204, 204, 204)));
		lblNewLabel_15.setBounds(285, 11, 544, 113);
		frmAlgos.getContentPane().add(lblNewLabel_15);
	}
	private void bubble() {
		String value;
		String []array;
		value = txtEnterSixNumbers.getText();
		array =value.split(",");
		int[] NumberArray=new int[array.length];
//		List<Integer> list = new ArrayList<Integer>();

		for(int i= 0 ; i < array.length;i++) {
			NumberArray[i] = Integer.parseInt(array[i]);
			System.out.println(Integer.parseInt(array[i]));
			System.out.println(NumberArray[i]);
		}
		
		bubblesort(NumberArray,NumberArray.length);
	}

	 private void bubblesort(int array[] , int size) {
		int temp;
		
		for(int pass = 1; pass < size; pass++) {
			for (int i=0 ; i<size - pass; i++) {
				if(array[i] > array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		
		 for (int num: array) {
		      answerLabel += String.valueOf(num)+" ";
		    }
		 System.out.println(answerLabel);	

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}	
	
	public void showError() {
		JOptionPane.showMessageDialog(frmAlgos, "Please Select Data Structure(AVL Tree) " +"Bubble Sort with Your Input to Proceed..!",
				"Algo7s_Error", JOptionPane.ERROR_MESSAGE);
	}
	//clear console
	public void clearCon() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
