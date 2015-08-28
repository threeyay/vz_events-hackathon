package com.vz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.vz.*;

public class loginCheck {
	static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;


    public static int login(userBean u)
    {
		int count=0;
		//int flag=0;
    	try
    	{
    	
        con = connectionJava.getConnection();
        st = con.createStatement(); 
        rs = st.executeQuery("select * from users where ufname='"+u.getUser()+"' and upass='"+u.getPass()+"'");
          // System.out.println(u.getUser());
        if(rs.next())
        {
        	   if (u.getUser().equals("admin"))
        		   count=2;
        	   else
        		   count=1;
          }
           //return count;
    } catch (SQLException ex) {
        //Logger lgr = Logger.getLogger(Version.class.getName());
        //lgr.log(Level.SEVERE, ex.getMessage(), ex);

    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            //Logger lgr = Logger.getLogger(Version.class.getName());
            //lgr.log(Level.WARNING, ex.getMessage(), ex);
        }
    }
		return count;
    }





//	select * from events where datetime < now();
}
