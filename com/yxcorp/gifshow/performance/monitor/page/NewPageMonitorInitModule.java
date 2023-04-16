package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$a;
import nsd.u;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$f;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import mwb.b;
import b76.a;
import fg6.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$e;
import com.google.gson.Gson;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import uwb.a;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$onLaunchFinishAsync$1$1;
import msd.a;
import owb.c;
import owb.b;
import brd.t;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$d;
import erd.g;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Throwable;
import qrd.i;
import yf7.h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$autoDispose$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$c;
import nsd.s0;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig$Builder;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$3;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$4;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$5;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$6;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$7;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$8;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$9;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import yf7.f;
import yf7.k;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$g;

public final class NewPageMonitorInitModule extends PerformanceBaseInitModule	// class@000eb4
{
    public final Type q;
    public List r;
    public final boolean s;
    public static final NewPageMonitorInitModule$a t;

    static {
       NewPageMonitorInitModule.t = new NewPageMonitorInitModule$a(null);
    }
    public void NewPageMonitorInitModule(){
       super();
       Type type = new NewPageMonitorInitModule$f().getType();
       a.o(type, "object : TypeToken<List<PageConfig>>\(\) {}.type");
       this.q = type;
       this.r = new CopyOnWriteArrayList();
       boolean b = (SystemUtil.P() && SystemUtil.L(a.B))? true: false;
       this.s = b;
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, NewPageMonitorInitModule.class, "1")) {
          return;
       }
       e.g(NewPageMonitorInitModule$b.b, "FluencyPageMonitor_Kswitch");
       if (b.j()) {
          this.p0();
       }
       return;
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule.class, "4")) {
          return;
       }
       a.p(p0, "event");
       super.n0(p0);
       if (!b.j()) {
          this.p0();
       }
       List list = a.a.i(b.a.getString("ABTestPage", ""), new NewPageMonitorInitModule$e().getType());
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             PageMonitor.INSTANCE.registerPage(uoa.pageName, new NewPageMonitorInitModule$onLaunchFinishAsync$1$1(uoa));
          }
       }
       if (b.i() && this.s == null) {
          c uoc = b.b();
          a.o(uoc, "MonitorApiService.get\(\)");
          uoc.a().subscribe(NewPageMonitorInitModule$d.b);
       }else {
          b.p(a.a.q(a.t().getValue("pageConfig", this.q, CollectionsKt__CollectionsKt.E())));
       }
       return;
    }
    public final void o0(Fragment p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewPageMonitorInitModule.class, "5")) {
          return;
       }
       if (p1.isDisposed()) {
          return;
       }
       Lifecycle lifecycle = p0.getLifecycle();
       a.o(lifecycle, "this.lifecycle");
       if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          p0.getLifecycle().addObserver(new NewPageMonitorInitModule$autoDispose$1(p1));
       }else {
          p1.dispose();
       }
       return;
    }
    public final void p0(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, NewPageMonitorInitModule.class, "2")) {
          return;
       }
       SharedPreferences a = b.a;
       List list = s0.g(a.a.i(a.getString("SpecifiedPageConfig", ""), new NewPageMonitorInitModule$c().getType()));
       if (list != null) {
          this.r = list;
          b.q("");
       }
       PageMonitorConfig$Builder uBuilder = new PageMonitorConfig$Builder();
       if (a.getBoolean("EnableScreenshotForFullyDraw", false)) {
          b = true;
          uBuilder.e = b;
          uBuilder.f = b;
       }
       uBuilder.l = NewPageMonitorInitModule$initPageMonitor$3.INSTANCE;
       uBuilder.k = NewPageMonitorInitModule$initPageMonitor$4.INSTANCE;
       uBuilder.j = NewPageMonitorInitModule$initPageMonitor$5.INSTANCE;
       NewPageMonitorInitModule$initPageMonitor$6 iNSTANCE = NewPageMonitorInitModule$initPageMonitor$6.INSTANCE;
       a.p(iNSTANCE, "onlineSystracePageListInvoker");
       uBuilder.h = iNSTANCE;
       uBuilder.g = this.s;
       uBuilder.b = new NewPageMonitorInitModule$initPageMonitor$7(this);
       uBuilder.c = new NewPageMonitorInitModule$initPageMonitor$8(this);
       uBuilder.i = new NewPageMonitorInitModule$initPageMonitor$9(this);
       k.a(uBuilder.a());
       return;
    }
    public final void q0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewPageMonitorInitModule.class, "3")) {
          return;
       }
       b.b().b(p0).observeOn(d.c).subscribe(new NewPageMonitorInitModule$g(this));
       return;
    }
}
