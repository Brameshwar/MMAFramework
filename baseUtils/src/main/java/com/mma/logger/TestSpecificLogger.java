package com.mma.logger;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.FileAppender;
import org.apache.log4j.MDC;
import org.apache.log4j.spi.LoggingEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

@Getter
@Setter
public class TestSpecificLogger extends FileAppender {

    private String basePath;

    private String specificPath;

    private String logFileName;

    private final HashMap<String, FileAppender> map = new HashMap<>();

    @Override
    public synchronized void doAppend(LoggingEvent event){

        String basePath = (String) MDC.get(getBasePath());
        String specificPath = (String) MDC.get(getSpecificPath());

        if( basePath == null || logFileName == null){
            super.doAppend(event);
            return;
        }

        String key = null;
        if(specificPath == null){
            key = "default";
        }
        else {
            key = specificPath;
        }

        if(!map.containsKey((key))){
            StringBuilder sb = new StringBuilder();
            sb.append(basePath);
            if(!(basePath.endsWith("/") || basePath.endsWith("\\"))){
                sb.append("/");
            }

            if(specificPath !=null ){
                sb.append(specificPath).append("/");
            }

            sb.append(logFileName);

            try{
                FileAppender fileAppender = new FileAppender(layout, sb.toString());
                map.put(key, fileAppender);
            } catch (IOException e) {}

            FileAppender fileAppender = map.get(key);
            if(fileAppender != null){
                fileAppender.doAppend(event);
            }
            else {
                super.append(event);
            }
        }

    }

    @Override
    public void close(){

        for(Iterator<FileAppender> iterator = map.values().iterator(); iterator.hasNext();){
            FileAppender appender = iterator.next();
            appender.close();
        }
        super.close();

    }

}
