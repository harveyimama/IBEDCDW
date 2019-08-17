package com.fets.ibedc.dw.service;

import java.util.Vector;

import com.fets.ibedc.dw.jersey.responses.Data;
import com.fets.ibedc.dw.jersey.responses.ServiceResponse;

public class ServicesImp {

	

public ServiceResponse ping  ()
{
	ServiceResponse resp = new ServiceResponse();
	
	resp.setMessage("Success");
	resp.setResponseCode(0);
	resp.setSuccess(true);
	
	return resp;
}


public ServiceResponse getData  ()
{
	ServiceResponse resp = new ServiceResponse();
	
	try {
		Vector<Data> d = new DataBaseService().getData();
		
		if( d != null )
		{
			if (d.size() > 0)
			{
				resp.setMessage("Success");
				resp.setResponseCode(0);
				resp.setSuccess(true);
				resp.setData(d);
			}
			else
			{
				resp.setMessage("No Data");
				resp.setResponseCode(10);
				resp.setSuccess(false);
				
			}
		}
		else
		{
			resp.setMessage("Null Recieved");
			resp.setResponseCode(11);
			resp.setSuccess(false);
			
		}
	} catch (Exception e) {

		resp.setMessage("Error Recieved");
		resp.setResponseCode(1);
		resp.setSuccess(false);
		
		e.printStackTrace();
	}
	
	
	return resp;
}


public ServiceResponse closeData  ()
{
	ServiceResponse resp = new ServiceResponse();
	
	try {
	 new DataBaseService().closeData();
		
	
				resp.setMessage("Success");
				resp.setResponseCode(0);
				resp.setSuccess(true);
				resp.setData(d);
			
	} catch (Exception e) {

		resp.setMessage("Error Recieved");
		resp.setResponseCode(1);
		resp.setSuccess(false);
		
		e.printStackTrace();
	}
	
	return resp;

}





}
