//This code is written for connecting the registration table and login table of data base and performing opertions.
import java.sql.*;

public class registrationdata
{
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	public registrationdata()
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
	public boolean verify(String userid,String password)
	{
		try
		{
			ps= cn.prepareStatement("select username,password from  login where username=? and password= ?");
			ps.setString(1,userid);
			ps.setString(2,password);
			rs=ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			return false;
		}
		catch(Exception e){
			return false;
		}
	}
	public boolean updateUserInfo(String username, String name,String age,String address,String gender,String email,String Password){
		try
		{
			ps= cn.prepareStatement("insert into registration values(?,?,?,?,?,?,?)");
			ps.setString(1,username);
			ps.setString(2,name);
			ps.setString(3,age);
			ps.setString(4,address);
			ps.setString(5,gender);
			ps.setString(6,email);
			ps.setString(7,Password);
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
	 public boolean insertloginInfo(String username,String Password){
                try
                {
                        ps= cn.prepareStatement("insert into login values(?,?)");
                        ps.setString(1,username);
                        ps.setString(2,Password);
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


	public boolean deactivate(String username){
		try
		{
			ps= cn.prepareStatement("DELETE FROM registration WHERE username=?");
			ps.setString(1,username);
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
	public boolean deactivatelogin(String username){
                try
                {
                        ps= cn.prepareStatement("DELETE FROM login WHERE username=?");
                        ps.setString(1,username);
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
