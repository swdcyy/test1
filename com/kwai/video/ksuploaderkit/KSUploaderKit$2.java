package com.kwai.video.ksuploaderkit.KSUploaderKit$2;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.String;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.UploadResponse;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import java.lang.Double;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class KSUploaderKit$2 implements IUploader$EventListener	// class@000961
{
    public final KSUploaderKit this$0;

    public void KSUploaderKit$2(KSUploaderKit p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(KSUploaderCloseReason p0,int p1,long p2,String p3,String p4,long p5,ApiManager$TokenType p6){
       KSUploaderKit$2 u2 = this;
       KSUploaderKit$2 u21 = KSUploaderKit$2.class;
       if (PatchProxy.isSupport(u21)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Long.valueOf(p2),p3,p4,Long.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, u21, "3")) {
             return;
          }
       }
       u2.this$0.processCompleteAction(p0, p1, p2, p4, p5, p6);
       return;
    }
    public void onFinished(KSUploaderCloseReason p0,UploadResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKit$2.class, "4")) {
          return;
       }
       KSUploaderKitLog.e("KSUploaderKit", "onFinished, fileToken:"+p1.fileToken()+", coverToken:"+p1.coverToken());
       KSUploaderKit$2 tthis$0 = this.this$0;
       KSUploaderKit mState = tthis$0.mState;
       if (KitUtils$State.Finish != mState && (KitUtils$State.Pause != mState || (KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser != p0 || tthis$0.mTotalPercent - tthis$0.mFileProgressWeight >= 0))) {
          if (KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded != p0) {
             return;
          }else {
             KSUploaderKit mKitEventLis = tthis$0.mKitEventListener;
             if (mKitEventLis != null) {
                mKitEventLis.onUploadFinished(p0, p1);
             }
          }
       }
       return;
    }
    public void onProgress(double p0,int p1){
       if (PatchProxy.isSupport(KSUploaderKit$2.class) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), this, KSUploaderKit$2.class, "1")) {
          return;
       }
       this.this$0.processProgressAction(p0);
       return;
    }
    public void onStateChanged(IUploader$UploadStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploaderKit$2.class, "2")) {
          return;
       }
       KSUploaderKit mKitEventLis = this.this$0.mKitEventListener;
       if (mKitEventLis != null) {
          mKitEventLis.onStateChanged(p0.parseKitStatus());
       }
       return;
    }
}
