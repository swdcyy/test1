package com.kwai.video.ksuploaderkit.uploader.RickonUploader$1;
import com.ks.ksuploader.KSUploaderEventListener;
import com.kwai.video.ksuploaderkit.uploader.RickonUploader;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.utils.KitUtils;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.stats.BitrateStats;
import com.kwai.video.ksuploaderkit.uploader.UploadData$ExtInfo;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.UploadResponse$Builder;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.UploadResponse;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.uploader.UploaderConfig;
import com.kwai.video.ksuploaderkit.uploader.UploaderConfig$ExtInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import com.kwai.video.ksuploaderkit.apicenter.ApiNetAgent;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.lang.Double;
import java.lang.Integer;

public class RickonUploader$1 implements KSUploaderEventListener	// class@0009d3
{
    public final RickonUploader this$0;
    public final UploadData val$uploadData;

    public void RickonUploader$1(RickonUploader p0,UploadData p1){
       this.this$0 = p0;
       this.val$uploadData = p1;
       super();
    }
    public void onComplete(KSUploaderCloseReason p0,long p1,String p2,String p3,String p4,long p5,String p6){
       RickonUploader$1 val$uploadDa;
       UploadResponse$Builder uBuilder1;
       RickonUploader$1 val$uploadDa1;
       String str2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p6;
       RickonUploader$1 u1 = RickonUploader$1.class;
       if (PatchProxy.isSupport(u1)) {
          Object[] objArray = new Object[]{oobject,Long.valueOf(p1),oobject1,p3,oobject2,Long.valueOf(p5),oobject3};
          if (PatchProxy.applyVoid(objArray, obj, u1, "2")) {
             return;
          }
       }
       u1 = obj.val$uploadData;
       int i = 0;
       String str = (u1 != null)? u1.taskId(): i;
       u1 = obj.this$0;
       if (u1.mLogReporter != null) {
          obj.this$0.mLogReporter.onReportUploadLog(KitUtils.closeReason2KitStatus(0, oobject), u1.createUploadLogInfo(p0, p1, p3, obj.val$uploadData, p6));
       }
       obj.this$0.mBitrateStats.finish(p5);
       u1 = obj.val$uploadData;
       IUploader$UploadStatus uploadStatus = (u1 != null)? u1.extInfo().uploadStatus(): i;
       if (IUploader$UploadStatus.Pause == uploadStatus && KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser == oobject) {
          return;
       }else if(oobject != KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded){
          obj.this$0.mFailedCount.getAndIncrement();
       }
       IUploader$TaskEventListener taskEventLis = (!TextUtils.isEmpty(str))? obj.this$0.mTaskListeners.get(str): i;
       if (taskEventLis != null) {
          taskEventLis.onStateChanged(str, IUploader$UploadStatus.Finish);
          val$uploadDa = obj.val$uploadData;
          String str1 = (val$uploadDa != null)? val$uploadDa.filePath(): i;
          taskEventLis.onUploadFinished(str, p0, p1, p4, str1);
       }
       if (obj.this$0.mEventListener != null) {
          UploadResponse$Builder uBuilder = new UploadResponse$Builder().status(p1).taskId(str).response(oobject1);
          if (obj.this$0.mIsUploadingCover != null) {
             uBuilder1 = uBuilder.fileMediaType(KSUploaderKitCommon$MediaType.Image).coverToken(oobject2);
             val$uploadDa1 = obj.val$uploadData;
             str2 = (val$uploadDa1 != null)? val$uploadDa1.filePath(): i;
             uBuilder1.coverPath(str2);
             obj.this$0.mIsUploadingCover = false;
          }else {
             val$uploadDa = obj.val$uploadData;
             KSUploaderKitCommon$MediaType mediaType = (val$uploadDa != null)? val$uploadDa.mediaType(): KSUploaderKitCommon$MediaType.Unknown;
             uBuilder1 = uBuilder.fileMediaType(mediaType).fileToken(oobject2);
             val$uploadDa1 = obj.val$uploadData;
             str2 = (val$uploadDa1 != null)? val$uploadDa1.filePath(): i;
             uBuilder1.filePath(str2);
          }
          obj.this$0.mEventListener.onFinished(oobject, uBuilder.build());
          KSUploaderKitLog.i("KSUploaderKit-RickonUploader", "send task finish,task id: "+str+", upload Token : "+oobject2+"errorMsg:"+oobject3);
       }else {
          int i1 = p1;
       }
       u1 = obj.val$uploadData;
       if (u1 != null) {
          u1.extInfo().updatePercent(0x3ff0000000000000);
          obj.val$uploadData.extInfo().updateUploadStatus(IUploader$UploadStatus.Finish);
       }
       val$uploadDa = obj.this$0;
       RickonUploader mUploadData = val$uploadDa.mUploadData;
       if (obj.this$0.mUploaderConfig.extInfo.completeTaskTicker.incrementAndGet() >= mUploadData.length) {
          val$uploadDa.mUploaderConfig.extInfo.status = IUploader$UploadStatus.Finish;
          mUploadData[0].mediaType();
          u1 = obj.this$0;
          if (u1.mUploaderConfig.channelType == KSUploaderKitCommon$UploadChannelType.Single) {
             i = u1.mNetAgents[0].getTokenType();
          }
          obj.this$0.mEventListener.onComplete(p0, p0.value(), p1, p3, p4, p5, i);
          return;
       }else {
          RickonUploader mUploaderCon = val$uploadDa.mUploaderConfig;
          if (mUploaderCon.channelType == KSUploaderKitCommon$UploadChannelType.MultiSerial) {
             mUploaderCon.extInfo.cursor.getAndIncrement();
             obj.this$0.mApiManager.next();
             obj.this$0.mApiManager.resetApiResponse();
             u1 = obj.this$0;
             u1.createRickonUploaderAndInit(u1.mUploaderConfig.uploadMode);
             obj.this$0.tryUploadData();
          }
          return;
       }
    }
    public void onProgress(double p0,int p1){
       IUploader$TaskEventListener taskEventLis;
       RickonUploader$1 u1 = RickonUploader$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, u1, "1")) {
          return;
       }
       u1 = this.val$uploadData;
       if (u1 == null) {
          return;
       }
       this.this$0.mBitrateStats.setSentSize((long)((double)u1.extInfo().fileSize() * p0));
       this.val$uploadData.extInfo().updatePercent(p0);
       if (p0 - this.val$uploadData.extInfo().percent() >= 0) {
          u1 = null;
          if (!TextUtils.isEmpty(this.val$uploadData.taskId())) {
             taskEventLis = this.this$0.mTaskListeners.get(this.val$uploadData.taskId());
          }
          if (taskEventLis != null) {
             taskEventLis.onProgress(this.val$uploadData.taskId(), p0);
          }
          RickonUploader$1 tthis$0 = this.this$0;
          if (tthis$0.mEventListener != null) {
             double d = 0;
             RickonUploader mUploadData = tthis$0.mUploadData;
             int len = mUploadData.length;
             for (int i = 0; i < len; i = i + 1) {
                d = d + mUploadData[i].extInfo().percent();
             }
             tthis$0 = this.this$0;
             tthis$0.mEventListener.onProgress((d / (double)tthis$0.mUploadData.length), p1);
          }
       }
       return;
    }
}
