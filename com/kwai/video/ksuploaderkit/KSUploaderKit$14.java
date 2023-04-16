package com.kwai.video.ksuploaderkit.KSUploaderKit$14;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import com.kwai.video.ksuploaderkit.retry.RetryController;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;
import com.kwai.video.ksuploaderkit.uploader.UploadData$Builder;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.lang.System;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.ks.ksuploader.KSEncryptConfig;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import com.kwai.video.ksuploaderkit.uploader.IUploader;
import java.util.ArrayList;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;

public class KSUploaderKit$14 implements Runnable	// class@00095d
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$14(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKit$14.class, "1")) {
          return;
       }
       String str = "KSUploaderKit";
       KSUploaderKitLog.i(str, "retry upload");
       this.this$0.mApiManager.resetApiResponse();
       if (this.this$0.mRetryController.getRetryCount() == this.this$0.mConfigParam.getRetryNum()) {
          String str1 = "http";
          if (!(this.this$0.mUploadType).equalsIgnoreCase(str1) && (!this.this$0.mConfig.getCurrentInfo().needEncryption() && (this.this$0.mConfigParam.getHTTPConfig() != null && this.this$0.mConfigParam.getHTTPConfig().fallbackToHTTP != null))) {
             this.this$0.mUploadType = str1;
             KSUploaderKitLog.i(str, "fall back to http");
          }
       }
    label_0065 :
       this.this$0.createUploader();
       KSUploaderKit$14 tthis$0 = this.this$0;
       UploadData[] uploadDataAr = new UploadData[]{new UploadData$Builder(this.this$0.mConfig.getUploadMode(), this.this$0.mConfig.getFilePath()).setDuration(0).setInnerTaskId(String.valueOf(System.currentTimeMillis())).setTaskId(this.this$0.mConfig.getTaskID()).setMediaType(this.this$0.mApiManager.getMediaType()).setEnableResume(this.this$0.mConfig.getEnableResume()).setEncryptConfig(this.this$0.mConfig.getFileEncryptConfig()).setCoverEncryptConfig(this.this$0.mConfig.getCoverEncryptConfig()).build()};
       int i = 0;
       tthis$0.mUploader.startUpload(tthis$0.mConfig.getUploadMode(), uploadDataAr);
       if (KSUploaderKitCommon$UploadMode.Fragement == this.this$0.mConfig.getUploadMode()) {
          for (; i < this.this$0.mFragmentList.size(); i = i + 1) {
             this.this$0.mUploader.uploadSegment(this.this$0.mFragmentList.get(i));
          }
          if (this.this$0.mFragmentFinished != null) {
             this.this$0.mUploader.finishUploadSegment();
          }
       }
       return;
    }
}
