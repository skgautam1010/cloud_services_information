import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton docButton = new JButton("IaaS");
    JButton deldocButton = new JButton("PaaS");
    JButton disdocButton = new JButton("Saas");
    JButton disupdateButton = new JButton("Register/Update");
    JButton logoutButton = new JButton("Logout");
    JLabel welLabel = new JLabel("Welcome USER!! Choose Your Preffered Service.");
    ImageIcon img=new ImageIcon("Cloud.jpg");
    JLabel background=new JLabel("",img,JLabel.CENTER);


    dashboard() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	welLabel.setFont(new Font("Courier New", Font.BOLD, 70));
        welLabel.setForeground(Color.cyan);
	welLabel.setBounds(420,200,500,100);
	docButton.setBounds(250,300,250,50);
	disdocButton.setBounds(550,300,250,50);
	deldocButton.setBounds(850,300,250,50);
	disupdateButton.setBounds(550,450,250,50);
	logoutButton.setBounds(550,600,250,50);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {
        container.add(docButton);
        container.add(deldocButton);
	container.add(logoutButton);
	container.add(background);
        container.add(disdocButton);
	container.add(disupdateButton);
    }

    public void addActionEvent() {
        logoutButton.addActionListener(this);
	docButton.addActionListener(this);
	disdocButton.addActionListener(this);
	deldocButton.addActionListener(this);
	disupdateButton.addActionListener(this);
    }




public static void main(String[] args) 
    {
        dashboard frame=new dashboard();
        frame.setSize(1300,745);
      	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) 
	{
	if (e.getSource() == logoutButton)
		{
			JOptionPane.showMessageDialog(this, "Logout Successful");
        		home h=new home();
			h.setSize(1300,745);
			h.setVisible(true);
			this.setVisible(false);
		}

	if (e.getSource() == docButton)
		{
        		Iaas i=new Iaas();
			i.setSize(1300,745);
			i.setVisible(true);
			this.setVisible(false);
		}
	if (e.getSource() == deldocButton)
		{
        		Paas p=new Paas();
			p.setSize(1300,745);
			p.setVisible(true);
			this.setVisible(false);
		}
	if (e.getSource() == disdocButton)
		{
        		Saas s = new Saas();
			s.setSize(1300,745);
			s.setVisible(true);
			this.setVisible(false);
		}
	if(e.getSource()== disupdateButton)
		{
		register r=new register();
		r.setSize(1300,745);
		r.setVisible(true);
		this.setVisible(false);
		}

	}
}


