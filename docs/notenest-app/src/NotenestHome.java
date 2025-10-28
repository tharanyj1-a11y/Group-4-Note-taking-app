
import javax.swing.*;
import java.awt.*;

public class NotenestHome {
	
	//Create an array of JButtons which allow the user to navigate to the frame they desire
	public JButton [] frameButtons = new JButton[3];
	//create the frame
	public JFrame frame;
	
	//constructor will display the title screen and all it's buttons and labels
	//will be called by the controller
	public NotenestHome() {
		
		//get the users name
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		//create the main frame
		frame = new JFrame();
		
		//set the title of the frame
		frame.setTitle("Notenest - Home");
				
		//set the size of the frame
		frame.setSize(1920,1080);
		
		//set the frame to have no layout
		frame.setLayout(null);
				
		//set resizable to false
		//frame.setResizable(false);
		
		//Create an imageIcon for the background
		ImageIcon icon = new ImageIcon("Images/Background.jpg");
		
		//Create an imageicon for the filter icon
		ImageIcon filterIcon = new ImageIcon("Images/filter.png");
		
		//Create a background label
		JLabel background = new JLabel(icon);
		
		//set the bounds of the label
		background.setBounds(0,0,1920,1080);
		
		//create a font that will be used for all buttons 
		Font font = new Font("Georgia", Font.PLAIN, 50);
		
		//create a font for the title label
		Font titleFont = new Font ("Georgia", Font.BOLD, 60);
		
		//create a font for the guide label
		Font guideFont = new Font ("Georgia", Font.BOLD, 30);
		
		//create each individual frame button
		frameButtons[0]=new JButton("Reminder");
		frameButtons[1]=new JButton(filterIcon);
		frameButtons[2]=new JButton("New Note");
	

		//set the buttons location on screen
		frameButtons[0].setBounds(1500,50,300,125);
		//set the font of the button
		frameButtons[0].setFont(font);
		//set the background colour of the buttons 
		frameButtons[0].setBackground(Color.decode("#9eb228"));
		//set the button to have no border
		frameButtons[0].setBorder(null);
		//also set the button to not be focusable so theres no blue box around the first button
		frameButtons[0].setFocusable(false);
		//add the button to the screen
		frame.add(frameButtons[0]);
		
		
		//set the buttons location on screen
		frameButtons[1].setBounds(1282,275,90,100);
		//set the font of the button
		frameButtons[1].setFont(font);
		//set the background colour of the buttons 
		frameButtons[1].setBackground(Color.decode("#9eb228"));
		//set the button to have no border
		frameButtons[1].setBorder(null);
		//also set the button to not be focusable so theres no blue box around the first button
		frameButtons[1].setFocusable(false);
		//add the button to the screen
		frame.add(frameButtons[1]);
		
		
		//set the buttons location on screen
		frameButtons[2].setBounds(1122,883,250,125);
		//set the font of the button
		frameButtons[2].setFont(font);
		//set the background colour of the buttons 
		frameButtons[2].setBackground(Color.decode("#9eb228"));
		//set the button to have no border
		frameButtons[2].setBorder(null);
		//also set the button to not be focusable so theres no blue box around the first button
		frameButtons[2].setFocusable(false);
		//add the button to the screen
		frame.add(frameButtons[2]);
		
		//create a label 
		JLabel noteName = new JLabel(name + "'s" + " Note");
		
		//set bounds for the title
		noteName.setBounds(860, 150, 700,200);
		
		//set the font for the title label
		noteName.setFont(guideFont);
		
		//add the title 
		frame.add(noteName);
		
		//add the background image
		frame.add(background);
		
		//set visibility to true
		frame.setVisible(true);
		
		
	

}

}
