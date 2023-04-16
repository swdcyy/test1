package com.kwai.video.clipkit.post.ClipPostTask$2;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.kwai.video.clipkit.post.ClipPostTask;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.SystemClock;
import com.kwai.video.clipkit.log.ClipPostTaskLogInfo;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.post.ClipPostInfo;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.post.ClipUploadException;
import com.kwai.video.clipkit.post.ClipPostException;
import java.lang.Double;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;
import com.kwai.video.clipkit.post.ClipPostResult;

public class ClipPostTask$2 implements KSUploaderKitEventListener	// class@001af0
{
    public final ClipPostTask this$0;

    public void ClipPostTask$2(ClipPostTask p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2){
       if (PatchProxy.isSupport(ClipPostTask$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ClipPostTask$2.class, "2")) {
          return;
       }
       p2.uploadCoverWithoutPreUploadEndTime = SystemClock.elapsedRealtime();
       KSClipLog.i("ClipPostTask", this.this$0.mPostInfo.getId()+"uploading cover is completed, status:"+p0+" errorCode:"+p1);
       int i = 1;
       if (KSUploaderKitCommon$Status.Success == p0) {
          i = 3;
          p0.uploadProgress = 0x3ff0000000000000;
       }else if(KSUploaderKitCommon$Status.Fail == p0){
          i = 4;
          ClipUploadException uClipUploadE = new ClipUploadException(p1, "failed to upload cover");
          ClipPostTask$2 tthis$0 = this.this$0;
          if (tthis$0.mClipPostException == null) {
             tthis$0.mClipPostException = new ClipPostException();
          }
          tthis$0.uploadException = uClipUploadE;
       }
       this.this$0.changeCoverUploadStatusWithoutPreUpload(i);
       this.this$0.onStatusChangedCallback();
       return;
    }
    public void onProgress(double p0){
       ClipPostTask$2 u2 = ClipPostTask$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u2, "1")) {
          return;
       }
       u2 = 0x3ff0000000000000;
       if (p0 - u2 > 0) {
          p0 = u2;
       }
       u2 = this.this$0;
       u2.mPostLogInfo.uploadProgress = (p0 * 0x3f9eb851eb851eb8) + 0x3fef0a3d70a3d70a;
       u2.onProgressCallback();
       return;
    }
    public void onStateChanged(KSUploaderKitCommon$Status p0){
    }
    public void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPostTask$2.class, "3")) {
          return;
       }
       KSClipLog.i("ClipPostTask", this.this$0.mPostInfo.getId()+"uploading cover is finished, closeReason:"+p0+",cover token:"+p1.fileToken()+",cover path:"+p1.filePath());
       if (KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded == p0) {
          p0.coverToken = p1.fileToken();
          p0.coverGateWayResponse = p1.filePath();
       }
       return;
    }
}
