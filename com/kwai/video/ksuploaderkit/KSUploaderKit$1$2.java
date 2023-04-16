package com.kwai.video.ksuploaderkit.KSUploaderKit$1$2;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1;
import java.lang.String;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;

public class KSUploaderKit$1$2 implements Runnable	// class@000957
{
    public final KSUploaderKit$1 this$1;
    public final String val$filePath;
    public final KSUploaderCloseReason val$reason;
    public final long val$status;
    public final String val$taskId;
    public final String val$uploadToken;

    public void KSUploaderKit$1$2(KSUploaderKit$1 p0,String p1,KSUploaderCloseReason p2,long p3,String p4,String p5){
       this.this$1 = p0;
       this.val$taskId = p1;
       this.val$reason = p2;
       this.val$status = p3;
       this.val$uploadToken = p4;
       this.val$filePath = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$1$2.class, "1")) {
          return;
       }
       this.this$1.val$listener.onUploadFinished(this.val$taskId, this.val$reason, this.val$status, this.val$uploadToken, this.val$filePath);
       return;
    }
}
