package com.fets.ibedc.dw.jersey.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




public class Value {
	
	private String  PaymentID,MeterNo,AccountNo,	Payment,PaymentDate,BusinessUnit;

	
	public Value(String paymentID, String meterNo, String accountNo, String payment, String paymentDate,
			String businessUnit) {
		
		PaymentID = paymentID;
		MeterNo = meterNo;
		AccountNo = accountNo;
		Payment = payment;
		PaymentDate = paymentDate;
		BusinessUnit = businessUnit;
	}


	@XmlElement(name="paymentID")
	public String getPaymentID() {
		return PaymentID;
	}


	public void setPaymentID(String paymentID) {
		PaymentID = paymentID;
	}

	@XmlElement(name="meterNo")
	public String getMeterNo() {
		return MeterNo;
	}


	public void setMeterNo(String meterNo) {
		MeterNo = meterNo;
	}

	@XmlElement(name="accountNo")
	public String getAccountNo() {
		return AccountNo;
	}


	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	@XmlElement(name="payment")
	public String getPayment() {
		return Payment;
	}


	public void setPayment(String payment) {
		Payment = payment;
	}

	@XmlElement(name="paymentDate")
	public String getPaymentDate() {
		return PaymentDate;
	}


	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}

	@XmlElement(name="businessUnit")
	public String getBusinessUnit() {
		return BusinessUnit;
	}


	public void setBusinessUnit(String businessUnit) {
		BusinessUnit = businessUnit;
	}
	
	
	

}
