package com.hsw.testTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author hushuwei
 * @Type TaskJob2.java
 * @Desc
 * @date 2018/8/20 15:03
 */

@Component
public class TaskJob2 {

   private static  Logger logger = LoggerFactory.getLogger(TaskJob2.class);

    @Scheduled(cron = "*/10 * * * * ?")
    public void testJob(){
        System.out.println("注解任务进行中！。。。。");
        logger.error("task2 is running, this is a log");
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/20 hushuwei creat
 */
