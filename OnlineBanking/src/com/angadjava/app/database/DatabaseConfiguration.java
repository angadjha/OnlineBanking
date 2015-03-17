package com.angadjava.app.database;

public interface DatabaseConfiguration {

	public static final String DRIVER ="com.mysql.jdbc.Driver";
	//public static final String CON_DRIVER = "jdbc:mysql://[host][:port]"
	public static final String DATABASE_NAME = "angadjavabank";
	public static final String CON_DRIVER = "jdbc:mysql://localhost:3306/"+DATABASE_NAME;
	public static final String USER = "root";
	public static final String PASSWORD="trumin!123"; 

}
