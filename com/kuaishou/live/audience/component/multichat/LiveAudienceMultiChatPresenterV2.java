package com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2;
import lp1.b;
import mq5.h;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$b;
import vb1.d$a;
import im8.g;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$c;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$a;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$containerChangedListener$2;
import z11.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import aq5.d;
import t02.a0;
import lp3.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.util.Objects;
import f61.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import android.view.ViewGroup;
import android.view.View$OnLayoutChangeListener;
import y11.b;
import xd1.c;
import ee1.a;
import ga1.e;
import a51.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$onBind$1;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import lp3.c;
import com.kwai.video.waynelive.LivePlayerController;
import up1.g;
import ga1.c;
import xp5.g;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ke3.d;
import mw1.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import xp5.i;
import nw1.b;
import c21.b;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2;
import fq1.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mq5.b;
import lp1.e;
import v51.a;
import hf3.a;
import sz1.e;
import lp1.c;
import op1.b;
import lp1.d;
import com.kuaishou.live.viewcontroller.ViewController;
import z11.b;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$initMultiChatOfflineController$1;
import msd.l;
import a21.b;
import ne1.d;
import vb1.b;
import vb1.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import ke3.f;
import b21.a;
import brd.w;
import erd.h;
import brd.t;
import b21.b;
import erd.r;
import b21.c;
import erd.g;
import crd.b;
import crd.a;
import krd.a;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import yp1.b;
import zh3.c;
import qrd.l1;
import com.kuaishou.live.common.core.component.slide.LiveSlideSwitchService;
import com.kuaishou.live.common.core.component.slide.LiveSlideSwitchService$DisableSlidePlayFunction;
import sa3.b;
import java.util.Map;
import com.kwai.framework.model.user.QCurrentUser;
import ae1.a;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import qu2.d;
import p91.m;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$Entrance;
import qu2.a;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$d;
import java.lang.Runnable;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import fq1.e;
import fq1.a;
import dw1.a;
import java.lang.Boolean;
import lp1.a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import wp1.c;
import qp1.a;
import java.util.HashSet;
import java.util.Collection;
import java.lang.Iterable;
import cc1.a;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import y11.e;
import java.util.HashMap;
import d21.a;
import i81.g;
import com.kuaishou.live.audience.component.multichat.LiveAudienceMultiChatPresenterV2$b;
import lh3.b;
import uz1.b;
import kotlin.Pair;
import qrd.r0;
import trd.t0;

public final class LiveAudienceMultiChatPresenterV2 extends LiveVCHostPresenter implements b, h, LiveAudienceChatService$b, d$a, g	// class@000ba4
{
    public LiveAudienceChatService A;
    public g B;
    public c C;
    public LiveAudienceMultiChatController D;
    public b E;
    public ViewGroup F;
    public View G;
    public a H;
    public final p I;
    public LiveAudienceMultiChatPlayerViewTransformer J;
    public List K;
    public b L;
    public final a M;
    public final b N;
    public final p O;
    public b P;
    public m w;
    public a0 x;
    public i y;
    public d z;

    public void LiveAudienceMultiChatPresenterV2(){
       super();
       this.I = s.c(new LiveAudienceMultiChatPresenterV2$commentAreaAdapter$2(this));
       this.K = CollectionsKt__CollectionsKt.E();
       this.M = new LiveAudienceMultiChatPresenterV2$c(this);
       this.N = new LiveAudienceMultiChatPresenterV2$a(this);
       this.O = s.c(new LiveAudienceMultiChatPresenterV2$containerChangedListener$2(this));
    }
    public static final a W8(LiveAudienceMultiChatPresenterV2 p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("audienceMultiChatContainer");
       }
       return p0;
    }
    public static final d X8(LiveAudienceMultiChatPresenterV2 p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("bizManager");
       }
       return p0;
    }
    public static final a0 Y8(LiveAudienceMultiChatPresenterV2 p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("livePlayCallerContext");
       }
       return p0;
    }
    public static final i Z8(LiveAudienceMultiChatPresenterV2 p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("liveServiceManager");
       }
       return p0;
    }
    public static void b9(LiveAudienceMultiChatPresenterV2 p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.a9(p1);
       return;
    }
    public void A5(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2.class, "13")) {
          return;
       }
       this.c9();
       LiveAudienceMultiChatPresenterV2.b9(this, false, 1, objArray);
       LiveAudienceMultiChatPresenterV2 tA = this.A;
       if (tA == null) {
          a.S("chatService");
       }
       tA.Gj(LiveAudienceChatService$ChatState.END);
       return;
    }
    public void B2(int p0){
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAudience, "25")) {
          return;
       }
       liveAudience = this.D;
       if (liveAudience != null) {
          liveAudience.v0(p0);
       }
       return;
    }
    public void D(){
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       Object[] objArray = null;
       String str = "11";
       if (PatchProxy.applyVoid(objArray, this, liveAudience, str)) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tH = this.H;
       if (tH == null) {
          a.S("audienceMultiChatContainer");
       }
       Objects.requireNonNull(tH);
       a uoa = a.class;
       if (PatchProxy.applyVoid(objArray, tH, uoa, "3") || (!PatchProxy.applyVoid(objArray, tH, uoa, str) && b.a())) {
          a k = tH.k;
          if (!k instanceof GifshowActivity) {
             k = objArray;
          }
          if (k != null) {
             k.i3(tH.g);
          }
       }
    label_0040 :
       LiveAudienceMultiChatPresenterV2 tH1 = this.H;
       if (tH1 == null) {
          a.S("audienceMultiChatContainer");
       }
       tH1.e().addOnLayoutChangeListener(this.e9());
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "12")) {
          liveAudience = this.D;
          if (liveAudience != null) {
             this.C = new b(liveAudience, this);
             liveAudience = this.A;
             if (liveAudience == null) {
                a.S("chatService");
             }
             liveAudience.E5(this.C);
          }
       }
       this.d9();
       return;
    }
    public void E8(){
       LiveAudienceMultiChatPresenterV2 j;
       LiveAudienceMultiChatPlayerViewTransformer a;
       a[] uoaArray;
       LiveAudienceMultiChatPresenterV2 d;
       a uoa = this;
       a uoa1 = a.class;
       e uoe = e.class;
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       if (PatchProxy.applyVoid(null, uoa, liveAudience, "6")) {
          return;
       }
       super.E8();
       Activity activity = this.getActivity();
       a.m(activity);
       String str = "activity!!";
       a.o(activity, str);
       View view = this.m8();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       uoa.H = new a(activity, view, new LiveAudienceMultiChatPresenterV2$onBind$1(uoa));
       LiveAudienceMultiChatPresenterV2 y = uoa.y;
       String str1 = "liveServiceManager";
       if (y == null) {
          a.S(str1);
       }
       c uoc = y.a(uoe);
       a.o(uoc, "getService\(LivePlayerService::class.java\)");
       LivePlayerController livePlayerCo = uoc.Vc();
       a.o(livePlayerCo, "getService\(LivePlayerSer¡­ava\).livePlayerController");
       LiveAudienceMultiChatPresenterV2 y1 = uoa.y;
       if (y1 == null) {
          a.S(str1);
       }
       uoc = y1.a(uoa1);
       String str2 = "liveServiceManager.getSe¡­veRTCManager::class.java\)";
       a.o(uoc, str2);
       c uoc1 = uoc;
       g og = new g();
       uoc = y.a(c.class);
       a.o(uoc, "getService\(LivePlayViewService::class.java\)");
       c uoc2 = uoc;
       y1 = uoa.x;
       String str3 = "livePlayCallerContext";
       if (y1 == null) {
          a.S(str3);
       }
       a0 f2 = y1.F2;
       a.o(f2, "livePlayCallerContext.mLiveAudiencePlayViewService");
       c uoc3 = y.a(d.class);
       a0 uoa0 = f2;
       a.o(uoc3, "getService\(LiveBizManager::class.java\)");
       c uoc4 = y.a(g.class);
       a.o(uoc4, "getService\(LiveInfoManager::class.java\)");
       y1 = uoa.x;
       if (y1 == null) {
          a.S(str3);
       }
       f2 = y1.c;
       String str4 = str2;
       a.o(f2, "livePlayCallerContext.mPhoto");
       LiveAudienceMultiChatPresenterV2 x = uoa.x;
       if (x == null) {
          a.S(str3);
       }
       LiveBizParam liveBizParam = x.e1();
       a.o(liveBizParam, "livePlayCallerContext.liveBizParam");
       Activity activity1 = this.getActivity();
       a.m(activity1);
       a.o(activity1, str);
       View view1 = this.m8();
       a.o(view1, "rootView");
       Activity uActivity = activity1;
       e uoe1 = uoe;
       String str5 = str4;
       LiveBizParam liveBizParam1 = liveBizParam;
       Activity uActivity1 = uActivity;
       LiveAudienceMultiChatPlayerViewTransformer liveAudience1 = new LiveAudienceMultiChatPlayerViewTransformer(livePlayerCo, uoc1, og, uoc2, uoa0, uoc3, uoc4, f2, liveBizParam1, uActivity1, view1);
       uoa.J = v15;
       if (!PatchProxy.applyVoid(null, uoa, liveAudience, "7")) {
          LiveAudienceMultiChatPresenterV2 y4 = uoa.y;
          if (y4 == null) {
             a.S(str1);
          }
          uoc3 = y4.a(i.class);
          a.o(uoc3, "liveServiceManager.getSe¡­kageProvider::class.java\)");
          y = uoa.y;
          if (y == null) {
             a.S(str1);
          }
          uoc4 = y.a(b.class);
          a.o(uoc4, "liveServiceManager.getSe¡­ttifyService::class.java\)");
          LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1 oinitMultiCh = new LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$1(uoc4);
          uoa.P = new b(oinitMultiCh, new LiveAudienceMultiChatPresenterV2$initMultiChatCameraController$2(uoa, uoc3));
       }
       String str6 = "8";
       if (!PatchProxy.applyVoid(null, uoa, liveAudience, str6)) {
          if (b.a()) {
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "disableAudienceNewMultiChat");
          }else {
             LiveAudienceMultiChatPresenterV2 y2 = uoa.y;
             if (y2 == null) {
                a.S(str1);
             }
             y2.a(b.class).Km(uoa);
             y2 = uoa.y;
             if (y2 == null) {
                a.S(str1);
             }
             y2.a(LiveAudienceChatService.class).qa(uoa);
             LiveAudienceMultiChatPresenterV2 y3 = uoa.y;
             if (y3 == null) {
                a.S(str1);
             }
             c uoc5 = y3.a(a.class);
             a.o(uoc5, "liveServiceManager.getSe¡­nnectManager::class.java\)");
             a uoa2 = uoc5.u();
             a.o(uoa2, "liveServiceManager.getSe¡­.java\).liveLongConnection");
             y3 = uoa.y;
             if (y3 == null) {
                a.S(str1);
             }
             uoc5 = y3.a(e.class);
             a.o(uoc5, "liveServiceManager.getSe¡­eractManager::class.java\)");
             c uoc6 = uoc5;
             y3 = uoa.y;
             if (y3 == null) {
                a.S(str1);
             }
             c uoc7 = y3.a(uoa1);
             a.o(uoc7, str5);
             uoc2 = uoc7;
             j = uoa.y;
             if (j == null) {
                a.S(str1);
             }
             uoc7 = j.a(uoe1);
             a.o(uoc7, "liveServiceManager.getSe¡­layerService::class.java\)");
             LivePlayerController livePlayerCo1 = uoc7.Vc();
             a.o(livePlayerCo1, "liveServiceManager.getSe¡­ava\).livePlayerController");
             e uoe2 = new e(uoa2, uoc6, uoc2, livePlayerCo1, new c(1, 0), uoa.P);
             uoa.D = new LiveAudienceMultiChatController(v15, this.j9(), uoa);
             j = uoa.F;
             if (j == null) {
                a.S("multiChatContainer");
             }
             d = uoa.D;
             a.m(d);
             uoa.E2(j, d);
             if (!PatchProxy.applyVoid(null, uoa, liveAudience, "9")) {
                b uob1 = new b(new LiveAudienceMultiChatPresenterV2$initMultiChatOfflineController$1(uoa));
                uoa.E = uob1;
                a.m(uob1);
                uoa.xg(uob1);
             }
             d = uoa.y;
             if (d == null) {
                a.S(str1);
             }
             c uoc8 = d.a(d.class);
             a.o(uoc8, "liveServiceManager.getSe¡­mmentService::class.java\)");
             uoa.L = new b(uoc8, this.j9());
             j = uoa.y;
             if (j == null) {
                a.S(str1);
             }
             j.a(b.class).Z6(uoa);
             j = uoa.z;
             if (j == null) {
                a.S("bizManager");
             }
             uoaArray = new a[]{AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
             j.u5(uoa.N, uoaArray);
          }
       }
       j = uoa.J;
       if (j == null) {
          a.S("playerViewTransformer");
       }
       Objects.requireNonNull(j);
       LiveAudienceMultiChatPlayerViewTransformer liveAudience2 = LiveAudienceMultiChatPlayerViewTransformer.class;
       if (!PatchProxy.applyVoid(null, j, liveAudience2, "5")) {
          a = j.a;
          b uob = t.combineLatest(a.d, a.c, j.d, a.a).filter(new b(j)).subscribe(new c(j));
          a.o(uob, "Observable.combineLatest¡­ut, layoutConfig\)\n      }");
          a.b(j.b, uob);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, j, liveAudience2, str6)) {
             j.m.addOnVideoSizeChangedListener(j.f);
          }
          if (!PatchProxy.applyVoid(objArray, j, liveAudience2, "10")) {
             uoaArray = new a[]{AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW};
             j.r.u5(j.g, uoaArray);
          }
       }
       return;
    }
    public void G0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2.class, "26")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tD = this.D;
       if (tD != null && !PatchProxy.applyVoid(objArray, tD, LiveAudienceMultiChatController.class, "12")) {
          tD.X2().h().q(l1.a);
       }
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "15")) {
          return;
       }
       this.c9();
       LiveAudienceMultiChatPresenterV2 ty = this.y;
       String str = "liveServiceManager";
       if (ty == null) {
          a.S(str);
       }
       ty.a(LiveSlideSwitchService.class).o7(this.getActivity(), LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, true);
       ty = this.H;
       String str1 = "audienceMultiChatContainer";
       if (ty == null) {
          a.S(str1);
       }
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(null, ty, a.class, "4")) {
          ty.i();
          ty.h = 0;
          ty.i = null;
          a e = ty.e;
          a.o(e, "multiChatContainerBackgroundView");
          e.setVisibility(8);
       }
       ty = this.H;
       if (ty == null) {
          a.S(str1);
       }
       ty.e().removeOnLayoutChangeListener(this.e9());
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       ty.a(b.class).in(true);
       this.a9(true);
       ty = this.A;
       if (ty == null) {
          a.S("chatService");
       }
       ty.Gj(LiveAudienceChatService$ChatState.END);
       this.C = null;
       ty = this.A;
       if (ty == null) {
          a.S("chatService");
       }
       ty.E5(null);
       return;
    }
    public void J1(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "10")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tC = this.C;
       int i = 0;
       if (tC != null) {
          Map map = tC.O0();
          if (map != null) {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             a uoa = map.get(mE.getId());
             if (uoa != null) {
                b = uoa.b();
             label_0030 :
                LiveAudienceMultiChatPresenterV2 tz = this.z;
                if (tz == null) {
                   a.S("bizManager");
                }
                a[] uoaArray = new a[2];
                uoaArray[0] = AudienceBizRelation.CHAT;
                int i1 = 1;
                AudienceBizRelation cHAT_VIDEO_S = (b)? AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW: AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW;
                uoaArray[i1] = cHAT_VIDEO_S;
                if (tz.L8(uoaArray)) {
                   tC = this.y;
                   if (tC == null) {
                      a.S("liveServiceManager");
                   }
                   LiveSlideSwitchService liveSlideSwi = tC.a(LiveSlideSwitchService.class);
                   liveSlideSwi.Xj();
                   liveSlideSwi.o7(this.getActivity(), LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, i);
                }else {
                   tC = this.D;
                   if (tC != null) {
                      tC.v0(9);
                   }
                }
                tC = this.A;
                if (tC == null) {
                   a.S("chatService");
                }
                tC.Gj(LiveAudienceChatService$ChatState.CONNECTED);
                AutoInviteFriendsGuidingPanel$a d = AutoInviteFriendsGuidingPanel.d;
                Activity activity = this.getActivity();
                a.m(activity);
                a.o(activity, "activity!!");
                LiveAudienceMultiChatPresenterV2 tw = this.w;
                if (tw == null) {
                   a.S("liveBasicContext");
                }
                d uod = new d(tw);
                tw = this.x;
                if (tw == null) {
                   a.S("livePlayCallerContext");
                }
                d.a(activity, uod, tw, AutoInviteFriendsGuidingPanel$Entrance.MultiChat);
                return;
             }
          }
       }
       b = false;
       goto label_0030 ;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2.class, "29")) {
          return;
       }
       super.J8();
       LiveAudienceMultiChatPresenterV2 ty = this.y;
       String str = "liveServiceManager";
       if (ty == null) {
          a.S(str);
       }
       ty.a(b.class).L9(this);
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       ty.a(b.class).le(this);
       ty = this.z;
       if (ty == null) {
          a.S("bizManager");
       }
       int i = 1;
       a[] uoaArray = new a[i];
       uoaArray[0] = AudienceBizRelation.RECRUIT_EXPLAIN_PANEL;
       ty.G5(this.N, uoaArray);
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       ty.a(LiveAudienceChatService.class).Mg(this);
       ty = this.H;
       if (ty == null) {
          a.S("audienceMultiChatContainer");
       }
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(objArray, ty, a.class, "13")) {
          ty.a.removeOnLayoutChangeListener(ty.f);
          ty.i();
          a e = ty.e;
          a.o(e, "multiChatContainerBackgroundView");
          e.setVisibility(8);
       }
       ty = this.J;
       if (ty == null) {
          a.S("playerViewTransformer");
       }
       Objects.requireNonNull(ty);
       LiveAudienceMultiChatPlayerViewTransformer liveAudience = LiveAudienceMultiChatPlayerViewTransformer.class;
       if (!PatchProxy.applyVoid(objArray, ty, liveAudience, "6")) {
          if (!PatchProxy.applyVoid(objArray, ty, liveAudience, "9")) {
             ty.m.removeOnVideoSizeChangedListener(ty.f);
          }
          if (!PatchProxy.applyVoid(objArray, ty, liveAudience, "11")) {
             a[] uoaArray1 = new a[i];
             uoaArray1[0] = AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW;
             ty.r.G5(ty.g, uoaArray1);
          }
          ty.b.d();
       }
       return;
    }
    public void M(LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "22")) {
          return;
       }
       a.p(p0, "renderLayoutConfig");
       b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "onAvStatusUpdate");
       LiveAudienceMultiChatPresenterV2 tH = this.H;
       if (tH == null) {
          a.S("audienceMultiChatContainer");
       }
       ViewGroup viewGroup = tH.e();
       viewGroup.post(new LiveAudienceMultiChatPresenterV2$d(this, p0, viewGroup));
       return;
    }
    public LifecycleOwner V8(){
       LiveAudienceMultiChatPresenterV2 obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       return obj.a(a.class).t();
    }
    public void Y1(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "23")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tA = this.A;
       if (tA == null) {
          a.S("chatService");
       }
       tA.Gj(LiveAudienceChatService$ChatState.INVITED);
       tA = this.y;
       if (tA == null) {
          a.S("liveServiceManager");
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       tA.a(LiveAudienceApplyChatService.class).gk(qCurrentUser.getId(), "ANCHOR");
       return;
    }
    public void Y2(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "14")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2.b9(this, false, 1, null);
       return;
    }
    public void Z(e p0){
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "21")) {
          return;
       }
       a uoa = PatchProxy.apply(null, this, liveAudience, "2");
       if (uoa == PatchProxyResult.class) {
          uoa = this.I.getValue();
       }
       uoa.a(p0);
       String str = 1;
       if (p0 != null && str == p0.a()) {
          LiveAudienceMultiChatPresenterV2 ty = this.y;
          if (ty == null) {
             a.S("liveServiceManager");
          }
          ty.a(a.class).ik("MultiChatLayoutChange");
       }
       return;
    }
    public final void a9(boolean p0){
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "16")) {
          return;
       }
       liveAudience = this.z;
       if (liveAudience == null) {
          a.S("bizManager");
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW};
       liveAudience.Jh(uoaArray);
       if (p0) {
          LiveAudienceMultiChatPresenterV2 tz = this.z;
          if (tz == null) {
             a.S("bizManager");
          }
          tz.yj(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW);
       }
       return;
    }
    public void b2(){
       a.b(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "18")) {
          return;
       }
       this.d9();
       this.m2(this.K);
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "17")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 ty = this.y;
       if (ty == null) {
          a.S("liveServiceManager");
       }
       ty.a(b.class).Ao();
       return;
    }
    public final void d9(){
       LinkedHashMap linkedHashMa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiChatPresenterV2.class, "19")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tC = this.C;
       if (tC != null) {
          Map map = tC.O0();
          if (map != null) {
             linkedHashMa = new LinkedHashMap();
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                int i = a.g(uEntry.getKey(), this.j9().h()) ^ 1;
                if (i) {
                   linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                }
             }
             HashSet hashSet = PatchProxy.applyOneRefs(linkedHashMa, objArray, a.class, "2");
             if (hashSet != PatchProxyResult.class) {
             }else {
                hashSet = new HashSet();
                if (linkedHashMa != null) {
                   if (linkedHashMa.isEmpty() ^ 1) {
                      hashSet.add(AudienceBizRelation.CHAT_VIDEO_VIEW);
                   }
                   Iterator iterator1 = linkedHashMa.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      if (iterator1.next().getValue().b()) {
                         hashSet.add(AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW);
                      }else {
                         hashSet.add(AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW);
                      }
                   }
                }
             }
             if (hashSet.isEmpty() ^ 1) {
                iterator = hashSet.iterator();
                while (iterator.hasNext()) {
                   AudienceBizRelation uAudienceBiz = iterator.next();
                   b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "onChatUserInfoUpdate", "getEnabledBizByChatUserUpdate", uAudienceBiz);
                   LiveAudienceMultiChatPresenterV2 tz = this.z;
                   if (tz == null) {
                      a.S("bizManager");
                   }
                   a[] uoaArray = new a[]{uAudienceBiz};
                   tz.L8(uoaArray);
                }
             }
             return;
          }
       }
       linkedHashMa = objArray;
       goto label_0052 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "5")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.live_multi_chat_render_ui_layout);
       a.o(view, "rootView.findViewById\(R.¡­ti_chat_render_ui_layout\)");
       this.F = view;
       ViewGroup viewGroup = a.a(p0);
       a.o(viewGroup, "LiveAudienceBottomBarUti¡­ntBottomBarView\(rootView\)");
       this.G = viewGroup;
       return;
    }
    public final View$OnLayoutChangeListener e9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.getValue();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceMultiChatPresenterV2.class, new e());
       }else {
          obj.put(LiveAudienceMultiChatPresenterV2.class, null);
       }
       return obj;
    }
    public void h6(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "28")) {
          return;
       }
       List list = CollectionsKt__CollectionsKt.E();
       this.K = list;
       LiveAudienceMultiChatPresenterV2 tD = this.D;
       if (tD != null) {
          tD.E1(list);
       }
       return;
    }
    public final a h9(){
       return this.M;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "4")) {
          return;
       }
       c obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.w = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.x = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.y = obj;
       obj = obj.a(d.class);
       a.o(obj, "liveServiceManager.getSe¡­veBizManager::class.java\)");
       this.z = obj;
       LiveAudienceMultiChatPresenterV2 ty = this.y;
       String str = "liveServiceManager";
       if (ty == null) {
          a.S(str);
       }
       obj = ty.a(LiveAudienceChatService.class);
       a.o(obj, "liveServiceManager.getSe¡­eChatService::class.java\)");
       this.A = obj;
       ty = this.y;
       if (ty == null) {
          a.S(str);
       }
       obj = ty.a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­nagerService::class.java\)");
       this.B = obj;
       return;
    }
    public final d j9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatPresenterV2.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceMultiChatPresenterV2$b(this);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatPresenterV2.class, "24")) {
          return;
       }
       LiveAudienceMultiChatPresenterV2 tD = this.D;
       if (tD != null) {
          tD.v0(7);
       }
       return;
    }
    public final Map k9(String p0){
       LiveAudienceMultiChatPresenterV2 obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       c uoc = obj.a(e.class);
       a.o(uoc, "liveServiceManager.getSe¡­eractManager::class.java\)");
       b uob = uoc.gc();
       String str = "interactService.liveInteractRtcManager";
       a.o(uob, str);
       String bizId = uob.getBizId();
       String str1 = "";
       if (bizId == null) {
          bizId = str1;
       }
       String str2 = "interactService.liveInte\x20\x02?: TextUtils.EMPTY_STRING\x00";
       a.o(bizId, str2);
       b uob1 = uoc.Wi();
       a.o(uob1, "interactService.liveInteractBizAdapterProcessor");
       String str3 = String.valueOf(uob1.n());
       b uob2 = uoc.gc();
       a.o(uob2, str);
       str = uob2.f();
       if (str == null) {
          str = str1;
       }
       a.o(str, str2);
       p0 = uoc.gc().I1(p0);
       if (p0 != null) {
          str1 = p0;
       }
       a.o(str1, str2);
       Pair[] pairArray = new Pair[]{r0.a("biz_session_id", bizId),r0.a("biz_type", str3),r0.a("chat_id", str),r0.a("session_id", str1)};
       return t0.W(pairArray);
    }
    public void m2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatPresenterV2.class, "27")) {
          return;
       }
       a.p(p0, "servingUserList");
       this.K = p0;
       LiveAudienceMultiChatPresenterV2 tD = this.D;
       if (tD != null) {
          tD.E1(p0);
       }
       return;
    }
    public void z0(int p0){
       LiveAudienceMultiChatPresenterV2 tz;
       LiveAudienceMultiChatPresenterV2 liveAudience = LiveAudienceMultiChatPresenterV2.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAudience, "20")) {
          return;
       }
       String str = "bizManager";
       int i = 1;
       if (p0 == 2) {
          tz = this.z;
          if (tz == null) {
             a.S(str);
          }
          a[] uoaArray = new a[i];
          uoaArray[0] = AudienceBizRelation.CHAT_CENTER_STATUS_VIEW;
          tz.L8(uoaArray);
       }else if(p0 == i){
          tz = this.z;
          if (tz == null) {
             a.S(str);
          }
          tz.yj(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW);
       }
       return;
    }
}
