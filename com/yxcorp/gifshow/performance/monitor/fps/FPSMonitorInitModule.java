package com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$a;
import nsd.u;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$c;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import ey.b;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.commercial.perf.CommercialSpecifiedSection$1;
import java.util.Iterator;
import n66.c;
import java.util.Collection;
import mwb.b;
import android.content.SharedPreferences;
import pe7.a$a;
import xf6.j;
import xf6.l;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$1;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$2;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$3;
import pe7.a;
import yf7.f;
import yf7.k;
import android.app.Application;
import o56.a;
import qwb.a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import qwb.b;
import ef7.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import android.app.Activity;
import kotlin.Result;
import msd.p;
import qe7.c;
import qe7.d;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import java.util.Map;
import java.lang.Iterable;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;

public final class FPSMonitorInitModule extends PerformanceBaseInitModule	// class@0012b5
{
    public final Type q;
    public final Map r;
    public static final FPSMonitorInitModule$a s;

    static {
       FPSMonitorInitModule.s = new FPSMonitorInitModule$a(null);
    }
    public void FPSMonitorInitModule(){
       super();
       Type type = new FPSMonitorInitModule$c().getType();
       a.o(type, "object : TypeToken<List<SceneConfig>>\(\) {}.type");
       this.q = type;
       this.r = new LinkedHashMap();
    }
    public void n(){
       SharedPreferences a;
       boolean b;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, FPSMonitorInitModule.class, str)) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       CommercialSpecifiedSection$1 u1 = PatchProxy.apply(objArray, objArray, b.class, str);
       if (u1 != PatchProxyResult.class) {
       }else {
          u1 = new CommercialSpecifiedSection$1();
          Iterator iterator = u1.iterator();
          while (iterator.hasNext()) {
             c.a(iterator.next());
          }
       }
       a.o(u1, "CommercialSpecifiedSecti¡­mercialSpecifiedSection\(\)");
       uArrayList.addAll(u1);
       a = b.a;
       if (a.getBoolean("LiveFpsMonitorOpen", false)) {
          uArrayList.add("LivePlayFragment");
          uArrayList.add("LivePlayFragment_NO_SLIDE");
       }
       if (a.getBoolean("LandscapeFpsMonitorOpen", false)) {
          uArrayList.add("SCENE_LANDSCAPE_PAGE");
       }
       a$a uoa = new a$a();
       uoa.b = b.b();
       b = (j.e() && l.c("key_enable_frame_rate_monitor", false))? true: false;
       uoa.a = b;
       FPSMonitorInitModule$execute$fpsMonitorConfig$1 iNSTANCE = FPSMonitorInitModule$execute$fpsMonitorConfig$1.INSTANCE;
       a.p(iNSTANCE, "customParamsInvoker");
       uoa.d = iNSTANCE;
       FPSMonitorInitModule$execute$fpsMonitorConfig$2 iNSTANCE1 = FPSMonitorInitModule$execute$fpsMonitorConfig$2.INSTANCE;
       a.p(iNSTANCE1, "forceDumpDataInvoker");
       uoa.e = iNSTANCE1;
       uoa.c = uArrayList;
       uoa.f = new FPSMonitorInitModule$execute$fpsMonitorConfig$3(this);
       k.a(uoa.a());
       if (b.b() && !PatchProxy.applyVoid(objArray, this, FPSMonitorInitModule.class, "2")) {
          a.b().registerActivityLifecycleCallbacks(new a());
       }
       if (!a.getBoolean("FpsMonitorLinkPageMonitor", false) || (!TextUtils.isEmpty(b.c()) && !PatchProxy.applyVoid(objArray, this, FPSMonitorInitModule.class, "3"))) {
          PageMonitor.INSTANCE.registerPageEventGlobalListener(new b(this));
       }
    label_00e5 :
       Log.g("FpsMonitor", "isOpen = "+b.b());
       e.g(new FPSMonitorInitModule$b(this), "FPSMonitor_Get_Kswitch");
       return;
    }
    public final void o0(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FPSMonitorInitModule.class, "4")) {
          return;
       }
       Log.g("FpsMonitor", "startSection: "+p1);
       FpsMonitor.startSection$default(p1, p0, null, null, null, 28, null);
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          Log.e("FpsMonitor", "page "+p1+" startSection error: ", throwable);
       }
       return;
    }
    public synchronized final void p0(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FPSMonitorInitModule.class, "6")) {
          return;
       }
       if (!this.r.containsKey(p1)) {
          return;
       }
       Log.g("FpsMonitor", "stopSection: "+p1);
       FpsMonitor.stopSection(p1, p0);
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          Log.e("FpsMonitor", "page "+p1+" stopSection error: ", throwable);
       }
       List list = this.r.get(p1);
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             b9.a(iterator.next());
          }
       }
       this.r.remove(p1);
       return;
    }
    public final void q0(BaseFragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FPSMonitorInitModule.class, "5")) {
          return;
       }
       FragmentActivity activity = p0.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          this.p0(activity, p1);
       }
       return;
    }
}
