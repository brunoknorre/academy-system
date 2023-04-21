package com.academy.enums;

public enum Status {

	ACTIVE("Active"),
	INACTIVE("Inactive"),
	SUSPENDED("Suspended"),
	CANCELED("Canceled");
	
	private String status;
	
	private Status(String status) {
		this.status = status;
	}
}
