package com.example.helloworld;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.*;
import java.sql.SQLException;
/**
 * Created by sschwert on 2/3/2016.
 */
public class LoggerExample {

    static Logger log = Logger.getLogger(LoggerExample.class.getName());

    public void LogIt() {

        log.info("Log this message - It Worked!");
        //OFF, DEBUG, INFO, ERROR, WARN, FATAL, and ALL
    }

}
