package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xl8.b;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$2;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$b;
import tkd.b;
import tkd.d;
import vw5.f;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.yxcorp.gifshow.nearby.common.model.NearbyHeadNegativeType;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView;
import android.view.ViewGroup;
import android.widget.Space;
import tw5.d;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import brd.t;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.c;
import android.view.View$OnClickListener;
import f2b.g;
import f2b.h;
import f2b.b;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.b;
import erd.r;
import f2b.c;
import io.reactivex.internal.functions.Functions;
import f2b.d;
import srb.b;
import lrb.a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$SizerState;
import p96.a;
import q87.c;
import lnc.i3;
import trb.b;
import com.kwai.framework.location.k;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.WeatherBar;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bsb.a;
import jrb.b;
import qrd.p;
import java.lang.System;
import trb.a;
import bkc.a;
import ju5.g;
import com.yxcorp.gifshow.nearby.model.FestivalIcon;
import lnc.ya;
import f2b.m;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mrd.a;

public class HomeLocalSizerViewPresenter extends PresenterV2 implements g	// class@001ac7
{
    public b A;
    public f B;
    public boolean C;
    public boolean D;
    public final LifecycleObserver E;
    public final b F;
    public RecyclerFragment p;
    public a q;
    public a r;
    public d s;
    public LocalSizerDataProvider t;
    public WeatherBar u;
    public String v;
    public int w;
    public HomeLocalSizerView x;
    public b y;
    public boolean z;

    public void HomeLocalSizerViewPresenter(){
       super();
       this.y = new b(null);
       this.A = new b(Boolean.FALSE);
       this.B = new HomeLocalSizerViewPresenter$a(this);
       this.E = new HomeLocalSizerViewPresenter$2(this);
       this.F = new HomeLocalSizerViewPresenter$b(this);
       PresenterV2 presenterV2 = d.a(0x54358588).K("HEADER");
       if (presenterV2 != null) {
          this.U7(presenterV2);
       }
       return;
    }
    public void E8(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeLocalSizerViewPresenter homeLocalSiz = HomeLocalSizerViewPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeLocalSiz, "3")) {
          return;
       }
       boolean b = true;
       this.C = b;
       this.w = LocalConfigKeyHelper.f();
       ViewGroup$LayoutParams obj = PatchProxy.apply(objArray, this, homeLocalSiz, "7");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.w == NearbyHeadNegativeType.HIDE_SIZER_VIEW.getType() || this.w == NearbyHeadNegativeType.HIDE_SIZER_VIEW_WITH_CITY_PICK.getType()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          this.x.removeAllViews();
          ViewGroup$LayoutParams layoutParams = this.x.getLayoutParams();
          layoutParams.height = a1.e(8.00f);
          this.x.setLayoutParams(layoutParams);
          this.x.setVisibility(4);
          return;
       }else {
          obj = this.x.getLayoutParams();
          if (obj instanceof ViewGroup$MarginLayoutParams) {
             obj.height = a1.e(0x41f00000);
             obj.topMargin = a1.e(6.00f);
             obj.bottomMargin = a1.e(6.00f);
             this.x.setLayoutParams(obj);
          }
          Object obj1 = PatchProxy.apply(objArray, this, homeLocalSiz, "8");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else if(this.w == NearbyHeadNegativeType.HIDE_LOCATION.getType() || this.w == NearbyHeadNegativeType.HIDE_LOCATION_WITH_CITY_PICK.getType()){
             b = null;
          }
          b2 = b;
          if (b2) {
             HomeLocalSizerViewPresenter tx = this.x;
             Objects.requireNonNull(tx);
             if (!PatchProxy.applyVoid(objArray, tx, HomeLocalSizerView.class, "12")) {
                tx.e.setVisibility(8);
                tx.r.setVisibility(0);
             }
          }
          this.v = this.s.e();
          this.p.getLifecycle().addObserver(this.E);
          this.X7(this.t.getDataObservable().subscribe(new a(this)));
          if (!PatchProxy.applyVoid(objArray, this, homeLocalSiz, "10")) {
             this.x.setWeatherClick(new c(this));
             this.x.setCityClick(new g(this));
             this.x.setLocatingClick(new h(this));
             this.x.getNoPermissionContainer().setOnClickListener(new b(this));
             this.x.setStateObservable(this.y);
          }
          this.X7(this.q.skip(1).filter(b.b).subscribe(new c(this), Functions.d()));
          this.X7(this.s.a().distinctUntilChanged().subscribe(new d(this), Functions.e));
          a.j(this.F);
          if (!PatchProxy.applyVoid(objArray, this, homeLocalSiz, "16")) {
             this.x.setCurrentState(HomeLocalSizerView$SizerState.LOCATING);
          }
          Object[] objArray1 = new Object[0];
          a.C().w("ks.location.log:Local", "[SizerView] registerLocationCityObserver", objArray1);
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter.class, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.a("bind", Boolean.valueOf(this.C));
       oi3.a("unBind", Boolean.valueOf(this.D));
       b.a("local_sizer_presenter_life", oi3.e());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter.class, "4")) {
          return;
       }
       this.D = true;
       this.A.d(Boolean.FALSE);
       this.p.getLifecycle().removeObserver(this.E);
       a.m(this.F);
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLocalSizerViewPresenter.class, "12")) {
          return;
       }
       if (this.z != null) {
          ConcurrentHashMap c = a.c;
       }
       String str = 1;
       boolean b = (k.c("default") && a.b())? true: false;
       this.z = b;
       Object[] objArray1 = new Object[0];
       a.C().w("ks.location.log:Local", "[SizerView] : all Permission= "+this.z+" | gps= "+k.f(), objArray1);
       NearbySubSizerResponse dataValue = this.t.getDataValue();
       if (dataValue != null) {
          dataValue = dataValue.mWeatherBar;
          this.u = dataValue;
          HomeLocalSizerViewPresenter tx = this.x;
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoidOneRefs(dataValue, tx, HomeLocalSizerView.class, "8")) {
             if (dataValue == null) {
                if (!PatchProxy.applyVoid(objArray, tx, HomeLocalSizerView.class, "10")) {
                   int i = 8;
                   tx.n.setVisibility(i);
                   tx.j.setVisibility(i);
                   tx.o.setVisibility(i);
                }
             }else {
                tx.c();
                Object[] objArray2 = new Object[str];
                objArray2[0] = dataValue.mTemperature;
                tx.n.setText(String.format("%s¡ã", objArray2));
                tx.o.setText(dataValue.mSkyCondition);
             }
          }
       }
       if (this.z == null && TextUtils.x(this.s.c())) {
          this.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
          objArray = new Object[0];
          a.C().w("ks.location.log:Local", "[SizerView] : sizer state is NO_PERMISSION", objArray);
          return;
       }else if(this.z != null && TextUtils.x(a.f(this.s))){
          this.x.setCurrentState(HomeLocalSizerView$SizerState.NO_PERMISSION);
          objArray = new Object[0];
          a.C().w("ks.location.log:Local", "[SizerView] : sizer state is LOCATION_ERROR", objArray);
          return;
       }else if(!TextUtils.x(a.f(this.s))){
          this.R8(0);
       }
       return;
    }
    public final void R8(boolean p0){
       HomeLocalSizerViewPresenter tx;
       int b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeLocalSizerViewPresenter homeLocalSiz = HomeLocalSizerViewPresenter.class;
       if (PatchProxy.isSupport(homeLocalSiz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, homeLocalSiz, "14")) {
          return;
       }
       String str = b.b(a.f(this.s));
       this.x.setCurrentState(HomeLocalSizerView$SizerState.NORMAL);
       Boolean uBoolean = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "20");
       if (uBoolean == patchProxyRe) {
          uBoolean = LocalConfigKeyHelper.t.getValue();
       }
       int i = 4;
       int i1 = 0;
       if (uBoolean.booleanValue()) {
          tx = this.x;
          String str1 = PatchProxy.applyOneRefs(str, this, homeLocalSiz, "15");
          if (str1 != patchProxyRe) {
          }else if(str == null){
             str1 = "";
          }else if(str.length() <= 6){
             str1 = str;
          }else {
             str1 = str.substring(i1, 5)+"¡­";
          }
          tx.setCityName(str1);
       }else {
          this.x.setCityName(b.f(str, i));
       }
       b = true;
       if (p0) {
          a.g = System.currentTimeMillis();
          a.a(b);
       }
       Object[] objArray = new Object[i1];
       a.C().w("ks.location.log:Local", "[SizerView] update Ui £ºcity= "+b.f(str, i)+" | isLocateRequest="+p0, objArray);
       NearbySubSizerResponse dataValue = this.t.getDataValue();
       if (dataValue == null) {
          objArray1 = new Object[i1];
          a.C().w("HomeLocalCurentCityBuilder", "resp Îª¿Õ", objArray1);
          return;
       }else {
          NearbySubSizerResponse mWeatherBar = dataValue.mWeatherBar;
          this.u = mWeatherBar;
          tx = this.x;
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoidOneRefs(mWeatherBar, tx, HomeLocalSizerView.class, "7")) {
             if (mWeatherBar == null) {
                if (!PatchProxy.applyVoid(null, tx, HomeLocalSizerView.class, "9")) {
                   int i2 = 8;
                   tx.l.setVisibility(i2);
                   tx.i.setVisibility(i2);
                   tx.m.setVisibility(i2);
                }
             }else {
                tx.c();
                objArray1 = new Object[b];
                objArray1[i1] = mWeatherBar.mTemperature;
                tx.l.setText(String.format("%s¡ã", objArray1));
                tx.m.setText(mWeatherBar.mSkyCondition);
             }
          }
          if (!this.x.a() || (!PatchProxy.applyVoid(null, this, homeLocalSiz, "18") && this.u != null)) {
             b = 0x6ea0c3d0;
             if (d.a(b).rM(this.u.mLinkUrl)) {
                d.a(b).t9(this.u.mLinkUrl, "HomeLocalSizerViewPresenter");
             }
          }
          dataValue = dataValue.mFestivalIcon;
          if (dataValue != null) {
             this.x.setupFestivalIcon(dataValue);
          }else {
             this.x.b();
          }
          this.A.d(Boolean.TRUE);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerViewPresenter.class, "2")) {
          return;
       }
       this.x = new ya(p0).a(0x7f0a4469, 0x7f0a12bc);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeLocalSizerViewPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HomeLocalSizerViewPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HomeLocalSizerViewPresenter.class, new m());
       }else {
          obj.put(HomeLocalSizerViewPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("nearby_roam_panel_action_behavior");
       this.r = this.t8("nearby_header_sizer_guide_bubble_subject");
       this.s = this.r8("local_current_city");
       this.t = this.r8("nearby_header_LOCAL_SIZER_MANAGER");
       return;
    }
}
