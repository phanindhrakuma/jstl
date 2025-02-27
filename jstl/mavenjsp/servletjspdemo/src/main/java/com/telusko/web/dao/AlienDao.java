package com.telusko.web.dao;

import java.sql.*;
import com.telusko.web.model.Alien;

public class AlienDao 
{
	
	
	public Alien getAlien(int userid)
	{
		Alien a = new Alien();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","PanduPanduPandu@123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where userid=" + userid);
			if(rs.next())
			{
				a.setUserid(rs.getInt("userid"));
				a.setUserName(rs.getString("userName"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return a;
	}
	
}