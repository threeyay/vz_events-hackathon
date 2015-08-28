package com.vz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionJava {
	static Connection con = null;
    static PreparedStatement st = null;
    static ResultSet rs = null;
	public static Connection getConnection()
	{
		try
		{
	String url = "jdbc:postgresql://localhost/Hack_vdsi";
    String user1 = "postgres";
    String password = "root";
    con = DriverManager.getConnection(url, user1, password);
//    st = con.createStatement();
    
		}
		catch(SQLException e)
		{
			
		}
		return con;
	}
}
