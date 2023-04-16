package com.kwai.performance.fluency.page.monitor.PageMonitorReporter$report$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.lang.Object;
import qrd.l1;
import msd.l;
import java.util.Map;
import ef7.b;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import gf7.c;
import gf7.e;
import gf7.g;
import com.kwai.performance.fluency.page.monitor.model.Strategy;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent$b;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent$a;
import nsd.u;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import yf7.h;
import yf7.i;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$savePrefBuildFile$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class PageMonitorReporter$report$1 extends Lambda implements a	// class@00109d
{
    public final PageStageEvent $event;
    public final PageMonitorConfig $monitorConfig;

    public void PageMonitorReporter$report$1(PageMonitorConfig p0,PageStageEvent p1){
       this.$monitorConfig = p0;
       this.$event = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Gson obj;
       Object obj1;
       PageStageEvent$b uob;
       PageStageEvent$b uob1;
       PageMonitorReporter$report$1 oreport$1 = this;
       PageMonitorConfig e = oreport$1.$monitorConfig.e;
       if (e != null) {
          Map map = e.invoke(oreport$1.$event.pageName);
          if (map != null) {
             oreport$1.$event.customParams.putAll(map);
          }
       }
       b n = b.n;
       PageStageEvent pageName = oreport$1.$event.pageName;
       Objects.requireNonNull(n);
       String str = "pageName";
       a.p(pageName, str);
       Iterator iterator = n.a().iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!a.g(obj.a(), pageName)) {
                continue ;
             }
          }else {
             obj = null;
          }
          c samplingRate = (obj != null)? obj.samplingRate: 0;
          b n1 = b.n;
          Objects.requireNonNull(n1);
          obj = b.d;
          PageMonitorReporter$report$1 $event = oreport$1.$event;
          a.p($event, "$this$generate");
          e uoe = g.c($event, "OnInit");
          long l = (uoe != null)? uoe.b(): 0;
          $event.onInitTs = l;
          uoe = g.c($event, "OnCreate");
          l = (uoe != null)? uoe.b(): 0;
          $event.onCreateTs = l;
          uoe = g.c($event, "OnStart");
          l = (uoe != null)? uoe.b(): 0;
          $event.onStartTs = l;
          uoe = g.c($event, "OnResume");
          l = (uoe != null)? uoe.b(): 0;
          $event.onResumeTs = l;
          uoe = g.c($event, "OnViewCreated");
          l = (uoe != null)? uoe.b(): 0;
          $event.onViewCreatedTs = l;
          uoe = g.c($event, "OnFirstFrameDraw");
          l = (uoe != null)? uoe.b(): 0;
          $event.firstFrameTs = l;
          uoe = g.c($event, "OnRequestStart");
          l = (uoe != null)? uoe.b(): 0;
          $event.requestStartTs = l;
          uoe = g.c($event, "OnRequestEnd");
          l = (uoe != null)? uoe.b(): 0;
          $event.requestEndTs = l;
          uoe = g.c($event, "OnFinishDraw");
          l = (uoe != null)? uoe.b(): 0;
          $event.finishDrawTs = l;
          $event.samplingRate = samplingRate;
          String str1 = (!($event.source).length())? 1: null;
          if (str1) {
             Objects.requireNonNull(n1);
             $event.source = b.f;
          }
          PageStageEvent pageName1 = $event.pageName;
          Objects.requireNonNull(n1);
          a.p(pageName1, str);
          Iterator iterator1 = n1.a().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                obj1 = iterator1.next();
                if (!a.g(obj1.a(), pageName1)) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 != null) {
                Strategy strategy = obj1.b();
                if (strategy != null && strategy.initType == 1) {
                   pageName1 = 1;
                label_0144 :
                   pageName1 = (pageName1)? $event.onInitTs: $event.onCreateTs;
                   PageStageEvent onInitTs = $event.onInitTs;
                   if (onInitTs > 0) {
                      uob = v13;
                      uob1 = v13;
                      uob = new PageStageEvent$b("t-1", "页面初始化耗时", onInitTs, $event.onCreateTs);
                      $event.pageStages.add(uob1);
                   }
                   uob = new PageStageEvent$b("t0", "页面创建耗时", pageName1, $event.onViewCreatedTs);
                   $event.pageStages.add(uob1);
                   uob = new PageStageEvent$b("t1", "首次渲染耗时", pageName1, $event.firstFrameTs);
                   $event.pageStages.add(uob1);
                   if ($event.isDynamicPage != null) {
                      uob = new PageStageEvent$b("t2", "页面数据请求完成耗时", pageName1, $event.requestEndTs);
                      $event.pageStages.add(uob1);
                   }
                   uob = new PageStageEvent$b("t3", "二次渲染完成耗时", pageName1, $event.finishDrawTs);
                   $event.pageStages.add(uob1);
                   if ($event.networkStages.isEmpty() && ($event.requestStartTs && $event.requestEndTs)) {
                      PageStageEvent$a uoa = new PageStageEvent$a(0, 0, 0, 0, null, 31, null);
                      pageName1.requestStartTs = $event.requestStartTs;
                      pageName1.requestEndTs = $event.requestEndTs;
                      $event.networkStages.add(pageName1);
                   }
                label_01f5 :
                   str1 = obj.q($event);
                   h.a("PageMonitorReporter", "report PageTimeEvent "+str1);
                   i.a.c("page_time_event", str1, false);
                   String str2 = ".json";
                   String str3 = "pageEvent_";
                   if (oreport$1.$monitorConfig.k != null) {
                      a.o(str1, "eventJson");
                      PageMonitorFileManager.b(PageMonitorFileManager.c, str3+oreport$1.$event.uuid+str2, str1, false, 4, null);
                   }
                   if (oreport$1.$monitorConfig.i != null) {
                      str2 = str3+oreport$1.$event.pageCode+str2;
                      a.o(str1, "eventJson");
                      Objects.requireNonNull(PageMonitorFileManager.c);
                      a.p(str2, "fileName");
                      a.p(str1, "log");
                      Monitor_ThreadKt.b(0, new PageMonitorFileManager$savePrefBuildFile$1(str2, str1), 1, null);
                      break ;
                   }
                   break ;
                }
             }
             pageName1 = null;
             goto label_0144 ;
          }
          return;
       }
    }
}
