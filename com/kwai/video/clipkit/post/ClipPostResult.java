package com.kwai.video.clipkit.post.ClipPostResult;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.video.clipkit.post.ClipPostResult$ClipPostPublishParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ClipPostResult	// class@001aeb
{
    public String coverGateWayResponse;
    public String coverToken;
    public List extraGateWayResponses;
    public List extraTokens;
    public String outPutPath;
    public ClipPostResult$ClipPostPublishParam publishParam;
    public String uploadGateWayResponse;
    public String uploadToken;
    public String watermarkPath;

    public void ClipPostResult(){
       super();
    }
    public String getCoverGateWayResponse(){
       return this.coverGateWayResponse;
    }
    public String getCoverToken(){
       return this.coverToken;
    }
    public List getExtraGateWayResponses(){
       return this.extraGateWayResponses;
    }
    public List getExtraTokens(){
       return this.extraTokens;
    }
    public String getOutPutPath(){
       return this.outPutPath;
    }
    public ClipPostResult$ClipPostPublishParam getPublishParam(){
       return this.publishParam;
    }
    public String getUploadGateWayResponse(){
       return this.uploadGateWayResponse;
    }
    public String getUploadToken(){
       return this.uploadToken;
    }
    public String getWatermarkPath(){
       return this.watermarkPath;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ClipPostResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ClipPostResult{outPutPath=\'"+this.outPutPath+'''+", uploadToken=\'"+this.uploadToken+'''+", coverToken=\'"+this.coverToken+'''+", extraTokens="+this.extraTokens+", watermarkPath=\'"+this.watermarkPath+'''+", uploadGateWayResponse=\'"+this.uploadGateWayResponse+'''+", coverGateWayResponse=\'"+this.coverGateWayResponse+'''+", publishParam="+this.publishParam+'}';
    }
}
