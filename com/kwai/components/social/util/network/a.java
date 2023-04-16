package com.kwai.components.social.util.network.a;
import ok.x;
import java.lang.Object;
import li5.a;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.reflect.Type;
import fg6.a;
import com.google.gson.JsonElement;
import com.kwai.components.social.util.network.NetworkTraceSwitchInfo;
import java.lang.Class;
import com.google.gson.Gson;

public final class a implements x	// class@000cdf
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       NetworkTraceSwitchInfo networkTrace = null;
       JsonObject value = a.t().getValue("enableSocialRequestManager", JsonObject.class, networkTrace);
       if (value != null) {
          try{
             networkTrace = a.a.h(value.toString(), NetworkTraceSwitchInfo.class);
          }catch(java.lang.Exception e0){
          }
       }
       return networkTrace;
    }
}
