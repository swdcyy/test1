package com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest$1;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.apicenter.GeneralApiRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;

public class GeneralApiRequest$1 implements Runnable	// class@00098e
{
    public final GeneralApiRequest this$0;

    public void GeneralApiRequest$1(GeneralApiRequest p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, GeneralApiRequest$1.class, "1")) {
          return;
       }
       this.this$0.postCompleteEvent(ApiManager$UploadStep.Publish, null, null);
       return;
    }
}
