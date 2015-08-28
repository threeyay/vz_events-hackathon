package com.vz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class eventList {
	static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    
	public static ResultSet GetEvents()
    {
		//int count=0;
		
    	try
    	{
    	//st = connectionJava.getConnection();
    	con=connectionJava.getConnection();
    	st = con.createStatement();
        rs = st.executeQuery("select * from events;");
       return rs; 
    } catch (SQLException ex) {
        //Logger lgr = Logger.getLogger(Version.class.getName());
        //lgr.log(Level.SEVERE, ex.getMessage(), ex);

    } 

      
    
    	return rs;
    }
//	
//	public static void main(String[] args)
//			{
//		int count=0;
//			ResultSet rs1 = GetEvents();
//			try {
//				while (rs.next())
//				{
//					count++;
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(""+count);
//			}
}
