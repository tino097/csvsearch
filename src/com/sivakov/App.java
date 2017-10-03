package com.sivakov;

import com.sivakov.csvsearcher.CSVSearch;
import com.sivakov.csvsearcher.MyCSVSearch;

public class App {

	public static void main(String[] args) {
		CSVSearch csvByName = new MyCSVSearch(
						"ip,name,desc\n" 
						+ "10.49.1.4,server1,Main Server\n" 
						+ "10.52.5.1,server2,Backup Server\n", "name");
		System.out.println(csvByName.find("server2").getField("ip")); 
																		
		System.out.println(csvByName.find("server9")); 
		
		System.out.println(csvByName.find("server1"));
	}

}
