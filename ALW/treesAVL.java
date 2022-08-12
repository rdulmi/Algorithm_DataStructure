package ALW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class treesAVL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					treesAVL frame = new treesAVL();
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
	public treesAVL() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Pradeepa\\Documents\\groupwork_it3007\\AlgoGroup\\images\\algo7s_logo.jpg"));
		setTitle("AVL Trees");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AVL Trees");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(199, 23, 105, 13);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnAvlTreeIs = new JTextPane();
		txtpnAvlTreeIs.setBackground(SystemColor.menu);
		txtpnAvlTreeIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnAvlTreeIs.setText("Named after their inventor Adelson, Velski & Landis, AVL tree is a self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.");
		txtpnAvlTreeIs.setBounds(25, 46, 508, 48);
		contentPane.add(txtpnAvlTreeIs);
		
		JLabel lblNewLabel_1 = new JLabel("An Example Tree that is an AVL Tree ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 104, 288, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnY = new JTextPane();
		txtpnY.setText("         |Y|\r\n         / \\\r\n       /     \\\r\n     |X|  |T3|    \r\n       / \\\r\n     /     \\   \r\n |T1|  |T2|\r\n");
		txtpnY.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnY.setBackground(SystemColor.menu);
		txtpnY.setBounds(27, 142, 118, 131);
		contentPane.add(txtpnY);
		
		JTextPane txtpnTheAboveTree = new JTextPane();
		txtpnTheAboveTree.setText("The above tree is AVL because differences between heights of left and right subtrees for every node is less than or equal to 1.\r\n\r\nThis difference between left and right subtree height is called the Balance Factor.\r\n\r\n");
		txtpnTheAboveTree.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnTheAboveTree.setBackground(SystemColor.menu);
		txtpnTheAboveTree.setBounds(172, 127, 361, 114);
		contentPane.add(txtpnTheAboveTree);
		
		JTextPane txtpnBalancefactorHeight = new JTextPane();
		txtpnBalancefactorHeight.setText("BalanceFactor = Height (Left-Sutbtree) \u2212 Height (Right-Subtree)");
		txtpnBalancefactorHeight.setFont(new Font("Tahoma", Font.ITALIC, 13));
		txtpnBalancefactorHeight.setBackground(SystemColor.menu);
		txtpnBalancefactorHeight.setBounds(155, 251, 378, 29);
		contentPane.add(txtpnBalancefactorHeight);
		
		JTextPane txtpnAvlRotationsTo = new JTextPane();
		txtpnAvlRotationsTo.setText("To balance itself, an AVL tree may perform the following four kinds of rotations \u2212\r\n\r\n  1) Left rotation\r\n  2) Right rotation\r\n  3) Left-Right rotation\r\n  4) Right-Left rotation");
		txtpnAvlRotationsTo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnAvlRotationsTo.setBackground(SystemColor.menu);
		txtpnAvlRotationsTo.setBounds(12, 283, 508, 109);
		contentPane.add(txtpnAvlRotationsTo);
		
		JLabel lblNewLabel_2 = new JLabel("\u229B");
		lblNewLabel_2.setBounds(12, 52, 14, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u229B");
		lblNewLabel_2_1.setBounds(12, 104, 14, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u229B");
		lblNewLabel_2_1_1.setBounds(161, 130, 14, 13);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\u229B");
		lblNewLabel_2_1_1_1.setBounds(161, 195, 14, 13);
		contentPane.add(lblNewLabel_2_1_1_1);
	}
}
