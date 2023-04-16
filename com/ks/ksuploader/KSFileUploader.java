package com.ks.ksuploader.KSFileUploader;
import com.ks.ksuploader.KSUploader;
import android.content.Context;
import com.ks.ksapi.b;
import com.ks.ksuploader.ProgressPercentage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.ks.ksuploader.KSUploader$UploadInfo;
import java.lang.Boolean;
import java.lang.Number;
import com.ks.ksuploader.KSEncryptConfig;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.io.File;
import ln.b;

public class KSFileUploader extends KSUploader	// class@00074e
{

    public void KSFileUploader(Context p0,b p1){
       super(p0, p1);
    }
    public ProgressPercentage getProgressPercentageFromEvent(long p0,long p1,long p2,long p3){
       KSUploader kSUploader = this;
       if (PatchProxy.isSupport(KSFileUploader.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, KSFileUploader.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = 0;
       if (kSUploader.uploadInfo.size - l <= 0) {
          return new ProgressPercentage();
       }else {
          KSUploader$UploadInfo size = kSUploader.uploadInfo.size;
          double d = ((double)this.getSentSize() * 0x3ff0000000000000) / (double)size;
          int i = (p3 - l > 0)? (int)(((size - this.getSentSize()) * 8) / p3): -1;
          return new ProgressPercentage(d, i);
       }
    }
    public int startUploadFile(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(KSFileUploader.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, KSFileUploader.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.startUploadFile(p0, p1, p2, new KSEncryptConfig());
    }
    public int startUploadFile(String p0,String p1,boolean p2,KSEncryptConfig p3){
       KSUploader obj;
       if (PatchProxy.isSupport(KSFileUploader.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, KSFileUploader.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mIsStarted != null) {
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_MultiInit, 0, null, null, "startUploadFile: mIsStarted false");
          _monitor_exit(obj);
          return -1;
       }else {
          this.mIsStarted = true;
          _monitor_exit(obj);
          if (p3 == null) {
             p3 = new KSEncryptConfig();
          }
          if (!p3.isValid()) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "Encrypt configuration invalid");
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid, 0, null, null, "startUploadFile: encryptConfig invalid");
             return -1;
          }else {
             this.uploadInfo.update(p0, p1, 0, new File(p0).length());
             KSUploader tuploadInfo = this.uploadInfo;
             tuploadInfo.enableResume = p2;
             tuploadInfo.encryptConfig = new KSEncryptConfig(p3);
             b uob = this.requestUploadInfo(p1);
             if (uob == null) {
                return -1;
             }else {
                return this.startUploadFileInner(uob);
             }
          }
       }
    }
    public final int startUploadFileInner(b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, KSFileUploader.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       int i = -1;
       if (this.onUploadReady()) {
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed, 0, null, null, "startUploadFileInner: onUploadReady failed");
          return i;
       }else {
          KSUploader tuploadInfo = this.uploadInfo;
          this.setResumeInfo(tuploadInfo.taskId, tuploadInfo.fileID);
          if (this.setEncryptConfig()) {
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid, 0, null, null, "startUploadFileInner: setEncryptConfig failed");
             return i;
          }else {
             int i1 = this.fragmentAndUpload();
             if (i1) {
                return i1;
             }
             this.finishFragmentInner(null, this.uploadInfo.getFileSize(), this.uploadInfo.fragNum);
             return 0;
          }
       }
    }
}
