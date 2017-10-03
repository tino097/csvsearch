package com.sivakov.csvsearcher;

import java.util.Arrays;

public class MyCSVRecord implements CSVRecord {

	private String[] record;

	@Override
	public String getField(String name) {
		int index = Arrays.asList(MyCSVSearch.headers).indexOf(name);
		return Arrays.asList(getRecord()).get(index);
	}

	public String[] getRecord() {
		return record;
	}

	public void setRecord(String[] record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return  Arrays.toString(record);
	}

}
