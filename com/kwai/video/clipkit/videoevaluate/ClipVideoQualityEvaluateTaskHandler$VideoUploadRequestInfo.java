package com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;
import java.lang.Boolean;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo$VideoUploadRequestInfoData;
import java.util.List;

public class ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo	// class@001b02
{
    public ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo$VideoUploadRequestInfoData mRequestData;
    public int mResult;

    public void ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo(){
       super();
       this.mResult = 0;
    }
    public static ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo fromJsonString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.COMMON_GSON.h(p0, ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo.class);
    }
    public boolean usable(){
       ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo obj = PatchProxy.apply(null, this, ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mResult <= null) {
          return false;
       }
       obj = this.mRequestData;
       if (obj == null) {
          return false;
       }
       if (!(obj.mHttpEndPoint).isEmpty() && !(this.mRequestData.mToken).isEmpty()) {
          ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo$VideoUploadRequestInfoData mKtpEndPoint = this.mRequestData.mKtpEndPoint;
          if (mKtpEndPoint != null && mKtpEndPoint.size() >= 1) {
             return true;
          }
       }
       return false;
    }
}
