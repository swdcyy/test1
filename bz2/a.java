package bz2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import bz2.a$a;
import java.util.Objects;
import tkd.b;
import tkd.d;
import my2.a;
import java.lang.Boolean;
import qs5.d;
import java.lang.Exception;
import java.lang.Long;
import lnc.i3;
import java.lang.Integer;
import java.lang.System;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import com.kwai.plugin.dva.work.c;
import bz2.a$b;
import com.kwai.plugin.dva.work.c$c;

public final class a	// class@00047f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final long a(){
       long a;
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!a.t().d("enableGetTrackIdByNativeMethod", false)) {
          Objects.requireNonNull(a$a.b);
          a = a$a.a;
          a$a.a = 1 + a;
          return a;
       }else if(!a.b()){
          return 0;
       }else {
          return d.a(0x669878e).getTrackId();
       }
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.d("live_effect_drawer_plugin");
    }
    public static final void c(boolean p0,long p1,Exception p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), p2, null, a.class, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       int i = (p0)? 1: 100;
       oi3.d("action", "load_plugin");
       oi3.c("code", Integer.valueOf(i));
       oi3.c("time_cost", Long.valueOf((System.currentTimeMillis() - p1)));
       oi3.d("message", Log.getStackTraceString(p2));
       u1.R("LIVE_EFFECT_DRAWER_PLUGIN", oi3.toString(), 3);
       return;
    }
    public static final void d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoa, "4")) {
          return;
       }
       if (a.b()) {
          return;
       }
       long l = System.currentTimeMillis();
       c uoc = d.g("live_effect_drawer_plugin", p0);
       if (uoc != null) {
          uoc.a(new a$b(l));
       }
       return;
    }
}
