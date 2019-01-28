import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.BufferedWriter;
import java.io.FileWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Assignment1 {
	  static int Count_Error_Records =0;
	  static int Count_Correct_Records =0;

    public  void walk( String path ) {
         
    	final long startTime = System.currentTimeMillis();
        File root = new File( path );
        File[] list = root.listFiles();
        String line = null;
        Handler fileHandler = null;
        BufferedWriter output = null;
        FileWriter FileWriter = null;
        Formatter simpleFormatter = null;
        File file = new File("./Output/Output.csv");

    	Logger logger1 = Logger.getLogger("Main");
           
    	System.out.println("list of files is ::" + list);

        if (list == null) return;
        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
                System.out.println( "Dir:" + f.getAbsoluteFile() );
               
            }
            else {

                Reader in;
        		try {
  
        			System.out.println(f.getAbsoluteFile());
        			String Filepath = f.getAbsolutePath();
        			String[] date = Filepath.split("\\\\");
        			int count = date.length;
        			Filepath = date[date.length -4] +"/" + date[date.length -3] +"/"+ date[date.length -2];
        			System.out.println("Date for file is  ::" + Filepath);

        			in = new FileReader( f.getAbsoluteFile());//path

        			FileWriter =new FileWriter(file,true);
			    	
			    	// Assigning handlers to LOGGER object
					simpleFormatter = new SimpleFormatter();
					

                    
        			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        			for (CSVRecord record : records) {
        				System.out.println("Record length" + record.size());
        				
        				if(record.size()<10)
        				{
        					System.out.println("Record length" + record.size());
        					Count_Error_Records = Count_Error_Records + 1;
        				
    				}
        				else
        				{
        			    String First_name = record.get(0);
        			    String Last_name = record.get(1);
        			    String Street_Number = record.get(2);
        			    String Street = record.get(3);
        			    String City = record.get(4);
        			    String Province = record.get(5);
        			    String Postal_code = record.get(6);
        			    String Country = record.get(7);
        			    String Phone_number = record.get(8);
        			    String email_address = record.get(9);
        			   
        			  //  System.out.println(Column10.length());
        			     if (record.size()>10)
        			     {   
        			    	 String Column10 = record.get(10);
        			    	 System.out.println(Column10);
        			    	 if(Column10.length() !=0)
        			    	 {
         					Count_Error_Records = Count_Error_Records + 1;
        			    	 }
         					
         				}
        			     else {
        			    	 System.out.println("else part");
        			    	 System.out.println(f.getAbsoluteFile());
        			         if(First_name == null || Last_name ==null || Street_Number ==null || Street ==null || City ==null || Province ==null || Postal_code ==null || Country ==null || Phone_number ==null || email_address ==null)
        			         {
        			    		    	Count_Error_Records = Count_Error_Records + 1;
            			    }
        			        else if(First_name.isEmpty()== true || Last_name.isEmpty()==true || Street_Number.isEmpty()==true || Street.isEmpty()==true || City.isEmpty()==true || Province.isEmpty()==true || Postal_code.isEmpty()==true || Country.isEmpty()==true || Phone_number.isEmpty()==true || email_address.isEmpty()==true) 
        			        {
        			    
        			    	Count_Error_Records = Count_Error_Records + 1;
        			       }
        			    else {
        			    	if(record.getRecordNumber()==1)
        			    	{
        			    	continue;
        			    	}
        			    	else {
        		            
        		            FileWriter.append(Filepath+','+First_name +','+Last_name+','+ Street_Number+',' + Street+',' + City +','+ Province +',' + Postal_code +',' + Country +',' + Phone_number +','+email_address+"\n");
        		            FileWriter.flush();
        		            Count_Correct_Records = Count_Correct_Records + 1;
        			    	}
        			    }
        			}	
        			}
       			}

        		}
    		
        		 catch ( IOException e) {
        			e.printStackTrace();
        		}
        		
            }
        	
        }

		log(Count_Error_Records,Count_Correct_Records,startTime);

	   
		
    }
    public void header() {
    	
    	FileWriter FileWriter = null;
    	File file = new File("./Output/Output.csv");
    
    	try {
    	 FileWriter =new FileWriter(file,true);
    	 FileWriter.append("Date"+','+"First_name" +','+"Last_name"+','+ "Street_Number"+',' + "Street"+',' + "City" +','+ "Province" +',' + "Postal_code" +',' + "Country" +',' + "Phone_number" +','+"email_address"+"\n");
         FileWriter.close();
    	}
    	catch ( IOException e) {
			e.printStackTrace();
    }
    }
    
    public void log(int skipped_records, int correct_records,long startTime) {
    	Handler consoleHandler = null;

		Handler fileHandler = null;
		Formatter simpleFormatter = null;

		Logger logger = Logger.getLogger("Main");

		//final long startTime = System.currentTimeMillis();

		// Creating consoleHandler and fileHandler
		consoleHandler = new ConsoleHandler();
		try {
			//fileHandler = new FileHandler("./sampleLogfile.log");
			fileHandler = new FileHandler("./logs/Logfile.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Assigning handlers to LOGGER object
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
		// Setting levels to handlers and LOGGER
		consoleHandler.setLevel(Level.ALL);
		fileHandler.setLevel(Level.FINE);
		logger.setLevel(Level.ALL);
		
		simpleFormatter = new SimpleFormatter();
		
		// Setting formatter to the handler
		fileHandler.setFormatter(simpleFormatter);
		
			logger.log(Level.INFO, "Total Number Of Skipped rows " + skipped_records);
			logger.log(Level.INFO, "Total Number Of Skipped rows " + correct_records);
		
		
		
		
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) + " ms");
		logger.log(Level.INFO, "Total execution time: " + (endTime - startTime) + " ms");
		logger.removeHandler(fileHandler);
		fileHandler.close();

    	
    }
    
    public static void main(String[] args) {
    	Assignment1 fw = new Assignment1();
    	fw.header();
        fw.walk("C:\\My Folder\\SMU\\Assignments\\Software Development\\Sample Data\\Sample Data" );
         
    }

}