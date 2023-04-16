package com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment;
import iea.e;
import hf5.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.content.Intent;
import wkd.b;
import nda.a;
import androidx.fragment.app.FragmentActivity;
import lda.d;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.featured.detail.featured.t;
import c95.c;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xea.h;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.e;
import com.kwai.sdk.switchconfig.a;
import iea.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import vda.c;
import e50.i;
import cea.f;
import e50.g;
import cea.l;
import ff6.d;
import iea.d;
import zda.m;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import qrd.p;
import zda.i0;
import m9a.b;
import com.yxcorp.gifshow.detail.model.BackFreshStartUpParams;
import m9a.a;
import java.lang.reflect.Type;
import el.a;
import uw9.c;
import zda.r0;
import e50.m;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import c5a.i;
import xa5.a;
import zda.w0;
import tda.c;
import z1.a;
import zda.n;
import zf6.k;
import zda.k;
import zda.j1;
import com.yxcorp.gifshow.featured.detail.featured.presenter.p;
import nl9.u;
import ml8.c;
import com.kwai.framework.abtest.f;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin;
import zda.v0;
import ayb.i;
import com.yxcorp.gifshow.detail.slidev2.presenter.i;
import zy5.e;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import com.yxcorp.gifshow.homepage.presenter.q;
import ida.b;
import gx5.b;
import wa5.e;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaLivePhotoDuplicatedPresenter;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import n2a.g;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import zda.t0;
import rkd.b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.f;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import zda.n0;
import qh.h;
import tda.m0;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil;
import zda.f0;
import y4a.m;
import c5a.l;
import yta.o0;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter;
import zda.s0;
import as6.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.i;
import com.yxcorp.gifshow.featured.detail.featured.presenter.j;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import mwa.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.h;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import com.yxcorp.gifshow.featured.detail.featured.presenter.o;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import os5.j;
import ayb.l;
import lea.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import ayb.g;
import wda.k;
import tda.m;
import android.view.View;
import tda.a;
import xf6.d;
import com.kwai.component.homepage_interface.uxmonitor.UxMonitorExpUtil;
import wh5.c;
import o56.a;
import ub5.c;
import android.graphics.Rect;
import ekd.p1;
import lnc.a1;
import tda.b;
import android.view.View$OnLayoutChangeListener;
import tb5.b;
import android.app.Activity;
import tda.d;
import kotlin.jvm.internal.a;
import java.util.List;
import uw9.l0;
import android.os.Bundle;
import gb5.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.util.rx.RxBus;
import gp5.b;
import com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper;
import wq6.d;
import wq6.k;
import yq6.e;
import androidx.lifecycle.Lifecycle;
import do5.a;
import tda.e;
import yq6.a;
import xq6.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import yw6.g;
import v40.a;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import p1b.d;
import com.kuaishou.eve.kit.api.NasaSwitch;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import tda.f;
import xy6.b;
import s1b.b;
import p1b.b;
import java.lang.ref.WeakReference;
import com.yxcorp.utility.SystemUtil;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import gp5.c;
import rda.b;
import rda.a;
import ok.o;
import bf5.e;
import tda.k;
import tda.g;
import androidx.fragment.app.c;
import jf5.a;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import ww6.a;
import ww6.a$a;
import com.yxcorp.gifshow.util.p0;
import lnc.k4;
import ww6.b;
import ww6.d;
import ty6.a;
import mea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.yxcorp.gifshow.featured.detail.featured.milano.c;
import yw6.d;
import uy6.h;
import ww6.c;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import lo5.a;
import ko5.c;
import uv8.m1;
import kda.e;
import q87.c;
import rf5.u;
import bf5.s;
import io.reactivex.subjects.PublishSubject;

public class HomeFeaturedMilanoContainerFragment extends HomeMilanoBaseContainerFragment implements e, a	// class@000f16
{
    public t W0;
    public m X0;
    public static WeakReference Y0;

    public void HomeFeaturedMilanoContainerFragment(){
       super();
    }
    public int Ah(){
       return 9999;
    }
    public void Ch(boolean p0){
       if (PatchProxy.isSupport(HomeFeaturedMilanoContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeFeaturedMilanoContainerFragment.class, "12")) {
          return;
       }
       InvalidGestureChecker.b(this.getContext(), p0);
       return;
    }
    public void Dh(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturedMilanoContainerFragment.class, "20")) {
          return;
       }
       if (!b.a(0x8ca227e).e(this.getActivity())) {
          d uod = d.a(p0);
          if (uod != null && this.G.X0() != null) {
             this.G.X0().E2(uod);
          }
       }
       return;
    }
    public void Hh(c p0){
    }
    public Object J9(){
       return this.X0;
    }
    public final TabIdentifier Ua(){
       return b.f;
    }
    public int f(){
       return 90;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeFeaturedMilanoContainerFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(HomeFeaturedMilanoContainerFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Bh();
       int page = (obj != null)? obj.getPage(): super.getPage();
       return page;
    }
    public String getPageParams(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       String pageParams = (obj != null)? obj.getPageParams(): "is_page_loading=TRUE";
       return pageParams;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public void mh(PresenterV2 p0){
       l ol;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeFeaturedMilanoContainerFragment.class, "13")) {
          return;
       }
       if (h.c()) {
          p0.U7(new e());
       }
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, objArray, h.class, "4");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("clearOfflineCache", false);
       if (b && !b.a.getBoolean(b.d("user")+"isClearOffline", false)) {
          p0.U7(new c());
       }
       boolean b1 = true;
       obj = (this.X0.getPlatform() == b1)? new f(this.X0): new l(this.X0);
       p0.U7(obj);
       if (d.j()) {
          p0.U7(new m());
       }
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, HomePageExperimentManager.class, "2");
       if (uBoolean == patchProxyRe) {
          uBoolean = HomePageExperimentManager.b.getValue();
       }
       if (uBoolean.booleanValue()) {
          p0.U7(new i0());
       }
       String str = "GAMORA";
       String obj1 = PatchProxy.applyOneRefs(str, objArray, b.class, "1");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          Type type = new a().getType();
          obj1 = c.a.getString("StartupParams", "null");
          Object[] objArray1 = (obj1 == null || obj1 == "")? objArray: b.a(obj1, type);
          if (objArray1 != null) {
             objArray = objArray1.get(str);
          }
       }
       if (objArray != null && objArray.getRankBackFreshRerankEnabled()) {
          p0.U7(new r0(this.X0));
       }
       if (HomePageExperimentManager.a()) {
          p0.U7(d.a(-1492894991).tk(b1));
       }
       p0.U7(new e());
       p0.U7(new i());
       boolean b2 = a.h(this);
       if (b2) {
          p0.U7(new w0(new c(this)));
          p0.U7(new n());
       }
       if (b2) {
          if (!k.d()) {
             p0.U7(new k(this));
          }
       }else if(a.j(this)){
          p0.U7(new j1());
          p0.U7(new p());
       }
       d.a(-1694791652).oh(p0, false);
       if (f.a("enableNewDeviceLogin") && (!QCurrentUser.ME.isLogined() && d.a(-2043427941).Ck())) {
          p0.U7(new v0());
       }
    label_0199 :
       d.a(0x4f878389).AZ(p0);
       if (HomePageExperimentManager.b()) {
          p0.U7(new i(e.S));
       }
       p0.U7(new q());
       p0.U7(d.a(-859095268).xe());
       d.a(0x3673894c).kc(p0);
       if (e.d() > 0) {
          p0.U7(new NasaLivePhotoDuplicatedPresenter());
       }
       if (NasaExperimentUtils.J()) {
          p0.U7(new g());
       }
       if (HomeExperimentManager.b()) {
          p0.U7(new t0());
       }
       if (b.d()) {
          p0.U7(new f());
       }
       if (NasaExperimentUtils.M() || NasaExperimentUtils.t()) {
          p0.U7(new k());
       }
       if (a.t().d("ColdLaunchPrefetchGRInsertOpt", false)) {
          p0.U7(new n0());
       }
       p0.U7(new h(this));
       PatchProxy.onMethodExit(HomeFeaturedMilanoContainerFragment.class, "13");
       return;
    }
    public void nh(m0 p0){
       boolean b;
       FeaturedExperimentUtil uFeaturedExp = FeaturedExperimentUtil.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturedMilanoContainerFragment.class, "15")) {
          return;
       }
       p0.a(new f0());
       p0.a(new m());
       p0.a(new l());
       p0.a(new o0());
       p0.a(new NasaMilanoDuplicateRealShowPresenter());
       p0.e().U7(new s0());
       TabIdentifier z = b.z;
       if (a.n(this, z)) {
          p0.a(new i());
       }
       p0.a(new j());
       p0.a(new NasaFeaturedAutoRefreshPresenter());
       p0.a(new a(a.n(this, z)));
       if (FeaturedExperimentUtil.a()) {
          p0.a(new h());
       }
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, uFeaturedExp, "3");
       if (uBoolean == patchProxyRe) {
          uBoolean = FeaturedExperimentUtil.c.getValue();
       }
       if (uBoolean.booleanValue()) {
          p0.a(new d());
       }
       Boolean uBoolean1 = PatchProxy.apply(objArray, objArray, uFeaturedExp, "4");
       if (uBoolean1 == patchProxyRe) {
          uBoolean1 = FeaturedExperimentUtil.d.getValue();
       }
       if (uBoolean1.booleanValue()) {
          p0.a(new NasaFeaturedNewFpsMonitorPresenter());
       }
       p0.a(new SlidePlayLogTimeMachinePresenter(SlidePlayLogTimeMachinePresenter.P8(this.Ua())));
       p0.a(new o());
       if (PlayerPanelConfigHelper.a().isSmallWindowEnable()) {
          p0.a(new PictureInPicturePresenter());
          p0.a(new PictureInPictureLockScreenPresenter());
       }
       int i = 0x4f878389;
       d.a(i).OA(p0.e());
       p0.a(d.a(-1492894991).s60());
       p0.a(d.a(0x396c0e3f).tV());
       d.a(0x38955e85).L40(p0.e());
       Object obj = PatchProxy.apply(objArray, objArray, d.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(d.j() && TextUtils.n("strategyRerank", d.d.mFilterStrategyType)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.a(new NasaHomePrefetchCacheRerankPresenter());
       }
       if (d.a(-908290672).z50()) {
          d.a(i).Vj(p0.e());
          p0.a(new k());
       }
       return;
    }
    public String o(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       if (obj != null) {
          return obj.o();
       }
       return "FEATURED_PAGE";
    }
    public void oh(m p0,View p1){
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeFeaturedMilanoContainerFragment.class, "4")) {
       }else {
          super.oh(p0, p1);
          boolean b = d.p();
          UxMonitorExpUtil uxMonitorExp = UxMonitorExpUtil.class;
          if (PatchProxy.isSupport(uxMonitorExp)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, uxMonitorExp, "3");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(c.b()){
                if (a.d() && b) {
                   uoc = true;
                }else {
                   uoc = UxMonitorExpUtil.b.a();
                   if (uoc != null) {
                      uoc = uoc.enableScreenCoverMonitor;
                   }
                }
             }
             uoc = null;
          }else {
             goto label_0035 ;
          }
          if (b != null) {
             Rect rect = new Rect();
             p1.addOnLayoutChangeListener(new b(rect, (p1.f(p1.getContext()) + a1.d(R.dimen.arg_RES_7f070fdf))));
             b uob = new b(this.requireActivity(), rect, d.p());
             d uod = new d(this, uob);
             if (!PatchProxy.applyVoidOneRefs(uod, uob, b.class, "1")) {
                a.p(uod, "task");
                uob.e.add(uod);
             }
             p0.H2 = uob;
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturedMilanoContainerFragment.class, "21")) {
          return;
       }
       b.a(0x8708467).a("homeFeaturedInit");
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HomeFeaturedMilanoContainerFragment.class, "23")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeFeaturedMilanoContainerFragment.class, "22")) {
          return;
       }
       super.onResume();
       b.a(0x8708467).z("homeFeaturedInit");
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoid(null, this, HomeFeaturedMilanoContainerFragment.class, "11")) {
          return;
       }
       if (this.Vg().c()) {
          RxBus.f.c(new b());
       }
       new HomeSceneLifecycleHelper(this).c();
       d uod = this.z5();
       if (uod != null) {
          uod.c0().b(this.getLifecycle(), a.b, new e(this));
       }
       this.N.i0(new HomeFeaturedMilanoContainerFragment$a(this));
       return;
    }
    public m rh(){
       a uoa = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public g sh(){
       Object[] objArray = null;
       SlideMediaType obj = PatchProxy.apply(objArray, this, HomeFeaturedMilanoContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, HomeFeaturedMilanoContainerFragment.class, "9")) {
          a.a.b("evelog nasa: HomeFeaturedMilanoContainerFragment createPageListAndRankManager\(\)");
          t ot = f.c(this).e();
          this.X0 = ot.t;
          this.W0 = ot;
       }
       if (!PatchProxy.applyVoid(objArray, this, HomeFeaturedMilanoContainerFragment.class, "10")) {
          d uod = new d(this, this.W0, true);
          uod.b(false);
          uod.h = NasaSwitch.c.a();
          uod.d(this.N);
          uod.c(new f(this));
          HomeFeaturedMilanoContainerFragment tW0 = this.W0;
          if (tW0 instanceof b) {
             uod.a(tW0);
          }
          b.o0(this).q0(uod);
       }
       this.L.c.v1 = this.X0;
       HomeFeaturedMilanoContainerFragment.Y0 = new WeakReference(this.W0);
       obj = (SystemUtil.a(23))? SlideMediaType.ALL: SlideMediaType.PHOTO;
       if (d.a(-87665878).Gb()) {
          return new b(this.W0, true, new a(obj, true));
       }else {
          return new b(this.W0, new a(obj, true));
       }
    }
    public e th(){
       Object obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       k ok = new k();
       ok.a = false;
       g og = new g(ok, this.getFragmentManager(), this.getActivity(), this, this.G, this.L.c.X, this, this, this, this, this);
       return obj;
    }
    public a uh(){
       a$a obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.i(true);
       boolean b = false;
       obj.g(b);
       obj.c("FEATURED");
       if (p0.a() || k4.b()) {
          int[] ointArray = new int[true];
          ointArray[b] = true;
          obj.f(new b(true, ointArray));
       }
       obj.l(new d(true, true, a.a(90)));
       c uoc = c.f();
       if (uoc != null && (uoc.mEnablePoorNetworkOpt != null && uoc.mDisableRetryAtLastPhoto != null)) {
          obj.j(c.a);
       }
    label_005b :
       if (h.h) {
          obj.m(new c(true, h.a(), h.b()));
       }
       return obj.a();
    }
    public NasaBizParam vh(){
       NasaBizParam obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("FEATURED");
       HomeMilanoBaseContainerFragment tL = this.L;
       boolean b = (tL != null && (tL.c != null && tL.c.H2 != null))? true: false;
       uoa.M0 = b;
       obj.setNasaSlideParam(uoa.a());
       return obj;
    }
    public PhotoDetailParam wh(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailParam();
       obj.setSource(this.f()).setBizType(4);
       obj.getDetailCommonParam().setSourcePage2(this.o());
       obj.getSlidePlayConfig().setEnableLazyLoad(false);
       obj.getDetailPlayConfig().setUseHardDecoder(true);
       obj.getSlidePlayConfig().setEnableSlidePositionChangeEvent(true);
       return obj;
    }
    public boolean xh(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, HomeFeaturedMilanoContainerFragment.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (b.f.equals(c.b(this.getActivity()).f(this.getActivity().getIntent()))) {
          obj = PatchProxy.apply(null, null, m1.class, "12");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(m1.k == null){
             b1 = (m1.c() & b)? true: false;
             m1.k = Boolean.valueOf(b1);
          }
          Boolean k = m1.k;
          a.m(k);
          b1 = k.booleanValue();
          if (b1) {
          label_0064 :
             return b;
          }
       }
       b = false;
       goto label_0064 ;
    }
    public final void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFeaturedMilanoContainerFragment.class, "19")) {
          return;
       }
       super.y2(p0);
       Object[] objArray = new Object[0];
       e.C().w("MilanoFeatured", "onActivityNewIntent\(\) "+p0, objArray);
       this.Dh(p0);
       if (this.W0.w2() || b.a(0x8ca227e).d()) {
          this.L.c.R.m();
          this.L.d.onNext(new s(3, true));
          d.a(0x4f878389).b30(this, p0);
       }
       return;
    }
    public boolean y3(){
       return true;
    }
}
