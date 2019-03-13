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
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.File;
import java.io.BufferedWriter;

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
			 FileWriter FileWriter = null;
		     File file = new File("C:\\Users\\chain\\OneDrive\\Documents\\GitHub\\A00432519_MCDA5510\\Assignment 2\\Output\\Output.txt");
		     FileWriter =new FileWriter(file,true);
		     FileWriter.flush();
		     
		     System.out.println("Select one from below");
		     FileWriter.append("Select one from below");
		     FileWriter.write("\r\n");
			 System.out.println("Select 1 for Inserting a transaction");
			 FileWriter.append("Select 1 for Inserting a transaction");
			 FileWriter.write("\r\n");
			 System.out.println("Select 2 for Updating the transaction");
			 FileWriter.append("Select 2 for Updating the transaction");
			 FileWriter.write("\r\n");
			 System.out.println("Select 3 for deleting the transaction");
			 FileWriter.append("Select 3 for deleting the transaction");
			 FileWriter.write("\r\n");
			 System.out.println("Select 4 for fetching a transaction details");
			 FileWriter.append("Select 4 for fetching a transaction details");
			 FileWriter.write("\r\n");
			 Scanner scanner = new Scanner(System.in); 
			 int input = scanner.nextInt();
			 FileWriter.append(Integer.toString(input));
			 FileWriter.append("\r\n");
			 switch(input)
			 {
			 case 1 :
				 System.out.println("Enter the transaction details below :- ");
				 FileWriter.append("Enter the transaction details below :-");
				 FileWriter.append("\r\n");
					System.out.println("Enter the transaction ID :- ");
					FileWriter.append("Enter the transaction ID :- ");
					FileWriter.append("\r\n");
					int itrxnid = scanner.nextInt();
					tr.setID(itrxnid);
					FileWriter.append(Integer.toString(itrxnid));
					 FileWriter.append("\r\n");
					 
					 System.out.println("Enter the Name On Card :- ");
					 FileWriter.append("Enter the Name On Card :-");
					 FileWriter.append("\r\n");
					 String cname = scanner.next();
					 tr.setNameOnCard(cname);
					 FileWriter.append(cname);
					 FileWriter.append("\r\n");
					 //scanner.nextLine();
					 
					 System.out.println("Select the type of card");
					 FileWriter.append("Select the type of card");
					 FileWriter.append("\r\n");
					 System.out.println("Select 1 for MasterCard");
					 FileWriter.append("Select 1 for MasterCard");
					 FileWriter.append("\r\n");
					 System.out.println("Select 2 for Visa");
					 FileWriter.append("Select 2 for Visa");
					 FileWriter.append("\r\n");
					 System.out.println("Select 3 for American Express");
					 FileWriter.append("Select 3 for American Express");
					 FileWriter.append("\r\n");
					 
					 int input1 = scanner.nextInt();
					 FileWriter.append(Integer.toString(input1));
					 FileWriter.append("\r\n");
					 
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
					 FileWriter.append("Enter the Card Number :-");
					 FileWriter.append("\r\n");
					 String cnumber = scanner.next();
					 FileWriter.append(cnumber);
					 FileWriter.append("\r\n");

					 tr.setCardNumber(cnumber);
					 
					 System.out.println("Enter the Unit Price in decimals :- ");
					 FileWriter.append("Enter the Unit Price in decimals :-");
					 FileWriter.append("\r\n");
					 double unitPrice = scanner.nextDouble();
					 tr.setUnitPrice(unitPrice);
					 FileWriter.append(Double.toString(unitPrice));
					 FileWriter.append("\r\n");
					 
					 System.out.println("Enter the Quantity in decimals :- ");
					 FileWriter.append("Enter the Quantity in decimals :-");
					 FileWriter.append("\r\n");
					 double quantity = scanner.nextDouble();
					 tr.setQuantity(quantity);
					 FileWriter.append(Double.toString(quantity));
					 FileWriter.append("\r\n");
				
					System.out.println("Enter the Expiry Date of Card in format MM/YYYY:- ");
					FileWriter.append("Enter the Expiry Date of Card in format MM/YYYY:-");
					FileWriter.append("\n");

					String expDate = scanner.next();
					FileWriter.append(expDate);
					 FileWriter.append("\r\n");
					tr.setExpDate(expDate);

					Boolean inserttrxns = dao.insertTransaction(connection,tr);

			 break;
			 
			 case 2 :
				 System.out.println("Enter the transaction id for which updation needs to be done");
				 FileWriter.append("Enter the transaction id for which updation needs to be done");
					int utrxnid = scanner.nextInt();
					tr.setID(utrxnid);
					FileWriter.append("\r\n");
					FileWriter.write(Integer.toString(utrxnid));
					 
					FileWriter.append("\r\n");
					 System.out.println("Enter the Name On Card to be updated :- ");
					 FileWriter.append("Enter the Name On Card to be updated :- ");
					 FileWriter.append("\r\n"); 
					 String ucname = scanner.next();
					 FileWriter.append(ucname);
					 FileWriter.append("\r\n");

					 tr.setNameOnCard(ucname);
		     Boolean updatetrxns = dao.updateTransaction(connection,tr);

			 break;
			 
			 case 3 : 
				 System.out.println("Enter the transaction id for which deletion needs to be done");
				 FileWriter.append("Enter the transaction id for which deletion needs to be done");
				 FileWriter.append("\r\n");
					int dtrxnid = scanner.nextInt();
					FileWriter.append(Integer.toString(dtrxnid));
					 FileWriter.append("\r\n");
					tr.setID(dtrxnid);
					Boolean deletetrxns = dao.deleteTransaction(connection,tr);

			 break;
			 
			 case 4 : Collection<Transaction> gettrxns = dao.getAllTransactions(connection);
			 System.out.println(gettrxns.toString());
			 break;

			 default : System.out.println("Invalid Option");
			 FileWriter.append("Invalid Option");
			 FileWriter.append("\r\n");
			 break;
			 }
			 FileWriter.flush();
			 FileWriter.close();
 
			 
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
}
}