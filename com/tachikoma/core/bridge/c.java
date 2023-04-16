package com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.a$b;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import iq8.x;
import com.tachikoma.core.bridge.e;
import com.tkruntime.v8.V8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8ObjectProxy;
import java.util.Map;
import iq8.r;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import no8.e;
import com.tachikoma.core.debug.c;
import com.tachikoma.core.debug.b;
import aq8.j;
import java.util.Objects;
import com.tachikoma.core.component.timer.TKTimer;
import com.tachikoma.core.component.network.Network;
import com.tachikoma.core.bridge.a$a;
import java.util.concurrent.atomic.AtomicInteger;
import com.tachikoma.core.bridge.a;
import java.util.concurrent.Executor;
import po8.b;
import java.lang.Runnable;
import java.lang.Integer;
import no8.a;
import lp8.b;
import lp8.c;
import com.tkruntime.v8.V8Trace;
import java.util.ArrayList;
import qp8.d;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import zp8.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import com.tkruntime.v8.V8Object;

public class c	// class@000d42
{
    public final V8 a;
    public int b;
    public String c;
    public boolean d;
    public String e;
    public final Map f;
    public boolean g;
    public final a$b h;
    public boolean i;
    public a$a j;
    public int k;
    public int l;
    public long m;
    public int n;

    public void c(boolean p0,a$b p1,String p2){
       super();
       this.d = false;
       this.f = new HashMap();
       this.g = false;
       this.i = false;
       this.j = null;
       this.k = 0;
       this.l = 0;
       long l = 0;
       this.m = l;
       this.n = 0;
       this.g = p0;
       this.h = p1;
       if (p0) {
          _monitor_enter(p1);
          p0 = x.c();
          if (p0) {
             p1.h(true);
          }
          e uoe = e.a(p1.a, true);
          this.a = uoe;
          if (p0) {
             p1.h(false);
          }
          this.n(uoe);
          _monitor_exit(p1);
       }else {
          e uoe1 = e.a(l, true);
          this.a = uoe1;
          this.n(uoe1);
       }
       this.m(p2);
       return;
    }
    public static c c(boolean p0,a$b p1,String p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, null, c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new c(p0, p1, p2);
    }
    public void a(String p0,V8ObjectProxy p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "10")) {
          return;
       }
       this.b();
       if (this.f.containsKey(p0) && r.a()) {
          throw new RuntimeException(p0+" is already added in global js object.");
       }
       this.f.put(p0, p1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       throw new RuntimeException("JSContext is already destroy\(\).");
    }
    public void d(){
       c ta;
       c te;
       a$b uob = a$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "7")) {
          return;
       }
       this.b();
       this.d = true;
       this.f.clear();
       String str = "10";
       if (!e.b().f()) {
          ta = this.a;
          if (ta != null) {
             te = this.e;
             if (!PatchProxy.applyVoidTwoRefs(ta, te, objArray, c.class, str)) {
                b a = c.a;
                if (a != null) {
                   a.a(ta, te);
                }
             }
          }
       }
       j oj = j.b();
       c tc = this.c;
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoidOneRefs(tc, oj, j.class, "5")) {
          oj = oj.a;
          if (oj != null) {
             oj.destroy(tc);
          }
       }
       Network.removeRequestDelegate(this);
       Network.unRegisterNetworkCallbackInner(this);
       this.a.close(false);
       ta = this.j;
       if (ta != null) {
          tc = this.h;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(ta, tc, uob, "9") && ta != null) {
             ta.f.decrementAndGet();
          }
       }
       ta = this.h;
       tc = this.g;
       te = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(tc), te, ta, uob, str)) {
          ta.c.decrementAndGet();
          Executor uExecutor = (tc != null)? a.c.get(ta): a.d.remove(ta);
          if (uExecutor != null) {
             uExecutor.execute(new b(ta, tc, te));
          }else {
             ta.c(tc, te);
          }
       }
       return;
    }
    public Object e(String p0,String p1,int p2,String p3,String p4,int p5){
       Boolean obj;
       c a;
       long l1;
       a$a uoa2;
       a$a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       c uoc = c.class;
       int i1 = 2;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),p3,p4,Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, uoa, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.c;
       long l = 0;
       if (obj.booleanValue()) {
          if (c.a().t3()) {
             String str = "executeJS";
             V8Trace.traceLog(oobject, str);
             ArrayList uArrayList = V8Trace.parseTraceTag(p0);
             if (uArrayList != null) {
                uoa.a.businessName = uArrayList.get(0);
                uoa.a.bundleId = uArrayList.get(1);
                uoa.a.sessionId = uArrayList.get(i1);
             }
             a = uoa.a;
             a.contextName = uoa.e;
             a.currentState = 1;
             d.p().h(uoa.a, "", str);
          }else {
             l1 = System.nanoTime();
          label_0092 :
             if (!c.a().b() && !TextUtils.isEmpty(p1)) {
                a$a uoa1 = uoa.h.e(oobject1);
                uoa.j = uoa1;
                if (uoa1 != null) {
                   if (!uoa1.d.a - uoa.a.getBindingIsolatePtr()) {
                      a = uoa.j;
                      if (a.c == i) {
                         uoa2 = a.b;
                      label_00ed :
                         boolean b = (uoa2 - l)? true: false;
                         uoa.i = b;
                         if (b) {
                            a = uoa.h;
                            c j = uoa.j;
                            Objects.requireNonNull(a);
                            if (!PatchProxy.applyVoidOneRefs(j, a, a$b.class, "8") && j != null) {
                               j.f.incrementAndGet();
                            }
                         }
                         boolean b1 = x.c();
                         if (b1) {
                            uoa.h.h(1);
                         }
                         uoa.k = uoa.h.f.size();
                         uoa.l = uoa.h.e.size();
                         uoa.m = uoa.h.i.get();
                         uoa.n = uoa.h.j.get();
                         Object obj1 = uoa.a.executeScript(p3, p4, p5, uoa2);
                         if (b1) {
                            uoa.h.h(0);
                         }
                         if (obj.booleanValue()) {
                            if (c.a().t3()) {
                               d.p().k(uoa.a);
                               uoa.a.currentState = i1;
                            }else {
                               System.out.println("V8Trace executeJS ["+uoa.e+"] cost "+((float)((System.nanoTime() - l1) / 1000) / 1000.00f));
                            }
                         }
                         return obj1;
                      }
                   }
                   a.c("compile isolate is not the same with evaluate Isolate, scriptId: "+oobject1+", compileVersionCode: "+uoa.j.c+", bundleVersionCode: "+i);
                }
             }
             uoa2 = l;
             goto label_00ed ;
          }
       }
       l1 = l;
       goto label_0092 ;
    }
    public a$b f(){
       return this.h;
    }
    public V8 g(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b();
       return this.a;
    }
    public String h(){
       return this.e;
    }
    public int i(){
       return this.b;
    }
    public String j(){
       return this.c;
    }
    public boolean k(){
       return this.d;
    }
    public V8Object l(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b();
       return new V8Object(this.a);
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (e.b().f()) {
          return;
       }
       this.b();
       this.e = p0;
       if (TextUtils.isEmpty(p0)) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b obj = PatchProxy.apply(null, null, c.class, "9");
          if (obj != patchProxyRe) {
          }else {
             obj = c.a;
             if (obj != null) {
                obj = PatchProxy.apply(null, obj, b.class, "5");
                if (obj != patchProxyRe) {
                }else {
                   obj = "TK_DEBUG_"+b.b.getAndIncrement();
                }
             }else {
                obj = "";
             }
          }
          this.e = obj;
       }
       return;
    }
    public final void n(V8 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.h.a = p0.getBindingIsolatePtr();
       this.h.c.incrementAndGet();
       return;
    }
}
