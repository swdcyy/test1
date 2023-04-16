package com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Config;
import java.io.Serializable;
import java.lang.Object;

public class ObiwanConfig$Config implements Serializable	// class@000d30
{
    public int checkInterval;
    public int maxUploadFileSize;
    public int retryCount;
    public int retryDelay;
    public int timeout;

    public void ObiwanConfig$Config(){
       super();
       this.retryCount = 3;
       this.retryDelay = 10;
       this.timeout = 500;
       this.checkInterval = 30;
       this.maxUploadFileSize = 50;
    }
}
