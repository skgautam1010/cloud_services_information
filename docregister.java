import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class docregister extends JFrame implements ActionListener {

    Container container = getContentPane();
	JLabel didLabel = new JLabel("User name");
	JLabel nameLabel = new JLabel("Name");
	JLabel spLabel = new JLabel("Age");
	JLabel hidLabel = new JLabel("Address");
	JLabel genLabel = new JLabel("Gender");
	JLabel emailLabel = new JLabel("Email");
	JLabel passLabel = new JLabel("Password");
        JButton registerButton = new JButton("Register");
        JButton backButton = new JButton("Back");

	JTextField didTextField = new JTextField();
	JTextField nameTextField = new JTextField();
	JTextField spTextField = new JTextField();
	JTextField hidTextField = new JTextField();
	JTextField genTextField = new JTextField();
	JTextField emailTextField = new JTextField();
	JTextField passTextField = new JTextField();

	JButton updateButton = new JButton("Update");

        ImageIcon img=new ImageIcon("Cloud.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);


    docregister() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	didLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        didLabel.setForeground(Color.cyan);
	nameLabel.setFont(new Font("Courier New", Font.BOLD, 11));
        nameLabel.setForeground(Color.cyan);
	spLabel.setFont(new Font("Courier New", Font.BOLD, 11));
        spLabel.setForeground(Color.cyan);
	hidLabel.setFont(new Font("Courier New", Font.BOLD, 15));
	hidLabel.setForeground(Color.cyan);
	genLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        genLabel.setForeground(Color.cyan);
	emailLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        emailLabel.setForeground(Color.cyan);
	passLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        passLabel.setForeground(Color.cyan);

	didLabel.setBounds(500,165,100,30);
	nameLabel.setBounds(500,210,100,30);
        spLabel.setBounds(500,255,100,30);
	hidLabel.setBounds(500,300,100,30);
	genLabel.setBounds(500,355,100,30);
	emailLabel.setBounds(500,405,100,30);
	passLabel.setBounds(500,460,100,30);

	didTextField.setBounds(600,165,180,30);
	nameTextField.setBounds(600,210,180,30);
        spTextField.setBounds(600,255,180,30);
	hidTextField.setBounds(600,300,180,30);
	genTextField.setBounds(600,355,180,30);
	emailTextField.setBounds(600,405,180,30);
	passTextField.setBounds(600,460,180,30);

	registerButton.setBounds(500,520,281,40);
        backButton.setBounds(500,580,281,40);
	updateButton.setBounds(500,640,281,40);

	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {

        container.add(didLabel);
        container.add(nameLabel);
	container.add(spLabel);
	container.add(hidLabel);
	container.add(genLabel);
	container.add(emailLabel);
	container.add(passLabel);

	container.add(didTextField);
        container.add(nameTextField);
	container.add(spTextField);
	container.add(hidTextField);
	container.add(genTextField);
	container.add(emailTextField);
	container.add(passTextField);

	container.add(registerButton);
	container.add(backButton);
	container.add(background);
	container.add(updateButton);
	
    }

    public void addActionEvent() {
	
	registerButton.addActionListener(this);
	backButton.addActionListener(this);
	updateButton.addActionListener(this);
        
    }




public static void main(String[] args) 
    {
      docregister frame=new docregister();
      frame.setSize(1300,745);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == backButton)
		{
        		adminhome ad=new adminhome();
			ad.setSize(1300,745);
			ad.setVisible(true);
			this.setVisible(false);
		}

		if (e.getSource() == updateButton)
 		{
 			String did = didTextField.getText();
			String dname = nameTextField.getText();
			String age = spTextField.getText();
			String address = hidTextField.getText();
			String gender = genTextField.getText();
			String email= emailTextField.getText();
			String password = passTextField.getText();
			registrationadmin d = new registrationadmin();
            		if(d.updateregistration(did,dname,age,address,gender,email,password)){
				JOptionPane.showMessageDialog(this, "Update Successful");
				adminhome ad=new adminhome();
        	                ad.setSize(1300,745);
	                        ad.setVisible(true);
                	        this.setVisible(false);

				}
			else{
				JOptionPane.showMessageDialog(this, "No such customer exists in system");
				}
			/*adminhome ad=new adminhome();
			ad.setSize(1300,745);
			ad.setVisible(true);
			this.setVisible(false);*/
        	}

		if (e.getSource() == registerButton)
		{
			String did = didTextField.getText();
			String dname = nameTextField.getText();
			String age = spTextField.getText();
			String address = hidTextField.getText();
			String gender = genTextField.getText();
			String email = emailTextField.getText();
			String password = passTextField.getText();
			registrationadmin a = new registrationadmin();
			if(a.registration(did,dname,age,address,gender,email,password)){
				JOptionPane.showMessageDialog(this, "Registeration Successful");
				a.loginadmin(did,password);
				adminhome ad=new adminhome();
	                        ad.setSize(1300,745);
        	                ad.setVisible(true);
                	        this.setVisible(false);

				}
			else{
				JOptionPane.showMessageDialog(this, "Registeration Unsuccessful");
				}
			/*adminhome ad=new adminhome();
			ad.setSize(1300,745);
			ad.setVisible(true);
			this.setVisible(false);*/
		}
	}

}

    

