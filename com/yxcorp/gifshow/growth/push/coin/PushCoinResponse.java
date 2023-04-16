package com.yxcorp.gifshow.growth.push.coin.PushCoinResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.push.coin.PushCoinResponse$Companion;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class PushCoinResponse implements Serializable	// class@001496
{
    public PushCoinResponse$Companion$Data data;
    public int result;
    public static final PushCoinResponse$Companion Companion;
    public static final long serialVersionUID;

    static {
       PushCoinResponse.Companion = new PushCoinResponse$Companion(null);
       PushCoinResponse.serialVersionUID = 42;
    }
    public void PushCoinResponse(){
       super();
       this.result = -1;
    }
    public static final long getSerialVersionUID(){
       return PushCoinResponse.serialVersionUID;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, PushCoinResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
