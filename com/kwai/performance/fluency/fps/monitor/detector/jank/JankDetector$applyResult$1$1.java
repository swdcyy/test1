package com.kwai.performance.fluency.fps.monitor.detector.jank.JankDetector$applyResult$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import we7.c;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import we7.b;
import ye7.a;
import ve7.a;
import java.lang.Iterable;
import we7.a;
import we7.e;
import java.lang.Long;
import java.util.UUID;
import df7.f;
import df7.e;
import java.util.NoSuchElementException;
import java.util.Collection;

public final class JankDetector$applyResult$1$1 extends Lambda implements a	// class@00107b
{
    public final FpsEventV2 $fpsEventV2;
    public final c $it;

    public void JankDetector$applyResult$1$1(c p0,FpsEventV2 p1){
       this.$it = p0;
       this.$fpsEventV2 = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object obj;
       int i3;
       JankDetector$applyResult$1$1 uoapplyResul = this;
       JankDetector$applyResult$1$1 $it = uoapplyResul.$it;
       a.o($it, "it");
       JankDetector$applyResult$1$1 $fpsEventV2 = uoapplyResul.$fpsEventV2;
       FpsEventV2 hitStackTrac = $fpsEventV2.hitStackTrace;
       int i = 5000;
       a.p($it, "<this>");
       a.p($fpsEventV2, "fpsEvent");
       List list = $fpsEventV2.g();
       Iterator iterator = $it.b().iterator();
       boolean b = false;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             b uob = iterator.next();
             long l = uob.g() - $fpsEventV2.startTime;
             uob.q(l);
             long l1 = uob.b() - $fpsEventV2.startTime;
             uob.k(l1);
             int i2 = 1;
             if (b != null) {
                l = b.b() + i;
                if (l - uob.b() < 0) {
                   i3 = b.d() + i2;
                   uob.m(i3);
                }else {
                   uob.m(b.d());
                   i3 = b.e() + i2;
                   uob.o(i3);
                }
             }
             if (i1 < list.size()) {
                if (uob.g() - list.get(i1).a() > 0) {
                   do {
                      i1 = i1 + i2;
                   } while (i1 < list.size() && uob.g() - list.get(i1).a() > 0);
                }
                if (i1 < list.size() && (uob.g() - list.get(i1).c() >= 0 && uob.g() - list.get(i1).a() <= 0)) {
                   uob.l(list.get(i1).d());
                }
             }
          label_00d9 :
             Iterator iterator1 = $fpsEventV2.f().iterator();
             while (true) {
                if (!iterator1.hasNext()) {
                   throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                a uoa = iterator1.next();
                boolean b1 = (uoa.type == uob.c())? true: false;
                if (b1) {
                   iterator1 = uoa.a().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj = iterator1.next();
                         i = (obj.type == uob.h())? 1: 0;
                         if (i) {
                         label_0121 :
                            if (obj == null) {
                               obj = new e(uob.h());
                               uoa.a().add(obj);
                            }
                            long l2 = obj.a() + uob.a();
                            obj.totalDuration = l2;
                            obj.jankStartTimeList.add(Long.valueOf(uob.g()));
                            if (hitStackTrac != null) {
                               String str = UUID.randomUUID().toString();
                               uob.uuid = str;
                               a.m(str);
                               $fpsEventV2.f.recordsList.add(new e(str, uob.f()));
                            }
                            b = uob;
                            i = 5000;
                         }else {
                            i = 5000;
                         }
                      }else {
                         obj = null;
                         goto label_0121 ;
                      }
                   }
                }
             }
          }else {
             Iterator iterator2 = $fpsEventV2.f().iterator();
             while (iterator2.hasNext()) {
                Iterator iterator3 = iterator2.next().a().iterator();
                while (iterator3.hasNext()) {
                   e uoe = iterator3.next();
                   double d = (double)uoe.a() * 0x3ff0000000000000;
                   long l3 = $fpsEventV2.endTime - $fpsEventV2.startTime;
                   d = d / (double)l3;
                   uoe.jankUnitDuration = d;
                }
             }
             if (hitStackTrac != null) {
                $fpsEventV2.janks.addAll($it.b());
             }
             return;
          }
       }
    }
}
