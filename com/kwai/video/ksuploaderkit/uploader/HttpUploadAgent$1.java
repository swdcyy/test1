package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$1;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$HttpChunkInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class HttpUploadAgent$1 implements Runnable	// class@0009c1
{
    public final HttpUploadAgent this$0;
    public final HttpUploadAgent$HttpChunkInfo val$chunkInfo;

    public void HttpUploadAgent$1(HttpUploadAgent p0,HttpUploadAgent$HttpChunkInfo p1){
       this.this$0 = p0;
       this.val$chunkInfo = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent$1.class, "1")) {
          return;
       }
       this.this$0.uploadFragmentData(this.val$chunkInfo);
       return;
    }
}
