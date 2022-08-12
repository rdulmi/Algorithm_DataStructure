package ALW;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Input_output_bubble {

	private JFrame frame;
	private JTextField text1;
	private int[] Number;
	String answerLabel="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input_output_bubble window = new Input_output_bubble();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Input_output_bubble() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lebl1 = new JLabel("INPUT");
		lebl1.setBounds(10, 30, 79, 24);
		frame.getContentPane().add(lebl1);
		
		text1 = new JTextField();
		text1.setBounds(154, 32, 166, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lebl2 = new JLabel("OUTPUT");
		lebl2.setBounds(10, 88, 59, 14);
		frame.getContentPane().add(lebl2);
		
		JLabel lab1 = new JLabel("");
		lab1.setBounds(154, 88, 166, 14);
		frame.getContentPane().add(lab1);
		
		JButton btn1 = new JButton("Bubblesort");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bubble();
				lab1.setText(answerLabel);
			}
		});
		btn1.setBounds(32, 133, 100, 23);
		frame.getContentPane().add(btn1);
	}


private void bubble() {
	String value;
	String []array;
	value = text1.getText();
	array =value.split(",");
	int[] NumberArray=new int[array.length];
//	List<Integer> list = new ArrayList<Integer>();

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
}
