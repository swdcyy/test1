package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$3;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;

public class HttpUploadAgent$3 implements Runnable	// class@0009c3
{
    public final HttpUploadAgent this$0;
    public final double val$progress;
    public final long val$remainingTimeMs;

    public void HttpUploadAgent$3(HttpUploadAgent p0,double p1,long p2){
       this.this$0 = p0;
       this.val$progress = p1;
       this.val$remainingTimeMs = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent$3.class, "1")) {
          return;
       }
       HttpUploadAgent$3 tthis$0 = this.this$0;
       tthis$0.mAgentListener.onProgress(tthis$0.mTaskId, this.val$progress, (int)this.val$remainingTimeMs);
       return;
    }
}
