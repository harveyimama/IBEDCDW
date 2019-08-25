package com.fets.ibedc.dw.jersey.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.fets.ibedc.dw.jersey.responses.ServiceResponse;
import com.fets.ibedc.dw.service.ServicesImp;
import com.fets.ibedc.dw.soap.services.IBEDCServiceI;
import com.fets.mm.soap.services.FetsServiceI;


@Path("/")
public class FETSServices  implements IBEDCServiceI  {
	
	
	public FETSServices()
	{}
	 
	
	@GET
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
