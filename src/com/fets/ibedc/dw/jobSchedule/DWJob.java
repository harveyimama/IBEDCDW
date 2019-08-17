package com.fets.ibedc.dw.jobSchedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.fets.ibedc.dw.service.IBEDCService;

public class DWJob implements Job {

	@Override
    public void execute(final JobExecutionContext ctx)
            throws JobExecutionException {		

		IBEDCService  rest  = new  IBEDCService();
		rest.DoETL();
        
    }
}
