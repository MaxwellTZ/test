import java.awt.*;

import javax.swing.*;

public class MyFrame1 extends JFrame{
	private JButton exitButton = new JButton("exit");

	public MyFrame1() {
		super();
		init();
	}

	private void init() {
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(exitButton);
		this.setLocation(100,100);
		this.setSize(300,200);
		
	}

	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();
		frame.setVisible(true);
	

	}

}
