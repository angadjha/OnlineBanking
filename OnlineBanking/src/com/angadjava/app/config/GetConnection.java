package com.angadjava.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.angadjava.app.database.DatabaseConfiguration;

public class GetConnection {
 private GetConnection(){
 }
 public static Connection connection;
 static {
	 try {
		Class.forName(DatabaseConfiguration.DRIVER);
		connection = DriverManager.getConnection(DatabaseConfiguration.CON_DRIVER, DatabaseConfiguration.USER, DatabaseConfiguration.PASSWORD);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
 }
 
 public static Connection getConnection(){
	return connection;
 }
 
 
}
