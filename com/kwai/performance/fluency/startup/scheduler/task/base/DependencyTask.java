package com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import sf7.c;
import sf7.b;
import java.lang.Comparable;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask$dependencyTasks$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask$dependencyTaskClasses$2;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask$barrierTasks$2;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import lf7.b;
import com.kwai.performance.fluency.startup.scheduler.debug.UmlGraph;
import java.lang.System;
import android.os.SystemClock;
import qrd.l1;
import kf7.a;
import java.util.Objects;
import java.lang.Long;
import java.util.Map;
import qf7.b;
import java.util.concurrent.locks.Lock;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$writeAnalysisResult$1;
import java.lang.Iterable;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$b;
import pf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask$b;

public abstract class DependencyTask implements c, b, Comparable	// class@000da9
{
    public int b;
    public int c;
    public final AtomicInteger d;
    public long e;
    public long f;
    public long g;
    public final AtomicInteger h;
    public final List i;
    public final p j;
    public final p k;
    public final p l;
    public final List m;
    public static final DependencyTask$a n;

    static {
       DependencyTask.n = new DependencyTask$a(null);
    }
    public void DependencyTask(){
       super();
       this.c = -1;
       this.d = new AtomicInteger();
       this.h = new AtomicInteger();
       this.i = new ArrayList();
       this.j = s.c(new DependencyTask$dependencyTasks$2(this));
       this.k = s.c(new DependencyTask$dependencyTaskClasses$2(this));
       this.l = s.c(new DependencyTask$barrierTasks$2(this));
       this.m = new ArrayList();
    }
    public final void A(int p0){
       this.c = p0;
    }
    public boolean H7(){
       return false;
    }
    public void c(Class p0){
       a.q(p0, "dependencyClass");
       this.s().add(p0);
    }
    public int compareTo(Object p0){
       return this.m(p0);
    }
    public void e(BarrierTask p0){
       a.q(p0, "barrierTask");
       this.o().add(p0);
    }
    public List g(){
       return new ArrayList();
    }
    public List i(){
       return new ArrayList();
    }
    public List j(){
       return new ArrayList();
    }
    public void k(DependencyTask p0){
       a.q(p0, "dependencyTask");
       this.u().add(p0);
    }
    public void l(){
    }
    public int m(DependencyTask p0){
       a.q(p0, "other");
       int i = 1;
       if (this.priority() != p0.priority()) {
          if (this.priority() <= p0.priority()) {
             i = -1;
          }
          return i;
       }else if(this.i.size() != p0.i.size()){
          if (this.i.size() <= p0.i.size()) {
             i = -1;
          }
          return i;
       }else {
          return b.e.b(this, p0);
       }
    }
    public abstract void n();
    public String name(){
       String name = this.getClass().getName();
       a.h(name, "javaClass.name");
       return name;
    }
    public final List o(){
       return this.l.getValue();
    }
    public final long p(){
       return this.f;
    }
    public int priority(){
       return 0;
    }
    public final int r(){
       return this.b;
    }
    public void run(){
       Iterator iterator;
       DependencyTask uDependencyT;
       this.name();
       UmlGraph h = UmlGraph.h;
       UmlGraph.a(h, this, false, false, 6, null);
       int i = 1;
       this.z(i);
       this.g = System.currentTimeMillis();
       this.n();
       this.l();
       this.e = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
       this.f = SystemClock.currentThreadTimeMillis() - SystemClock.currentThreadTimeMillis();
       if (a.f && !this.H7()) {
          Objects.requireNonNull(b.e);
          a.q(this, "task");
          if (a.f) {
             String name = this.getClass().getName();
             a.h(name, "task::class.java.name");
             b.b.put(name, Long.valueOf(this.p()));
          }
       }
       Objects.requireNonNull(h);
       a.q(this, "finishedTask");
       ReentrantLock e = b.e;
       e.lock();
       if (i ^ this.i.isEmpty()) {
          if (!this.d.getAndIncrement()) {
             iterator = this.i.iterator();
             while (iterator.hasNext()) {
                uDependencyT = iterator.next();
                if (!uDependencyT.h.decrementAndGet()) {
                   b.g(uDependencyT);
                   Objects.requireNonNull(UmlGraph.h);
                }
             }
          }else if(this instanceof BarrierTask){
             iterator = this.i.iterator();
             while (iterator.hasNext()) {
                uDependencyT = iterator.next();
                if (!uDependencyT.h.get() && uDependencyT.ue()) {
                   b.g(uDependencyT);
                   Objects.requireNonNull(UmlGraph.h);
                }
             }
          }
       }
       e.unlock();
       b e1 = b.e;
       Objects.requireNonNull(e1);
       a.q(this, "task");
       if (a.f && (!this.H7() && !b.c.decrementAndGet())) {
          e1.c(TaskCostAnalyser$writeAnalysisResult$1.INSTANCE);
       }
    label_0100 :
       Objects.requireNonNull(UmlGraph.h);
       iterator = this.o().iterator();
       BarrierTask$b uob = 2;
       while (iterator.hasNext()) {
          BarrierTask$b BarrierTask e2 = iterator.next();
          BarrierTask$b uob1 = e2.C();
          _monitor_enter(uob1);
          if (e2.r() == uob) {
             _monitor_exit(uob1);
          }else {
             e2 = e2.C();
             uob = e2.b;
             _monitor_enter(uob);
             if (!e2.a.get()) {
                _monitor_exit(uob);
             }else if(!e2.a.decrementAndGet()){
                e2.b.notifyAll();
             }
             _monitor_exit(uob);
             _monitor_exit(uob1);
          }
       }
       this.z(uob);
       a k = a.k;
       Objects.requireNonNull(k);
       a.q(this, "task");
       if (!this.v()) {
          k.e();
          k.g();
       }else if(this.v() != uob){
          a.d.b();
       }
       k.e();
       k.g();
       k.f();
       return;
    }
    public final List s(){
       return this.k.getValue();
    }
    public final List u(){
       return this.j.getValue();
    }
    public boolean ue(){
       return true;
    }
    public final int v(){
       return this.c;
    }
    public final long x(){
       return this.g;
    }
    public final long y(){
       return this.e;
    }
    public final void z(int p0){
       this.b = p0;
       DependencyTask tm = this.m;
       _monitor_enter(tm);
       Iterator iterator = this.m.iterator();
       while (iterator.hasNext()) {
          iterator.next().onStateChanged(p0);
       }
       _monitor_exit(tm);
       return;
    }
}
