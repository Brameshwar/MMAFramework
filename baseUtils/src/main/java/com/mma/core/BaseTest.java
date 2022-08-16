package com.mma.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private final Logger logger = LoggerFactory.getLogger(BaseTest.class);


    @BeforeSuite
    public void initSuite(){
        logger.info("testing");
    }






}
