package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$6;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.stats.HttpUploadStats;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;

public class HttpUploadAgent$6 implements Runnable	// class@0009c7
{
    public final HttpUploadAgent this$0;
    public final int val$errorCode;
    public final HttpRequestInfo val$httpRequestInfo;
    public final KSUploaderKitCommon$Status val$status;

    public void HttpUploadAgent$6(HttpUploadAgent p0,KSUploaderKitCommon$Status p1,int p2,HttpRequestInfo p3){
       this.this$0 = p0;
       this.val$status = p1;
       this.val$errorCode = p2;
       this.val$httpRequestInfo = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent$6.class, "1")) {
          return;
       }
       HttpUploadAgent$6 tthis$0 = this.this$0;
       HttpUploadAgent mAgentListen = tthis$0.mAgentListener;
       if (mAgentListen != null) {
          tthis$0 = this.this$0;
          mAgentListen.onComplete(tthis$0.mTaskId, this.val$status, this.val$errorCode, null, tthis$0.mStats.getQos(), tthis$0.mUploadToken, tthis$0.mUploadedFileSize, this.val$httpRequestInfo);
       }
       return;
    }
}
