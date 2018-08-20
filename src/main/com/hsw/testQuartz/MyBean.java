package com.hsw.testQuartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hushuwei
 * @Type MyBean.java
 * @Desc
 * @date 2018/8/20 16:39
 */
public class MyBean {

    private static Logger logger = LoggerFactory.getLogger(MyBean.class);

    private String message;

    public void printMessage() {
        System.out.println("The message is " + message);
        logger.error("myBean is Running...");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
