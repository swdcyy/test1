package com.kuaishou.live.preview.item.base.LiveGrootPreviewBaseFragment;
import lnc.g2$a;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kuaishou.live.preview.log.LivePreviewPlayLogger;
import xk3.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import je5.d;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.System;
import ck3.b;
import androidx.fragment.app.FragmentActivity;
import lnc.g2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import dw6.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.preview.item.base.a;
import com.kuaishou.live.preview.item.base.b;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Long;
import android.app.Activity;
import java.lang.IllegalArgumentException;
import i2b.a;

public abstract class LiveGrootPreviewBaseFragment extends DetailSlidePlayFragment implements g2$a	// class@000d7a
{
    public QPhoto F;
    public Object G;
    public b H;
    public final LivePreviewPlayLogger I;
    public LiveAudienceParam J;
    public QLivePlayConfig K;
    public g2 L;
    public final b M;
    public static final int N;

    public void LiveGrootPreviewBaseFragment(){
       super();
       this.I = new LivePreviewPlayLogger();
       this.M = new b();
    }
    public int Ah(){
       return this.t;
    }
    public PresenterV2 B2(){
       return null;
    }
    public final void Bh(){
       LiveGrootPreviewBaseFragment tF;
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "7")) {
          return;
       }
       if (this.hh()) {
          tF = this.F;
          tF.setExpTag(d.a(tF.getExpTag()));
       }else {
          tF = this.F;
          tF.setExpTag(d.c(tF.getExpTag()));
       }
       return;
    }
    public void Ch(){
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "10")) {
          return;
       }
       this.y.t1().k(this);
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LiveGrootPreviewBaseFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.buildExpTagTrans(this.K);
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "11")) {
          return;
       }
       this.y.t1().v(this);
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveGrootPreviewBaseFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.onExitLivePage(this.F);
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "9")) {
          return;
       }
       this.y.t1().r(this);
       LiveGrootPreviewBaseFragment tF = this.F;
       tF.setExpTag(d.a(tF.getExpTag()));
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "8")) {
          return;
       }
       this.y.t1().n(this);
       this.Bh();
       return;
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveGrootPreviewBaseFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.onEnterLivePage(this.F);
    }
    public SlidePlayLogger d1(){
       return this.I;
    }
    public abstract int getLayoutResId();
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGrootPreviewBaseFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       DetailSlidePlayFragment tx = this.x;
       if (tx != null && tx.mPhoto != null) {
          this.H = this.yh();
          tx = this.xh();
          this.G = tx;
          Object[] objArray = new Object[]{this.x,this.H,tx,this.getActivity()};
          this.L.b(objArray);
          tx.a = System.currentTimeMillis() - System.currentTimeMillis();
          tx = this.y;
          if (tx != null && (!tx.s1() && this.y.t() == this)) {
             this.qh();
          }
       }
    label_0061 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGrootPreviewBaseFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.L == null) {
          this.L = new g2(this, this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGrootPreviewBaseFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       LiveAudienceParam liveAudience = this.ch().d(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY);
       this.J = liveAudience;
       if (liveAudience == null || liveAudience.mPhoto == null) {
          throw new IllegalArgumentException("LiveAudienceParam and its photo should not be null");
       }
       if (!PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "4")) {
          QPhoto qPhoto = new QPhoto(this.J.mPhoto);
          this.F = qPhoto;
          qPhoto.startSyncWithFragment(this.m());
          if (this.x == null) {
             this.x = PhotoDetailParam.createByPhotoDetailActivity(this.getActivity());
          }
          qPhoto.mPhoto = new QPhoto(this.F.mEntity);
          int i = 0;
          if (this.ch() != null) {
             i = this.ch().c("KEY_PAGE_INTERFACE", i);
          }
          this.x.setSource(i);
          this.K = this.F.getLivePlayConfig();
          this.Ch();
       }
       if (this.j == null) {
          this.j = this.zh(p0, p1);
          p0.b = System.currentTimeMillis() - System.currentTimeMillis();
       }
       p0.d = k0.b(this.F.mEntity, a.a, b.a).or(Long.valueOf(0)).longValue();
       this.Bh();
       this.F.startSyncWithFragment(this.m());
       this.I.setBaseFeed(this.F.mEntity);
       LiveGrootPreviewBaseFragment tJ = this.J;
       if (tJ != null) {
          this.I.setIndexInAdapter(tJ.mIndexInAdapter);
          this.F.setPosition(this.J.mIndexInAdapter);
       }
       DetailSlidePlayFragment tx = this.x;
       if (tx == null || tx.mPhoto == null) {
          this.getActivity().finish();
          return this.j;
       }else {
          return this.j;
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGrootPreviewBaseFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          ty.t1().d(this);
       }
       return;
    }
    public abstract Object xh();
    public abstract b yh();
    public View zh(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGrootPreviewBaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g(p0, this.getLayoutResId(), p1, false);
    }
}
