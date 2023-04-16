package com.kwai.video.cache.AwesomeCacheCallback;
import java.lang.Object;
import com.kwai.video.cache.AcCallBackInfo;

public abstract class AwesomeCacheCallback	// class@0019f0
{

    public void AwesomeCacheCallback(){
       super();
    }
    public abstract void onDownloadFinish(AcCallBackInfo p0);
    public abstract void onSessionProgress(AcCallBackInfo p0);
}
