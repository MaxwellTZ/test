import java.awt.*;

import javax.swing.*;


public class NestedContainers {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLocation(100, 100);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(new JButton("Exit"));
		panel.add(new JButton("Load"));
		panel.add(new JButton("Save"));
		frame.getContentPane().add(panel,BorderLayout.NORTH);
		frame.getContentPane().add( new JTextArea("edit me"),BorderLayout.CENTER);
		//frame.getContentPane().add(new JLabel("info"),BorderLayout.SOUTH);
		
		JPanel panel2 = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(new JButton("Exit"));
		panel2.add(new JButton("reload"));
		frame.getContentPane().add(panel2,BorderLayout.SOUTH);
		frame.setVisible(true);


	}

}
