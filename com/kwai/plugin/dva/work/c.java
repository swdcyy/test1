package com.kwai.plugin.dva.work.c;
import java.lang.Object;
import java.lang.System;
import sj7.c;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.WorkExecutors;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$b;
import java.util.Objects;
import sj7.b;
import java.util.concurrent.CountDownLatch;
import com.kwai.plugin.dva.work.c$a;
import java.lang.StringBuilder;
import java.lang.Thread;
import qj7.d;
import java.lang.Float;

public final class c	// class@0013a7
{
    public long a;
    public final Object b;
    public Object c;
    public int d;
    public Exception e;
    public float f;
    public final c g;

    public void c(){
       super();
       this.a = (long)this.hashCode() + System.currentTimeMillis();
       this.b = new Object();
       this.f = 0;
       this.g = new c();
    }
    public static c i(Exception p0){
       c obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.q(0x2904);
       obj.p(p0);
       return obj;
    }
    public static c j(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.q(0x2710);
       obj.o(p0);
       return obj;
    }
    public static c k(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.q(0x27d8);
       obj.o(p0);
       return obj;
    }
    public synchronized c a(c$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(WorkExecutors.b, p0);
    }
    public synchronized c b(Executor p0,c$c p1){
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       c$b uob = new c$b(p0, p1);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidTwoRefs(this, uob, obj, c.class, "2")) {
          obj.a(uob);
          uob.a(this);
       }
       return this;
    }
    public Object c(){
       CountDownLatch obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CountDownLatch(1);
       Object[] objArray = new Object[]{null};
       Exception[] uExceptionAr = new Exception[]{null};
       this.b(WorkExecutors.c, new c$a(this, objArray, obj, uExceptionAr));
       d.c("[blockGet] wait task finish at "+Thread.currentThread().getName());
       obj.await();
       if (objArray[0] != null) {
          return objArray[0];
       }
       if (uExceptionAr[0] == null) {
          return null;
       }
       throw uExceptionAr[0];
    }
    public synchronized c d(Exception p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       _monitor_enter(obj);
       this.q(0x2904);
       this.p(p0);
       _monitor_exit(obj);
       this.l();
       return this;
    }
    public Object e(){
       return this.c;
    }
    public long f(){
       return this.a;
    }
    public int g(){
       return this.d;
    }
    public boolean h(){
       boolean b = (this.d == 0x2904)? true: false;
       return b;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       this.g.b(this);
       return;
    }
    public synchronized c m(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoc = this.b;
       _monitor_enter(uoc);
       this.q(0x2774);
       this.f = p0;
       _monitor_exit(uoc);
       this.l();
       return this;
    }
    public c n(c$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g.c(new c$b(WorkExecutors.b, p0));
       return this;
    }
    public final void o(Object p0){
       this.c = p0;
    }
    public final void p(Exception p0){
       this.e = p0;
    }
    public final void q(int p0){
       this.d = p0;
    }
    public synchronized c r(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       _monitor_enter(obj);
       this.q(0x27d8);
       this.o(p0);
       _monitor_exit(obj);
       this.l();
       return this;
    }
}
