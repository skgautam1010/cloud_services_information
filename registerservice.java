//This code is written to connect with the register_service table in the database when the user will choose the services and if they update there services then this code will help to 
store the data in the database.
import java.sql.*;

public class registerservice
{
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	int count=0;
	public registerservice()
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
	public boolean registration(String did, String name,String phone,String services,String price,String email){
		try
		{
			ps= cn.prepareStatement("insert into register_service values(?,?,?,?,?,?)");
			ps.setString(1,did);
			ps.setString(2,name);
			ps.setString(3,phone);
			ps.setString(4,services);
			ps.setString(5,price);
			ps.setString(6,email);
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

	public boolean updateregistration(String did, String name,String phone,String services,String price,String email){
		try
		{
			int x=name.compareTo("");
			int y=phone.compareTo("");
			int z=services.compareTo("");
			int w=price.compareTo("");
			int m=email.compareTo("");
			if((x!=0)&&(y!=0)&&(z!=0)&&(w!=0)&&(m!=0))
			{
				ps= cn.prepareStatement("update register_service SET date_of_registration=? ,phone_number=?, services=? , price=?,duration=? WHERE username=?");
				ps.setString(1,name);
				ps.setString(2,phone);
				ps.setString(3,services);
				ps.setString(4,price);
				ps.setString(5,email);
				ps.setString(6,did);
			}
			else
			if((x==0)&&(y!=0)&&(z!=0)&&(w==0)&&(m==0))
			{
				ps= cn.prepareStatement("update register_service SET phone_number=?, services=? WHERE username=?");
				ps.setString(1,phone);
				ps.setString(2,services);
				ps.setString(3,did);
				//ps.setString(2,dname);
			}
			else
			if((x!=0)&&(y!=0)&&(z==0)&&(w==0)&&(m!=0))
			{
				ps= cn.prepareStatement("update register_service SET date_of_registration=? , phone_number=?,duration=? WHERE username=?");
				ps.setString(1,name);
				ps.setString(2,phone);
				ps.setString(3,email);
				ps.setString(4,did);
			}
			else
			if((x==0)&&(y==0)&&(z==0)&&(w!=0)&&(m==0))
			{
				ps= cn.prepareStatement("update register_service SET price=?  WHERE username=?");
				ps.setString(1,price);
				ps.setString(2,did);
			}
			else
			if((x!=0)&&(y==0)&&(z==0)&&(w==0)&&(m==0))
			{
				ps= cn.prepareStatement("update register_service SET date_of_registration=? WHERE username=?");
				ps.setString(1,name);
				ps.setString(2,did);
			}
			else
			if((x==0)&&(y!=0)&&(z==0)&&(w==0)&&(m==0))
			{
				ps= cn.prepareStatement("update register_service SET phone_number=?WHERE username=?");
				ps.setString(1,phone);
				ps.setString(2,did);
				//ps.setString(4,hid);
			}
			else
			if((x==0)&&(y==0)&&(z!=0)&&(w==0)&&(m==0))
			{
				ps= cn.prepareStatement("update register_service SET services=? WHERE username=?");
				ps.setString(1,services);
				ps.setString(2,did);
			}
			if((x==0)&&(y==0)&&(z==0)&&(w==0)&&(m!=0))
                        {
                                ps= cn.prepareStatement("update register_service SET duration=? WHERE username=?");
                                ps.setString(1,email);
                                ps.setString(2,did);
                        }

			int i= ps.executeUpdate();
			if(i>0)
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
