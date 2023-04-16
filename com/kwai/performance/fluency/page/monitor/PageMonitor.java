package com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.kwai.performance.fluency.page.monitor.tracker.Tracker;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import gf7.e;
import java.lang.Long;
import java.lang.Throwable;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.Monitor;
import java.lang.StringBuilder;
import yf7.h;
import ef7.b;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import gf7.f;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent$b;
import java.util.List;
import gf7.b;
import java.util.Objects;
import java.util.ArrayList;
import gf7.c;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import gf7.g;
import com.kwai.performance.monitor.base.d;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import com.kwai.performance.fluency.page.monitor.PageMonitorContext$init$1;
import msd.a;
import nsd.s0;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import hf7.c;
import java.io.File;
import com.kwai.performance.fluency.page.monitor.utils.ScreenshotUtil$cleanScreenshot$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import android.os.SystemClock;
import if7.b;
import java.lang.Boolean;
import msd.l;
import ef7.a;
import com.kwai.performance.fluency.page.monitor.PageMonitorReporter;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.app.Activity;
import android.view.Window;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import com.kwai.performance.fluency.page.monitor.PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1;
import ff7.a;
import qrd.l1;
import nsd.u;
import java.lang.Number;
import java.lang.ref.WeakReference;

public final class PageMonitor extends Tracker	// class@001093
{
    public static final PageMonitor INSTANCE;

    static {
       PageMonitor.INSTANCE = new PageMonitor();
    }
    public void PageMonitor(){
       super();
    }
    public static void addCustomParam$default(PageMonitor p0,Object p1,String p2,Object p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = true;
       }
       p0.addCustomParam(p1, p2, p3, p4);
       return;
    }
    public static void addCustomParams$default(PageMonitor p0,Object p1,Map p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = true;
       }
       p0.addCustomParams(p1, p2, p3);
       return;
    }
    public static e getPageMoment$default(PageMonitor p0,Object p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = "OnCreate";
       }
       return p0.getPageMoment(p1, p2);
    }
    public static void registerPageInfo$default(PageMonitor p0,Object p1,String p2,String p3,String p4,int p5,Object p6){
       if (p5 & 0x04) {
          p3 = "";
       }
       if (p5 & 0x08) {
          p4 = "";
       }
       p0.registerPageInfo(p1, p2, p3, p4);
       return;
    }
    public static void reportInternal$default(PageMonitor p0,Object p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.reportInternal(p1, p2);
       return;
    }
    public static void trackFinishDraw$default(PageMonitor p0,Object p1,Long p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = null;
       }
       p0.trackFinishDraw(p1, p2);
       return;
    }
    public static void trackPageCancel$default(PageMonitor p0,Object p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = "back";
       }
       p0.trackPageCancel(p1, p2);
       return;
    }
    public static void trackPageRequestEnd$default(PageMonitor p0,Object p1,boolean p2,boolean p3,String p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = true;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = null;
       }
       p0.trackPageRequestEnd(p1, p2, p3, p4);
       return;
    }
    public static void trackPageRequestEnd$default(PageMonitor p0,String p1,long p2,long p3,Long p4,Long p5,int p6,Object p7){
       long l = 0;
       Long longx = Long.valueOf(l);
       long l1 = (p6 & 0x02)? l: p2;
       if (!(p6 & 0x04)) {
          l = p3;
       }
       Long longx1 = (p6 & 0x08)? longx: p4;
       if (!(p6 & 0x10)) {
          longx = p5;
       }
       p0.trackPageRequestEnd(p1, l1, l, longx1, longx);
       return;
    }
    public static void trackPageRequestError$default(PageMonitor p0,Object p1,Throwable p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       p0.trackPageRequestError(p1, p2, p3);
       return;
    }
    public static void trackPageRequestFail$default(PageMonitor p0,Object p1,Throwable p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       p0.trackPageRequestFail(p1, p2, p3);
       return;
    }
    public static void trackPageRequestFail$default(PageMonitor p0,String p1,Integer p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = null;
       }
       p0.trackPageRequestFail(p1, p2, p3);
       return;
    }
    public static void trackRealShow$default(PageMonitor p0,Object p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       p0.trackRealShow(p1, p2);
       return;
    }
    public final void addCustomParam(Object p0,String p1,Object p2,boolean p3){
       a.p(p1, "key");
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
                pageStageEve = pageStageEve.customParams;
                if (pageStageEve != null) {
                   if (!pageStageEve.containsKey(p1) || p3) {
                      pageStageEve.put(p1, p2);
                   }
                   h.a("PageMonitor", p0+" addCustomParams "+p1+" -> "+p2);
                }
             }
          }
          return;
       }
    }
    public final void addCustomParams(Object p0,Map p1,boolean p2){
       a.p(p1, "paramMap");
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return;
          }
          if (!b.n.l(pageName)) {
             return;
          }
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             PageMonitor.INSTANCE.addCustomParam(p0, key, uEntry.getValue(), p2);
          }
          return;
       }
    }
    public final void addCustomStage(Object p0,f p1){
       Object obj1;
       String str = "stage";
       a.p(p1, str);
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
             p0 = n.j().get(p0);
             if (p0 != null) {
                a.p(p0, "$this$addStage");
                a.p(p1, str);
                PageStageEvent$b uob = new PageStageEvent$b(p1.a, p1.b, p1.c.b(), p1.d.b());
                p0.pageStages.add(v8);
                Iterator iterator = p0.getMoments().iterator();
                while (true) {
                   Object obj = null;
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if (!a.g(obj1.a(), p1.c.a())) {
                         continue ;
                      }
                   }else {
                      obj1 = obj;
                   }
                   if (obj1 != null) {
                      p0.getMoments().remove(obj1);
                   }
                   iterator = p0.getMoments().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         obj1 = iterator.next();
                         if (a.g(obj1.a(), p1.d.a())) {
                            obj = obj1;
                         }else {
                            continue ;
                         }
                      }
                      if (obj != null) {
                         p0.getMoments().remove(obj);
                      }
                      p0.getMoments().add(p1.c);
                      p0.getMoments().add(p1.d);
                      break ;
                   }
                }
             }
          }
          return;
       }
    }
    public final void addOnlineSystracePage(b p0){
       a.p(p0, "page");
       Objects.requireNonNull(b.n);
       a.p(p0, "page");
       if (b.c == null) {
          b.c = new ArrayList();
       }
       List c = b.c;
       if (c != null) {
          c.add(p0);
       }
       return;
    }
    public final void addSpecifiedPageConfig(c p0){
       Object obj;
       a.p(p0, "pageConfig");
       Objects.requireNonNull(b.n);
       a.p(p0, "pageConfig");
       Iterator iterator = b.b.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!a.g(obj.a(), p0.a())) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj != null) {
             b.b.remove(obj);
             break ;
          }
          break ;
       }
       b.b.add(p0);
       return;
    }
    public final void dropPageMonitorEvent(Object p0){
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
             n.d(p0);
          }
          return;
       }
    }
    public final long fullyDrawCheckDelay(){
       long l = (MonitorBuildConfig.b())? 0x2710: 2000;
       return l;
    }
    public final e getPageMoment(Object p0,String p1){
       a.p(p1, "event");
       p0 = this.getPageKey(p0);
       e uoe = null;
       if (p0 != null) {
          p0 = b.n.j().get(p0);
          if (p0 != null) {
             uoe = g.c(p0, p1);
          }
       }
       return uoe;
    }
    public void init(d p0,PageMonitorConfig p1){
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       super.init(p0, p1);
       Objects.requireNonNull(b.n);
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       PageMonitorContext$init$1 oinit$1 = new PageMonitorContext$init$1(p0);
       Objects.requireNonNull(PageMonitorFileManager.c);
       a.p(oinit$1, "rootDirInvoker");
       PageMonitorFileManager.a = oinit$1;
       b.e = p1.l;
       PageMonitorConfig c = p1.c;
       Object obj = null;
       List list = (c != null)? c.invoke(): obj;
       b.a = s0.g(list);
       c = p1.j;
       if (c != null) {
          obj = c.invoke();
       }
       b.c = s0.g(obj);
       AutoTracker.INSTANCE.init(p0, p1);
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void onApplicationPostCreate(){
       super.onApplicationPostCreate();
       File uFile = PageMonitorFileManager.c.a();
       Objects.requireNonNull(c.b);
       a.p(uFile, "dir");
       ScreenshotUtil$cleanScreenshot$1 uocleanScree = new ScreenshotUtil$cleanScreenshot$1(uFile);
       Monitor_ThreadKt.b(0, uocleanScree, 1, null);
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
          p0 = this.getPageName(p0);
          if (p0 != null) {
             this.traceBegin(p0);
             this.markTraceSection(p0, this.getPageSimpleName(p0)+"_onInit_t-1_start");
             long l = SystemClock.elapsedRealtime();
             n.i().put(p0, Long.valueOf(l));
             b.d(l);
             h.a("PageMonitor", p0+" onInit -> "+l);
          }
          return;
       }
    }
    public final void recordRecentPageSource(String p0){
       if (p0 != null) {
          Objects.requireNonNull(b.n);
          a.p(p0, "<set-?>");
          b.f = p0;
       }
       return;
    }
    public final void registerPage(Object p0,a p1){
       a.p(p1, "enableInvoker");
       if (!this.isInitialized()) {
          return;
       }
       p0 = this.getPageName(p0);
       if (p0 != null && p1.invoke().booleanValue()) {
          PageMonitorConfig d = this.getMonitorConfig().d;
          if (d != null) {
             p0 = d.invoke(p0);
             if (p0 != null) {
                PageMonitor.INSTANCE.addSpecifiedPageConfig(p0);
             }
          }
       }
       return;
    }
    public final void registerPageEventGlobalListener(a p0){
       a.p(p0, "listener");
       b.n.g().add(p0);
    }
    public final boolean registerPageEventListener(Object p0,a p1){
       a.p(p1, "listener");
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return false;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return false;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return false;
          }
          p0 = this.getPageKey(p0);
          if (p0 == null) {
             return false;
          }
          n.h().put(p0, p1);
          return true;
       }
    }
    public final void registerPageInfo(Object p0,String p1){
       PageMonitor.registerPageInfo$default(this, p0, p1, null, null, 12, null);
    }
    public final void registerPageInfo(Object p0,String p1,String p2){
       PageMonitor.registerPageInfo$default(this, p0, p1, p2, null, 8, null);
    }
    public final void registerPageInfo(Object p0,String p1,String p2,String p3){
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
             if (p1 != null) {
                h.a("PageMonitor", "setPageCode "+p0+" -> "+p1);
                PageStageEvent pageStageEve = n.j().get(p0);
                if (pageStageEve != null) {
                   pageStageEve.pageCode = p1;
                }
             }
             if (p3 != null) {
                h.a("PageMonitor", "setPageDesc "+p0+" -> "+p3);
                PageStageEvent pageStageEve1 = n.j().get(p0);
                if (pageStageEve1 != null) {
                   pageStageEve1.pageDesc = p3;
                }
             }
             if (p2 != null) {
                h.a("PageMonitor", "setPageSource "+p0+" -> "+p2);
                p0 = n.j().get(p0);
                if (p0 != null) {
                   p0.source = p2;
                }
             }
          }
       label_00b3 :
          return;
       }
    }
    public final boolean removeCustomParam(Object p0,String p1){
       a.p(p1, "key");
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return false;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return false;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return false;
          }
          p0 = this.getPageKey(p0);
          if (p0 != null) {
             p0 = n.j().get(p0);
             if (p0 != null) {
                p0 = p0.customParams;
                if (p0 != null && p0.remove(p1) != null) {
                   return true;
                }
             }
          }
          return false;
       }
    }
    public final void removeCustomStage(Object p0,String p1){
       Object obj;
       a.p(p1, "stage");
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
                Iterator iterator = pageStageEve.pageStages.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (!a.g(obj.stageName, p1)) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   if (obj != null) {
                      pageStageEve.pageStages.remove(obj);
                   }
                   h.a("PageMonitor", p0+" removeCustomStage "+p1);
                   break ;
                }
             }
          }
          return;
       }
    }
    public final void report(Object p0){
       this.reportInternal(p0, false);
    }
    public final void reportInternal(Object p0,boolean p1){
       if (!this.isInitialized()) {
          return;
       }
       p0 = this.getPageKey(p0);
       if (p0 != null) {
          b n = b.n;
          PageStageEvent pageStageEve = n.j().get(p0);
          if (pageStageEve != null) {
             String str = "PageMonitor";
             if (p1) {
                a uoa = n.h().get(p0);
                if (uoa != null && uoa.c(pageStageEve) == true) {
                   h.b(str, p0+" page event was consumed by business");
                   n.d(p0);
                   this.traceEnd(pageStageEve.pageName);
                   return;
                }
             }
             if (pageStageEve.isDynamicPage != null) {
                long l = g.b(pageStageEve, "OnFinishDraw");
                long l1 = g.b(pageStageEve, "OnCreate");
                if ((l - l1) < 0) {
                   h.a(str, pageStageEve.pageName+" finish draw ts error, "+"finishDrawTs = "+l+", createTs is "+l1);
                   n.d(p0);
                   this.traceEnd(pageStageEve.pageName);
                   return;
                }
             }
             PageMonitorReporter.b.a(pageStageEve, this.getMonitorConfig());
             n.d(p0);
             this.traceEnd(pageStageEve.pageName);
          }
       }
       return;
    }
    public final void trackDataLoadFinish(Object p0){
       View view;
       Window window;
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
             String pageName1 = this.getPageName(p0);
             if (pageName1 != null) {
                Object obj = n.j().get(pageName);
                if (obj != null) {
                   long l = g.b(obj, "OnFinishDraw");
                   long l1 = 0;
                   if (l - l1 > 0) {
                      h.a(str, pageName+" trackDataLoadFinish return, origin ts -> "+l);
                   }else if(p0 instanceof Fragment){
                      view = p0.getView();
                   }else if(p0 instanceof Activity){
                      window = p0.getWindow();
                      a.o(window, "pageObj.window");
                      view = window.getDecorView();
                   }else {
                      window = 0;
                   }
                   View view1 = view;
                   if (view1 instanceof ViewGroup) {
                      FullyDrawTagChecker uFullyDrawTa = (n.c(pageName1))? new FullyDrawTagChecker(): new FullyDraw8060Checker();
                      e uoe = g.c(obj, "OnRequestEnd");
                      if (uoe != null) {
                         l1 = uoe.b();
                      }
                      Objects.requireNonNull(n);
                      PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1 otrackDataLo = new PageMonitor$trackDataLoadFinish$$inlined$let$lambda$1(view1, l1, obj, pageName, p0, pageName1);
                      uFullyDrawTa.a(view1, v12);
                      b.l.put(pageName, uFullyDrawTa);
                   }
                }
             }
          }
          return;
       }
    }
    public final void trackFinishDraw(Object p0){
       PageMonitor.trackFinishDraw$default(this, p0, null, 2, null);
    }
    public final void trackFinishDraw(Object p0,Long p1){
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
                PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_trackFinishDraw_t3_end");
                if (g.b(pageStageEve, "OnFinishDraw") > 0) {
                   n.d(pageName);
                   iNSTANCE.traceEnd(pageStageEve.pageName);
                }else {
                   e uoe = new e("OnFinishDraw", 0, 2, null);
                   if (p1 != null) {
                      long l = p1.longValue();
                      iNSTANCE.c(l);
                      b.c(l, false);
                      b.g(pageStageEve.pageCode);
                   }
                   PageStageEvent pageStageEve1 = n.j().get(pageName);
                   if (pageStageEve1 != null) {
                      List moments = pageStageEve1.getMoments();
                      if (moments != null) {
                         moments.add(iNSTANCE);
                      }
                   }
                   h.a(str, pageName+" finish draw -> "+iNSTANCE.b());
                   a uoa = n.h().get(pageName);
                   if (uoa != null) {
                      a.m(p0);
                      uoa.b(p0, pageStageEve);
                   }
                   Iterator iterator = n.g().iterator();
                   while (iterator.hasNext()) {
                      a.m(p0);
                      iterator.next().b(p0, pageStageEve);
                   }
                   PageMonitor.reportInternal$default(PageMonitor.INSTANCE, p0, false, 2, null);
                }
             }
          }
          return;
       }
    }
    public final void trackFirstFrameDraw(Object p0){
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
                this.markTraceSection(p0, this.getPageSimpleName(p0)+"_trackFirstFrameDraw_t1_end");
                p0 = n.j().get(pageName);
                if (p0 != null) {
                   e uoe = new e("OnFirstFrameDraw", 0, 2, null);
                   p0.getMoments().add(v9);
                   b.a(v9.b());
                   h.a(str, pageName+" trackFirstFrameDraw -> "+v9.b());
                   a uoa = n.h().get(pageName);
                   if (uoa != null) {
                      uoa.a(p0);
                   }
                   Iterator iterator = n.g().iterator();
                   while (iterator.hasNext()) {
                      iterator.next().a(p0);
                   }
                }
             }
          }
          return;
       }
    }
    public final void trackPageCancel(Object p0,String p1){
       a.p(p1, "reason");
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
                pageStageEve.resultCode = "cancel";
                pageStageEve.reason = p1;
                b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
                h.a(str, pageName+" trackPageCancel");
                a uoa = n.h().get(pageName);
                if (uoa != null) {
                   uoa.e(pageStageEve);
                }
                Iterator iterator = n.g().iterator();
                while (iterator.hasNext()) {
                   iterator.next().e(pageStageEve);
                }
                PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_trackPageCancel");
                PageMonitor.reportInternal$default(iNSTANCE, p0, false, 2, null);
             }
          }
          return;
       }
    }
    public final void trackPageRequestEnd(Object p0){
       PageMonitor.trackPageRequestEnd$default(this, p0, false, false, null, 14, null);
    }
    public final void trackPageRequestEnd(Object p0,boolean p1){
       PageMonitor.trackPageRequestEnd$default(this, p0, p1, false, null, 12, null);
    }
    public final void trackPageRequestEnd(Object p0,boolean p1,boolean p2){
       PageMonitor.trackPageRequestEnd$default(this, p0, p1, p2, null, 8, null);
    }
    public final void trackPageRequestEnd(Object p0,boolean p1,boolean p2,String p3){
       boolean b;
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
             b = n.j().get(pageName);
             if (b != null) {
                if (g.c(b, "OnRequestEnd") != null) {
                   return;
                }else if(b.isCheckingFullyDraw()){
                   return;
                }else {
                   PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                   iNSTANCE.markTraceSection(b.pageName, iNSTANCE.getPageSimpleName(b.pageName)+"_trackPageRequestEnd_t2_end");
                   b.setCheckingFullyDraw(true);
                   b.isFromCache = p2;
                   e uoe = new e("OnRequestEnd", 0, 2, null);
                   b.getMoments().add(v12);
                   if (p3 != null) {
                      uoe = g.c(b, "OnRequestStart");
                      int i = 0;
                      Long longx = (uoe != null)? Long.valueOf(uoe.b()): i;
                      Long longx1 = Long.valueOf(v12.b());
                      Long longx2 = (uoe != null)? Long.valueOf(uoe.b()): i;
                      g.d(b, p3, longx, longx1, longx2, Long.valueOf(v12.b()), 0);
                   }
                   b.b(v12.b());
                   h.a(str, pageName+" trackPageRequestEnd -> "+v12.b());
                   pageName = iNSTANCE.getPageName(p0);
                   if (pageName != null && (p1 && (n.b(pageName) || n.c(pageName)))) {
                      iNSTANCE.trackDataLoadFinish(p0);
                   }
                }
             }
          }
          return;
       }
    }
    public final void trackPageRequestEnd(String p0){
       PageMonitor.trackPageRequestEnd$default(this, p0, 0, 0, null, null, 30, null);
    }
    public final void trackPageRequestEnd(String p0,long p1){
       PageMonitor.trackPageRequestEnd$default(this, p0, p1, 0, null, null, 28, null);
    }
    public final void trackPageRequestEnd(String p0,long p1,long p2){
       PageMonitor.trackPageRequestEnd$default(this, p0, p1, p2, null, null, 24, null);
    }
    public final void trackPageRequestEnd(String p0,long p1,long p2,Long p3){
       PageMonitor.trackPageRequestEnd$default(this, p0, p1, p2, p3, null, 16, null);
    }
    public final void trackPageRequestEnd(String p0,long p1,long p2,Long p3,Long p4){
       a.p(p0, "url");
       if (!this.isInitialized()) {
          h.b("PageMonitor", "monitor not initialized, return");
          return;
       }else {
          b n = b.n;
          Map$Entry uEntry = n.f(p0);
          if (uEntry != null) {
             Object obj = uEntry.getKey();
             Object obj1 = uEntry.getValue();
             g.d(obj1, p0, Long.valueOf(p1), Long.valueOf(p2), p3, p4, true);
             h.a("PageMonitor", obj+" trackPageRequestEnd -> "+p2+' '+p0);
             b.b(p2);
             if (obj1.isCheckingFullyDraw()) {
                return;
             }else {
                PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                iNSTANCE.markTraceSection(obj1.pageName, iNSTANCE.getPageSimpleName(obj1.pageName)+"_trackPageRequestEnd_t2_end");
                obj1.setCheckingFullyDraw(true);
                WeakReference weakReferenc = n.k().get(obj);
                if (weakReferenc != null) {
                   Object obj2 = weakReferenc.get();
                   if (obj2 != null && (n.b(obj1.pageName) || n.c(obj1.pageName))) {
                      iNSTANCE.trackDataLoadFinish(obj2);
                   }
                }
             }
          }
          return;
       }
    }
    public final void trackPageRequestError(Object p0){
       PageMonitor.trackPageRequestError$default(this, p0, null, 0, 6, null);
    }
    public final void trackPageRequestError(Object p0,Throwable p1){
       PageMonitor.trackPageRequestError$default(this, p0, p1, 0, 4, null);
    }
    public final void trackPageRequestError(Object p0,Throwable p1,int p2){
       String str = "PageMonitor";
       if (!this.isInitialized()) {
          h.a(str, p0+" not initialized");
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
                if (a.g(pageStageEve.resultCode, "success") ^ 0x01) {
                   return;
                }else {
                   pageStageEve.resultCode = "fail";
                   pageStageEve.reason = "local-"+p2;
                   b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
                   if (p1 != null) {
                      pageStageEve.customParams.put("errorMsg", p1.toString());
                   }
                   h.a(str, pageName+" trackPageRequestError");
                   a uoa = n.h().get(pageName);
                   if (uoa != null) {
                      uoa.f(pageStageEve);
                   }
                   Iterator iterator = n.g().iterator();
                   while (iterator.hasNext()) {
                      iterator.next().f(pageStageEve);
                   }
                   PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                   iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_trackPageRequestFail_t2_fail");
                   PageMonitor.reportInternal$default(iNSTANCE, p0, false, 2, null);
                }
             }
          }
          return;
       }
    }
    public final void trackPageRequestFail(Object p0){
       PageMonitor.trackPageRequestFail$default(this, p0, null, 0, 6, null);
    }
    public final void trackPageRequestFail(Object p0,Throwable p1){
       PageMonitor.trackPageRequestFail$default(this, p0, p1, 0, 4, null);
    }
    public final void trackPageRequestFail(Object p0,Throwable p1,int p2){
       this.trackPageRequestError(p0, p1, p2);
    }
    public final void trackPageRequestFail(String p0,Integer p1){
       PageMonitor.trackPageRequestFail$default(this, p0, p1, null, 4, null);
    }
    public final void trackPageRequestFail(String p0,Integer p1,String p2){
       a.p(p0, "url");
       if (!this.isInitialized()) {
          h.b("PageMonitor", "monitor not initialized, return");
          return;
       }else {
          b n = b.n;
          Map$Entry uEntry = n.f(p0);
          if (uEntry != null) {
             String key = uEntry.getKey();
             PageStageEvent value = uEntry.getValue();
             if (p2 != null) {
                char c = 10;
                p2 = "trackPageRequestFail\nurl: "+p0+"\nerrorCode: "+p1+c+p2;
                a.p(value, "$this$appendErrorMsg");
                a.p(p2, "msg");
                if (value.customParams.containsKey("errorMsg")) {
                   Object obj = value.customParams.get("errorMsg");
                   Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                   String str = obj;
                   value.customParams.put("errorMsg", str+c+p2);
                }else {
                   value.customParams.put("errorMsg", p2);
                }
             }
             value.resultCode = "fail";
             value.reason = "network-"+p1;
             b.f(value.resultCode+": "+value.reason);
             a uoa = n.h().get(key);
             if (uoa != null) {
                uoa.f(value);
             }
             Iterator iterator = n.g().iterator();
             while (iterator.hasNext()) {
                iterator.next().f(value);
             }
             PageMonitor iNSTANCE = PageMonitor.INSTANCE;
             iNSTANCE.markTraceSection(value.pageName, iNSTANCE.getPageSimpleName(value.pageName)+"_trackPageRequestFail_t2_end");
             PageMonitor.reportInternal$default(iNSTANCE, key, false, 2, null);
          }
          return;
       }
    }
    public final void trackPageRequestStart(Object p0){
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
                if (g.c(pageStageEve, "OnRequestStart") != null) {
                   return;
                }else {
                   e uoe = new e("OnRequestStart", 0, 2, null);
                   pageStageEve.getMoments().add(n);
                   PageMonitor iNSTANCE = PageMonitor.INSTANCE;
                   iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_trackPageRequestStart");
                   h.a("PageMonitor", p0+" trackPageRequestStart -> "+n.b());
                }
             }
          }
          return;
       }
    }
    public final void trackRealShow(Object p0){
       PageMonitor.trackRealShow$default(this, p0, false, 2, null);
    }
    public final void trackRealShow(Object p0,boolean p1){
       Object obj = p0;
       if (!this.isInitialized()) {
          h.a("PageMonitor", obj+" not initialized");
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
                pageStageEve.setRealShow(true);
                if (!p1) {
                   return;
                }else {
                   e uoe = new e("OnInit", 0, 2, null);
                   g.a(pageStageEve, v8);
                   e uoe1 = new e("OnCreate", 0, 2, null);
                   g.a(pageStageEve, uoe);
                   e uoe2 = new e("OnViewCreated", 0, 2, null);
                   g.a(pageStageEve, uoe);
                   if (obj instanceof Fragment) {
                      AutoTracker iNSTANCE = AutoTracker.INSTANCE;
                      iNSTANCE.trackFirstFrameOnFragment(obj);
                      iNSTANCE.startTimeoutCheck$com_kwai_performance_fluency_page_monitor(obj);
                   }
                }
             }
          }
          return;
       }
    }
    public final void unRegisterPageEventGlobalListener(a p0){
       a.p(p0, "listener");
       b.n.g().remove(p0);
    }
    public final boolean unRegisterPageEventListener(Object p0,a p1){
       a.p(p1, "listener");
       if (!this.isInitialized()) {
          h.a("PageMonitor", p0+" not initialized");
          return false;
       }else {
          String pageName = this.getPageName(p0);
          if (pageName == null) {
             return false;
          }
          b n = b.n;
          if (!n.l(pageName)) {
             return false;
          }
          p0 = this.getPageKey(p0);
          if (p0 == null) {
             return false;
          }
          n.h().remove(p0);
          return true;
       }
    }
}
