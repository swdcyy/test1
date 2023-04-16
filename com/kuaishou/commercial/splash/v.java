package com.kuaishou.commercial.splash.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import yy.m1;
import erd.g;
import crd.b;
import wl9.x;
import t45.d;
import brd.z;
import yy.n1;
import ujc.e;
import yy.o1;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.SwipeLayout;
import iz.a;
import java.lang.Runnable;
import ekd.k1;
import ro5.a;
import uo5.a;
import java.lang.Boolean;
import com.kuaishou.commercial.splash.u;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import tjc.c;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;

public class v extends PresenterV2	// class@00162b
{
    public BaseFragment p;
    public View q;
    public SlidePlayViewModel r;
    public SwipeLayout s;
    public boolean t;
    public ViewGroup u;
    public Runnable v;
    public Runnable w;

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashTopHomePagePresenter", "onBind", objArray);
       this.r = SlidePlayViewModel.B0(this.p);
       RxBus f = RxBus.f;
       this.X7(f.g(h.class, RxBus$ThreadMode.MAIN).subscribe(new m1(this)));
       z a = d.a;
       this.X7(f.f(x.class).observeOn(a).subscribe(new n1(this)));
       this.X7(f.f(e.class).observeOn(a).subscribe(new o1(this)));
       if (this.getActivity() == null || (this.getActivity().getWindow() != null && this.getActivity().getWindow().getDecorView() != null)) {
          ViewGroup decorView = this.getActivity().getWindow().getDecorView();
          if (decorView == null) {
             return;
          }else {
             this.t = i;
             this.s = decorView.findViewById(0x7f0a3c34);
             this.u = decorView.findViewById(0x7f0a007f);
             if (a.b()) {
                this.P8();
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "14")) {
          return;
       }
       v tv = this.v;
       if (tv != null) {
          k1.m(tv);
       }
       tv = this.w;
       if (tv != null) {
          k1.m(tv);
       }
       return;
    }
    public final void P8(){
       v ov = v.class;
       if (PatchProxy.applyVoid(null, this, ov, "4")) {
          return;
       }
       this.t = true;
       if (!PatchProxy.applyVoid(null, this, ov, "10")) {
          a.o(this.p, false, 7);
          v ts = this.s;
          if (ts != null) {
             ts.n(false, 11);
          }
          ts = this.u;
          if (ts != null) {
             ts.setVisibility(8);
          }
          a.c(this.getActivity(), false, 8);
       }
       if (!PatchProxy.applyVoid(null, this, ov, "12")) {
          this.r.d(false, 7);
       }
       ov = this.q;
       if (ov != null) {
          ov.setVisibility(8);
       }
       return;
    }
    public final void R8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "5")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       u ou = new u(this);
       if (p0) {
          this.v = ou;
          k1.r(ou, 300);
       }else {
          ou.run();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a400c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
    public void onEyemaxSplashShowEvent(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTopHomePagePresenter", "onEyemaxSplashShowEvent event.state:"+p0.a, objArray);
       p0 = p0.a;
       if (p0 == 1) {
          this.P8();
       }else if(p0 == 2){
          this.R8(0);
       }
       return;
    }
    public void onHomeSplashStateEvent(e p0){
       boolean b1;
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "6")) {
          return;
       }
       p0 = p0.a;
       boolean b = false;
       if (p0 == 4) {
          this.R8(b);
       }else if(p0 == 3){
          p0 = PatchProxy.apply(null, this, ov, "8");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else if(b.a(-1608526086).getState() == 3 && (this.r.Y0() > 0 && (this.r.U0(b) != null && r1.w3(this.r.U0(b))))){
             b = 1;
          }
       label_0056 :
          b1 = b;
          if (b1) {
             this.P8();
          }
       }
       return;
    }
    public void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "9")) {
          return;
       }
       this.R8(true);
       return;
    }
}
