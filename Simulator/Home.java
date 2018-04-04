import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public void Method(){
		Home window = new Home();
		window.frame.setVisible(true);
		//initialize();
	}
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100,100,850,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOsConceptsSimulator = new JLabel("SIMULATOR");
		lblOsConceptsSimulator.setBackground(Color.WHITE);
		lblOsConceptsSimulator.setForeground(Color.RED);
		lblOsConceptsSimulator.setFont(new Font("Maiandra GD", Font.BOLD, 30));
		lblOsConceptsSimulator.setBounds(330, 28, 282, 100);
		frame.getContentPane().add(lblOsConceptsSimulator);
		
		JLabel lblOsConceptsSimulator1 = new JLabel("CPU Scheduling");
		lblOsConceptsSimulator1.setBackground(Color.WHITE);
		lblOsConceptsSimulator1.setForeground(Color.BLUE);
		lblOsConceptsSimulator1.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblOsConceptsSimulator1.setBounds(75,275, 282,50);
		frame.getContentPane().add(lblOsConceptsSimulator1);
		
		JLabel lblOsConceptsSimulator2 = new JLabel("Disk Scheduling");
		lblOsConceptsSimulator2.setBackground(Color.WHITE);
		lblOsConceptsSimulator2.setForeground(Color.BLUE);
		lblOsConceptsSimulator2.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblOsConceptsSimulator2.setBounds(340, 275, 282,50);
		frame.getContentPane().add(lblOsConceptsSimulator2);
		
		JLabel lblOsConceptsSimulator3= new JLabel("Page Replacement");
		lblOsConceptsSimulator3.setBackground(Color.WHITE);
		lblOsConceptsSimulator3.setForeground(Color.BLUE);
		lblOsConceptsSimulator3.setFont(new Font("Papyrus", Font.BOLD, 20));
		lblOsConceptsSimulator3.setBounds(570, 275, 282,50);
		frame.getContentPane().add(lblOsConceptsSimulator3);
		
		Icon I1 = new ImageIcon("cpu1.jpg");
		Icon I2 = new ImageIcon("disk2.jpg");
		Icon I3 = new ImageIcon("page1.jpg");
		
		JButton btnNewButton = new JButton(I1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("CPU");
				process z=new process();
				z.DS();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(50, 125, 240, 125);
		frame.getContentPane().add(btnNewButton);
		
		JButton DiskScheduling = new JButton(I2);
		DiskScheduling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Disk");
				DiskScheduling x = new DiskScheduling();
				x.DS();
				frame.setVisible(false);
				}
		});
		DiskScheduling.setBounds(300,125,240,125);
		frame.getContentPane().add(DiskScheduling);
		
		JButton btnNewButton_2 = new JButton(I3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Page");
				pagereplacement y = new pagereplacement();
				y.DS();
				frame.setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(550,125, 240,125);
		frame.getContentPane().add(btnNewButton_2);
	}
}
