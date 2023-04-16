package com.kwai.component.taskdispatcher.slide.strategy.SlideVsyncMainScatterStrategy;
import android.view.Choreographer$FrameCallback;
import lh5.c;
import com.kwai.component.taskdispatcher.slide.strategy.SlideVsyncMainScatterStrategy$a;
import nsd.u;
import java.util.Queue;
import lh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.view.Choreographer;
import com.kwai.component.taskdispatcher.logger.SlideVsyncScatterTracker;
import jh5.c;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.Lock;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.util.Iterator;
import java.lang.Iterable;
import eh5.q;
import java.util.Collection;
import eh5.v;
import eh5.j;
import java.lang.Long;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.lang.Throwable;
import eh5.l;
import java.util.Objects;
import eh5.a;
import java.lang.Integer;
import java.lang.System;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import eh5.d;
import eh5.w;
import eh5.i;
import eh5.f;
import eh5.b;
import hh5.c;
import java.util.HashMap;
import hh5.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.kwai.component.taskdispatcher.logger.data.DispatchInfo;
import android.os.SystemClock;
import gh5.a;
import java.lang.Number;
import java.io.PrintStream;
import qrd.l1;
import eh5.u;
import com.kwai.component.taskdispatcher.slide.strategy.SlideVsyncMainScatterStrategy$put$2;
import eh5.u$a;
import java.lang.Boolean;
import java.util.Set;
import java.util.Map$Entry;
import nh5.a;
import java.util.PriorityQueue;
import jh5.d;
import java.util.Comparator;

public final class SlideVsyncMainScatterStrategy extends c implements Choreographer$FrameCallback	// class@000bab
{
    public final ReentrantReadWriteLock c;
    public final Choreographer d;
    public long e;
    public final SlideVsyncScatterTracker f;
    public final c g;
    public boolean h;
    public final Queue i;
    public final a j;
    public static final SlideVsyncMainScatterStrategy$a k;

    static {
       SlideVsyncMainScatterStrategy.k = new SlideVsyncMainScatterStrategy$a(null);
    }
    public void SlideVsyncMainScatterStrategy(Queue p0,a p1){
       a.p(p0, "mMainQueue");
       a.p(p1, "mConfig");
       super();
       this.i = p0;
       this.j = p1;
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.c = reentrantRea;
       this.d = Choreographer.getInstance();
       SlideVsyncScatterTracker slideVsyncSc = new SlideVsyncScatterTracker(p1.b());
       this.f = slideVsyncSc;
       ReentrantReadWriteLock$ReadLock readLock = reentrantRea.readLock();
       a.o(readLock, "mMainLock.readLock\(\)");
       this.g = new c(p0, readLock, slideVsyncSc);
    }
    public void a(long[] p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVsyncMainScatterStrategy.class, "16")) {
          return;
       }
       a.p(p0, "taskIds");
       DispatchLogger.D("slideVsyncMainScatter", "flushTasks start --- taskSize:"+p0.length+", queueSize:"+this.i.size()+", taskId: "+ArraysKt___ArraysKt.Fg(p0, null, null, null, 0, null, null, 63, null));
       if (DispatchLogger.d.C()) {
          StringBuilder str = "";
          Iterator iterator = this.i.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next().d()+", ";
          }
          DispatchLogger.D("slideVsyncMainScatter", "flushTasks mMainQueue taskId: "+str);
       }
       int i = (!p0.length)? 1: 0;
       if (i) {
          return;
       }else {
          i = p0.length;
          int i1 = 0;
          while (i1 < i) {
             long l = p0[i1];
             Iterator iterator1 = this.i.iterator();
             while (iterator1.hasNext()) {
                q oq = iterator1.next();
                if (!oq.d() - l) {
                   oq.run();
                   DispatchLogger.D("slideVsyncMainScatter", "flushTasks mMainQueue.removeItemIf: Title:"+oq.f()+" Type:"+oq.g()+" Id:"+oq.d()+" BatchId:"+oq.b()+" Discardable:"+oq.c());
                   oq.h();
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   iterator1.remove();
                }
             }
             i1 = i1 + 1;
          }
          DispatchLogger.D("slideVsyncMainScatter", "flushTasks end --- queueSize:"+this.i.size()+", taskId: "+ArraysKt___ArraysKt.Fg(p0, null, null, null, 0, null, null, 63, null));
          return;
       }
    }
    public void b(long p0,j p1){
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainScatterStrategy.class, "12")) {
          return;
       }
       a.p(p1, "mainStage");
       DispatchLogger.D("slideVsyncMainScatter", "cancelMainStageTaskByBatchId batchId:"+p0+" stage:"+p1.getClass().getSimpleName()+" before: "+this.i.size());
       ReentrantReadWriteLock$WriteLock writeLock = this.c.writeLock();
       a.o(writeLock, "mMainLock.writeLock\(\)");
       writeLock.lock();
       this.k(p0, p1);
       writeLock.unlock();
       this.n();
       DispatchLogger.D("slideVsyncMainScatter", "cancelMainStageTaskByBatchId batchId:"+p0+" stage:"+p1.getClass().getSimpleName()+"  after: "+this.i.size());
       return;
    }
    public void c(long p0){
       Object obj;
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SlideVsyncMainScatterStrategy.class, "7")) {
          return;
       }
       Iterator iterator = this.i.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             v ov = (!obj.d() - p0)? 1: null;
             if (!ov) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             DispatchLogger d = DispatchLogger.d;
             String str = " Type:";
             String str1 = " Id:";
             d.j("slideVsyncMainScatter", "cancel: Title:"+obj.f()+str+obj.g()+str1+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
             if (obj.c()) {
                if (!PatchProxy.applyVoidOneRefs(obj, this, SlideVsyncMainScatterStrategy.class, "8")) {
                   d.E("slideVsyncMainScatter", "cancelTask: Title:"+obj.f()+str+obj.g()+str1+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
                   if (obj.g() instanceof l) {
                      if (!PatchProxy.applyVoidOneRefs(obj, this, SlideVsyncMainScatterStrategy.class, "9")) {
                         v ov1 = obj.g();
                         Objects.requireNonNull(ov1, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
                         if (ov1.getStage() < 0) {
                            DispatchLogger.D("slideVsyncMainScatter", "取消Stage任务失败，准备取消的是关闭阶段的任务，不支持单独取消。若需要取消，请将对应的启动阶段的任务也取消, taskId: "+obj.d());
                         }else {
                            this.r(obj);
                         }
                      }
                   }else {
                      this.r(obj);
                   }
                }
                DispatchLogger.D("slideVsyncMainScatter", "取消任务成功");
                break ;
             }else {
                DispatchLogger.D("slideVsyncMainScatter", "取消任务失败，该任务为不可取消的任务");
                break ;
             }
          }
          break ;
       }
       return;
    }
    public void d(long p0,a p1){
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainScatterStrategy.class, "11")) {
          return;
       }
       DispatchLogger.D("slideVsyncMainScatter", "cancelTaskByBatchId : "+p0+"  before: "+this.i.size());
       ReentrantReadWriteLock$WriteLock writeLock = this.c.writeLock();
       a.o(writeLock, "mMainLock.writeLock\(\)");
       writeLock.lock();
       if (p1 != null) {
          p1.apply();
       }
       this.m(p0);
       this.k(p0, null);
       writeLock.unlock();
       this.n();
       DispatchLogger.D("slideVsyncMainScatter", "cancelTaskByBatchId : "+p0+"  after: "+this.i.size());
       return;
    }
    public void doFrame(long p0){
       String str2;
       float f;
       c c;
       String str3;
       DispatchLogger d;
       String str5;
       long l6;
       Long longx;
       DispatchLogger uDispatchLog1;
       int i1;
       a b;
       int i2;
       c obj = this;
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), obj, SlideVsyncMainScatterStrategy.class, "18")) {
          return;
       }
       DispatchLogger uDispatchLog = null;
       if (obj.i.size() > 0) {
          SlideVsyncMainScatterStrategy g = obj.g;
          long l = obj.j.b();
          int i = obj.j.a();
          Objects.requireNonNull(g);
          String str = "";
          c uoc = c.class;
          String str1 = "1";
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Integer.valueOf(i), g, uoc, str1)) {
             uoc = g.b;
             long l3 = l;
             while (true) {
                long l4 = System.nanoTime();
                c = g.c;
                c.lock();
                q oq = uoc.poll();
                c.unlock();
                if (oq != null) {
                   str3 = str;
                   DispatchLogger.d.E("slideVsyncMainScatter", "runTask: Title:"+oq.f()+" Type:"+oq.g()+" Id:"+oq.d()+" BatchId:"+oq.b()+" Discardable:"+oq.c());
                   oq.run();
                   uDispatchLog = uDispatchLog + 1;
                label_00c0 :
                   long l5 = System.nanoTime() - l4;
                   StringBuilder str4 = str1;
                   long e = c.e;
                   if ((v14 = l5 - e) > 0) {
                      d = DispatchLogger.d;
                      str5 = str4;
                      str4 = "";
                      if (oq != null) {
                         l6 = l;
                         longx = Long.valueOf(oq.d());
                      }else {
                         l6 = l;
                         longx = null;
                      }
                      str4 = str4+longx+0xff1a;
                      String str6 = (oq != null)? oq.f(): null;
                      uDispatchLog1 = uDispatchLog;
                      float f1 = (float)1000;
                      float f2 = (float)l5 / f1;
                      f2 = f2 / f1;
                      d.h("slideVsyncMainScatter", str4+str6+" 方法执行较耗时"+f2+"，注意优化");
                   }else {
                      str5 = str4;
                      uDispatchLog1 = uDispatchLog;
                      l6 = l;
                   }
                   if (oq != null) {
                      oq.h();
                   }
                   long l7 = l3 - l5;
                   c d1 = g.d;
                   Objects.requireNonNull(d1);
                   if (!PatchProxy.isSupport(SlideVsyncScatterTracker.class) || !PatchProxy.applyVoidThreeRefs(oq, Long.valueOf(l5), Long.valueOf(e), d1, SlideVsyncScatterTracker.class, "5")) {
                      str2 = "recordTask: ";
                      str = (oq != null)? oq.f(): null;
                      Log.b("SlideVsyncScatterTracker", str2+str+", "+l5+", "+e);
                      if (oq != null) {
                         v ov = oq.g();
                         str = PatchProxy.applyOneRefs(ov, d1, SlideVsyncScatterTracker.class, "11");
                         if (str != PatchProxyResult.class) {
                         }else if(a.g(ov, d.a)){
                            str2 = "default";
                         }else if(a.g(ov, w.a)){
                            str2 = "UI";
                         }else if(a.g(ov, i.a)){
                            str2 = "Main";
                         }else if(a.g(ov, f.a)){
                            str2 = "IO";
                         }else if(a.g(ov, b.a)){
                            str2 = "Async";
                         }else {
                            str = str3;
                         }
                         str = str2;
                         String str7 = oq.f();
                         if (str7 == null) {
                            str7 = str3;
                         }
                         c uoc1 = new c(str7, l5, str);
                         if (v14 > 0 && !PatchProxy.applyVoidOneRefs(uoc1, d1, SlideVsyncScatterTracker.class, "6")) {
                            obj = uoc1.title;
                            a uoa = d1.a.get(obj);
                            if (uoa == null) {
                               uoa = new a(obj, new ArrayList());
                               uoa.a().add(Long.valueOf(uoc1.a()));
                               d1.a.put(obj, uoa);
                            }else {
                               uoa.a().add(Long.valueOf(uoc1.a()));
                            }
                         }
                         d1.c.add(uoc1);
                      }
                   }
                   if (uoc.size() > 0 && l7 > 0) {
                      if (i >= 0) {
                         i1 = i - uDispatchLog1;
                         if (i1 >= 0) {
                         }
                      }else {
                      }
                   }
                label_023c :
                   DispatchLogger uDispatchLog2 = uDispatchLog1;
                   l = l6;
                   DispatchLogger.D("slideVsyncMainScatter", "开始执行前任务数量："+(g.b.size() + uDispatchLog1)+" 执行任务数量："+uDispatchLog2+' '+"当前剩余任务数量："+g.b.size()+" remainCount:"+i+" remainDuration:"+l+" remainTime:"+l7);
                   c d2 = g.d;
                   long l8 = l - l7;
                   Objects.requireNonNull(d2);
                   if (!PatchProxy.isSupport(SlideVsyncScatterTracker.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(uDispatchLog2), Long.valueOf(l8), d2, SlideVsyncScatterTracker.class, "9")) {
                      DispatchInfo uDispatchInf = new DispatchInfo(uDispatchLog2, l8, new ArrayList(d2.c), SystemClock.elapsedRealtime());
                      d2.b.add(i1);
                      d2.c.clear();
                      b = a.b;
                      Objects.requireNonNull(b);
                      if (!PatchProxy.applyVoidOneRefs(i1, b, a.class, str5)) {
                         a.p(i1, "dispatchInfo");
                         a.a.add(i1);
                      }
                   }
                }else {
                   str3 = str;
                   goto label_00c0 ;
                }
             }
          }
       label_02e7 :
          long l1 = p0;
          long l2 = System.nanoTime() - l1;
          SlideVsyncMainScatterStrategy slideVsyncMa = this;
          slideVsyncMa.e = l1;
          str2 = "doFrame  frameTimeNanos："+l1;
          f = (float)1000;
          DispatchLogger.d.j("slideVsyncMainScatter", str2+"， cost:"+(((float)l2 / f) / f));
          slideVsyncMa.h = true;
          slideVsyncMa.d.postFrameCallback(slideVsyncMa);
       }else {
          obj.h = uDispatchLog;
          DispatchLogger.d.j("slideVsyncMainScatter", "没有task, 停止执行任务");
       }
       return;
    }
    public long f(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideVsyncMainScatterStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       if (this.h == null) {
          _monitor_enter(this);
          if (this.h == null) {
             this.h = true;
             DispatchLogger.d.j("slideVsyncMainScatter", "开始执行打散任务");
             System.out.println("打散调度doFrame，"+this.j);
             this.d.postFrameCallback(this);
          }
          _monitor_exit(this);
       }
       return u.o0.a(p0, new SlideVsyncMainScatterStrategy$put$2(this));
    }
    public boolean g(long p0){
       Iterator obj;
       boolean b;
       Object obj1;
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, SlideVsyncMainScatterStrategy.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.i.iterator();
       while (true) {
          b = true;
          if (obj.hasNext()) {
             obj1 = obj.next();
             Object obj2 = (!obj1.d() - p0)? 1: null;
             if (!obj2) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 == null) {
             b = false;
             break ;
          }
          break ;
       }
       return b;
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlideVsyncMainScatterStrategy.class, "2")) {
          return;
       }
       DispatchLogger.D("slideVsyncMainScatter", "quit before: "+this.i.size());
       if (!p0) {
          this.i.clear();
       }else {
          ReentrantReadWriteLock$WriteLock writeLock = this.c.writeLock();
          a.o(writeLock, "mMainLock.writeLock\(\)");
          writeLock.lock();
          this.o();
          this.p();
          writeLock.unlock();
       }
       this.n();
       DispatchLogger.D("slideVsyncMainScatter", "quit after: "+this.i.size());
       return;
    }
    public void i(boolean p0,long[] p1){
       Object obj;
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SlideVsyncMainScatterStrategy.class, "13")) {
          return;
       }
       a.p(p1, "taskIds");
       DispatchLogger.d.E("slideVsyncMainScatter", "cancelTask: force: "+p0+", taskId: "+ArraysKt___ArraysKt.Fg(p1, null, null, null, 0, null, null, 63, null));
       ReentrantReadWriteLock$WriteLock writeLock = this.c.writeLock();
       a.o(writeLock, "mMainLock.writeLock\(\)");
       writeLock.lock();
       int len = p1.length;
       int i = 0;
       while (i < len) {
          long l = p1[i];
          Iterator iterator = this.i.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                StringBuilder str = (!obj.d() - l)? 1: null;
                if (!str) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj != null) {
                DispatchLogger.d.j("slideVsyncMainScatter", "cancel: Title:"+obj.f()+" Type:"+obj.g()+" Id:"+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
                if (p0 || obj.c()) {
                   this.r(obj);
                   DispatchLogger.D("slideVsyncMainScatter", "取消任务成功, taskId: "+l);
                }else {
                   DispatchLogger.D("slideVsyncMainScatter", "取消任务失败，该任务为不可取消的任务");
                }
             }
             i = i + 1;
          }
       }
       writeLock.unlock();
       return;
    }
    public final void k(long p0,j p1){
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainScatterStrategy.class, "15")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.i.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          if (!obj1.g() instanceof l || obj1.b() - p0) {
             i = 0;
          }
          if (i) {
             uArrayList.add(obj);
          }
       }
       DispatchLogger.D("slideVsyncMainScatter", "cancelStageTaskByBatchId before: "+this.i.size());
       if (uArrayList.isEmpty() ^ i) {
          this.q(uArrayList, p1);
       }
       DispatchLogger.D("slideVsyncMainScatter", "cancelStageTaskByBatchId after: "+this.i.size());
       return;
    }
    public final void m(long p0){
       if (PatchProxy.isSupport(SlideVsyncMainScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SlideVsyncMainScatterStrategy.class, "14")) {
          return;
       }
       DispatchLogger.D("slideVsyncMainScatter", "cancelUITaskByBatchId batchId:"+p0+" before: "+this.i.size());
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          q oq = iterator.next();
          long l = (!oq.b() - p0 && (a.g(oq.g(), w.a) && oq.c()))? 1: 0;
          if (l) {
             this.r(oq);
          }
       }
       DispatchLogger.D("slideVsyncMainScatter", "cancelUITaskByBatchId batchId:"+p0+" after: "+this.i.size());
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, SlideVsyncMainScatterStrategy.class, "3")) {
          return;
       }
       if (this.i.isEmpty()) {
          this.h = false;
          DispatchLogger.d.j("slideVsyncMainScatter", "没有task, 停止执行任务");
          this.d.removeFrameCallback(this);
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, SlideVsyncMainScatterStrategy.class, "5")) {
          return;
       }
       DispatchLogger.D("slideVsyncMainScatter", "removeAllNoPeriodicalTask before: "+this.i.size());
       SlideVsyncMainScatterStrategy ti = this.i;
       Iterator iterator = ti.iterator();
       while (iterator.hasNext()) {
          q oq = iterator.next();
          int i = oq.g() instanceof l ^ 0x01;
          if (i) {
             ti.poll();
             if (!oq.c()) {
                oq.run();
             }
          }
       }
       DispatchLogger.D("slideVsyncMainScatter", "removeAllNoPeriodicalTask after: "+this.i.size());
       return;
    }
    public final void p(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlideVsyncMainScatterStrategy.class, "6")) {
          return;
       }
       DispatchLogger.D("slideVsyncMainScatter", "removeAllPeriodicalTask before: "+this.i.size());
       HashMap hashMap = new HashMap();
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          q oq = iterator.next();
          if (oq.g() instanceof l) {
             ArrayList uArrayList = hashMap.get(Long.valueOf(oq.b()));
             if (uArrayList == null) {
                uArrayList = new ArrayList();
                hashMap.put(Long.valueOf(oq.b()), uArrayList);
             }
             a.m(uArrayList);
             uArrayList.add(oq);
          }
       }
       Iterator iterator1 = hashMap.entrySet().iterator();
       while (iterator1.hasNext()) {
          this.q(iterator1.next().getValue(), objArray);
       }
       DispatchLogger.D("slideVsyncMainScatter", "removeAllPeriodicalTask after: "+this.i.size());
       return;
    }
    public final void q(Collection p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlideVsyncMainScatterStrategy.class, "17")) {
          return;
       }
       int i = a.a(p0);
       DispatchLogger d = DispatchLogger.d;
       StringBuilder str = "removeBatchPeriodicalTask headEntryState="+i+" mainStage=";
       Integer integer = (p1 != null)? Integer.valueOf(p1.getStage()): null;
       d.j("slideVsyncMainScatter", str+integer);
       if (i != Integer.MAX_VALUE) {
          int i1 = 64;
          PriorityQueue priorityQueu = new PriorityQueue(i1, new d(true));
          PriorityQueue priorityQueu1 = new PriorityQueue(i1, new d(true));
          Iterator iterator = p0.iterator();
          int i2 = 0;
          while (iterator.hasNext()) {
             q oq = iterator.next();
             v ov = oq.g();
             String str1 = "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical";
             Objects.requireNonNull(ov, str1);
             int stage = ov.getStage();
             if (p1 != null) {
                if (!p1.b(stage)) {
                label_008f :
                   i2 = 1;
                }
             }else {
                v ov1 = oq.g();
                Objects.requireNonNull(ov1, str1);
                if (ov1.b(i) >= 0) {
                   goto label_008f ;
                }
             }
             if (i2) {
                if (stage > 0) {
                   priorityQueu.add(oq);
                }else {
                   priorityQueu1.add(oq);
                }
             }
          }
          if (priorityQueu1.size() < priorityQueu.size()) {
             DispatchLogger.d.h("slideVsyncMainScatter", "关闭阶段的任务少于启动阶段的任务，请注意内存泄漏问题 positive: "+priorityQueu.size()+", negative: "+priorityQueu1.size()+' ');
          }
          int i3 = priorityQueu.size();
          int i4 = 0;
          while (i2 < i3) {
             q oq1 = priorityQueu.poll();
             if (oq1 != null) {
                this.r(oq1);
                i4++;
             }
             oq1 = priorityQueu1.poll();
             if (oq1 != null) {
                this.r(oq1);
                i4++;
             }
             i2 = i2 + 1;
          }
          DispatchLogger.d.j("slideVsyncMainScatter", "removeBatchPeriodicalTask count: "+i4);
       }
       return;
    }
    public final void r(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVsyncMainScatterStrategy.class, "10")) {
          return;
       }
       this.i.remove(p0);
       DispatchLogger.d.E("slideVsyncMainScatter", "cancel: Title:"+p0.f()+" Type:"+p0.g()+" Id:"+p0.d()+" BatchId:"+p0.b()+" Discardable:"+p0.c());
       p0.h();
       return;
    }
}
