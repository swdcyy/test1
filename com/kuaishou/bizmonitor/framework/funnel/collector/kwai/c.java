package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c;
import java.util.concurrent.atomic.AtomicInteger;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$d;
import java.lang.String;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$e;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$f;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$g;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$h;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$i;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$j;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$k;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$l;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$a;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$b;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$c;
import java.lang.Object;
import android.os.Handler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;
import android.content.SharedPreferences;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public class c	// class@001165
{
    public static Handler a;
    public static final AtomicInteger b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static SharedPreferences o;

    static {
       c.b = new AtomicInteger();
       c.c = new c$d("delay", 2);
       c.d = new c$e("cancelDelay", 1);
       c.e = new c$f("getAbInt", 2);
       c.f = new c$g("getAbString", 2);
       c.g = new c$h("getAbBool", 2);
       c.h = new c$i("getKSwitchInt", 2);
       c.i = new c$j("getKSwitchString", 2);
       c.j = new c$k("getKSwitchBool", 2);
       c.k = new c$l("getPrefsInt", 2);
       c.l = new c$a("getPrefsLong", 2);
       c.m = new c$b("getPrefsString", 2);
       c.n = new c$c("getPrefsBool", 2);
    }
    public void c(){
       super();
    }
    public static synchronized Handler a(){
       _monitor_enter(c.class);
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(c.class);
          return obj;
       }else if(c.a == null){
          c.a = new Handler(Looper.getMainLooper());
       }
       _monitor_exit(c.class);
       return c.a;
    }
    public static SharedPreferences b(){
       Object obj = PatchProxy.apply(null, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.o == null) {
          c.o = b.c(a.b(), a.w, 0);
       }
       return c.o;
    }
}
