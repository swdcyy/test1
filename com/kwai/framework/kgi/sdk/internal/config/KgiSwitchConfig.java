package com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig;
import java.io.Serializable;
import com.kwai.framework.kgi.sdk.internal.config.KgiSwitchConfig$a;
import nsd.u;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class KgiSwitchConfig implements Serializable	// class@001590
{
    public ArrayList channels;
    public boolean enable;
    public static final KgiSwitchConfig$a Companion;
    public static final KgiSwitchConfig TEST;
    public static final long serialVersionUID;

    static {
       KgiSwitchConfig.Companion = new KgiSwitchConfig$a(null);
       KgiSwitchConfig kgiSwitchCon = new KgiSwitchConfig();
       kgiSwitchCon.enable = true;
       Integer[] integerArray = new Integer[]{Integer.valueOf(true),Integer.valueOf(2),Integer.valueOf(3)};
       kgiSwitchCon.channels = CollectionsKt__CollectionsKt.r(integerArray);
       KgiSwitchConfig.TEST = kgiSwitchCon;
       KgiSwitchConfig.serialVersionUID = 0xff96b1e5e71443f6;
    }
    public void KgiSwitchConfig(){
       super();
    }
    public static final long getSerialVersionUID(){
       return KgiSwitchConfig.serialVersionUID;
    }
    public static final KgiSwitchConfig getTEST(){
       return KgiSwitchConfig.TEST;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, KgiSwitchConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
