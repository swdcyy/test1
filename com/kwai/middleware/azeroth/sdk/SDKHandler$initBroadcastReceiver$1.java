package com.kwai.middleware.azeroth.sdk.SDKHandler$initBroadcastReceiver$1;
import android.content.BroadcastReceiver;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import android.content.Context;
import android.content.Intent;
import com.kwai.middleware.azeroth.Azeroth2;
import tb7.b;
import q97.c;
import java.lang.String;
import android.os.Bundle;
import java.io.Serializable;
import yb7.b;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import c97.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import h97.d;
import g97.e;
import rb7.c;
import l97.c;
import rb7.a;
import kotlin.TypeCastException;

public final class SDKHandler$initBroadcastReceiver$1 extends BroadcastReceiver	// class@000d6c
{
    public final SDKHandler a;

    public void SDKHandler$initBroadcastReceiver$1(SDKHandler p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Azeroth2 b = Azeroth2.B;
       if (b.i(b.d())) {
          return;
       }
       b.h().e("Azeroth received update sdk config broadcast.");
       Map map = null;
       int i = (p1 == null)? map: b.c(p1.getExtras(), "KEY_SDK_CONFIG");
       if (i instanceof HashMap) {
          map = i;
       }
       if (map != null) {
          this.a.a().clear();
          this.a.a().putAll(map);
       }
       d uod = d.a();
       a.h(uod, "Azeroth.get\(\)");
       uod = uod.c();
       if (uod != null) {
          uod.d();
          c.c.e(new c());
          return;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type com.kwai.middleware.azeroth.bridge.SDKConfigBridge");
       }
    }
}
