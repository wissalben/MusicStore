package com.ztest.DBconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// TODO (later) use connections pool
	
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String DB_CONNECTION = "jdbc:mysql://localhost:3306/project"; 
	private static String DB_USER = "root";
	
	private static String DB_PASSWORD = "";
	
	
	public static Connection getDBConnection() {
		Connection dbConnection = null;
		
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;

	}
	
	
}
