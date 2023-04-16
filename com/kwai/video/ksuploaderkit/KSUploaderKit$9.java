package com.kwai.video.ksuploaderkit.KSUploaderKit$9;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import java.lang.System;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class KSUploaderKit$9 implements Runnable	// class@000968
{
    public final KSUploaderKit this$0;
    public final String val$taskId;

    public void KSUploaderKit$9(KSUploaderKit p0,String p1){
       this.this$0 = p0;
       this.val$taskId = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$9.class, "1")) {
          return;
       }
       this.this$0.mApiManager.resetApiResponse();
       if (this.this$0.mUploader.pause(this.val$taskId)) {
          KSUploaderKit$9 tthis$0 = this.this$0;
          tthis$0.mState = KitUtils$State.Pause;
          tthis$0.mPublishLogInfo.setEndTime(System.currentTimeMillis(), false);
          tthis$0 = this.this$0;
          tthis$0.postPublishPhotoLogReporter(KSUploaderKitCommon$Status.Pause, tthis$0.mPublishLogInfo);
       }
       return;
    }
}
