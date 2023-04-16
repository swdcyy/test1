package com.kuaishou.security.kste.export.KSTEApi;
import java.lang.Object;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams$Builder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import a.a.a.a.b.e.c;
import a.a.a.a.b.e.c$a;
import java.lang.System;
import a.a.a.a.b.e.c$b;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.KSTEContext$Mode;
import com.kuaishou.security.kste.export.KSTEResult;
import java.lang.Integer;
import com.kuaishou.security.kste.export.KSTEResult$Code;
import f.g$a;
import f.g;
import com.kuaishou.security.kste.export.InvokeCallback;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.util.ArrayList;
import k.a;
import f.c$b;
import java.util.concurrent.ConcurrentHashMap;
import d.d;
import f.m$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Boolean;
import f.j;
import java.util.List;

public class KSTEApi	// class@000f0e
{

    public void KSTEApi(){
       super();
    }
    public static synchronized int initialize(InitCommonKSTEParams$Builder p0){
       _monitor_enter(KSTEApi.class);
       c obj = PatchProxy.applyOneRefs(p0, null, KSTEApi.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSTEApi.class);
          return obj.intValue();
       }else {
          obj = new c();
          p0.recorder(obj);
          obj.a.a = "1.0.0.107.3722af76";
          obj.b.f = System.currentTimeMillis();
          _monitor_exit(KSTEApi.class);
          return b.b().a(p0.initMode(KSTEContext$Mode.ASYNC));
       }
    }
    public static KSTEResult invoke(String p0,String p1,String p2,byte[] p3,int p4){
       KSTEApi kSTEApi = KSTEApi.class;
       int i = 0;
       if (PatchProxy.isSupport(kSTEApi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, kSTEApi, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p3.length) {
          byte[] uobyteArray = new byte[i];
          return new KSTEResult(KSTEResult$Code.INVOKE_PARAM_INVALID, uobyteArray);
       }else {
          g$a uoa = g.b();
          uoa.d(p0);
          uoa.g(p1);
          uoa.i(p2);
          uoa.e(p3);
          uoa.a(p4);
          uoa.b(-1);
          uoa.c(null);
          uoa.h(m$f.b(p0));
          KSTEResult kSTEResult = b.b().g(uoa.f());
          c uoc = b.b().r().recorder();
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          if (uoc.b.g.size() <= 10) {
             uoc.b.g.add(new a(p2, l, 1));
          }
          return kSTEResult;
       }
    }
    public static void invokeWithCallback(String p0,String p1,String p2,byte[] p3,int p4,int p5,InvokeCallback p6){
       KSTEApi kSTEApi = KSTEApi.class;
       if (PatchProxy.isSupport(kSTEApi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, null, kSTEApi, "3")) {
             return;
          }
       }
       if (p3.length && p6 != null) {
          g$a uoa = g.b();
          uoa.d(p0);
          uoa.g(p1);
          uoa.i(p2);
          uoa.e(p3);
          uoa.a(p4);
          uoa.b((long)p5);
          uoa.c(p6);
          uoa.h(m$f.b(p0));
          g og = uoa.f();
          b uob = b.b();
          _monitor_enter(uob);
          c$b uob1 = new c$b();
          m$f.d.put(og.g(), uob1);
          String str = og.g();
          Objects.requireNonNull(str, "Null tag");
          uob1.a = str;
          uob1.e(0);
          uob1.c(0);
          uob1.b(m$f.e.schedule(new d(uob, og, uob1), og.h(), TimeUnit.MILLISECONDS));
          m$c.b("task invoke begin  "+System.currentTimeMillis()+" timeout:"+og.h());
          uob.g(og);
          _monitor_exit(uob);
          return;
       }else {
          throw new Exception("invokeWithCallback parameter invalid");
       }
    }
    public static boolean isInitialize(){
       Object obj = PatchProxy.apply(null, null, KSTEApi.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().t();
    }
    public static void registerBizId(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSTEApi.class, "4")) {
          return;
       }
       b.b().f.add(new j(p2, p0, p1));
       return;
    }
}
