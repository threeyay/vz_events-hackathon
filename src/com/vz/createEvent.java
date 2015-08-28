package com.vz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import com.vz.*;



public class createEvent {
	static Connection con = null;
    //static PreparedStatement st = null;
    static ResultSet rs = null;
    
    public static int newEvent(Event u)
    //public static int newEvent()
    {
    	int count=0;
    	try
    	{
    		con=connectionJava.getConnection();
    		PreparedStatement st=con.prepareStatement("insert into events values (?,?,?,?,?,?,?,?);");
    		
    		st.setInt(1, u.getEid());
    		st.setString(2, u.getEname());
    		st.setString(3, u.getDescription());
    		st.setInt(4, u.getMax());
    		st.setInt(5, u.getCount());
    		st.setString(6, u.getHostname());
    		st.setString(7, u.getCategory());
    		st.setString(8, u.getContact());
    		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed;
			try {
				parsed = format.parse(u.getDateTime());
				java.sql.Date sql = new java.sql.Date(parsed.getTime());
				//st.setDate(9,sql);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
    		
    		count=st.executeUpdate();
    		
//    		st.setInt(1, 4);
//    		st.setString(2, "harahara");
//    		st.setString(3, "its 4am");
//    		st.setInt(4, 50);
//    		st.setInt(5, 35);
//    		st.setString(6, "mata");
//    		st.setString(7, "pita");
//    		st.setString(8, "7283792");
//    		//st.setString(9, "2015-04-20 15:10:34");
//    		st.executeUpdate();
//    		count=1;
    	}
    	catch(SQLException ex)
    	{
    		System.out.println(ex.getMessage());
    	}
	
	return count;
	
    }
    
//    public static void main(String[] args)
//    {
//    	int flag = newEvent();
//    }
}
