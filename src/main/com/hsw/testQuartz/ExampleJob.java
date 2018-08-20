package com.hsw.testQuartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author hushuwei
 * @Type ExampleJob.java
 * @Desc
 * @date 2018/8/20 15:53
 */
public class ExampleJob extends QuartzJobBean {

    private int timeout;
    private static Logger logger = LoggerFactory.getLogger(ExampleJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("继承QuartzJobBean 的任务在执行中。。。");
        logger.error("task runing ...");
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
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
