import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminhome extends JFrame implements ActionListener {

    Container container = getContentPane();
    JButton docButton = new JButton("Register/Update Customer");
    JButton deldocButton = new JButton("Delete Customer Record");
    JButton disdocButton = new JButton("Display Registered Record");
    JButton disregButton =new JButton("Display Services Record");
    JButton discardButton=new JButton("Display Card Detail");
    JButton queryButton = new JButton("Queries");
    JButton logoutButton = new JButton("Logout");
    JLabel welLabel = new JLabel("Welcome ADMIN");
    ImageIcon img=new ImageIcon("Cloud.jpg");
    JLabel background=new JLabel("",img,JLabel.CENTER);


    adminhome() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
	welLabel.setFont(new Font("Courier New", Font.BOLD, 50));
        welLabel.setForeground(Color.black);
	welLabel.setBounds(420,70,500,100);
	docButton.setBounds(250,450,250,50);
	disdocButton.setBounds(250,300,250,50);
	deldocButton.setBounds(550,450,250,50);
	discardButton.setBounds(850,300,250,50);
	queryButton.setBounds(850,450,250,50);
	disregButton.setBounds(550,300,250,50);
	logoutButton.setBounds(550,600,250,50);
	background.setBounds(0,0,1300,710);

    }

    public void addComponentsToContainer() {
        container.add(docButton);
        container.add(deldocButton);
	container.add(logoutButton);
	container.add(background);
        container.add(disdocButton);
	container.add(queryButton);
	container.add(disregButton);
	container.add(discardButton);
    }

    public void addActionEvent() {
        logoutButton.addActionListener(this);
	docButton.addActionListener(this);
	disdocButton.addActionListener(this);
	deldocButton.addActionListener(this);
    	queryButton.addActionListener(this);
	disregButton.addActionListener(this);
	discardButton.addActionListener(this);
    }




public static void main(String[] args) 
    {
        adminhome frame=new adminhome();
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
        		docregister dr=new docregister();
			dr.setSize(1300,745);
			dr.setVisible(true);
			this.setVisible(false);
		}
	if (e.getSource() == deldocButton)
		{
        		deldocregister hr=new deldocregister();
			hr.setSize(1300,745);
			hr.setVisible(true);
			this.setVisible(false);
		}
	if (e.getSource() == disdocButton)
		{
        		String qry= "SELECT * FROM registration";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Displaying all registered customer");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	if(e.getSource() == discardButton)
	{
		String qry= "SELECT * from payment";
                JFrame frame = new TableDisplay(qry);
                frame.setTitle("Displaying  card detail of customer who made payment");
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	if (e.getSource() == disregButton)
                {
                        String qry= "SELECT * FROM register_service";
                                        JFrame frame = new TableDisplay(qry);
                                frame.setTitle("Displaying records of customer with the choosen service");
                                        frame.setSize(800, 600);
                                frame.setLocationRelativeTo(null);
                                        frame.setVisible(true);
                                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }

	if (e.getSource() == queryButton)
		{
        		query qr=new query();
			qr.setSize(1300,820);
			qr.setVisible(true);
			this.setVisible(false);
		}
	}

}


