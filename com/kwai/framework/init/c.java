package com.kwai.framework.init.c;
import com.kwai.framework.init.c$a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import com.kwai.framework.init.b;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Math;
import com.kwai.framework.init.c$c;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import com.kwai.framework.init.c$b;
import brd.t;
import com.kwai.framework.init.e;
import brd.w;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import a76.f;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class c	// class@000b69
{
    public static final ThreadPoolExecutor a;
    public static final g b;

    static {
       c$a uoa = new c$a(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("init-bg-pool"));
       c.a = v8;
       c.b = b.b;
    }
    public void c(){
       super();
    }
    public static void a(Runnable p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoc, "5")) {
          return;
       }
       c.e(new c$c(p0), Math.max(p1, 0x2710));
       return;
    }
    public static void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "2")) {
          return;
       }
       c.e(p0, 4000);
       return;
    }
    public static void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       c.a.submit(p0);
       return;
    }
    public static void d(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "4")) {
          return;
       }
       c.e(new c$b(p0), 0x2710);
       return;
    }
    public static void e(Runnable p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoc, "7")) {
          return;
       }
       t.mergeDelayError(t.timer(p1, TimeUnit.MILLISECONDS), e.b()).observeOn(b.b(c.a)).doOnComplete(new f(p0)).subscribe(Functions.d(), c.b);
       return;
    }
}
