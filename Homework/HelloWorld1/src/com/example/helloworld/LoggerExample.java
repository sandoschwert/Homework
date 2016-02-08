package com.example.helloworld;
import org.apache.log4j.*;
import java.io.*;
import java.util.*;
import java.sql.SQLException;
/**
 * Created by sschwert on 2/3/2016.
 */
public class LoggerExample {

    private final Logger logger = Logger.getLogger(this.getClass());

    public void LogIt() {

        logger.info("Log this message - It Worked!");
        //OFF, DEBUG, INFO, ERROR, WARN, FATAL, and ALL
    }

}
