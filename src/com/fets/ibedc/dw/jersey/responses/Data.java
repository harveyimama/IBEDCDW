package com.fets.ibedc.dw.jersey.responses;

import java.util.Vector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




public class Data {
	
	private  Vector<Value> value;

	@XmlElement(name="value")
	public Vector<Value> getValue() {
		return value;
	}

	public void setValue(Vector<Value> value) {
		this.value = value;
	}

	
	

}
