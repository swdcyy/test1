package com.facebook.react.modules.core.b;
import com.facebook.react.bridge.ReactApplicationContext;
import je.b;
import com.facebook.react.modules.core.ReactChoreographer;
import ae.e;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.facebook.react.modules.core.b$e;
import com.facebook.react.modules.core.b$c;
import java.util.PriorityQueue;
import com.facebook.react.modules.core.b$a;
import java.util.Comparator;
import android.util.SparseArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.bridge.ReactContext;
import ee.c;

public class b	// class@0012a0
{
    public final ReactApplicationContext a;
    public final b b;
    public final ReactChoreographer c;
    public final e d;
    public final Object e;
    public final Object f;
    public final PriorityQueue g;
    public final SparseArray h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final b$e k;
    public final b$c l;
    public b$b m;
    public boolean n;
    public boolean o;
    public boolean p;

    public void b(ReactApplicationContext p0,b p1,ReactChoreographer p2,e p3){
       super();
       this.e = new Object();
       this.f = new Object();
       this.i = new AtomicBoolean(true);
       this.j = new AtomicBoolean(false);
       this.k = new b$e(this);
       this.l = new b$c(this);
       this.n = false;
       this.o = false;
       this.p = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.g = new PriorityQueue(11, new b$a(this));
       this.h = new SparseArray();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       if (this.o != null) {
          this.c.f(ReactChoreographer$CallbackType.IDLE_EVENT, this.l);
          this.o = false;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       c uoc = c.c(this.a);
       if (this.n != null && (this.i.get() && !uoc.d())) {
          this.c.f(ReactChoreographer$CallbackType.TIMERS_EVENTS, this.k);
          this.n = false;
       }
    label_0030 :
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       if (this.i.get() && !this.j.get()) {
          this.b();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tf = this.f;
       _monitor_enter(tf);
       if (this.p != null) {
          this.f();
       }
       _monitor_exit(tf);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (this.n == null) {
          this.c.d(ReactChoreographer$CallbackType.TIMERS_EVENTS, this.k);
          this.n = true;
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       if (this.o == null) {
          this.c.d(ReactChoreographer$CallbackType.IDLE_EVENT, this.l);
          this.o = true;
       }
       return;
    }
}
