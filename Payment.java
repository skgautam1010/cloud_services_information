import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.Document;
import java.awt.event.*;
import javax.swing.event.*;

public class Payment extends JFrame implements ActionListener,KeyListener,FocusListener
{
	public static String user;
    	Container container = getContentPane();
	ButtonGroup bg=new ButtonGroup();
	JLabel anoLabel = new JLabel("PAYMENT GATEWAY");
	JRadioButton r1=new JRadioButton("Debit Card");
	JRadioButton r2=new JRadioButton("Credit Card");
	JLabel nameLabel = new JLabel("Card No:");
	JLabel noLabel = new JLabel("Month/Year");
	JLabel hidLabel = new JLabel("CVV");
	JLabel greetinglabel=new JLabel("Username");
        JButton registerButton = new JButton("SUBMIT");
        JButton updateButton = new JButton("RESET");
        JButton backButton = new JButton("Back");
	JTextField usernamelabel=new JTextField();

	JTextField nameTextField = new JTextField();
//	nameTextField.setPlaceholder("Month/Year");

	JTextField noTextField = new JTextField();
//	noTextField.setText(""+y);
	JTextField hidTextField = new JTextField();
        ImageIcon img=new ImageIcon("cloud1.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);
	//Payment(String user)
	//{
	//	initComponents();
	//	usernamelabel.setText(user);
	//}

	Payment() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	anoLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        anoLabel.setForeground(Color.black);
	nameLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        nameLabel.setForeground(Color.black);
	noLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        noLabel.setForeground(Color.black);
	hidLabel.setFont(new Font("Courier New", Font.BOLD, 20));
	hidLabel.setForeground(Color.black);
	greetinglabel.setFont(new Font("Courier New",Font.BOLD,20));
	greetinglabel.setForeground(Color.black);
	usernamelabel.setFont(new Font("Courier New",Font.BOLD,20));
        usernamelabel.setForeground(Color.black);

	r1.setFont(new Font("Courier New", Font.BOLD, 20));
	r1.setForeground(Color.black);

	r2.setFont(new Font("Courier New", Font.BOLD, 20));
	r2.setForeground(Color.black);

	anoLabel.setBounds(540,80,300,30);
	r1.setBounds(450,140,180,30);
	r2.setBounds(640,140,180,30);
	greetinglabel.setBounds(480,220,180,30);
	usernamelabel.setBounds(640,220,180,30);
	nameLabel.setBounds(480,285,180,30);
        noLabel.setBounds(480,330,180,30);
	hidLabel.setBounds(480,375,180,30);

	nameTextField.setBounds(640,285,180,30);
        noTextField.setBounds(640,330,180,30);
	hidTextField.setBounds(640,375,180,30);

	registerButton.setBounds(500,465,281,40);
	updateButton.setBounds(500,530,281,40);
        backButton.setBounds(500,610,281,40);

	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {


        container.add(anoLabel);

	bg.add(r1);
	bg.add(r2);
//	container.add(bg);
	container.add(r1);
	container.add(r2);

	container.add(nameLabel);
	container.add(noLabel);
	container.add(hidLabel);
	container.add(greetinglabel);
	container.add(usernamelabel);

        container.add(nameTextField);
	container.add(noTextField);
	container.add(hidTextField);

	container.add(registerButton);
	container.add(updateButton);
	container.add(backButton);
	container.add(background);
	container.setFocusable(true);
    }
    public void addActionEvent() {
	registerButton.addActionListener(this);
	updateButton.addActionListener(this);
	backButton.addActionListener(this);
	noTextField.addFocusListener(this);
	nameTextField.addKeyListener(this);
	hidTextField.addKeyListener(this);
	//noTextField.addKeyListener(this);
    }
public static void main(String[] args)
    {
      Payment frame=new Payment();
      //Payment frame1=new Payment(user);
      //frame1.setVisible(true);
      frame.setSize(1300,745);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == backButton)
		{
        		dashboard ad=new dashboard();
			ad.setSize(1300,745);
			ad.setVisible(true);
			this.setVisible(false);
		}
		if (e.getSource() == registerButton)
		{
			String card_no = nameTextField.getText();
			String month = noTextField.getText();
			String cvv = hidTextField.getText();
			String username=usernamelabel.getText();
			registerpayment a = new registerpayment();
			if(username.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Username is missing");
                        }
                        else
                        if(card_no.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "Card number is missing");
                        }
                        else
                        if(month.compareTo("")==0)
                        {
                                JOptionPane.showMessageDialog(this, "month is missing");
                        }
			else
			if(cvv.compareTo("")==0)
			{
				JOptionPane.showMessageDialog(this,"Cvv is missing");
			}
			else
			{
			String name=JOptionPane.showInputDialog(this,"Enter THE OTP");
			if(a.registration(card_no,month,cvv,username)){
				JOptionPane.showMessageDialog(this, "Payment Successful");
				dashboard ad=new dashboard();
	                        ad.setSize(1300,745);
        	                ad.setVisible(true);
                	        this.setVisible(false);
				}
			else{
				JOptionPane.showMessageDialog(this, "Payment Failed");
				}
			}
		}
		if (e.getSource() == updateButton)
		{
			usernamelabel.setText("");
			nameTextField.setText("");
			noTextField.setText("");
			hidTextField.setText("");
		}
	}
	public void focusGained(FocusEvent evt)
	{
		if(noTextField.getText().equals("MM/YY"))
		{
			noTextField.setText("");
		}
			noTextField.setForeground(Color.RED);

	}
	public void focusLost(FocusEvent evt)
	{
		if(noTextField.getText().equals(""))
		{
			noTextField.setText("MM/YY");
		}
			noTextField.setForeground(Color.RED);
	}
	public void keyPressed(KeyEvent evt)
	{
		String number=nameTextField.getText();
		int length=number.length();
		String number1=hidTextField.getText();
                int length1=number1.length();
		//String number2=noTextField.getText();
		//int length2=number2.length();
		if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
		{
			if(length<16)
			{
				nameTextField.setEditable(true);
			}
			else
			{
				nameTextField.setEditable(false);
			}
		}
		else
		{
			if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
			{
				nameTextField.setEditable(true);
			}
			else
			{
				nameTextField.setEditable(false);

			}
		}
		if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
                {
                        if(length1<3)
                        {
                                hidTextField.setEditable(true);
                        }
                        else
                        {
                                hidTextField.setEditable(false);
                        }
                }
                else
                {
                        if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                        {
                                hidTextField.setEditable(true);
                        }
                        else
                        {
                                hidTextField.setEditable(false);

                        }
                }
		/*if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
                {
                        if(length2<5)
                        {
                                noTextField.setEditable(true);
                        }
                        else
                        {
                                noTextField.setEditable(false);
                        }
                }
                else
                {
                        if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                        {
                                noTextField.setEditable(true);
                        }
                        else
                        {
                                noTextField.setEditable(false);

                        }
                }*/


	}
	public void keyReleased(KeyEvent e)
	{
    	}
    	public void keyTyped(KeyEvent e)
	{
	}
}

