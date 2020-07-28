import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paas extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel titleLabel = new JLabel("RV College of Engineering");
	JLabel q1Label = new JLabel("Autonomous Institution affiliated to Visvesvaraya Technological University, Belagavi");
	JLabel q2Label = new JLabel("Mysore Rd, RV Vidyaniketan, Post, Bengaluru, Karnataka 560059");
	JLabel q3Label = new JLabel("Department of Master of Computer Applications");
	JLabel q4Label = new JLabel("PLATFORM AS A SERVICE");
	JLabel q5Label = new JLabel("AWS Elastic Beanstalk, Windows Azure, Heroku, Force.com, Google App Engine, Apache Stratos, OpenShift");
	JLabel q6Label = new JLabel("Simple, cost-effective development and deployment of apps,Integrates web services and databases");
	JLabel q7Label = new JLabel("Data security. Organizations can run their own apps and services using PaaS solutions, but the");
	JLabel q8Label = new JLabel("data residing in third-party, vendor-controlled cloud servers poses security risks.");
	JLabel q9Label = new JLabel("There are many use cases for PaaS, including the following popular application-based ones:-");

	JLabel q10Label = new JLabel("API development and management:- You can use PaaS to develop, run, manage, and secure application");

	JLabel q11Label =new JLabel ("programming interfaces (APIs) and microservices.");

	JLabel q12Label = new JLabel("Internet of Things (IoT):- PaaS can support the broad range of application environments, programming");

	JLabel q13Label =new JLabel ("languages, and tools used for IoT deployments");

	JLabel q14Label = new JLabel("Business analytics/intelligence:- PaaS tools allow you to analyze your data to find business insights");

	JLabel q15Label =new JLabel ("that enable more informed business decisions and predictions");

	JLabel q16Label =new JLabel ("Cloud Storage Always Free usage limits:-");

	JLabel q17Label =new JLabel ("Resource");

	JLabel q19Label =new JLabel ("Standard Storage");
	JLabel q20Label =new JLabel ("Class A Operations");
	JLabel q21Label =new JLabel ("Class B Operations");

	JLabel q18Label =new JLabel ("Monthly Free Usage Limits");

	JLabel q22Label =new JLabel ("5 GB-months");
	JLabel q23Label =new JLabel ("Rs 5,000");
	JLabel q24Label =new JLabel ("Rs 50,000");


	JLabel fotLabel = new JLabel("MADE BY: SIDDHARTH SINGH RATHOUR,SONU KUMAR GAUTAM,ASHWINI KUMAR");
	JButton d1Button = new JButton("Register");
	JButton d2Button = new JButton("Back");
	ImageIcon img=new ImageIcon("cloudpic.jpg");

        JLabel background=new JLabel("",img,JLabel.CENTER);
	Paas() {
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
		titleLabel.setBounds(300,20,1300,60);

		q1Label.setBounds(350,70,1300,50);
		q2Label.setBounds(400,85,1300,50);
		q3Label.setFont(new Font("Courier New", Font.BOLD, 30));
		q3Label.setBounds(250,150,1300,50);

		q4Label.setFont(new Font("Courier New", Font.BOLD, 20));
		q4Label.setBounds(480,220,1300,50);

		q5Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q5Label.setBounds(160,250,1300,50);

		q6Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q6Label.setBounds(180,270,1300,50);

		q7Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q7Label.setBounds(160,290,1300,50);

		q8Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q8Label.setBounds(160,310,1300,50);

		q9Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q9Label.setBounds(160,330,1300,50);

		q10Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q10Label.setBounds(160,360,1300,50);

		q11Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q11Label.setBounds(160,380,1300,50);

		q12Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q12Label.setBounds(160,410,1300,50);

		q13Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q13Label.setBounds(160,430,1300,50);

		q14Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q14Label.setBounds(160,460,1300,50);

		q15Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q15Label.setBounds(160,480,1300,50);

		q16Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q16Label.setBounds(160,510,1300,50);

		q17Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q17Label.setBounds(160,530,1300,50);

		q18Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q18Label.setBounds(390,530,1300,50);

		q19Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q19Label.setBounds(160,550,1300,50);

		q20Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q20Label.setBounds(160,570,1300,50);

		q21Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q21Label.setBounds(160,590,1300,50);

		q22Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q22Label.setBounds(390,550,1300,50);

		q23Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q23Label.setBounds(390,570,1300,50);

		q24Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q24Label.setBounds(390,590,1300,50);


		fotLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		fotLabel.setBounds(420,670,1300,50);

		d1Button.setBounds(480,640,150,40);
		d2Button.setBounds(680,640,150,40);
		background.setBounds(0,0,1300,800);
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
		container.add(q11Label);

		container.add(q12Label);
		container.add(q13Label);

		container.add(q14Label);
		container.add(q15Label);

		container.add(q16Label);
		container.add(q17Label);
		container.add(q18Label);

		container.add(q19Label);
		container.add(q20Label);
		container.add(q21Label);

		container.add(q22Label);
		container.add(q23Label);
		container.add(q24Label);

		container.add(fotLabel);
		container.add(d1Button);
		container.add(d2Button);
		container.add(background);
	}
	public void addActionEvent()
	{
		d1Button.addActionListener(this);
		d2Button.addActionListener(this);
    	}
	public static void main(String[] args)
      {
    	  	Paas p1=new Paas();
      		p1.setSize(1300,800);
      		p1.setVisible(true);
      		p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == d1Button)
		{
			register2 r=new register2();
                        r.setSize(1300,745);
                        r.setVisible(true);
                        this.setVisible(false);
		}
		if(e.getSource()==d2Button)
		{
			dashboard d=new dashboard();
                        d.setSize(1300,745);
                        d.setVisible(true);
                        this.setVisible(false);
		}


	}

}
