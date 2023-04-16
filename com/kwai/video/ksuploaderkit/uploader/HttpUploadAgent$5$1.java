package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$5$1;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$5;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils;

public class HttpUploadAgent$5$1 implements HttpRequester$ICallback	// class@0009c5
{
    public final HttpUploadAgent$5 this$1;

    public void HttpUploadAgent$5$1(HttpUploadAgent$5 p0){
       this.this$1 = p0;
       super();
    }
    public void onFinished(MediaCloudApiResponse p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpUploadAgent$5$1.class, "1")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "http upload fragment finished, response:"+p1.getResponseBody()+" httpCode: "+p1.getHttpCode()+"netErrorCode: "+p1.getNetErrorCode());
       if (p0 != null && 1 == p0.result) {
          this.this$1.this$0.finishUpload(KSUploaderKitCommon$Status.Success, 0, p1);
       }else if(p0 == null || (p0.result <= null && NetworkUtils$NetErrorCode.NO_ERROR == p1.getNetErrorCode())){
          p1.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
       }
       this.this$1.this$0.finishUpload(KSUploaderKitCommon$Status.Fail, NetworkUtils.netErrorCode2KitErrorCodeValue(ApiManager$UploadStep.UploadFragmentFinished, p1.getNetErrorCode()), p1);
       return;
    }
    public void onFinished(Object p0,HttpRequestInfo p1){
       this.onFinished(p0, p1);
    }
}
