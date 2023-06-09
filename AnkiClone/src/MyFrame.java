import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame implements ActionListener {
	
	
 MyFrame(){
	 
	 
	 JButton GetShared = new JButton();
	 GetShared.setBounds(200,100,100,50);
	 GetShared.setText("Get Shared");
	 
	 JButton CreateDeck = new JButton();
	 CreateDeck.setBounds(200,100,100,50);
	 CreateDeck.setText("Create Deck"); 
	 
	 JButton ImportFile = new JButton();
	 ImportFile.setBounds(200,100,100,50);
	 ImportFile.setText("Import File");
	 
	 JLabel Decks=new JLabel("Decks");
	 JLabel Decks1=new JLabel("Decks");
	 JLabel Add=new JLabel("Add");
	 JLabel Browse=new JLabel("Browse");
	 JLabel Stats=new JLabel("Stats");
	 JLabel Sync=new JLabel("Sync");
	 
	 JLabel New=new JLabel("New");
	 JLabel Due=new JLabel("Due");
	 
	 JLabel Study=new JLabel("Studied 0 cards in 0 seconds today (0s/card)");
	 
	 JLabel DeckName=new JLabel("Default");
	 JLabel newNumber1=new JLabel("0");
	 JLabel Learning=new JLabel("0");
	 JLabel Due2=new JLabel("0");







	 
	 	JPanel container1 = new JPanel();
	 	container1.setPreferredSize(new Dimension(200,30));
	 	
	 	
	 	JPanel container2 = new JPanel();
	 	container2.setPreferredSize(new Dimension(300,300));
	 	
	 	JPanel containerA = new JPanel();
	 	containerA.setPreferredSize(new Dimension(520,30));
	 	JPanel containerB = new JPanel();
	 	containerB.setPreferredSize(new Dimension(520,30));
	 	JPanel containerC = new JPanel();
	 	containerC.setPreferredSize(new Dimension(510,30));
	 	
	 	
	 	
	 	JPanel container3 = new JPanel();
	 	container3.setPreferredSize(new Dimension(210,70));
	 	
		JPanel buttonContainer = new JPanel();
	 	buttonContainer.setPreferredSize(new Dimension(500,50));
	 	

 
	 
	 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,550);
		this.add(container1,BorderLayout.NORTH);
		this.add(container2,BorderLayout.CENTER);
		this.add(container3,BorderLayout.SOUTH);

	    Border blackline = BorderFactory.createLineBorder(Color.black);
		
		container1.add(Decks);
		container1.add(Add);
		container1.add(Browse);
		container1.add(Stats);
		container1.add(Sync);
		container1.setBorder(blackline);
		
		
		container2.add(containerA,BorderLayout.NORTH);
		container2.add(containerB,BorderLayout.CENTER);
		container2.add(containerC,BorderLayout.SOUTH);
		container3.add(buttonContainer,BorderLayout.CENTER);
        
		containerA.add(Decks1);
		containerA.add(New);
		containerA.add(Due);
		containerB.add(DeckName);
		containerB.add(newNumber1);
		containerB.add(Learning);
		containerB.add(Due2);
		containerC.add(Study);
	


		buttonContainer.add(GetShared);
		buttonContainer.add(CreateDeck);
		buttonContainer.add(ImportFile);


		
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
		
		JMenuItem StudyDeck = new JMenuItem("Study Deck");
		JMenuItem Create = new JMenuItem("Create Filtered Deck");
		JMenuItem CheckD = new JMenuItem("Check Database");
		JMenuItem CheckM = new JMenuItem("Check Media");
		JMenuItem Empty = new JMenuItem("Empty Cards");
		
		ToolsMenu.add(StudyDeck);
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
