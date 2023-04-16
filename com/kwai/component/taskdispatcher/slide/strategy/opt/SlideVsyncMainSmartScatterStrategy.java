package com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy;
import java.lang.Runnable;
import android.view.Choreographer$FrameCallback;
import lh5.c;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$a;
import nsd.u;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Queue;
import lh5.a;
import ih5.z;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2;
import android.view.Choreographer;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Arrays;
import java.util.Iterator;
import eh5.q;
import eh5.v;
import eh5.j;
import java.lang.Long;
import eh5.l;
import java.util.Objects;
import eh5.a;
import eh5.w;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import eh5.e;
import java.lang.System;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Set;
import java.util.Map$Entry;
import nh5.a;
import java.lang.Integer;
import java.util.PriorityQueue;
import jh5.d;
import java.util.Comparator;
import java.lang.Iterable;
import kh5.c;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor;

public final class SlideVsyncMainSmartScatterStrategy extends c implements Runnable, Choreographer$FrameCallback	// class@000bb3
{
    public final p c;
    public final Choreographer d;
    public final Handler e;
    public long f;
    public boolean g;
    public final Queue h;
    public final a i;
    public final z j;
    public static long k;
    public static final p l;
    public static final SlideVsyncMainSmartScatterStrategy$a m;

    static {
       SlideVsyncMainSmartScatterStrategy.m = new SlideVsyncMainSmartScatterStrategy$a(null);
       SlideVsyncMainSmartScatterStrategy.l = s.c(SlideVsyncMainSmartScatterStrategy$Companion$displayVsyncPeriod$2.INSTANCE);
    }
    public void SlideVsyncMainSmartScatterStrategy(Queue p0,a p1,z p2){
       a.p(p0, "mMainQueue");
       a.p(p1, "mConfig");
       a.p(p2, "mSlideDispatchSmartConfig");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.c = s.c(new SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2(this));
       this.d = Choreographer.getInstance();
       this.e = new Handler(Looper.getMainLooper());
    }
    public void a(long[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVsyncMainSmartScatterStrategy.class, "12")) {
          return;
       }
       a.p(p0, "taskIds");
       int i = 0;
       DispatchLogger uDispatchLog = (!p0.length)? 1: null;
       if (uDispatchLog) {
          return;
       }else {
          DispatchLogger.d.E("SmartScatterStrategy", "flushTasks start --- taskSize:"+p0.length+", queueSize:"+this.h.size()+", taskId: "+ArraysKt___ArraysKt.Fg(p0, null, null, null, 0, null, null, 63, null));
          Arrays.sort(p0);
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             a.o(obj, "iterator.next\(\)");
             while (i < p0.length) {
                if (!p0[i] - obj.d()) {
                   obj.run();
                   DispatchLogger.d.E("SmartScatterStrategy", "flushTasks mMainQueue.removeItemIf: Title:"+obj.f()+" Type:"+obj.g()+" Id:"+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
                   obj.h();
                   iterator.remove();
                   i = i + 1;
                   break ;
                }else if(p0[i] - obj.d() < 0){
                   i = i + 1;
                }else if(i >= p0.length){
                }
             }
          }
          return;
       }
    }
    public void b(long p0,j p1){
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainSmartScatterStrategy.class, "11")) {
          return;
       }
       a.p(p1, "mainStage");
       return;
    }
    public void c(long p0){
       Object obj;
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SlideVsyncMainSmartScatterStrategy.class, "10")) {
          return;
       }
       Iterator iterator = this.h.iterator();
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
             d.E("SmartScatterStrategy", "cancel: Title:"+obj.f()+str+obj.g()+str1+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
             if (obj.c()) {
                if (!PatchProxy.applyVoidOneRefs(obj, this, SlideVsyncMainSmartScatterStrategy.class, "20")) {
                   d.E("SmartScatterStrategy", "cancelTask: Title:"+obj.f()+str+obj.g()+str1+obj.d()+" BatchId:"+obj.b()+" Discardable:"+obj.c());
                   if (obj.g() instanceof l) {
                      if (!PatchProxy.applyVoidOneRefs(obj, this, SlideVsyncMainSmartScatterStrategy.class, "21")) {
                         v ov1 = obj.g();
                         Objects.requireNonNull(ov1, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
                         if (ov1.getStage() < 0) {
                            d.E("SmartScatterStrategy", "取消Stage任务失败，准备取消的是关闭阶段的任务，不支持单独取消。若需要取消，请将对应的启动阶段的任务也取消, taskId: "+obj.d());
                         }else {
                            this.m(obj);
                         }
                      }
                   }else {
                      this.m(obj);
                   }
                }
                d.E("SmartScatterStrategy", "取消任务成功");
                break ;
             }else {
                d.E("SmartScatterStrategy", "取消任务失败，该任务为不可取消的任务");
                break ;
             }
          }
          break ;
       }
       return;
    }
    public void d(long p0,a p1){
       long l;
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainSmartScatterStrategy.class, "8")) {
          return;
       }
       DispatchLogger d = DispatchLogger.d;
       d.E("SmartScatterStrategy", "cancelTaskByBatchId : "+p0+"  before: "+this.h.size());
       if (p1 != null) {
          p1.apply();
       }
       int i = 1;
       if (!PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SlideVsyncMainSmartScatterStrategy.class, "18")) {
          String str = "cancelUITaskByBatchId batchId:";
          d.E("SmartScatterStrategy", str+p0+" before: "+this.h.size());
          Iterator iterator1 = this.h.iterator();
          while (iterator1.hasNext()) {
             q oq = iterator1.next();
             l = (!oq.b() - p0 && (a.g(oq.g(), w.a) && oq.c()))? 1: 0;
             if (l) {
                this.m(oq);
             }
          }
          DispatchLogger.d.E("SmartScatterStrategy", str+p0+" after: "+this.h.size());
       }
       p1 = null;
       if (!PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, SlideVsyncMainSmartScatterStrategy.class, "19")) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             obj1 = (obj1.g() instanceof l && !obj1.b() - p0)? 1: null;
             if (obj1) {
                uArrayList.add(obj);
             }
          }
          d = DispatchLogger.d;
          d.E("SmartScatterStrategy", "cancelStageTaskByBatchId before: "+this.h.size());
          if (i ^ uArrayList.isEmpty()) {
             this.k(uArrayList, p1);
          }
          d.E("SmartScatterStrategy", "cancelStageTaskByBatchId after: "+this.h.size());
       }
       DispatchLogger.d.E("SmartScatterStrategy", "cancelTaskByBatchId : "+p0+"  after: "+this.h.size());
       return;
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, SlideVsyncMainSmartScatterStrategy.class, "3")) {
          return;
       }
       this.f = p0;
       this.e.postAtFrontOfQueue(this);
       return;
    }
    public long f(q p0){
       long l;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideVsyncMainSmartScatterStrategy.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       if (this.g == null) {
          this.g = true;
          this.n();
       }
       e.a(p0);
       p0.k(System.nanoTime());
       if (this.h.add(p0)) {
          DispatchLogger.d.E("SmartScatterStrategy", "put task.id="+p0.d()+", task.name="+p0.f());
          l = p0.d();
       }else {
          l = -1;
       }
       return l;
    }
    public boolean g(long p0){
       Iterator obj;
       boolean b;
       Object obj1;
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, SlideVsyncMainSmartScatterStrategy.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.h.iterator();
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
       Iterator iterator;
       q oq;
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SlideVsyncMainSmartScatterStrategy.class, "6")) {
          return;
       }
       DispatchLogger d = DispatchLogger.d;
       d.E("SmartScatterStrategy", "quit before: "+this.h.size());
       if (!p0) {
          this.h.clear();
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, SlideVsyncMainSmartScatterStrategy.class, "13")) {
             d.E("SmartScatterStrategy", "removeAllNoPeriodicalTask before: "+this.h.size());
             SlideVsyncMainSmartScatterStrategy th = this.h;
             iterator = th.iterator();
             while (iterator.hasNext()) {
                oq = iterator.next();
                int i = oq.g() instanceof l ^ 0x01;
                if (i) {
                   th.poll();
                   if (!oq.c()) {
                      oq.run();
                   }
                }
             }
             DispatchLogger.d.E("SmartScatterStrategy", "removeAllNoPeriodicalTask after: "+this.h.size());
          }
          if (!PatchProxy.applyVoid(objArray, this, SlideVsyncMainSmartScatterStrategy.class, "14")) {
             DispatchLogger.d.E("SmartScatterStrategy", "removeAllPeriodicalTask before: "+this.h.size());
             HashMap hashMap = new HashMap();
             iterator = this.h.iterator();
             while (iterator.hasNext()) {
                oq = iterator.next();
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
                this.k(iterator1.next().getValue(), objArray);
             }
             DispatchLogger.d.E("SmartScatterStrategy", "removeAllPeriodicalTask after: "+this.h.size());
          }
       }
       DispatchLogger.d.E("SmartScatterStrategy", "quit after: "+this.h.size());
       return;
    }
    public void i(boolean p0,long[] p1){
       if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, SlideVsyncMainSmartScatterStrategy.class, "9")) {
          return;
       }
       a.p(p1, "taskIds");
       int i = 0;
       DispatchLogger uDispatchLog = (!p1.length)? 1: null;
       if (uDispatchLog) {
          return;
       }else {
          DispatchLogger.d.E("SmartScatterStrategy", "cancelTask start --- taskSize:"+p1.length+", queueSize:"+this.h.size()+", taskId: "+ArraysKt___ArraysKt.Fg(p1, null, null, null, 0, null, null, 63, null));
          Arrays.sort(p1);
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             a.o(obj, "iterator.next\(\)");
             while (i < p1.length) {
                if (!p1[i] - obj.d() && (p0 || obj.c())) {
                   iterator.remove();
                   i = i + 1;
                   break ;
                }else if(p1[i] - obj.d() < 0){
                   i = i + 1;
                }else if(i >= p1.length){
                }
             }
          }
          return;
       }
    }
    public final void k(Collection p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlideVsyncMainSmartScatterStrategy.class, "15")) {
          return;
       }
       int i = a.a(p0);
       DispatchLogger d = DispatchLogger.d;
       StringBuilder str = "removeBatchPeriodicalTask headEntryState="+i+" mainStage=";
       Integer integer = (p1 != null)? Integer.valueOf(p1.getStage()): null;
       d.E("SmartScatterStrategy", str+integer);
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
             DispatchLogger.d.E("SmartScatterStrategy", "关闭阶段的任务少于启动阶段的任务，请注意内存泄漏问题 positive: "+priorityQueu.size()+", negative: "+priorityQueu1.size()+' ');
          }
          int i3 = priorityQueu.size();
          int i4 = 0;
          while (i2 < i3) {
             q oq1 = priorityQueu.poll();
             if (oq1 != null) {
                this.m(oq1);
                i4++;
             }
             oq1 = priorityQueu1.poll();
             if (oq1 != null) {
                this.m(oq1);
                i4++;
             }
             i2 = i2 + 1;
          }
          DispatchLogger.d.E("SmartScatterStrategy", "removeBatchPeriodicalTask count: "+i4);
       }
       return;
    }
    public final void m(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVsyncMainSmartScatterStrategy.class, "16")) {
          return;
       }
       this.h.remove(p0);
       DispatchLogger.d.E("SmartScatterStrategy", "cancel: Title:"+p0.f()+" Type:"+p0.g()+" Id:"+p0.d()+" BatchId:"+p0.b()+" Discardable:"+p0.c());
       p0.h();
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, SlideVsyncMainSmartScatterStrategy.class, "2")) {
          return;
       }
       this.d.postFrameCallback(this);
       return;
    }
    public void run(){
       SlideVsyncMainSmartScatterStrategy$a obj1;
       long l1;
       String str5;
       String str6;
       long k;
       String str7;
       long l3;
       c c;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, obj, SlideVsyncMainSmartScatterStrategy.class, str)) {
          return;
       }
       long l = System.nanoTime();
       SlideVsyncMainSmartScatterStrategy.k = SlideVsyncMainSmartScatterStrategy.k + 1;
       String str1 = "  taskcost:";
       String str2 = "  endNanos:";
       String str3 = "SmartScatterStrategy";
       if (obj.h.size() > 0) {
          String str4 = "1";
          c uoc = PatchProxy.apply(objArray, obj, SlideVsyncMainSmartScatterStrategy.class, str4);
          if (uoc == patchProxyRe) {
             uoc = obj.c.getValue();
          }
          SlideVsyncMainSmartScatterStrategy f = obj.f;
          if (PatchProxy.isSupport(SlideVsyncMainSmartScatterStrategy.class)) {
             obj1 = PatchProxy.applyTwoRefs(Long.valueOf(f), Long.valueOf(l), obj, SlideVsyncMainSmartScatterStrategy.class, "17");
             if (obj1 != patchProxyRe) {
                l1 = obj1.longValue();
                str5 = str1;
                str6 = str2;
                str2 = str;
             label_00a1 :
                k = SlideVsyncMainSmartScatterStrategy.k;
                Objects.requireNonNull(uoc);
                c uoc1 = c.class;
                if (PatchProxy.isSupport(uoc1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), Long.valueOf(k), uoc, uoc1, str4)) {
                   str7 = str3;
                }else {
                   String str8 = "2";
                   if (PatchProxy.isSupport(uoc1)) {
                      Object obj2 = PatchProxy.applyTwoRefs(Long.valueOf(l1), Long.valueOf(k), uoc, uoc1, str8);
                      if (obj2 != patchProxyRe) {
                         l3 = obj2.longValue();
                         str7 = str3;
                      }else {
                      label_00e2 :
                         uoc1 = uoc.a;
                         Objects.requireNonNull(uoc1);
                         DefaultRemainCostProcessor uDefaultRema = DefaultRemainCostProcessor.class;
                         if (PatchProxy.isSupport(uDefaultRema)) {
                            str7 = str3;
                            Object obj3 = PatchProxy.applyTwoRefs(Long.valueOf(l1), Long.valueOf(k), uoc1, uDefaultRema, str4);
                            if (obj3 != patchProxyRe) {
                               l3 = obj3.longValue();
                            }
                         }else {
                            str7 = str3;
                         }
                         Number number = PatchProxy.apply(null, uoc1, uDefaultRema, str8);
                         if (number == patchProxyRe) {
                            number = uoc1.c.getValue();
                         }
                         long l6 = l1 - number.longValue();
                         if (l6 > 0) {
                            if (uoc1.b > null) {
                               uoc1.b = 0;
                            }
                         }else {
                            uoc1.b = uoc1.b + 1;
                            DispatchLogger.d.E(uoc1.a, 0x7b2c+k+" frame freeze,current freezeCount : "+uoc1.b);
                            DefaultRemainCostProcessor b = uoc1.b;
                            Object[] objArray1 = null;
                            Number number1 = PatchProxy.apply(objArray1, uoc1, uDefaultRema, "3");
                            if (number1 == patchProxyRe) {
                               number1 = uoc1.d.getValue();
                            }
                            if (b >= number1.intValue()) {
                               Number number2 = PatchProxy.apply(objArray1, uoc1, uDefaultRema, str2);
                               if (number2 == patchProxyRe) {
                                  number2 = uoc1.e.getValue();
                               }
                               uoc1.b = 0;
                               l3 = number2.longValue();
                            }
                         }
                         l3 = l6;
                      }
                   }else {
                      goto label_00e2 ;
                   }
                   DispatchLogger.d.E(uoc.b, "runActions  remainDuration:"+l3+' ');
                   if (l3 >= 0) {
                      c = uoc.c;
                      int i = c.size();
                      long l4 = l3;
                      int i1 = 0;
                      do {
                         l1 = System.nanoTime();
                         q oq = c.poll();
                         if (oq != null) {
                            oq.run();
                            i1 = i1 + 1;
                         }
                         long l5 = System.nanoTime() - l1;
                         if (oq != null) {
                            oq.h();
                         }
                         l4 = l4 - l5;
                      } while (c.size() <= 0 || l4 <= 0);
                      DispatchLogger.d.E(uoc.b, "开始执行前任务数量："+i+" 执行任务数量："+i1+" 当前剩余任务数量："+uoc.c.size()+", 当前帧 "+k+" 耗时："+((float)(l3 - l4) / (float)0xf4240));
                   }
                }
                obj.g = true;
                this.n();
                long l2 = System.nanoTime();
                float f1 = (float)1000;
                DispatchLogger.d.E(str7, "run task startNanos:"+l+str6+l2+str5+(((float)(l2 - l) / f1) / f1));
             }
          }
          obj1 = SlideVsyncMainSmartScatterStrategy.m;
          l3 = (obj1.a() + f) - l;
          str5 = str1;
          str6 = str2;
          str2 = str;
          DispatchLogger.d.E(str3, "mDisplayVsyncPeriod : "+obj1.a()+"  preCost:"+(l - f)+"  remain: "+l3);
          l1 = l3;
          goto label_00a1 ;
       }else {
          obj.g = false;
          k = System.nanoTime();
          float f2 = (float)1000;
          DispatchLogger.d.E(str3, "run, no task startNanos:"+l+str2+k+str1+(((float)(k - l) / f2) / f2));
       }
       return;
    }
}
