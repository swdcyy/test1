package com.yxcorp.gifshow.featured.detail.featured.milano.commonslide.HomeCommonSlideContainerFragment;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zda.w0;
import uda.a;
import z1.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.e;
import zda.s0;
import tda.m0;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import tda.m;
import tda.a;
import yw6.g;
import com.yxcorp.utility.SystemUtil;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import uda.d;
import n0a.b;
import yw6.j;
import rda.a;
import qvb.i;
import ok.o;
import bf5.e;
import uda.c;
import uda.b;
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
import ww6.d;
import ty6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;

public class HomeCommonSlideContainerFragment extends HomeMilanoBaseContainerFragment	// class@000f21
{
    public CommonFeedSlideParams W0;
    public static final int X0;

    public void HomeCommonSlideContainerFragment(){
       super();
    }
    public int Ah(){
       return 0x2712;
    }
    public TabIdentifier Ua(){
       return b.t;
    }
    public int f(){
       return 287;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeCommonSlideContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(HomeCommonSlideContainerFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Bh();
       int page = (obj != null)? obj.getPage(): super.getPage();
       return page;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public void mh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HomeCommonSlideContainerFragment.class, "9")) {
          return;
       }
       p0.U7(new w0(new a(this)));
       p0.U7(new e());
       p0.U7(new s0());
       PatchProxy.onMethodExit(HomeCommonSlideContainerFragment.class, "9");
       return;
    }
    public void nh(m0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeCommonSlideContainerFragment.class, "10")) {
          return;
       }
       if (PlayerPanelConfigHelper.a().isSmallWindowEnable()) {
          p0.a(new PictureInPicturePresenter());
          p0.a(new PictureInPictureLockScreenPresenter());
       }
       return;
    }
    public String o(){
       return this.W0.mPage2;
    }
    public m rh(){
       a uoa = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public g sh(){
       SlideMediaType obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (SystemUtil.a(23))? SlideMediaType.ALL: SlideMediaType.PHOTO;
       d uod = new d();
       uod.i2(this.W0);
       return new j(uod, new a(obj, true));
    }
    public e th(){
       Object obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(new c(), this.getFragmentManager(), this.getActivity(), this, this.G, this.L.c.X, this, this, this, this);
       return obj;
    }
    public a uh(){
       a$a obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.i(true);
       obj.g(false);
       obj.l(new d(true, true, a.a(287)));
       obj.c("DETAIL");
       return obj.a();
    }
    public NasaBizParam vh(){
       NasaBizParam obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaBizParam();
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.A = true;
       uoa.N0 = this.W0;
       obj.setNasaSlideParam(uoa.a());
       return obj;
    }
    public PhotoDetailParam wh(){
       PhotoDetailParam obj = PatchProxy.apply(null, this, HomeCommonSlideContainerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoDetailParam();
       obj.setSource(this.f()).setBizType(4);
       obj.getDetailCommonParam().setSourcePage2(this.o());
       obj.getSlidePlayConfig().setEnableLazyLoad(false);
       obj.getDetailPlayConfig().setUseHardDecoder(true);
       obj.getSlidePlayConfig().setEnableSlidePositionChangeEvent(true);
       obj.getSlidePlayConfig().setDisableSwipeToProfile(true);
       return obj;
    }
}
