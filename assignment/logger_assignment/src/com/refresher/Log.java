package com.refresher;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

    public Logger logger;
    public FileHandler fh;

    public Log(String file_name) throws IOException , SecurityException {
        File file=new File(file_name);
        if(!file.exists())
            file.createNewFile();
        else{
            fh=new FileHandler(file_name,true);
            logger=Logger.getLogger("test");
            logger.addHandler(fh);
            SimpleFormatter formatter=new SimpleFormatter();
            fh.setFormatter(formatter);
        }
    }
}
