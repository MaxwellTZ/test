import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame2 extends JFrame implements ActionListener {
	private JButton exitButton = new JButton("exit");

	public MyFrame2() {
		super();
		init();
	}

	private void init() {
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(exitButton);
		this.setLocation(100,100);
		this.setSize(300,200);
		
		this.exitButton.addActionListener(this);
			

	}

	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2();
		frame.setVisible(true);
		

	}

	

	
	@Override
	public void actionPerformed(ActionEvent e) {
	//	if (e.getSource()==this.exitButton) {
			this.dispose();	
			System.exit(0);		//}

		
	}

}
