package com.mcda5510.A00432519.dao;

/**
 * Original source code from 
 * http://www.vogella.com/tutorials/MySQLJava/article.html
 * 
**/

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.logging.SimpleFormatter;
import java.util.logging.Formatter;


import com.mcda5510.A00432519.entity.Transaction;


public class MySQLAccess {


	

	public Collection<Transaction> getAllTransactions(Connection connection) {
		Statement statement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = new ArrayList<Transaction>();

		Logger logger = Logger.getLogger("Main");
		Handler fileHandler=null;

			//fileHandler = new FileHandler("./sampleLogfile.log");
		try {
			//fileHandler = new FileHandler("./sampleLogfile.log");
			fileHandler = new FileHandler("C:\\Users\\chain\\OneDrive\\Documents\\GitHub\\A00432519_MCDA5510\\Assignment 2\\logs\\Logfile.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			logger.addHandler(fileHandler);
			// Assigning handlers to LOGGER object
			
			logger.addHandler(fileHandler);
			// Setting levels to handlers and LOGGER
			
			fileHandler.setLevel(Level.FINE);
			logger.setLevel(Level.ALL);
			
			 Formatter simpleFormatter = new SimpleFormatter();
			
			// Setting formatter to the handler
			fileHandler.setFormatter(simpleFormatter);
        
		// Result set get the result of the SQL query
		try {

			// Statements allow to issue SQL queries to the database
			System.out.println("Enter the transaction id");
			Scanner scanner = new Scanner(System.in); 
			 int trxnid = scanner.nextInt();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from javaassignment2.transaction where ID=" + trxnid);
			results = createTrxns(resultSet);
			

			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
			resultSet = null;
		}
		logger.log(Level.INFO, "Records have been fetched successfully !!"  );
		return results;
		
	}
    
	public boolean insertTransaction(Connection connection,Transaction trxn) {
		Statement statement = null;
		ResultSet resultSet = null;
		int resultset=0;
		Collection<Transaction> results = new ArrayList<Transaction>();
		
		Logger logger = Logger.getLogger("Main");
		Handler fileHandler=null;

			//fileHandler = new FileHandler("./sampleLogfile.log");
		try {
			//fileHandler = new FileHandler("./sampleLogfile.log");
			fileHandler = new FileHandler("C:\\Users\\chain\\OneDrive\\Documents\\GitHub\\A00432519_MCDA5510\\Assignment 2\\logs\\Logfile.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			logger.addHandler(fileHandler);
			// Assigning handlers to LOGGER object
			
			logger.addHandler(fileHandler);
			// Setting levels to handlers and LOGGER
			
			fileHandler.setLevel(Level.FINE);
			logger.setLevel(Level.ALL);
			
			 Formatter simpleFormatter = new SimpleFormatter();
			
			// Setting formatter to the handler
			fileHandler.setFormatter(simpleFormatter);
		// Result set get the result of the SQL query
		try {
			// Statements allow to issue SQL queries to the database
			if(String.valueOf(trxn.getID()) == null) {
				System.out.println("Value for ID field cannot be empty");
			}
			else if (trxn.getNameOnCard() == null) {
				System.out.println("Name on Card cannot be empty");
			}
			else if (trxn.getCardNumber() == null) {
				System.out.println("Card number cannot be empty");
			}
			else if (String.valueOf(trxn.getUnitPrice()) == null) {
				System.out.println("Unit Price cannot be empty");
			}
			else if (String.valueOf(trxn.getQuantity()) == null) {
				System.out.println("Quantity cannot be empty");
			}
			else if (String.valueOf(trxn.getExpDate()) == null) {
				System.out.println("Exp Date cannot be empty");
			}
			else if (trxn.getNameOnCard().contains("+") || trxn.getNameOnCard().contains(";") || trxn.getNameOnCard().contains(":") || trxn.getNameOnCard().contains("!") || trxn.getNameOnCard().contains("@") || trxn.getNameOnCard().contains("#") || trxn.getNameOnCard().contains("$") || trxn.getNameOnCard().contains("%") || trxn.getNameOnCard().contains("^") || trxn.getNameOnCard().contains("*") || trxn.getNameOnCard().contains("?") || trxn.getNameOnCard().contains("<") || trxn.getNameOnCard().contains(">")) {
				System.out.println("Name on Card conatins invalid characters");
			}
			else if (trxn.getCardNumber().contains("+") || trxn.getCardNumber().contains(";") || trxn.getCardNumber().contains(":") || trxn.getCardNumber().contains("!") || trxn.getCardNumber().contains("@") || trxn.getCardNumber().contains("#") || trxn.getCardNumber().contains("$") || trxn.getCardNumber().contains("%") || trxn.getCardNumber().contains("^") || trxn.getCardNumber().contains("*") || trxn.getCardNumber().contains("?") || trxn.getCardNumber().contains("<") || trxn.getCardNumber().contains(">")) {
				System.out.println("Name on Card conatins invalid characters");
			}
			else {
			 
			double totalPrice = trxn.getUnitPrice() * trxn.getQuantity();
		
		
			 //scanner.nextLine();
			 
			SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 Date date = new Date();
			 String createdOn = sdf.format(date);
			 System.out.println(createdOn);
			 //System.out.println("Enter the Name of Person creating the transaction :- ");
			 //String createdBy = scanner.nextLine();
			 String createdBy = System.getProperty("user.name");
			 
			 if(trxn.getCardType()=="MasterCard") {

			 if(trxn.getCardNumber().length()==16) {
				 System.out.println(trxn.getCardNumber().substring(0,2));
				 
				 
				 if(Integer.parseInt(trxn.getCardNumber().substring(0,2))>=51 && Integer.parseInt(trxn.getCardNumber().substring(0,2))<=55) {
					// System.out.println(trxn.getExpDate().substring(0,2));
					 if((trxn.getExpDate().substring(0,2).equals("01") || trxn.getExpDate().substring(0,2).equals("02") || trxn.getExpDate().substring(0,2).equals("03") || trxn.getExpDate().substring(0,2).equals("04") ||trxn.getExpDate().substring(0,2).equals("05") ||trxn.getExpDate().substring(0,2).equals("06") ||trxn.getExpDate().substring(0,2).equals("07") || trxn.getExpDate().substring(0,2).equals("08") ||trxn.getExpDate().substring(0,2).equals("09") || trxn.getExpDate().substring(0,2).equals("10") || trxn.getExpDate().substring(0,2).equals("11") || trxn.getExpDate().substring(0,2).equals("12")) && (Integer.parseInt(trxn.getExpDate().substring(3,7))>=2016 && Integer.parseInt(trxn.getExpDate().substring(3,7))<=2031)) {
						 System.out.println(trxn.getExpDate().substring(0,2));
						
						
					
							 System.out.println(trxn.getExpDate().substring(3,7));
							 statement = connection.createStatement();
						String sql = "insert into javaassignment2.transaction(ID,NameOnCard,CardNumber,UnitPrice,Quantity,TotalPrice,ExpDate,CreatedOn,CreatedBy,CardType) " + " values ('" + trxn.getID() + "','" + trxn.getNameOnCard() +"','"+ trxn.getCardNumber() + "','" + trxn.getUnitPrice() + "','" + trxn.getQuantity() + "','" +totalPrice +"','"+trxn.getExpDate()+ "','" + createdOn + "','" +createdBy + "','" + trxn.getCardType()+"')"; 
						System.out.println(sql);
						resultset= statement.executeUpdate(sql);
						
					
						 
						 if (resultset>0)
				            {
							 logger.log(Level.INFO, "Records inserted successfully !!"  );
				            	System.out.println("Record inserted Successfully!!");	
				            } 
					 
						 
					 }
					 else {
						 logger.log(Level.INFO, "Record insertion unsuccessful :: Date of the card should be in between 01/2016 to 12/2031!!"  );
						 System.out.println("Invalid Expiry Date : Date of the card should be in between 01/2016 to 12/2031");
					 }
				 
				 }
				 else {
					 logger.log(Level.INFO, "Record insertion unsuccessful :: Card number should have prefix between 51 and 55"  );
					 System.out.println("Invalid card number: Card number should have prefix between 51 and 55");
				 }
				 

			
			 }
			 else {
				 logger.log(Level.INFO, "Record insertion unsuccessful :: Length of Card Number should be 16 digits long"  );
				 System.out.println("Invalid card number: Length of Card Number should be 16 digits long");
			 }
			 }
			 else if(trxn.getCardType()=="Visa") {
				 if(trxn.getCardNumber().length()==16) {
					 
					 if(trxn.getCardNumber().substring(0,1)=="4") {
						 if((trxn.getExpDate().substring(0,2).equals("01") || trxn.getExpDate().substring(0,2).equals("02") || trxn.getExpDate().substring(0,2).equals("03") || trxn.getExpDate().substring(0,2).equals("04") ||trxn.getExpDate().substring(0,2).equals("05") ||trxn.getExpDate().substring(0,2).equals("06") ||trxn.getExpDate().substring(0,2).equals("07") || trxn.getExpDate().substring(0,2).equals("08") ||trxn.getExpDate().substring(0,2).equals("09") || trxn.getExpDate().substring(0,2).equals("10") || trxn.getExpDate().substring(0,2).equals("11") || trxn.getExpDate().substring(0,2).equals("12")) && (Integer.parseInt(trxn.getExpDate().substring(3,7))>=2016 && Integer.parseInt(trxn.getExpDate().substring(3,7))<=2031)) {
						 statement = connection.createStatement();
							String sql = "insert into javaassignment2.transaction(ID,NameOnCard,CardNumber,UnitPrice,Quantity,TotalPrice,ExpDate,CreatedOn,CreatedBy,CardType) " + " values ('" + trxn.getID() + "','" + trxn.getNameOnCard() +"','"+ trxn.getCardNumber() + "','" + trxn.getUnitPrice() + "','" + trxn.getQuantity() + "','" +totalPrice +"','"+trxn.getExpDate()+ "','" + createdOn + "','" +createdBy +"','" + trxn.getCardType() +"')"; 
							System.out.println(sql);
							resultset= statement.executeUpdate(sql);
						
							 
							 if (resultset>0)
					            {
								 logger.log(Level.INFO, "Records inserted successfully !!"  );
					            	System.out.println("Record inserted Successfully!!");	
					            } 
					 }
						 else {
							 logger.log(Level.INFO, "Record insertion unsuccessful :: Date of the card should be in between 01/2016 to 12/2031"  );
							 System.out.println("Invalid Expiry Date : Date of the card should be in between 01/2016 to 12/2031");
						 }
					 }
					 else {
						 logger.log(Level.INFO, "Record insertion unsuccessful :: Card number should start with 4"  );
						 System.out.println("Invalid card number. Card number should start with 4");
					 }
					 

				
				 } 
				 else {
					 logger.log(Level.INFO, "Record insertion unsuccessful :: Length of Card Number should be 16 digits long"  );
					 System.out.println("Invalid card number: Length of Card Number should be 16 digits long");
				 }
			 }
			 else if(trxn.getCardType()=="AmericanExpress") {
				 if(trxn.getCardNumber().length()==15) {
					 
					 if(trxn.getCardNumber().substring(0,2)=="34" || trxn.getCardNumber().substring(0,2)=="37" ) {
						 if((trxn.getExpDate().substring(0,2).equals("01") || trxn.getExpDate().substring(0,2).equals("02") || trxn.getExpDate().substring(0,2).equals("03") || trxn.getExpDate().substring(0,2).equals("04") ||trxn.getExpDate().substring(0,2).equals("05") ||trxn.getExpDate().substring(0,2).equals("06") ||trxn.getExpDate().substring(0,2).equals("07") || trxn.getExpDate().substring(0,2).equals("08") ||trxn.getExpDate().substring(0,2).equals("09") || trxn.getExpDate().substring(0,2).equals("10") || trxn.getExpDate().substring(0,2).equals("11") || trxn.getExpDate().substring(0,2).equals("12")) && (Integer.parseInt(trxn.getExpDate().substring(3,7))>=2016 && Integer.parseInt(trxn.getExpDate().substring(3,7))<=2031)) {
						 statement = connection.createStatement();
							String sql = "insert into javaassignment2.transaction(ID,NameOnCard,CardNumber,UnitPrice,Quantity,TotalPrice,ExpDate,CreatedOn,CreatedBy,CardType) " + " values ('" + trxn.getID() + "','" + trxn.getNameOnCard() +"','"+ trxn.getCardNumber() + "','" + trxn.getUnitPrice() + "','" + trxn.getQuantity() + "','" +totalPrice +"','"+trxn.getExpDate()+ "','" + createdOn + "','" +createdBy + "','" + trxn.getCardType()+"')"; 
							System.out.println(sql);
							resultset= statement.executeUpdate(sql);
						
							 
							 if (resultset>0)
					            {
								 logger.log(Level.INFO, "Records inserted successfully !!"  );
					            	System.out.println("Record inserted Successfully!!");	
					            } 
					 }
						 else {
							 logger.log(Level.INFO, "Records insertion unsuccessful :: Date of the card should be in between 01/2016 to 12/2031"  );
							 System.out.println("Invalid Expiry Date : Date of the card should be in between 01/2016 to 12/2031");
						 } 
					 }
					 else {
						 logger.log(Level.INFO, "Records insertion unsuccessful :: Card number should start with 34 or 37"  );
						 System.out.println("Invalid card number. Card number should start with 34 or 37");
					 }
					 

				
				 } 
				 else {
					 logger.log(Level.INFO, "Records insertion unsuccessful ::  Length of Card Number should be 15 digits long"  );
					 System.out.println("Invalid card number: Length of Card Number should be 15 digits long");
				 }
			 }
			 
			 else {
				 System.out.println("Record insertion Unsuccessful . Card Number should be 16 characters long");
			 }
			 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
			resultSet = null;
		}
		
		return true;
	
	}
	
	private Collection<Transaction> createTrxns(ResultSet resultSet) throws SQLException {
		Collection<Transaction> results = new ArrayList<Transaction>();

		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			Transaction trxn = new Transaction();
			trxn.setID(resultSet.getInt("ID"));
			trxn.setNameOnCard(resultSet.getString("NameOnCard"));
			trxn.setCardNumber(resultSet.getString("CardNumber"));
			trxn.setUnitPrice(resultSet.getDouble("UnitPrice"));
			trxn.setQuantity(resultSet.getDouble("Quantity"));
			trxn.setTotalPrice(resultSet.getString("TotalPrice"));
			trxn.setExpDate(resultSet.getString("ExpDate"));
			trxn.setCreatedOn(resultSet.getString("CreatedOn"));
			trxn.setCreatedBy(resultSet.getString("CreatedBy"));
			results.add(trxn);
		}

		return results;

	}

	
	
	public boolean deleteTransaction(Connection connection,Transaction trxn) {
		
		Statement statement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = new ArrayList<Transaction>();
		Logger logger = Logger.getLogger("Main");
		Handler fileHandler=null;

			//fileHandler = new FileHandler("./sampleLogfile.log");
		try {
			//fileHandler = new FileHandler("./sampleLogfile.log");
			fileHandler = new FileHandler("C:\\Users\\chain\\OneDrive\\Documents\\GitHub\\A00432519_MCDA5510\\Assignment 2\\logs\\Logfile.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			logger.addHandler(fileHandler);
			// Assigning handlers to LOGGER object
			
			logger.addHandler(fileHandler);
			// Setting levels to handlers and LOGGER
			
			fileHandler.setLevel(Level.FINE);
			logger.setLevel(Level.ALL);
			
			 Formatter simpleFormatter = new SimpleFormatter();
			
			// Setting formatter to the handler
			fileHandler.setFormatter(simpleFormatter);
		// Result set get the result of the SQL query
		try {
			// Statements allow to issue SQL queries to the database

			statement = connection.createStatement();
			String sql = "delete from javaassignment2.transaction where ID=" + trxn.getID() ;
			
			 System.out.println(sql);
			int resultset = statement.executeUpdate(sql);
	
			//resultSet = statement.executeQuery("select * from javaassignment2.transaction where ID=" + trxnid);
			//results = createTrxns(resultSet);
            if (resultset>0)
            { 
            	logger.log(Level.INFO, "Records deleted successfully !!"  );
            	System.out.println("Record deleted Successfully!!");	
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
			resultSet = null;
		}
		
		return true;
		
	}
	

	public boolean updateTransaction(Connection connection,Transaction trxn) {
		// DO the update SQL here
		Statement statement = null;
		ResultSet resultSet = null;
		Collection<Transaction> results = new ArrayList<Transaction>();
		
		Logger logger = Logger.getLogger("Main");
		Handler fileHandler=null;

			//fileHandler = new FileHandler("./sampleLogfile.log");
		try {
			//fileHandler = new FileHandler("./sampleLogfile.log");
			fileHandler = new FileHandler("C:\\Users\\chain\\OneDrive\\Documents\\GitHub\\A00432519_MCDA5510\\Assignment 2\\logs\\Logfile.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			logger.addHandler(fileHandler);
			// Assigning handlers to LOGGER object
			
			logger.addHandler(fileHandler);
			// Setting levels to handlers and LOGGER
			
			fileHandler.setLevel(Level.FINE);
			logger.setLevel(Level.ALL);
			
			 Formatter simpleFormatter = new SimpleFormatter();
			
			// Setting formatter to the handler
			fileHandler.setFormatter(simpleFormatter);
		// Result set get the result of the SQL query
		try {
			// Statements allow to issue SQL queries to the database

			statement = connection.createStatement();
			String sql = "update javaassignment2.transaction set NameOnCard = '" + trxn.getNameOnCard() + "' where ID = " + trxn.getID() ;
			
			 System.out.println(sql);
			int resultset = statement.executeUpdate(sql);
	
			//resultSet = statement.executeQuery("select * from javaassignment2.transaction where ID=" + trxnid);
			//results = createTrxns(resultSet);
            if (resultset>0)
            { 
            	logger.log(Level.INFO, "Records updated successfully !!"  );
            	System.out.println("Record updated Successfully!!");	
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			statement = null;
			resultSet = null;
		}
		
		return true;
	
		
	}

}
