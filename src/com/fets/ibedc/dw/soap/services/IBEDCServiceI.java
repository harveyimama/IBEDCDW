package com.fets.ibedc.dw.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.fets.ibedc.dw.jersey.responses.ServiceResponse;


@WebService( targetNamespace = "http://services.soap.mm.fets.com/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
use = SOAPBinding.Use.LITERAL,parameterStyle = SOAPBinding.ParameterStyle.BARE) 
public interface IBEDCServiceI
{

	@WebMethod
	public ServiceResponse ping(@WebParam(name="ping",partName="ping",targetNamespace = "http://services.soap.mm.fets.com/") String name);

	@WebMethod
	public ServiceResponse getData(@WebParam(name="getData",partName="getData",targetNamespace = "http://services.soap.mm.fets.com/") String name);
	

	@WebMethod
	public ServiceResponse closeData(@WebParam(name="closeData",partName="closeData",targetNamespace = "http://services.soap.mm.fets.com/") String name);
}
