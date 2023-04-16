package com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter;
import com.kwai.component.taskdispatcher.strategy.simple.AsyncStageScatter;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$a;
import nsd.u;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$mQuitTaskCache$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import trd.j;
import java.util.Iterator;
import java.lang.Iterable;
import eh5.q;
import eh5.v;
import eh5.l;
import java.util.Objects;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.Collection;
import eh5.a;
import eh5.u;
import eh5.c;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$c;
import java.lang.Runnable;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTaskByBatchId$2;
import msd.l;
import eh5.u$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import eh5.o;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import java.util.concurrent.atomic.AtomicInteger;
import eh5.m;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$d;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$1;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$cancelTask$2;
import java.util.HashMap;
import com.kwai.component.taskdispatcher.slide.strategy.SlideStageScatter$b;
import java.util.Map;
import ih5.p;
import ih5.s;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.AbstractList;
import android.os.Handler;

public final class SlideStageScatter extends AsyncStageScatter	// class@000ba3
{
    public final p e;
    public static final SlideStageScatter$a f;

    static {
       SlideStageScatter.f = new SlideStageScatter$a(null);
    }
    public void SlideStageScatter(){
       super();
       this.e = s.c(SlideStageScatter$mQuitTaskCache$2.INSTANCE);
    }
    public void c(long p0){
       Object obj;
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       if (PatchProxy.isSupport(slideStageSc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, slideStageSc, "7")) {
          return;
       }
       Iterator iterator = this.o().iterator();
       while (true) {
          int i = 1;
          if (iterator.hasNext()) {
             obj = iterator.next();
             int i1 = (!obj.d() - p0)? 1: 0;
             if (!i1) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             String str = "slideStageScatter";
             if (obj.g() instanceof l) {
                v ov = obj.g();
                String str1 = "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical";
                Objects.requireNonNull(ov, str1);
                if (ov.getStage() < 0) {
                   DispatchLogger.d.h(str, "准备取消的是关闭阶段的任务，不支持单独取消。若需要取消，请将对应的启动阶段的任务也取消");
                   return;
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator1 = this.o().iterator();
                   while (iterator1.hasNext()) {
                      Object obj1 = iterator1.next();
                      Object obj2 = obj1;
                      if (!obj2.b() - obj.b()) {
                         int i2 = a.g(obj, obj2) ^ i;
                         if (i2) {
                            obj2 = 1;
                         label_0092 :
                            if (obj2) {
                               uArrayList.add(obj1);
                            }else {
                               continue ;
                            }
                         }
                      }
                      obj2 = null;
                      goto label_0092 ;
                   }
                   if (uArrayList.isEmpty() ^ i) {
                      iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         q oq = iterator1.next();
                         if (oq.g() instanceof l) {
                            v ov1 = oq.g();
                            Objects.requireNonNull(ov1, str1);
                            if (ov1.d(ov) >= 0) {
                               this.t(oq);
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                   this.t(obj);
                }
             }else {
                DispatchLogger.d.h(str, "不支持取消非周期类型的任务");
                break ;
             }
          }
          break ;
       }
       return;
    }
    public void d(long p0,a p1){
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       if (PatchProxy.isSupport(slideStageSc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, slideStageSc, "9")) {
          return;
       }
       q oq = new q(c.a, new SlideStageScatter$c(this, p0), 0, 0, false, null, 56, null);
       u.o0.a(v10, new SlideStageScatter$cancelTaskByBatchId$2(this));
       return;
    }
    public long f(q p0){
       v obj = PatchProxy.applyOneRefs(p0, this, SlideStageScatter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "task");
       if (!p0.g() instanceof l) {
          throw new IllegalArgumentException("task must be periodical");
       }
       if (this.k()) {
          obj = p0.g();
          String str = "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical";
          Objects.requireNonNull(obj, str);
          if (obj.getStage() > 0) {
             v ov = p0.g();
             Objects.requireNonNull(ov, str);
             DispatchLogger.d.h("slideStageScatter", "scatter is quiting ,forbid add positive stage task : "+ov.getStage());
             return -1;
          }
       }
       return super.f(p0);
    }
    public void h(boolean p0){
       boolean b;
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       String str = "2";
       if (PatchProxy.isSupport(slideStageSc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slideStageSc, str)) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, o.class, str);
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.b.get() != -2){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.b().set(-1);
          q oq = new q(m.a, new SlideStageScatter$d(this, p0), 0, 0, false, null, 56, null);
          super.f(b);
       }
       return;
    }
    public void i(boolean p0,long[] p1){
       SlideStageScatter slideStageSc = SlideStageScatter.class;
       if (PatchProxy.isSupport(slideStageSc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, slideStageSc, "6")) {
          return;
       }
       a.p(p1, "taskIds");
       q oq = new q(c.a, new SlideStageScatter$cancelTask$1(this, p1), 0, 0, false, null, 56, null);
       u.o0.a(v10, new SlideStageScatter$cancelTask$2(this));
       return;
    }
    public void p(q p0){
       Object obj1;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, SlideStageScatter.class, "5")) {
          return;
       }
       a.p(obj, "task");
       if (this.k() && p0.g() instanceof l) {
          v ov = p0.g();
          Objects.requireNonNull(ov, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
          SlideStageScatter$b uob = this.s().get(Long.valueOf(p0.b()));
          if (uob == null || (uob.a().isEmpty() && ov.getStage() < 0)) {
             super.p(p0);
             return;
          }else if(uob == null){
             uob = new SlideStageScatter$b();
             this.s().put(Long.valueOf(p0.b()), uob);
          }
          if (ov.getStage() > p.a.getStage()) {
             uob.a().addLast(obj);
             return;
          }else if(ov.getStage() < s.a.getStage()){
             q oq = uob.a().last();
             v ov1 = oq.g();
             Objects.requireNonNull(ov1, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
             if (!(ov1.getStage() + ov.getStage())) {
                uob.a().removeLast();
                oq.h();
                this.r(p0);
             }else {
                DispatchLogger.d.h("slideStageScatter", "存入的生命周期task顺序紊乱，请排查:\n "+CollectionsKt___CollectionsKt.V2(uob.a(), null, null, null, 0, null, null, 63, null));
                Iterator iterator = uob.a().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      v ov2 = obj1.g();
                      Objects.requireNonNull(ov2, "null cannot be cast to non-null type com.kwai.component.taskdispatcher.Periodical");
                      int i = ov2.getStage() + ov.getStage();
                      Object obj2 = (!i)? 1: null;
                      if (!obj2) {
                         continue ;
                      }
                   }else {
                      obj1 = null;
                   }
                   if (obj1 == null) {
                      super.p(p0);
                      break ;
                   }else {
                      uob.a().remove(obj1);
                      obj1.h();
                      this.r(p0);
                      break ;
                   }
                }
             }
             return;
          }
       }
       super.p(p0);
       return;
    }
    public final HashMap s(){
       Object obj = PatchProxy.apply(null, this, SlideStageScatter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final void t(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideStageScatter.class, "8")) {
          return;
       }
       long l = p0.d();
       this.n().removeMessages((int)(l ^ (l >> 32)));
       this.r(p0);
       return;
    }
}
