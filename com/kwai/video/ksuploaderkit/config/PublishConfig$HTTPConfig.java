package com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.Object;

public class PublishConfig$HTTPConfig	// class@0009a2
{
    public boolean fallbackToHTTP;
    public int maxConcurrentCount;
    public int maxRetryNumPerRequest;
    public final PublishConfig this$0;
    public int timeoutMS;
    public int uploadTaskFragmentSizeBytes;

    public void PublishConfig$HTTPConfig(PublishConfig p0){
       this.this$0 = p0;
       super();
       this.maxConcurrentCount = 1;
       this.uploadTaskFragmentSizeBytes = 0x80000;
       this.fallbackToHTTP = false;
       this.maxRetryNumPerRequest = 3;
       this.timeoutMS = 0x4e20;
    }
}
