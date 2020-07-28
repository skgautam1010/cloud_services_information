import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class register1 extends JFrame implements ActionListener,KeyListener,FocusListener
{

    	Container container = getContentPane();
	JLabel userLabel = new JLabel("Username");
	JLabel nameLabel = new JLabel("Register Date");
	JLabel ageLabel = new JLabel("Phone No");
	//JLabel datelabel=new JLabel("YYYY-MM-DD");


	JLabel service1 = new JLabel("Services");
  	String service[]={"Select","Iaas"};
    	JComboBox cb=new JComboBox(service);
	JLabel price1 = new JLabel("Price");
	String service2[]={"Select","6000","6999","7546","8000","10000"};
	JComboBox price=new JComboBox(service2);



	//JLabel addressLabel = new JLabel("");
	//JLabel genderLabel = new JLabel("");
	JLabel emailLabel = new JLabel("Duration");
	//JLabel passwordLabel = new JLabel("Pay");
        JButton registerButton = new JButton("Pay");
        JButton backButton = new JButton("Back");
	JTextField userTextField = new JTextField();
	JTextField nameTextField = new JTextField();
	JTextField ageTextField = new JTextField();
	//JTextField genderTextField = new JTextField();
	JTextField emailTextField = new JTextField();
	//JTextField addressTextField = new JTextField();
        //JPasswordField passwordField = new JPasswordField();
//	JCheckBox showPassword = new JCheckBox("Show Password");
	JButton resetButton = new JButton("Reset");
	JButton updateButton=new JButton("Update");
	//JButton payButton=new JButton("Pay");
        ImageIcon img=new ImageIcon("Cloud.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);


    register1() {
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
	//datelabel.setFont(new Font("Courier New", Font.BOLD, 15));
        //datelabel.setForeground(Color.cyan);


	service1.setFont(new Font("Courier New", Font.BOLD, 15));
        service1.setForeground(Color.cyan);

	price1.setFont(new Font("Courier New", Font.BOLD, 15));
        price1.setForeground(Color.cyan);


	//addressLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        //addressLabel.setForeground(Color.cyan);
	//genderLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        //genderLabel.setForeground(Color.cyan);
        emailLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        emailLabel.setForeground(Color.cyan);
	//passwordLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        //passwordLabel.setForeground(Color.cyan);

	userLabel.setBounds(490,185,100,30);
	nameLabel.setBounds(490,230,150,30);
        ageLabel.setBounds(490,275,100,30);
        service1.setBounds(490,330,100,30);
        cb.setBounds(600,330,180,30);

        price1.setBounds(490,390,100,30);
        price.setBounds(600,390,180,30);


	//addressLabel.setBounds(500,320,100,30);
	//genderLabel.setBounds(500,365,100,30);
        emailLabel.setBounds(490,450,100,30);
        //passwordLabel.setBounds(500,450,100,30);

	userTextField.setBounds(600,185,180,30);
	nameTextField.setBounds(600,230,180,30);
	//datelabel.setBounds(790,230,180,30);
        ageTextField.setBounds(600,275,180,30);
	//addressTextField.setBounds(600,320,180,30);
	//genderTextField.setBounds(600,365,180,30);
	emailTextField.setBounds(600,450,180,30);
        //passwordField.setBounds(600,450,180,30);
	//payButton.setBounds(100,550,281,40);
	registerButton.setBounds(500,550,281,40);
        backButton.setBounds(500,640,281,40);
	resetButton.setBounds(900,550,281,40);
	updateButton.setBounds(100,550,281,40);

//	showPassword.setBounds(600, 490, 150, 30);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {

        container.add(userLabel);
        container.add(nameLabel);
	container.add(ageLabel);
	container.add(service1);
	container.add(cb);
	container.add(price1);
	container.add(price);

	//container.add(addressLabel);
	//container.add(genderLabel);
	container.add(emailLabel);
	//container.add(passwordLabel);
	container.add(userTextField);
        container.add(nameTextField);
	//container.add(datelabel);
	container.add(ageTextField);
	//container.add(addressTextField);
	//container.add(genderTextField);
	container.add(emailTextField);
	//container.add(passwordField);
	container.add(registerButton);
	container.add(backButton);
	container.add(background);
	//container.add(payButton);
	container.add(resetButton);
	container.add(updateButton);
    }

    public void addActionEvent() {
	registerButton.addActionListener(this);
	backButton.addActionListener(this);
//	showPassword.addActionListener(this);
	resetButton.addActionListener(this);
	//payButton.addActionListener(this);
	ageTextField.addKeyListener(this);
	updateButton.addActionListener(this);
	//price.addKeyListener(this);
	nameTextField.addFocusListener(this);
    }




public static void main(String[] args)
    {
      register1 frame=new register1();
      frame.setSize(1300,745);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == backButton)
		{
        		dashboard d=new dashboard();
			d.setSize(1300,745);
			d.setVisible(true);
			this.setVisible(false);
		}

		if (e.getSource() == resetButton)
 		{
            		userTextField.setText("");
            		nameTextField.setText("");
			ageTextField.setText("");
            		//addressTextField.setText("");
			//genderTextField.setText("");
			emailTextField.setText("");
			//price.setText("");
            		//passwordField.setText("");
        	}
		if(e.getSource()==updateButton)
		{
			String did = userTextField.getText();
                        String name = nameTextField.getText();
                        String phone = ageTextField.getText();
                        String service = cb.getSelectedItem().toString();
                        String pricing = price.getSelectedItem().toString();
                        String email= emailTextField.getText();
                        registerservice d = new registerservice();
			if(did.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Username is missing");
                        }
                        else
                        if(name.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Date Of registration is missing");
                        }
			else
			{
                        if(d.updateregistration(did,name,phone,service,pricing,email)){
                                JOptionPane.showMessageDialog(this, "Update Successful");
				dashboard ad=new dashboard();
	                        ad.setSize(1300,745);
        	                ad.setVisible(true);
                	        this.setVisible(false);
			}
                        else{
                                JOptionPane.showMessageDialog(this, "Unsuccessful updation");
                                }
			}
		}

		if (e.getSource() == registerButton)
		{
			String did = userTextField.getText();
                        String name = nameTextField.getText();
                        String phone = ageTextField.getText();
                        String service = cb.getSelectedItem().toString();
                        String pricing= price.getSelectedItem().toString();
                        String email = emailTextField.getText();
                        registerservice r = new registerservice();
			if(did.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Username is missing");
                        }
                        else
                        if(name.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Date Of registration is missing");
                        }
                        else
                        if(phone.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "phone number is missing");
                        }
                        /*else
                        if(pricing.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "price is missing");
                        }*/
                        else
                        if(email.compareTo("")==0)
                        {
				 JOptionPane.showMessageDialog(this, "Duration is missing");
                        }
			else
			{
			  if(r.registration(did,name,phone,service,pricing,email)){
                               JOptionPane.showMessageDialog(this, "Data Saved Successful");
				//new Payment(did).setVisible(true);
				Payment ad=new Payment();
	                        ad.setSize(1300,745);
        	                ad.setVisible(true);
                	        this.setVisible(false);

                                }
                          else{
                                JOptionPane.showMessageDialog(this, "Data Could not be saved!!");
                                }
			}
		}
	}
	public void keyPressed(KeyEvent evt)
	{
		String number=ageTextField.getText();
		int length=number.length();
		//String number1=price.getText();
		//int length1=number1.length();
		if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
		{
			if(length<10)
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
		/*if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
                {
                       price.setEditable(true);
                }
                else
                {
                        if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                        {
                               price.setEditable(true);
                        }
                        else
                        {
                                price.setEditable(false);

                        }
                }*/

	}
	public void keyReleased(KeyEvent e)
	{
    	}
    	public void keyTyped(KeyEvent e)
	{
    	}
	public void focusGained(FocusEvent evt)
        {
                if(nameTextField.getText().equals("YYYY-MM-DD"))
                {
                        nameTextField.setText("");
                }
                        nameTextField.setForeground(Color.RED);

        }
        public void focusLost(FocusEvent evt)
        {
                if(nameTextField.getText().equals(""))
                {
                        nameTextField.setText("YYYY-MM-DD");
                }
                        nameTextField.setForeground(Color.RED);
        }

}


