package com.kwai.nearby.local.HomeLocalFragment;
import nd7.a;
import eb5.g;
import dd5.k;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import mrd.a;
import ld7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.action.RealActionBizType;
import vc7.j0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.delegate.HomeLocalDelegateInterface;
import y8c.t;
import com.kwai.nearby.local.c;
import id7.e;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import dd5.j;
import com.kwai.nearby.local.presenter.b;
import y8c.q;
import rvb.k$a;
import com.yxcorp.gifshow.page.cost.PageStageConfig;
import rvb.k;
import java.lang.Throwable;
import qb5.e;
import qb5.d;
import wkd.b;
import gb5.a;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import cb5.u;
import vc7.a;
import z1.a;
import rkd.b;
import com.kwai.nearby.local.presenter.d;
import com.kwai.nearby.local.presenter.c;
import brd.t;
import eb5.f;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import wa5.e;
import java.lang.CharSequence;
import on5.a;
import crd.b;
import lnc.b9;
import q99.a;
import x99.o;
import dd7.u0;
import dd7.h1;
import tw5.c;
import dd7.q0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.nearby.local.utils.d;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ld7.e;
import com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import y99.i;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.utility.TextUtils;
import dsb.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.nearby.local.speed.a;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import nd7.j;
import com.kwai.sdk.switchconfig.a;
import frb.a;
import trb.b;
import vrb.a;
import tkd.b;
import tkd.d;
import vw5.f;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kwai.nearby.local.utils.LaunchStyle;
import wq6.d;
import wq6.k;
import androidx.recyclerview.widget.RecyclerView;
import db5.c;
import androidx.recyclerview.widget.RecyclerView$r;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import xa5.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import db5.d;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.content.res.Resources;
import vc7.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import nd7.b;
import android.content.Context;
import o56.f;
import nd7.c;
import java.lang.Runnable;
import nd7.e;
import nd7.g;
import nd7.i;
import nd7.d;
import nd7.f;
import nd7.h;
import na5.e;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import na5.a;
import com.kwai.component.feedsmonitor.FeedMonitor$b;
import com.kwai.component.feedsmonitor.FeedMonitor;
import com.kwai.component.feedsmonitor.f;
import com.kwai.component.feedsmonitor.pool.FeedPoolLifecycle;
import vc7.b;
import com.kwai.component.feedsmonitor.report.FeedReportSingleLoadLifecycle;
import jb5.d;
import qvb.i;
import com.kwai.component.feedsmonitor.report.FeedReportLifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.System;
import trb.a;
import p96.a;
import q87.c;
import qrd.p;
import android.os.MessageQueue;
import android.os.Looper;
import com.kwai.nearby.local.a;
import android.os.MessageQueue$IdleHandler;
import com.kwai.nearby.local.trace.NearbyPageCostHelper;
import com.kwai.nearby.local.view.NearbyPageCostContainer;
import t45.d;
import brd.z;
import kd7.a;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;
import kd7.d;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout$a;
import kd7.f;
import com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolPastRecord;
import java.lang.reflect.Type;
import frb.c;
import vc7.r;
import ld7.c;
import java.lang.StringBuilder;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;
import lnc.a1;
import java.lang.Double;
import android.text.TextUtils;
import lrb.a;
import com.kwai.component.homepage_interface.fragment.LazyLoadFragmentContainer;
import ro5.d0;
import dsb.e;
import ro5.e0;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import sc7.b0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import qvb.n0$a;
import sc7.w;
import sc7.a0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import yc7.d;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.nearby.local.delegate.ActivityLocalDelegate;
import com.kwai.nearby.local.delegate.HomeLocalDelegate;
import com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import dd7.e;
import com.kwai.component.feedsmonitor.pool.a;
import id7.l0;
import com.yxcorp.gifshow.model.LivePlayConfig;
import kn4.a;
import com.kwai.nearby.local.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import fa5.e;
import vc7.d;
import com.kwai.nearby.local.utils.a;
import com.yxcorp.utility.SystemUtil;
import xf6.d;
import xf6.l;
import e17.i;
import ed5.e;
import o56.c;
import o56.a;
import android.app.Application;
import ekd.p0;
import oh5.a;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import vc7.e;
import vc7.f;
import g9c.a;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$Stage;
import vc7.e0;
import a9c.e;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.kwai.nearby.local.HomeLocalFragment$a;
import ha5.e;
import ab5.a;
import em6.a;
import vm5.o;
import uh5.e;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.nearby.local.HomeLocalFragment$2;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import qvb.n0;
import ga5.e;
import yv8.c;
import vc7.d0;
import za5.a;
import com.kwai.nearby.local.trace.a;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import ok.h;

public class HomeLocalFragment extends HomeItemFragment implements a, g, k	// class@000f7b
{
    public int R;
    public a S;
    public CardStyle T;
    public boolean U;
    public NearbyPageCostHelper U0;
    public e V;
    public NearbyZeroPlayTraceHelper V0;
    public a W;
    public j0 W0;
    public c X;
    public CustomRecyclerView X0;
    public boolean Y;
    public HomeLocalDelegateInterface Y0;
    public a Z;
    public f Z0;
    public a a1;
    public b0 b1;
    public b c1;
    public b d1;
    public b e1;
    public boolean f1;
    public j g1;
    public static final int h1;

    public void HomeLocalFragment(){
       super();
       this.R = 1;
       this.S = a.g();
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): QCurrentUser.ME.isLogined();
       this.U = b;
       this.X = RealActionBizType.LOCAL;
       this.W0 = new j0();
       return;
    }
    public PresenterV2 Bd(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, HomeLocalFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       if (this.ci()) {
          this.Zh(obj);
       }
       this.Y0.createLazyPresenterExtra(obj);
       PatchProxy.onMethodExit(HomeLocalFragment.class, "34");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this, this.V.e.getType(), this.V.i);
    }
    public boolean D5(){
       return j.a(this);
    }
    public void Hh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalFragment.class, "20")) {
          return;
       }
       p0.U7(new b(this));
       PatchProxy.onMethodExit(HomeLocalFragment.class, "20");
       return;
    }
    public k$a I0(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PageStageConfig.a()) {
          return k.c;
       }
       return null;
    }
    public void Jc(boolean p0,boolean p1,Throwable p2){
       d.a(this, p0, p1, p2);
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(HomeLocalFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, HomeLocalFragment.class, "17")) {
          return;
       }
       super.M1(p0, p1);
       b.a(0x8708467).g("localLoad", false);
       return;
    }
    public PresenterV2 Mh(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeLocalFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = LocalConfigKeyHelper.k();
       boolean b = false;
       a uoa = 3;
       boolean b1 = (i == uoa || i == 1)? true: false;
       if (i == uoa || i == 2) {
          b = true;
       }
       PatchProxy.onMethodExit(HomeLocalFragment.class, "25");
       return new u(true, b1, new a(this, b));
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "37")) {
          return;
       }
       a.a();
       return;
    }
    public PresenterV2 Nh(){
       d obj = PatchProxy.applyWithListener(null, this, HomeLocalFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.g()) {
          obj = new d();
          this.O = obj;
          PatchProxy.onMethodExit(HomeLocalFragment.class, "19");
          return obj;
       }else if(this.ci()){
          PatchProxy.onMethodExit(HomeLocalFragment.class, "19");
          return new PresenterV2();
       }else {
          PatchProxy.onMethodExit(HomeLocalFragment.class, "19");
          return new c();
       }
    }
    public void Oh(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "21")) {
          return;
       }
       super.Oh();
       if (this.ci()) {
          return;
       }
       this.Zh(this.I);
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public String Sh(){
       return "HomeLocalFragment";
    }
    public TabIdentifier Ua(){
       return b.d;
    }
    public boolean Vh(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o() != null) {
          return (e.a()).contains(this.o());
       }
       return false;
    }
    public boolean X0(){
       return false;
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(this.Ua());
    }
    public boolean Xh(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = LocalConfigKeyHelper.k();
       boolean b = false;
       i = (i == 3 || i == 1)? true: false;
       if (!i && !LocalConfigKeyHelper.d()) {
          b = true;
       }
       return b;
    }
    public final void Yh(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "4")) {
          return;
       }
       HomeLocalFragment te1 = this.e1;
       if (te1 != null) {
          b9.a(te1);
          this.e1 = null;
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(HomeLocalFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeLocalFragment.class, "15")) {
          return;
       }
       super.Z1(p0, p1);
       b.a(0x8708467).E("localLoad");
       return;
    }
    public final void Zh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalFragment.class, "22")) {
          return;
       }
       HomeLocalFragment tW = this.W;
       if (tW != null && tW.n != null) {
          p0.U7(new o());
       }
       p0.U7(new u0());
       p0.U7(new h1());
       if (b.a(-1465117531).a()) {
          p0.U7(new q0());
       }
       this.Y0.createItemPresenterExtra(p0);
       PatchProxy.onMethodExit(HomeLocalFragment.class, "22");
       return;
    }
    public RecyclerFragment a1(){
       return this;
    }
    public LocalDelegateType ai(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.d(this.getArguments())) {
          return LocalDelegateType.ACTIVITY_LOCAL;
       }
       return LocalDelegateType.HOME_LOCAL;
    }
    public void b2(int p0){
       if (PatchProxy.isSupport(HomeLocalFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HomeLocalFragment.class, "52")) {
          return;
       }
       super.b2(p0);
       if (!PatchProxy.applyVoid(null, null, e.class, "3")) {
          NearbyLiveCachePoolConfig nearbyLiveCa = LocalConfigKeyHelper.h();
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("visibleLiveEndStrategy", Integer.valueOf(nearbyLiveCa.visibleLiveEndStrategy));
          jsonObject.a0("notShowLiveEndStrategy", Integer.valueOf(nearbyLiveCa.notShowLiveEndStrategy));
          String str = jsonObject.toString();
          e.a("local_live_optimize_enter_page", str);
       }
       return;
    }
    public t bi(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.sh();
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "44")) {
          return;
       }
       super.c0();
       this.W.d.d(false);
       return;
    }
    public boolean ci(){
       return this.Y;
    }
    public void createPreLoadPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeLocalFragment.class, "35")) {
          return;
       }
       this.Y0.createPreLoadPresenter(p0);
       PatchProxy.onMethodExit(HomeLocalFragment.class, "35");
       return;
    }
    public final void di(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalFragment.class, "48")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!TextUtils.x(x0.a(p0.getData(), "nearbyVisitedSource"))) {
          d.b(4096);
          if (!PatchProxy.applyVoid(null, null, d.class, "9")) {
             d.e.c();
          }
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj1;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HomeLocalFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.a(-1360575218);
       int layoutResId = this.getLayoutResId();
       Objects.requireNonNull(obj);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(layoutResId), obj, uoa, "35");
          if (obj1 != patchProxyRe) {
          }else if(PatchProxy.isSupport(uoa)){
             Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(layoutResId), obj, uoa, "16");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }
          }
          List list = obj.a.get(Integer.valueOf(layoutResId));
          list = (list == null || list.isEmpty())? 0: list.remove(0);
          obj1 = list;
       }else {
          goto label_003a ;
       }
       if (obj1 != null) {
          return obj1;
       }else {
          return super.eh(p0, p1, p2);
       }
    }
    public int f(){
       return 9;
    }
    public void fh(View p0,Bundle p1){
       FragmentActivity obj;
       boolean b;
       boolean i1;
       NearbyCachePoolPastRecord nearbyCacheP;
       a obj1;
       a uoa = a.class;
       j oj = j.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeLocalFragment.class, "9")) {
          return;
       }
       this.f1 = true;
       String str = "10";
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, HomeLocalFragment.class, str) && a.t().d("localApmSampleRate", i)) {
          i1 = b.a(-1360575218).f();
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("useCache", String.valueOf(i1));
          if (!i1) {
             a uoa2 = b.a(-1360575218);
             Objects.requireNonNull(uoa2);
             if (!PatchProxy.applyVoidOneRefs(jsonObject, uoa2, uoa, "23")) {
                jsonObject.c0("isUseCache", String.valueOf(uoa2.l));
                boolean b1 = (uoa2.f == null || uoa2.f.a() == null)? true: false;
                jsonObject.c0("netDataObservable", String.valueOf(b1));
                i1 = (uoa2.t == null)? true: false;
                jsonObject.c0("cacheResponse", String.valueOf(i1));
             }
          }
          b.a("localCacheUseResult", jsonObject.toString());
       }
       if (!PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "11") && a.a()) {
          d.a(0x54358588).SB();
          d.a(0x54358588).C2(this, this.ai());
       }
       FragmentActivity activity = this.getActivity();
       Intent intent = activity.getIntent();
       if (d.e(activity)) {
          obj = PatchProxy.applyOneRefs(activity, null, d.class, str);
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(activity.getIntent() == null){
             Uri data = activity.getIntent().getData();
             if (data != null && data.isHierarchical()) {
                b = ("cold").equals(data.getQueryParameter("launchStyle"));
             }
          }
          b = false;
          if (b) {
             this.W0.a(activity, LaunchStyle.COLD);
          }else {
             this.W0.a(activity, LaunchStyle.HOT);
          }
          intent.putExtra("isLoaded", true);
       }
       this.di(intent);
       this.V = this.Y0.buildTabCallerContext();
       this.Y0.initHeaderView(p0);
       super.fh(p0, p1);
       this.z5();
       this.h0().addOnScrollListener(c.b);
       this.X0 = m1.f(p0, 0x7f0a34da);
       if (!PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "30")) {
          if (a.h(this)) {
             d.a(this, this.T.mBottomType, true);
          }else if(CardStyle.isV4Bottom(this.T.mBottomType)){
             d.a(this, this.T.mBottomType, true);
          }else {
             this.Ac().setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f06008d));
          }
       }
       HomeLocalFragment tV = this.V;
       if (tV != null) {
          this.c1 = tV.l.subscribe(new c(this), Functions.e);
       }
       j oj1 = new j(this);
       this.g1 = oj1;
       i1 = this.ci() ^ true;
       Objects.requireNonNull(oj1);
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i1), oj1, oj, "1")) {
          oj1.f = oj1.e.Vg().i().subscribe(new b(oj1, i1), Functions.d());
       }
       String str1 = "3";
       if (!this.ci()) {
          tV = this.g1;
          obj = this.getActivity();
          Objects.requireNonNull(tV);
          if (!PatchProxy.applyVoidOneRefs(obj, tV, oj, "2")) {
             obj1 = b.a(-1360575218);
             if (f.b(obj)) {
                obj1.n(new c(obj1, obj));
             }
             obj1.n(new e(tV));
             obj1.n(new g(tV));
          }
       }else {
          tV = this.g1;
          obj = this.getActivity();
          Objects.requireNonNull(tV);
          if (!PatchProxy.applyVoidOneRefs(obj, tV, oj, str1)) {
             tV.l = true;
             obj1 = b.a(-1360575218);
             obj1.n(new i(tV, obj, obj1));
             obj1.n(new d(tV));
             obj1.n(new f(tV));
             obj1.n(new h(tV));
          }
       }
       new e(FpsSocialBizType.LOCAL, "NEARBY_HOME", this, this.h0()).a();
       FeedMonitor$b uob = FeedMonitor.b("NEARBY");
       uob.b(this.Z0);
       uob.c(this.a1);
       uob.f = new b(this);
       uob.d(new FeedReportSingleLoadLifecycle(this.Qh(), this));
       uob.a().d(this);
       a.d = System.currentTimeMillis();
       Object[] objArray = new Object[i];
       a.C().w("ks.location.log:Local", "[doInitAfterViewCreated] page Start Time", objArray);
       String str2 = "13";
       if (!PatchProxy.applyVoid(null, this, HomeLocalFragment.class, str2)) {
          Boolean uBoolean = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, str2);
          if (uBoolean == patchProxyRe) {
             uBoolean = LocalConfigKeyHelper.m.getValue();
          }
          if (uBoolean.booleanValue()) {
             Looper.myQueue().addIdleHandler(a.a);
          }
       }
       tV = this.U0;
       Objects.requireNonNull(tV);
       if (!PatchProxy.applyVoidOneRefs(p0, tV, NearbyPageCostHelper.class, str1) && p0 instanceof NearbyPageCostContainer) {
          obj1 = p0;
          t ot = PatchProxy.apply(null, obj1, NearbyPageCostContainer.class, "1");
          if (ot != patchProxyRe) {
          }else {
             ot = obj1.c.hide();
          }
          tV.f = ot.observeOn(d.a).subscribe(new a(tV), Functions.e);
       }
       tV = this.V0;
       e g = this.V.g;
       Objects.requireNonNull(tV);
       if (!PatchProxy.applyVoidTwoRefs(p0, g, tV, NearbyZeroPlayTraceHelper.class, "1")) {
          tV.h = true;
          m1.f(p0, R.id.cliplayout).setOnOffsetChangedListener(new d(tV));
          tV.e = g.hide().observeOn(d.a).subscribe(new f(tV), Functions.e);
       }
       a uoa1 = b.a(-1360575218);
       Objects.requireNonNull(uoa1);
       if (!PatchProxy.applyVoid(null, uoa1, uoa, "32")) {
          if (uoa1.u == null) {
             nearbyCacheP = c.a(NearbyCachePoolPastRecord.class);
             uoa1.u = nearbyCacheP;
             if (nearbyCacheP == null) {
                uoa1.u = new NearbyCachePoolPastRecord(0, 0);
             }
          }
          nearbyCacheP.mLastEnterLocal = System.currentTimeMillis();
          uoa1.o();
       }
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.f()) {
          return 0x7f0d15f6;
       }
       return 0x7f0d04cd;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeLocalFragment.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HomeLocalFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HomeLocalFragment.class, new r());
       }else {
          obj.put(HomeLocalFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 15;
    }
    public String getPageParams(){
       CityInfo uCityInfo;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       StringBuilder obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "32");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "";
       HomeLocalFragment tV = this.V;
       if (tV != null) {
          e e = tV.e;
          if (e != null) {
             uCityInfo = e.d();
          label_0025 :
             StringBuilder obj1 = PatchProxy.applyOneRefs(uCityInfo, null, d.class, "5");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = PatchProxy.applyOneRefs(uCityInfo, null, uoc, "1");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = "";
                   String str1 = "tab_city_name";
                   if (a.i(uCityInfo) || a.a(uCityInfo)) {
                      c.a(obj1, "is_nearby", Integer.valueOf(1));
                      c.a(obj1, str1, a1.p(R.string.arg_RES_7f102f5f));
                   }else {
                      c.a(obj1, "is_nearby", Integer.valueOf(0));
                      c.a(obj1, str1, uCityInfo.mCityName);
                   }
                   c.a(obj1, "tab_pos", "TOP");
                   if (uCityInfo != null) {
                      c.a(obj1, "city", uCityInfo.mCityName);
                      c.a(obj1, "latitude", Double.valueOf(uCityInfo.mLatitude));
                      c.a(obj1, "longitude", Double.valueOf(uCityInfo.mLongitude));
                      if (!TextUtils.isEmpty(uCityInfo.mProvince)) {
                         c.a(obj1, "tab_province_name", uCityInfo.mProvince);
                      }
                   }
                   uCityInfo = a.h();
                   if (uCityInfo != null) {
                      c.a(obj1, "local_province_name", uCityInfo.mProvince);
                      c.a(obj1, "local_city_name", uCityInfo.mCityName);
                   }
                   obj1 = obj1;
                }
             }
             obj = obj+obj1;
             Fragment parentFragme = this.getParentFragment();
             if (parentFragme instanceof LazyLoadFragmentContainer) {
                parentFragme.getParentFragment();
             }
             if (a.d(this)) {
                d0.o0(this.getActivity(), "local", obj);
             }
             boolean b = d.d(this.getArguments());
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(b), null, uoc, "2")) {
                obj = obj+"&"+"nearby_page_type=";
                str = (b)? "ALONE_PAGE": "TAB";
                obj = obj+str;
             }
             if (!PatchProxy.applyVoidOneRefs(obj, null, uoc, "4")) {
                str = PatchProxy.apply(null, null, d.class, "12");
                if (str != patchProxyRe) {
                }else if(d.d){
                   d.a = d.f();
                }
                str = "&nearby_session_id="+d.g()+"&"+"nearby_visited_source"+"="+d.h();
                obj = obj+str;
             }
             if (!PatchProxy.applyVoidOneRefs(obj, null, uoc, "5")) {
                c.a(obj, "list_type", "DOUBLE");
             }
             e0.b(this, obj);
             return obj;
          }
       }
       uCityInfo = null;
       goto label_0025 ;
    }
    public List h(){
       Object[] obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this,this.H,new c("FRAGMENT", this)};
       return Lists.e(obj);
    }
    public void hg(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLocalFragment.class, "36")) {
          return;
       }
       HomeLocalFragment tb1 = this.b1;
       if (tb1 != null) {
          Objects.requireNonNull(tb1);
          if (!PatchProxy.applyVoid(objArray, tb1, b0.class, "41") && tb1.R.f()) {
             HomeFeedResponse homeFeedResp = tb1.R.i();
             if (homeFeedResp != null) {
                tb1.U0 = true;
                t.just(new n0$a(homeFeedResp, false, true)).subscribe(new w(tb1), new a0(tb1));
             }
          }
       }
       return;
    }
    public boolean i8(){
       return true;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "23")) {
          return;
       }
       if (this.f1 == null) {
          this.Y = true;
          super.ih();
       }
       return;
    }
    public boolean kf(){
       return f.a(this);
    }
    public void l8(){
       d.b(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       return "NEARBY";
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.o3();
    }
    public void onCreate(Bundle p0){
       ActivityLocalDelegate uActivityLoc;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalFragment.class, str)) {
          return;
       }
       d uod = d.class;
       Serializable serializable = PatchProxy.applyOneRefs(this, null, uod, str);
       if (serializable != patchProxyRe) {
       }else if(this.getArguments() != null){
          serializable = SerializableHook.getSerializable(this.getArguments(), "key_local_delegate");
          if (serializable instanceof HomeLocalDelegateInterface) {
          label_005f :
             serializable.setOwner(this);
          }else {
             str = this.getArguments().getString("key_home_local_page_source");
             uActivityLoc = PatchProxy.applyOneRefs(str, null, uod, "2");
             if (uActivityLoc != patchProxyRe) {
             }else if(("activity_local").equals(str)){
                uActivityLoc = new ActivityLocalDelegate();
             }else {
                uActivityLoc = new HomeLocalDelegate();
             }
          }
       }else {
          uActivityLoc = new HomeLocalDelegate();
       }
       serializable = uActivityLoc;
       goto label_005f ;
       this.Y0 = serializable;
       b.a(0x8708467).a("localInit");
       this.U0 = new NearbyPageCostHelper(this, PageStageConfig.a());
       this.V0 = new NearbyZeroPlayTraceHelper(this);
       super.onCreate(p0);
       this.T = e.g(this);
       this.Z0 = new f();
       this.a1 = new a();
       this.W = new l0(this, a.b(LivePlayConfig.class), 5);
       Boolean uBoolean = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "27");
       if (uBoolean == patchProxyRe) {
          uBoolean = LocalConfigKeyHelper.A.getValue();
       }
       if (uBoolean.booleanValue()) {
          uBoolean.t = b.a;
       }
       if (!PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "3") && this.e1 == null) {
          this.e1 = RxBus.f.f(e.class).subscribe(new d(this));
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "45")) {
          return;
       }
       super.onDestroy();
       HomeLocalFragment tW = this.W;
       if (tW != null) {
          tW.a();
       }
       b9.a(this.c1);
       b9.a(this.d1);
       this.Yh();
       tW = this.Z;
       if (tW != null) {
          tW.d = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "46")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onPause(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLocalFragment.class, "42")) {
          return;
       }
       super.onPause();
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, "4") && (SystemUtil.K() && l.c("key_show_toast_last_location_city", false))) {
          CityInfo uCityInfo = a.h();
          if (uCityInfo != null && !TextUtils.isEmpty(uCityInfo.mCityName)) {
             i.d(R.style.arg_RES_7f11066a, uCityInfo.mCityName);
          }
       }
    label_0043 :
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "14")) {
          return;
       }
       super.onResume();
       b.a(0x8708467).z("localInit");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeLocalFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       HomeLocalFragment tU0 = this.U0;
       Objects.requireNonNull(tU0);
       if (!PatchProxy.applyVoid(null, tU0, NearbyPageCostHelper.class, "2")) {
          tU0.l = System.currentTimeMillis();
          tU0.a();
       }
       return;
    }
    public e qe(){
       return j.b(this);
    }
    public List r1(){
       return null;
    }
    public boolean r4(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.r4();
       if (!p0.C(a.a().a())) {
          new a("RefreshLayoutViewP").a(R.string.arg_RES_7f1038e7, "NoNetwork");
          this.s.setRefreshing(false);
       }
       return true;
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(HomeLocalFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeLocalFragment.class, "41")) {
          return;
       }
       if (!p0) {
          if (!this.h0().isComputingLayout()) {
             this.g7().k0();
             this.X0.post(new e(this));
          }else {
             this.X0.post(new f(this));
          }
       }
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, HomeLocalFragment.class, "12")) {
          return;
       }
       super.th();
       this.Z = new a(this, this.h0());
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLocalFragment.class, "43")) {
          return;
       }
       super.u();
       if (this.ci() && (this.g7() != null && (!this.g7().R0() && this.b1.V0 == null))) {
          HomeItemFragment tG = this.G;
          if (tG != null) {
             tG.f(RefreshType.INIT);
          }
       }
    label_0034 :
       this.W.d.d(true);
       HomeLocalFragment tV0 = this.V0;
       Objects.requireNonNull(tV0);
       if (!PatchProxy.applyVoid(objArray, tV0, NearbyZeroPlayTraceHelper.class, "4")) {
          tV0.a(NearbyZeroPlayTraceHelper$Stage.ENTER);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(HomeLocalFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeLocalFragment.class, "16")) {
          return;
       }
       super.v2(p0, p1);
       b.a(0x8708467).g("localLoad", p1);
       return;
    }
    public g vh(){
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e0 obj = PatchProxy.apply(objArray, this, HomeLocalFragment.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray1 = new Object[]{this.W};
       obj = new e0(this.Ua(), this, this.F, objArray1);
       obj.x1(this.T);
       obj.z1(new f(this));
       obj.y1(new HomeLocalFragment$a(this));
       e e = this.V.e;
       if (!PatchProxy.applyVoidOneRefs(e, obj, e0.class, "3")) {
          obj.n1("local_current_city", e);
          if (e != null) {
             obj.n1("LOCAL_CURRENT_CITY_TYPE_VALUE", e.getTypeValue());
          }
       }
       HomeLocalFragment tV = this.V;
       e = (tV != null)? tV.j: objArray;
       obj.n1("SOCIAL_ACCESS_IDSlocal_page_from_source_data", e);
       obj.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.H.k);
       Boolean tRUE = Boolean.TRUE;
       obj.n1("LOCAL_CLICK_TO_NASA_SLIDE_PLAY", tRUE);
       obj.n1("LOCAL_CLICK_NEBULA_TO_NASA_SLIDE_PLAY", Boolean.FALSE);
       obj.n1("HOME_SHOW_RIGHT_BOTTOM_TAG_IMMEDIATELY", tRUE);
       obj.n1("PAGE_NAME", a1.p(R.string.arg_RES_7f102f5f));
       obj.n1("REDESIGN_PAGE", e.i(this));
       obj.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.H.l));
       if (!PatchProxy.applyVoidOneRefs(obj, this, HomeLocalFragment.class, "31")) {
          obj.n1("PHOTO_DETAIL_PARAM_PROCESSOR", d.a(this, this.J));
          boolean b = e.f();
          if (d.a(0xded02ea).PL() || b) {
             Boolean uBoolean = PatchProxy.apply(objArray, objArray, LocalConfigKeyHelper.class, "1");
             if (uBoolean == patchProxyRe) {
                uBoolean = LocalConfigKeyHelper.a.getValue();
             }
             if (uBoolean.booleanValue()) {
                obj.n1("SLIDE_DETAIL_DOUBLE_STREAM", tRUE);
                obj.n1("ENABLE_SLIDE_POSIIION_CHANGE_EVENT", tRUE);
             }
          }
       }
       return obj;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomeLocalFragment$2 u2 = new HomeLocalFragment$2(this, HomeItemFragment.Rh(), 1);
       u2.setGapStrategy(2);
       u2.N(this.h0());
       this.N = u2;
       return u2;
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalFragment.class, "47")) {
          return;
       }
       super.y2(p0);
       if (this.V == null) {
          return;
       }
       this.di(p0);
       this.V.h.onNext(p0);
       if (d.e(this.getActivity())) {
          boolean b = false;
          if (!p0.getBooleanExtra("isLoaded", b)) {
             this.W0.a(this.getActivity(), LaunchStyle.HOT);
             FragmentActivity activity = this.getActivity();
             Object obj = PatchProxy.applyOneRefs(activity, null, d.class, "9");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(activity == null || activity.getIntent() == null){
                Uri data = activity.getIntent().getData();
                if (data != null && data.isHierarchical()) {
                   b = ("1").equals(data.getQueryParameter("isInjectFeed"));
                }
             }
             if (b) {
                this.J3(RefreshType.PROGRAM);
                this.N1();
             }
          }
       }
       return;
    }
    public boolean yf(){
       Object obj = PatchProxy.apply(null, this, HomeLocalFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.N1();
       return super.yf();
    }
    public i yh(){
       HomeLocalFragment homeLocalFra = PatchProxy.apply(null, this, HomeLocalFragment.class, "18");
       if (homeLocalFra != PatchProxyResult.class) {
       }else {
          b0 uob0 = new b0(this.X);
          uob0.C = this.W0;
          uob0.D = this.ai();
          uob0.V = e.e(e.i(this));
          this.b1 = uob0;
          uob0.J = this.Z0;
          uob0.K = this.a1;
          uob0.b3(this.V.c.b());
          if (f.b(this.getActivity())) {
             homeLocalFra = this.b1;
             boolean b = (a.o0(this.getActivity()).q0() != 4)? true: false;
             homeLocalFra.X = b;
          }
          this.Y0.handlePageListExtra(this.b1);
          homeLocalFra = this.U0;
          HomeLocalFragment tb1 = this.b1;
          Objects.requireNonNull(homeLocalFra);
          if (!PatchProxy.applyVoidOneRefs(tb1, homeLocalFra, NearbyPageCostHelper.class, "4")) {
             homeLocalFra.e = b9.c(homeLocalFra.e, new a(homeLocalFra, tb1));
          }
          homeLocalFra = this.b1;
       }
       return homeLocalFra;
    }
}
