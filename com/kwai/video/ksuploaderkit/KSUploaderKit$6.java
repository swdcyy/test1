package com.kwai.video.ksuploaderkit.KSUploaderKit$6;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.IUploader;

public class KSUploaderKit$6 implements Runnable	// class@000965
{
    public final KSUploaderKit this$0;
    public final String val$taskId;

    public void KSUploaderKit$6(KSUploaderKit p0,String p1){
       this.this$0 = p0;
       this.val$taskId = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$6.class, "1")) {
          return;
       }
       KSUploaderKit mUploader = this.this$0.mUploader;
       if (mUploader != null) {
          mUploader.cancel(this.val$taskId);
       }
       return;
    }
}
