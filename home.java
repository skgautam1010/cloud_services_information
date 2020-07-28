import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton signupButton = new JButton("Signup");
    JButton loginButton = new JButton("Login");
    JButton exitButton = new JButton("Exit");
    JButton adminButton = new JButton("Login As ADMIN");
    JLabel welLabel = new JLabel("CLOUD COMPUTING SERVICES INFORMATION");
    ImageIcon img=new ImageIcon("Cloud.jpg");
    JLabel background=new JLabel("",img,JLabel.CENTER);


    home() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	welLabel.setFont(new Font("Courier New", Font.BOLD, 35));
        welLabel.setForeground(Color.white);
	welLabel.setBounds(320,200,1000,50);

        signupButton.setBounds(550,300,200,50);
	loginButton.setBounds(550,370,200,50);
	adminButton.setBounds(550,440,200,50);
	
        exitButton.setBounds(550,580,200,50);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {
	container.add(welLabel);

        container.add(signupButton);
        container.add(loginButton);
	
	container.add(exitButton);
	container.add(adminButton);
	container.add(background);
    }

    public void addActionEvent() {
	signupButton.addActionListener(this);
        loginButton.addActionListener(this);
	        
	exitButton.addActionListener(this);
	adminButton.addActionListener(this);
        
    }




public static void main(String[] args) 
    {
      home frame=new home();
        frame.setSize(1300,745);
        frame.pack();
      	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == loginButton)
		{
        		login l=new login();
			l.setSize(1300,745);
			l.setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == signupButton)
		{
        		signup s=new signup();
			s.setSize(1300,745);
			s.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == adminButton)
		{
        		adlogin al=new adlogin();
			al.setSize(1300,745);
			al.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource() == exitButton)
		{
			System.exit(0);
		}
	}

}

    

