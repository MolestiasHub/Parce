package server;

import java.sql.*;

public class SqlGetter {
	public static String getemboi () {
			String url= "";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/base","root","Molly1888");   
			Statement stmt = con.createStatement();  
			ResultSet rs=stmt.executeQuery("select COUNT(*) from sources;") ;
			rs.next();
			int l =rs.getInt(1);
			l =1 + (int)(Math.random() * ((l - 1) + 1));
			rs=stmt.executeQuery("select * from sources where id =" + String.valueOf(l) );
			while(rs.next()) {
				url = rs.getString(2); 
			}
			con.close(); 
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}  
			
		
		return url;
		}
		
	}
