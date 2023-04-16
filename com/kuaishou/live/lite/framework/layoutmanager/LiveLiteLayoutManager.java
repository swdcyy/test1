package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import com.kuaishou.live.lite.LiveLiteParam;
import android.app.Activity;
import eq3.d;
import com.kwai.video.waynelive.LivePlayerController;
import brd.t;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import lc3.b;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;
import java.lang.Number;
import eb3.a;
import crd.a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$b;
import android.view.View;
import ha1.b;
import java.util.Objects;
import com.kuaishou.live.lite.framework.layoutmanager.widget.LayoutManagerRootView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import java.util.Set;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import kc3.c;
import com.kuaishou.live.lite.performance.a;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initViewContainers$attachContainer$1;
import msd.p;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import com.kuaishou.live.lite.performance.LivePerformanceMonitorFrameLayout;
import ec3.t;
import java.util.List;
import ec3.b;
import java.lang.Runnable;
import ekd.k1;
import java.util.Iterator;
import eb3.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import cb3.h;
import cb3.c;
import mrd.c;
import bb3.g;
import brd.w;
import erd.k;
import bb3.h;
import erd.g;
import crd.b;
import krd.a;
import cb3.d;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initServices$3;
import msd.a;
import cb3.b;
import cb3.g;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initServices$4;
import vb3.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import qrd.l1;
import cb3.e;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.lite.layoutmanager.StageType;
import vb3.c;
import o83.i;
import bb3.j;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import db3.i;
import java.lang.StringBuilder;
import eb3.e;
import erd.a;
import crd.c;
import a2.i0;
import usd.q;
import android.graphics.Rect;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$a;
import android.view.View$OnLayoutChangeListener;
import android.os.Handler;
import db3.g;
import eb3.f;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import le5.f;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewPropertyAnimator;
import com.kuaishou.live.lite.framework.layoutmanager.util.LayoutMarginAnimation;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1;
import android.view.animation.Animation;

public final class LiveLiteLayoutManager	// class@000917
{
    public final c A;
    public final FrameLayout B;
    public final c C;
    public final a D;
    public final h E;
    public n F;
    public b G;
    public d H;
    public g I;
    public e J;
    public e K;
    public f L;
    public final LiveLiteParam M;
    public final Activity N;
    public final d O;
    public final LivePlayerController P;
    public final t Q;
    public final t R;
    public final FrameLayout S;
    public final LifecycleOwner T;
    public final b U;
    public final a V;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final Map k;
    public final LayoutManagerRootView l;
    public final ViewGroup m;
    public final ViewGroup n;
    public b o;
    public final ViewGroup p;
    public final ViewGroup q;
    public final Guideline r;
    public final View s;
    public View t;
    public final a u;
    public ViewControllerManagerImpl v;
    public final Set w;
    public FrameLayout x;
    public FrameLayout y;
    public final View z;

    public void LiveLiteLayoutManager(LiveLiteParam p0,Activity p1,d p2,LivePlayerController p3,t p4,t p5,FrameLayout p6,LifecycleOwner p7,b p8,a p9){
       int i5;
       LinkedHashMap linkedHashMa1;
       b uob;
       LiveLiteLayoutManager o;
       LiveLiteLayoutManager v;
       LiveLiteLayoutManager i8;
       LiveLiteLayoutManager liveLiteLayo = this;
       ArrayList obj = p0;
       View obj1 = p1;
       Object[] obj2 = p2;
       LiveStreamFeed obj3 = p3;
       View obj4 = p4;
       View obj5 = p5;
       View obj6 = p6;
       View obj7 = p7;
       View obj8 = p8;
       Object obj9 = p9;
       a.p(obj, "liveLiteParam");
       a.p(obj1, "activity");
       a.p(obj2, "vcManager");
       a.p(obj3, "playController");
       a.p(obj4, "sideBarFoldState");
       a.p(obj5, "clearScreenOpacity");
       a.p(obj6, "extensionContainer");
       a.p(obj7, "lifecycleOwner");
       a.p(obj8, "playerLayoutService");
       a.p(obj9, "stageLayoutState");
       super();
       liveLiteLayo.M = obj;
       liveLiteLayo.N = obj1;
       liveLiteLayo.O = obj2;
       liveLiteLayo.P = obj3;
       liveLiteLayo.Q = obj4;
       liveLiteLayo.R = obj5;
       liveLiteLayo.S = obj6;
       liveLiteLayo.T = obj7;
       liveLiteLayo.U = obj8;
       liveLiteLayo.V = obj9;
       int i = a1.d(R.dimen.arg_RES_7f070bf1);
       liveLiteLayo.a = i;
       obj3 = p0.getLiveStreamFeed().mLiveStreamModel;
       int i1 = 0;
       LiveStreamModel mIsGRPRCusto = (obj3 != null)? obj3.mIsGRPRCustomized: false;
       liveLiteLayo.b = mIsGRPRCusto;
       boolean b = p0.isAdaptBottomBar();
       liveLiteLayo.c = b;
       boolean i2 = (b && !this.f())? i: 0;
       liveLiteLayo.d = i2;
       int i3 = n.A(p1) + a1.d(0x7f070fdf);
       liveLiteLayo.e = i3;
       int i4 = n.A(p1) + a.a(obj1, Integer.valueOf(40));
       liveLiteLayo.f = i4;
       liveLiteLayo.g = new a();
       a uoa = a.h(Integer.valueOf(-1));
       a.o(uoa, "BehaviorSubject.createDefault\(-1\)");
       liveLiteLayo.h = uoa;
       uoa = a.h(Integer.valueOf(-1));
       a.o(uoa, "BehaviorSubject.createDefault\(-1\)");
       liveLiteLayo.i = uoa;
       uoa = a.h(Integer.valueOf(i1));
       a.o(uoa, "BehaviorSubject.createDefault\(0\)");
       liveLiteLayo.j = uoa;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       liveLiteLayo.k = linkedHashMa;
       a uoa1 = a.g();
       a.o(uoa1, "BehaviorSubject.create<Pair<StageType, Rect>>\(\)");
       liveLiteLayo.u = uoa1;
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       liveLiteLayo.w = linkedHashSe;
       liveLiteLayo.E = new LiveLiteLayoutManager$b(liveLiteLayo);
       View view = b.b(obj1, R.layout.live_lite_layout);
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.lite.framework.layoutmanager.widget.LayoutManagerRootView");
       liveLiteLayo.l = view;
       view.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       if (PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "30")) {
          i5 = i2;
          linkedHashMa1 = linkedHashMa;
       }else {
          FrameLayout uFrameLayout = liveLiteLayo.g(R.id.live_lite_player_view_background_container);
          liveLiteLayo.x = uFrameLayout;
          if (uFrameLayout == null) {
             a.S("playerViewBackgroundContainer");
          }
          i1 = d.a;
          linkedHashMa1 = linkedHashMa;
          LayoutViewType playerViewBa1 = LayoutViewType.PlayerViewBackground;
          i5 = i2;
          uFrameLayout.setTag(i1, playerViewBa1.name());
          v = liveLiteLayo.x;
          if (v == null) {
             a.S("playerViewBackgroundContainer");
          }
          obj6.addView(v);
          linkedHashSe.add(playerViewBa1);
          FrameLayout uFrameLayout1 = liveLiteLayo.g(R.id.live_lite_voice_party_background_container);
          liveLiteLayo.y = uFrameLayout1;
          if (uFrameLayout1 == null) {
             a.S("voicePartyBackgroundContainer");
          }
          uFrameLayout1.setTag(i1, playerViewBa1.name());
          v = liveLiteLayo.y;
          if (v == null) {
             a.S("voicePartyBackgroundContainer");
          }
          obj6.addView(v);
          linkedHashSe.add(LayoutViewType.VoicePartyBackground);
          liveLiteLayo.v = new ViewControllerManagerImpl(obj7, obj1, ViewHost.a.b(obj6));
       }
       obj1 = view.findViewById(R.id.live_lite_player_card_view_container_place_holder);
       a.o(obj1, "layoutRoot.findViewById\(¡­w_container_place_holder\)");
       liveLiteLayo.z = obj1;
       i2 = 0x7f0a20de;
       obj4 = view.findViewById(i2);
       a.o(obj4, "layoutRoot.findViewById\(¡­t_container_place_holder\)");
       liveLiteLayo.B = obj4;
       c uoc = obj8.c(obj1);
       liveLiteLayo.A = uoc;
       uoc.b();
       uoc = obj8.a(obj4);
       liveLiteLayo.C = uoc;
       uoc.b();
       a uoa2 = new a();
       liveLiteLayo.D = uoa2;
       obj4 = view.findViewById(R.id.bulletin_area);
       a.o(obj4, "layoutRoot.findViewById\(R.id.bulletin_area\)");
       liveLiteLayo.n = obj4;
       i1 = 0x7f0a10b8;
       obj6 = view.findViewById(i1);
       a.o(obj6, "layoutRoot.findViewById\(R.id.gift_slot_container\)");
       liveLiteLayo.p = obj6;
       int i6 = 0x7f0a046b;
       obj7 = view.findViewById(i6);
       a.o(obj7, "layoutRoot.findViewById\(R.id.bottom_area\)");
       liveLiteLayo.m = obj7;
       int i7 = 0x7f0a1418;
       obj8 = view.findViewById(i7);
       a.o(obj8, "layoutRoot.findViewById\(¡­active_message_container\)");
       liveLiteLayo.q = obj8;
       obj8 = view.findViewById(R.id.bottom_bubble_top_guideline);
       a.o(obj8, "layoutRoot.findViewById\(¡­tom_bubble_top_guideline\)");
       liveLiteLayo.r = obj8;
       obj8 = view.findViewById(R.id.bottom_bar_guide_line);
       a.o(obj8, "layoutRoot.findViewById\(¡­id.bottom_bar_guide_line\)");
       liveLiteLayo.s = obj8;
       if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "10")) {
          view.findViewById(R.id.live_lite_top_navbar_guideline).setGuidelineBegin(i3);
          obj5 = view.findViewById(R.id.layout_topbar_line);
          a.o(obj5, "layoutRoot.findViewById\(R.id.layout_topbar_line\)");
          ViewGroup$LayoutParams layoutParams2 = obj5.getLayoutParams();
          Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams2.topMargin = i4;
          obj5.setLayoutParams(layoutParams2);
       }
       if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "11")) {
          obj5 = view.findViewById(R.id.layout_bottom_line);
          a.o(obj5, "layoutRoot.findViewById\(R.id.layout_bottom_line\)");
          liveLiteLayo.t = obj5;
          if (b && this.f()) {
             i8 = liveLiteLayo.t;
             String str2 = "layoutBottomLine";
             if (i8 == null) {
                a.S(str2);
             }
             ViewGroup$LayoutParams layoutParams1 = i8.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams1.bottomMargin = i;
             o = liveLiteLayo.t;
             if (o == null) {
                a.S(str2);
             }
             o.setLayoutParams(layoutParams1);
          }
       }
       if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "13")) {
          LiveLiteLayoutManager$initViewContainers$attachContainer$1 oinitViewCon = new LiveLiteLayoutManager$initViewContainers$attachContainer$1(liveLiteLayo);
          oinitViewCon.invoke(LayoutViewType.AnchorInfoBar, Integer.valueOf(R.id.anchor_info_container));
          oinitViewCon.invoke(LayoutViewType.RecommendAnchorInfoBar, Integer.valueOf(R.id.recommend_anchor_info_container));
          oinitViewCon.invoke(LayoutViewType.TempPlayArea, Integer.valueOf(R.id.temp_play_area));
          oinitViewCon.invoke(LayoutViewType.RightBottomBar, Integer.valueOf(R.id.right_bottom_bar_container));
          oinitViewCon.invoke(LayoutViewType.BottomBar, Integer.valueOf(R.id.bottom_bar_container));
          oinitViewCon.invoke(LayoutViewType.CommentList, Integer.valueOf(R.id.comment_list_container));
          oinitViewCon.invoke(LayoutViewType.GiftSlot, Integer.valueOf(i1));
          oinitViewCon.invoke(LayoutViewType.GiftEffect, Integer.valueOf(R.id.gift_effect_container));
          oinitViewCon.invoke(LayoutViewType.LikeEffect, Integer.valueOf(R.id.like_effect_container));
          oinitViewCon.invoke(LayoutViewType.FullscreenLikeEffect, Integer.valueOf(R.id.fullscreen_like_effect_container));
          oinitViewCon.invoke(LayoutViewType.MultiChat, Integer.valueOf(i2));
          oinitViewCon.invoke(LayoutViewType.MultiChatV2, Integer.valueOf(i2));
          oinitViewCon.invoke(LayoutViewType.PK, Integer.valueOf(R.id.pk_stage_container));
          oinitViewCon.invoke(LayoutViewType.PlayerViewMask, Integer.valueOf(R.id.player_view_mask));
          oinitViewCon.invoke(LayoutViewType.SquareNoticeArea, Integer.valueOf(R.id.live_square_entry_container));
          oinitViewCon.invoke(LayoutViewType.EnterRoomMessage, Integer.valueOf(i7));
          oinitViewCon.invoke(LayoutViewType.PlayerDebugInfo, Integer.valueOf(R.id.lite_player_debug_info));
          oinitViewCon.invoke(LayoutViewType.TreasureBox, Integer.valueOf(R.id.live_lite_encourage_treasure_box_draggable_container));
          oinitViewCon.invoke(LayoutViewType.BottomBubble, Integer.valueOf(R.id.bottom_bubble));
          oinitViewCon.invoke(LayoutViewType.CommentAreaAnimation, Integer.valueOf(R.id.comment_area_animation_container));
          oinitViewCon.invoke(LayoutViewType.ComboComment, Integer.valueOf(R.id.combo_comment_area));
          oinitViewCon.invoke(LayoutViewType.DebugContainerView, Integer.valueOf(R.id.lite_debug_view_container));
          oinitViewCon.invoke(LayoutViewType.MultiLine, Integer.valueOf(R.id.pk_stage_container));
          ViewGroup viewGroup = oinitViewCon.invoke(LayoutViewType.VoicePartyContent, Integer.valueOf(R.id.voice_party_content));
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.bottomMargin = - i5;
          viewGroup.setLayoutParams(layoutParams);
          LayoutViewType playerViewBa = LayoutViewType.PlayerViewBackground;
          o = liveLiteLayo.x;
          if (o == null) {
             a.S("playerViewBackgroundContainer");
          }
          LinkedHashMap linkedHashMa2 = linkedHashMa1;
          linkedHashMa2.put(playerViewBa, o);
          playerViewBa = LayoutViewType.VoicePartyBackground;
          o = liveLiteLayo.y;
          if (o == null) {
             a.S("voicePartyBackgroundContainer");
          }
          linkedHashMa2.put(playerViewBa, o);
          a uoa3 = a.class;
          String str = 1;
          if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "14") && a.d) {
             ArrayList uArrayList = new ArrayList(linkedHashMa2.values());
             if (!PatchProxy.applyVoidOneRefs(uArrayList, uoa2, uoa3, "1")) {
                View view1 = uArrayList.get(new Random().nextInt(uArrayList.size()));
                if (view1 instanceof LivePerformanceMonitorFrameLayout) {
                   t ot1 = new t();
                   uoa2.b.add(ot1);
                   view1.setPerformanceDelegate(ot1);
                }
             }
             if (!PatchProxy.applyVoid(null, uoa2, uoa3, "2")) {
                uoa2.a = str;
                k1.o(uoa2.c);
                Iterator iterator = uoa2.b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a = str;
                }
             }
          }
          if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "15")) {
             LivePerformanceMonitorFrameLayout[] livePerforma = new LivePerformanceMonitorFrameLayout[]{obj5,obj5};
             obj5 = liveLiteLayo.k.get(LayoutViewType.CommentList);
             String str1 = "null cannot be cast to non-null type com.kuaishou.live.lite.performance.LivePerformanceMonitorFrameLayout";
             Objects.requireNonNull(obj5, str1);
             obj5 = liveLiteLayo.k.get(LayoutViewType.EnterRoomMessage);
             Objects.requireNonNull(obj5, str1);
             uob = new b((float)a1.e(20.00f), liveLiteLayo.l, CollectionsKt__CollectionsKt.L(livePerforma));
          }
       }
       if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "16")) {
          LiveLiteLayoutManager k = liveLiteLayo.k;
          o = liveLiteLayo.O;
          v = liveLiteLayo.v;
          if (v == null) {
             a.S("extensionVCManager");
          }
          liveLiteLayo.F = new h(k, o, v, liveLiteLayo.w);
          liveLiteLayo.L = new c(liveLiteLayo.j);
          t ot = t.combineLatest(liveLiteLayo.h, liveLiteLayo.i, liveLiteLayo.V, liveLiteLayo.j, liveLiteLayo.Q, liveLiteLayo.A.a(), new g(liveLiteLayo));
          a.h(ot, "Observable.combineLatest¡­1, t2, t3, t4, t5, t6\) }\)");
          b uob1 = ot.subscribe(h.b);
          a.o(uob1, "Observables.combineLates¡­ght\)\n    }.subscribe {  }");
          a.b(liveLiteLayo.g, uob1);
          liveLiteLayo.H = new d(liveLiteLayo.O, new LiveLiteLayoutManager$initServices$3(liveLiteLayo));
          liveLiteLayo.G = new b(liveLiteLayo.h, liveLiteLayo.i);
          liveLiteLayo.I = new g(new LiveLiteLayoutManager$initServices$4(liveLiteLayo));
          e uoe = new e();
          k = liveLiteLayo.N;
          Objects.requireNonNull(k, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          k.F2(uoe);
          liveLiteLayo.J = uoe;
          obj1 = liveLiteLayo.l.findViewById(R.id.layout_topbar_line);
          a.o(obj1, "layoutRoot.findViewById\(R.id.layout_topbar_line\)");
          c obj10 = liveLiteLayo.k.get(LayoutViewType.BottomBar);
          a.m(obj10);
          liveLiteLayo.K = new e(obj1, obj10);
          if (!PatchProxy.applyVoid(null, liveLiteLayo, LiveLiteLayoutManager.class, "19")) {
             LiveStreamFeed mConfig = liveLiteLayo.M.getLiveStreamFeed().mConfig;
             if (mConfig == null || mConfig.mStreamType != StreamType.VOICEPARTY.toInt()) {
                i8 = liveLiteLayo.I;
                if (i8 == null) {
                   a.S("liveStageChangeNotifyService");
                }
                obj10 = null;
                i8.d(StageType.Show, obj10);
             label_0573 :
                if (!PatchProxy.applyVoid(obj2, liveLiteLayo, LiveLiteLayoutManager.class, "12")) {
                   obj = new ArrayList();
                   obj.add(liveLiteLayo.k.get(LayoutViewType.TempPlayArea));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.SquareNoticeArea));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.GiftSlot));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.CommentList));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.EnterRoomMessage));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.BottomBubble));
                   obj.add(liveLiteLayo.k.get(LayoutViewType.RightBottomBar));
                   obj.add(liveLiteLayo.l.findViewById(i6));
                   if (!i.a()) {
                      obj.add(liveLiteLayo.k.get(LayoutViewType.AnchorInfoBar));
                   }
                   uob = liveLiteLayo.R.subscribe(new j(obj));
                   a.o(uob, "clearScreenOpacity.subsc¡­}\n        }\n      }\n    }");
                   a.b(liveLiteLayo.g, uob);
                }
                b.f0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveLiteLayoutManager onCreate", "target", this, "isGRPRCustomized", Boolean.valueOf(liveLiteLayo.b), "hasNavBar", Boolean.valueOf(liveLiteLayo.c), "isNavBarTransparent", Boolean.valueOf(this.f()));
                return;
             }
          }
       }
    label_0562 :
       obj2 = null;
       goto label_0573 ;
    }
    public final void a(i p0){
       int i;
       b uob1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteLayoutManager.class, "24")) {
          return;
       }
       LiveLiteLayoutManager o = obj.o;
       if (o != null) {
          o.dispose();
       }
       i a = obj1.a;
       i c = obj1.c;
       if (a > null) {
          ViewGroup$LayoutParams layoutParams = obj.n.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.height = a;
          i = (!p0.c())? a1.e(78.00f): p0.c();
          layoutParams.rightMargin = i;
          obj.n.setLayoutParams(layoutParams);
       }else {
          LiveLiteLogTag lAYOUT_MANAG = LiveLiteLogTag.LAYOUT_MANAGER;
          b.Z(lAYOUT_MANAG, "post adjustCommentList "+p0.hashCode());
          LiveLiteLayoutManager l = obj.l;
          b uob = c.c(e.b);
          a.o(uob, "Disposables.fromAction { }");
          if (i0.Y(l) && !l.isLayoutRequested()) {
             if (!uob.isDisposed()) {
                b.Z(lAYOUT_MANAG, "post do adjustCommentList "+p0.hashCode());
                int i1 = obj.m.getTop() - obj.z.getBottom();
                i = (i1 - p0.d()) - a.b(obj.l, Integer.valueOf(10));
                Integer integer = Integer.valueOf(i1);
                b.e0(lAYOUT_MANAG, "adjustCommentList", "freeHeight", integer, "giftSlotHeight", Integer.valueOf(p0.d()), "comment list height", Integer.valueOf(i));
                obj.a(i.a(p0, q.n(i, c), 0, 0, 0, 0, 0, 0, 0, null, false, false, false, false, 0, 0, 0, 0, 0, null, 0x7fffa, null));
                l1 a1 = l1.a;
             }
             uob1 = uob;
          }else {
             uob1 = uob;
             LiveLiteLayoutManager$a uoa = new LiveLiteLayoutManager$a(uob, l, this, p0, c);
             l.addOnLayoutChangeListener(lAYOUT_MANAG);
          }
          obj.o = uob1;
       }
       return;
    }
    public final void b(){
       g d;
       LiveLiteLayoutManager liveLiteLayo = LiveLiteLayoutManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteLayo, "9")) {
          return;
       }
       this.g.dispose();
       if (!PatchProxy.applyVoid(objArray, this, liveLiteLayo, "18")) {
          LiveLiteLayoutManager tI = this.I;
          if (tI == null) {
             a.S("liveStageChangeNotifyService");
          }
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoid(objArray, tI, g.class, "5")) {
             tI.a.removeCallbacks(tI.e);
             d = tI.d;
             if (d != null) {
                d.a();
             }
          }
          tI = this.H;
          if (tI == null) {
             a.S("dialogService");
          }
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoid(objArray, tI, d.class, "1")) {
             tI.g();
          }
          tI = this.N;
          Objects.requireNonNull(tI, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          LiveLiteLayoutManager tJ = this.J;
          if (tJ == null) {
             a.S("backPressedService");
          }
          tI.l3(tJ);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveLiteLayo, "32")) {
          this.S.removeAllViews();
       }
       if (!PatchProxy.applyVoid(objArray, this, liveLiteLayo, "33")) {
          this.A.c();
          this.C.c();
       }
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "LiveLiteLayoutManager onDestroy", "target", this);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLayoutManager.class, "27")) {
          return;
       }
       f a = f.a;
       LiveLiteLayoutManager tz = this.z;
       LiveLiteLayoutManager tl = this.l;
       Objects.requireNonNull(a);
       Rect rect = PatchProxy.applyTwoRefs(tz, tl, a, f.class, "2");
       if (rect != PatchProxyResult.class) {
       }else {
          a.p(tz, "$this$rectRelativeTo");
          a.p(tl, "rootView");
          int[] ointArray = new int[2];
          tz.getLocationInWindow(ointArray);
          int i = 0;
          tl.getLocationInWindow(ointArray);
          int i1 = ointArray[i] - ointArray[i];
          int i2 = ointArray[1] - ointArray[1];
          rect = new Rect(i1, i2, (tz.getWidth() + i1), (tz.getHeight() + i2));
       }
       tz = this.u;
       LiveLiteLayoutManager tI = this.I;
       if (tI == null) {
          a.S("liveStageChangeNotifyService");
       }
       tz.onNext(new Pair(tI.c, rect));
       return;
    }
    public final View d(){
       return this.l;
    }
    public final g e(){
       LiveLiteLayoutManager obj = PatchProxy.apply(null, this, LiveLiteLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       if (obj == null) {
          a.S("liveStageChangeNotifyService");
       }
       return obj;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (f.b() ^ 0x01);
    }
    public final FrameLayout g(int p0){
       FrameLayout obj;
       LiveLiteLayoutManager liveLiteLayo = LiveLiteLayoutManager.class;
       if (PatchProxy.isSupport(liveLiteLayo)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveLiteLayo, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new FrameLayout(this.N);
       obj.setId(p0);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       return obj;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLayoutManager.class, "26")) {
          return;
       }
       Integer integer = this.h.i();
       int i = 0;
       if (integer != null && a.t(integer.intValue(), i) > 0) {
          a.o(integer, "it");
          this.i(integer.intValue());
       }
       integer = this.i.i();
       if (integer != null && a.t(integer.intValue(), i) > 0) {
          a.o(integer, "it");
          this.j(integer.intValue());
       }
       return;
    }
    public final void i(int p0){
       LiveLiteLayoutManager liveLiteLayo = LiveLiteLayoutManager.class;
       if (PatchProxy.isSupport(liveLiteLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveLiteLayo, "29")) {
          return;
       }
       this.n.animate().cancel();
       ViewGroup$LayoutParams layoutParams = this.n.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       int i = 0;
       int i1 = (p0 == -1)? 0: layoutParams.bottomMargin - ((p0 - f.a(this.n).bottom) - a.b(this.n, Integer.valueOf(8)));
       int i2 = q.n(i1, i);
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "updateCommentListBottom", "bottomMargin", Integer.valueOf(i2), "current bottomMargin", Integer.valueOf(layoutParams.bottomMargin));
       if (i2 != layoutParams.bottomMargin) {
          liveLiteLayo = this.n;
          LayoutMarginAnimation layoutMargin = new LayoutMarginAnimation(this.n, 3, q.n(i2, i), 150);
          LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1 oupdateComme = new LiveLiteLayoutManager$updateCommentListBottom$$inlined$apply$lambda$1(this, p0);
          if (!PatchProxy.applyVoidOneRefs(oupdateComme, v7, LayoutMarginAnimation.class, "4")) {
             a.p(oupdateComme, "action");
             v7.e = oupdateComme;
          }
          liveLiteLayo.startAnimation(v7);
       }
       return;
    }
    public final void j(int p0){
       Object obj = this;
       int i = p0;
       LiveLiteLayoutManager liveLiteLayo = LiveLiteLayoutManager.class;
       if (PatchProxy.isSupport(liveLiteLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, liveLiteLayo, "28")) {
          return;
       }
       obj.p.clearAnimation();
       ViewGroup$LayoutParams layoutParams = obj.p.getLayoutParams();
       String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       Objects.requireNonNull(layoutParams, str);
       int i1 = 0;
       if (i == -1) {
          i = 0;
       }else {
          LiveLiteLayoutManager t = obj.t;
          String str1 = "layoutBottomLine";
          if (t == null) {
             a.S(str1);
          }
          int i2 = f.a(t).bottom - i;
          if (obj.c != null) {
             i2 = i2 + obj.a;
          }
          Rect rect = f.a(obj.p);
          i2 = (i2 - rect.bottom) - a.b(obj.p, Integer.valueOf(1));
          LiveLiteLogTag lAYOUT_MANAG = LiveLiteLogTag.LAYOUT_MANAGER;
          LiveLiteLayoutManager t1 = obj.t;
          if (t1 == null) {
             a.S(str1);
          }
          ViewGroup$LayoutParams layoutParams1 = obj.p.getLayoutParams();
          Objects.requireNonNull(layoutParams1, str);
          b.f0(lAYOUT_MANAG, "calcGiftSlotBottom", "bottomLine", Integer.valueOf(f.a(t1).bottom), "slotBottom", Integer.valueOf(rect.bottom), "translationY", Integer.valueOf(i2), "bottomMargin", Integer.valueOf(layoutParams1.bottomMargin));
          i = layoutParams.bottomMargin - i2;
       }
       i = q.n(i, i1);
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "updateGiftSlotBottom", "bottomMargin", Integer.valueOf(i), "current bottomMargin", Integer.valueOf(layoutParams.bottomMargin));
       if (layoutParams.bottomMargin != i) {
          LayoutMarginAnimation layoutMargin = new LayoutMarginAnimation(obj.p, 3, q.n(i, i1), 200);
          obj.p.startAnimation(v9);
       }
       return;
    }
}
