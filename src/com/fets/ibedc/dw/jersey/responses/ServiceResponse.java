package com.fets.ibedc.dw.jersey.responses;

import java.util.Vector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="DWResponse")
@XmlType(propOrder = {"responseCode", "success","message","other","data"})

public class ServiceResponse
{
	private int responseCode;
	private boolean success;
	private String message;
	private String other;
	private  Data data;
	
	public ServiceResponse()
	{}

	@XmlElement(name="responseCode")
	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	@XmlElement(name="success")
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	@XmlElement(name="message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@XmlElement(name="other")
	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	@XmlElement(name="data")
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	
	
	
	
	
}
