package com.kwai.video.ksuploaderkit.KSUploaderKitLogReporter;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.logreporter.UploadLogInfo;
import com.kwai.video.ksuploaderkit.logreporter.PublishLogInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BusinessType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.System;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogReporter$1;
import java.lang.Enum;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;

public class KSUploaderKitLogReporter	// class@00097d
{
    public LogReporter mLogReporter;
    public PublishLogInfo mPublishLogInfo;
    public UploadLogInfo mUploadLogInfo;

    public void KSUploaderKitLogReporter(String p0){
       super();
       this.mLogReporter = new LogReporter(p0);
       this.mUploadLogInfo = new UploadLogInfo();
       PublishLogInfo publishLogIn = new PublishLogInfo();
       this.mPublishLogInfo = publishLogIn;
       publishLogIn.setBusinessType(KSUploaderKitCommon$BusinessType.External);
       this.mPublishLogInfo.setUploadType("Http");
       KSUploaderKitLogReporter tmUploadLogI = this.mUploadLogInfo;
       if (tmUploadLogI != null) {
          tmUploadLogI.setBusinessType(KSUploaderKitCommon$BusinessType.External);
          this.mUploadLogInfo.setUploadType("Http");
       }
       return;
    }
    public void reportPublishEndLog(KSUploaderKitCommon$Status p0,long p1){
       KSUploaderKitLogReporter kSUploaderKi = KSUploaderKitLogReporter.class;
       if (PatchProxy.isSupport(kSUploaderKi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, kSUploaderKi, "2")) {
          return;
       }
       this.reportPublishEndLog(p0, p1, 0);
       return;
    }
    public void reportPublishEndLog(KSUploaderKitCommon$Status p0,long p1,int p2){
       if (PatchProxy.isSupport(KSUploaderKitLogReporter.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, KSUploaderKitLogReporter.class, "3")) {
          return;
       }
       if (this.mLogReporter != null) {
          KSUploaderKitLogReporter tmPublishLog = this.mPublishLogInfo;
          if (tmPublishLog != null) {
             tmPublishLog.setEndTime(System.currentTimeMillis(), true);
             this.mPublishLogInfo.setFileSize(p1);
             this.mPublishLogInfo.setErrorCode(p2);
             this.mLogReporter.onReportPublishPhotoLog(p0, this.mPublishLogInfo);
          }
       }
       return;
    }
    public void reportPublishStartLog(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKitLogReporter.class, "1")) {
          return;
       }
       if (this.mLogReporter != null) {
          KSUploaderKitLogReporter tmPublishLog = this.mPublishLogInfo;
          if (tmPublishLog != null) {
             tmPublishLog.setStartTime(System.currentTimeMillis());
             this.mLogReporter.onReportPublishPhotoLog(KSUploaderKitCommon$Status.Start, this.mPublishLogInfo);
          }
       }
       return;
    }
    public void reportUploadEndLog(KSUploaderKitCommon$Status p0,long p1){
       KSUploaderKitLogReporter kSUploaderKi = KSUploaderKitLogReporter.class;
       if (PatchProxy.isSupport(kSUploaderKi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, kSUploaderKi, "5")) {
          return;
       }
       this.reportUploadEndLog(p0, p1, KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded.value(), KSUploaderKitCommon$MediaType.Video);
       return;
    }
    public void reportUploadEndLog(KSUploaderKitCommon$Status p0,long p1,int p2){
       if (PatchProxy.isSupport(KSUploaderKitLogReporter.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, KSUploaderKitLogReporter.class, "6")) {
          return;
       }
       this.reportUploadEndLog(p0, p1, p2, KSUploaderKitCommon$MediaType.Video);
       return;
    }
    public void reportUploadEndLog(KSUploaderKitCommon$Status p0,long p1,int p2,KSUploaderKitCommon$MediaType p3){
       if (PatchProxy.isSupport(KSUploaderKitLogReporter.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, KSUploaderKitLogReporter.class, "7")) {
          return;
       }
       if (p2 == KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded.value() && p0 != KSUploaderKitCommon$Status.Success) {
          int i = KSUploaderKitLogReporter$1.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$Status[p0.ordinal()];
          if (i != 1) {
             if (i == 2) {
                p2 = KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser.value();
             }
          }else {
             p2 = KSUploaderKitCommon$ERRORCODE.EXTERNAL_HTTP_UPLOAD_FAILED.value();
          }
       }
       if (this.mLogReporter != null) {
          KSUploaderKitLogReporter tmUploadLogI = this.mUploadLogInfo;
          if (tmUploadLogI != null) {
             tmUploadLogI.setEndTime(System.currentTimeMillis());
             this.mUploadLogInfo.setFileSize(p1);
             this.mUploadLogInfo.setCloseReason(p2);
             this.mUploadLogInfo.setMediaType(p3);
             this.mLogReporter.onReportUploadLog(p0, this.mUploadLogInfo);
          }
       }
       return;
    }
    public void reportUploadStartLog(){
       if (PatchProxy.applyVoid(null, this, KSUploaderKitLogReporter.class, "4")) {
          return;
       }
       if (this.mLogReporter != null) {
          KSUploaderKitLogReporter tmUploadLogI = this.mUploadLogInfo;
          if (tmUploadLogI != null) {
             tmUploadLogI.setStartTime(System.currentTimeMillis());
             this.mLogReporter.onReportUploadLog(KSUploaderKitCommon$Status.Start, this.mUploadLogInfo);
          }
       }
       return;
    }
}
