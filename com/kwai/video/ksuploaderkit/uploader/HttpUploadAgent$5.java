package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$5;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.apicenter.IApiService;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import retrofit2.a;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$5$1;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;

public class HttpUploadAgent$5 implements Runnable	// class@0009c6
{
    public final HttpUploadAgent this$0;

    public void HttpUploadAgent$5(HttpUploadAgent p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent$5.class, "1")) {
          return;
       }
       int i = this.this$0.mChunkIndex.get();
       KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "upload fragment data finished, total count:"+i+" token:"+this.this$0.mUploadToken);
       HttpUploadAgent$5 tthis$0 = this.this$0;
       this.this$0.mHttpRequester.doRequestAsync(tthis$0.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(tthis$0.mServerHost)).fragmentUploadFinished(i, this.this$0.mUploadToken), MediaCloudApiResponse.class, new HttpUploadAgent$5$1(this));
       return;
    }
}
