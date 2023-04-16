package com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformResult;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformResult$PublishData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsPublishToMiddlePlatformResult implements Serializable	// class@001363
{
    public JsPublishToMiddlePlatformResult$PublishData mData;
    public int mResult;
    public static final long serialVersionUID = 0x2467b9857ae179a8;

    public void JsPublishToMiddlePlatformResult(int p0,JsPublishToMiddlePlatformResult$PublishData p1){
       super();
       this.mResult = p0;
       this.mData = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsPublishToMiddlePlatformResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsPublishToMiddlePlatformResult{mResult="+this.mResult+", mData="+this.mData+'}';
    }
}
