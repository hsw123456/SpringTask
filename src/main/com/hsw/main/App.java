package com.hsw.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    private static  final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i=1;
        String j= "Hello";
        String k= "World";
        logger.error("haha:i={}，j={},k={}",i,j,k);
    }
}
