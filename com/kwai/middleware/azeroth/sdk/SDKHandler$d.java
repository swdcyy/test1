package com.kwai.middleware.azeroth.sdk.SDKHandler$d;
import v97.a;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import com.kwai.middleware.azeroth.net.response.AzerothApiError;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import java.util.HashMap;
import com.kwai.middleware.azeroth.sdk.SDKHandler$refreshSDKConfig$3$onApiSuccess$1;
import msd.p;
import tb7.d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.kwai.middleware.azeroth.sdk.a;
import java.lang.Runnable;
import f97.a;
import c97.d;
import h97.d;
import g97.e;
import rb7.c;
import l97.c;
import rb7.a;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.middleware.azeroth.sdk.SDKHandler$a;
import kotlin.TypeCastException;

public final class SDKHandler$d extends a	// class@000f1a
{
    public final SDKHandler c;

    public void SDKHandler$d(SDKHandler p0){
       this.c = p0;
       super();
    }
    public void f(AzerothApiError p0){
       a.q(p0, "e");
       Azeroth2.B.h().a("Azeroth request sdk config fail.", p0);
    }
    public void h(Object p0){
       a.q(p0, "result");
       this.c.e = "ON_FOREGROUND";
       Azeroth2 b = Azeroth2.B;
       b.h().e("Azeroth request sdk config success.");
       HashMap hashMap = new HashMap();
       d.a(p0, new SDKHandler$refreshSDKConfig$3$onApiSuccess$1(hashMap));
       this.c.a().clear();
       this.c.a().putAll(hashMap);
       a.a(new a(hashMap));
       p0 = d.a();
       a.h(p0, "Azeroth.get\(\)");
       p0 = p0.c();
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.kwai.middleware.azeroth.bridge.SDKConfigBridge");
       }
       p0.d();
       c.c.e(new c());
       p0 = new Intent("com.kwai.middleware.azeroth.UPDATE_SDK_CONFIG");
       SerializableHook.putExtra(p0, "KEY_SDK_CONFIG", hashMap);
       b.A(p0, SDKHandler.i.a());
       return;
    }
}
