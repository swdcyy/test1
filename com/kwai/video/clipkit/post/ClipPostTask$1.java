package com.kwai.video.clipkit.post.ClipPostTask$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.kwai.video.clipkit.post.ClipPostTask;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import android.os.SystemClock;
import com.kwai.video.clipkit.log.ClipPostTaskLogInfo;
import com.kwai.video.clipkit.post.ClipPostInfo;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipUploadInfo;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipUploadException;
import com.kwai.video.clipkit.post.ClipPostException;
import java.lang.Double;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class ClipPostTask$1 implements KSUploaderKitEventListener	// class@001aef
{
    public final ClipPostTask this$0;
    public final KSUploaderKitCommon$MediaType val$mediaType;

    public void ClipPostTask$1(ClipPostTask p0,KSUploaderKitCommon$MediaType p1){
       this.this$0 = p0;
       this.val$mediaType = p1;
       super();
    }
    public void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2){
       ClipPostTask$1 tthis$01;
       if (PatchProxy.isSupport(ClipPostTask$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ClipPostTask$1.class, "2")) {
          return;
       }
       ClipPostTask mLock = this.this$0.mLock;
       _monitor_enter(mLock);
       ClipPostTask mUploadKit = this.this$0.mUploadKit;
       if (mUploadKit != null) {
          mUploadKit.release();
          this.this$0.mUploadKit = null;
       }
       ClipPostTask$1 tthis$0 = this.this$0;
       boolean b = false;
       if (tthis$0.mIsEnablePipeline != null) {
          ClipPostTask uClipPostTas = 2;
          if (p0 != KSUploaderKitCommon$Status.Success && (p0 != KSUploaderKitCommon$Status.Cancel && tthis$0.getEncodeStatus() == uClipPostTas)) {
             KSClipLog.e("ClipPostTask", "pipeline upload failed,retry.errorCode:"+p1);
             tthis$01 = this.this$0;
             tthis$01.mIsEnablePipeline = b;
             tthis$01.mForceDisableResume = true;
             tthis$01.changeUploadStatus(true);
             this.this$0.onStatusChangedCallback();
             _monitor_exit(mLock);
             return;
          }else if(this.this$0.getEncodeStatus() != uClipPostTas){
             this.this$0.releasePipeline();
             KSClipLog.d("ClipPostTask", "releasePipeline upload complete");
          }
       }
       KSUploaderKitCommon$Status success = KSUploaderKitCommon$Status.Success;
       if (p0 != success) {
          ClipPostTask$1 tthis$02 = this.this$0;
          if (tthis$02.mIsStartWhenUploadFinish != null) {
             tthis$02.changeUploadStatus(true);
             tthis$01 = this.this$0;
             tthis$01.mIsStartWhenUploadFinish = b;
             tthis$01.start(tthis$01.mIsRetryStart);
             _monitor_exit(mLock);
             return;
          }
       }
       _monitor_exit(mLock);
       KSClipLog.i("ClipPostTask", "upload complete status:"+p0);
       this.this$0.mPostLogInfo.uploadEndTime = SystemClock.elapsedRealtime();
       if (p0 == success) {
          tthis$01 = this.this$0;
          p1.uploadProgress = 0x3ff0000000000000;
          if (tthis$01.mPostInfo.uploadInfo.uploadType == true) {
             p1.uploadToken = p2;
          }
          tthis$01.changeUploadStatus(3);
          this.this$0.onStatusChangedCallback();
          this.this$0.startUploadCoverIfNeeded();
       }else if(p0 == KSUploaderKitCommon$Status.Cancel){
          this.this$0.changeUploadStatus(true);
          this.this$0.onStatusChangedCallback();
          if (this.this$0.isError()) {
             tthis$01 = this.this$0;
             if (tthis$01.mIsCancel == null || tthis$01.mHasNotifiedCancel != null) {
             label_0125 :
                return;
             }
          }
          this.this$0.onCancelCallback();
          goto label_0125 ;
       }else {
          ClipUploadException uClipUploadE = new ClipUploadException(p1, "");
          ClipPostTask$1 tthis$03 = this.this$0;
          if (tthis$03.mClipPostException == null) {
             tthis$03.mClipPostException = new ClipPostException();
          }
          tthis$03 = this.this$0;
          p2.uploadException = uClipUploadE;
          tthis$03.changeUploadStatus(4);
          this.this$0.onStatusChangedCallback();
          goto label_0125 ;
       }
    }
    public void onProgress(double p0){
       ClipPostTask$1 u1 = ClipPostTask$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, u1, "1")) {
          return;
       }
       u1 = 0x3ff0000000000000;
       if (p0 - u1 > 0) {
          p0 = u1;
       }
       this.this$0.mPostLogInfo.uploadProgress = (ClipPostInfo.isNeedUploadCoverAfterPublish(this.this$0.mPostInfo.postFlag))? p0 * 0x3fef0a3d70a3d70a: p0;
       this.this$0.onProgressCallback();
       return;
    }
    public void onStateChanged(KSUploaderKitCommon$Status p0){
    }
    public void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPostTask$1.class, "3")) {
          return;
       }
       String str = "ClipPostTask";
       if (!TextUtils.isEmpty(p1.fileToken())) {
          KSClipLog.i(str, "onUploadFinished fileToken:"+p1.fileToken());
       }
       if (!TextUtils.isEmpty(p1.coverToken())) {
          KSClipLog.i(str, "onUploadFinished coverToken:"+p1.coverToken());
       }
       ClipPostTask$1 tval$mediaTy = this.val$mediaType;
       if (KSUploaderKitCommon$MediaType.File == tval$mediaTy) {
          String str1 = p1.filePath();
          if (!TextUtils.isEmpty(str1) && str1.equals(this.this$0.mPostInfo.exportPath)) {
             str1.uploadToken = p1.fileToken();
             str1.uploadGateWayResponse = p1.response();
          }else {
             ClipPostTask mClipResult = this.this$0.mClipResult;
             if (mClipResult.extraTokens == null) {
                mClipResult.extraTokens = new ArrayList();
             }
             this.this$0.mClipResult.extraTokens.add(p1.fileToken());
             if (p1.response() != null) {
                mClipResult = this.this$0.mClipResult;
                if (mClipResult.extraGateWayResponses == null) {
                   mClipResult.extraGateWayResponses = new ArrayList();
                }
                this.this$0.mClipResult.extraGateWayResponses.add(p1.response());
             }
          }
       }else if(KSUploaderKitCommon$MediaType.VideoWithCover == tval$mediaTy){
          if (KSUploaderKitCommon$MediaType.Image == p1.fileMediaType()) {
             p0.coverToken = p1.coverToken();
             p0.coverGateWayResponse = p1.response();
          }else {
             p0.uploadToken = p1.fileToken();
             p0.uploadGateWayResponse = p1.response();
          }
       }else {
          p0.uploadToken = p1.fileToken();
          p0.uploadGateWayResponse = p1.response();
       }
       return;
    }
}
