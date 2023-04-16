package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$4;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.stats.HttpUploadStats;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;

public class HttpUploadAgent$4 implements HttpRequester$ICallback	// class@0009c4
{
    public final HttpUploadAgent this$0;
    public final int val$chunkSize;

    public void HttpUploadAgent$4(HttpUploadAgent p0,int p1){
       this.this$0 = p0;
       this.val$chunkSize = p1;
       super();
    }
    public void onFinished(MediaCloudApiResponse p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpUploadAgent$4.class, "1")) {
          return;
       }
       if (p0 != null && 1 == p0.result) {
          KSUploaderKitLog.d("KSUploaderKit-HttpUploadAgent", "http upload fragment successfully, response:"+p1.getResponseBody());
          HttpUploadAgent mUploadedFil = this.this$0.mUploadedFileSizeLock;
          _monitor_enter(mUploadedFil);
          HttpUploadAgent$4 tthis$0 = this.this$0;
          HttpUploadAgent$4 tval$chunkSi = this.val$chunkSize;
          tthis$0.mUploadedFileSize = tthis$0.mUploadedFileSize + (long)tval$chunkSi;
          _monitor_exit(mUploadedFil);
          tthis$0.mStats.didSendData((long)tval$chunkSi);
          this.this$0.updateProgress();
          this.this$0.createChunkAndStartUpload();
       }else {
          KSUploaderKitLog.e("KSUploaderKit-HttpUploadAgent", "http upload fragment failed, http code:"+p1.getHttpCode()+",kitErrorCode:"+p1.getNetErrorCode());
          if (p0 == null || (p0.result <= null && NetworkUtils$NetErrorCode.NO_ERROR == p1.getNetErrorCode())) {
             p1.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
          }
          this.this$0.finishUpload(KSUploaderKitCommon$Status.Fail, NetworkUtils.netErrorCode2KitErrorCodeValue(ApiManager$UploadStep.UploadFragment, p1.getNetErrorCode()), p1);
       }
       return;
    }
    public void onFinished(Object p0,HttpRequestInfo p1){
       this.onFinished(p0, p1);
    }
}
