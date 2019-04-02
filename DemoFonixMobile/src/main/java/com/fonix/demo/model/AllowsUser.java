package com.fonix.demo.model;

public class AllowsUser {

	private String emailAddress;
	private String fOrigine;
	private String flightDestination;
	private String frequencies;
	private String token;
	private String description;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getfOrigine() {
		return fOrigine;
	}

	public void setfOrigine(String fOrigine) {
		this.fOrigine = fOrigine;
	}

	public String getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	public String getFrequencies() {
		return frequencies;
	}

	public void setFrequencies(String frequencies) {
		this.frequencies = frequencies;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public AllowsUser() {}

	public AllowsUser(String emailAddress, String fOrigine, String flightDestination, String frequencies) {
		super();
		this.emailAddress = emailAddress;
		this.fOrigine = fOrigine;
		this.flightDestination = flightDestination;
		this.frequencies = frequencies;
	}
	
}
