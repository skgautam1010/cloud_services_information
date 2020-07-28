import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    Container container = getContentPane();
	JLabel userLabel = new JLabel("Username");
	JCheckBox showPassword = new JCheckBox("Show Password");
	JLabel passwordLabel = new JLabel("Password");
        JButton loginButton = new JButton("Login");
        JButton backButton = new JButton("Back");
	JTextField userTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
	JButton resetButton = new JButton("RESET");
        ImageIcon img=new ImageIcon("Cloud.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);


    login() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	userLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        userLabel.setForeground(Color.cyan);
	passwordLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        passwordLabel.setForeground(Color.cyan);
	userTextField.setBounds(600,255,180,30);
	passwordField.setBounds(600,300,180,30);

        userLabel.setBounds(500,255,100,30);
	passwordLabel.setBounds(500,300,100,30);

	loginButton.setBounds(500,395,281,40);
        backButton.setBounds(500,485,281,40);
	resetButton.setBounds(500,440,281,40);

	showPassword.setBounds(600, 345, 150, 30);

	background.setBounds(0,0,1300,710);


    }

    public void addComponentsToContainer() {

        container.add(passwordField);
        container.add(userTextField);
	container.add(userLabel);
	container.add(passwordLabel);
	container.add(loginButton);
	container.add(backButton);
	container.add(background);
	container.add(showPassword);
	container.add(resetButton);
    }

    public void addActionEvent() {
	loginButton.addActionListener(this);
	backButton.addActionListener(this);
	showPassword.addActionListener(this);
	resetButton.addActionListener(this);
    }




public static void main(String[] args)
    {
      login frame=new login();
      frame.setSize(1300,745);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == backButton)
		{
        		home h=new home();
			h.setSize(1300,745);
			h.setVisible(true);
			this.setVisible(false);
		}

		if (e.getSource() == loginButton)
		{
	            String userText;
	            String pwdText;
	            userText = userTextField.getText();
	            pwdText = passwordField.getText();
	            registrationdata r = new registrationdata();
	            if (r.verify(userText,pwdText))
		    {
                	JOptionPane.showMessageDialog(this, "Login Successful");
			dashboard d=new dashboard();
			d.setSize(1300,745);
			d.setVisible(true);
			this.setVisible(false);
            	    }
		    else {
                	JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        	         }
        	}

		if (e.getSource() == resetButton)
 		{
            		userTextField.setText("");
            		passwordField.setText("");
        	}

		if (e.getSource() == showPassword)
		{
	            if (showPassword.isSelected())
		    {
	            	passwordField.setEchoChar((char) 0);
            	    }
		    else {
                	passwordField.setEchoChar('*');
            		 }
		}
	}

}


