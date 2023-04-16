package com.kwai.video.ksuploaderkit.KSUploaderKit$4;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import java.lang.System;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.uploader.IUploader;

public class KSUploaderKit$4 implements Runnable	// class@000963
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$4(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSUploaderKit$4.class, "1")) {
          return;
       }
       if (this.this$0.isNetworkAvailable()) {
          KSUploaderKit$4 tthis$0 = this.this$0;
          tthis$0.mState = KitUtils$State.UploadFile;
          tthis$0.mPublishLogInfo.setStartTime(System.currentTimeMillis());
          tthis$0 = this.this$0;
          tthis$0.postPublishPhotoLogReporter(KSUploaderKitCommon$Status.Start, tthis$0.mPublishLogInfo);
          tthis$0 = this.this$0;
          UploaderKitExceptionLogger.getInstance().startUpload(this.this$0.mConfig.getSessionID(), this.this$0.mConfig.getTaskID(), tthis$0.mPublishLogInfo, tthis$0.mConfig.getFilePath(), this.this$0.mConfig.getCoverPath());
          this.this$0.createUploader();
          tthis$0 = this.this$0;
          if (tthis$0.mUploader != null && !tthis$0.mState.equals(KitUtils$State.Finish)) {
             UploadData[] uploadDataAr = new UploadData[this.this$0.mConfig.getTaskCount()];
             for (int i = 0; i < this.this$0.mConfig.getTaskCount(); i = i + 1) {
                UploadData uploadData = (this.this$0.mConfig.getIndex(i) != null)? this.this$0.mConfig.getIndex(i).convertUploadData(): objArray;
                uploadDataAr[i] = uploadData;
             }
             KSUploaderKit$4 tthis$01 = this.this$0;
             tthis$01.mUploader.startUpload(tthis$01.mConfig.getUploadMode(), uploadDataAr);
          }
       }
       return;
    }
}
