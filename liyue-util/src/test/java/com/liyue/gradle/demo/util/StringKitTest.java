package com.liyue.gradle.demo.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by admin on 2017/5/14.
 */
public class StringKitTest {

    private final static Logger logger = LoggerFactory.getLogger(StringKitTest.class);

    @Test
    public void captFirstChar() throws Exception {
        String str ="appMain";
        logger.info(StringKit.captFirstChar(str));
    }

}