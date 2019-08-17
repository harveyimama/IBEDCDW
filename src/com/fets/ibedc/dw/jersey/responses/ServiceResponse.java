package com.fets.ibedc.dw.jersey.responses;

import java.util.Vector;

public class ServiceResponse
{
	private int responseCode;
	private boolean success;
	private String message;
	private String other;
	private  Vector<Data> data;
	
	public ServiceResponse()
	{}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Vector<Data> getData() {
		return data;
	}

	public void setData(Vector<Data> data) {
		this.data = data;
	}

	
	
	
	
	
}
