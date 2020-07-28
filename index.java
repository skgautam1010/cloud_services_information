import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index extends JFrame implements ActionListener {
	Container container = getContentPane();
	JLabel titleLabel = new JLabel("RV College of Engineering");
	JLabel q1Label = new JLabel("Autonomous Institution affiliated to Visvesvaraya Technological University, Belagavi");
	JLabel q2Label = new JLabel("Mysore Rd, RV Vidyaniketan, Post, Bengaluru, Karnataka 560059");
	JLabel q3Label = new JLabel("Department of Master of Computer Applications");
	JLabel q4Label = new JLabel("Domain - CLOUD COMPUTING");
	JLabel q5Label = new JLabel("The aim of this project is to provide information to client or customer about different");
	JLabel q6Label = new JLabel("types of cloud services available and give them knowledge of those services and guide ");
	JLabel q7Label = new JLabel("them when they use these services.we will also tell customer about the cost for using");
	JLabel q8Label = new JLabel("different cloud services.the customer can use our site to register for different services");
	JLabel q9Label = new JLabel("available and complete their work.");
	JLabel fotLabel = new JLabel("DEVELOPED BY: Ashwini,Siddharth,Sonu,2nd Semester");


	JButton d1Button = new JButton("NEXT");

	ImageIcon img=new ImageIcon("cloudpic.jpg");
        JLabel background=new JLabel("",img,JLabel.CENTER);

	index() {
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
		titleLabel.setBounds(300,20,1300,60);

		q1Label.setBounds(350,70,1300,50);

		q2Label.setBounds(400,85,1300,50);

		q3Label.setFont(new Font("Courier New", Font.BOLD, 30));
		q3Label.setBounds(280,150,1300,50);

		q4Label.setFont(new Font("Courier New", Font.BOLD, 20));
		q4Label.setBounds(480,220,1300,50);

		q5Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q5Label.setBounds(280,300,1300,50);

		q6Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q6Label.setBounds(280,330,1300,50);

		q7Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q7Label.setBounds(280,360,1300,50);

		q8Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q8Label.setBounds(280,390,1300,50);

		q9Label.setFont(new Font("Courier New", Font.BOLD, 18));
		q9Label.setBounds(280,420,1300,50);
		fotLabel.setFont(new Font("Courier New", Font.BOLD, 15));
		fotLabel.setBounds(420,670,1300,50);

		d1Button.setBounds(550,545,150,40);

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

		container.add(fotLabel);

		container.add(d1Button);


		container.add(background);

	}

	public void addActionEvent() {
		d1Button.addActionListener(this);

    	}

	public static void main(String[] args)
      {
      	index frame=new index();
      	frame.setSize(1300,800);
      	frame.setVisible(true);
      	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == d1Button)
		{
        		home h=new home();
			h.setSize(1300,745);
			h.setVisible(true);
			this.setVisible(false);
		}

	}

}
