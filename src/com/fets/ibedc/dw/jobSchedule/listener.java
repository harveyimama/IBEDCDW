package com.fets.ibedc.dw.jobSchedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
public class listener implements JobListener {
	
	public static final String LISTENER_NAME = "dummyJobListenerName";

	@Override
	public String getName() {
		return LISTENER_NAME; //must return a name
	}

	// Run this if job is about to be executed.
	@Override
	public void jobToBeExecuted(JobExecutionContext context) {

		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("jobToBeExecuted");
		System.out.println("Job : " + jobName + " is going to start...");

	}

	// No idea when will run this?
	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("jobExecutionVetoed");
	}

	//Run this after job has been executed
	@Override
	public void jobWasExecuted(JobExecutionContext context,
			JobExecutionException jobException) {
		System.out.println("jobWasExecuted");

		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " is finished...");

		

	}

}