package com.fets.ibedc.dw.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.fets.ibedc.dw.jersey.responses.ServiceResponse;
import com.fets.ibedc.dw.service.ServicesImp;



@WebService(
		portName = "DWPort",
        serviceName = "IBEDCServices",
        targetNamespace = "http://services.soap.mm.fets.com/",
		endpointInterface = "com.fets.ibedc.dw.soap.services.IBEDCServiceI")

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
use = SOAPBinding.Use.LITERAL,parameterStyle = SOAPBinding.ParameterStyle.BARE) 


public class IBEDCServices implements IBEDCServiceI
{
	public IBEDCServices()
	{}

	@WebMethod(operationName="ping") 
	@WebResult(name = "ping")
    public ServiceResponse ping(String name)
    {
		return new ServicesImp().ping();
    }
	

	@WebMethod(operationName="getData") 
	@WebResult(name = "getData")
    public ServiceResponse getData(String name)
    {
		return new ServicesImp().getData();
    }
	

	@WebMethod(operationName="closeData") 
	@WebResult(name = "closeData")
    public ServiceResponse closeData(String name)
    {
		return new ServicesImp().closeData();
    }

	

	
}
