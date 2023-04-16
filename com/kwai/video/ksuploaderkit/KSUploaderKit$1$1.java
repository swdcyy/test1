package com.kwai.video.ksuploaderkit.KSUploaderKit$1$1;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;

public class KSUploaderKit$1$1 implements Runnable	// class@000956
{
    public final KSUploaderKit$1 this$1;
    public final double val$progress;
    public final String val$taskId;

    public void KSUploaderKit$1$1(KSUploaderKit$1 p0,String p1,double p2){
       this.this$1 = p0;
       this.val$taskId = p1;
       this.val$progress = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$1$1.class, "1")) {
          return;
       }
       this.this$1.val$listener.onProgress(this.val$taskId, this.val$progress);
       return;
    }
}
