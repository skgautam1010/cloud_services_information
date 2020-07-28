import javax.swing.*;
import java.awt.*;
import java.util.regex.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener,KeyListener
{

    Container container = getContentPane();
	JLabel userLabel = new JLabel("Username");
	JLabel nameLabel = new JLabel("Name");
	JLabel ageLabel = new JLabel("Age");
	JLabel addressLabel = new JLabel("Address");
	JLabel genderLabel = new JLabel("Gender");
	JLabel emailLabel = new JLabel("Email-Id");
	JLabel passwordLabel = new JLabel("Password");
        JButton registerButton = new JButton("Register");
        JButton backButton = new JButton("Back");
	JTextField userTextField = new JTextField();
	JTextField nameTextField = new JTextField();
	JTextField ageTextField = new JTextField();
	//JTextField genderTextField = new JTextField();
	String service[]={"Select","Male","Female","Transgender"};
        JComboBox genderTextField=new JComboBox(service);
	JTextField emailTextField = new JTextField();
	JTextField addressTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
	JCheckBox showPassword = new JCheckBox("Show Password");
	JButton resetButton = new JButton("RESET");
        ImageIcon img=new ImageIcon("Cloud.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);


    signup() {
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
	nameLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        nameLabel.setForeground(Color.cyan);
	ageLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        ageLabel.setForeground(Color.cyan);
	addressLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        addressLabel.setForeground(Color.cyan);
	genderLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        genderLabel.setForeground(Color.cyan);
        emailLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        emailLabel.setForeground(Color.cyan);
	passwordLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        passwordLabel.setForeground(Color.cyan);

	userLabel.setBounds(500,185,100,30);
	nameLabel.setBounds(500,230,100,30);
        ageLabel.setBounds(500,275,100,30);
	addressLabel.setBounds(500,320,100,30);
	genderLabel.setBounds(500,365,100,30);
        emailLabel.setBounds(500,410,100,30);
        passwordLabel.setBounds(500,450,100,30);

	userTextField.setBounds(600,185,180,30);
	nameTextField.setBounds(600,230,180,30);
        ageTextField.setBounds(600,275,180,30);
	addressTextField.setBounds(600,320,180,30);
	genderTextField.setBounds(600,365,180,30);
	emailTextField.setBounds(600,410,180,30);
        passwordField.setBounds(600,450,180,30);

	registerButton.setBounds(500,540,281,40);
        backButton.setBounds(500,640,281,40);
	resetButton.setBounds(500,590,281,40);

	showPassword.setBounds(600, 490, 150, 30);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {

        container.add(userLabel);
        container.add(nameLabel);
	container.add(ageLabel);
	container.add(addressLabel);
	container.add(genderLabel);
	container.add(emailLabel);
	container.add(passwordLabel);
	container.add(userTextField);
        container.add(nameTextField);
	container.add(ageTextField);
	container.add(addressTextField);
	container.add(genderTextField);
	container.add(emailTextField);
	container.add(passwordField);
	container.add(registerButton);
	container.add(backButton);
	container.add(background);
	container.add(showPassword);
	container.add(resetButton);
    }

    public void addActionEvent() {
	registerButton.addActionListener(this);
	backButton.addActionListener(this);
	showPassword.addActionListener(this);
	resetButton.addActionListener(this);
	ageTextField.addKeyListener(this);
    }




public static void main(String[] args)
    {
      signup frame=new signup();
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

		if (e.getSource() == resetButton)
 		{
            		userTextField.setText("");
            		nameTextField.setText("");
			ageTextField.setText("");
            		addressTextField.setText("");
			//genderTextField.setText("");
			emailTextField.setText("");
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

		if (e.getSource() == registerButton)
		{
			String userText = userTextField.getText();
			String name = nameTextField.getText();
			String age = ageTextField.getText();
			String address = addressTextField.getText();
			String gender =genderTextField.getSelectedItem().toString();
			String email = emailTextField.getText();
			String password = passwordField.getText();
			EmailValidator emailValidator = new EmailValidator();
			if(userText.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Username is missing");
			}
			else
			if(name.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Name is missing");
			}
			else
			if(age.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Age is missing");
			}
			else
			if(address.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Address is missing");
			}
			else
			if(email.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Email id  is missing");
			}
			else if(!emailValidator.validate(email.trim()))
			{
				JOptionPane.showMessageDialog(this, "Email id  Incorrect");
			}
			else
			if(password.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this, "Password is missing");
			}
			else{
			registrationdata r = new registrationdata();
			if(r.updateUserInfo(userText,name,age,address,gender,email,password)){
				r.insertloginInfo(userText,password);
				JOptionPane.showMessageDialog(this, "Registeration Successful");
				home h=new home();
                                h.setSize(1300,745);
                                h.setVisible(true);
                                this.setVisible(false);
				}
			else{
				JOptionPane.showMessageDialog(this, "user id already exists");
				}
			}
		}
	}
	public void keyPressed(KeyEvent evt)
        {
                String number=ageTextField.getText();
                int length=number.length();
               // String number1=price.getText();
               // int length1=number1.length();
                if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
                {
                        if(length<3)
                        {
                                ageTextField.setEditable(true);
                        }
                        else
                        {
                                ageTextField.setEditable(false);
                        }
                }
                else
                {
                        if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                        {
                                ageTextField.setEditable(true);
                        }
                        else
                        {
                                ageTextField.setEditable(false);

                        }
                }
	}
	public void keyReleased(KeyEvent e)
	{
	}
	public void keyTyped(KeyEvent ke)
	{
	}
}


