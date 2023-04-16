package com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;
import com.kuaishou.live.basic.liveslide.LiveSlideBaseContainerFragment;
import d12.d;
import jw6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f12.m;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import c51.e;
import d12.f;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import android.view.View;
import wg3.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.Objects;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import java.util.Collection;
import ekd.q;
import java.util.List;
import z12.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.f;
import wvb.e;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Math;
import mkc.b;
import mkc.c;
import f51.d;
import b51.d;
import com.kuaishou.live.basic.liveslide.pullrefresh.LiveSlidePullRefreshView;
import d6a.u;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kwai.library.widget.refresh.RefreshLayout;
import o56.a;
import ekd.l1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import h51.e;
import c51.d;
import h51.a;
import c51.b;
import tw6.a;
import h51.c;
import h51.b;
import h51.d;
import sw6.a;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import f51.b;
import com.kuaishou.live.basic.liveslide.a;
import f51.c;
import f51.a;
import hw6.a;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import java.lang.Boolean;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.basic.liveslide.a;
import androidx.fragment.app.FragmentActivity;
import f12.d;
import f12.c;
import f12.i;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import d12.a;
import android.os.Bundle;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import aa1.d;
import im8.a;
import g12.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g12.m;
import g12.e;
import g12.z;
import c12.p;
import g12.d0;
import g12.p;
import g12.w;
import rkd.b;
import g12.f;
import android.content.res.Configuration;
import d12.g;
import io.reactivex.subjects.PublishSubject;
import android.view.Window;
import android.app.Activity;
import ekd.i;
import android.view.LayoutInflater;
import ag6.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import e12.l;
import android.content.Intent;
import d12.p;
import w51.a;
import xf6.l;
import android.widget.TextView;

public class LiveSlideDetailContainerFragment extends LiveSlideBaseContainerFragment	// class@000838
{
    public final d g;
    public d h;
    public LiveBizParam i;
    public View j;
    public View k;
    public f l;
    public a m;
    public static final int n;

    public void LiveSlideDetailContainerFragment(){
       super();
       this.g = new d();
    }
    public a Vg(){
       m om = PatchProxy.apply(null, this, LiveSlideDetailContainerFragment.class, "11");
       if (om != PatchProxyResult.class) {
       }else {
          om = new m(this.i);
       }
       return om;
    }
    public e Wg(){
       Object obj = PatchProxy.apply(null, this, LiveSlideDetailContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.a;
    }
    public LiveSlideViewPager Xg(){
       Object obj = PatchProxy.apply(null, this, LiveSlideDetailContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.findViewById(0x7f0a25bf);
    }
    public b Yg(){
       List list;
       f b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, LiveSlideDetailContainerFragment.class, "7");
       if (objArray1 != patchProxyRe) {
       }else {
          LiveSlideDetailContainerFragment tl = this.l;
          Objects.requireNonNull(tl);
          f uof = f.class;
          f obj = PatchProxy.apply(objArray, tl, uof, "1");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else {
             obj = tl.b;
             if (obj.mIsSoloLiveStream != null) {
                LiveBizParam mLiveAudienc = obj.mLiveAudienceParam;
                if (mLiveAudienc != null) {
                   LiveAudienceParam mPhoto = mLiveAudienc.mPhoto;
                   if (mPhoto != null) {
                      objArray = mPhoto;
                   }
                }
             }
             if (!q.f(obj.mSlidePlayFeedFlowParam.mPhotoList)) {
                list = x.J(tl.b.mSlidePlayFeedFlowParam.mPhotoList);
             }else if(!TextUtils.x(tl.b.mSlidePlayId)){
                b uob = b.e(tl.b.mSlidePlayId);
                if (uob != null) {
                   if (uob.M7() instanceof f) {
                      list = x.J(uob.M7().getItems());
                   }else if(uob.M7() instanceof e){
                      list = x.J(uob.M7().getItems());
                   }
                }
             }else {
                obj = tl.a;
                if (obj != null) {
                   list = obj.getDataList();
                }
             }
             list = objArray;
             if (!q.f(list)) {
                LiveBizParam obj1 = PatchProxy.applyOneRefs(list, tl, uof, "3");
                int i = 0;
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else if(!TextUtils.x(tl.b.mSelectedStreamId)){
                   int i1 = 0;
                   while (i1 < list.size()) {
                      if (TextUtils.n(r1.n1(list.get(i1)), tl.b.mSelectedStreamId)) {
                         i = i1;
                         break ;
                      }
                      i1 = i1 + 1;
                   }
                }else {
                   b = tl.b;
                   obj1 = b.mSelectedPhoto;
                   if (obj1 != null) {
                      i = Math.max(list.indexOf(obj1.getEntity()), i);
                   }else {
                      LiveBizParam mSelectedInd = b.mSelectedIndex;
                      if (mSelectedInd >= null && mSelectedInd < list.size()) {
                         i = tl.b.mSelectedIndex;
                      }
                   }
                }
                if (i < list.size() && i >= null) {
                   objArray = list.get(i);
                }
             }
          }
       label_010b :
          objArray1 = objArray;
       }
       return objArray1;
    }
    public void Zg(){
       if (PatchProxy.applyVoid(null, this, LiveSlideDetailContainerFragment.class, "13")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.k, uobArray);
       this.k.setVisibility(8);
       return;
    }
    public void ah(){
       d uod2;
       d uod = d.class;
       d uod1 = d.class;
       String str = "5";
       if (PatchProxy.applyVoid(null, this, LiveSlideDetailContainerFragment.class, str)) {
          return;
       }
       super.ah();
       this.ch();
       LiveSlidePullRefreshView liveSlidePul = this.j.findViewById(R.id.live_slide_pull_refresh_view);
       if (u.a()) {
          Context context = this.getContext();
          Objects.requireNonNull(context);
          liveSlidePul.setRefreshInitialOffset((float)((- n.A(context)) - a1.d(R.dimen.arg_RES_7f0702e8)));
          if (l1.a(a.B) && liveSlidePul.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
             liveSlidePul.getLayoutParams().topMargin = n.A(a.B);
          }
       }
       this.c.q().setOverScrollMode(2);
       LiveSlideBaseContainerFragment tc = this.c;
       Objects.requireNonNull(tc);
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(liveSlidePul, tc, uod1, "4")) {
          e uoe = new e(tc.q(), tc.p());
          tc.m = uoe;
          if (!PatchProxy.applyVoidOneRefs(liveSlidePul, uoe, e.class, "1")) {
             uoe.e = liveSlidePul;
             liveSlidePul.setEnabled(true);
             uoe.c.y(uoe);
             uoe.b.j0(uoe);
             e c = uoe.c;
             Objects.requireNonNull(c);
             uoe.e.setOnRefreshListener(new c(c));
             uoe.b.setPullRefreshInterceptor(new d(uoe));
             boolean b2 = (!uoe.c.size())? true: false;
             uoe.a(b2);
          }
       }
       LiveSlideBaseContainerFragment tc1 = this.c;
       b uob = this.j.findViewById(R.id.live_slide_footer_loading_view);
       Objects.requireNonNull(tc1);
       if (!PatchProxy.applyVoidOneRefs(uob, tc1, uod1, str)) {
          d uod3 = new d(tc1.q(), tc1.o(), tc1.p());
          tc1.n = uod3;
          if (!PatchProxy.applyVoidOneRefs(uob, uod3, uod, "1")) {
             uod3.g = uob;
             uod3.b.j0(uod3);
             uod3.g.setContentView(uod3.b);
             uod3.g.setLoadMoreViewGestureDelegate(new c(uod3));
             uod3.d.u(uod3);
             uod3.a();
          }
       }
       tc1 = this.c;
       LiveBizParam mNoMoreText = this.i.mNoMoreText;
       Objects.requireNonNull(tc1);
       if (!PatchProxy.applyVoidOneRefs(mNoMoreText, tc1, uod1, "10")) {
          uod2 = tc1.n;
          if (uod2 != null) {
             uod2.f = mNoMoreText;
          }
       }
       b$b uob1 = this.m.h();
       LiveSlideDetailContainerFragment ti = this.i;
       boolean b1 = (ti.mDisablePullRefresh == null && ti.mIsSoloLiveStream == null)? true: false;
       uob1.e(b1);
       uob1 = this.m.h();
       ti = this.i;
       if (ti.mDisableLoadMore == null && ti.mIsSoloLiveStream == null) {
          b = true;
       }
       Objects.requireNonNull(uob1);
       b$b uob2 = b$b.class;
       if (!PatchProxy.isSupport(uob2) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob1, uob2, "13")) {
          uod2 = uob1.a.e();
          Objects.requireNonNull(uod2);
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uod2, uod1, "9")) {
             uod1 = uod2.n;
             if (uod1 != null && (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uod1, uod, "2"))) {
                uod1.e = b;
                uod1.a();
                uod1.d.setEnableLoadMore(b);
             }
          }
       }
       this.j.findViewById(R.id.live_play_activity_loading_view).setVisibility(8);
       return;
    }
    public void bh(){
       if (PatchProxy.applyVoid(null, this, LiveSlideDetailContainerFragment.class, "12")) {
          return;
       }
       this.k.setVisibility(0);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.b();
       uoa.p(new LiveSlideDetailContainerFragment$a(this));
       uoa.a(c.h(this.k, b.g));
       return;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, LiveSlideDetailContainerFragment.class, "6")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       a uoa = a.k(this);
       this.m = uoa;
       uoa.a = this.c;
       FragmentActivity activity = this.getActivity();
       Objects.requireNonNull(activity);
       i oi = c.c(activity);
       FragmentActivity activity1 = this.getActivity();
       Objects.requireNonNull(activity1);
       LiveSlideDetailContainerFragment tg = this.g;
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoidTwoRefs(activity1, tg, oi, i.class, "1")) {
          oi.a = a.n(activity1);
          FragmentActivity uFragmentAct = activity1;
          oi.c = uFragmentAct.B;
          oi.d = uFragmentAct.C;
          oi.b = tg;
          oi.e = a.e(activity1).a();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       boolean b;
       LiveSlideDetailContainerFragment tg;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideDetailContainerFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       this.ch();
       b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, "onActivityCreated");
       b = true;
       p0.mIsLiveSlide = b;
       a[] uoaArray = new a[b];
       int i = 0;
       uoaArray[i] = this.g;
       d uod = new d(uoaArray);
       this.h = uod;
       uod.U7(new q());
       this.h.U7(new m());
       this.h.U7(new e());
       this.h.U7(new z());
       this.h.U7(new p());
       this.h.U7(new d0());
       this.h.U7(new p());
       this.h.U7(new w());
       if (b.d()) {
          this.h.U7(new f());
       }
       this.h.f(this.getView());
       Object[] objArray = new Object[]{tg,this,this.i,this.c,tg.c};
       tg = this.g;
       this.h.i(objArray);
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideDetailContainerFragment.class, "8")) {
          return;
       }
       super.onConfigurationChanged(p0);
       b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, "onConfigurationChanged");
       g f = this.g.c.f;
       b = (p0.orientation == 2)? true: false;
       f.onNext(Boolean.valueOf(b));
       if (this.getActivity() == null) {
          return;
       }else if(!l1.a(a.B)){
          return;
       }else if(p0.orientation == 2){
          this.getActivity().getWindow().clearFlags(2048);
          this.getActivity().getWindow().addFlags(1024);
       }else {
          this.getActivity().getWindow().clearFlags(1024);
          if (this.i.mIsSoloLiveStream != null) {
             i.a(this.getActivity(), 0, 0);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSlideDetailContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d0dcb, p1, false);
       this.j = view;
       return view;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSlideDetailContainerFragment.class, "15")) {
          return;
       }
       super.onDestroyView();
       LiveSlideDetailContainerFragment th = this.h;
       if (th != null) {
          th.destroy();
       }
       th = this.l;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoid(objArray, th, f.class, "2")) {
          f a = th.a;
          if (a instanceof l) {
             a.release();
          }
       }
       b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, "onDestroyView");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSlideDetailContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveBizParam liveBizParam = a.e(this.getActivity()).a();
       this.i = liveBizParam;
       this.l = new f(liveBizParam, this.getActivity().getIntent());
       LiveSlideDetailContainerFragment tj = this.j;
       ViewGroup$MarginLayoutParams obj = null;
       if (!PatchProxy.applyVoidOneRefs(tj, obj, p.class, "4")) {
          p1 = PatchProxy.apply(obj, obj, a.class, "21");
          b = false;
          if (p1 != PatchProxyResult.class) {
             b = p1.booleanValue();
          }else if(!a.R() && l.c("enableLiveEcoDebugMode", b)){
             b = true;
          }
          if (b) {
             TextView textView = new TextView(tj.getContext());
             textView.setText("Ö±²¥ÐÂÈÝÆ÷");
             textView.setTextColor(a1.a(R.color.arg_RES_7f061c32));
             obj = new ViewGroup$MarginLayoutParams(-2, -2);
             obj.topMargin = a1.e(188.00f);
             obj.leftMargin = a1.e(10.00f);
             tj.addView(textView, obj);
          }
       }
       this.k = this.j.findViewById(0x7f0a25b5);
       b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, "onViewCreated");
       return;
    }
}
