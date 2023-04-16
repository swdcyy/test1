package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$startTimeoutCheck$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import com.kwai.performance.monitor.base.Monitor;
import ef7.b;
import java.util.Map;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.util.LinkedList;
import gf7.e;
import gf7.g;
import java.util.Iterator;
import java.lang.Iterable;
import gf7.a;
import kotlin.jvm.internal.a;
import java.lang.Math;
import nsd.u;
import java.lang.StringBuilder;
import com.kwai.performance.fluency.page.monitor.tracker.Tracker;
import java.util.List;
import ef7.a;
import if7.b;
import com.kwai.performance.fluency.page.monitor.PageMonitorReporter;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3;

public final class AutoTracker$startTimeoutCheck$1 extends Lambda implements a	// class@0010c8
{
    public final String $pageKey;
    public final String $pageName;

    public void AutoTracker$startTimeoutCheck$1(String p0,String p1){
       this.$pageKey = p0;
       this.$pageName = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (!AutoTracker.INSTANCE.isInitialized()) {
          return;
       }
       b n = b.n;
       PageStageEvent pageStageEve = n.j().get(this.$pageKey);
       if (pageStageEve != null) {
          long l = 0;
          if (!n.c(this.$pageName)) {
             Object obj = n.e().get(this.$pageKey);
             if (obj != null) {
                e uoe = g.c(pageStageEve, "OnRequestEnd");
                long l1 = (uoe != null)? uoe.b(): l;
                a uoa = null;
                Iterator iterator = obj.iterator();
                int i = 2000;
                while (iterator.hasNext()) {
                   a uoa1 = iterator.next();
                   long l2 = uoa1.e() - l1;
                   if (l2 - (long)i > 0) {
                      break ;
                   }else if(uoa == null){
                      a.m(uoa);
                      float f = uoa.b() - uoa1.b();
                      int i1 = 0x3f847ae147ae147b;
                      if ((double)Math.abs(f) - i1 <= 0) {
                         a.m(uoa);
                         f = uoa.c() - uoa1.c();
                         if ((double)Math.abs(f) - i1 <= 0) {
                         }
                      }
                   }
                   uoa = uoa1;
                }
                if (uoa != null && (uoa.e() - l1) - (long)i <= 0) {
                   e uoe1 = new e("OnFinishDraw", 0, 2, null);
                   iterator.c(uoa.e());
                   AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                   iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_t3_end_no_fully_8060");
                   b n1 = b.n;
                   PageStageEvent pageStageEve1 = n1.j().get(this.$pageKey);
                   if (pageStageEve1 != null) {
                      List moments = pageStageEve1.getMoments();
                      if (moments != null) {
                         moments.add(iterator);
                      }
                   }
                   a uoa2 = n1.h().get(this.$pageKey);
                   if (uoa2 != null && !uoa2.c(pageStageEve)) {
                      b.c(iterator.b(), true);
                      b.g(pageStageEve.pageCode);
                      PageMonitorReporter.b.a(pageStageEve, iNSTANCE.getMonitorConfig());
                      AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3 ostartTimeou = new AutoTracker$startTimeoutCheck$1$$special$$inlined$let$lambda$3(uoa, l1, obj, pageStageEve, this);
                      uoa.a(v11);
                   }
                   n1.d(this.$pageKey);
                   iNSTANCE.traceEnd(pageStageEve.pageName);
                   return;
                }
             }
          }
          if (!g.b(pageStageEve, "OnFinishDraw") - l) {
             pageStageEve.resultCode = "fail";
             pageStageEve.reason = "timeout";
             b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
          }
          AutoTracker iNSTANCE1 = AutoTracker.INSTANCE;
          iNSTANCE1.markTraceSection(pageStageEve.pageName, iNSTANCE1.getPageSimpleName(pageStageEve.pageName)+"_t3_end_timeout");
          n = b.n;
          a uoa3 = n.h().get(this.$pageKey);
          if (uoa3 != null) {
             uoa3.d(pageStageEve);
          }
          Iterator iterator1 = n.g().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().d(pageStageEve);
          }
          n = b.n;
          uoa3 = n.h().get(this.$pageKey);
          if (uoa3 != null && !uoa3.c(pageStageEve)) {
             PageMonitorReporter.b.a(pageStageEve, AutoTracker.INSTANCE.getMonitorConfig());
          }
          n.d(this.$pageKey);
          AutoTracker.INSTANCE.traceEnd(pageStageEve.pageName);
       }
       return;
    }
}
