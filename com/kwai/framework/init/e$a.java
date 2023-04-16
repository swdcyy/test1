package com.kwai.framework.init.e$a;
import a76.b;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.init.e;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.Future;
import t45.c;
import java.util.concurrent.FutureTask;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.w;
import brd.z;
import lrd.b;
import a76.o;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class e$a implements b	// class@000b6b
{

    public void e$a(){
       super();
    }
    public void a(Runnable p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, e$a.class, "1")) {
          return;
       }
       if (e.a()) {
          List a = e.a;
          _monitor_enter(a);
          a.add(p0);
          _monitor_exit(a);
       }else {
          p0.run();
       }
       return;
    }
    public void b(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "4")) {
          return;
       }
       List b = e.b;
       _monitor_enter(b);
       b.remove(p0);
       _monitor_exit(b);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "6")) {
          return;
       }
       List a = e.a;
       _monitor_enter(a);
       if (!a.isEmpty()) {
          Iterator iterator = a.iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
          e.a.clear();
       }
       _monitor_exit(a);
       List b = e.b;
       _monitor_enter(b);
       if (!b.isEmpty()) {
          Iterator iterator1 = b.iterator();
          while (iterator1.hasNext()) {
             c.g(iterator1.next());
          }
          e.b.clear();
       }
       _monitor_exit(b);
       return;
    }
    public void d(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       e.a.remove(p0);
       return;
    }
    public void e(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e$a.class, "5")) {
          return;
       }
       FutureTask uFutureTask = new FutureTask(p0, Boolean.TRUE);
       t ot = e.b();
       long l = 4000;
       if (p2) {
          l = 0x2710;
       }
       t.concat(ot, t.empty().delay(l, TimeUnit.MILLISECONDS)).observeOn(b.e()).doOnComplete(new o(uFutureTask)).subscribe(Functions.d(), Functions.e);
       return;
    }
    public void f(Runnable p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e$a.class, "3")) {
          return;
       }
       if (e.a()) {
          List b = e.b;
          _monitor_enter(b);
          b.add(p0);
          _monitor_exit(b);
       }else {
          c.g(p0);
       }
       return;
    }
}
