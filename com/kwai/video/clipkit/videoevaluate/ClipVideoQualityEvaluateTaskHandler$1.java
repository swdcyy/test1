package com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.SystemClock;
import com.kwai.video.clipkit.log.ClipVideoQualityEvaluateLog;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.ClipExportException;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;

public class ClipVideoQualityEvaluateTaskHandler$1 implements KSUploaderKitEventListener	// class@001aff
{
    public final ClipVideoQualityEvaluateTaskHandler this$0;

    public void ClipVideoQualityEvaluateTaskHandler$1(ClipVideoQualityEvaluateTaskHandler p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2){
       if (PatchProxy.isSupport(ClipVideoQualityEvaluateTaskHandler$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ClipVideoQualityEvaluateTaskHandler$1.class, "1")) {
          return;
       }
       this.this$0.mTaskLog.mUploadEndTime = SystemClock.elapsedRealtime();
       String str = "ClipVideoQualityEvaluateTaskHandler";
       if (p0 == KSUploaderKitCommon$Status.Success) {
          KSClipLog.i(str, "upload success");
          this.this$0.triggerSuccess();
       }else if(p0 == KSUploaderKitCommon$Status.Fail){
          KSClipLog.e(str, "upload fail");
          ClipVideoQualityEvaluateTaskHandler$1 tthis$0 = this.this$0;
          ClipVideoQualityEvaluateTaskHandler mTaskLog = tthis$0.mTaskLog;
          mTaskLog.errorType = -2;
          mTaskLog.errorCode = p1;
          String str1 = (p2 != null)? p2: "ClipVideoQualityEvaluateTaskHandler upload fail";
          mTaskLog.errorMsg = str1;
          tthis$0.triggerError(new ClipExportException(-2, p1, p2));
       }else if(p0 == KSUploaderKitCommon$Status.Cancel){
          KSClipLog.i(str, "upload cancel");
          this.this$0.triggerCancel();
       }
       return;
    }
    public void onProgress(double p0){
    }
    public void onStateChanged(KSUploaderKitCommon$Status p0){
    }
    public void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1){
    }
}
