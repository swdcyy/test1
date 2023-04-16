package com.kuaishou.live.external.invoke.gzone.model.JsGamePayParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class JsGamePayParams implements Serializable	// class@001b91
{
    public String payData;
    public String type;

    public void JsGamePayParams(){
       super();
    }
    public boolean isEnergyPay(){
       Object obj = PatchProxy.apply(null, this, JsGamePayParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("energy").equals(this.type);
    }
    public boolean isKcoinPay(){
       Object obj = PatchProxy.apply(null, this, JsGamePayParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("kcoin").equals(this.type);
    }
}
