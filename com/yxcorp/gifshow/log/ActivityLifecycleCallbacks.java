package com.yxcorp.gifshow.log.ActivityLifecycleCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.DefaultLifecycleObserver;
import android.content.Context;
import k2b.b3;
import m2b.h;
import m2b.g;
import m2b.f;
import m2b.b;
import m2b.c;
import m2b.a;
import m2b.e;
import java.lang.Object;
import android.util.SparseArray;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import android.util.LruCache;
import k2b.a;
import com.yxcorp.gifshow.log.b;
import k2b.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.y;
import k2b.k2;
import q2b.i;
import java.util.Objects;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.t;
import y2b.b;
import android.app.Activity;
import f3b.b;
import java.lang.Integer;
import java.lang.Number;
import java.util.Collection;
import java.lang.Boolean;
import java.util.Queue;
import android.os.Bundle;
import k2b.l3;
import k2b.g0;
import java.util.Set;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.content.Intent;
import ok.n;
import f3b.v;
import m2b.d;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import com.yxcorp.gifshow.log.b$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import android.content.ComponentName;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import v2b.e;
import v2b.c;
import java.lang.Runnable;
import android.os.Handler;

public class ActivityLifecycleCallbacks implements Application$ActivityLifecycleCallbacks, DefaultLifecycleObserver	// class@0011d5
{
    public final LruCache A;
    public b B;
    public boolean C;
    public Context b;
    public b c;
    public b d;
    public k2 e;
    public SparseArray f;
    public final b3 g;
    public boolean h;
    public Queue i;
    public long j;
    public c k;
    public a l;
    public e m;
    public h n;
    public g o;
    public f p;
    public b q;
    public d r;
    public boolean s;
    public LinkedHashMap t;
    public ImmutableList u;
    public List v;
    public SparseArray w;
    public final LruCache x;
    public final LruCache y;
    public final LruCache z;

    public void ActivityLifecycleCallbacks(Context p0,b3 p1,h p2,g p3,f p4,b p5,c p6,a p7,e p8){
       super();
       this.f = new SparseArray();
       this.h = false;
       this.i = new LinkedBlockingQueue();
       this.j = SystemClock.elapsedRealtime();
       this.s = false;
       this.t = new LinkedHashMap();
       this.u = ImmutableList.of();
       this.v = new ArrayList();
       this.w = new SparseArray();
       this.x = new LruCache(50);
       this.y = new LruCache(50);
       this.z = new LruCache(50);
       this.A = new LruCache(50);
       this.C = false;
       this.b = p0;
       this.g = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.k = p6;
       this.l = p7;
       this.m = p8;
       this.r = new a(this);
    }
    public b a(){
       ActivityLifecycleCallbacks tc = this.c;
       if (tc != null) {
          return tc;
       }
       return null;
    }
    public b b(){
       Object obj = PatchProxy.apply(null, this, ActivityLifecycleCallbacks.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.l(this.u, null);
    }
    public k2 c(){
       ActivityLifecycleCallbacks te = this.e;
       if (te != null) {
          return te;
       }
       return null;
    }
    public k2 d(){
       ActivityLifecycleCallbacks obj = PatchProxy.apply(null, this, ActivityLifecycleCallbacks.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj.D();
       }
       return null;
    }
    public k2 e(i p0){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ActivityLifecycleCallbacks obj = PatchProxy.applyOneRefs(p0, this, ActivityLifecycleCallbacks.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          Objects.requireNonNull(obj);
          obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "20");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = obj.P.d(p0).orNull();
          }
       }else {
          obj1 = null;
       }
       return obj1;
    }
    public b f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityLifecycleCallbacks.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = (p0 == null)? null: this.z.get(p0);
       return uob;
    }
    public String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityLifecycleCallbacks.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? null: this.A.get(p0);
       return p0;
    }
    public final void h(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "9")) {
          return;
       }
       Integer integer = this.w.get(b.a(p0));
       if (integer != null) {
          b uob = this.t.get(integer);
          if (uob == null) {
             return;
          }else {
             uob.h(p0);
             this.w.remove(integer.intValue());
          }
       }
       return;
    }
    public final int i(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityLifecycleCallbacks.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       int i1 = Optional.fromNullable(this.w.get(b.a(p0))).or(Integer.valueOf(i)).intValue();
       int taskId = p0.getTaskId();
       if (taskId == i || i1 == taskId) {
          return i1;
       }
       if (!this.t.containsKey(Integer.valueOf(taskId))) {
          this.t.put(Integer.valueOf(taskId), new b(taskId));
          this.u = ImmutableList.copyOf(this.t.values());
       }
       this.w.put(b.a(p0), Integer.valueOf(taskId));
       return taskId;
    }
    public void j(i p0,boolean p1){
       if (PatchProxy.isSupport(ActivityLifecycleCallbacks.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ActivityLifecycleCallbacks.class, "20")) {
          return;
       }
       if (this.h == null && (p0 != null && !p0.n())) {
          this.i.add(Optional.fromNullable(p0));
       }
    label_002c :
       ActivityLifecycleCallbacks tc = this.c;
       if (tc != null) {
          tc.R(p0, p1);
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       boolean b1;
       boolean b2;
       ActivityLifecycleCallbacks uActivityLif = this;
       int i = p0;
       ActivityLifecycleCallbacks obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, ActivityLifecycleCallbacks.class, "3")) {
          return;
       }
       boolean b = true;
       if (uActivityLif.s == null) {
          uActivityLif.s = b;
          uActivityLif.q.a();
       }
       l3 ol3 = l3.class;
       v ov = null;
       String obj1 = PatchProxy.applyOneRefs(p0, ov, ol3, "1");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!i){
          if (!i instanceof g0) {
             obj1 = p0.getClass().getName();
             _monitor_enter(ol3);
             Object obj5 = PatchProxy.applyOneRefs(obj1, ov, ol3, "3");
             boolean b3 = (obj5 != patchProxyRe)? obj5.booleanValue(): l3.a.contains(obj1);
             _monitor_exit(ol3);
             if (!b3) {
             label_0034 :
                b1 = false;
             }
          }
          b1 = true;
       }
       if (b1) {
          Log.g("ActivityLifecycleCallbacks", p0+" is transparent.");
          return;
       }else if(p0.getTaskId() != -1){
          Object obj2 = uActivityLif.t.get(Integer.valueOf(this.i(p0)));
          if (obj2 == null) {
             return;
          }else {
             b obj3 = PatchProxy.applyOneRefs(p0, ov, b.class, "2");
             if (obj3 != patchProxyRe) {
                b2 = obj3.booleanValue();
             }else {
                Intent intent = p0.getIntent();
                if (intent == null || (!("android.intent.action.MAIN").equals(intent.getAction()) || !intent.hasCategory("android.intent.category.LAUNCHER"))) {
                   b = null;
                }
                b2 = b;
             }
             if (b2 && !p0.isTaskRoot()) {
                return;
             }else if(obj == null || (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "16") || !uActivityLif.f.size())){
                int i1 = b.a(p0);
                Integer integer = uActivityLif.w.get(i1);
                if (integer != null && (i1 != p0.hashCode() && uActivityLif.f.get(i1) != null)) {
                   obj3 = uActivityLif.f.get(i1);
                   Objects.requireNonNull(obj3);
                   if (!PatchProxy.applyVoidOneRefs(p0, obj3, b.class, "7")) {
                      obj3.X = p0.hashCode();
                   }
                   b uob1 = uActivityLif.t.get(integer);
                   if (uob1 != null) {
                      uob1.a(obj3);
                   }
                   uActivityLif.f.remove(i1);
                }
             }
          label_0129 :
             if (!obj2.b(p0)) {
                obj = uActivityLif.c;
                k2 ok2 = (obj != null)? obj.D(): ov;
                if (ok2 instanceof b) {
                   k2 ok21 = ok2;
                   if (ok21.g0 != null || ok21.h0 == null) {
                      n.b(("UNKNOWN2").equals(ok2.d));
                      ov = ok2.G();
                      ok2 = ok2.t;
                   }
                }
                Object obj4 = ov;
                b uob = new b(p0, ok2, uActivityLif.n, uActivityLif.r, uActivityLif.g, uActivityLif.x, uActivityLif.y, uActivityLif.z);
                if (obj4 != null) {
                   v13.S(obj4);
                }
                obj2.a(v13);
             }
             uActivityLif.d = obj2;
             uActivityLif.c = obj2.d(p0);
          }
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       b uob;
       b uob1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "6")) {
          return;
       }
       Integer integer = this.w.get(b.a(p0));
       if (!p0.isFinishing()) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "15")) {
             int i = b.a(p0);
             Integer integer1 = this.w.get(i);
             if (integer1 != null && i != p0.hashCode()) {
                uob = this.t.get(integer1);
                if (uob != null && uob.b(p0)) {
                   this.f.put(i, uob.d(p0));
                   uob.h(p0);
                }
             }
          }
          return;
       }else if(integer != null){
          uob1 = this.t.get(integer);
          if (uob1 == null) {
             return;
          }else if(uob1.b(p0)){
             this.v.add(uob1.d(p0));
          }
       }
       this.h(p0);
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          uob1 = iterator.next();
          uob = b.class;
          if (PatchProxy.applyVoidOneRefs(uob1, this, ActivityLifecycleCallbacks.class, "8") || uob1 == null) {
          }else {
             Object[] objArray = null;
             Collection uCollection = PatchProxy.apply(objArray, uob1, uob, "24");
             if (uCollection != PatchProxyResult.class) {
             }else {
                uCollection = uob1.d0.values();
             }
             Iterator iterator1 = uCollection.iterator();
             while (iterator1.hasNext()) {
                b$a uoa = iterator1.next();
                this.p.a(uoa.a, uoa.b);
             }
             if (PatchProxy.applyVoid(objArray, uob1, uob, "25")) {
                continue ;
             }
          }
          uob1.d0.clear();
       }
       this.v.clear();
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "5")) {
          return;
       }
       if (p0.isFinishing()) {
          this.o.a();
       }
       ActivityLifecycleCallbacks td = this.d;
       if (td != null && td.b(p0)) {
          Integer integer = this.w.get(b.a(p0));
          String str = "ActivityLifecycleCallbacks";
          if (integer == null) {
             Log.g(str, "No valid taskId for: "+p0.getComponentName());
             return;
          }else {
             b uob = this.t.get(integer);
             if (uob == null) {
                return;
             }else {
                uob = uob.d(p0);
                if (uob == null) {
                   Log.g(str, "No activity record for: "+p0.getComponentName());
                   return;
                }else {
                   b uob1 = null;
                   if (this.B == uob) {
                      Log.g(str, "NonVisiblePause: "+this.B.H());
                      this.B = uob1;
                      return;
                   }else if(PatchProxy.applyVoid(uob1, uob, b.class, "10")){
                      uob.P();
                      uob.W = false;
                      uob.U.o = true;
                   }
                   if (p0.isFinishing()) {
                      this.v.add(uob);
                      this.h(p0);
                   }
                   this.h = false;
                }
             }
          }
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       int b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "4")) {
          return;
       }
       int i = b.a(p0);
       Integer integer = this.w.get(i);
       if (integer == null) {
          return;
       }
       b uob = this.t.get(integer);
       this.d = uob;
       if (uob == null) {
          return;
       }
       uob = uob.d(p0);
       if (uob == null) {
          Log.g("ActivityLifecycleCallbacks", "Ignore onResume. No corresponding record for: "+p0.getComponentName());
          return;
       }else {
          ActivityLifecycleCallbacks obj = PatchProxy.applyOneRefs(p0, null, ActivityLifecycleCallbacks.class, "26");
          int i1 = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             ViewGroup viewGroup = p0.findViewById(0x1020002);
             b = (viewGroup == null || !viewGroup.getChildCount())? true: false;
          }
          uob.g0 = b;
          uob.h0 = true;
          if (this.h != null && !this.c.N()) {
             obj = this.c;
             Object obj1 = PatchProxy.applyTwoRefs(uob, obj, this, ActivityLifecycleCallbacks.class, "7");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                ActivityLifecycleCallbacks td = this.d;
                if (td != null) {
                   List list = td.e();
                   int i2 = list.indexOf(uob);
                   b = list.indexOf(obj);
                   b uob1 = -1;
                   if (i2 != uob1 && b != uob1) {
                      i2 = i2 + true;
                      if (i2 < b) {
                         while (true) {
                            if (i2 < b) {
                               if (list.get(i2).N()) {
                                  i2 = i2 + 1;
                               }
                            }else {
                               b1 = true;
                            }
                         }
                      }
                   }
                }
                b1 = false;
             }
             if (b1) {
                i1 = 1;
             }
          }
       label_00c7 :
          if (i1) {
             this.B = uob;
             Log.g("ActivityLifecycleCallbacks", "NonVisibleResumeRecord: "+this.B.H());
             return;
          }else {
             this.c = uob;
             this.i(p0);
             if (!integer.equals(this.w.get(i))) {
                integer = this.w.get(i);
                this.d = this.t.get(integer);
             }
             this.t.remove(integer);
             this.t.put(integer, this.d);
             this.u = ImmutableList.copyOf(this.t.values());
             this.d.h(p0);
             this.d.a(this.c);
             this.h = true;
             while (!this.i.isEmpty()) {
                this.c.R(this.i.remove().orNull(), true);
             }
             ActivityLifecycleCallbacks tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(null, tc, b.class, "9")) {
                tc.W = true;
                tc.O();
             }
             return;
          }
       }
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "1")) {
          return;
       }
       if (n.A1().S()) {
          if (this.C != null) {
             ActivityLifecycleCallbacks tc = this.c;
             if (tc != null && tc.H() != null) {
                i3 oi3 = i3.f();
                oi3.d("package", TextUtils.k(this.c.H().getPackageName()));
                oi3.d("class", TextUtils.k(this.c.H().getClassName()));
                str = oi3.e();
             }else {
                str = "";
             }
             b.a(0x4b316083).A(27, str);
             Log.g("ActivityLifecycleCallbacks", "onForeground: hot launch report heart beat");
          }
          this.C = true;
       }
       if ((SystemClock.elapsedRealtime() - this.j) - 0x493e0 > 0) {
          this.k.b();
          e uoe = e.d();
          Objects.requireNonNull(uoe);
          if (!PatchProxy.applyVoid(null, uoe, e.class, "3") && n.A1().O()) {
             uoe.b.post(new c(uoe));
          }
       }
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ActivityLifecycleCallbacks.class, "2")) {
          return;
       }
       this.j = SystemClock.elapsedRealtime();
       this.m.a();
       this.l.y();
       return;
    }
}
