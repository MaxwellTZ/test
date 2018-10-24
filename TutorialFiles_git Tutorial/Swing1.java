import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Swing1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Frame 1");
		
		JScrollPane jsp = new  JScrollPane();
		
		JCheckBox cb = new JCheckBox("CheckBox 1");
		JRadioButton rb = new JRadioButton("RadioButton");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(500, 400);
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		

		//button1.setSize(100, 200);
		//frame.getContentPane().setLayout(new BorderLayout(10,10));
		frame.getContentPane().add(button1,BorderLayout.NORTH);
		frame.getContentPane().add(button2, BorderLayout.SOUTH);
		frame.getContentPane().add(cb, BorderLayout.CENTER);
		//frame.getContentPane().add(rb, BorderLayout.LINE_START);
		//frame.getContentPane().add(jl, BorderLayout.AFTER_LINE_ENDS);
		frame.getContentPane().add(jsp, BorderLayout.LINE_START);
		frame.setVisible(true);

	}

}
