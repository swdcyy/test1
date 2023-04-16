package com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import zda.k0;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import wq6.d;
import as6.a;
import fr6.a;
import fr6.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import zda.m0;
import erd.g;
import crd.b;
import jta.c;
import rf5.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import java.lang.System;
import uw9.c;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import qvb.i;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Number;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a$c;
import zda.l0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import android.view.ViewGroup;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;
import com.yxcorp.utility.Log;

public class k extends PresenterV2	// class@000f80
{
    public final q A;
    public final a B;
    public final c C;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public u r;
    public final List s;
    public boolean t;
    public boolean u;
    public a v;
    public boolean w;
    public boolean x;
    public final e y;
    public final ViewPager$l z;

    public void k(){
       super();
       this.s = new ArrayList();
       this.w = true;
       this.x = false;
       this.y = new k0(this);
       this.z = new k$a(this);
       this.A = new k$b(this);
       this.B = new k$c(this);
       this.C = new k$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.q = slidePlayVie;
       slidePlayVie.e(this.A);
       this.q.E(this.B);
       this.q.i(this.z);
       d uod = a.e(this.p);
       if (uod != null) {
          uod.b0().a(this.y);
       }
       this.X7(this.p.Vg().j().subscribe(new m0(this)));
       this.r.j(this.C);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "14")) {
          return;
       }
       this.q.b(this.A);
       this.q.g0(this.B);
       this.q.g(this.z);
       this.r.B(this.C);
       d uod = a.e(this.p);
       if (uod != null) {
          uod.b0().d(this.y);
       }
       return;
    }
    public boolean P8(){
       QPhoto obj = PatchProxy.apply(null, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q.getCurrentPhoto();
       boolean b = (this.t != null && (this.w != null && (!this.q.a0() && (!q.p0(this.getActivity()).s0() && (!q.p0(this.getActivity()).t0() && (this.x == null && (obj != null && (!NasaExperimentUtils.U() || (!obj.isAd() && this.r.v())))))))))? true: false;
       return b;
    }
    public boolean R8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object obj = PatchProxy.apply(null, this, ok, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.u != null && (!NasaExperimentUtils.M() || (System.currentTimeMillis() - c.a.getLong("lastRefreshWayBackTime", 0)) - TimeUnit.MINUTES.toMillis((long)NasaExperimentUtils.e0()) <= 0)) {
          Object obj1 = PatchProxy.apply(null, this, ok, "10");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.q.X0() instanceof t && this.q.X0().u2() == RefreshType.FOREGROUND2){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 || !NasaExperimentUtils.t()) {
             b = false;
          }
       }
       return b;
    }
    public int S8(){
       Object obj = PatchProxy.apply(null, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return NasaExperimentUtils.W();
    }
    public String V8(){
       return "";
    }
    public void W8(){
       int i;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "7")) {
          return;
       }
       a uoa = new a(this.getActivity());
       uoa.K0(KwaiBubbleOption.e);
       uoa.n0((this.m8().getWidth() - a1.e(8.00f)), ((this.m8().getHeight() - a1.e(10.50f)) - a1.d(R.dimen.arg_RES_7f070bf1)));
       uoa.L(new l0(this));
       uoa.C(this.m8());
       uoa.K(new k$e(this, false, 2000));
       Object obj = PatchProxy.apply(objArray, this, ok, "11");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = NasaExperimentUtils.V();
          i = (i < 0)? -1: i * 1000;
       }
       uoa.T((long)i);
       uoa.z(true);
       uoa.A(true);
       uoa.E(false);
       uoa.P(true);
       this.v = uoa.Z(new k$f(this));
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       if (this.P8()) {
          Log.g("NasaRefreshWayBackPresenter", "show");
          this.W8();
       }
       this.t = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.r = this.q8(u.class);
       return;
    }
}
