package com.kwai.middleware.azeroth.sdk.SDKHandler$refreshSDKConfig$3$onApiSuccess$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import qrd.l1;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class SDKHandler$refreshSDKConfig$3$onApiSuccess$1 extends Lambda implements p	// class@000f1b
{
    public final HashMap $configMap;

    public void SDKHandler$refreshSDKConfig$3$onApiSuccess$1(HashMap p0){
       this.$configMap = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,JsonElement p1){
       a.q(p0, "key");
       a.q(p1, "element");
       String str = p1.toString();
       a.h(str, "element.toString\(\)");
       this.$configMap.put(p0, str);
    }
}
