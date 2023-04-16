package com.kwai.feature.api.platform.bridge.beans.RubasPublishParams;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Long;

public class RubasPublishParams implements Serializable, a	// class@00106f
{
    public String event;
    public Object payload;
    public Object token;
    public static final long serialVersionUID = 0xccd0b0c0f53dfa;

    public void RubasPublishParams(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RubasPublishParams.class, "1")) {
          return;
       }
       RubasPublishParams tpayload = this.payload;
       if (tpayload instanceof Double) {
          this.payload = Long.valueOf(tpayload.longValue());
       }
       return;
    }
}
