package com.kwai.feature.post.api.feature.bridge.JsVideoQualityObserveParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsVideoQualityObserveParams implements Serializable	// class@001388
{
    public String result;

    public void JsVideoQualityObserveParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsVideoQualityObserveParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsVideoQualityObserveParams{result=\'"+this.result+'''+'}';
    }
}
