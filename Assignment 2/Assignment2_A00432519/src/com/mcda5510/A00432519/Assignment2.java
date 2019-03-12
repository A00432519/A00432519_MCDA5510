package com.mcda5510.A00432519;

import java.sql.Connection;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

import com.mcda5510.A00432519.entity.Transaction;
import com.mcda5510.A00432519.connect.MySQLJDBCConnection;
import com.mcda5510.A00432519.dao.MySQLAccess;


public class Assignment2 {

	public static Connection single_instance;

	public static Connection getInstance() {
		if (single_instance == null) {
			MySQLJDBCConnection dbConnection = new MySQLJDBCConnection();
			single_instance = dbConnection.setupConnection();
		}

		return single_instance;
	}
	

	
	public static void main(String[] args) {
		MySQLAccess dao = new MySQLAccess();
		try {
			 Connection connection = getInstance();
			 Transaction tr = new Transaction();

			 System.out.println("Select one from below");
			 System.out.println("Select 1 for Inserting a transaction");
			 System.out.println("Select 2 for Updating the transaction");
			 System.out.println("Select 3 for deleting the transaction");
			 System.out.println("Select 4 for fetching a transaction details");
			 Scanner scanner = new Scanner(System.in); 
			 int input = scanner.nextInt();
			 switch(input)
			 {
			 case 1 :
				 System.out.println("Enter the transaction details below :- ");
					System.out.println("Enter the transaction ID :- ");
					int itrxnid = scanner.nextInt();
					tr.setID(itrxnid);
					 
					 System.out.println("Enter the Name On Card :- ");
					 String cname = scanner.next();
					 tr.setNameOnCard(cname);
					 //scanner.nextLine();
					 
					 System.out.println("Select the type of card");
					 System.out.println("Select 1 for MasterCard");
					 System.out.println("Select 2 for Visa");
					 System.out.println("Select 3 for American Express");
					 
					 int input1 = scanner.nextInt();
					 
					 if(input1 ==1)
					 {
					 tr.setCardType("MasterCard");
					 }
					 else if (input1 ==2) {
				     tr.setCardType("Visa"); 
					 }
					 else if (input1 ==3) {
					 tr.setCardType("AmericanExpress"); 
					}
					 System.out.println("Enter the Card Number :- ");
					 String cnumber = scanner.next();

					 tr.setCardNumber(cnumber);
					 
					 System.out.println("Enter the Unit Price in decimals :- ");
					 double unitPrice = scanner.nextDouble();
					 tr.setUnitPrice(unitPrice);
					 
					 System.out.println("Enter the Quantity in decimals :- ");
					 double quantity = scanner.nextDouble();
					 tr.setQuantity(quantity);
					 
				
					System.out.println("Enter the Expiry Date of Card in format MM/YYYY:- ");
					 //String expDate = scanner.nextLine();
					String expDate = scanner.next();
					tr.setExpDate(expDate);
					 //scanner.nextLine();
					Boolean inserttrxns = dao.insertTransaction(connection,tr);
			 //System.out.println("Below Record Inserted");
			 //System.out.println(inserttrxns.toString());
			 break;
			 
			 case 2 :
				 System.out.println("Enter the transaction id for which updation needs to be done");
					int utrxnid = scanner.nextInt();
					tr.setID(utrxnid);
					 
					 System.out.println("Enter the Name On Card to be updated :- ");
					 String ucname = scanner.next();
					 //String cname= trxn.getNameOnCard();
					 //scanner.nextLine();
					 tr.setNameOnCard(ucname);
		     Boolean updatetrxns = dao.updateTransaction(connection,tr);
			 //System.out.println("Below Record is the updated record");
			 //System.out.println(updatetrxns.toString());
			 break;
			 
			 case 3 : 
				 System.out.println("Enter the transaction id for which deletion needs to be done");
					int dtrxnid = scanner.nextInt();
					tr.setID(dtrxnid);
					Boolean deletetrxns = dao.deleteTransaction(connection,tr);
			 //System.out.println("Below Record is the updated record");
			 //System.out.println(deletetrxns.toString());
			 break;
			 
			 case 4 : Collection<Transaction> gettrxns = dao.getAllTransactions(connection);
			 System.out.println(gettrxns.toString());
			 break;

			 default : System.out.println("Invalid Option");
			 break;
			 }

			 
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
}
}