package com.tachikoma.core.bridge.a$b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import com.tachikoma.core.bridge.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import po8.a;
import java.lang.Runnable;
import com.tkruntime.v8.V8;
import java.lang.Boolean;
import java.util.Iterator;
import com.tachikoma.core.bridge.a$a;
import java.util.List;
import java.util.Collection;
import java.lang.RuntimeException;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.kwai.robust.PatchProxyResult;
import iq8.x;
import com.tachikoma.core.bridge.a$b$a;
import java.lang.Integer;
import com.tachikoma.core.bridge.a$b$b;
import java.lang.StringBuilder;

public class a$b	// class@000d3f
{
    public long a;
    public final CopyOnWriteArrayList b;
    public AtomicInteger c;
    public final CopyOnWriteArraySet d;
    public final ConcurrentHashMap e;
    public final CopyOnWriteArrayList f;
    public AtomicBoolean g;
    public boolean h;
    public AtomicLong i;
    public AtomicInteger j;

    public void a$b(long p0){
       super();
       this.a = 0;
       this.b = new CopyOnWriteArrayList();
       this.c = new AtomicInteger(0);
       this.d = new CopyOnWriteArraySet();
       this.e = new ConcurrentHashMap();
       this.f = new CopyOnWriteArrayList();
       this.g = new AtomicBoolean(0);
       this.h = false;
       this.i = new AtomicLong(0);
       this.j = new AtomicInteger(0);
       this.a = p0;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "4")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "3")) {
          return;
       }
       a.b(true, this).execute(new a(this));
       return;
    }
    public final void c(boolean p0,V8 p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "11")) {
          return;
       }
       p1.releaseRuntime();
       if (a.d()) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             if (uoa != null && uoa.f.get() <= 0) {
                V8.destroyCodeCache(uoa.b);
                this.j.addAndGet(1);
                this.f.remove(uoa);
             }
          }
       }
       if (!p0 && (!PatchProxy.applyVoid(null, this, uob, "12") && this.a)) {
          if (!a.b.contains(this)) {
             this.b.clear();
             this.d.clear();
             Iterator iterator1 = this.e.values().iterator();
             while (iterator1.hasNext()) {
                a$a uoa1 = iterator1.next();
                if (uoa1 != null) {
                   V8.destroyCodeCache(uoa1.b);
                }
             }
             this.e.clear();
             V8._releaseIsolatePtr(this.a);
             this.c.set(0);
             this.a = 0;
          }else {
             throw new RuntimeException("shared isolate can not be released");
          }
       }
       return;
    }
    public synchronized c d(){
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.b.isEmpty()) {
          obj = this.b;
          objArray = obj.remove((obj.size() - 1));
       }
       if (this.b.isEmpty()) {
          if (x.c()) {
             x.d(new a$b$a(this), 0);
          }else {
             this.b();
          }
       }
       return objArray;
    }
    public a$a e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.get(p0);
    }
    public boolean f(String p0,int p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a$a uoa = this.e.get(p0);
       boolean b = (uoa != null && uoa.c == p1)? true: false;
       return b;
    }
    public void g(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "6")) {
          return;
       }
       if (!a.d()) {
          this.e.put(p0.a, p0);
       }else {
          a$a uoa = this.e(p0.a);
          if (uoa != null) {
             if (uoa.c == p0.c) {
                return;
             }else {
                this.e.remove(p0.a);
                this.i.addAndGet((- uoa.e));
                this.f.add(uoa);
             }
          }
          this.e.put(p0.a, p0);
          this.i.addAndGet(p0.e);
       }
       return;
    }
    public void h(boolean p0){
       this.h = p0;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       if (this.b.isEmpty()) {
          if (this.h != null) {
             x.d(new a$b$b(this), 2);
          }else {
             this.b();
          }
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+"# mRef = "+this.c+" , mPtr = "+this.a+" , mCompileRes size = "+this.e.size();
    }
}
