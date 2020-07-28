//This code is written for displaying the data from the database in the table
import java.sql.*;
import java.util.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import javax.swing.border.*;
import java.sql.*;
public class TableDisplay extends JFrame 
{

    DefaultTableModel model = new DefaultTableModel();
    Container cnt = this.getContentPane();
  //  JTable table = new JTable(model)
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    JTable table;
    public TableDisplay(String query)
    {
        try {
            		String dburl="jdbc:mysql://localhost:3306/cloud";
			String uname="root";
			String pwd="Skg@123!";
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(dburl,uname,pwd);

                }catch(Exception e)
                {
                System.out.println(e);
                }



	try{
            		ps= cn.prepareStatement(query);
			rs=ps.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int coln = rsmd.getColumnCount();
			Vector<String> columnNames = new Vector<String>();

			for(int i=1;i<=coln;i++){
				columnNames.add(rsmd.getColumnName(i));
			}
			Vector<Vector<Object>> data = new Vector<Vector<Object>>();
           		while(rs.next())
			{
           			Vector<Object> vector = new Vector<Object>();
               		 for(int i=1;i<=coln;i++)
				{
               			 vector.add(rs.getObject(i));
            		        }
            		        data.add(vector);
            		}
            		table = new JTable(new DefaultTableModel(data,columnNames));
        	}
	catch(Exception e)
	{
            	System.out.println(e.getMessage());
       	}
        JScrollPane pg = new JScrollPane(table);
        cnt.add(pg);
        this.pack();
}
}

