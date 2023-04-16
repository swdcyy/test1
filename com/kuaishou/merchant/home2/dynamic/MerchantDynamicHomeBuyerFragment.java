package com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment;
import hka.a;
import ax3.a;
import yr3.b;
import com.kuaishou.merchant.basic.fragment.MerchantLazyInitSupportFragment;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$a;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$_callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import lx3.k;
import v99.a;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import mrd.a;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$c;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$b;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$d;
import java.lang.String;
import erd.g;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import rw3.b;
import wkd.b;
import ex3.c;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$doInitAfterViewCreated$1;
import hx3.j;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.home.presenter.PageRefreshPresenter;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter;
import ix3.a;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter;
import com.kuaishou.merchant.home2.dynamic.feed.LiveSlidePlayPagePresenter;
import com.kuaishou.merchant.home2.dynamic.RefreshHandlePresenter;
import com.kuaishou.merchant.home2.skin.b;
import com.kuaishou.merchant.home2.dynamic.feed.DynamicFeedRealShowPresenter;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarBackgroundPresenter;
import zw3.a;
import hx3.g;
import com.kuaishou.merchant.home2.dynamic.presenter.HomePageRefreshPresenter;
import hx3.a;
import com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import hx3.m;
import fy3.a;
import iv.a;
import java.util.ArrayList;
import hx3.d;
import java.util.Collection;
import java.util.Arrays;
import lnc.i3;
import b04.e;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import java.lang.Number;
import android.content.res.Configuration;
import ww3.a;
import hx3.c;
import android.app.Activity;
import com.kuaishou.merchant.pagedy.a;
import com.kuaishou.cover.Link;
import f30.k;
import com.kuaishou.cover.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.Exception;
import p74.a;
import o74.a;
import rw3.c;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import xw3.e;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import xw3.c;
import k2b.e0;
import mv3.e;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.merchant.home2.dynamic.MerchantDynamicHomeBuyerFragment$onDestroy$1;
import zw3.k;
import java.util.HashMap;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.System;

public class MerchantDynamicHomeBuyerFragment extends MerchantLazyInitSupportFragment implements a, a, b	// class@00170c
{
    public final a A;
    public View B;
    public boolean C;
    public PublishSubject D;
    public t E;
    public boolean F;
    public c G;
    public final Observer H;
    public c I;
    public final Observer J;
    public final MerchantDynamicHomeBuyerFragment$d K;
    public HashMap L;
    public d t;
    public e u;
    public b v;
    public PresenterV2 w;
    public final p x;
    public ViewGroup y;
    public final k z;
    public static final MerchantDynamicHomeBuyerFragment$a M;

    static {
       MerchantDynamicHomeBuyerFragment.M = new MerchantDynamicHomeBuyerFragment$a(null);
    }
    public void MerchantDynamicHomeBuyerFragment(){
       super();
       this.w = new PresenterV2();
       this.x = s.c(new MerchantDynamicHomeBuyerFragment$_callerContext$2(this));
       this.z = new k();
       this.A = new a();
       PublishSubject publishSubje = PublishSubject.g();
       this.D = publishSubje;
       this.E = publishSubje.hide();
       this.G = a.g();
       this.H = new MerchantDynamicHomeBuyerFragment$c(this);
       this.I = a.g();
       this.J = new MerchantDynamicHomeBuyerFragment$b(this);
       this.K = new MerchantDynamicHomeBuyerFragment$d(this);
    }
    public String C1(){
       return "BUYER_HOME_PAGE2";
    }
    public b Hd(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantDynamicHomeBuyerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.subscribe(p0);
    }
    public String Kb(){
       return "MERCHANT_HOME_PAGE3";
    }
    public b Lf(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantDynamicHomeBuyerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.subscribe(p0);
    }
    public int M(){
       return 1;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantDynamicHomeBuyerFragment.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       MerchantDynamicHomeBuyerFragment tv = this.v;
       if (tv != null) {
          tv.t0("tabFragmentOnCreateViewBegin");
       }
       View view = b.a(-343507015).a(p1.getContext(), p1, R.layout.arg_RES_7f0d04b2);
       if (view == null) {
          view = new FrameLayout(p1.getContext());
       }
       this.B = view;
       tv = this.v;
       if (tv != null) {
          tv.t0("tabFragmentOnCreateViewEnd");
       }
       tv = this.B;
       a.m(tv);
       return tv;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantDynamicHomeBuyerFragment.class, "6")) {
          return;
       }
       MerchantDynamicHomeBuyerFragment tv = this.v;
       if (tv != null) {
          tv.t0("fragmentOnViewCreatedEnd");
       }
       tv = this.v;
       if (tv != null) {
          tv.onEvent(6);
       }
       this.y = p0.findViewById(0x7f0a0c5c);
       tv = this.t;
       if (tv != null) {
          MutableLiveData mutableLiveD = tv.y0();
          if (mutableLiveD != null) {
             FragmentActivity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             mutableLiveD.observe(activity, new j(new MerchantDynamicHomeBuyerFragment$doInitAfterViewCreated$1(this)));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantDynamicHomeBuyerFragment.class, "10")) {
          this.w.U7(new PageRefreshPresenter());
          this.w.U7(new HomePagePresenter());
          this.w.U7(new a());
          this.w.U7(new FeedMonitorPresenter());
          this.w.U7(new HomeChannelPresenter());
          this.w.U7(new LiveSlidePlayPagePresenter());
          this.w.U7(new RefreshHandlePresenter());
          this.w.U7(new b());
          this.w.U7(new DynamicFeedRealShowPresenter());
          this.w.U7(new TitleBarBackgroundPresenter());
          this.w.U7(new a());
          this.w.U7(new g());
          this.w.U7(new HomePageRefreshPresenter());
          this.w.U7(new a());
          if (MerchantAutoPlayHelper.d()) {
             this.w.U7(new MerchantAutoPlayPagePresenter());
          }
          this.w.U7(new m());
          this.w.U7(new a());
          this.w.f(p0);
          Object[] objArray = new Object[0];
          Object[] objArray1 = d.a(this.h()).toArray(objArray);
          Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          this.w.i(Arrays.copyOf(objArray1, objArray1.length));
       }
       MerchantDynamicHomeBuyerFragment tv1 = this.v;
       if (tv1 != null) {
          tv1.t0("fragmentOnViewCreatedEnd");
       }
       tv1 = this.v;
       if (tv1 != null) {
          tv1.onEvent(6);
       }
       MerchantDynamicHomeBuyerFragment tt = this.t;
       if (tt != null) {
          tt.L0(this.o(), this, this.B, this.h(), "/rest/app/square/home/mall/dynamic/page", "merchant_home_default_page.json");
       }
       return;
    }
    public String getPageParams(){
       e d;
       i3 obj = PatchProxy.apply(null, this, MerchantDynamicHomeBuyerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       MerchantDynamicHomeBuyerFragment tu = this.u;
       if (tu != null) {
          d = tu.d;
          if (d != null) {
          label_001f :
             obj.d("pageSource", d);
             int i = (QCurrentUser.ME.isLogined())? 1: 2;
             obj.c("isLogin", Integer.valueOf(i));
             return obj.toString();
          }
       }
       d = "";
       goto label_001f ;
    }
    public a h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, MerchantDynamicHomeBuyerFragment.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, MerchantDynamicHomeBuyerFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.x.getValue();
       }
       return obj;
    }
    public String h5(){
       return "BUYER_HOME_PAGE";
    }
    public final void mh(boolean p0){
       this.C = p0;
    }
    public String o(){
       return "BUYER_HOME_PAGE";
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onConfigurationChanged(Configuration p0){
       FragmentActivity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantDynamicHomeBuyerFragment.class, "7")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (a.a()) {
          try{
             MerchantDynamicHomeBuyerFragment tB = this.B;
             MerchantDynamicHomeBuyerFragment tt = this.t;
             a uoa = this.h();
             c uoc = c.class;
             if (PatchProxy.isSupport(uoc)) {
                Object[] objArray = new Object[]{this,tB,tt,uoa,p0};
                if (!PatchProxy.applyVoid(objArray, null, uoc, "2")) {
                }
             }else {
             }
          }catch(java.lang.Exception e11){
             a.d(MerchantHomeLogBiz.Common, "FoldScreen", e11.getMessage());
          }
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantDynamicHomeBuyerFragment.class, "3")) {
          return;
       }
       c.a("merchant_home_onHomeBuyerCreateStart");
       this.t = d.J0(this.getActivity());
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       this.u = ViewModelProviders.of(activity).get(e.class);
       MerchantDynamicHomeBuyerFragment tt = this.t;
       if (tt != null) {
          tt.H0(this, this.H);
       }
       tt = this.t;
       if (tt != null) {
          tt.G0(this, this.J);
       }
       this.v = b.s0(this.getActivity());
       super.onCreate(p0);
       MerchantDynamicHomeBuyerFragment tv = this.v;
       if (tv != null) {
          tv.t0("fragmentOnCreate");
       }
       tv = this.v;
       if (tv != null) {
          tv.onEvent(4);
       }
       e.q0(this.getActivity()).t0(this, e.s0(FeedChannelInfo.RecommendChannel));
       e.b(1, this.F, this.getPageParams());
       c.a("merchant_home_onHomeBuyerCreateEnd");
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment.class, "13")) {
          return;
       }
       super.onDestroy();
       if (!this.w.y8()) {
          this.w.destroy();
       }
       MerchantDynamicHomeBuyerFragment tt = this.t;
       if (tt != null) {
          tt.O0(this.H);
       }
       tt = this.t;
       if (tt != null) {
          tt.M0(this.J);
       }
       tt = this.t;
       if (tt != null) {
          MutableLiveData mutableLiveD = tt.y0();
          if (mutableLiveD != null) {
             mutableLiveD.removeObserver(new j(new MerchantDynamicHomeBuyerFragment$onDestroy$1(this)));
          }
       }
       e.b(2, this.F, this.getPageParams());
       Objects.requireNonNull(k.c);
       k.a = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.z.a();
       if (!PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment.class, "18")) {
          MerchantDynamicHomeBuyerFragment tL = this.L;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MerchantDynamicHomeBuyerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantDynamicHomeBuyerFragment.class, "9")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.D.onNext(Boolean.valueOf(p0));
       this.F = p0;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment.class, "12")) {
          return;
       }
       super.onPause();
       e.b(4, this.F, this.getPageParams());
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MerchantDynamicHomeBuyerFragment.class, "4")) {
          return;
       }
       c.a("merchant_home_onHomeBuyerResumeStart");
       super.onResume();
       MerchantDynamicHomeBuyerFragment tt = this.t;
       if (tt != null) {
          tt.u = System.currentTimeMillis();
       }
       e.b(3, this.F, this.getPageParams());
       c.a("merchant_home_onHomeBuyerResumeEnd");
       return;
    }
}
