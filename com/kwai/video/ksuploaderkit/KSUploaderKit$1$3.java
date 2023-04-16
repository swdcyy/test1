package com.kwai.video.ksuploaderkit.KSUploaderKit$1$3;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;

public class KSUploaderKit$1$3 implements Runnable	// class@000958
{
    public final KSUploaderKit$1 this$1;
    public final KSUploaderKitCommon$Status val$status;
    public final String val$taskId;

    public void KSUploaderKit$1$3(KSUploaderKit$1 p0,String p1,KSUploaderKitCommon$Status p2){
       this.this$1 = p0;
       this.val$taskId = p1;
       this.val$status = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$1$3.class, "1")) {
          return;
       }
       this.this$1.val$listener.onStateChanged(this.val$taskId, this.val$status);
       return;
    }
}
