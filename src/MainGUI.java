
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Color;


@SuppressWarnings("serial")
public class MainGUI extends JPanel implements ActionListener {
//The following variables are used to build user GUI interface:
	protected JButton b1, b2, b3, b4;
	protected JLabel 	lblEqFileHas , lblSshFileHas , StageOneDone , lblProgramHasBeen , lblEhProject , lblDevelopedByAmar , lblThisProgramWill ;
	private JFrame frmEhProject ;
	private JLabel lblNewLabel;
	
	
//Main
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frmEhProject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//This method is used to build user GUI interface
public MainGUI() {
	
// Created by windows builder Swing designer

// All GuI elements are created 
	//Frame
		frmEhProject = new JFrame();
		frmEhProject.getContentPane().setBackground(new Color(26, 86, 166));
		frmEhProject.setTitle("EH2745: Project 2");
		frmEhProject.setBounds(100, 100, 504, 551);
		frmEhProject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEhProject.getContentPane().setLayout(null);
	//Buttons
		b1 = new JButton("Login To Database");
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(26, 86, 166));
		b1.setBounds(38, 117, 149, 41);
		frmEhProject.getContentPane().add(b1);
		
		b2 = new JButton("Run Program");
		b2.setForeground(Color.WHITE);
		b2.setBackground(new Color(26, 86, 166));
		b2.setBounds(38, 176, 149, 41);
		frmEhProject.getContentPane().add(b2);
		
		//b4 = new JButton("Display Tables");
		//b4.setForeground(Color.WHITE);
		//b4.setBackground(new Color(26, 86, 166));
		//b4.setBounds(38, 299, 149, 41);
		//frmEhProject.getContentPane().add(b4);
		
	// Used when the Program is Upgraded were other options can be included
		
		b3 = new JButton("Display Output");
		b3.setForeground(Color.WHITE);
		b3.setBackground(new Color(26, 86, 166));;
		b3.setBounds(38, 240, 149, 41);
		frmEhProject.getContentPane().add(b3);
		
	//Labels	
		
		lblEqFileHas = new JLabel("Login to database is successful");
		lblEqFileHas.setBounds(197, 130, 184, 14);
		lblEqFileHas.setForeground(Color.WHITE);
		
		lblSshFileHas = new JLabel("Program has been executed");
		lblSshFileHas.setBounds(197, 189, 184, 14);
		lblSshFileHas.setForeground(Color.WHITE);
		
		StageOneDone = new JLabel("Output has been displayed");
		StageOneDone.setBounds(197, 253, 184, 14);
		StageOneDone.setForeground(Color.WHITE);
		
		//lblProgramHasBeen = new JLabel("Table has been displayed ");
		//lblProgramHasBeen.setBounds(197, 312, 261, 14);
		//lblProgramHasBeen.setForeground(Color.WHITE);
		
		JLabel lblEhProject = new JLabel("EH2745: Project 2");
		lblEhProject.setForeground(Color.WHITE);
		lblEhProject.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25));
		lblEhProject.setBounds(104, 11, 282, 53);
		frmEhProject.getContentPane().add(lblEhProject);
		
		JLabel lblDevelopedByAmar = new JLabel("Developed by: Amar Abideen & Hatem Alatawi");
		lblDevelopedByAmar.setForeground(Color.WHITE);
		lblDevelopedByAmar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDevelopedByAmar.setBounds(129, 481, 228, 20);
		frmEhProject.getContentPane().add(lblDevelopedByAmar);
		
		//JLabel lblThisProgramWill = new JLabel("This program will import a database of power system measurements, analyze the states in the data then classify new measurements");
		 
		//lblThisProgramWill.setForeground(Color.WHITE);
		//lblThisProgramWill.setBounds(10, 61, 468, 28);
		//frmEhProject.getContentPane().add(lblThisProgramWill);
		
	    // Picture   
        lblNewLabel = new JLabel("");
        
        Image img = new ImageIcon(this.getClass().getResource("/img/kth_logo.gif")).getImage();        
        
        lblNewLabel.setIcon(new ImageIcon(img));
        lblNewLabel.setBounds(192, 370, 100, 100);
        frmEhProject.getContentPane().add(lblNewLabel);
        
        // Buttons settings

        b1.setToolTipText("Click this button to Login to Database");
        b2.setToolTipText("Click this button to Load the program");
        b3.setToolTipText("Click this button to Display the Output");
        


        // Initial Display
        b2.setEnabled(false);
        b3.setEnabled(false);
  

        lblEqFileHas.setEnabled(false); 
    	lblSshFileHas.setEnabled(false); 
    	StageOneDone.setEnabled(false); 


    	// Buttons ction commands and listeners
    	
	        b1.setActionCommand("1");
	        b2.setActionCommand("2");
	        b3.setActionCommand("3");
	        //b4.setActionCommand("4");

	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        //b4.addActionListener(this);



		
	}

//This method is used to define the actionPerformed for buttons actionListerner
public void actionPerformed(ActionEvent e) {
    	
    	
    	if ("1".equals(e.getActionCommand())) {
    		StageOne();
    	} 
        
        if ("2".equals(e.getActionCommand())) {
        	StageTwo() ;
        } 
        
        if ("3".equals(e.getActionCommand())) {
        StageThree() ;
        }
        
}

//This method is used to proceed to Result presenting
private void StageThree(){

	try {
		TablePoP window2 = new TablePoP();
		window2.OUTPUT.setVisible(true);
		frmEhProject.getContentPane().add(StageOneDone);
		StageOneDone.setEnabled(true);
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	


 
}

//This method is used to proceed to Excute the Python written Program
private void StageTwo() {
	
	            try {
	            	String currentDir = System.getProperty("user.dir") ;
					@SuppressWarnings("unused")
					Process p= Runtime.getRuntime().exec("cmd.exe /c cd \""+currentDir+"\" & start cmd.exe /c \"Program.py");
					
					Thread.sleep(20000);					 

					 
				} catch (IOException | InterruptedException   e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				b3.setEnabled(true);
	    		frmEhProject.getContentPane().add(lblSshFileHas);
	    		lblSshFileHas.setEnabled(true); 

	}
	

//This method is used to proceed to database login frame
private void StageOne(){

// Create frame 
	
	final JFrame LoginFrame = new JFrame("Login To Database");
    LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    LoginFrame.setSize(300,100);

    LoginFrame.setVisible(false);
    
    

    
 // Go to this method
    DatabaseUserChecker login = new DatabaseUserChecker(LoginFrame);

	    login.setVisible(true);

	    if(login.UserLogged()){
	    	
	   try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		String dbUrl="jdbc:mysql://localhost/subtables?user=root&password=y9mkrg6wyc8r";
	    		DriverManager.getConnection(dbUrl);
	    		
	    	} catch (ClassNotFoundException | SQLException e2) {
	    		// TODO Auto-generated catch block
	    		e2.printStackTrace();
	   }

    	b2.setEnabled(true);
    	frmEhProject.getContentPane().add(lblEqFileHas);
    	lblEqFileHas.setEnabled(true);

	    LoginFrame.setVisible(false);
	    
	}
	
}

}

