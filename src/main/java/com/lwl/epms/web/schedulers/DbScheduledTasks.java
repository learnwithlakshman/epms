package com.lwl.epms.web.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;

import com.lwl.epms.repo.EmployeeRepo;

@EnableAsync
public class DbScheduledTasks {
	
	@Autowired
	private EmployeeRepo employeeRepo;
    @Async
    @Scheduled(cron = "0 */2 * * *")
    public void restoreDbData() throws InterruptedException {
    	this.employeeRepo.deleteAll();
    }
    
    
    
    
   

}