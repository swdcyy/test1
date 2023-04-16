package com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformResult$PublishData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsPublishToMiddlePlatformResult$PublishData implements Serializable	// class@001362
{
    public int mProgress;
    public String mStatus;
    public String mZtPhotoId;
    public static final JsPublishToMiddlePlatformResult$PublishData FAILED;
    public static final JsPublishToMiddlePlatformResult$PublishData START;
    public static final long serialVersionUID;

    static {
       JsPublishToMiddlePlatformResult$PublishData.START = new JsPublishToMiddlePlatformResult$PublishData(0, "uploading", "");
       JsPublishToMiddlePlatformResult$PublishData.FAILED = new JsPublishToMiddlePlatformResult$PublishData(0, "failed", "");
    }
    public void JsPublishToMiddlePlatformResult$PublishData(int p0,String p1,String p2){
       super();
       this.mProgress = p0;
       this.mStatus = p1;
       this.mZtPhotoId = p2;
    }
    public static JsPublishToMiddlePlatformResult$PublishData success(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsPublishToMiddlePlatformResult$PublishData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsPublishToMiddlePlatformResult$PublishData(100, "success", p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsPublishToMiddlePlatformResult$PublishData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PublishData{mProgress="+this.mProgress+", mStatus=\'"+this.mStatus+'''+", mZtPhotoId=\'"+this.mZtPhotoId+'''+'}';
    }
}
