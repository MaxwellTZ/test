import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame3 extends JFrame {
	private JButton exitButton = new JButton("exit");
	private JButton helloButton = new JButton("hello printer");

	public MyFrame3() {
		super();
		init();
	}

	private void init() {
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(exitButton);
		this.getContentPane().add(helloButton);

		this.setLocation(100,100);
		this.setSize(300,200);
		
		this.exitButton.addActionListener(	
				new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				dispose();	
				System.exit(0);
				}
		});

		this.helloButton.addActionListener(	
				new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				
				}
		});

	}

	public static void main(String[] args) {
		MyFrame3 frame = new MyFrame3();
		frame.setVisible(true);
		

	}

	


}
