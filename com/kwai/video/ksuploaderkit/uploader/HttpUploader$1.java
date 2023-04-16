package com.kwai.video.ksuploaderkit.uploader.HttpUploader$1;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;
import com.kwai.video.ksuploaderkit.uploader.HttpUploader;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.stats.BitrateStats;
import com.kwai.video.ksuploaderkit.uploader.UploadData$ExtInfo;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.ks.ksuploader.KSUploaderCloseReason;
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
import java.lang.Double;

public class HttpUploader$1 implements HttpUploadAgentListener	// class@0009cb
{
    public final HttpUploader this$0;
    public final UploadData val$uploadData;

    public void HttpUploader$1(HttpUploader p0,UploadData p1){
       this.this$0 = p0;
       this.val$uploadData = p1;
       super();
    }
    public void onComplete(String p0,KSUploaderKitCommon$Status p1,int p2,String p3,String p4,String p5,long p6,HttpRequestInfo p7){
       HttpUploader$1 val$uploadDa;
       KSUploaderCloseReason kSUploaderCl1;
       UploadResponse$Builder uBuilder1;
       HttpUploader$1 val$uploadDa1;
       String str1;
       HttpUploader mUploaderCon;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p5;
       HttpUploader$1 u1 = HttpUploader$1.class;
       if (PatchProxy.isSupport(u1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),oobject2,p4,oobject3,Long.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, obj, u1, "2")) {
             return;
          }
       }
       HttpUploader$1 this$0 = obj.this$0;
       if (this$0.mLogReporter != null) {
          obj.this$0.mLogReporter.onReportUploadLog(oobject1, this$0.createUploadLogInfo(p2, (long)this$0.statusToIntValue(oobject1), p4, obj.val$uploadData, p7));
       }
       obj.this$0.mBitrateStats.finish(p6);
       u1 = obj.val$uploadData;
       IUploader$UploadStatus uploadStatus = (u1 != null)? u1.extInfo().uploadStatus(): null;
       if (IUploader$UploadStatus.Pause == uploadStatus && KSUploaderKitCommon$Status.Cancel == oobject1) {
          return;
       }else if(oobject1 != KSUploaderKitCommon$Status.Success){
          obj.this$0.mFailedCount.getAndIncrement();
       }
       IUploader$TaskEventListener taskEventLis = (!TextUtils.isEmpty(p0))? obj.this$0.mTaskListeners.get(oobject): null;
       KSUploaderCloseReason kSUploaderCl = obj.this$0.errorCodeToCloseReason(p2);
       if (taskEventLis != null) {
          taskEventLis.onStateChanged(oobject, IUploader$UploadStatus.Finish);
          long l = (long)obj.this$0.statusToIntValue(oobject1);
          val$uploadDa = obj.val$uploadData;
          String str = (val$uploadDa != null)? val$uploadDa.filePath(): 0;
          kSUploaderCl1 = kSUploaderCl;
          taskEventLis.onUploadFinished(p0, kSUploaderCl, l, p5, str);
       }else {
          kSUploaderCl1 = kSUploaderCl;
       }
       if (obj.this$0.mEventListener != null) {
          UploadResponse$Builder uBuilder = new UploadResponse$Builder().status((long)obj.this$0.statusToIntValue(oobject1)).taskId(oobject).response(oobject2);
          if (obj.this$0.mIsUploadingCover != null) {
             uBuilder1 = uBuilder.fileMediaType(KSUploaderKitCommon$MediaType.Image).coverToken(oobject3);
             val$uploadDa1 = obj.val$uploadData;
             str1 = (val$uploadDa1 != null)? val$uploadDa1.filePath(): null;
             uBuilder1.coverPath(str1);
             obj.this$0.mIsUploadingCover = false;
          }else {
             val$uploadDa = obj.val$uploadData;
             KSUploaderKitCommon$MediaType mediaType = (val$uploadDa != null)? val$uploadDa.mediaType(): KSUploaderKitCommon$MediaType.Unknown;
             uBuilder1 = uBuilder.fileMediaType(mediaType).fileToken(oobject3);
             val$uploadDa1 = obj.val$uploadData;
             str1 = (val$uploadDa1 != null)? val$uploadDa1.filePath(): null;
             uBuilder1.filePath(str1);
          }
          obj.this$0.mEventListener.onFinished(kSUploaderCl1, uBuilder.build());
          KSUploaderKitLog.i("KSUploaderKit-HttpUploader", "send task finish,task id: "+oobject+", upload Token : "+oobject3);
       }
       u1 = obj.val$uploadData;
       if (u1 != null) {
          u1.extInfo().updatePercent(0x3ff0000000000000);
          obj.val$uploadData.extInfo().updateUploadStatus(IUploader$UploadStatus.Finish);
       }
       val$uploadDa = obj.this$0;
       if (obj.this$0.mUploaderConfig.extInfo.completeTaskTicker.incrementAndGet() >= val$uploadDa.mUploadDataList.length) {
          mUploaderCon = val$uploadDa.mUploaderConfig;
          mUploaderCon.extInfo.status = IUploader$UploadStatus.Finish;
          ApiManager$TokenType tokenType = (mUploaderCon.channelType == KSUploaderKitCommon$UploadChannelType.Single)? val$uploadDa.mApiNetAgents[0].getTokenType(): null;
          u1 = obj.this$0;
          u1.mEventListener.onComplete(kSUploaderCl1, p2, (long)u1.statusToIntValue(oobject1), p4, p5, p6, tokenType);
          return;
       }else {
          mUploaderCon = val$uploadDa.mUploaderConfig;
          if (mUploaderCon.channelType == KSUploaderKitCommon$UploadChannelType.MultiSerial) {
             mUploaderCon.extInfo.cursor.getAndIncrement();
             obj.this$0.mApiManager.next();
             obj.this$0.tryUploadData();
          }
          return;
       }
    }
    public void onProgress(String p0,double p1,int p2){
       if (PatchProxy.isSupport(HttpUploader$1.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), Integer.valueOf(p2), this, HttpUploader$1.class, "1")) {
          return;
       }
       this.this$0.mBitrateStats.setSentSize((long)((double)this.val$uploadData.extInfo().fileSize() * p1));
       this.val$uploadData.extInfo().updatePercent(p1);
       HttpUploader$1 u1 = null;
       if (!TextUtils.isEmpty(this.val$uploadData.taskId())) {
          u1 = this.this$0.mTaskListeners.get(this.val$uploadData.taskId());
       }
       if (u1 != null) {
          u1.onProgress(this.val$uploadData.taskId(), p1);
       }
       u1 = this.this$0;
       if (u1.mEventListener != null) {
          p1 = 0;
          HttpUploader mUploadDataL = u1.mUploadDataList;
          int len = mUploadDataL.length;
          for (int i = 0; i < len; i = i + 1) {
             p1 = p1 + mUploadDataL[i].extInfo().percent();
          }
          u1 = this.this$0;
          u1.mEventListener.onProgress((p1 / (double)u1.mUploadDataList.length), p2);
       }
       return;
    }
}
