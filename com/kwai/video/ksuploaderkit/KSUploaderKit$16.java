package com.kwai.video.ksuploaderkit.KSUploaderKit$16;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.retry.RetryController;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;

public class KSUploaderKit$16 implements Runnable	// class@00095f
{
    public final KSUploaderKit this$0;
    public final int val$errorCode;
    public final KSUploaderKitCommon$Status val$status;
    public final String val$uploadToken;

    public void KSUploaderKit$16(KSUploaderKit p0,int p1,KSUploaderKitCommon$Status p2,String p3){
       this.this$0 = p0;
       this.val$errorCode = p1;
       this.val$status = p2;
       this.val$uploadToken = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$16.class, "1")) {
          return;
       }
       this.this$0.mPublishLogInfo.setEndTime(System.currentTimeMillis(), false);
       this.this$0.mPublishLogInfo.setErrorCode(this.val$errorCode);
       KSUploaderKit$16 tthis$0 = this.this$0;
       tthis$0.mPublishLogInfo.setRetryCount(tthis$0.mRetryController.getRetryCount());
       tthis$0 = this.this$0;
       tthis$0.mPublishLogInfo.setFileSize(tthis$0.getTotalSize());
       tthis$0 = this.this$0;
       KSUploaderKit mUploader = tthis$0.mUploader;
       if (mUploader != null) {
          tthis$0.mPublishLogInfo.setFailedCount(mUploader.getFailedCount());
       }
       tthis$0 = this.this$0;
       tthis$0.postPublishPhotoLogReporter(this.val$status, tthis$0.mPublishLogInfo);
       if (KSUploaderKitCommon$Status.Success == this.val$status && this.this$0.mConfig.getEnableResume()) {
          tthis$0 = this.this$0;
          tthis$0.mApiManager.removeCachedApiResponse(tthis$0.mConfig.getTaskID());
       }
       this.this$0.mKitEventListener.onComplete(this.val$status, this.val$errorCode, this.val$uploadToken);
       return;
    }
}
