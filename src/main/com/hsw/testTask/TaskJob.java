package com.hsw.testTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hushuwei
 * @Type TaskJob.java
 * @Desc
 * @date 2018/8/15 16:01
 */

public class TaskJob {
   private static Logger logger = LoggerFactory.getLogger(TaskJob.class);

    public void job1() {
        System.out.println("任务1进行中！。。。。");
        logger.error("task1 is running, this is a log");
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/15 hushuwei creat
 */
