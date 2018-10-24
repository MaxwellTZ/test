import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;


public class JListExample extends JFrame{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListModel model = new DefaultListModel();
		model.addElement("one");
		model.addElement("two");	
		JList list= new JList(model);
		JPanel jp = new JPanel();
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
			
		
		jp.add(list);
		JFrame frame= new JFrame();
		
		frame.add(jp);
		frame.setVisible(true);
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250, 80));
		


//frame.getContentPane().add(list,BorderLayout.NORTH);

	}

}
