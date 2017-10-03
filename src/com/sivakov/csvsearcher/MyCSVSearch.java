package com.sivakov.csvsearcher;

public class MyCSVSearch implements CSVSearch {

	public String[] rows;
	public static String[] headers;
	
	public MyCSVSearch(String text, String searchBy) {
		this.rows = text.split("\n");
		headers = rows[0].split(",");
	}

	@Override
	public CSVRecord find(String key) {
		MyCSVRecord record = new MyCSVRecord();
		for(String row : this.rows){
			if(row.contains(key)){
				record.setRecord(row.split(","));
			}
		}
	   return record;
	}

	
}
