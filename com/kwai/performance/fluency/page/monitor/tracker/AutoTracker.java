package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import com.kwai.performance.fluency.page.monitor.tracker.Tracker;
import java.lang.String;
import ef7.b;
import java.util.Map;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import gf7.e;
import gf7.g;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import if7.b;
import ef7.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import yf7.h;
import com.kwai.performance.fluency.page.monitor.PageMonitorReporter;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import msd.a;
import java.lang.Long;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$checkWriteScreen$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.lang.Throwable;
import nsd.u;
import java.lang.ref.WeakReference;
import java.util.Objects;
import gf7.c;
import java.lang.Number;
import msd.l;
import java.lang.Boolean;
import hf7.b;
import com.kwai.performance.fluency.page.monitor.view.TimestampView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import qrd.l1;
import android.os.SystemClock;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$onPause$$inlined$let$lambda$1;
import java.lang.CharSequence;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$startTimeoutCheck$1;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import android.app.Activity;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$trackFirstFrameOnActivity$$inlined$let$lambda$1;
import androidx.fragment.app.Fragment;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1;

public final class AutoTracker extends Tracker	// class@0010cb
{
    public static final AutoTracker INSTANCE;

    static {
       AutoTracker.INSTANCE = new AutoTracker();
    }
    public void AutoTracker(){
       super();
    }
    public final void checkJumpOut(String p0){
       b n = b.n;
       PageStageEvent pageStageEve = n.j().get(p0);
       if (pageStageEve != null) {
          e uoe = (pageStageEve.isDynamicPage != null)? g.c(pageStageEve, "OnFinishDraw"): g.c(pageStageEve, "OnFirstFrameDraw");
          if (uoe == null) {
             int i = 1;
             if (a.g(pageStageEve.resultCode, "success") ^ i) {
                pageStageEve.resultCode = "cancel";
                pageStageEve.reason = "jumpout";
                b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
                a uoa = n.h().get(p0);
                if (uoa != null) {
                   uoa.e(pageStageEve);
                }
                Iterator iterator = n.g().iterator();
                while (iterator.hasNext()) {
                   iterator.next().e(pageStageEve);
                }
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_cancel_"+pageStageEve.reason);
                b n1 = b.n;
                a uoa1 = n1.h().get(p0);
                if (uoa1 != null && uoa1.c(pageStageEve) == i) {
                   h.b("PageMonitor AutoTracker", p0+" page event was consumed by business");
                   iNSTANCE.traceEnd(pageStageEve.pageName);
                   n1.d(p0);
                   return;
                }else {
                   PageMonitorReporter.b.a(pageStageEve, iNSTANCE.getMonitorConfig());
                   iNSTANCE.traceEnd(pageStageEve.pageName);
                   n1.d(p0);
                }
             }
          }
       }
    label_00e0 :
       return;
    }
    public final void checkWriteScreen(String p0){
       long l;
       PageMonitorConfig b = this.getMonitorConfig().b;
       if (b != null) {
          Long longx = b.invoke();
          if (longx != null) {
             l = longx.longValue();
          label_0019 :
             Monitor_ThreadKt.a(l, new AutoTracker$checkWriteScreen$1(p0));
             return;
          }
       }
       l = 5000;
       goto label_0019 ;
    }
    public final void handleException(Throwable p0){
       a.p(p0, "e");
       h.b("PageMonitor AutoTracker", "handleException "+p0);
    }
    public final void onCreate(Object p0){
       boolean b;
       PageMonitorConfig h;
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageName(p0);
          if (pageName != null) {
             String pageKey = this.getPageKey(p0);
             if (pageKey != null) {
                this.markTraceSection(pageName, this.getPageSimpleName(pageName)+"_onCreate_t0_start");
                PageStageEvent pageStageEve = n.j().get(pageKey);
                b = false;
                u ou = null;
                if (pageStageEve == null) {
                   pageStageEve = new PageStageEvent(pageName, b, 2, ou);
                   n.j().put(pageKey, pageStageEve);
                   a.m(p0);
                   n.k().put(pageKey, new WeakReference(p0));
                }
                PageStageEvent pageName1 = pageStageEve.pageName;
                Objects.requireNonNull(n);
                a.p(pageName1, "pageName");
                Iterator iterator = n.a().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Object obj = iterator.next();
                      if (a.g(obj.a(), pageName1)) {
                         ou = obj;
                      }
                   }
                   if (ou != null && ou.dynamicType == null) {
                      b = true;
                   }
                   pageStageEve.isDynamicPage = b;
                   e uoe = new e("OnCreate", 0, 2, null);
                   pageStageEve.getMoments().add(iterator);
                   String str = "OnInit";
                   uoe = g.c(pageStageEve, str);
                   b n1 = b.n;
                   if (n1.i().containsKey(pageName)) {
                      Long longx = n1.i().remove(pageName);
                      if (longx != null) {
                         long l = longx.longValue();
                         if (uoe == null) {
                            pageStageEve.getMoments().add(new e(str, l));
                         }else {
                            uoe.c(l);
                         }
                      }
                   }
                   h = this.getMonitorConfig().h;
                   if (h != null) {
                      a.m(p0);
                      if (!h.invoke(p0).booleanValue()) {
                      label_0116 :
                         this.startTimeoutCheck$com_kwai_performance_fluency_page_monitor(p0);
                      label_0119 :
                         h.a("PageMonitor AutoTracker", pageKey+" onCreate -> "+iterator.b());
                         long l1 = iterator.b();
                         p0 = b.c.a();
                         if (p0 != null) {
                            p0.setT0Msg("t0 end: "+new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(l1)));
                            break ;
                         }
                      }
                   }
                   if (pageStageEve.isRealShow()) {
                      goto label_0116 ;
                   }else {
                      goto label_0119 ;
                   }
                }
             }
          }
          return;
       }
    }
    public final void onDestroy(Object p0){
       PageMonitorConfig h;
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             PageStageEvent pageStageEve = n.j().get(pageName);
             if (pageStageEve != null) {
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                h = iNSTANCE.getMonitorConfig().h;
                if (h != null) {
                   a.m(p0);
                   if (h.invoke(p0).booleanValue() == true && !pageStageEve.isRealShow()) {
                      n.d(pageName);
                      return;
                   }
                }
                pageStageEve.resultCode = "cancel";
                pageStageEve.reason = "back";
                b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_onDestroy_cancel_back");
                String str = "PageMonitor AutoTracker";
                h.a(str, pageName+" onDestroy PageCancel");
                p0 = n.h().get(pageName);
                if (p0 != null) {
                   p0.e(pageStageEve);
                }
                p0 = n.g().iterator();
                while (p0.hasNext()) {
                   p0.next().e(pageStageEve);
                }
                p0 = b.n.h().get(pageName);
                if (p0 != null && p0.c(pageStageEve) == true) {
                   h.b(str, pageName+" page event was consumed by business");
                   AutoTracker.INSTANCE.traceEnd(pageStageEve.pageName);
                   return;
                }else {
                   AutoTracker iNSTANCE1 = AutoTracker.INSTANCE;
                   PageMonitorReporter.b.a(pageStageEve, iNSTANCE1.getMonitorConfig());
                   iNSTANCE1.traceEnd(pageStageEve.pageName);
                }
             }
             b.n.d(pageName);
          }
          return;
       }
    }
    public final void onFirstFrameDraw(Object p0){
       if (!this.isInitialized()) {
          return;
       }
       p0 = this.getPageKey(p0);
       if (p0 != null) {
          b n = b.n;
          PageStageEvent pageStageEve = n.j().get(p0);
          if (pageStageEve != null) {
             AutoTracker iNSTANCE = AutoTracker.INSTANCE;
             iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_onFirstFrameDraw_t1_end");
             e uoe = new e("OnFirstFrameDraw", 0, 2, null);
             g.a(pageStageEve, iNSTANCE);
             b.a(iNSTANCE.b());
             String str = "PageMonitor AutoTracker";
             h.a(str, p0+" onFirstFrameDraw -> "+iNSTANCE.b());
             a uoa = n.h().get(p0);
             if (uoa != null) {
                uoa.a(pageStageEve);
             }
             Iterator iterator = n.g().iterator();
             while (iterator.hasNext()) {
                iterator.next().a(pageStageEve);
             }
             if (pageStageEve.isDynamicPage == null) {
                b.g(pageStageEve.pageCode);
                uoe = new e("OnFinishDraw", 0, 2, null);
                iterator.c(iNSTANCE.b());
                g.a(pageStageEve, iterator);
                long l = g.b(pageStageEve, "OnCreate");
                if ((iNSTANCE.b() - l) < 0) {
                   h.b(str, pageStageEve.pageName+" First Frame dr aw ts error, firstFrameTs = "+iNSTANCE+", createTs is "+l);
                   AutoTracker.INSTANCE.traceEnd(pageStageEve.pageName);
                   return;
                }else {
                   n = b.n;
                   a uoa1 = n.h().get(p0);
                   if (uoa1 != null && uoa1.c(pageStageEve) == true) {
                      h.b(str, p0+" page event was consumed by business");
                      AutoTracker.INSTANCE.traceEnd(pageStageEve.pageName);
                      return;
                   }else {
                      AutoTracker iNSTANCE1 = AutoTracker.INSTANCE;
                      PageMonitorReporter.b.a(pageStageEve, iNSTANCE1.getMonitorConfig());
                      n.d(p0);
                      iNSTANCE1.traceEnd(pageStageEve.pageName);
                   }
                }
             }
          }
       }
       return;
    }
    public final void onInit(Object p0){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageName(p0);
          if (pageName != null) {
             String pageKey = this.getPageKey(p0);
             if (pageKey != null) {
                this.traceBegin(pageName);
                this.markTraceSection(pageName, this.getPageSimpleName(pageName)+"_onInit_t-1_start");
                long l = SystemClock.elapsedRealtime();
                PageStageEvent pageStageEve = n.j().get(pageKey);
                if (pageStageEve == null) {
                   pageStageEve = new PageStageEvent(pageName, false, 2, null);
                   n.j().put(pageKey, pageStageEve);
                   a.m(p0);
                   n.k().put(pageKey, new WeakReference(p0));
                }
                e uoe = new e("OnInit", 0, 2, null);
                pageStageEve.getMoments().add(n);
                b.e();
                b.d(l);
                h.a("PageMonitor AutoTracker", pageName+" onInit -> "+l);
             }
          }
          return;
       }
    }
    public final void onPause(Object p0){
       PageMonitorConfig h;
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             b.e();
             h.a("PageMonitor AutoTracker", pageName+" onPause");
             PageStageEvent pageStageEve = n.j().get(pageName);
             if (pageStageEve != null) {
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_onPause");
                h = iNSTANCE.getMonitorConfig().h;
                if (h != null) {
                   a.m(p0);
                   if (h.invoke(p0).booleanValue() == true && !pageStageEve.isRealShow()) {
                      return;
                   }
                }
                Monitor_ThreadKt.a(200, new AutoTracker$onPause$$inlined$let$lambda$1(p0, pageName));
             }
          }
          return;
       }
    }
    public final void onResume(Object p0){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             p0 = this.getPageName(p0);
             if (p0 != null) {
                this.markTraceSection(p0, this.getPageSimpleName(p0)+"_onResume");
                e uoe = new e("OnResume", 0, 2, null);
                PageStageEvent pageStageEve = n.j().get(pageName);
                if (pageStageEve != null) {
                   List moments = pageStageEve.getMoments();
                   if (moments != null) {
                      moments.add(p0);
                   }
                }
                h.a("PageMonitor AutoTracker", pageName+" onResume -> "+p0.b());
             }
          }
          return;
       }
    }
    public final void onStart(Object p0){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             p0 = this.getPageName(p0);
             if (p0 != null) {
                this.markTraceSection(p0, this.getPageSimpleName(p0)+"_onStart");
                e uoe = new e("OnStart", 0, 2, null);
                PageStageEvent pageStageEve = n.j().get(pageName);
                if (pageStageEve != null) {
                   List moments = pageStageEve.getMoments();
                   if (moments != null) {
                      moments.add(p0);
                   }
                }
                h.a("PageMonitor AutoTracker", pageName+" onStart -> "+p0.b());
             }
          }
          return;
       }
    }
    public final void onViewCreated(Object p0){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             PageStageEvent pageStageEve = n.j().get(pageName);
             if (pageStageEve != null) {
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_onViewCreated_t0_end");
                e uoe = new e("OnViewCreated", 0, 2, null);
                pageStageEve.getMoments().add(v3);
                h.a("PageMonitor AutoTracker", pageName+" onViewCreated -> "+v3.b());
                if (p0 != null) {
                   PageMonitorConfig g = iNSTANCE.getMonitorConfig().g;
                   if (g != null) {
                      g.invoke(p0);
                   }
                }
             }
          }
          return;
       }
    }
    public final void registerPageInfo(Object p0,String p1){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageName(p0);
          if (pageName != null) {
             String pageKey = this.getPageKey(p0);
             if (pageKey != null) {
                PageStageEvent pageStageEve = n.j().get(pageKey);
                if (pageStageEve == null) {
                   pageStageEve = new PageStageEvent(pageName, false, 2, null);
                   n.j().put(pageKey, pageStageEve);
                   a.m(p0);
                   n.k().put(pageKey, new WeakReference(p0));
                }
                if (p1 != null) {
                   h.a("PageMonitor AutoTracker", "setPageCode "+pageKey+" -> "+p1);
                   pageStageEve.pageCode = p1;
                }
             }
          }
          return;
       }
    }
    public final void registerPageInfoIfNull(Object p0,String p1){
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          p0 = this.getPageKey(p0);
          if (p0 != null) {
             PageStageEvent pageStageEve = n.j().get(p0);
             if (pageStageEve != null) {
                StringBuilder str = (!pageStageEve.pageCode.length())? 1: null;
                if (str && p1 != null) {
                   h.a("PageMonitor AutoTracker", "setPageCode if null "+p0+" -> "+p1);
                   pageStageEve.pageCode = p1;
                }
             }
          }
          return;
       }
    }
    public final void startTimeoutCheck$com_kwai_performance_fluency_page_monitor(Object p0){
       String pageKey = this.getPageKey(p0);
       if (pageKey != null) {
          p0 = this.getPageName(p0);
          if (p0 != null) {
             Monitor_ThreadKt.a(this.timeoutCheckDelay(), new AutoTracker$startTimeoutCheck$1(pageKey, p0));
          }
       }
       return;
    }
    public final long timeoutCheckDelay(){
       long l;
       if (MonitorBuildConfig.b()) {
          l = 0x4e20;
       }else {
          PageMonitorConfig a = this.getMonitorConfig().a;
          if (a != null) {
             Long longx = a.invoke();
             if (longx != null) {
                l = longx.longValue();
             }
          }
          l = 0x2710;
       }
       return l;
    }
    public final void trackFirstFrameOnActivity(Activity p0){
       PageMonitorConfig h;
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          pageName = this.getPageKey(p0);
          if (pageName != null) {
             PageStageEvent pageStageEve = n.j().get(pageName);
             if (pageStageEve != null) {
                a.m(p0);
                FirstFrameView uFirstFrameV = new FirstFrameView(p0, null, 0, 6, null);
                Window window = p0.getWindow();
                a.o(window, "activity.window");
                View decorView = window.getDecorView();
                Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                decorView.addView(v8);
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                h = iNSTANCE.getMonitorConfig().h;
                if (h == null || (!h.invoke(p0).booleanValue() || pageStageEve.isRealShow())) {
                   iNSTANCE.checkWriteScreen(pageName);
                }
                v8.setOnFirstFrameListener(new AutoTracker$trackFirstFrameOnActivity$$inlined$let$lambda$1(v8, pageStageEve, p0, pageName));
             }
          }
          return;
       }
    }
    public final void trackFirstFrameOnFragment(Fragment p0){
       PageMonitorConfig h;
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return;
          }
          String pageKey = this.getPageKey(p0);
          if (pageKey != null) {
             Object obj = n.j().get(pageKey);
             if (obj != null) {
                AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                PageMonitorConfig f = iNSTANCE.getMonitorConfig().f;
                if (f != null && !f.invoke(pageKey).booleanValue()) {
                   return;
                }else {
                   a.m(p0);
                   Context context = p0.getContext();
                   if (context != null) {
                      a.o(context, "it");
                      FirstFrameView uFirstFrameV = new FirstFrameView(context, null, 0, 6, null);
                      View view = p0.getView();
                      if (!view instanceof ViewGroup) {
                         return;
                      }else {
                         view.addView(f);
                         h = iNSTANCE.getMonitorConfig().h;
                         if (h == null || (!h.invoke(p0).booleanValue() || obj.isRealShow())) {
                            iNSTANCE.checkWriteScreen(pageKey);
                         }
                         AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1 otrackFirstF = new AutoTracker$trackFirstFrameOnFragment$$inlined$let$lambda$1(view, f, obj, pageKey, p0);
                         f.setOnFirstFrameListener(iNSTANCE);
                      }
                   }
                }
             }
          }
          return;
       }
    }
}
