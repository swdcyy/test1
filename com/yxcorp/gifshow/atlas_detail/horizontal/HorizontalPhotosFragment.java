package com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment$a;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import id5.a;
import java.util.Iterator;
import java.util.List;
import vy6.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.action.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;
import uw9.y;
import n89.m;
import java.util.Set;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import p5a.e;
import k2b.e0;
import com.kwai.framework.player.core.b;
import android.content.Intent;
import android.app.Activity;
import uw9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n89.a;
import java.util.Objects;
import o89.c;
import ml8.c;
import crd.b;
import lnc.b9;
import android.content.Context;
import af5.a;
import n2a.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import n89.l;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.os.Bundle;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import uw9.v3;
import uw9.l0;
import q3a.a;
import java.util.BitSet;
import j99.r;
import lnc.b5;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import ge5.b;
import he5.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.comment.CommentParams;
import m9a.d;
import com.yxcorp.gifshow.comment.CommentConfig;
import dd5.m;
import dd5.p;
import j99.s;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import bx9.i$c;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import bx9.i;
import hd5.d;
import ed5.e;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import i99.a;
import com.yxcorp.gifshow.atlas_detail.horizontal.a;
import erd.g;
import android.content.res.Configuration;
import zf6.l;
import android.os.Parcelable;
import org.parceler.b;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import az6.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import i99.b;
import com.yxcorp.gifshow.detail.nonslide.b;
import je5.d;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import p5a.b;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import brd.y;
import java.lang.Number;
import java.lang.Integer;

public abstract class HorizontalPhotosFragment extends PhotoDetailBaseFragment	// class@001bb2
{
    public final b0 A;
    public PresenterV2 q;
    public QPhoto r;
    public a s;
    public a t;
    public PhotoDetailLogger u;
    public PhotosViewPager v;
    public b w;
    public boolean x;
    public b y;
    public final d z;
    public static final int B;

    public void HorizontalPhotosFragment(){
       super();
       this.z = new HorizontalPhotosFragment$a(this);
       this.A = new HorizontalPhotosFragment$b(this);
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "13")) {
          return;
       }
       Iterator iterator = this.t.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B0();
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "11")) {
          return;
       }
       if (this.u.hasStartLog()) {
          this.u.exitStayForComments();
          this.u.exitStayForRecommendCommentPanel();
       }
       Iterator iterator = this.t.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().F1();
       }
       this.u.fulfillUrlPackage();
       this.mh();
       c uoc = new c(this.r.getEntity(), this.u.getActualPlayDuration(), this.u.getCommentStayDuration());
       RxBus.f.b(v7);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mActualPlayDuration = this.u.getActualPlayDuration();
       c.e(this.o(), 7, this.r.mEntity, uExtParams);
       uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mCommentStayDuration = this.u.getCommentStayDuration();
       c.e(this.o(), 5, this.r.mEntity, uExtParams);
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(this, this.l);
       this.u = photoDetailL;
       this.t.h = photoDetailL;
       this.t.c.t(photoDetailL);
       this.lh();
       return;
    }
    public void F8(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalPhotosFragment.class, "20")) {
          return;
       }
       HorizontalPhotosFragment ts = this.s;
       if (ts == null) {
          return;
       }
       ts.W.add(p0);
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, HorizontalPhotosFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildExpTagTrans();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, HorizontalPhotosFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildContentPackage();
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, HorizontalPhotosFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildContentPackage();
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalPhotosFragment.class, "19")) {
          return;
       }
       HorizontalPhotosFragment tu = this.u;
       if (tu != null) {
          tu.fulfillUrlPackage();
       }
       tu = this.s;
       if (tu != null) {
          tu.i.onNext(Boolean.TRUE);
       }
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null && (tl.getDetailPlayConfig().isSharePlayer() && (this.u.isEventStatLogEnable() && this.getActivity() != null))) {
          FragmentActivity activity = this.getActivity();
          HorizontalPhotosFragment tu1 = this.u;
          HorizontalPhotosFragment tt = this.t;
          if (tt != null) {
             objArray = tt.c.getPlayer();
          }
          activity.setResult(-1, tu1.buildIntentForSharePlayer(this, objArray));
       }
    label_0052 :
       return;
    }
    public b eh(){
       return this.s.c;
    }
    public PhotoDetailLogger fh(){
       return this.u;
    }
    public boolean gh(){
       Object obj = PatchProxy.apply(null, this, HorizontalPhotosFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r != null && (this.s != null && this.getActivity() != null))? true: false;
       return b;
    }
    public void hh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalPhotosFragment.class, "18")) {
          return;
       }
       HorizontalPhotosFragment tq = this.q;
       if (tq != null) {
          tq.destroy();
       }
       a c2 = this.s.c2;
       Objects.requireNonNull(c2);
       if (!PatchProxy.applyVoid(objArray, c2, c.class, "5")) {
          Iterator iterator = c2.j.iterator();
          while (iterator.hasNext()) {
             iterator.next().destroy();
          }
          b9.a(c2.k);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "10")) {
          return;
       }
       Iterator iterator = this.t.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().i2();
       }
       this.u.startLog().logEnterTime().buildPhotoConsumePage(this.getContext());
       return;
    }
    public void ih(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HorizontalPhotosFragment.class, "9")) {
          return;
       }
       p0.U7(new a(false));
       p0.U7(new b(this.getChildFragmentManager(), this.s.c2));
       p0.U7(new l(this, this.l, this.k));
       PatchProxy.onMethodExit(HorizontalPhotosFragment.class, "9");
       return;
    }
    public abstract View jh(LayoutInflater p0,ViewGroup p1);
    public void k1(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "12")) {
          return;
       }
       Iterator iterator = this.t.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().k1();
       }
       return;
    }
    public int kh(){
       return 0x7f0d02c5;
    }
    public final void lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HorizontalPhotosFragment.class, "26")) {
          return;
       }
       HorizontalPhotosFragment tu = this.u;
       HorizontalPhotosFragment tr = this.r;
       if (tr != null) {
          objArray = tr.mEntity;
       }
       tu.setBaseFeed(objArray).setReferUrlPackage(u1.p());
       this.u.buildUrlPackage(this);
       this.u.setCurrentPlaySoundVolume(this.getActivity());
       return;
    }
    public final void mh(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "27")) {
          return;
       }
       if (this.r != null && (this.u.hasStartLog() && this.u.getEnterTime() - null > 0)) {
          this.u.setHasUsedEarphone(this.s.u);
          this.t.c.n(this.getUrl(), u1.r(this));
       }
    label_003c :
       return;
    }
    public void onActivityCreated(Bundle p0){
       HorizontalPhotosFragment tq;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalPhotosFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null && tl.mPhoto != null) {
          Object[] objArray = null;
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, this, HorizontalPhotosFragment.class, "6")) {
             a uoa = new a(this.r);
             this.s = uoa;
             uoa.f = this.getContext().J1();
             uoa = new a();
             this.t = uoa;
             uoa.b = this;
             uoa.h = this.u;
             this.lh();
             this.l.getDetailPlayConfig().setUsePlayerKitPlay(i);
             tl = this.l;
             uoa = a.a(this, tl.mPhoto, tl.getDetailPlayConfig(), this.l.enableSlidePlay(), this.l.isThanos());
             uoa.r(this.s.f.r);
             uoa.t(this.u);
             HorizontalPhotosFragment tt = this.t;
             tt.c = uoa;
             PhotoDetailBaseFragment tj = this.j;
             tt.j = tj;
             tj.add(uoa);
             tq = this.t;
             tq.f = this.z;
             tt = this.s;
             tt.b = tq;
             tt.c = new b();
             tq.G1 = this.t.c.c();
             tq.H1 = this.t.c;
             View view = this.m.findViewById(R.id.list_item_photo_player_detail_horizontal);
             tt = this.s;
             tt.b2 = new r(view, tt, this.l, this.k);
             tt = this.s;
             tt.e2 = this.v;
             tt.y = Boolean.valueOf(b5.a(this.getActivity()));
             this.s.A = this.A;
             if (this.k.mToProfilePlan.isSmooth()) {
                this.s.C = a.a(this.getContext(), this);
             }
             this.s.J1 = d.d(this.r, this.l.getDetailCommonParam().getComment(), this.l.getDetailCommonParam().getPreInfo(), this.k, this.t.c.c());
             this.s.I1 = d.c(this.r, this.k);
             String str = "photoAtlasHeaderAdapterInit";
             p.a(this.getActivity()).q(str);
             tt = this.s;
             tt.c2 = new s(view, this.l, this.k, tt);
             p.a(this.getActivity()).e(str);
             CommentsFragment uCommentsFra = PatchProxy.apply(objArray, this, HorizontalPhotosFragment.class, "7");
             if (uCommentsFra != patchProxyRe) {
             }else {
                i$c uoc = new i$c();
                uoc.b = this.s;
                uoc.d = this.getActivity();
                uoc.c = this.l;
                uoc.e = this.k;
                tt = this.s;
                uCommentsFra = i.a(tt.D1, tt.E1, tt.J1, tt.I1, uoc);
             }
             this.s.c.e(uCommentsFra);
          }
          if (!PatchProxy.applyVoid(objArray, this, HorizontalPhotosFragment.class, "8")) {
             this.q = new PresenterV2();
             this.p.a().f(this.q);
             this.ih(this.q);
             this.p.a().e(this.q);
             this.q.f(this.getView());
          }
          tq = this.q;
          ArrayList uArrayList = PatchProxy.apply(objArray, this, HorizontalPhotosFragment.class, "5");
          if (uArrayList != patchProxyRe) {
          }else {
             Object[] objArray1 = new Object[]{this.l,this.k,this.s,this.getActivity()};
             uArrayList = Lists.e(objArray1);
          }
          tq.i(uArrayList.toArray());
          a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.HorizontalPhotosFragment));
          this.r.mEntity.startSyncWithFragment(this.m());
          this.ch();
          tq = this.r;
          if (tq != null) {
             this.w = tq.observePostChange().subscribe(new a(this), a.b);
          }
       }
    label_0223 :
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalPhotosFragment.class, "29")) {
          return;
       }
       super.onConfigurationChanged(p0);
       HorizontalPhotosFragment ts = this.s;
       if (ts != null && this.n != null) {
          m w = ts.w;
          boolean b = (p0.orientation == 2)? true: false;
          w.onNext(Boolean.valueOf(b));
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HorizontalPhotosFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = l.x(p0);
       super.onCreateView(p0, p1, p2);
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       this.l = b.a(this.getArguments().getParcelable("PHOTO"));
       this.k = NormalDetailBizParam.getBizParamFromBundle(this.getArguments());
       View view = this.jh(p0, p1);
       this.m = view;
       ViewStub viewStub = view.findViewById(R.id.avatar_and_follow_container_view_stub);
       viewStub.setLayoutResource(this.kh());
       viewStub.inflate();
       PhotoDetailBaseFragment tl = this.l;
       if (tl == null || tl.mPhoto == null) {
          this.getActivity().finish();
          return this.m;
       }else {
          this.v = this.m.findViewById(0x7f0a4452);
          PhotoDetailParam mPhoto = this.l.mPhoto;
          this.r = mPhoto;
          mPhoto.startSyncWithFragment(this.m());
          this.r.setPosition(this.l.mPhotoIndexByLog);
          PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.l);
          this.u = photoDetailL;
          photoDetailL.logEnterTime();
          PhotoDetailCostMonitorHelper.f(this);
          PhotoDetailCostMonitorHelper.d(this);
          PhotoDetailCostMonitorHelper.b(this);
          this.y = RxBus.f.g(PhotoDetailCoverFrameReadyEvent.class, RxBus$ThreadMode.MAIN).subscribe(new b(this));
          return this.m;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       HorizontalPhotosFragment tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "17")) {
          return;
       }
       this.dh();
       super.onDestroyView();
       a.d().t(this);
       this.mh();
       this.s.b();
       l0 v1 = this.s.f.V1;
       if (v1 != null) {
          v1.e();
       }
       HorizontalPhotosFragment tr = this.r;
       if (tr != null) {
          tr.setExpTag(d.c(tr.getExpTag()));
       }
       tr = this.y;
       if (tr != null) {
          tr.dispose();
       }
       return;
    }
    public void onEventMainThread(PlayerVolumeEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalPhotosFragment.class, "28")) {
          return;
       }
       if (p0 != null) {
          HorizontalPhotosFragment tt = this.t;
          if (tt != null) {
             a c = tt.c;
             if (c != null) {
                p0 = p0.a;
                if (p0 == PlayerVolumeEvent$Status.MUTE) {
                   c.getPlayer().setVolume(0, 0);
                }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                   this.t.c.getPlayer().setVolume(b.c(this.r), b.c(this.r));
                }
             }
          }
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(HorizontalPhotosFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HorizontalPhotosFragment.class, "30")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       HorizontalPhotosFragment ts = this.s;
       if (ts != null && this.n != null) {
          ts.y = Boolean.valueOf(p0);
          this.s.x.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "15")) {
          return;
       }
       if (this.s != null) {
          if (this.n != null && (!this.l.getDetailPlayConfig().isContinuePlayWhileExit() || !this.getActivity().isFinishing())) {
             a.d().k(new PlayEvent(this.r, PlayEvent$Status.PAUSE, 5));
          }
          FragmentActivity activity = this.getActivity();
          if (activity != null && activity.isFinishing()) {
             this.s.a(this.r, activity);
          }
       }
    label_004f :
       super.onPause();
       if (this.u.hasStartLog()) {
          this.u.enterBackground();
          this.u.exitStayForComments();
          this.u.exitStayForRecommendCommentPanel();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HorizontalPhotosFragment.class, "16")) {
          return;
       }
       super.onResume();
       Boolean tRUE = Boolean.TRUE;
       this.s.g.onNext(tRUE);
       this.s.j.onNext(tRUE);
       if (this.u.hasStartLog()) {
          this.u.exitBackground();
       }
       if (this.n != null && this.s != null) {
          a.d().k(new PlayEvent(this.r, PlayEvent$Status.RESUME, 5));
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HorizontalPhotosFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PhotoDetailCostMonitorHelper.c();
       return;
    }
    public int r(){
       HorizontalPhotosFragment obj = PatchProxy.apply(null, this, HorizontalPhotosFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.s;
       int i = (obj != null)? obj.S.intValue(): 0;
       return i;
    }
    public void vf(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HorizontalPhotosFragment.class, "21")) {
          return;
       }
       HorizontalPhotosFragment ts = this.s;
       if (ts == null) {
          return;
       }
       ts.W.remove(p0);
       return;
    }
}
