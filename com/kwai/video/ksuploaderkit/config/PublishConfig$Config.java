package com.kwai.video.ksuploaderkit.config.PublishConfig$Config;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.config.PublishConfig$1;

public class PublishConfig$Config implements Serializable, Cloneable	// class@0009a1
{
    public boolean disableResumeCrcCheck;
    public boolean enableExceptionCollection;
    public long exceptionCollectionIntervalMs;
    public PublishConfig$HTTPConfig httpConfig;
    public int[] retryErrorCode;
    public int retryNum;
    public String rickonConfig;
    public String uploadType;

    public void PublishConfig$Config(){
       super();
       this.rickonConfig = "{\"congestionControlType\":\"BBR2\", \"concurrentConnect\":true, \"firstConnectTimeoutMs\":3000}";
       this.retryNum = 3;
       this.retryErrorCode = new int[2]{1007,1011};
       this.uploadType = "rickon";
       this.disableResumeCrcCheck = false;
       this.enableExceptionCollection = false;
       this.exceptionCollectionIntervalMs = 0x2710;
    }
    public void PublishConfig$Config(PublishConfig$1 p0){
       super();
    }
}
