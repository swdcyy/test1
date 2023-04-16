package com.kwai.framework.init.e;
import java.util.ArrayList;
import android.os.Handler;
import ekd.s1;
import android.os.Looper;
import android.os.HandlerThread;
import java.util.concurrent.CountDownLatch;
import com.kwai.framework.init.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tti.TTIStrategy;
import com.yxcorp.utility.Log;
import com.kwai.component.tti.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import brd.t;
import java.util.concurrent.FutureTask;
import com.kwai.framework.init.d;
import java.lang.Runnable;
import java.util.concurrent.Future;
import a76.h;
import java.util.concurrent.RunnableFuture;
import erd.g;
import com.kwai.framework.init.e$b;
import brd.z;
import a76.i;
import ekd.k1;
import a76.n;
import a76.l;
import java.lang.Long;
import a76.k;
import a76.m;

public final class e	// class@000b6d
{
    public static final List a;
    public static final List b;
    public static boolean c;
    public static Handler d;
    public static t e;
    public static CountDownLatch f;
    public static b g;

    static {
       e.a = new ArrayList();
       e.b = new ArrayList();
       e.d = new Handler(s1.b().getLooper());
       t ot = null;
       e.e = ot;
       e.f = new CountDownLatch(1);
       e.g = new e$a();
       if (PatchProxy.applyVoid(ot, ot, e.class, "1")) {
       }else if(PatchProxy.applyVoid(ot, ot, TTIStrategy.class, "1")){
          Log.g("TTI.Strategy", "doInject");
          e.g = new a();
       }
    }
    public void e(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!e.c && SystemUtil.L(a.a().a()))? true: false;
       return b;
    }
    public static t b(){
       t e = e.e;
       if (e != null) {
          return e;
       }
       FutureTask uFutureTask = new FutureTask(d.b, Boolean.TRUE);
       e = t.fromFuture(uFutureTask).doOnSubscribe(new h(uFutureTask)).subscribeOn(e$b.a);
       e.e = e;
       return e;
    }
    public static void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "5")) {
          return;
       }
       k1.o(new i(p0));
       return;
    }
    public static void d(Runnable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "2")) {
          return;
       }
       e.f(p0, p1, false, true);
       return;
    }
    public static void e(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, e.class, "3")) {
          return;
       }
       e.f(p0, p1, p2, true);
       return;
    }
    public static void f(Runnable p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, e.class, "4")) {
          return;
       }
       k1.o(new n(p0, p1, p2, p3));
       return;
    }
    public static void g(Runnable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "6")) {
          return;
       }
       e.h(p0, p1, false);
       return;
    }
    public static void h(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, e.class, "7")) {
          return;
       }
       e.d.post(new l(p0, p1, p2));
       return;
    }
    public static void i(Runnable p0,String p1,long p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, e.class, "8")) {
          return;
       }
       e.d.postDelayed(new k(p0, p1), p2);
       return;
    }
    public static void j(Runnable p0,String p1,boolean p2){
       e.d.post(new m(p0, p1, p2));
    }
}
