package com.kwai.video.ksuploaderkit.KSUploaderKit$11;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.IUploader;

public class KSUploaderKit$11 implements Runnable	// class@00095a
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$11(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$11.class, "1")) {
          return;
       }
       KSUploaderKit mUploader = this.this$0.mUploader;
       if (mUploader != null) {
          mUploader.release();
       }
       this.this$0.quitUploadThreadSafely();
       return;
    }
}
