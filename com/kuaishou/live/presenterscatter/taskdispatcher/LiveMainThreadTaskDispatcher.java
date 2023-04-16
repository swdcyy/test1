package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import xj3.a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$a;
import nsd.u;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$d;
import java.util.List;
import pp.c;
import java.util.LinkedList;
import java.util.ArrayList;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b;
import java.util.Random;
import o56.a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$1;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import msd.l;
import java.util.Iterator;
import xj3.d;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$removeTasksByTag$1;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$removeTasksByType$1;
import w1.k;
import java.lang.Iterable;
import xj3.c;
import java.util.Comparator;
import trd.x;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import xj3.e;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$startLoopIfNeed$1;

public final class LiveMainThreadTaskDispatcher implements a	// class@000d77
{
    public final List a;
    public boolean b;
    public final LinkedList c;
    public final boolean d;
    public final List e;
    public l f;
    public LiveMainThreadTaskDispatcher$c g;
    public boolean h;
    public long i;
    public final a j;
    public static int k;
    public static final LiveMainThreadTaskDispatcher$a l;

    static {
       LiveMainThreadTaskDispatcher.l = new LiveMainThreadTaskDispatcher$a(null);
    }
    public void LiveMainThreadTaskDispatcher(){
       super(0, 0, null, 7, null);
    }
    public void LiveMainThreadTaskDispatcher(long p0){
       super(p0, 0, null, 6, null);
    }
    public void LiveMainThreadTaskDispatcher(long p0,double p1,a p2){
       a.p(p2, "completeCallback");
       super();
       this.i = p0;
       this.j = p2;
       List list = LiveMainThreadTaskDispatcher$d.b.appendTag(String.valueOf(LiveMainThreadTaskDispatcher.k));
       this.a = list;
       this.c = new LinkedList();
       this.e = new ArrayList();
       this.g = new LiveMainThreadTaskDispatcher$b();
       boolean b = (p1 - new Random().nextDouble() > 0 || a.d())? true: false;
       this.d = b;
       b.P(list, "constructor durationMs:"+this.i+", "+"logRate:"+p1+", isNeedLog:"+b);
       LiveMainThreadTaskDispatcher.k = LiveMainThreadTaskDispatcher.k + 1;
       return;
    }
    public void LiveMainThreadTaskDispatcher(long p0,double p1,a p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 12;
       }
       long l = p0;
       if (p3 & 0x02) {
          p1 = 0;
       }
       double d = p1;
       LiveMainThreadTaskDispatcher$1 iNSTANCE = (p3 & 0x04)? LiveMainThreadTaskDispatcher$1.INSTANCE: 0;
       super(l, d, iNSTANCE);
       return;
    }
    public void a(LiveMainThreadTaskDispatcher$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "15")) {
          return;
       }
       a.p(p0, "predicate");
       Iterator iterator = this.c.iterator();
       a.o(iterator, "queue.iterator\(\)");
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          a.o(obj, "iterator.next\(\)");
          if (p0.invoke(obj).booleanValue()) {
             iterator.remove();
          }
       }
       return;
    }
    public void c(long p0){
       LiveMainThreadTaskDispatcher liveMainThre = LiveMainThreadTaskDispatcher.class;
       if (PatchProxy.isSupport(liveMainThre) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveMainThre, "10")) {
          return;
       }
       b.P(this.a, "setLoopDuration: "+p0);
       this.i = p0;
       return;
    }
    public void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "14")) {
          return;
       }
       a.p(p0, "logger");
       this.f = p0;
       return;
    }
    public void e(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "3")) {
          return;
       }
       a.p(p0, "task");
       if (this.c.isEmpty()) {
          this.h(p0);
       }else {
          this.c.addFirst(p0);
       }
       return;
    }
    public void f(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "5")) {
          return;
       }
       a.p(p0, "tag");
       b.P(this.a, "removeTasksByTag: "+p0);
       this.b(new LiveMainThreadTaskDispatcher$removeTasksByTag$1(p0));
       return;
    }
    public void g(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "9")) {
          return;
       }
       a.p(p0, "predicate");
       if (this.c.isEmpty() ^ 0x01) {
          b.P(this.a, "flushTasksUtil, queue.size: "+this.c.size());
          int i = this.c.isEmpty() ^ 0x01;
          while (i) {
             d uod = CollectionsKt___CollectionsKt.m2(this.c);
             if (p0.invoke(uod).booleanValue()) {
                break ;
             }
             this.c.removeFirst();
             this.p(uod);
          }
          this.o();
       }
       return;
    }
    public void h(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "2")) {
          return;
       }
       a.p(p0, "task");
       if (this.c.isEmpty()) {
          this.c.addLast(p0);
          if (this.h == null) {
             this.q();
          }
       }else {
          this.c.addLast(p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "6")) {
          return;
       }
       b.P(this.a, "removeAllTasks, queue.size: "+this.c.size());
       this.c.clear();
       return;
    }
    public void j(int p0){
       LiveMainThreadTaskDispatcher liveMainThre = LiveMainThreadTaskDispatcher.class;
       if (PatchProxy.isSupport(liveMainThre) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveMainThre, "4")) {
          return;
       }
       b.P(this.a, "removeTasksByType: "+p0);
       this.b(new LiveMainThreadTaskDispatcher$removeTasksByType$1(p0));
       return;
    }
    public void k(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher.class, "8")) {
          return;
       }
       a.p(p0, "predicate");
       k.a("ScatterFlush");
       if (this.c.isEmpty() ^ 0x01) {
          b.P(this.a, "flushTasks predicate, queue.size: "+this.c.size());
          while (true) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = this.c.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (p0.invoke(obj).booleanValue()) {
                   uArrayList.add(obj);
                }
             }
             int i = uArrayList.isEmpty() ^ 0x01;
             if (i) {
                this.c.removeAll(uArrayList);
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   this.p(iterator.next());
                }
             }
             i = uArrayList.isEmpty() ^ 0x01;
             if (!i) {
                b.P(this.a, "flushTasks predicate done, queue.size: "+this.c.size());
                this.o();
             }
          }
       }
       k.b();
       return;
    }
    public void l(){
       LiveMainThreadTaskDispatcher liveMainThre = LiveMainThreadTaskDispatcher.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMainThre, "13")) {
          return;
       }
       b.P(this.a, "quit, queue.size: "+this.c.size());
       this.b = false;
       this.h = false;
       this.n().l();
       this.c.clear();
       if (!PatchProxy.applyVoid(objArray, this, liveMainThre, "19") && !this.e.isEmpty()) {
          b.P(this.a, "uploadTaskRunLogs, size:"+this.e.size());
          liveMainThre = this.e;
          if (liveMainThre.size() > 1) {
             x.p0(liveMainThre, new c());
          }
          liveMainThre = this.f;
          if (liveMainThre != null) {
             liveMainThre.invoke(this.e);
          }
       }
    label_0084 :
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "7")) {
          return;
       }
       k.a("ScatterFlush");
       if (this.c.isEmpty() ^ 0x01) {
          b.P(this.a, "flushTasks, queue.size: "+this.c.size());
          int i = this.c.isEmpty() ^ 0x01;
          while (i) {
             d uod = this.c.removeFirst();
             a.o(uod, "task");
             this.p(uod);
          }
          this.o();
       }
       k.b();
       return;
    }
    public LiveMainThreadTaskDispatcher$c n(){
       return this.g;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "20")) {
          return;
       }
       if (this.c.isEmpty()) {
          b.P(this.a, "Scatter complete tasks");
          this.j.invoke();
       }
       return;
    }
    public final long p(d p0){
       LiveMainThreadTaskDispatcher liveMainThre = LiveMainThreadTaskDispatcher.class;
       e obj = PatchProxy.applyOneRefs(p0, this, liveMainThre, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       p0.run();
       long l = System.nanoTime() - System.nanoTime();
       obj = new e(p0.a(), p0.c(), l);
       if (!PatchProxy.applyVoidOneRefs(obj, this, liveMainThre, "18") && this.d != null) {
          this.e.add(obj);
       }
       return l;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "12")) {
          return;
       }
       b.P(this.a, "pause, queue.size: "+this.c.size());
       this.b = false;
       this.h = false;
       this.n().pause();
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "21")) {
          return;
       }
       b.P(this.a, "startLoopIfNeed, queue.size: "+this.c.size());
       if (this.b != null) {
          int i = 1;
          if (this.c.isEmpty() ^ i) {
             this.h = i;
             this.n().a(new LiveMainThreadTaskDispatcher$startLoopIfNeed$1(this));
          label_004f :
             return;
          }
       }
       this.h = false;
       this.n().l();
       goto label_004f ;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher.class, "11")) {
          return;
       }
       b.P(this.a, "start, queue.size: "+this.c.size());
       if (this.b == null) {
          this.b = true;
          this.q();
       }else {
          this.b = true;
       }
       return;
    }
}
