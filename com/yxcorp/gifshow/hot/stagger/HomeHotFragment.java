package com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import eb5.g;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import qva.b;
import com.yxcorp.gifshow.action.RealActionBizType;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;
import e50.g;
import com.kuaishou.eve.kit.rerank.BizPage;
import ff6.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sva.e;
import jb5.d;
import qvb.i;
import rvb.k$a;
import rvb.k;
import com.yxcorp.gifshow.refresh.RefreshType;
import hn5.f;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy;
import java.lang.Throwable;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import wkd.b;
import gb5.a;
import com.kwai.component.homepage_interface.homedata.FindReFreshGuideConfigModel;
import wa5.e;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeHotRefreshTipButtonPresenter;
import qva.c;
import q87.c;
import sva.n;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeFindRefreshPresenter;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.d;
import sva.m;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import sva.c;
import hn5.n;
import hn5.m;
import e50.i;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import tkd.b;
import tkd.d;
import ayb.i;
import androidx.fragment.app.Fragment;
import xa5.a;
import sva.w;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import za5.a;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import sva.b;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import sva.s;
import x99.o;
import sva.d;
import uva.i0;
import cb5.r;
import brd.t;
import eb5.f;
import ova.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.CharSequence;
import on5.a;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomeDataPrefetchLogger;
import java.util.Objects;
import java.lang.Integer;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import java.lang.StringBuilder;
import q99.a;
import y99.i;
import android.view.View;
import android.os.Bundle;
import db5.c;
import androidx.recyclerview.widget.RecyclerView$r;
import kva.b;
import erd.g;
import crd.b;
import com.kwai.component.feedstaggercard.model.CardStyle;
import db5.d;
import com.yxcorp.gifshow.hot.stagger.a;
import hka.i;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import dd5.p;
import dd5.m;
import androidx.lifecycle.LifecycleOwner;
import dd5.b$b;
import dd5.b;
import kva.c;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment$a;
import qvb.q;
import qvb.a;
import yva.c;
import kotlin.jvm.internal.a;
import ea5.d;
import android.app.Activity;
import yva.e;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import yva.d;
import tx4.f;
import com.kuaishou.tk.api.a;
import java.lang.Number;
import kva.n;
import com.kwai.framework.model.user.QCurrentUser;
import ro5.d0;
import ro5.e0;
import com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import pfa.b;
import vva.a;
import ga5.e;
import com.yxcorp.gifshow.model.LivePlayConfig;
import xl8.b;
import on5.f;
import on5.e;
import oe6.e;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import rvb.b;
import rvb.n;
import rvb.c;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.g;
import lva.m;
import a9c.e;
import pa5.n;
import com.kwai.component.photo.reduce.f;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment$b;
import ha5.e;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment$c;
import ab5.a;
import lnc.a1;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import yv8.c;

public class HomeHotFragment extends HomeItemFragment implements g	// class@00189c
{
    public final int R;
    public final b S;
    public final int T;
    public a U;
    public a U0;
    public e V;
    public PublishSubject V0;
    public CardStyle W;
    public final i W0;
    public c X;
    public j Y;
    public b Z;
    public static final int X0;

    public void HomeHotFragment(){
       super();
       this.R = 1;
       this.S = new b();
       this.T = 5;
       this.X = RealActionBizType.HOT;
       this.V0 = PublishSubject.g();
       Boolean uBoolean = PatchProxy.apply(null, null, HotExperimentManager.class, "2");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = HotExperimentManager.b.getValue();
       }
       g og = (uBoolean.booleanValue())? new g(BizPage.MAIN_HOT): new d(BizPage.MAIN_HOT);
       this.W0 = og;
       return;
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeHotFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(HomeHotFragment.class, "15");
       return super.B2();
    }
    public void Hh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeHotFragment.class, "11")) {
          return;
       }
       p0.U7(new e(this, this.Qh()));
       PatchProxy.onMethodExit(HomeHotFragment.class, "11");
       return;
    }
    public k$a I0(){
       return k.m;
    }
    public void J3(RefreshType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotFragment.class, "14")) {
          return;
       }
       if (p0 != RefreshType.INIT && (p0 == RefreshType.RESUME || p0 == RefreshType.FOREGROUND2)) {
          f.b();
       }
       super.J3(p0);
       return;
    }
    public boolean Jh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(null, this, HomeHotFragment.class, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, HotFeedRequestStrategy.class, "1");
       if (obj == patchProxyRe) {
          obj = HotFeedRequestStrategy.a.getValue();
       }
       return (obj.booleanValue() ^ 0x01);
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(HomeHotFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, HomeHotFragment.class, "20")) {
          return;
       }
       super.M1(p0, p1);
       b.a(0x8708467).g("hotLoad", false);
       this.S.a(false, false, this.f());
       return;
    }
    public PresenterV2 Mh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Boolean obj = PatchProxy.applyWithListener(objArray, this, HomeHotFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (e.c().getMCancelAutoRefresh()) {
          PatchProxy.onMethodExit(HomeHotFragment.class, "10");
          return new HomeHotRefreshTipButtonPresenter(HotExperimentManager.b());
       }else {
          obj = PatchProxy.apply(objArray, objArray, HotExperimentManager.class, "10");
          if (obj == patchProxyRe) {
             obj = HotExperimentManager.j.getValue();
          }
          if (!obj.booleanValue()) {
             Object[] objArray1 = new Object[0];
             c.C().s("HomeHotFragment", "使用双列发现页长时间Refresh失败修复兜底开关", objArray1);
             PatchProxy.onMethodExit(HomeHotFragment.class, "10");
             return new n(HotExperimentManager.c(), this.Qh());
          }else {
             PatchProxy.onMethodExit(HomeHotFragment.class, "10");
             return new HomeFindRefreshPresenter(HotExperimentManager.c());
          }
       }
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "13")) {
          return;
       }
       super.N1();
       RxBus.f.b(new d(2));
       return;
    }
    public void Oh(){
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeHotFragment.class, "9")) {
          return;
       }
       super.Oh();
       this.I.U7(new m());
       if (HomePageExperimentManager.a()) {
          this.I.U7(new c());
       }
       this.I.U7(m.a().GW());
       boolean b = true;
       if (this.W0.getPlatform() == b) {
          this.I.U7(new HomeHotEveRankPresenter(this.W0));
       }else {
          this.I.U7(new HomeHotRankPresenter(this.W0));
       }
       d.a(0x4f878389).st(this.I);
       if (a.c(this)) {
          this.I.U7(new w());
       }else {
          Object obj = PatchProxy.applyOneRefs(this, objArray, a.class, "8");
          String str = null;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(!f.b(this.getActivity()) || a.o0(this.requireActivity()).p0() == 2){
             b1 = false;
          }else if(a.i(b.B, this) || a.i(b.D, this)){
             b = false;
          }
          b1 = b;
          if (b1) {
             this.I.U7(new b(this));
          }else {
             this.I.U7(new b(this, str));
          }
       }
       this.I.U7(new HomeItemRecoRealShowPresenter());
       this.I.U7(new i(c.b(), "h"));
       if (HomePageExperimentManager.b()) {
          this.I.U7(new s());
       }
       if (this.U != null) {
          this.I.U7(new o());
       }
       if (e.d() > 0) {
          this.I.U7(new d());
       }
       if (HotExperimentManager.b()) {
          this.I.U7(new i0());
       }
       this.I.U7(new r());
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public String Sh(){
       return "HomeHotFragment";
    }
    public void Th(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "5")) {
          return;
       }
       super.Th();
       this.V = new a(this.h0());
       return;
    }
    public void U0(boolean p0){
       if (PatchProxy.isSupport(HomeHotFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeHotFragment.class, "26")) {
          return;
       }
       if (this.h0() instanceof CustomRecyclerView) {
          this.h0().setCanPullToRefresh(p0);
       }
       return;
    }
    public TabIdentifier Ua(){
       return b.b;
    }
    public boolean Vh(){
       Object obj = PatchProxy.apply(null, this, HomeHotFragment.class, "29");
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
       Object obj = PatchProxy.apply(null, this, HomeHotFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(this.Ua());
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, HomeHotFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(HomeHotFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeHotFragment.class, "17")) {
          return;
       }
       super.Z1(p0, p1);
       b.a(0x8708467).E("hotLoad");
       int i = 3;
       if (!HomeDataPrefetchLogger.c(i)) {
          HomeDataPrefetchLogger.i(i);
       }
       HomeHotFragment tS = this.S;
       int i1 = this.f();
       RefreshType refreshType = this.Qh().x2();
       Objects.requireNonNull(tS);
       String str = "refresh";
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(i1), refreshType, tS, b.class, "1")) {
          tS.d = tS.d + 1;
          tS.b = false;
          tS.a.put("startTimestamp", Long.valueOf(System.currentTimeMillis()));
          b a = tS.a;
          String str2 = (p0)? str: "loadMore";
          a.put("refreshType", str2);
          a = tS.a;
          String str3 = (i1 != 8)? "unknown": "hot";
          a.put("page", str3);
          if (refreshType != null) {
             tS.a.put("refreshSource", refreshType.refreshTypeToRefreshSource());
          }
          tS.a.put("index", Integer.valueOf(tS.d));
       }
       StringBuilder str1 = "onStartLoading"+",firstPage="+p0+",refreshType=";
       if (!p0) {
          str = "loadMore";
       }
       str1 = str1+str;
       if (this.Qh().x2() != null) {
          str1 = str1+",refreshSource="+this.Qh().x2().refreshTypeToRefreshSource();
       }
       Object[] objArray = new Object[0];
       c.C().w("HomeHotFragment", str1, objArray);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "16")) {
          return;
       }
       super.a();
       this.S.c("item_refresh");
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "28")) {
          return;
       }
       super.c0();
       HomeHotFragment tU = this.U;
       if (tU != null) {
          tU.d.d(false);
       }
       return;
    }
    public int f(){
       return 8;
    }
    public void fh(View p0,Bundle p1){
       boolean b;
       HotExperimentManager hotExperimen = HotExperimentManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeHotFragment.class, "4")) {
          return;
       }
       super.fh(p0, p1);
       this.h0().addOnScrollListener(c.b);
       HomeHotFragment tS = this.S;
       Objects.requireNonNull(tS);
       this.n1().subscribe(new b(tS));
       this.S.b(this.K0());
       if (HotExperimentManager.b()) {
          d.a(this, this.W.mBottomType, false);
       }else if(a.h(this)){
          d.a(this, this.W.mBottomType, true);
       }
       HomeItemFragment tG = this.G;
       if (tG != null) {
          tG.s6(a.b);
       }
       RecyclerView recyclerView = this.h0();
       if (!PatchProxy.applyVoidOneRefs(recyclerView, this, HomeHotFragment.class, "25")) {
          Fragment parentFragme = this.getParentFragment();
          m om = PatchProxy.applyOneRefs(parentFragme, null, p.class, "3");
          if (om != patchProxyRe) {
          }else {
             om = m.f(parentFragme, "find");
          }
          b$b uob = new b$b();
          uob.b(false);
          om.j(uob.a(), this);
          recyclerView.addOnScrollListener(new c(this, om));
       }
       this.Qh().h(new HomeHotFragment$a(this));
       if (this.getActivity() != null) {
          Boolean uBoolean = PatchProxy.apply(null, null, hotExperimen, "8");
          if (uBoolean == patchProxyRe) {
             uBoolean = HotExperimentManager.h.getValue();
          }
          if (uBoolean.booleanValue()) {
             FragmentActivity activity = this.getActivity();
             c uoc = c.class;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(8), null, uoc, "1")) {
                a.p(activity, "activity");
                b.a(0x15ea63e).a(activity, 8);
             }
          }
       }
    label_00f0 :
       if (!PatchProxy.applyVoid(null, null, e.class, "1")) {
          Map map = PatchProxy.apply(null, null, hotExperimen, "9");
          if (map == patchProxyRe) {
             map = HotExperimentManager.i.getValue();
          }
          b = (map == null || map.isEmpty())? true: false;
          if (!b) {
             List list = map.get("find");
             b = (list == null || list.isEmpty())? true: false;
             if (!b) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   a.a(str, false, true, new d(str));
                }
             }
          }
       }
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, HomeHotFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (HotExperimentManager.b()) {
          return 0x7f0d05db;
       }
       if (a.c(this)) {
          return 0x7f0d104b;
       }
       return super.getLayoutResId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeHotFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HomeHotFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HomeHotFragment.class, new n());
       }else {
          obj.put(HomeHotFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, HomeHotFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (QCurrentUser.ME.isLogined()) {
          return 3;
       }
       return 1;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, HomeHotFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.h(this)) {
          return super.getPageParams();
       }
       obj = "";
       d0.o0(this.getActivity(), "hot", obj);
       return e0.b(this, obj);
    }
    public boolean kf(){
       return f.a(this);
    }
    public boolean lh(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotFragment.class, "1")) {
          return;
       }
       b.a(0x8708467).a("hotInit");
       super.onCreate(p0);
       this.Z = new b(this);
       this.U0 = new a();
       this.W = e.a("h");
       this.U = new a(this, null, 3);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "30")) {
          return;
       }
       super.onDestroy();
       HomeHotFragment tU = this.U;
       if (tU != null) {
          tU.a();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "2")) {
          return;
       }
       super.onResume();
       b.a(0x8708467).z("hotInit");
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, HomeHotFragment.class, "27")) {
          return;
       }
       super.u();
       HomeHotFragment tU = this.U;
       if (tU != null) {
          tU.d.d(true);
       }
       return;
    }
    public boolean u0(boolean p0){
       b obj;
       if (PatchProxy.isSupport(HomeHotFragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, HomeHotFragment.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.Z.b()) {
          this.Z.h(true);
          return true;
       }else if(this.Z.c()){
          this.Z.g(true);
          HomeHotFragment tZ = this.Z;
          Objects.requireNonNull(tZ);
          obj = b.class;
          if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tZ, obj, "6")) {
             tZ.b.d(Boolean.FALSE);
          }
          return true;
       }else {
          return e.c(this, p0);
       }
    }
    public void v2(boolean p0,boolean p1){
       boolean b;
       if (PatchProxy.isSupport(HomeHotFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeHotFragment.class, "18")) {
          return;
       }
       super.v2(p0, p1);
       e.k0("");
       b.a(0x8708467).g("hotLoad", p1);
       this.S.a(p1, true, this.f());
       HomeFeedResponse homeFeedResp = this.Qh().L0();
       if (p0) {
          k$a m = k.m;
          n.a(m).h("isFindCache", String.valueOf(p1));
          if (homeFeedResp != null) {
             b uob = n.a(m);
             b = (homeFeedResp.mLocalRequestSource == true)? true: false;
             uob.h("isFindPreload", String.valueOf(b));
          }
       }
       int i = 3;
       if (HomeDataPrefetchLogger.c(i) && !HomeDataPrefetchLogger.b(i)) {
          HomeDataPrefetchLogger.h(i);
       }
       String str = "HomeHotFragment";
       if (homeFeedResp == null) {
          Object[] objArray = new Object[0];
          c.C().w(str, "response is null", objArray);
       }else {
          c uoc = c.C();
          StringBuilder str1 = "onFinishLoading"+",firstPage="+p0+",llsid="+homeFeedResp.mLlsid+",photoSize=";
          HomeFeedResponse mQPhotos = homeFeedResp.mQPhotos;
          String str2 = (mQPhotos != null)? String.valueOf(mQPhotos.size()): "empty";
          Object[] objArray1 = new Object[0];
          uoc.w(str, str1+str2+",hasMore="+homeFeedResp.hasMore(), objArray1);
       }
       if (!PatchProxy.isSupport(HomeHotFragment.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeHotFragment.class, "19")) {
          RefreshLayout refreshLayou = this.Ac();
          if (HotExperimentManager.a() && (p0 && refreshLayou != null)) {
             if (p1) {
                refreshLayou.setRefreshing(true);
             }else {
                refreshLayou.setRefreshing(0);
             }
          }
       }
       return;
    }
    public g vh(){
       m obj = PatchProxy.apply(null, this, HomeHotFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.U};
       obj = new m(this.Ua(), this.F, objArray);
       obj.x1(this.W);
       obj.z1(new f(this));
       obj.y1(new HomeHotFragment$b(this));
       obj.n1("PHOTO_DETAIL_PARAM_PROCESSOR", new HomeHotFragment$c(this));
       obj.n1("HOME_RECYCLE_VIEW_SCROLL_STATE", this.H.k);
       Boolean tRUE = Boolean.TRUE;
       obj.n1("HOT_LIVE_CLICK_TO_SLIDE_PLAY", tRUE);
       obj.n1("HOT_CLICK_TO_NASA_SLIDE_PLAY", tRUE);
       obj.n1("PAGE_NAME", a1.p(R.string.arg_RES_7f10155f));
       obj.n1("HOME_COVER_ENABLE_MIN_ASPECTIO", tRUE);
       obj.n1("REDESIGN_PAGE", "h");
       obj.n1("RECYCLERVIEW_LAYOUT_COMPLETE", Boolean.valueOf(this.H.l));
       obj.n1("HOT_ITEM_REAL_ACTION_OBSERVER", this.V0);
       return obj;
    }
    public i yh(){
       j obj = PatchProxy.apply(null, this, HomeHotFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j(this.getPage(), this.W0, this.X, false);
       this.Y = obj;
       return obj;
    }
}
