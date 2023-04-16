package com.kwai.video.ksspark.model.VideoProjectWrapper;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksspark.NewSparkTemplateManager;

public class VideoProjectWrapper	// class@000936
{
    public int mErrorCode;
    public String mErrorMsg;
    public long nativeAddress;

    public void VideoProjectWrapper(){
       super();
       this.mErrorCode = 0;
       this.mErrorMsg = "";
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
    public long getNativeAddress(){
       return this.nativeAddress;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, VideoProjectWrapper.class, "1")) {
          return;
       }
       NewSparkTemplateManager.nativeDelete(this.nativeAddress);
       return;
    }
    public void setError(int p0,String p1){
       this.mErrorCode = p0;
       this.mErrorMsg = p1;
    }
}
