package com.mcda5510.A00432519.connect;
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLJDBCConnection implements DBConnection{

	public Connection setupConnection()  {

		Connection connection = null;
		try {
			// This will load the MySQL driver, each DB has its own driver
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Setup the connection with the DB

			connection = DriverManager.getConnection("jdbc:mysql://localhost/javaassignment2?"+ "user=root&password=root" // Creds
					+ "&useSSL=false" // b/c localhost
					+ "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); // timezone

		} catch (Exception e) {
			System.out.println("Error setting up connection");
			e.printStackTrace();
		} finally {

		}
		return connection;
	}		
	
	
}
