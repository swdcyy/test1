package com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$2;
import yy.z0;
import msd.l;
import erd.g;
import crd.b;
import wl9.x;
import t45.d;
import brd.z;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$3;
import ujc.e;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$onBind$4;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import iz.a;
import android.animation.Animator;
import ekd.f;
import xa5.a;
import ro5.a;
import oo5.a;
import yx.j0;
import qo5.a;
import hf5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.animation.ValueAnimator;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$c;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$d;
import java.lang.StringBuilder;
import com.kuaishou.commercial.splash.SplashNasaSlidePlayPagePresenter$a;
import java.lang.Runnable;
import ekd.k1;

public final class SplashNasaSlidePlayPagePresenter extends PresenterV2	// class@00158b
{
    public SlidePlayViewModel A;
    public final int p;
    public final int q;
    public View r;
    public View s;
    public View t;
    public View u;
    public ViewGroup v;
    public boolean w;
    public ValueAnimator x;
    public BaseFragment y;
    public c z;

    public void SplashNasaSlidePlayPagePresenter(){
       super();
       this.p = 300;
       this.q = 500;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SplashNasaSlidePlayPagePresenter.class, "2")) {
          return;
       }
       SplashNasaSlidePlayPagePresenter ty = this.y;
       if (ty != null) {
          objArray = SlidePlayViewModel.B0(ty);
       }
       this.A = objArray;
       RxBus f = RxBus.f;
       this.X7(f.g(h.class, RxBus$ThreadMode.MAIN).subscribe(new z0(new SplashNasaSlidePlayPagePresenter$onBind$2(this))));
       z a = d.a;
       this.X7(f.f(x.class).observeOn(a).subscribe(new z0(new SplashNasaSlidePlayPagePresenter$onBind$3(this))));
       t ot = f.f(e.class).observeOn(a);
       this.X7(ot.subscribe(new z0(new SplashNasaSlidePlayPagePresenter$onBind$4(this))));
       if (this.getActivity() != null) {
          Activity activity = this.getActivity();
          a.m(activity);
          String str = "activity!!";
          a.o(activity, str);
          if (activity.getWindow() != null) {
             activity = this.getActivity();
             a.m(activity);
             a.o(activity, str);
             Window window = activity.getWindow();
             a.o(window, "activity!!.window");
             if (window.getDecorView() != null) {
                activity = this.getActivity();
                a.m(activity);
                a.o(activity, str);
                window = activity.getWindow();
                a.o(window, "activity!!.window");
                View decorView = window.getDecorView();
                Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                this.v = decorView;
                this.w = false;
                if (a.b()) {
                   this.P8();
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SplashNasaSlidePlayPagePresenter.class, "3")) {
          return;
       }
       f.a(this.x);
       return;
    }
    public final void P8(){
       Object[] objArray;
       View view;
       if (PatchProxy.applyVoid(null, this, SplashNasaSlidePlayPagePresenter.class, "4")) {
          return;
       }
       boolean b = true;
       this.w = b;
       SplashNasaSlidePlayPagePresenter ty = this.y;
       if (ty != null) {
          if (a.h(ty)) {
             a.n(ty, false);
          }
          a.i(ty, false, 7);
       }
       ty = this.y;
       String str = "SplashNasaSlidePlayPagePresenter";
       if (ty != null) {
          a.m(ty);
          if (a.h(ty)) {
             objArray = new Object[false];
             j0.f(str, "disableHomeViews in home tab host", objArray);
             ty = this.y;
             a.m(ty);
             a.p(ty, false);
          }else {
             ty = this.y;
             a.m(ty);
             if (a.j(ty)) {
                objArray = new Object[false];
                j0.f(str, "disableHomeViews in plaza", objArray);
                ty = this.y;
                a.m(ty);
                a.d(ty, false);
                ty = this.y;
                a.m(ty);
                a.c(ty, false);
             }else {
                objArray = new Object[false];
                j0.c(str, "disableHomeViews in unknown container", objArray);
             }
          }
       }else {
          objArray = new Object[false];
          j0.c(str, "disableHomeViews with null fragment", objArray);
       }
       Activity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       Window window = activity.getWindow();
       a.o(window, "activity!!.window");
       View decorView = window.getDecorView();
       Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
       SplashNasaSlidePlayPagePresenter tz = this.z;
       if (tz != null) {
          tz.setVisibility(8);
       }
       view = decorView.findViewById(R.id.featured_search_layout);
       if (view != null && view.isShown() == b) {
          this.r = view;
          view.setVisibility(8);
       }
       view = decorView.findViewById(R.id.nasa_live_entry_button);
       if (view != null && view.isShown() == b) {
          this.s = view;
          view.setVisibility(8);
       }
       view = decorView.findViewById(R.id.featured_left_hamburger);
       if (view != null && view.isShown() == b) {
          this.t = view;
          view.setVisibility(8);
       }
       decorView = decorView.findViewById(R.id.featured_left_login);
       if (decorView != null && decorView.isShown() == b) {
          this.u = decorView;
          decorView.setVisibility(8);
       }
       SplashNasaSlidePlayPagePresenter ty1 = this.y;
       if (ty1 != null) {
          a.e(ty1, false);
       }
       return;
    }
    public final BaseFragment R8(){
       return this.y;
    }
    public final void S8(){
       Object[] objArray;
       SplashNasaSlidePlayPagePresenter ty2;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, SplashNasaSlidePlayPagePresenter.class, "5")) {
          return;
       }
       if (this.w != null) {
          SplashNasaSlidePlayPagePresenter ty = this.y;
          boolean b = true;
          if (ty != null) {
             if (a.h(ty)) {
                a.n(ty, b);
             }
             a.i(ty, b, 7);
          }
          f.a(this.x);
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setDuration((long)this.q);
          SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1 oresetHomeVi = new SplashNasaSlidePlayPagePresenter$resetHomeViews$animator$1(valueAnimato);
          SplashNasaSlidePlayPagePresenter ty1 = this.y;
          if (ty1 != null) {
             a.m(ty1);
             if (a.h(ty1)) {
                objArray = new Object[0];
                j0.f("SplashNasaSlidePlayPagePresenter", "resetHomeViews in home tab host", objArray);
                ty1 = this.y;
                a.m(ty1);
                a.p(ty1, b);
                ty2 = this.y;
                a.m(ty2);
                a.b(ty2, 0);
                valueAnimato.addUpdateListener(new SplashNasaSlidePlayPagePresenter$b(this));
             }else {
                ty1 = this.y;
                a.m(ty1);
                if (a.j(ty1)) {
                   objArray = new Object[0];
                   j0.f("SplashNasaSlidePlayPagePresenter", "resetHomeViews in plaza", objArray);
                   ty1 = this.y;
                   a.m(ty1);
                   a.d(ty1, b);
                   ty1 = this.y;
                   a.m(ty1);
                   a.c(ty1, b);
                   ty2 = this.y;
                   a.m(ty2);
                   a.a(ty2, 0);
                   valueAnimato.addUpdateListener(new SplashNasaSlidePlayPagePresenter$c(this));
                }else {
                   objArray1 = new Object[0];
                   j0.c("SplashNasaSlidePlayPagePresenter", "resetHomeViews in unknown container", objArray1);
                }
             }
          }else {
             objArray1 = new Object[0];
             j0.c("SplashNasaSlidePlayPagePresenter", "resetHomeViews with null fragment", objArray1);
          }
          ty2 = this.z;
          if (ty2 != null) {
             ty2.setVisibility(0);
          }
          ty2 = this.r;
          if (ty2 != null) {
             oresetHomeVi.invoke(ty2);
          }
          ty2 = this.s;
          if (ty2 != null) {
             oresetHomeVi.invoke(ty2);
          }
          ty2 = this.t;
          if (ty2 != null) {
             oresetHomeVi.invoke(ty2);
          }
          ty2 = this.u;
          if (ty2 != null) {
             oresetHomeVi.invoke(ty2);
          }
          ty2 = this.y;
          if (ty2 != null) {
             a.j(ty2, 0);
             a.a(ty2, 0);
             valueAnimato.addUpdateListener(new SplashNasaSlidePlayPagePresenter$d(ty2));
          }
          valueAnimato.start();
          this.x = valueAnimato;
          this.w = false;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SplashNasaSlidePlayPagePresenter.class, "1")) {
          return;
       }
       this.y = this.t8("FRAGMENT");
       this.z = this.t8("MILANO_FRONT_VIEW_PROTOCOL");
       return;
    }
    public final void onEyemaxSplashShowEvent(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter.class, "7")) {
          return;
       }
       a.p(p0, "eyemaxSplashShowEvent");
       Object[] objArray = new Object[0];
       j0.f("SplashNasaSlidePlayPagePresenter", "onEyemaxSplashShowEvent event.state:"+p0.a, objArray);
       if (p0.a == 1 && a.b()) {
          this.P8();
       }else if(p0.a == 2){
          this.S8();
       }
       return;
    }
    public final void onHomeSplashStateEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter.class, "6")) {
          return;
       }
       a.p(p0, "event");
       Object[] objArray = new Object[0];
       j0.f("SplashNasaSlidePlayPagePresenter", "HomeSplashStateEvent event.state:"+p0.a, objArray);
       p0 = p0.a;
       if (p0 == 4) {
          this.S8();
       }else if(p0 == 3 && a.b()){
          this.P8();
       }
       return;
    }
    public final void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashNasaSlidePlayPagePresenter.class, "8")) {
          return;
       }
       a.p(p0, "topEnter");
       Object[] objArray = new Object[0];
       j0.f("SplashNasaSlidePlayPagePresenter", "SplashEyemaxEnterDetail", objArray);
       k1.r(new SplashNasaSlidePlayPagePresenter$a(this), (long)this.p);
       return;
    }
}
