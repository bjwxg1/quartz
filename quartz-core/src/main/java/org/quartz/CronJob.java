package org.quartz;

public class CronJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("this is a cron job, this time:"+ System.currentTimeMillis());
    }
}
