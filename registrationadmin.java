//This code is written for connecting to the registration table and registration services table in the database for the admin.
import java.sql.*;

public class registrationadmin
{
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	int count=0;
	public registrationadmin()
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
	public boolean registration(String did, String dname,String age,String address,String gender,String email,String Password){
		try
		{
			ps= cn.prepareStatement("insert into registration values(?,?,?,?,?,?,?)");
			ps.setString(1,did);
			ps.setString(2,dname);
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
	public boolean loginadmin(String did,String Password){
                try
                {
                        ps= cn.prepareStatement("insert into login values(?,?)");
                        ps.setString(1,did);
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


	public boolean updateregistration(String did, String dname,String age,String address,String gender,String email,String Password){
		try
		{
			int x=dname.compareTo("");
			int y=age.compareTo("");
			int z=address.compareTo("");
			int w=gender.compareTo("");
			if((x!=0)&&(y!=0)&&(z!=0)&&(w!=0))
			{
				ps= cn.prepareStatement("update registration SET name=? ,age=?, address=? , gender=? WHERE username=?");
				ps.setString(1,dname);
				ps.setString(2,age);
				ps.setString(3,address);
				ps.setString(4,gender);
				ps.setString(5,did);
			}
			else
			if((x==0)&&(y!=0)&&(z!=0)&&(w==0))
			{
				ps= cn.prepareStatement("update registration SET age=?, address=? WHERE username=?");
				ps.setString(1,age);
				ps.setString(2,address);
				ps.setString(3,did);
				//ps.setString(2,dname);
			}
			else
			if((x!=0)&&(y==0)&&(z!=0)&&(w!=0))
			{
				ps= cn.prepareStatement("update registration SET name=? , address=?,gender=? WHERE username=?");
				ps.setString(1,dname);
				ps.setString(2,address);
				ps.setString(3,gender);
				ps.setString(4,did);
			}
			else
			if((x!=0)&&(y!=0)&&(z==0)&&(w!=0))
			{
				ps= cn.prepareStatement("update registration SET name=? ,age=?,gender=? WHERE username=?");
				ps.setString(1,dname);
				ps.setString(2,age);
				ps.setString(3,gender);
				ps.setString(4,did);
			}
			else
			if((x!=0)&&(y==0)&&(z==0)&&(w==0))
			{
				ps= cn.prepareStatement("update registration SET name=? WHERE username=?");
				ps.setString(1,dname);
				ps.setString(2,did);
			}
			else
			if((x==0)&&(y!=0)&&(z==0)&&(w==0))
			{
				ps= cn.prepareStatement("update registration SET age=?WHERE username=?");
				ps.setString(1,age);
				ps.setString(2,did);
				//ps.setString(4,hid);
			}
			else
			if((x==0)&&(y==0)&&(z!=0)&&(w==0))
			{
				ps= cn.prepareStatement("update registration SET address=? WHERE username=?");
				ps.setString(1,address);
				ps.setString(2,did);
				//ps.setString(2,dname);
				//ps.setString(3,cno);
			}
			if((x==0)&&(y==0)&&(z==0)&&(w!=0))
                        {
                                ps= cn.prepareStatement("update registration SET gender=? WHERE username=?");
                                ps.setString(1,gender);
                                ps.setString(2,did);
                                //ps.setString(2,dname);
                                //ps.setString(3,cno);
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
