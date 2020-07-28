//this code is for the 10 queries the query is written and the relevant data for the query is retrieved from the table in the database
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class query extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel titleLabel = new JLabel("Queries");
	JLabel q1Label = new JLabel("1.Display the detail of registered customer who has done the payment for Paas.");
	JLabel q2Label = new JLabel("2.Find the name,age,services,price,address of the customer who has registered in Saas.");
	JLabel q3Label = new JLabel("3.Find the detail of customer registered in Iaas.");
	JLabel q4Label = new JLabel("4.Count the number of customer registered in each services.");
	JLabel q5Label = new JLabel("5.Generate a report which will show the name of the customer along with their cloud services and their date of registration.");
	JLabel q6Label = new JLabel("6.List all the customer whose address is bangalore.");
	JLabel q7Label = new JLabel("7.List the details of the customer who are yet to register for any service.");
	JLabel q8Label = new JLabel("8.Display the detail of customer whose name starts with s and has Registered for service Saas");
	JLabel q9Label = new JLabel("9.Find the name and services of the user whose services price is more then 7000.");
	JLabel q10Label = new JLabel("10.List the detail of all the customer who registered for service after 2018");

	JLabel fotLabel = new JLabel("MADE BY: Ashwini Kumar,Siddharth Singh Rathore,Sonu Kumar Gautam");


	JButton d1Button = new JButton("Display");
	JButton d2Button = new JButton("Display");
	JButton d3Button = new JButton("Display");
	JButton d4Button = new JButton("Display");
	JButton d5Button = new JButton("Display");
	JButton d6Button = new JButton("Display");
	JButton d7Button = new JButton("Display");
	JButton d8Button = new JButton("Display");
	JButton d9Button = new JButton("Display");
	JButton d10Button = new JButton("Display");
	JButton backButton = new JButton("Back");

	ImageIcon img=new ImageIcon("cloud1.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);
	//ImageIcon logo=new ImageIcon("logo.png");
        //JLabel lo=new JLabel("",logo,JLabel.LEFT);

	query() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
	}
	public void setLayoutManager() {
	        container.setLayout(null);
	}


	public void setLocationAndSize() {
		titleLabel.setFont(new Font("Courier New", Font.BOLD, 50));
        	//tileLabel.setForeground(Color.cyan);
		titleLabel.setBounds(500,20,1300,50);
		q1Label.setBounds(10,80,1300,50);
		q2Label.setBounds(10,140,1300,50);
		q3Label.setBounds(10,200,1300,50);
		q4Label.setBounds(10,260,1300,50);
		q5Label.setBounds(10,320,1300,50);
		q6Label.setBounds(10,380,1300,50);
		q7Label.setBounds(10,440,1300,50);
		q8Label.setBounds(10,500,1300,50);
		q9Label.setBounds(10,560,1300,50);
		q10Label.setBounds(10,620,1300,50);
		fotLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		fotLabel.setBounds(480,730,1300,50);
		d1Button.setBounds(40,120,100,20);
		d2Button.setBounds(40,180,100,20);
		d3Button.setBounds(40,240,100,20);
		d4Button.setBounds(40,300,100,20);
		d5Button.setBounds(40,360,100,20);
		d6Button.setBounds(40,420,100,20);
		d7Button.setBounds(40,480,100,20);
		d8Button.setBounds(40,540,100,20);
		d9Button.setBounds(40,600,100,20);
		d10Button.setBounds(40,660,100,20);
		backButton.setBounds(40,720,100,20);
		background.setBounds(0,0,1300,800);
		//lo.setBounds(0,0,150,150);
	}

	public void addComponentsToContainer() {
		container.add(titleLabel);
		container.add(q1Label);
		container.add(q2Label);
		container.add(q3Label);
		container.add(q4Label);
		container.add(q5Label);
		container.add(q6Label);
		container.add(q7Label);
		container.add(q8Label);
		container.add(q9Label);
		container.add(q10Label);
		container.add(fotLabel);

		container.add(d1Button);
		container.add(d2Button);
		container.add(d3Button);
		container.add(d4Button);
		container.add(d5Button);
		container.add(d6Button);
		container.add(d7Button);
		container.add(d8Button);
		container.add(d9Button);
		container.add(d10Button);
		container.add(backButton);
		container.add(background);
		//container.add(lo);
	}

	public void addActionEvent() {
		d1Button.addActionListener(this);
		d2Button.addActionListener(this);
		d3Button.addActionListener(this);
		d4Button.addActionListener(this);
		d5Button.addActionListener(this);
		d6Button.addActionListener(this);
		d7Button.addActionListener(this);
		d8Button.addActionListener(this);
		d9Button.addActionListener(this);
		d10Button.addActionListener(this);
		backButton.addActionListener(this);
    	}

	public static void main(String[] args)
      {
      	query frame=new query();
      	frame.setSize(1300,1000);
      	frame.setVisible(true);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == d1Button)
		{
        		String qry= "select r.username,name,services,card_no from registration r natural join register_service r1 natural join payment p where services='Paas'";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Details of all the registered customer whose has done payment for Paas");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d2Button)
		{
        		String qry= "select r.name,r.age,services,price,r.address from register_service s, registration r where s.username=r.username and services='Saas'";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Detail of Customer registered for Saas");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d3Button)
		{
        		String qry= "select r.name,date_of_registration,services,price from register_service s,registration r where r.username=s.username and services='Iaas'";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Detail of customer registered for Iaas");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d4Button)
		{
        		String qry= " select services,count(services) as 'Total Registration' from register_service s,registration r where r.username=s.username group by services";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Counting the number of customer registered in each services");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d5Button)
		{
        		String qry= "select r.name,s.services,s.date_of_registration from registration r join register_service s on(r.username=s.username)";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Report of Customer with services");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d6Button)
		{
        		String qry= "select name,address from registration where address='bangalore'";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("customer whose address is bangalore");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d7Button)
		{
        		String qry= "select r.name,age,r.address from registration r where r.username not in(select username from register_service)";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Details of customer who are yet to be registered for any services");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d8Button)
		{
        		String qry= "select name,services,r.email_id,phone_number from register_service s natural join registration r where name like 's%' and services='Saas'";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("Detail of customer with name starting with s and services is Saas");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d9Button)
		{
        		String qry= "select r.name,s.services,price from register_service s natural join registration r where price>7000";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("detail of customer whose services price is greater then 7000");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == d10Button)
		{
        		String qry= "select * from register_service where year(date_of_registration)>2018";
					JFrame frame = new TableDisplay(qry);
       				frame.setTitle("customer registered for any service after the year 2018");
      					frame.setSize(800, 600);
       				frame.setLocationRelativeTo(null);
        				frame.setVisible(true);
      				        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		if (e.getSource() == backButton)
			{
        			adminhome h=new adminhome();
				h.setSize(1300,745);
				h.setVisible(true);
				this.setVisible(false);
			}

	}

}
