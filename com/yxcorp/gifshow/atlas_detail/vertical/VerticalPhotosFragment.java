package com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment;
import com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import com.yxcorp.gifshow.atlas_detail.vertical.a;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment$a;
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
import n89.a;
import android.util.SparseIntArray;
import m99.f;
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
import java.lang.Number;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import android.os.Bundle;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import uw9.v3;
import uw9.l0;
import q3a.a;
import java.util.BitSet;
import lnc.b5;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.comment.CommentParams;
import m9a.d;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import ge5.b;
import he5.a;
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
import zf6.l;
import lnc.u1;
import android.os.Parcelable;
import org.parceler.b;
import android.view.ViewStub;
import az6.a;
import java.lang.Integer;
import moc.b;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import l99.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.detail.nonslide.b;
import je5.d;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import p5a.b;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import brd.y;

public abstract class VerticalPhotosFragment extends PhotoDetailBaseFragment	// class@001bcc
{
    public PresenterV2 q;
    public a r;
    public a s;
    public QPhoto t;
    public PhotoDetailLogger u;
    public SparseIntArray v;
    public boolean w;
    public b x;
    public final d y;
    public final b0 z;
    public static final int A;

    public void VerticalPhotosFragment(){
       super();
       this.y = a.a;
       this.z = new VerticalPhotosFragment$a(this);
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "12")) {
          return;
       }
       Iterator iterator = this.s.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B0();
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "10")) {
          return;
       }
       if (this.u.hasStartLog()) {
          this.u.exitStayForComments();
          this.u.exitStayForRecommendCommentPanel();
       }
       Iterator iterator = this.s.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().F1();
       }
       this.u.fulfillUrlPackage();
       this.nh();
       c uoc = new c(this.t.getEntity(), this.u.getActualPlayDuration(), this.u.getCommentStayDuration());
       RxBus.f.b(v7);
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mActualPlayDuration = this.u.getActualPlayDuration();
       c.e(this.o(), 7, this.t.mEntity, uExtParams);
       uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mCommentStayDuration = this.u.getCommentStayDuration();
       c.e(this.o(), 5, this.t.mEntity, uExtParams);
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnSlideBack(this, this.l);
       this.u = photoDetailL;
       this.s.h = photoDetailL;
       this.s.c.t(photoDetailL);
       this.mh();
       return;
    }
    public void F8(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalPhotosFragment.class, "29")) {
          return;
       }
       VerticalPhotosFragment tr = this.r;
       if (tr == null) {
          return;
       }
       tr.W.add(p0);
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildExpTagTrans();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildContentPackage();
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.buildContentPackage();
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VerticalPhotosFragment.class, "17")) {
          return;
       }
       VerticalPhotosFragment tu = this.u;
       if (tu != null) {
          tu.fulfillUrlPackage();
       }
       tu = this.r;
       if (tu != null) {
          tu.i.onNext(Boolean.TRUE);
       }
       if (!PatchProxy.applyVoid(objArray, this, VerticalPhotosFragment.class, "32")) {
          tu = this.r;
          if (tu != null) {
             a a2 = tu.a2;
             if (a2 != null) {
                SparseIntArray sparseIntArr = a2.r1();
                int i = 0;
                int i1 = 0;
                while (i < sparseIntArr.size()) {
                   int i2 = sparseIntArr.valueAt(i);
                   i1 = i1 + i2;
                   if (this.v != null) {
                      int i3 = sparseIntArr.keyAt(i);
                      int i4 = this.v.get(i3) + i2;
                      this.v.put(i3, i4);
                   }
                   i = i + 1;
                }
                this.u.logAtlasCnt(this.r.a2.s1(), i1, sparseIntArr.size());
             }
          }
       }
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null && (tl.getDetailPlayConfig().isSharePlayer() && (this.u.isEventStatLogEnable() && this.getActivity() != null))) {
          FragmentActivity activity = this.getActivity();
          VerticalPhotosFragment tu1 = this.u;
          VerticalPhotosFragment ts = this.s;
          if (ts != null) {
             objArray = ts.c.getPlayer();
          }
          activity.setResult(-1, tu1.buildIntentForSharePlayer(this, objArray));
       }
    label_009e :
       return;
    }
    public b eh(){
       return this.r.c;
    }
    public PhotoDetailLogger fh(){
       return this.u;
    }
    public boolean gh(){
       Object obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.t != null && (this.r != null && this.getActivity() != null))? true: false;
       return b;
    }
    public void hh(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "18")) {
          return;
       }
       VerticalPhotosFragment tq = this.q;
       if (tq != null) {
          tq.destroy();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "9")) {
          return;
       }
       Iterator iterator = this.s.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().i2();
       }
       this.u.startLog().logEnterTime().buildPhotoConsumePage(this.getContext());
       return;
    }
    public void ih(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VerticalPhotosFragment.class, "8")) {
          return;
       }
       this.q.U7(new a(false));
       this.q.U7(new b(this.getChildFragmentManager(), this.r.a2));
       this.q.U7(new l(this, this.l, this.k));
       PatchProxy.onMethodExit(VerticalPhotosFragment.class, "8");
       return;
    }
    public abstract View jh(LayoutInflater p0,ViewGroup p1);
    public void k1(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "11")) {
          return;
       }
       Iterator iterator = this.s.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().k1();
       }
       return;
    }
    public int kh(){
       return 0x7f0d02c5;
    }
    public final int lh(){
       a obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.r.a2;
       int i = 0;
       if (obj == null) {
          return i;
       }
       int i1 = obj.s1() - 1;
       if (i1 >= 0) {
          i = i1;
       }
       return i;
    }
    public final void mh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VerticalPhotosFragment.class, "26")) {
          return;
       }
       VerticalPhotosFragment tu = this.u;
       VerticalPhotosFragment tt = this.t;
       if (tt != null) {
          objArray = tt.mEntity;
       }
       tu.setBaseFeed(objArray).setReferUrlPackage(u1.p());
       this.u.buildUrlPackage(this);
       this.u.setCurrentPlaySoundVolume(this.getActivity());
       return;
    }
    public final void nh(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "27")) {
          return;
       }
       if (this.t != null && (this.u.hasStartLog() && this.u.getEnterTime() - null > 0)) {
          this.u.logLeaveTime().setHasUsedEarphone(this.r.u);
          this.s.c.n(this.getUrl(), u1.r(this));
       }
    label_0040 :
       return;
    }
    public void onActivityCreated(Bundle p0){
       VerticalPhotosFragment tq;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalPhotosFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null && tl.mPhoto != null) {
          Object[] objArray = null;
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, this, VerticalPhotosFragment.class, "5")) {
             a uoa = new a(this.t);
             this.r = uoa;
             uoa.f = this.getContext().J1();
             uoa = new a();
             this.s = uoa;
             uoa.b = this;
             uoa.h = this.u;
             this.mh();
             this.l.getDetailPlayConfig().setUsePlayerKitPlay(i);
             tl = this.l;
             uoa = a.a(this, tl.mPhoto, tl.getDetailPlayConfig(), this.l.enableSlidePlay(), this.l.isThanos());
             uoa.r(this.r.f.r);
             uoa.t(this.u);
             VerticalPhotosFragment ts = this.s;
             ts.c = uoa;
             PhotoDetailBaseFragment tj = this.j;
             ts.j = tj;
             tj.add(uoa);
             tq = this.s;
             tq.f = this.y;
             ts = this.r;
             ts.b = tq;
             ts.c = new b();
             tq.y = Boolean.valueOf(b5.a(this.getActivity()));
             tq = this.r;
             tq.A = this.z;
             tq.G1 = this.s.c.c();
             tq = this.r;
             tq.H1 = this.s.c;
             f uof = new f(this.l, this.k, this.r, true, true);
             tq.a2 = ts;
             tq.J1 = d.d(this.t, this.l.getDetailCommonParam().getComment(), this.l.getDetailCommonParam().getPreInfo(), this.k, this.s.c.c());
             tq.I1 = d.c(this.t, this.k);
             if (this.k.mToProfilePlan.isSmooth()) {
                tq.C = a.a(this.getContext(), this);
             }
             CommentsFragment uCommentsFra = PatchProxy.apply(objArray, this, VerticalPhotosFragment.class, "6");
             if (uCommentsFra != patchProxyRe) {
             }else {
                i$c uoc = new i$c();
                uoc.b = this.r;
                uoc.c = this.l;
                uoc.d = this.getActivity();
                uoc.e = this.k;
                ts = this.r;
                uCommentsFra = i.a(ts.D1, ts.E1, ts.J1, ts.I1, uoc);
             }
             this.r.c.e(uCommentsFra);
          }
          if (!PatchProxy.applyVoid(objArray, this, VerticalPhotosFragment.class, "7")) {
             this.q = new PresenterV2();
             this.p.a().f(this.q);
             this.ih(this.q);
             this.p.a().e(this.q);
             this.q.f(this.getView());
          }
          tq = this.q;
          ArrayList uArrayList = PatchProxy.apply(objArray, this, VerticalPhotosFragment.class, "4");
          if (uArrayList != patchProxyRe) {
          }else {
             Object[] objArray1 = new Object[]{this.l,this.k,this.r,this.getActivity()};
             uArrayList = Lists.e(objArray1);
          }
          tq.i(uArrayList.toArray());
          a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.VerticalPhotosFragment));
          this.t.mEntity.startSyncWithFragment(this.m());
          this.ch();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VerticalPhotosFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = l.x(p0);
       super.onCreateView(p0, p1, p2);
       u1.a(this);
       this.l = b.a(this.getArguments().getParcelable("PHOTO"));
       this.k = NormalDetailBizParam.getBizParamFromBundle(this.getArguments());
       View view = this.jh(p0, p1);
       this.m = view;
       ViewStub viewStub = view.findViewById(R.id.avatar_and_follow_container_view_stub);
       viewStub.setLayoutResource(this.kh());
       viewStub.inflate();
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null) {
          PhotoDetailParam mPhoto = tl.mPhoto;
          if (mPhoto != null) {
             this.t = mPhoto;
             mPhoto.startSyncWithFragment(this.m());
             this.t.setPosition(this.l.mPhotoIndexByLog);
             PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.l);
             this.u = photoDetailL;
             photoDetailL.logEnterTime();
             NormalDetailBizParam mKeyOfAtlasV = this.k.mKeyOfAtlasViewedCounts;
             if (mKeyOfAtlasV != null) {
                mKeyOfAtlasV = b.b(mKeyOfAtlasV.intValue());
                if (mKeyOfAtlasV instanceof SparseIntArray) {
                   this.v = mKeyOfAtlasV;
                }
             }
             PhotoDetailCostMonitorHelper.f(this);
             PhotoDetailCostMonitorHelper.d(this);
             PhotoDetailCostMonitorHelper.b(this);
             this.x = RxBus.f.g(PhotoDetailCoverFrameReadyEvent.class, RxBus$ThreadMode.MAIN).subscribe(new b(this));
             return this.m;
          }
       }
       if (this.getActivity() != null) {
          this.getActivity().finish();
       }
       return this.m;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "16")) {
          return;
       }
       this.dh();
       super.onDestroyView();
       a.d().t(this);
       this.nh();
       this.r.b();
       l0 v1 = this.r.f.V1;
       if (v1 != null) {
          v1.e();
       }
       VerticalPhotosFragment tt = this.t;
       if (tt != null) {
          tt.setExpTag(d.c(tt.getExpTag()));
       }
       tt = this.x;
       if (tt != null) {
          tt.dispose();
       }
       return;
    }
    public void onEventMainThread(PlayerVolumeEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalPhotosFragment.class, "28")) {
          return;
       }
       if (p0 != null) {
          VerticalPhotosFragment ts = this.s;
          if (ts != null) {
             a c = ts.c;
             if (c != null) {
                p0 = p0.a;
                if (p0 == PlayerVolumeEvent$Status.MUTE) {
                   c.getPlayer().setVolume(0, 0);
                }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                   this.s.c.getPlayer().setVolume(b.c(this.t), b.c(this.t));
                }
             }
          }
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(VerticalPhotosFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VerticalPhotosFragment.class, "31")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       VerticalPhotosFragment tr = this.r;
       if (tr != null && this.n != null) {
          tr.y = Boolean.valueOf(p0);
          this.r.x.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "14")) {
          return;
       }
       if (this.r != null) {
          if (this.n != null && (!this.l.getDetailPlayConfig().isContinuePlayWhileExit() || !this.getActivity().isFinishing())) {
             a.d().k(new PlayEvent(this.t, PlayEvent$Status.PAUSE, 5));
          }
          FragmentActivity activity = this.getActivity();
          if (activity != null && activity.isFinishing()) {
             this.r.a(this.t, activity);
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
       if (PatchProxy.applyVoid(null, this, VerticalPhotosFragment.class, "15")) {
          return;
       }
       super.onResume();
       Boolean tRUE = Boolean.TRUE;
       this.r.g.onNext(tRUE);
       this.r.j.onNext(tRUE);
       if (this.u.hasStartLog()) {
          this.u.exitBackground();
       }
       if (this.n != null && this.r != null) {
          a.d().k(new PlayEvent(this.t, PlayEvent$Status.RESUME, 5));
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VerticalPhotosFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PhotoDetailCostMonitorHelper.c();
       return;
    }
    public int r(){
       VerticalPhotosFragment obj = PatchProxy.apply(null, this, VerticalPhotosFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.r;
       int i = (obj != null)? obj.S.intValue(): 0;
       return i;
    }
    public void vf(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalPhotosFragment.class, "30")) {
          return;
       }
       VerticalPhotosFragment tr = this.r;
       if (tr == null) {
          return;
       }
       tr.W.remove(p0);
       return;
    }
}
