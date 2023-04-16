package com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.config.PublishConfig$Config;
import com.kwai.video.ksuploaderkit.config.PublishConfig$1;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;

public class PublishConfig implements Serializable	// class@0009a3
{
    public PublishConfig$Config mConfig;

    public void PublishConfig(){
       super();
       this.mConfig = new PublishConfig$Config(null);
    }
    public boolean getDisableResumeCrcCheck(){
       return this.mConfig.disableResumeCrcCheck;
    }
    public Boolean getEnableExceptionCollection(){
       Object obj = PatchProxy.apply(null, this, PublishConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(this.mConfig.enableExceptionCollection);
    }
    public long getExceptionCollectionIntervalMs(){
       return this.mConfig.exceptionCollectionIntervalMs;
    }
    public PublishConfig$HTTPConfig getHTTPConfig(){
       return this.mConfig.httpConfig;
    }
    public int[] getRetryErrorCode(){
       return this.mConfig.retryErrorCode;
    }
    public int getRetryNum(){
       return this.mConfig.retryNum;
    }
    public String getRickonConfig(){
       return this.mConfig.rickonConfig;
    }
    public String getUploadType(){
       return this.mConfig.uploadType;
    }
}
