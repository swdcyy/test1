package com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$1;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;

public class MediaCloudApiRequest$1 implements HttpRequester$ICallback	// class@000997
{
    public final MediaCloudApiRequest this$0;

    public void MediaCloudApiRequest$1(MediaCloudApiRequest p0){
       this.this$0 = p0;
       super();
    }
    public void onFinished(MediaCloudApiResponse p0,HttpRequestInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaCloudApiRequest$1.class, "1")) {
          return;
       }
       if (p0 == null || (p0.result <= null && NetworkUtils$NetErrorCode.NO_ERROR == p1.getNetErrorCode())) {
          p1.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
       }
       ApiManager$UploadStep publish = ApiManager$UploadStep.Publish;
       this.this$0.postCompleteEvent(publish, p1.getNetErrorCode(), this.this$0.mApiResponse.uploadToken);
       this.this$0.postReportAPILog(publish, p1);
       return;
    }
    public void onFinished(Object p0,HttpRequestInfo p1){
       this.onFinished(p0, p1);
    }
}
