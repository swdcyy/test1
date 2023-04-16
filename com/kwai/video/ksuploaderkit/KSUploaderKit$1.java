package com.kwai.video.ksuploaderkit.KSUploaderKit$1;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import com.kwai.video.ksuploaderkit.KSUploaderKitTaskListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1$1;
import java.lang.Runnable;
import android.os.Handler;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1$3;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.KSUploaderKit$1$2;

public class KSUploaderKit$1 implements IUploader$TaskEventListener	// class@000960
{
    public final KSUploaderKit this$0;
    public final KSUploaderKitTaskListener val$listener;

    public void KSUploaderKit$1(KSUploaderKit p0,KSUploaderKitTaskListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void onProgress(String p0,double p1){
       KSUploaderKit$1 u1 = KSUploaderKit$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u1, "1")) {
          return;
       }
       this.this$0.mMainHandler.post(new KSUploaderKit$1$1(this, p0, p1));
       return;
    }
    public void onStateChanged(String p0,IUploader$UploadStatus p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKit$1.class, "3")) {
          return;
       }
       KSUploaderKitCommon$Status status = p1.parseKitStatus();
       if (status != null) {
          this.this$0.mMainHandler.post(new KSUploaderKit$1$3(this, p0, status));
       }
       return;
    }
    public void onUploadFinished(String p0,KSUploaderCloseReason p1,long p2,String p3,String p4){
       KSUploaderKit$1 u1 = this;
       KSUploaderKit$1 u11 = KSUploaderKit$1.class;
       if (PatchProxy.isSupport(u11)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, u11, "2")) {
             return;
          }
       }
       KSUploaderKit$1$2 u1$2 = new KSUploaderKit$1$2(this, p0, p1, p2, p3, p4);
       u1.this$0.mMainHandler.post(v10);
       return;
    }
}
