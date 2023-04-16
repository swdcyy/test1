package com.gifshow.kuaishou.visitor.home.feature.VisitorFeaturedMilanoContainerFragment;
import com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wh.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import com.yxcorp.gifshow.nasa.featured.presenter.NasaMilanoDuplicateRealShowPresenter;
import zda.s0;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import tkd.b;
import tkd.d;
import nl9.u;
import ml8.c;
import ayb.i;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil;
import com.yxcorp.gifshow.featured.detail.featured.presenter.h;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.i;
import zy5.e;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import com.yxcorp.gifshow.featured.detail.featured.presenter.o;
import ida.b;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import zda.t0;
import com.gifshow.kuaishou.visitor.home.feature.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.util.rx.RxBus;
import gp5.b;
import com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper;
import android.os.Bundle;
import kda.e;
import q87.c;
import wkd.b;
import gb5.a;
import tda.m;
import wh.c;
import yw6.g;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import com.yxcorp.gifshow.featured.detail.featured.t;
import p1b.d;
import qvb.i;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import wh.d;
import xy6.b;
import s1b.b;
import p1b.b;
import java.lang.ref.WeakReference;
import com.yxcorp.utility.SystemUtil;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import rda.b;
import rda.a;
import ok.o;
import bf5.e;
import wh.f;
import wh.e;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import jf5.a;
import android.app.Activity;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import ww6.a;
import ww6.a$a;
import lnc.k4;
import ww6.b;
import ww6.d;
import ty6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import android.content.Intent;
import java.lang.StringBuilder;
import nda.a;
import rf5.u;
import bf5.s;
import io.reactivex.subjects.PublishSubject;
import lda.d;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class VisitorFeaturedMilanoContainerFragment extends VisitorMilanoBaseContainerFragment	// class@0015dc
{
    public t Y;
    public static WeakReference Z;

    public void VisitorFeaturedMilanoContainerFragment(){
       super();
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
       Object obj = PatchProxy.applyOneRefs(p0, this, VisitorFeaturedMilanoContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VisitorFeaturedMilanoContainerFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
       String pageParams = (obj != null)? obj.getPageParams(): "is_page_loading=TRUE";
       return pageParams;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public void mh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VisitorFeaturedMilanoContainerFragment.class, "10")) {
          return;
       }
       p0.U7(new a());
       p0.U7(new e());
       p0.U7(new NasaMilanoDuplicateRealShowPresenter());
       p0.U7(new s0());
       p0.U7(new NasaFeaturedAutoRefreshPresenter());
       d.a(-1694791652).oh(p0, false);
       d.a(0x4f878389).AZ(p0);
       if (FeaturedExperimentUtil.a()) {
          p0.U7(new h());
       }
       if (HomePageExperimentManager.b()) {
          p0.U7(new i(e.S));
       }
       p0.U7(new SlidePlayLogTimeMachinePresenter(SlidePlayLogTimeMachinePresenter.P8(this.Ua())));
       p0.U7(new o());
       p0.U7(d.a(-859095268).xe());
       if (HomeExperimentManager.b()) {
          p0.U7(new t0());
       }
       p0.U7(new a());
       PatchProxy.onMethodExit(VisitorFeaturedMilanoContainerFragment.class, "10");
       return;
    }
    public String o(){
       return "SINGLE_FEED_VISITOR_MODE_PAGE";
    }
    public void oh(){
       if (PatchProxy.applyVoid(null, this, VisitorFeaturedMilanoContainerFragment.class, "9")) {
          return;
       }
       if (this.Vg().c()) {
          RxBus.f.c(new b());
       }
       new HomeSceneLifecycleHelper(this).c();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorFeaturedMilanoContainerFragment.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("VisitorFeature", "onCreate\(\)", objArray);
       b.a(0x8708467).a("homeFeaturedInit");
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VisitorFeaturedMilanoContainerFragment.class, "16")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, VisitorFeaturedMilanoContainerFragment.class, "15")) {
          return;
       }
       super.onResume();
       b.a(0x8708467).z("homeFeaturedInit");
       return;
    }
    public m qh(){
       c uoc = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "3");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
    public g rh(){
       Object[] objArray = null;
       SlideMediaType obj = PatchProxy.apply(objArray, this, VisitorFeaturedMilanoContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, VisitorFeaturedMilanoContainerFragment.class, "7")) {
          this.Y = f.c(this).e();
       }
       if (!PatchProxy.applyVoid(objArray, this, VisitorFeaturedMilanoContainerFragment.class, "8")) {
          d uod = new d(this, this.Y, true);
          uod.b(false);
          uod.d(this.I);
          uod.c(new d(this));
          VisitorFeaturedMilanoContainerFragment tY = this.Y;
          if (tY instanceof b) {
             uod.a(tY);
          }
          b.o0(this).q0(uod);
       }
       VisitorFeaturedMilanoContainerFragment.Z = new WeakReference(this.Y);
       obj = (SystemUtil.a(23))? SlideMediaType.ALL: SlideMediaType.PHOTO;
       return new b(this.Y, new a(obj, true));
    }
    public e sh(){
       Object obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f();
       uof.a = false;
       e uoe = new e(uof, this.getFragmentManager(), this.getActivity(), this, this.C, this.G.c.X, this, this, this, this);
       return obj;
    }
    public a th(){
       a$a obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.i(true);
       boolean b = false;
       obj.g(b);
       obj.c("FEATURED");
       if (k4.b()) {
          int[] ointArray = new int[true];
          ointArray[b] = true;
          obj.f(new b(true, ointArray));
       }
       obj.l(new d(true, true, a.a(90)));
       return obj.a();
    }
    public NasaBizParam uh(){
       NasaBizParam obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("FEATURED");
       obj.setNasaSlideParam(uoa.a());
       return obj;
    }
    public PhotoDetailParam vh(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, VisitorFeaturedMilanoContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailParam();
       obj.setSource(this.f()).setBizType(4);
       obj.getSlidePlayConfig().setEnableLazyLoad(false);
       obj.getDetailPlayConfig().setUseHardDecoder(true);
       obj.getSlidePlayConfig().setEnableSlidePositionChangeEvent(true);
       return obj;
    }
    public int wh(){
       return 9999;
    }
    public final void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorFeaturedMilanoContainerFragment.class, "12")) {
          return;
       }
       super.y2(p0);
       Object[] objArray = new Object[0];
       e.C().w("VisitorFeature", "onActivityNewIntent\(\) "+p0, objArray);
       this.yh(p0);
       if (this.Y.w2() || b.a(0x8ca227e).d()) {
          this.G.c.R.m();
          this.G.d.onNext(new s(3, true));
          d.a(0x4f878389).b30(this, p0);
       }
       return;
    }
    public void yh(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorFeaturedMilanoContainerFragment.class, "13")) {
          return;
       }
       if (!b.a(0x8ca227e).e(this.getActivity())) {
          d uod = d.a(p0);
          if (uod != null && this.C.X0() != null) {
             this.C.X0().E2(uod);
          }
       }
       return;
    }
}
