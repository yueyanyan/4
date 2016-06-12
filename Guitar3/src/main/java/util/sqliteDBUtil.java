package util;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class sqliteDBUtil {
	static String url="jdbc:sqlite:/G:/GuitarV2Demo/GuitarV2Demo/db/aa.db";
	static Connection conn=null;
	public static java.sql.Connection getConnection(){
		
		try{
			Class.forName("org.sqlite.JDBC");	
			conn=(Connection) DriverManager.getConnection(url);
		}catch(ClassNotFoundException e){
			
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return (java.sql.Connection) conn;
	}
	public void closeConnection(java.sql.Connection conn2) throws SQLException{
		if(conn2!=null){
			conn2.close();
		}
	}
}