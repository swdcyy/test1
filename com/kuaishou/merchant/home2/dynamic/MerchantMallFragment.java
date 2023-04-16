package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import hka.a;
import wq6.k;
import on5.f;
import ax3.a;
import yr3.b;
import com.kuaishou.merchant.basic.fragment.MerchantLazyInitSupportFragment;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$a;
import nsd.u;
import android.os.SystemClock;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$_callerContext$2;
import msd.a;
import qrd.p;
import qrd.s;
import lx3.k;
import v99.a;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import mrd.a;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$e;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$d;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$b;
import on5.e;
import java.lang.String;
import erd.g;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fr6.a;
import wq6.j;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import mv3.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Long;
import rw3.b;
import wkd.b;
import ex3.c;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.HashMap;
import java.lang.Integer;
import c04.a;
import android.app.Application;
import o56.a;
import com.google.gson.JsonObject;
import tkd.b;
import tkd.d;
import vx4.j;
import java.util.Map;
import com.kuaishou.merchant.home2.main.widget.MerchantMallRootView;
import lnc.b9;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$c;
import androidx.lifecycle.MutableLiveData;
import b04.d;
import java.util.Objects;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$doInitAfterViewCreated$2;
import hx3.k;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ekd.m1;
import com.kuaishou.merchant.home2.dynamic.a;
import hx3.i;
import fy3.b;
import com.kuaishou.merchant.home2.home.presenter.FeedMonitorPresenter;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter;
import com.kuaishou.merchant.home2.dynamic.feed.LiveSlidePlayPagePresenter;
import com.kuaishou.merchant.home2.dynamic.feed.DynamicFeedRealShowPresenter;
import hx3.g;
import com.kuaishou.merchant.home2.dynamic.atmosphere.MallAtmospherePresenter;
import com.kuaishou.merchant.home2.dynamic.presenter.MallPageRefreshPresenter;
import hx3.m;
import fy3.e;
import com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import iv.a;
import java.util.ArrayList;
import hx3.d;
import java.util.Collection;
import java.util.Arrays;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import as6.a;
import wq6.d;
import zq6.l;
import pn5.a;
import zq6.p;
import ln5.c;
import hx3.l;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import lnc.i3;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import ro5.e0;
import km8.b;
import com.kuaishou.merchant.pagedy.a;
import com.kuaishou.pagedy.PageDy;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import android.content.res.Configuration;
import hx3.c;
import android.app.Activity;
import java.lang.Exception;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import b04.e;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import hx3.n;
import java.util.List;
import java.lang.reflect.Type;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import xw3.e;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import xw3.c;
import k2b.e0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$onDestroy$1;
import zw3.k;

public class MerchantMallFragment extends MerchantLazyInitSupportFragment implements a, k, f, a, b	// class@001715
{
    public ViewGroup A;
    public final k B;
    public final a C;
    public View D;
    public boolean E;
    public PublishSubject F;
    public t G;
    public PublishSubject H;
    public PublishSubject I;
    public a J;
    public final t K;
    public final t L;
    public final t M;
    public final MerchantMallFragment$e N;
    public b O;
    public c P;
    public final Observer Q;
    public c R;
    public final Observer S;
    public HashMap T;
    public b t;
    public long u;
    public d v;
    public e w;
    public b x;
    public PresenterV2 y;
    public final p z;
    public static final MerchantMallFragment$a U;

    static {
       MerchantMallFragment.U = new MerchantMallFragment$a(null);
    }
    public void MerchantMallFragment(){
       super();
       this.u = SystemClock.elapsedRealtime();
       this.y = new PresenterV2();
       this.z = s.c(new MerchantMallFragment$_callerContext$2(this));
       this.B = new k();
       this.C = new a();
       PublishSubject publishSubje = PublishSubject.g();
       this.F = publishSubje;
       this.G = publishSubje.hide();
       this.H = PublishSubject.g();
       this.I = PublishSubject.g();
       a uoa = a.g();
       this.J = uoa;
       this.K = uoa.hide();
       this.L = this.H.hide();
       this.M = this.I.hide();
       this.N = new MerchantMallFragment$e(this);
       this.P = a.g();
       this.Q = new MerchantMallFragment$d(this);
       this.R = a.g();
       this.S = new MerchantMallFragment$b(this);
    }
    public boolean B7(){
       return e.f(this);
    }
    public String C1(){
       return "MERCHANT_BUYER_MALL";
    }
    public b Hd(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantMallFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R.subscribe(p0);
    }
    public String Kb(){
       return "MERCHANT_HOME_PAGE_MALL";
    }
    public void L8(){
       e.h(this);
    }
    public b Lf(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantMallFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.subscribe(p0);
    }
    public int M(){
       return 1;
    }
    public void N1(){
       e.j(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, MerchantMallFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.Xg();
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "12")) {
          return;
       }
       e.c(false, this.getActivity(), true, this.getPageParams());
       this.F.onNext(Boolean.TRUE);
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantMallFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       MerchantMallFragment tx = this.x;
       if (tx != null) {
          tx.onEvent(2, Long.valueOf(this.u));
       }
       tx = this.x;
       if (tx != null) {
          tx.onEvent(3);
       }
       View view = b.a(-343507015).a(p0.getContext(), p1, R.layout.arg_RES_7f0d04ee);
       if (view == null) {
          view = new FrameLayout(p0.getContext());
       }
       this.D = view;
       a.m(view);
       return view;
    }
    public void fh(View p0,Bundle p1){
       b uob;
       boolean i1;
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantMallFragment.class, "5")) {
          return;
       }
       Object[] objArray = null;
       p op = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantMallFragment.class, "24") && a.t().d("merchantMallRequestPreload", op)) {
          p1 = PatchProxy.apply(objArray, this, MerchantMallFragment.class, "26");
          String str = "key_is_need_pre_request";
          i1 = (p1 != PatchProxyResult.class)? p1.booleanValue(): this.mh().getBoolean(str, op);
          if (i1) {
             if (!PatchProxy.isSupport(MerchantMallFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, MerchantMallFragment.class, "25")) {
                g.b(this.mh().edit().putBoolean(str, op));
             }
             HashMap hashMap = new HashMap();
             HashMap hashMap1 = new HashMap();
             hashMap1.put("tabId", Integer.valueOf(op));
             hashMap1.put("payInfo", a.b.a(a.b()));
             hashMap.put("/rest/app/square/home/mall/tab/dynamic/feed", hashMap1);
             d.a(-1046723924).ic(hashMap);
          }
       }
    label_009b :
       this.a6();
       Object[] objArray1 = (!p0 instanceof MerchantMallRootView)? objArray: p0;
       Object[] objArray2 = objArray1;
       b9.a(this.O);
       if (objArray2 != null) {
          t ot = objArray2.L();
          if (ot != null) {
             uob = ot.subscribe(new MerchantMallFragment$c(this, objArray2));
          label_00c0 :
             this.O = uob;
             MerchantMallFragment tx = this.x;
             int i = 6;
             if (tx != null) {
                tx.onEvent(i);
             }
             i1 = 0x7f0a0c5c;
             this.A = p0.findViewById(i1);
             MerchantMallFragment tv = this.v;
             if (tv != null) {
                MutableLiveData mutableLiveD = tv.y0();
                if (mutableLiveD != null) {
                   FragmentActivity activity = this.getActivity();
                   Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                   mutableLiveD.observe(activity, new k(new MerchantMallFragment$doInitAfterViewCreated$2(this)));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment.class, "16")) {
                if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment.class, "17")) {
                   View view = m1.f(p0, i1);
                   if (view != null) {
                      this.y.U7(new a(this, view));
                   }
                }
                this.y.U7(new i());
                this.y.U7(new b());
                this.y.U7(new FeedMonitorPresenter());
                this.y.U7(new HomeChannelPresenter());
                this.y.U7(new LiveSlidePlayPagePresenter());
                this.y.U7(new DynamicFeedRealShowPresenter());
                this.y.U7(new g());
                this.y.U7(new MallAtmospherePresenter());
                this.y.U7(new MallPageRefreshPresenter());
                this.y.U7(new m());
                this.y.U7(new e());
                if (MerchantAutoPlayHelper.d()) {
                   this.y.U7(new MerchantAutoPlayPagePresenter());
                }
                this.y.f(p0);
                Object[] objArray3 = new Object[op];
                objArray1 = d.a(this.h()).toArray(objArray3);
                Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                this.y.i(Arrays.copyOf(objArray1, objArray1.length));
             }
             MerchantMallFragment tx1 = this.x;
             if (tx1 != null) {
                tx1.onEvent(i);
             }
             MerchantMallFragment tv1 = this.v;
             if (tv1 != null) {
                tv1.L0(this.C1(), this, objArray2, this.h(), "/rest/app/square/home/mall/tab/dynamic/page", "merchant_mall_default_page.json");
             }
             if (!PatchProxy.applyVoid(objArray, this, MerchantMallFragment.class, "6")) {
                try{
                   b9.a(this.t);
                   if (a.c(this, b.G) || a.c(this, b.F)) {
                      JsonObject jsonObject = new JsonObject();
                      d uod = a.e(this);
                      if (uod != null) {
                         l ol = uod.d0();
                         if (ol != null) {
                            uoc = ol.a(a.b);
                         label_0212 :
                            if (uoc != null) {
                               t ot1 = uoc.b();
                               if (ot1 != null) {
                                  objArray = ot1.subscribe(new l(jsonObject, uoc), Functions.e);
                               }
                            }
                            this.t = objArray;
                         }
                      }
                      uoc = objArray;
                      goto label_0212 ;
                   }
                }catch(java.lang.Exception e10){
                   a.l(MerchantHomeLogBiz.Common, "MerchantMallFragment", "xTabHeightDidChange error: ", e10);
                }
             }
          }
       }
       uob = objArray;
       goto label_00c0 ;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, MerchantMallFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("pageSource", "tab");
       int i = (QCurrentUser.ME.isLogined())? 1: 2;
       obj.c("isLogin", Integer.valueOf(i));
       e0.c(this, obj);
       return obj.e();
    }
    public String getUrl(){
       return "";
    }
    public a h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, MerchantMallFragment.class, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, MerchantMallFragment.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.z.getValue();
       }
       return obj;
    }
    public String h5(){
       return "MERCHANT_BUYER_MALL";
    }
    public boolean i8(){
       return e.e(this);
    }
    public void jh(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "10")) {
          return;
       }
       e.c(true, this.getActivity(), true, this.getPageParams());
       Boolean tRUE = Boolean.TRUE;
       this.H.onNext(tRUE);
       this.J.onNext(tRUE);
       this.I.onNext(tRUE);
       MerchantMallFragment tx = this.x;
       if (tx != null) {
          tx.onEvent(17);
       }
       return;
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "11")) {
          return;
       }
       this.I.onNext(Boolean.FALSE);
       return;
    }
    public boolean lh(){
       return true;
    }
    public final SharedPreferences mh(){
       Object obj = PatchProxy.apply(null, this, MerchantMallFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.b("DefaultPreferenceHelper");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.SharedPreferences");
       return obj;
    }
    public final void nh(boolean p0){
       this.E = p0;
    }
    public String o(){
       return "MERCHANT_BUYER_MALL";
    }
    public boolean o3(){
       Object[] objArray = null;
       PageDy obj = PatchProxy.apply(objArray, this, MerchantMallFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoidOneRefs(this, objArray, a.class, "3")) {
          a.b();
          obj = PageDy.e();
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(this, obj, PageDy.class, "10")) {
             DynamicPageCenter uDynamicPage = obj.h(this);
             if (uDynamicPage != null && !PatchProxy.applyVoid(objArray, uDynamicPage, DynamicPageCenter.class, "21")) {
                DynamicPageCenter m = uDynamicPage.m;
                if (m != null) {
                   a uoa = uDynamicPage.m(m);
                   if (uoa != null) {
                      uoa = uoa.rootView;
                      if (uoa != null && uoa instanceof DynamicRootListContainer) {
                         uoa.setRefreshing(true);
                      }
                   }
                }
             }
          }
       }
       return e.d(this);
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment.class, "14")) {
          return;
       }
       super.onConfigurationChanged(p0);
       MerchantMallFragment tD = this.D;
       MerchantMallFragment tv = this.v;
       a uoa = this.h();
       if (!PatchProxy.applyVoidFourRefs(this, tD, tv, uoa, null, c.class, "1")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && (activity.isFinishing() == true || (a.t().d("merchantMallFoldingScreenSupport", false) && c.b(null)))) {
             try{
                a.h(this);
                c.c(this);
                if (tv != null) {
                   tv.L0("MERCHANT_BUYER_MALL", this, tD, uoa, "/rest/app/square/home/mall/tab/dynamic/page", "merchant_mall_default_page.json");
                }
             }catch(java.lang.Exception e10){
                a.d(MerchantHomeLogBiz.Common, "FoldScreen", e10.getMessage());
             }
          }
       }
    }
    public void onCreate(Bundle p0){
       boolean b;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMallFragment.class, str)) {
          return;
       }
       this.v = d.J0(this.getActivity());
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       this.w = ViewModelProviders.of(activity).get(e.class);
       MerchantMallFragment tv = this.v;
       if (tv != null) {
          tv.H0(this, this.Q);
       }
       tv = this.v;
       if (tv != null) {
          tv.G0(this, this.S);
       }
       b uob = b.s0(this.getActivity());
       this.x = uob;
       b = true;
       if (uob != null) {
          uob = uob.a;
          if (uob != null) {
             uob.f(b);
          }
       }
       tv = this.x;
       if (tv != null) {
          uob = tv.a;
          if (uob != null) {
             uob.b = b;
          }
       }
       super.onCreate(p0);
       MerchantMallFragment tx = this.x;
       if (tx != null) {
          tx.onEvent(4);
       }
       List list = PatchProxy.apply(null, null, n.class, str);
       if (list != PatchProxyResult.class) {
       }else {
          list = a.t().getValue("merchantMallTKBundlePreload", List.class, n.a());
       }
       if (list != null) {
          BundlePreloadUtil.a(this.o(), list);
       }
       e.q0(this.getActivity()).t0(this, e.s0(FeedChannelInfo.RecommendChannel));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "19")) {
          return;
       }
       super.onDestroy();
       if (!this.y.y8()) {
          this.y.destroy();
       }
       MerchantMallFragment tv = this.v;
       if (tv != null) {
          tv.O0(this.Q);
       }
       tv = this.v;
       if (tv != null) {
          tv.M0(this.S);
       }
       tv = this.v;
       if (tv != null) {
          MutableLiveData mutableLiveD = tv.y0();
          if (mutableLiveD != null) {
             mutableLiveD.removeObserver(new k(new MerchantMallFragment$onDestroy$1(this)));
          }
       }
       e.e(2, this.getPageParams());
       Objects.requireNonNull(k.c);
       k.b = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       this.B.a();
       b9.a(this.O);
       b9.a(this.t);
       if (!PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "29")) {
          MerchantMallFragment tT = this.T;
          if (tT != null) {
             tT.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MerchantMallFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantMallFragment.class, "13")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.F.onNext(Boolean.valueOf(p0));
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "8")) {
          return;
       }
       super.onPause();
       e.e(4, this.getPageParams());
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MerchantMallFragment.class, "7")) {
          return;
       }
       super.onResume();
       e.e(3, this.getPageParams());
       return;
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public d z5(){
       return j.c(this);
    }
}
