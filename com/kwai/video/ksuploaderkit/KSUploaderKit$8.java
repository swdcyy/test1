package com.kwai.video.ksuploaderkit.KSUploaderKit$8;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;

public class KSUploaderKit$8 implements Runnable	// class@000967
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$8(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$8.class, "1")) {
          return;
       }
       if (this.this$0.mFragmentFinished == null) {
          this.this$0.mFragmentFinished = true;
          KSUploaderKit mUploader = this.this$0.mUploader;
          if (mUploader != null) {
             mUploader.finishUploadSegment();
          }
          UploaderKitExceptionLogger.getInstance().finishFragment(this.this$0.mConfig.getTaskID());
       }
       return;
    }
}
