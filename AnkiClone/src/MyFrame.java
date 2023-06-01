import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
 MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu FileMenu = new JMenu("File");
		JMenu EditMenu = new JMenu("Edit");
		JMenu ToolsMenu = new JMenu("Tools");
		JMenu HelpMenu = new JMenu("Help");

		
		menuBar.add(FileMenu);
		menuBar.add(EditMenu);
		menuBar.add(ToolsMenu);
		menuBar.add(HelpMenu);

		
		this.setVisible(true);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
	 
 }
	
}
