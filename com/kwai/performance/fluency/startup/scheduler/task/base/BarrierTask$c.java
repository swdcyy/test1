package com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$c;
import tf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import tf7.a$a;
import com.kwai.performance.fluency.startup.scheduler.debug.UmlGraph;
import java.util.Objects;
import java.lang.System;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import android.os.SystemClock;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$b;
import java.util.concurrent.atomic.AtomicInteger;
import qrd.l1;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import qf7.b;
import java.util.concurrent.locks.Lock;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import pf7.b;

public final class BarrierTask$c implements a	// class@000da1
{
    public final BarrierTask a;

    public void BarrierTask$c(BarrierTask p0){
       a.q(p0, "mBarrierTask");
       super();
       this.a = p0;
    }
    public void a(a$a p0){
       BarrierTask$b uob;
       BarrierTask$c uoc;
       a.q(p0, "chain");
       Objects.requireNonNull(UmlGraph.h);
       p0.o = System.currentTimeMillis();
       this.a.z(3);
       this.b();
       p0.p = SystemClock.elapsedRealtime();
       while (true) {
          uob = this.a.C();
          BarrierTask$b b = uob.b;
          _monitor_enter(b);
          int i = uob.a.get();
          break ;
       }
       while (true) {
          if (uob.a.get()) {
             uob.b.wait();
             if (uob.a.get() < i) {
                i = uob.a.get();
             }else {
                uoc = null;
                _monitor_exit(b);
             label_0055 :
                if (!uoc) {
                   this.b();
                }else {
                   break ;
                }
             }
          }else {
             _monitor_exit(b);
             uoc = 1;
             goto label_0055 ;
          }
       }
       uob = this.a.C();
       _monitor_enter(uob);
       this.a.run();
       _monitor_exit(uob);
       return;
    }
    public final void b(){
       BarrierTask$c uoc;
       DependencyTask uDependencyT;
       DependencyTask uDependencyT1;
       Condition uCondition;
       while (this.a.u().size() > 0) {
          BarrierTask$b uob = this.a.C();
          BarrierTask$b b = uob.b;
          _monitor_enter(b);
          _monitor_exit(b);
          if (uob.a.get() <= 0) {
             break ;
          }else {
             List list = this.a.u();
             if (!list instanceof Collection || !list.isEmpty()) {
                Iterator iterator1 = list.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      List list2 = (iterator1.next().r() > 0)? 1: null;
                      if (!list2) {
                         uoc = null;
                         break ;
                      }
                   }
                }
                if (uoc) {
                }else {
                   uoc = this.a;
                   a.q(uoc, "barrierTask");
                   ReentrantLock e = b.e;
                   e.lock();
                   LinkedList d = b.d;
                   boolean i = d.isEmpty() ^ 1;
                   if (i) {
                      uDependencyT = d.removeFirst();
                      e.unlock();
                   }else {
                      Iterator iterator = b.c.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            uDependencyT1 = iterator.next();
                            a.h(uDependencyT1, "dependencyTask");
                            if (b.i.d(uDependencyT1, uoc)) {
                               b.c.remove(uDependencyT1);
                               e.unlock();
                            }
                         }else {
                            while (true) {
                               List list1 = uoc.u();
                               if (!list1 instanceof Collection || !list1.isEmpty()) {
                                  iterator = list1.iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        i = (iterator.next().h.get() > 0)? true: false;
                                        if (i) {
                                           uCondition = 1;
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                                  uDependencyT1 = null;
                                  if (uCondition) {
                                     b.g = uoc;
                                     b.f.await();
                                     b.g = uDependencyT1;
                                     d = b.d;
                                     i = d.isEmpty() ^ 1;
                                     if (i) {
                                        b.h.clear();
                                        uDependencyT = d.removeFirst();
                                        e.unlock();
                                     }else {
                                        iterator = b.c.iterator();
                                        while (true) {
                                           if (iterator.hasNext()) {
                                              uDependencyT1 = iterator.next();
                                              if (b.h.contains(uDependencyT1)) {
                                                 b.h.clear();
                                                 b.c.remove(uDependencyT1);
                                                 e.unlock();
                                              }else {
                                                 continue ;
                                              }
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                  }else {
                                     e.unlock();
                                  }
                               }
                               uCondition = null;
                               goto label_00ce ;
                            }
                            return;
                         }
                         uDependencyT = uDependencyT1;
                         break ;
                      }
                   }
                   if (uDependencyT != null) {
                      b.b.a(uDependencyT);
                   }else {
                      goto label_012f ;
                   }
                }
             }
             uoc = 1;
             goto label_0050 ;
          }
       }
    }
}
