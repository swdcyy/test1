package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$d;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kda.e;
import q87.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zda.d0;
import erd.g;
import crd.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.System;
import o56.d;
import java.lang.Long;
import n66.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import uy6.e;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import java.lang.Runnable;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import msd.p;
import qe7.c;
import qe7.d;
import java.lang.Number;

public final class NasaFeaturedNewFpsMonitorPresenter extends PresenterV2	// class@000f64
{
    public final p A;
    public final p B;
    public NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1 C;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public final Runnable r;
    public final Runnable s;
    public final Runnable t;
    public boolean u;
    public boolean v;
    public boolean w;
    public b x;
    public final Handler y;
    public final p z;
    public static final NasaFeaturedNewFpsMonitorPresenter$a D;

    static {
       NasaFeaturedNewFpsMonitorPresenter.D = new NasaFeaturedNewFpsMonitorPresenter$a(null);
    }
    public void NasaFeaturedNewFpsMonitorPresenter(){
       super();
       this.r = new NasaFeaturedNewFpsMonitorPresenter$b(this);
       this.s = new NasaFeaturedNewFpsMonitorPresenter$c(this);
       this.t = new NasaFeaturedNewFpsMonitorPresenter$d(this);
       this.y = new Handler(Looper.getMainLooper());
       this.z = s.c(NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2.INSTANCE);
       this.A = s.c(NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2.INSTANCE);
       this.B = s.c(NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2.INSTANCE);
       this.C = new NasaFeaturedNewFpsMonitorPresenter$lifecycleObserver$1(this);
    }
    public static final BaseFragment P8(NasaFeaturedNewFpsMonitorPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       NasaFeaturedNewFpsMonitorPresenter nasaFeatured = NasaFeaturedNewFpsMonitorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeatured, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "onBind", objArray1);
       NasaFeaturedNewFpsMonitorPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       this.q = SlidePlayViewModel.B0(tp);
       if (!PatchProxy.applyVoid(objArray, this, nasaFeatured, "7")) {
          nasaFeatured = this.p;
          if (nasaFeatured == null) {
             a.S("mFragment");
          }
          t ot = nasaFeatured.Vg().j();
          NasaFeaturedNewFpsMonitorPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S("mFragment");
          }
          this.x = ot.compose(c.c(tp1.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new d0(this));
          nasaFeatured = this.p;
          if (nasaFeatured == null) {
             a.S("mFragment");
          }
          nasaFeatured.getLifecycle().addObserver(this.C);
       }
       return;
    }
    public void J8(){
       NasaFeaturedNewFpsMonitorPresenter nasaFeatured = NasaFeaturedNewFpsMonitorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeatured, "6")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "onUnbind", objArray1);
       this.R8();
       if (!PatchProxy.applyVoid(objArray, this, nasaFeatured, "15")) {
          objArray = new Object[i];
          e.C().w("NasaFeaturedNewFpsMonitorPresenter", "destoryCycledMonitor", objArray);
          String str = "mFragment";
          if (this.S8()) {
             this.w = i;
             String str1 = "scene_nasa_featured_slide_cycle_fps";
             c.b(str1, "timeApartLaunch", Long.valueOf((System.currentTimeMillis() - d.h)));
             nasaFeatured = this.p;
             if (nasaFeatured == null) {
                a.S(str);
             }
             FragmentActivity activity = nasaFeatured.getActivity();
             a.m(activity);
             a.o(activity, "mFragment.activity!!");
             FpsMonitor.stopSection(str1, activity);
          }
          if (SlidePerformanceExp.b().a()) {
             this.y.removeCallbacks(this.t);
             this.y.removeCallbacks(this.s);
             b9.a(this.x);
             nasaFeatured = this.p;
             if (nasaFeatured == null) {
                a.S(str);
             }
             nasaFeatured.getLifecycle().removeObserver(this.C);
          }
       }
       return;
    }
    public final void R8(){
       NasaFeaturedNewFpsMonitorPresenter tp;
       if (PatchProxy.applyVoid(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "10")) {
          return;
       }
       String str = "mFragment";
       if (this.V8()) {
          this.u = true;
          this.v = false;
          Object[] objArray = new Object[false];
          e.C().w("NasaFeaturedNewFpsMonitorPresenter", "destoryFeaturedMonitor", objArray);
          this.y.removeCallbacks(this.r);
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          FragmentActivity activity = tp.getActivity();
          a.m(activity);
          a.o(activity, "mFragment.activity!!");
          FpsMonitor.stopSection("scene_nasa_featured_slide_fps", activity);
       }
       if (!SlidePerformanceExp.b().a()) {
          b9.a(this.x);
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.getLifecycle().removeObserver(this.C);
       }
       return;
    }
    public final boolean S8(){
       boolean b;
       NasaFeaturedNewFpsMonitorPresenter obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SlidePerformanceExp.b().a() && this.w != null) {
          obj = this.p;
          if (obj == null) {
             a.S("mFragment");
          }
          if (obj != null) {
             obj = this.p;
             if (obj == null) {
                a.S("mFragment");
             }
             if (obj.getActivity() != null) {
                b = true;
             label_003d :
                return b;
             }
          }
       }
    label_003c :
       b = false;
       goto label_003d ;
    }
    public final boolean V8(){
       boolean b;
       NasaFeaturedNewFpsMonitorPresenter obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SlidePerformanceExp.b().b() && (this.u == null && this.v != null)) {
          obj = this.p;
          if (obj == null) {
             a.S("mFragment");
          }
          if (obj != null) {
             obj = this.p;
             if (obj == null) {
                a.S("mFragment");
             }
             if (obj.getActivity() != null) {
                b = true;
             label_0041 :
                return b;
             }
          }
       }
    label_0040 :
       b = false;
       goto label_0041 ;
    }
    public final boolean W8(){
       boolean b;
       NasaFeaturedNewFpsMonitorPresenter obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SlidePerformanceExp.b().a() && this.w == null) {
          obj = this.p;
          if (obj == null) {
             a.S("mFragment");
          }
          if (obj != null) {
             obj = this.p;
             if (obj == null) {
                a.S("mFragment");
             }
             if (obj.getActivity() != null) {
                b = true;
             label_003d :
                return b;
             }
          }
       }
    label_003c :
       b = false;
       goto label_003d ;
    }
    public final boolean X8(){
       boolean b;
       NasaFeaturedNewFpsMonitorPresenter obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (SlidePerformanceExp.b().b() && (this.u == null && this.v == null)) {
          obj = this.p;
          if (obj == null) {
             a.S("mFragment");
          }
          if (obj != null) {
             obj = this.p;
             if (obj == null) {
                a.S("mFragment");
             }
             if (obj.getActivity() != null) {
                b = true;
             label_0041 :
                return b;
             }
          }
       }
    label_0040 :
       b = false;
       goto label_0041 ;
    }
    public final void Y8(){
       NasaFeaturedNewFpsMonitorPresenter nasaFeatured = NasaFeaturedNewFpsMonitorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeatured, "13")) {
          return;
       }
       this.w = true;
       Object[] objArray1 = new Object[0];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "startCycleMonitor", objArray1);
       c.a("scene_nasa_featured_slide_cycle_fps");
       NasaFeaturedNewFpsMonitorPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       FragmentActivity activity = tp.getActivity();
       a.m(activity);
       a.o(activity, "mFragment.activity!!");
       FpsMonitor.startSection$default("scene_nasa_featured_slide_cycle_fps", activity, null, null, null, 28, null);
       this.y.removeCallbacks(this.t);
       this.y.removeCallbacks(this.s);
       tp = this.y;
       NasaFeaturedNewFpsMonitorPresenter tt = this.t;
       Number number = PatchProxy.apply(objArray, this, nasaFeatured, "2");
       if (number == PatchProxyResult.class) {
          number = this.A.getValue();
       }
       tp.postDelayed(tt, number.longValue());
       return;
    }
    public final void Z8(){
       NasaFeaturedNewFpsMonitorPresenter nasaFeatured = NasaFeaturedNewFpsMonitorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeatured, "8")) {
          return;
       }
       this.v = true;
       Object[] objArray1 = new Object[0];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "startFeaturedMonitor", objArray1);
       NasaFeaturedNewFpsMonitorPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       FragmentActivity activity = tp.getActivity();
       a.m(activity);
       a.o(activity, "mFragment.activity!!");
       FpsMonitor.startSection$default("scene_nasa_featured_slide_fps", activity, null, null, null, 28, null);
       tp = this.y;
       NasaFeaturedNewFpsMonitorPresenter tr = this.r;
       Number number = PatchProxy.apply(objArray, this, nasaFeatured, "1");
       if (number == PatchProxyResult.class) {
          number = this.z.getValue();
       }
       tp.postDelayed(tr, number.longValue());
       return;
    }
    public final void a9(boolean p0){
       NasaFeaturedNewFpsMonitorPresenter nasaFeatured = NasaFeaturedNewFpsMonitorPresenter.class;
       if (PatchProxy.isSupport(nasaFeatured) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaFeatured, "14")) {
          return;
       }
       this.w = false;
       Object[] objArray = new Object[false];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "stopCycledMonitor", objArray);
       this.y.removeCallbacks(this.t);
       this.y.removeCallbacks(this.s);
       String str = "scene_nasa_featured_slide_cycle_fps";
       c.b(str, "timeApartLaunch", Long.valueOf((System.currentTimeMillis() - d.h)));
       NasaFeaturedNewFpsMonitorPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       FragmentActivity activity = tp.getActivity();
       a.m(activity);
       a.o(activity, "mFragment.activity!!");
       FpsMonitor.stopSection(str, activity);
       if (p0) {
          NasaFeaturedNewFpsMonitorPresenter ty = this.y;
          tp = this.s;
          Number number = PatchProxy.apply(null, this, nasaFeatured, "3");
          if (number == PatchProxyResult.class) {
             number = this.B.getValue();
          }
          ty.postDelayed(tp, number.longValue());
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "9")) {
          return;
       }
       this.v = false;
       Object[] objArray = new Object[false];
       e.C().w("NasaFeaturedNewFpsMonitorPresenter", "stopFeaturedMonitor", objArray);
       this.y.removeCallbacks(this.r);
       NasaFeaturedNewFpsMonitorPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       FragmentActivity activity = tp.getActivity();
       a.m(activity);
       a.o(activity, "mFragment.activity!!");
       FpsMonitor.stopSection("scene_nasa_featured_slide_fps", activity);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedNewFpsMonitorPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
