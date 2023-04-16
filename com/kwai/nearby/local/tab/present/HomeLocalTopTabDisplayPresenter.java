package com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import pr6.d;
import androidx.fragment.app.Fragment;
import id7.o0;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$1;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$a;
import com.kwai.robust.PatchProxyResult;
import vc7.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import jrb.b;
import brd.t;
import tw5.d;
import id7.x;
import erd.g;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.nearby.local.tab.present.d;
import erd.r;
import id7.a0;
import brd.w;
import com.kwai.nearby.local.tab.present.e;
import io.reactivex.internal.functions.Functions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import id7.c0;
import ln5.a;
import id7.y;
import sb5.a;
import id7.z;
import id7.e0;
import id7.d0;
import qc7.g;
import id7.b0;
import hd7.e;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$b;
import android.animation.Animator$AnimatorListener;
import com.kwai.nearby.local.tab.present.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import android.app.Activity;
import za5.c;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tkd.b;
import tkd.d;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import com.kwai.nearby.startup.local.model.NearbyTabNameExpConfig;
import java.lang.reflect.Type;
import kn4.a;
import java.util.Locale;
import ra6.a;
import com.kwai.nearby.startup.local.model.NearbyTabNameExpConfig$CitySwitchName;
import pkd.a;
import android.view.GestureDetector$OnDoubleTapListener;
import rc7.a;
import xl8.b;
import mrd.a;

public class HomeLocalTopTabDisplayPresenter extends PresenterV2	// class@000fec
{
    public o0 A;
    public final LifecycleObserver B;
    public GestureDetector$OnDoubleTapListener C;
    public boolean D;
    public d p;
    public b q;
    public a r;
    public e s;
    public d0 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public d y;
    public ValueAnimator z;

    public void HomeLocalTopTabDisplayPresenter(BaseFragment p0){
       super(new d(p0), false);
    }
    public void HomeLocalTopTabDisplayPresenter(d p0,boolean p1){
       super();
       this.x = false;
       this.A = new o0();
       this.B = new HomeLocalTopTabDisplayPresenter$1(this);
       this.C = new HomeLocalTopTabDisplayPresenter$a(this);
       this.D = false;
       this.y = p0;
       this.u = p1;
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d0 uod0 = d0.class;
       HomeLocalTopTabDisplayPresenter homeLocalTop = HomeLocalTopTabDisplayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeLocalTop, "2")) {
          return;
       }
       this.X7(b.e());
       if (!PatchProxy.applyVoid(objArray, this, homeLocalTop, "4")) {
          this.X7(this.p.a().subscribe(new x(this)));
          HomeLocalTopTabDisplayPresenter tt1 = this.t;
          Objects.requireNonNull(tt1);
          t ot2 = PatchProxy.apply(objArray, tt1, uod0, "10");
          if (ot2 != patchProxyRe) {
          }else {
             ot2 = tt1.e.hide();
             a.o(ot2, "mTabDisplayName.hide\(\)");
          }
          this.X7(ot2.filter(d.b).subscribe(new a0(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, homeLocalTop, "5")) {
          t ot = this.t.g();
          HomeLocalTopTabDisplayPresenter tt = this.t;
          Objects.requireNonNull(tt);
          t ot1 = PatchProxy.apply(objArray, tt, uod0, "16");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = tt.d.hide();
             a.o(ot1, "mSubLocalPageSelected.hide\(\)");
          }
          this.X7(t.merge(ot, ot1).subscribe(new e(this), Functions.d()));
       }
       this.S8(false);
       this.y.getLifecycle().addObserver(this.B);
       this.R8(this.p.d());
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(l.class, mAIN).subscribe(new c0(this)));
       this.X7(f.g(a.class, mAIN).subscribe(new y(this)));
       this.X7(f.g(a.class, mAIN).subscribe(new z(this)));
       if (!PatchProxy.applyVoid(objArray, this, homeLocalTop, "14")) {
          this.X7(this.r.filter(new e0(this)).subscribe(new d0(this), Functions.e));
       }
       this.X7(f.g(g.class, mAIN).subscribe(new b0(this)));
       return;
    }
    public void J8(){
       HomeLocalTopTabDisplayPresenter homeLocalTop = HomeLocalTopTabDisplayPresenter.class;
       if (PatchProxy.applyVoid(null, this, homeLocalTop, "16")) {
          return;
       }
       this.y.getLifecycle().removeObserver(this.B);
       if (!PatchProxy.applyVoid(null, this, homeLocalTop, "15")) {
          this.s.j();
       }
       return;
    }
    public final void P8(boolean p0){
       ValueAnimator valueAnimato;
       HomeLocalTopTabDisplayPresenter homeLocalTop = HomeLocalTopTabDisplayPresenter.class;
       if (PatchProxy.isSupport(homeLocalTop) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, homeLocalTop, "18")) {
          return;
       }
       homeLocalTop = this.z;
       if (homeLocalTop != null && (homeLocalTop.isStarted() || this.z.isRunning())) {
          this.z.cancel();
          this.z.removeAllUpdateListeners();
       }
       float[] uofloatArray = new float[2];
       if (p0) {
          uofloatArray = {0,0x3f800000};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }else {
          uofloatArray = {0x3f800000,0};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }
       this.z = valueAnimato;
       valueAnimato.setDuration(150);
       this.z.setStartDelay(150);
       this.z.addListener(new HomeLocalTopTabDisplayPresenter$b(this, p0));
       this.z.addUpdateListener(new c(this));
       this.z.start();
       return;
    }
    public final void R8(CityInfo p0){
       boolean b;
       HomeLocalTopTabDisplayPresenter homeLocalTop = HomeLocalTopTabDisplayPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, homeLocalTop, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.v != null) {
          return;
       }
       c0.q(this.y, b.o);
       String str = b.d(p0, false, true, c.b(this.getActivity()), c.c(this.getActivity()), this.p.getType(), false);
       HomeLocalTopTabDisplayPresenter ts = this.s;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NearbyTabNameExpConfig$CitySwitchName uCitySwitchN = PatchProxy.applyOneRefs(str, this, homeLocalTop, "12");
       if (uCitySwitchN != patchProxyRe) {
       }else if(str.length() > 3 || (d.a(0xded02ea).PL() && (this.W8() && str.length() > 2))){
          str = b.a();
       }
    label_006f :
       NearbyTabNameExpConfig nearbyTabNam = a.e(NearbyTabNameExpConfig.class);
       if (nearbyTabNam != null && nearbyTabNam.mCitySwitchName != null) {
          Object obj = PatchProxy.applyOneRefs(str, null, b.class, "10");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if((b.c(Locale.CHINESE, 0x7f102f5f)).equals(str) || (b.c(Locale.ENGLISH, 0x7f102f5f)).equals(str)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             int i = a.d();
             if (i != 2) {
                if (i != 3) {
                   uCitySwitchN = nearbyTabNam.mCitySwitchName.mZhName;
                }else {
                   uCitySwitchN = nearbyTabNam.mCitySwitchName.mEnName;
                }
             }else {
                str = nearbyTabNam.mCitySwitchName.mZhHantName;
             }
          }
       }
    label_00c4 :
       uCitySwitchN = str;
       ts.a(uCitySwitchN);
       return;
    }
    public final void S8(boolean p0){
       HomeLocalTopTabDisplayPresenter homeLocalTop = HomeLocalTopTabDisplayPresenter.class;
       if (PatchProxy.isSupport(homeLocalTop) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, homeLocalTop, "9")) {
          return;
       }
       if (a.g) {
          return;
       }
       boolean b = (!this.V8() && (this.t.e() && (this.t.f() && this.v == null)))? true: false;
       if (this.u == null && p0) {
          this.P8(b);
       }else {
          this.s.b(b);
       }
       if (this.w == null) {
          this.s.c(this.C);
          this.w = true;
       }
       return;
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, HomeLocalTopTabDisplayPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.u != null && !this.W8())? true: false;
       return b;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, HomeLocalTopTabDisplayPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a();
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalTopTabDisplayPresenter.class, "3")) {
          return;
       }
       this.Y8(this.p.d());
       return;
    }
    public final void Y8(CityInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalTopTabDisplayPresenter.class, "10")) {
          return;
       }
       if (p0 != null && (a.d() != 3 && this.x == null)) {
          this.x = true;
       }
    label_001b :
       this.R8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalTopTabDisplayPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("local_current_city");
       this.q = this.r8("nearby_roam_panel_status");
       this.r = this.r8("nearby_roam_panel_action_behavior");
       this.s = this.r8("HOME_LOCAL_TOP_TAB_VIEW");
       this.t = this.r8("HOME_LOCAL_PAGE_STATE");
       return;
    }
}
