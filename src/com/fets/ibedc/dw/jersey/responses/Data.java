package com.fets.ibedc.dw.jersey.responses;

public class Data {
	
	private String  PaymentID,MeterNo,AccountNo,	Payment,PaymentDate,BusinessUnit;

	
	public Data(String paymentID, String meterNo, String accountNo, String payment, String paymentDate,
			String businessUnit) {
		
		PaymentID = paymentID;
		MeterNo = meterNo;
		AccountNo = accountNo;
		Payment = payment;
		PaymentDate = paymentDate;
		BusinessUnit = businessUnit;
	}


	public String getPaymentID() {
		return PaymentID;
	}


	public void setPaymentID(String paymentID) {
		PaymentID = paymentID;
	}


	public String getMeterNo() {
		return MeterNo;
	}


	public void setMeterNo(String meterNo) {
		MeterNo = meterNo;
	}


	public String getAccountNo() {
		return AccountNo;
	}


	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}


	public String getPayment() {
		return Payment;
	}


	public void setPayment(String payment) {
		Payment = payment;
	}


	public String getPaymentDate() {
		return PaymentDate;
	}


	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}


	public String getBusinessUnit() {
		return BusinessUnit;
	}


	public void setBusinessUnit(String businessUnit) {
		BusinessUnit = businessUnit;
	}
	
	
	

}
