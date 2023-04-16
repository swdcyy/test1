package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$2;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;

public class HttpUploadAgent$2 implements Runnable	// class@0009c2
{
    public final HttpUploadAgent this$0;
    public final double val$progress;

    public void HttpUploadAgent$2(HttpUploadAgent p0,double p1){
       this.this$0 = p0;
       this.val$progress = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent$2.class, "1")) {
          return;
       }
       HttpUploadAgent$2 tthis$0 = this.this$0;
       tthis$0.mAgentListener.onProgress(tthis$0.mTaskId, this.val$progress, 0);
       return;
    }
}
