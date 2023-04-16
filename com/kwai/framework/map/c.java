package com.kwai.framework.map.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.map.MapPluginInitModule;
import android.os.Handler;
import ekd.s1;
import android.os.Looper;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import o96.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.plugin.tencent.map.MapLocationManager;

public final class c implements Runnable	// class@001684
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       Looper looper = s1.c().getLooper();
       long l = a.t().b("localLocationMinIntervalInSec", 0);
       if (!PatchProxy.isSupport(u.class) || !PatchProxy.applyVoidTwoRefs(looper, Long.valueOf(l), null, u.class, "1")) {
          MapLocationManager.getInstance().init(looper);
          u.r();
       }
       return;
    }
}
