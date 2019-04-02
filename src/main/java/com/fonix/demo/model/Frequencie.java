package com.fonix.demo.model;

public class Frequencie {
	
	private String id;
	private String frequencies;
	
	public Frequencie() {
		super();
	}
	
	public Frequencie(String id, String frequencies) {
		super();
		this.id = id;
		this.frequencies = frequencies;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFrequencies() {
		return frequencies;
	}
	public void setFrequencies(String frequencies) {
		this.frequencies = frequencies;
	}
	
}
