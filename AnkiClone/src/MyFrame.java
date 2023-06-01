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

		JMenuItem SwitchProfile = new JMenuItem("Switch Profile");
		JMenuItem Import = new JMenuItem("Import");
		JMenuItem Export = new JMenuItem("Export");
		
		JMenuItem Undo = new JMenuItem("Undo");
		
		JMenuItem Guide = new JMenuItem("Guide");
		JMenuItem Support = new JMenuItem("Support Anki");
		JMenuItem About = new JMenuItem("About");
		
		JMenuItem Study = new JMenuItem("Study Deck");
		JMenuItem Create = new JMenuItem("Create Filtered Deck");
		JMenuItem CheckD = new JMenuItem("Check Database");
		JMenuItem CheckM = new JMenuItem("Check Media");
		JMenuItem Empty = new JMenuItem("Empty Cards");
		
		ToolsMenu.add(Study);
		ToolsMenu.add(Create);
		ToolsMenu.add(CheckD);
		ToolsMenu.add(CheckM);
		ToolsMenu.add(Empty);





		HelpMenu.add(Guide);
		HelpMenu.add(Support);
		HelpMenu.add(About);



		EditMenu.add(Undo);


		FileMenu.add(SwitchProfile);
		FileMenu.add(Import);
		FileMenu.add(Export);

		
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
