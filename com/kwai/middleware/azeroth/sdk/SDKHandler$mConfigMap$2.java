package com.kwai.middleware.azeroth.sdk.SDKHandler$mConfigMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.middleware.azeroth.Azeroth2;
import com.kwai.middleware.azeroth.AzerothStorage;
import xb7.a;
import java.lang.String;
import java.util.HashMap;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class SDKHandler$mConfigMap$2 extends Lambda implements a	// class@000d6d
{
    public static final SDKHandler$mConfigMap$2 INSTANCE;

    static {
       SDKHandler$mConfigMap$2.INSTANCE = new SDKHandler$mConfigMap$2();
    }
    public void SDKHandler$mConfigMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       HashMap hashMap;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       Azeroth2 b = Azeroth2.B;
       String str = b.p().a().b("KEY_SDK_CONFIG_MAP");
       Type type = (!str.length())? 1: null;
       if (type) {
          hashMap = new HashMap();
       }else {
          hashMap = b.k().i(str, AzerothStorage.b);
          a.h(hashMap, "Azeroth2.gson.fromJson\(json, SDK_CONFIG_TYPE\)");
       }
       uConcurrentH.putAll(hashMap);
       return uConcurrentH;
    }
}
