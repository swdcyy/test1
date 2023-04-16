package com.kwai.sdk.eve.internal.common.scheduler.Schedulers;
import cn7.b;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$a;
import nsd.u;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import java.lang.Object;
import java.util.Set;
import trd.d1;
import vm7.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$asyncExecutorService$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioExecutorService$2;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$ioSingleThreadService$2;
import java.util.LinkedHashSet;
import en7.l;
import dn7.d;
import com.kwai.sdk.eve.InitConfig;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$SequencedExecutorServices;
import kotlin.Pair;
import dn7.i;
import java.lang.Runtime;
import com.google.common.primitives.Ints;
import qrd.r0;
import java.util.Map;
import trd.t0;
import cn7.c;
import cn7.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.lang.Boolean;
import java.util.concurrent.CountDownLatch;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import en7.n;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.sdk.eve.internal.common.scheduler.Schedulers$awaitTermination$$inlined$forEach$lambda$1;
import java.lang.ClassLoader;
import java.lang.Thread;
import yrd.b;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.IllegalStateException;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import java.util.concurrent.Future;
import java.util.Objects;
import dn7.e;
import java.lang.ref.WeakReference;
import qrd.l1;
import cn7.d;
import java.util.HashMap;

public final class Schedulers implements b	// class@00148c
{
    public final p a;
    public final p b;
    public final p c;
    public final Set d;
    public final l e;
    public final d f;
    public final Schedulers$SequencedExecutorServices g;
    public final Map h;
    public static final Set i;
    public static final Schedulers$a j;

    static {
       Schedulers.j = new Schedulers$a(null);
       ResourceType[] resourceType = new ResourceType[]{ResourceType.CPU,ResourceType.GPU};
       Schedulers.i = d1.u(resourceType);
    }
    public void Schedulers(a p0){
       ResourceType cPU;
       ResourceType nETWORK;
       int i = this;
       a.p(p0, "context");
       super();
       i.a = s.c(Schedulers$asyncExecutorService$2.INSTANCE);
       i.b = s.c(Schedulers$ioExecutorService$2.INSTANCE);
       i.c = s.c(Schedulers$ioSingleThreadService$2.INSTANCE);
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       i.d = linkedHashSe;
       l ol = new l(linkedHashSe);
       i.e = ol;
       i.f = new d(ol, p0.b().f());
       i.g = new Schedulers$SequencedExecutorServices(2);
       Pair[] pairArray = new Pair[]{r0.a(cPU, v14),r0.a(cPU, v14),r0.a(cPU, v14),r0.a(nETWORK, v12)};
       cPU = ResourceType.CPU;
       int[] ointArray = new int[]{1,Runtime.getRuntime().availableProcessors() / 2};
       l ol1 = ol;
       i oi = new i(1, Ints.b(ointArray), 0xea60, cPU, ol1, p0.b().f());
       cPU = ResourceType.IO;
       oi = new i(0, 10, 0xea60, cPU, ol1, p0.b().f());
       cPU = ResourceType.GPU;
       oi = new i(0, 2, 0xea60, cPU, ol1, p0.b().f());
       nETWORK = ResourceType.NETWORK;
       i oi1 = new i(0, 2, 0xea60, nETWORK, ol, p0.b().f());
       i.h = t0.j0(pairArray);
    }
    public final e a(c p0){
       e uoe;
       String obj = PatchProxy.applyOneRefs(p0, this, Schedulers.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.q();
       if (obj != null) {
          uoe = this.g.forSeqId(obj);
       }else {
          uoe = this.h.get(p0.getResource());
          a.m(uoe);
       }
       return uoe;
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       Schedulers$awaitTermination$$inlined$forEach$lambda$1 obj2;
       Object obj = this;
       Object obj1 = p1;
       Schedulers schedulers = Schedulers.class;
       if (PatchProxy.isSupport(schedulers)) {
          obj2 = PatchProxy.applyTwoRefs(Long.valueOf(p0), obj1, obj, schedulers, "12");
          if (obj2 != PatchProxyResult.class) {
             return obj2.booleanValue();
          }
       }
       int i = 1;
       int i1 = obj.h.size() + i;
       CountDownLatch uCountDownLa = new CountDownLatch(i1);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(obj.f);
       uArrayList.addAll(obj.h.values());
       uArrayList.addAll(obj.g.values());
       n on = new n(Integer.valueOf(i1));
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          obj2 = new Schedulers$awaitTermination$$inlined$forEach$lambda$1(iterator.next(), p0, p1, on, uCountDownLa);
          b.c(true, false, null, null, 0, v18, 30, null);
       }
       uCountDownLa.await(p0, obj1);
       if (on.a().intValue()) {
          i = false;
       }
       return i;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Schedulers.class, "14")) {
          return;
       }
       a.p(p0, "value");
       EveLog.i$default("EveManager#setCurrentLabel "+this.f.d()+" -> "+p0, false, 2, null);
       this.f.b(p0);
       Iterator iterator = this.h.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public final void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Schedulers.class, "18")) {
          return;
       }
       if (Schedulers.i.contains(p0.getResource())) {
          return;
       }
       throw new IllegalStateException("running "+p0.getResource()+" on main thread is not allowed");
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, Schedulers.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.d();
    }
    public Future e(LabeledRunnable p0,Object p1,boolean p2){
       Future uFuture;
       if (PatchProxy.isSupport(Schedulers.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, Schedulers.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "r");
       if (p2) {
          this.c(p0);
          uFuture = this.f.i(p0, p1);
       }else {
          uFuture = this.a(p0).i(p0, p1);
       }
       return uFuture;
    }
    public int f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "l");
       return this.a(p0).h();
    }
    public void g(ResourceType p0,int p1){
       Schedulers schedulers = Schedulers.class;
       if (PatchProxy.isSupport(schedulers) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, schedulers, "15")) {
          return;
       }
       a.p(p0, "type");
       p0 = this.h.get(p0);
       a.m(p0);
       Objects.requireNonNull(p0);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), p0, oi, "13")) {
          i b = p0.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(e.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), b, e.class, "1") && b.c != p1)) {
             b.c = p1;
             e d = b.d;
             _monitor_enter(d);
             Iterator iterator = b.d.iterator();
             while (iterator.hasNext()) {
                Thread thread = iterator.next().get();
                if (thread != null) {
                   thread.setPriority(b.a());
                }else {
                   iterator.remove();
                }
             }
             _monitor_exit(d);
          }
       }
       return;
    }
    public int h(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "l");
       return this.a(p0).f();
    }
    public Future i(d p0,boolean p1){
       Future uFuture;
       Schedulers schedulers = Schedulers.class;
       if (PatchProxy.isSupport(schedulers)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, schedulers, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "c");
       if (p1) {
          this.c(p0);
          uFuture = this.f.a(p0);
       }else {
          uFuture = this.a(p0).a(p0);
       }
       return uFuture;
    }
    public boolean isShutdown(){
       Schedulers schedulers;
       Collection obj = PatchProxy.apply(null, this, Schedulers.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.f.isShutdown()) {
          obj = this.g.values();
          if (!obj instanceof Collection || !obj.isEmpty()) {
             Iterator iterator = obj.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().isShutdown()) {
                      schedulers = 1;
                      break ;
                   }
                }
             }
             if (!schedulers) {
                obj = this.h.values();
                if (!obj instanceof Collection || !obj.isEmpty()) {
                   iterator = obj.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().isShutdown()) {
                            iterator = 1;
                            break ;
                         }
                      }
                   }
                   if (!schedulers) {
                      b = false;
                   }
                }
                schedulers = 0;
                goto label_0072 ;
             }
          }
          schedulers = null;
          goto label_0047 ;
       }
    label_0076 :
       return b;
    }
    public boolean isTerminated(){
       Schedulers schedulers;
       Collection obj = PatchProxy.apply(null, this, Schedulers.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.f.isTerminated()) {
          obj = this.g.values();
          if (!obj instanceof Collection || !obj.isEmpty()) {
             Iterator iterator = obj.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().isTerminated()) {
                      schedulers = 1;
                      break ;
                   }
                }
             }
             if (!schedulers) {
                obj = this.h.values();
                if (!obj instanceof Collection || !obj.isEmpty()) {
                   iterator = obj.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (iterator.next().isTerminated()) {
                            iterator = 1;
                            break ;
                         }
                      }
                   }
                   if (!schedulers) {
                      b = false;
                   }
                }
                schedulers = 0;
                goto label_0072 ;
             }
          }
          schedulers = null;
          goto label_0047 ;
       }
    label_0076 :
       return b;
    }
    public void j(LabeledRunnable p0,boolean p1){
       Schedulers schedulers = Schedulers.class;
       if (PatchProxy.isSupport(schedulers) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, schedulers, "4")) {
          return;
       }
       a.p(p0, "r");
       if (p1) {
          this.c(p0);
          this.f.g(p0);
       }else {
          this.a(p0).g(p0);
       }
       return;
    }
    public Future k(LabeledRunnable p0,boolean p1){
       Future uFuture;
       Schedulers schedulers = Schedulers.class;
       if (PatchProxy.isSupport(schedulers)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, schedulers, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "r");
       if (p1) {
          this.c(p0);
          uFuture = this.f.c(p0);
       }else {
          uFuture = this.a(p0).c(p0);
       }
       return uFuture;
    }
    public void shutdown(){
       if (PatchProxy.applyVoid(null, this, Schedulers.class, "8")) {
          return;
       }
       this.f.shutdown();
       Iterator iterator = this.h.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().shutdown();
       }
       iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().shutdown();
       }
       this.g.clear();
       return;
    }
    public List shutdownNow(){
       ArrayList obj = PatchProxy.apply(null, this, Schedulers.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.f.shutdownNow());
       Iterator iterator = this.h.values().iterator();
       while (iterator.hasNext()) {
          obj.addAll(iterator.next().shutdownNow());
       }
       iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          obj.addAll(iterator.next().shutdownNow());
       }
       this.g.clear();
       return obj;
    }
}
