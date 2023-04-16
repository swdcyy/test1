package com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import ml8.d;
import com.kuaishou.live.common.core.basic.fragment.LiveBaseFragment;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment$b;
import gy2.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gy2.i;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import gy2.g;
import android.animation.Animator;
import gy2.g$a;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import ez0.j;
import erd.g;
import crd.b;
import mk1.h;
import ez0.i;
import mk1.a;
import mk1.b;
import mk1.x;
import mk1.a0;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import i2b.a;
import ia2.a;
import tkd.b;
import tkd.d;
import ym5.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import t02.a0;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveGiftPanelItemView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import ez0.g;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import va1.i0;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment$c;
import d01.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u01.b;
import w01.h;
import androidx.lifecycle.LifecycleOwner;
import x01.a;
import qz0.h;
import qz0.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a;
import p01.q;
import pz0.p;
import zz0.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import a01.i;
import rz0.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import tz0.n;
import p01.c;
import p01.l;
import mz0.a;
import nz0.f;
import l01.c;
import g01.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import oz0.f;
import e01.b;
import m01.b;
import c01.e;
import jz0.e;
import iz0.i;
import t01.a;
import ll1.b;
import o01.d;
import com.kwai.framework.model.user.UserInfo;
import java.util.Iterator;
import java.util.List;
import jk1.c;
import jk1.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ik1.a0;
import z12.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import d61.y;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import q91.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$AudienceWidget;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$a;
import oh1.c;
import wk1.b;
import android.view.LayoutInflater;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import lnc.b9;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import n66.c;
import tj3.k;
import tj3.e;
import java.lang.System;
import z12.n;
import kuaishou.perf.page.impl.b;

public class LiveAudienceGiftBoxFragment extends LiveBaseFragment implements d	// class@000af9
{
    public b A;
    public boolean B;
    public KwaiImageView C;
    public FrameLayout D;
    public int E;
    public o F;
    public a G;
    public final c H;
    public String j;
    public GiftAnimContainerView k;
    public a l;
    public b m;
    public a0 n;
    public e o;
    public LiveBizParam p;
    public a q;
    public a0 r;
    public List s;
    public q t;
    public View u;
    public View v;
    public LiveGiftBoxPopupView w;
    public LiveAudienceGiftBoxView x;
    public LiveAudienceGiftBoxFragment$c y;
    public h z;
    public static final int I;

    public void LiveAudienceGiftBoxFragment(){
       super();
       this.j = "LiveAudienceGiftBoxFragment";
       this.E = 0;
       this.G = new LiveAudienceGiftBoxFragment$a(this);
       this.H = new LiveAudienceGiftBoxFragment$b(this);
    }
    public e D6(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceGiftBoxFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(1);
    }
    public boolean ch(){
       boolean b;
       LiveAudienceGiftBoxFragment obj = PatchProxy.apply(null, this, LiveAudienceGiftBoxFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isAdded()) {
          obj = this.w;
          if (obj != null && obj.getParent() != null) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxFragment.class, "1")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a1092);
       return;
    }
    public void jc(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "26")) {
          return;
       }
       LiveAudienceGiftBoxFragment tw = this.w;
       if (tw != null) {
          Animator uAnimator = PatchProxy.applyOneRefs(tw, objArray, g.class, "2");
          if (uAnimator != PatchProxyResult.class) {
          }else {
             uAnimator = g.a.a(tw);
          }
          uAnimator.start();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       LiveAudienceGiftBoxFragment m1;
       b n;
       boolean indexInAdapt;
       b uob = this;
       if (PatchProxy.applyVoidOneRefs(p0, uob, LiveAudienceGiftBoxFragment.class, "13")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, uob, LiveAudienceGiftBoxFragment.class, "22") && uob.A == null) {
          uob.A = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new j(uob));
       }
       if (!PatchProxy.applyVoid(objArray, uob, LiveAudienceGiftBoxFragment.class, "15")) {
          h oh = new h(this, uob.l, uob.m, new i(uob), uob.r);
          uob.z = v8;
          v8.n = uob.o;
          v8.k = uob.u;
          v8.l = uob.G;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 4;
       a0 uoa0 = 3;
       String str = 5;
       int i1 = 8;
       int i2 = 2;
       int i3 = 0;
       if (PatchProxy.apply(objArray, uob, LiveAudienceGiftBoxFragment.class, "19") != patchProxyRe) {
       }else {
          uob.w.setAttachTargetView(uob.v);
          uob.w.setMinInitialTopOffset(i3);
          View view = PatchProxy.apply(objArray, uob, LiveAudienceGiftBoxFragment.class, "20");
          m1 = 0x7f0a0c4e;
          if (view != patchProxyRe) {
          }else {
             view = a.i(uob.w, 0x7f0d0a12);
             if (a.c() && !d.a(0x4c5dd1b8).f2()) {
                ViewGroup$MarginLayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = n.j(this.getActivity());
                layoutParams2.width = n.j(this.getActivity());
                view.setLayoutParams(layoutParams2);
                View view1 = view.findViewById(m1);
                ViewGroup$MarginLayoutParams layoutParams3 = view1.getLayoutParams();
                layoutParams3.setMarginStart(i3);
                view1.setLayoutParams(layoutParams3);
                view1 = view.findViewById(R.id.live_privilege_gift_title_container);
                layoutParams3 = view1.getLayoutParams();
                layoutParams3.setMarginStart(a1.e(0x41f00000));
                view1.setLayoutParams(layoutParams3);
                view1 = view.findViewById(R.id.live_fans_group_gift_title_container);
                layoutParams3 = view1.getLayoutParams();
                layoutParams3.setMarginStart(a1.e(0x41f00000));
                view1.setLayoutParams(layoutParams3);
                view1 = view.findViewById(R.id.live_gift_packet_title_container);
                layoutParams3 = view1.getLayoutParams();
                layoutParams3.setMarginStart(a1.e(0x41f00000));
                view1.setLayoutParams(layoutParams3);
                view1 = view.findViewById(R.id.live_props_title_container);
                layoutParams3 = view1.getLayoutParams();
                layoutParams3.setMarginStart(a1.e(0x41f00000));
                view1.setLayoutParams(layoutParams3);
             }
          }
          uob.x = view;
          DrawingGiftEditView uDrawingGift = uob.w.findViewById(R.id.drawing_gift_edit_panel);
          view = uob.w.findViewById(R.id.background);
          LiveAudienceGiftBoxFragment x1 = uob.x;
          LiveAudienceGiftBoxFragment w = uob.w;
          indexInAdapt = a.c();
          a0 s = uob.n.s;
          Objects.requireNonNull(x1);
          if (PatchProxy.isSupport(LiveAudienceGiftBoxView.class)) {
             objArray = new Object[str];
             objArray[i3] = uDrawingGift;
             objArray[1] = view;
             objArray[i2] = w;
             objArray[uoa0] = Boolean.valueOf(indexInAdapt);
             objArray[i] = Boolean.valueOf(s);
             if (PatchProxy.applyVoid(objArray, x1, LiveAudienceGiftBoxView.class, "2")) {
             label_021d :
                i0.b(this.getActivity(), uob.x);
                i0.b(this.getActivity(), uDrawingGift);
                uob.w.setDragEnable(i3);
                uob.w.setContentView(uob.x);
                uob.w.setOnScrollListener(new b(uob, uob.w.findViewById(R.id.container), uDrawingGift));
             }
          }
          x1.b = w;
          x1.p = indexInAdapt;
          x1.d = uDrawingGift;
          x1.n = w.findViewById(0x7f0a1d00);
          x1.f = view;
          view.setVisibility(i1);
          x1.i = x1.findViewById(0x7f0a109d);
          x1.m = x1.findViewById(0x7f0a109b);
          LiveGiftPanelItemView liveGiftPane = x1.findViewById(R.id.packet_gift_layout);
          x1.j = liveGiftPane;
          liveGiftPane.setVisibility(i1);
          x1.k = x1.findViewById(0x7f0a1098);
          x1.l = x1.findViewById(0x7f0a2eda);
          LiveGiftTitleView liveGiftTitl = x1.findViewById(R.id.drawing_gift_title);
          x1.c = liveGiftTitl;
          liveGiftTitl.setSelected(1);
          x1.g = x1.findViewById(m1);
          x1.m.setBackground(a1.f(g.a()));
          x1.h = x1.findViewById(0x7f0a109a);
          x1.s = x1.findViewById(0x7f0a0be0);
          x1.q = s;
          x1.e = x1.b.findViewById(0x7f0a0792);
          goto label_021d ;
       }
       if (!PatchProxy.applyVoid(null, uob, LiveAudienceGiftBoxFragment.class, "14")) {
          LiveAudienceGiftBoxFragment$c uoc = new LiveAudienceGiftBoxFragment$c(uob.z);
          uob.y = uoc;
          uoc.U7(new g());
          uob.y.U7(new b());
          uob.y.U7(new h(uob));
          uob.y.U7(new a(uob));
          uob.y.U7(new h());
          uob.y.U7(new d());
          uob.y.U7(new a(uob.t));
          uob.y.U7(new p());
          uob.y.U7(new d(uob.F));
          uob.y.U7(new i(uob.F));
          uob.y.U7(new d(uob.F));
          uob.y.U7(new c(uob.F));
          uob.y.U7(new n(uob, uob.F));
          uob.y.U7(new c());
          uob.y.U7(new l(1, uob.t));
          uob.y.U7(new a(uob.t));
          uob.y.U7(new f());
          uob.y.U7(new c());
          uob.y.U7(new b());
          uob.y.U7(new d());
          uob.y.U7(new f());
          uob.y.U7(new b());
          uob.y.U7(new b());
          uob.y.U7(new e());
          uob.y.U7(new e());
          uob.y.U7(new i());
          uob.y.U7(new a());
          uob.y.f(uob.w);
          uob.y.U7(new b());
          uob.y.U7(new d());
       }
       Object[] objArray1 = new Object[i2];
       objArray1[i3] = uob.z;
       objArray1[1] = uob.n;
       uob.y.i(objArray1);
       LiveAudienceGiftBoxFragment x = uob.x;
       LiveAudienceGiftBoxFragment m = uob.m;
       Objects.requireNonNull(x);
       str = "4";
       if (!PatchProxy.applyVoidOneRefs(m, x, LiveAudienceGiftBoxView.class, str) && m != null) {
          x.o = m;
          x.g.setVisibility(i3);
       }
       m1 = uob.m;
       if (!PatchProxy.applyVoidOneRefs(m1, uob, LiveAudienceGiftBoxFragment.class, "16") && m1 != null) {
          UserInfo userInfo = m1.e();
          Iterator iterator = uob.s.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(uob.x, userInfo);
          }
          if (!PatchProxy.applyVoid(null, uob, LiveAudienceGiftBoxFragment.class, "17")) {
             ViewGroup$LayoutParams layoutParams = uob.w.getLayoutParams();
             i = -1;
             layoutParams.width = i;
             layoutParams.height = i;
             uob.w.setLayoutParams(layoutParams);
             m = uob.w;
             Objects.requireNonNull(m);
             String str1 = "18";
             if (!PatchProxy.applyVoid(null, m, LiveGiftBoxPopupView.class, str1)) {
                ViewGroup$LayoutParams layoutParams1 = m.getLayoutParams();
                if (layoutParams1 == null) {
                   m.k(i, i);
                }else {
                   m.k(layoutParams1.width, layoutParams1.height);
                }
             }
             Object[] objArray3 = null;
             if (!PatchProxy.applyVoid(objArray3, uob, LiveAudienceGiftBoxFragment.class, str1)) {
                if (this.getActivity() instanceof GifshowActivity) {
                   a0.s(this.getActivity());
                }else {
                   a0.s(objArray3);
                }
             }
             String[] stringArray = new String[i3];
             e.c(this.getActivity().getUrl(), "gift", stringArray);
          }
          m = uob.n;
          a0 c = m.c;
          ClientContent$LiveStreamPackage liveStreamPa = m.Z2.a();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = uob.n.Z2.y();
          int i4 = m1.i();
          n = m1.n;
          indexInAdapt = uob.n.B.getIndexInAdapter();
          boolean b = y.d(this.getActivity());
          uoa0 = a0.class;
          if (PatchProxy.isSupport(uoa0)) {
             Object[] objArray2 = new Object[i1];
             objArray2[i3] = userInfo;
             objArray2[1] = c;
             objArray2[i2] = liveStreamPa;
             objArray2[3] = liveVoicePar;
             objArray2[4] = Integer.valueOf(i4);
             objArray2[5] = Integer.valueOf(n);
             objArray2[6] = Integer.valueOf(indexInAdapt);
             objArray2[7] = Boolean.valueOf(b);
             if (PatchProxy.applyVoid(objArray2, null, uoa0, str)) {
             label_0508 :
                if (!PatchProxy.isSupport(LiveAudienceGiftBoxFragment.class) || !PatchProxy.applyVoidFourRefs(m1, "CLIENT_GIFT_BOX_SHOW", "[LiveAudienceGiftBoxFragment][showGiftBox]show gift box", Integer.valueOf(1), this, LiveAudienceGiftBoxFragment.class, "28")) {
                   if (!uob.o.b()) {
                      uob.q.yk(uob.q.o6().D(m1)).d("CLIENT_GIFT_BOX_SHOW").f("PRE_SEND_GIFT").g(1).e("[LiveAudienceGiftBoxFragment][showGiftBox]show gift box").a();
                   }else {
                      b.P(b.a, "[LiveAudienceGiftBoxFragment][logTraceInfo]service manager cleared");
                   }
                }
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 4;
          uElementPack.name = "expand_gift_dialog";
          uElementPack.action = 885;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (userInfo != null) {
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = userInfo.mId;
          }
          uContentPack.liveVoicePartyPackage = liveVoicePar;
          uContentPack.photoPackage = a.b(c, indexInAdapt);
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          uContentPack.giftPackage = giftPackage;
          giftPackage.sourceType = i4;
          ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
          uDistrictRan.rankType = n;
          uContentPack.districtRankPackage = uDistrictRan;
          uContentPack.screenPackage = a.d(b);
          u1.G("", 1, uElementPack, uContentPack);
          goto label_0508 ;
       }
    label_055f :
       uob.n.S().c(LiveWidgetVisibilityStatusService$AudienceWidget.GIFT_BOX);
       uob.z.A.b(uob.H);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceGiftBoxFragment.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.v = p1;
       this.w = LiveGiftBoxPopupView.g(this.getActivity(), 0x7f0d0a10);
       this.doBindView(this.u);
       this.n.Z2.A0().Pj(AudienceBizRelation.GIFT_BOX);
       return this.w;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.y.unbind();
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "12") && this.x != null) {
          i0.e(this.getActivity(), this.x);
          LiveAudienceGiftBoxFragment tw = this.w;
          if (tw != null) {
             i0.e(this.getActivity(), tw.findViewById(R.id.drawing_gift_edit_panel));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "23")) {
          b9.a(this.A);
          this.A = objArray;
       }
       this.n.S().b(LiveWidgetVisibilityStatusService$AudienceWidget.GIFT_BOX);
       this.n.Z2.A0().yj(AudienceBizRelation.GIFT_BOX);
       this.z.A.a(this.H);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxFragment.class, "10")) {
          return;
       }
       super.onPause();
       FpsMonitor.stopSection(this.j, this.getActivity());
       c.c(this.j);
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "9")) {
          return;
       }
       super.onResume();
       k ok = this.n.d3.x();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoid(objArray, ok, k.class, "35") && !ok.p0 - null) {
          ok.p0 = System.currentTimeMillis() - ok.t0;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, n.class, "7")) {
          b.d("live_click_to_destroy").h("GiftPanelReactDuration");
       }
       FpsMonitor.startSection(this.j, this.getActivity());
       c.a(this.j);
       return;
    }
    public void xc(e p0){
    }
    public void zc(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment.class, "25")) {
          return;
       }
       LiveAudienceGiftBoxFragment tw = this.w;
       if (tw != null) {
          Animator uAnimator = PatchProxy.applyOneRefs(tw, objArray, g.class, "1");
          if (uAnimator != PatchProxyResult.class) {
          }else {
             uAnimator = g.a.b(tw);
          }
          uAnimator.start();
       }
       return;
    }
}
