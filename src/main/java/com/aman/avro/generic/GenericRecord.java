/**
 * 
 */
package com.aman.avro.generic;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecordBuilder;

/**
 * @author amanb
 *
 */
public class GenericRecord {

	  
  public static void main(String[] args) {
		
	//Step 0 Create a schema
	
	  Schema.Parser parser= new Schema.Parser();
	  Schema schema=parser.parse("{\r\n" + 
	  		"    \"type\":\"record\",\r\n" + 
	  		"    \"namespace\":\"com.aman\",\r\n" + 
	  		"    \"name\":\"\",\r\n" + 
	  		"    \"doc\":\"\",\r\n" + 
	  		"    \"fields\":[\r\n" + 
	  		"        {\"name\":\"first_name\",\"type\":\"string\", \"doc\":\"First Name of the customer\"},\r\n" + 
	  		"        {\"name\":\"last_name\",\"type\":\"string\", \"doc\":\"Last Name of the customer\"},\r\n" + 
	  		"        {\"name\":\"age\",\"type\":\"int\", \"doc\":\"Age of the customer\"},\r\n" + 
	  		"        {\"name\":\"height\",\"type\":\"float\", \"doc\":\"Height in cms\"},\r\n" + 
	  		"        {\"name\":\"weight\",\"type\":\"float\", \"doc\":\"Weight in kgs\"},\r\n" + 
	  		"        {\"name\":\"automated_email\",\"type\":\"boolean\",\"default\":\"true\",\"doc\":\"true if user subscribes\"}\r\n" + 
	  		"    ] \r\n" + 
	  		"}");
	
	
	 //Step 1 Create a Generic record
	  
	  GenericRecordBuilder gtm= new GenericRecordBuilder(schema);
	  gtm.set("first_name", "Aman");
	  gtm.set("last_name", "Bains");
	  gtm.set("age", 35);
	  gtm.set("height", 175f);
	  gtm.set("weight",80f);
	  gtm.set("automated_email", false);
	 
	  GenericData.Record customer=gtm.build();
	  
	  System.out.println(customer);
	 //Step 2 Write it to a file
	  
	  
	  
	
	//Step 3 Read it form a file 
	
	// Step4 Read the Generic record 
 }
}