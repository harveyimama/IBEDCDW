package com.fets.ibedc.dw.jobSchedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TestJob implements Job {
	
	@Override
    public void execute(final JobExecutionContext ctx)
            throws JobExecutionException {
        System.out.println("do all apointed auto actions");

    }

}
