//This code is written to connect with the payment table in the database when the customer makes payment for the cloud services this will help to send the information to the database.
import java.sql.*;

public class registerpayment
{
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	int count=0;
	public registerpayment()
	{
		try
		{
			String dburl="jdbc:mysql://localhost:3306/cloud";
			String uname="root";
			String pwd="Skg@123!";
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(dburl,uname,pwd);
		}catch(Exception e)
		{
		System.out.println(e);
		}
	}
	public boolean registration(String card_no,String month,String cvv,String username){
		try
		{
			ps= cn.prepareStatement("insert into payment values(?,?,?,?)");
			ps.setString(1,card_no);
			ps.setString(2,month);
			ps.setString(3,cvv);
			ps.setString(4,username);
			int i= ps.executeUpdate();
			if(i==1)
			{
				return true;
			}
			return false;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
	
}
