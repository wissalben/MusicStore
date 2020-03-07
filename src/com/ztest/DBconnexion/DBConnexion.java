package com.ztest.DBconnexion;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnexion {
	private Connection connect = null;
	public PreparedStatement preparedStatement = null;
	
	private ResultSet resultSet = null;
	
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String DB_CONNECTION = "jdbc:mysql://localhost:3306/project"; 
	private static String DB_USER = "root";
	
	private static String DB_PASSWORD = "";
	
	
	private static Connection getDBConnection() {
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
	public void connect() {
		connect = DBConnexion.getDBConnection();
	}
	public boolean prepareStatement(String query){
		try {
			preparedStatement = connect.prepareStatement(query);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
