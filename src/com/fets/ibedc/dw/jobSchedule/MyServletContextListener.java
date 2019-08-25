package com.fets.ibedc.dw.jobSchedule;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.DateBuilder.*;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

public class MyServletContextListener 
               implements ServletContextListener{
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContextListener destroyed");
	}

        //Run this before web application is started
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Starting The Application");
		try{
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		JobKey jobKey = new JobKey("job1", "group1");
		//long ctime = System.currentTimeMillis();
		JobDetail job = newJob(DWJob.class)
			    .withIdentity(jobKey)
			    .build();

			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = newTrigger()
					.startNow()
			    .withIdentity("trigger1", "group1")
			    //.withSchedule(dailyAtHourAndMinute(17, 47))
			    .withSchedule(simpleSchedule()
				.withIntervalInMinutes(20)
				.repeatForever()) 
			    .forJob("job1", "group1")
			    .build();
		
		 
		
		
		scheduler.getListenerManager().addJobListener(
	    		new listener(), KeyMatcher.keyEquals(jobKey)
	    	);
		scheduler.start();
    	scheduler.scheduleJob(job, trigger);
    	
		}catch (Exception e) {
		System.out.println(e);
		}	
	}
}