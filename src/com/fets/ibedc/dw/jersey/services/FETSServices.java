package com.fets.ibedc.dw.jersey.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.fets.ibedc.dw.jersey.responses.ServiceResponse;
import com.fets.ibedc.dw.service.ServicesImp;


@Path("/")
public class FETSServices   {
	
	
	public FETSServices()
	{}
	 
	
	@POST
    @Produces("application/json")
	@Path("ping")
    public ServiceResponse ping()
    {
		return new ServicesImp().ping();
    }
	
	
	@GET
    @Produces("application/json")
	@Path("getData")
    public ServiceResponse getData()
    {
		return new ServicesImp().getData();
    }
	
	
	@GET
    @Produces("application/json")
	@Path("closeData")
    public ServiceResponse closeData()
    {
		return new ServicesImp().closeData();
    }
	
	

}
