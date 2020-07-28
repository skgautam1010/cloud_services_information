import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deldocregister extends JFrame implements ActionListener {

    Container container = getContentPane();
	JLabel didLabel = new JLabel("Username");
        JButton registerButton = new JButton("Delete");
        JButton backButton = new JButton("Back");

	JTextField didTextField = new JTextField();


        ImageIcon img=new ImageIcon("Cloud.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);


    deldocregister() {
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

	didLabel.setBounds(500,300,100,30);
	didTextField.setBounds(600,300,180,30);
	registerButton.setBounds(500,380,281,40);
        backButton.setBounds(500,440,281,40);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {

        container.add(didLabel);

	container.add(didTextField);

	container.add(registerButton);
	container.add(backButton);
	container.add(background);
    }

    public void addActionEvent() {
	registerButton.addActionListener(this);
	backButton.addActionListener(this);
    }




public static void main(String[] args)
    {
      deldocregister frame=new deldocregister();
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


		if (e.getSource() == registerButton)
		{
			String did = didTextField.getText();
			registrationdata d = new registrationdata();
			if(d.deactivate(did)){
				JOptionPane.showMessageDialog(this, "Removal Successful");
				d.deactivatelogin(did);
	                        adminhome ad=new adminhome();
        	                ad.setSize(1300,745);
                	        ad.setVisible(true);
                        	this.setVisible(false);

				}
			else{
				JOptionPane.showMessageDialog(this, "No Such Customer in System");
				}
		}
	}

}


