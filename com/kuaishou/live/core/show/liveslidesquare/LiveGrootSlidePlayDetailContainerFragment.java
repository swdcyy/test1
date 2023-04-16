package com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment;
import im8.g;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import za2.q;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ib2.h;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Boolean;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import vm5.f;
import android.net.Uri;
import za2.r;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.component.photo.detail.slide.presenter.a;
import tkd.b;
import tkd.d;
import os5.l;
import of5.c;
import bb2.g;
import de3.e;
import rkd.b;
import ib2.g;
import uw9.v3;
import yy6.c;
import lm9.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import az6.a;
import com.kwai.component.photo.detail.slide.presenter.c;
import ib2.b;
import yw6.g;
import ww6.a$a;
import ww6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import za2.n;
import jw6.a;
import xw6.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment$a;
import ex6.a;
import com.kuaishou.live.core.show.liveslidesquare.LiveGrootSlidePlayDetailContainerFragment$b;
import bx6.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class LiveGrootSlidePlayDetailContainerFragment extends GrootSlidePlayDetailBaseContainerFragment implements g	// class@000c8e
{
    public LiveBizParam u;
    public View v;

    public void LiveGrootSlidePlayDetailContainerFragment(){
       super();
    }
    public void ch(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGrootSlidePlayDetailContainerFragment.class, "1")) {
          return;
       }
       super.ch(p0);
       this.v = m1.f(p0, 0x7f0a2190);
       return;
    }
    public int eh(){
       return 0x7f11015e;
    }
    public int getLayoutResId(){
       return 0x7f0d0dcc;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGrootSlidePlayDetailContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGrootSlidePlayDetailContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGrootSlidePlayDetailContainerFragment.class, new q());
       }else {
          obj.put(LiveGrootSlidePlayDetailContainerFragment.class, null);
       }
       return obj;
    }
    public PresenterV2 gh(){
       Object obj = PatchProxy.applyWithListener(null, this, LiveGrootSlidePlayDetailContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveGrootSlidePlayDetailContainerFragment.class, "3");
       return new h(this.l);
    }
    public boolean ih(Intent p0,PhotoDetailParam p1){
       LiveBizParam obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGrootSlidePlayDetailContainerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveBizParam.getBizParamFromIntent(p0);
       this.u = obj;
       if (obj == null) {
          this.u = new LiveBizParam();
       }
       LiveGrootSlidePlayDetailContainerFragment tu = this.u;
       tu.mIsLiveSlide = true;
       if (tu.mDisablePullRefresh != null) {
          p1.getSlidePlayConfig().setEnablePullRefresh(false);
       }
       p1.mIsLiveSlideSquareFromScheme = f.g(p0);
       if (this.u.mIsLiveSlideSquareFromScheme != null && p0.getData() != null) {
          this.u = r.a(p0.getData());
       }
       return true;
    }
    public void nh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveGrootSlidePlayDetailContainerFragment.class, "2")) {
          return;
       }
       super.nh(p0);
       b.a0(LiveLogTag.LIVE_CONTAINER, "onPresenterCreate ", c.j("isGroot", "true"));
       p0.U7(new a(d.a(-1492894991).F9(this.u.mLiveSourceType)));
       p0.U7(new c());
       p0.U7(new g());
       p0.U7(new e());
       if (b.d()) {
          p0.U7(new g());
       }
       PatchProxy.onMethodExit(LiveGrootSlidePlayDetailContainerFragment.class, "2");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGrootSlidePlayDetailContainerFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.s.f.h("OTHERS");
       if (this.u != null) {
          d.a(-1638991736).nS(this.u.mLiveAudienceParam);
       }
       return;
    }
    public KwaiGrootViewPager sh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGrootSlidePlayDetailContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m1.f(p0, 0x7f0a25b7);
    }
    public PresenterV2 vh(){
       LiveGrootSlidePlayDetailContainerFragment obj = PatchProxy.applyWithListener(null, this, LiveGrootSlidePlayDetailContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj.mIsLiveSlideSquareFromScheme != null || obj.mSlidePlayFeedFlowParam != null) {
          PatchProxy.onMethodExit(LiveGrootSlidePlayDetailContainerFragment.class, "4");
          return new b();
       }else if(TextUtils.x(obj.mSlidePlayId)){
          this.u.mSlidePlayId = this.k.mSlidePlayId;
       }
       PatchProxy.onMethodExit(LiveGrootSlidePlayDetailContainerFragment.class, "4");
       return new c();
    }
    public void xh(KwaiGrootViewPager p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGrootSlidePlayDetailContainerFragment.class, "6")) {
          return;
       }
       a$a uoa = new a$a();
       uoa.g(false);
       uoa.i((this.u.mDisablePullRefresh ^ 1));
       a uoa1 = this.q.x0(this.getChildFragmentManager(), p1, new n(this.u, this.k), uoa.a());
       LiveGrootSlidePlayDetailContainerFragment tu = this.u;
       if (tu.mIsSoloLiveStream == null && tu.mDisablePullRefresh == null) {
          uoa1.p(new LiveGrootSlidePlayDetailContainerFragment$a(this));
       }
       if (this.u.mDisableLoadMore == null) {
          uoa1.o(new LiveGrootSlidePlayDetailContainerFragment$b(this));
       }
       this.q.i1(this.k.mPhoto, this.s);
       this.q.R1(1);
       return;
    }
}
