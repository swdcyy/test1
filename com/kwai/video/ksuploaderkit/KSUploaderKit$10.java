package com.kwai.video.ksuploaderkit.KSUploaderKit$10;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import java.lang.System;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class KSUploaderKit$10 implements Runnable	// class@000959
{
    public final KSUploaderKit this$0;
    public final String val$taskId;

    public void KSUploaderKit$10(KSUploaderKit p0,String p1){
       this.this$0 = p0;
       this.val$taskId = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$10.class, "1")) {
          return;
       }
       if (this.this$0.mUploader.resume(this.val$taskId)) {
          KSUploaderKit$10 tthis$0 = this.this$0;
          tthis$0.mState = KitUtils$State.UploadFile;
          tthis$0.mPublishLogInfo.setStartTime(System.currentTimeMillis());
          tthis$0 = this.this$0;
          tthis$0.postPublishPhotoLogReporter(KSUploaderKitCommon$Status.Resume, tthis$0.mPublishLogInfo);
       }
       return;
    }
}
