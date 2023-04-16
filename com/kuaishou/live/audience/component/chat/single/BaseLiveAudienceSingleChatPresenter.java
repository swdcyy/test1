package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import xd1.a;
import zd1.b$a;
import rd1.i;
import mq5.h;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$b;
import k51.c;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$a;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$c;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$b;
import t02.a0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import rd1.o;
import lp3.c;
import lp3.i;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import rd1.g0;
import rd1.f0;
import xp5.g;
import xp5.i;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import e3a.a;
import ww0.k;
import ox0.o;
import android.view.View;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$onBind$1;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$onBind$2;
import lp3.e;
import msd.a;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import mq5.b;
import rd1.c;
import ga1.e;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import androidx.fragment.app.c$b;
import kq5.b;
import oq5.c;
import oq5.a;
import android.view.ViewGroup;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$d;
import java.lang.Runnable;
import qrd.l1;
import ae1.a;
import java.lang.Boolean;
import java.lang.Float;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rd1.c0;
import aq5.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.common.core.component.slide.LiveSlideSwitchService;
import com.kuaishou.live.common.core.component.slide.LiveSlideSwitchService$DisableSlidePlayFunction;
import java.lang.System;
import ke1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import qu2.d;
import p91.m;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$Entrance;
import qu2.a;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$a;
import rd1.k;
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$g;
import ox0.l;
import zd1.g;
import zd1.b;
import e93.f;
import ne1.d;
import k2b.e0;
import rd1.d;
import m91.b;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.framework.model.user.UserInfo;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$DialogMode;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$e;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$a;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import com.kwai.framework.model.user.QCurrentUser;
import xd1.g;
import yd1.b;
import i81.g;
import dp3.g;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import n91.b;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kuaishou.live.common.core.component.comments.LiveCommentsBizInScene;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import le1.a;
import android.content.res.Configuration;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import ga1.c;
import u71.c;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import u71.a;
import rd1.h;
import ekd.m1;
import cc1.a;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$f;
import zd1.f;
import java.nio.ByteBuffer;

public abstract class BaseLiveAudienceSingleChatPresenter extends c implements a, b$a, i, h, LivePlayerTypeChangeListener, LiveAudienceChatService$b	// class@000a8d
{
    public l A;
    public o B;
    public b C;
    public boolean D;
    public Handler E;
    public HandlerThread F;
    public a G;
    public m H;
    public a0 I;
    public ViewGroup J;
    public a K;
    public final c L;
    public final c M;
    public final c$b N;
    public k p;
    public i q;
    public b r;
    public a s;
    public g t;
    public i u;
    public LiveStreamMessages$SCLiveChatGuestGiftInfo v;
    public Activity w;
    public View x;
    public View y;
    public View z;
    public static String sLivePresenterClassName = "BaseLiveAudienceSingleChatPresenter";

    public void BaseLiveAudienceSingleChatPresenter(){
       super();
       this.L = new BaseLiveAudienceSingleChatPresenter$a(this);
       this.M = new BaseLiveAudienceSingleChatPresenter$c(this);
       this.N = new BaseLiveAudienceSingleChatPresenter$b(this);
    }
    public static final a0 P8(BaseLiveAudienceSingleChatPresenter p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("livePlayCallerContext");
       }
       return p0;
    }
    public void B2(int p0){
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = BaseLiveAudienceSingleChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "12")) {
          return;
       }
       uBaseLiveAud = this.q;
       if (uBaseLiveAud == null) {
          a.S("serviceManager");
       }
       o oo = uBaseLiveAud.a(o.class);
       if (oo.p() != null) {
          oo.close(p0);
       }
       return;
    }
    public void D7(String[] p0){
       f0.f(this, p0);
    }
    public void E8(){
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter.class, "11")) {
          return;
       }
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       c uoc = tq.a(g.class);
       a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
       this.t = uoc;
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       uoc = tq.a(i.class);
       a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
       this.u = uoc;
       this.w = a.b(this.getContext());
       BaseLiveAudienceSingleChatPresenter tI = this.I;
       if (tI == null) {
          a.S("livePlayCallerContext");
       }
       this.p = new k(tI);
       View view = this.m8();
       a.o(view, "rootView");
       BaseLiveAudienceSingleChatPresenter tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       o oo1 = new o(view, tq1, this.w, new BaseLiveAudienceSingleChatPresenter$onBind$1(this), new BaseLiveAudienceSingleChatPresenter$onBind$2(this));
       this.B = uoc;
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(LiveAudienceChatService.class).qa(this);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(b.class).Km(this);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       o oo2 = tq.a(oo);
       tI = this.p;
       if (tI == null) {
          a.S("chatWidgetHelper");
       }
       oo2.i5(tI);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(oo).i5(this);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(oo).r1(this.L);
       BaseLiveAudienceSingleChatPresenter tq2 = this.q;
       if (tq2 == null) {
          a.S(str);
       }
       c uoc1 = tq2.a(e.class);
       a.o(uoc1, "serviceManager.getServic¡­layerService::class.java\)");
       uoc1.Vc().addLivePlayerTypeChangeListener(this);
       tq2 = this.r;
       a.m(tq2);
       tq2.c(this.N);
       tq2 = this.s;
       a.m(tq2);
       tq2.W0(this.M, true);
       tq2 = this.J;
       if (tq2 == null) {
          a.S("chatSmallScreenContainer");
       }
       tq2.setVisibility(4);
       a uoa = new a(ViewElement.CHAT_SMALL_SCREEN, new BaseLiveAudienceSingleChatPresenter$d(this));
       uoa.c();
       this.K = uoa;
       return;
    }
    public void En(boolean p0,float p1,a p2){
       AutoInviteFriendsGuidingPanel$a d;
       if (PatchProxy.isSupport(BaseLiveAudienceSingleChatPresenter.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Float.valueOf(p1), p2, this, BaseLiveAudienceSingleChatPresenter.class, "17")) {
          return;
       }
       a.p(p2, "chatUserInfo");
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       c uoc = tq.a(o.class);
       a.o(uoc, "serviceManager.getServic¡­eChatService::class.java\)");
       BaseLiveAudienceSingleChatPresenter tu = this.u;
       String str1 = "mLogPackageProvider";
       if (tu == null) {
          a.S(str1);
       }
       c0.Q(true, tu.a());
       if (this.D == null) {
          tu = this.q;
          if (tu == null) {
             a.S(str);
          }
          d uod = tu.a(d.class);
          a[] uoaArray = new a[2];
          uoaArray[0] = AudienceBizRelation.CHAT;
          AudienceBizRelation cHAT_VIDEO_S = (p0)? AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW: AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW;
          uoaArray[1] = cHAT_VIDEO_S;
          if (uod.L8(uoaArray)) {
             tq = this.B;
             if (tq == null) {
                a.S("liveAudienceChatPlayViewLogic");
             }
             tq.e(p1);
             tq = this.u;
             if (tq == null) {
                a.S(str1);
             }
             ClientContent$LiveStreamPackage liveStreamPa = tq.a();
             tu = this.t;
             if (tu == null) {
                a.S("mLiveInfoManager");
             }
             User user = tu.I();
             if (user != null) {
                user = user.mId;
                if (user != null) {
                label_00a0 :
                   c0.U(liveStreamPa, user, 0, p0, this.R8());
                   this.t3(p1, p2);
                   BaseLiveAudienceSingleChatPresenter tq1 = this.q;
                   if (tq1 == null) {
                      a.S(str);
                   }
                   tq1.a(LiveSlideSwitchService.class).o7(this.w, LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, 0);
                   tq1 = this.G;
                   if (tq1 != null) {
                      long l = System.currentTimeMillis();
                      tq1.d = l;
                      tq1.b = l - tq1.c;
                   }
                   b.Z(LiveLogTag.MULTI_CHAT, this.getTag()+" onChatConnected");
                label_00ef :
                   d = AutoInviteFriendsGuidingPanel.d;
                   Activity activity = this.getActivity();
                   a.m(activity);
                   a.o(activity, "activity!!");
                   tq = this.H;
                   if (tq == null) {
                      a.S("liveBasicContext");
                   }
                   d uod1 = new d(tq);
                   tq = this.I;
                   if (tq == null) {
                      a.S("livePlayCallerContext");
                   }
                   d.a(activity, uod1, tq, AutoInviteFriendsGuidingPanel$Entrance.MultiChat);
                   return;
                }
             }
             String str2 = "";
             goto label_00a0 ;
          }
       }
       uoc.close(15);
       goto label_00ef ;
    }
    public void G0(){
       k.a(this);
    }
    public void J2(int p0,String p1){
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = BaseLiveAudienceSingleChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBaseLiveAud, "20")) {
          return;
       }
       uBaseLiveAud = PatchProxy.apply(null, this, uBaseLiveAud, "22");
       if (uBaseLiveAud != PatchProxyResult.class) {
       }else if(this.E == null){
          HandlerThread handlerThrea = new HandlerThread("LiveChatQosEventHandlerThread");
          this.F = handlerThrea;
          handlerThrea.start();
          this.E = new Handler(handlerThrea.getLooper());
       }
       uBaseLiveAud = this.E;
       if (uBaseLiveAud != null) {
          uBaseLiveAud.post(new BaseLiveAudienceSingleChatPresenter$g(p0, p1));
       }
       return;
    }
    public void J8(){
       o oo = o.class;
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter.class, "24")) {
          return;
       }
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(LiveAudienceChatService.class).Mg(this);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(oo).close(9);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       o oo1 = tq.a(oo);
       BaseLiveAudienceSingleChatPresenter tp = this.p;
       if (tp == null) {
          a.S("chatWidgetHelper");
       }
       oo1.Y5(tp);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(oo).Y5(this);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(oo).H1(this.L);
       BaseLiveAudienceSingleChatPresenter tq1 = this.q;
       if (tq1 == null) {
          a.S("serviceManager");
       }
       tq1.a(b.class).le(this);
       tq1 = this.q;
       if (tq1 == null) {
          a.S("serviceManager");
       }
       c uoc = tq1.a(e.class);
       a.o(uoc, "serviceManager.getServic¡­layerService::class.java\)");
       uoc.Vc().removeLivePlayerTypeChangeListener(this);
       tq1 = this.F;
       if (tq1 != null && tq1.isAlive()) {
          tq1.quit();
       }
       tq1 = this.E;
       if (tq1 != null) {
          tq1.removeCallbacksAndMessages(null);
       }
       tq1 = this.A;
       if (tq1 != null) {
          tq1.d();
       }
       this.A = null;
       tq1 = this.q;
       if (tq1 == null) {
          a.S("serviceManager");
       }
       tq1.a(g.class).qd();
       tq1 = this.C;
       if (tq1 != null) {
          tq1.d();
       }
       tq1 = this.s;
       a.m(tq1);
       tq1.Q0(this.M);
       tq1 = this.r;
       a.m(tq1);
       tq1.a(this.N);
       f.g(this);
       tq1 = this.K;
       if (tq1 == null) {
          a.S("choreographer");
       }
       tq1.b();
       return;
    }
    public void Kj(int p0,boolean p1,int p2,boolean p3){
       BaseLiveAudienceSingleChatPresenter this;
       BaseLiveAudienceSingleChatPresenter w;
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = this;
       if (PatchProxy.isSupport(BaseLiveAudienceSingleChatPresenter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, BaseLiveAudienceSingleChatPresenter.class, "15")) {
          return;
       }
       BaseLiveAudienceSingleChatPresenter q = uBaseLiveAud.q;
       String str = "serviceManager";
       if (q == null) {
          a.S(str);
       }
       q.a(d.class).J0();
       BaseLiveAudienceSingleChatPresenter t = uBaseLiveAud.t;
       if (t == null) {
          a.S("mLiveInfoManager");
       }
       String liveStreamId = t.getLiveStreamId();
       this = uBaseLiveAud.u;
       if (this == null) {
          a.S("mLogPackageProvider");
       }
       ClientContent$LiveStreamPackage this1 = this.a();
       BaseLiveAudienceSingleChatPresenter u = uBaseLiveAud.u;
       if (u == null) {
          a.S("mLogPackageProvider");
       }
       e0 page = u.getPage();
       BaseLiveAudienceSingleChatPresenter q1 = uBaseLiveAud.q;
       if (q1 == null) {
          a.S(str);
       }
       uBaseLiveAud.A = new l(liveStreamId, this1, page, q1.a(o.class));
       q = uBaseLiveAud.I;
       if (q == null) {
          a.S("livePlayCallerContext");
       }
       boolean b = (q.N().r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL))? false: p1;
       if (p2) {
          int i = (b)? 2: 1;
          BaseLiveAudienceSingleChatPresenter u1 = uBaseLiveAud.u;
          if (u1 == null) {
             a.S("mLogPackageProvider");
          }
          c0.w(i, u1.a());
          q1 = uBaseLiveAud.A;
          a.m(q1);
          w = uBaseLiveAud.w;
          q = uBaseLiveAud.t;
          if (q == null) {
             a.S("mLiveInfoManager");
          }
          q1.j(w, f.o(q.I()).mProfile, p0, b, p3);
       }else {
          q1 = uBaseLiveAud.A;
          a.m(q1);
          w = uBaseLiveAud.w;
          q = uBaseLiveAud.t;
          if (q == null) {
             a.S("mLiveInfoManager");
          }
          q1.i(w, f.o(q.I()).mProfile, p0, b, p3);
       }
       q = uBaseLiveAud.t;
       if (q == null) {
          a.S("mLiveInfoManager");
       }
       c0.T(q.getLiveStreamId(), p3);
       return;
    }
    public void Q7(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter.class, "16")) {
          return;
       }
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       tq.a(LiveSlideSwitchService.class).Xj();
       if (this.w instanceof FragmentActivity) {
          BaseLiveAudienceSingleChatPresenter tw = this.w;
          Objects.requireNonNull(tw, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          new LiveChatCountdownDialog(LiveChatCountdownDialog$DialogMode.AUDIENCE, BaseLiveAudienceSingleChatPresenter$e.a).Cb(tw.getSupportFragmentManager(), "LiveAudienceChatWithGuestPresenter");
       }
       a uoa = new a();
       this.G = uoa;
       a.m(uoa);
       uoa.c = System.currentTimeMillis();
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       tq.a(LiveAudienceApplyChatService.class).gk(qCurrentUser.getId(), "ANCHOR");
       return;
    }
    public final boolean R8(){
       g obj = PatchProxy.apply(null, this, BaseLiveAudienceSingleChatPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = g.a;
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       return obj.a(tq, false);
    }
    public final i S8(){
       BaseLiveAudienceSingleChatPresenter obj = PatchProxy.apply(null, this, BaseLiveAudienceSingleChatPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
    public int T7(){
       return f0.a(this);
    }
    public final void V8(boolean p0,boolean p1,b p2){
       ViewGroup$LayoutParams layoutParams;
       int i1;
       ViewGroup$MarginLayoutParams rightMargin;
       ViewGroup$LayoutParams width;
       LiveBulletinLayoutManager liveBulletin;
       g og = g.class;
       if (PatchProxy.isSupport(BaseLiveAudienceSingleChatPresenter.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, BaseLiveAudienceSingleChatPresenter.class, "31")) {
          return;
       }
       int i = 0;
       if (p0) {
          if (p2 != null) {
             View view = p2.getView();
             if (view != null) {
                layoutParams = view.getLayoutParams();
             label_0030 :
                if (layoutParams != null) {
                   float f = 10.00f;
                   if (p1) {
                      i1 = layoutParams.width + a1.e(f);
                      if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         rightMargin = layoutParams.rightMargin;
                         i1 = i1 + rightMargin;
                      }else {
                         i = i1;
                         rightMargin = 0;
                      label_0059 :
                         width = layoutParams.width;
                         layoutParams = layoutParams.height;
                      label_0061 :
                         BaseLiveAudienceSingleChatPresenter tq = this.q;
                         if (tq == null) {
                            a.S("serviceManager");
                         }
                         tq.a(b.class).K0(LayoutParamsType.RIGHT_MARGIN, LiveCommentsBizInScene.CHAT_SMALL_SCREEN.getValue(), i);
                         if (i) {
                            tq = this.q;
                            if (tq == null) {
                               a.S("serviceManager");
                            }
                            liveBulletin = tq.a(og).i7();
                            if (liveBulletin != null) {
                               liveBulletin.h(LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT, i);
                            }
                         }else {
                            BaseLiveAudienceSingleChatPresenter tq2 = this.q;
                            if (tq2 == null) {
                               a.S("serviceManager");
                            }
                            liveBulletin = tq2.a(og).i7();
                            if (liveBulletin != null) {
                               liveBulletin.k(LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT);
                            }
                         }
                         BaseLiveAudienceSingleChatPresenter tq1 = this.q;
                         if (tq1 == null) {
                            a.S("serviceManager");
                         }
                         tq1.a(a.class).Xm(width, layoutParams, rightMargin);
                         return;
                      }
                   }else {
                      i1 = layoutParams.width + a1.e(20.00f);
                      rightMargin = a1.e(f);
                   }
                   i = i1;
                   goto label_0059 ;
                }
             }
          }
          layoutParams = null;
          goto label_0030 ;
       }
       int i2 = 0;
       width = 0;
       rightMargin = 0;
       goto label_0061 ;
    }
    public void W8(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter.class, "13")) {
          return;
       }
       a.p(p0, "newConfig");
       BaseLiveAudienceSingleChatPresenter tB = this.B;
       if (tB == null) {
          a.S("liveAudienceChatPlayViewLogic");
       }
       tB.g();
       return;
    }
    public final boolean X8(Configuration p0){
       BaseLiveAudienceSingleChatPresenter obj = PatchProxy.applyOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.I;
       if (obj == null) {
          a.S("livePlayCallerContext");
       }
       boolean b = (obj.l() || (p0 != null && p0.orientation == 2))? true: false;
       return b;
    }
    public void Y8(){
       this.D = false;
    }
    public void Yd(int p0){
       ChatInfo b;
       g a;
       BaseLiveAudienceSingleChatPresenter tA1;
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = BaseLiveAudienceSingleChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "18")) {
          return;
       }
       b.Z(LiveLogTag.CHAT, this.getTag()+" onLiveChatEnded");
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       ChatInfo uChatInfo = tq.a(o.class).p();
       l ol = null;
       b = (uChatInfo != null)? uChatInfo.b: ol;
       if (b == ChatInfo$RoleType.GUEST) {
          BaseLiveAudienceSingleChatPresenter tB = this.B;
          if (tB == null) {
             a.S("liveAudienceChatPlayViewLogic");
          }
          tB.f();
          tB = this.G;
          if (tB != null) {
             tB.f = uChatInfo.e;
             tB.g = true;
             tB.h = uChatInfo.g;
             tB.a = System.currentTimeMillis() - tB.d;
          }
          a = g.a;
          BaseLiveAudienceSingleChatPresenter tA = this.A;
          boolean b1 = (tA != null && tA.f() == true)? true: false;
          BaseLiveAudienceSingleChatPresenter tt = this.t;
          if (tt == null) {
             a.S("mLiveInfoManager");
          }
          a.i(p0, b1, tt, uChatInfo, this.G);
          tA1 = this.A;
          if (tA1 != null) {
             tA1.d();
          }
          this.A = ol;
          tA1 = this.q;
          if (tA1 == null) {
             a.S(str);
          }
          tA1.a(c.class).n3();
          tA1 = this.u;
          if (tA1 == null) {
             a.S("mLogPackageProvider");
          }
          c0.Q(false, tA1.a());
       }
       if (!PatchProxy.applyVoid(ol, this, uBaseLiveAud, "19")) {
          f.g(this);
          tA1 = this.q;
          if (tA1 == null) {
             a.S(str);
          }
          tA1.a(LiveSlideSwitchService.class).o7(this.w, LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, true);
          tA1 = this.q;
          if (tA1 == null) {
             a.S(str);
          }
          a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW};
          tA1.a(d.class).Jh(uoaArray);
       }
       return;
    }
    public a bi(c p0,LiveMultiChatGuestWidgetConfig p1){
       return h.a(this, p0, p1);
    }
    public void d8(ChatInfo p0){
       f0.e(this, p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.z = m1.f(p0, 0x7f0a30e6);
       ViewGroup viewGroup = a.a(p0);
       a.o(viewGroup, "LiveAudienceBottomBarUti¡­ntBottomBarView\(rootView\)");
       this.x = viewGroup;
       View view = m1.f(p0, R.id.top_bar);
       a.o(view, "ViewBindUtils.bindWidget¡­ve.audience.R.id.top_bar\)");
       this.y = view;
       p0 = m1.f(p0, R.id.live_chat_small_screen_container_wrapper);
       a.o(p0, "ViewBindUtils.bindWidget¡­screen_container_wrapper\)");
       this.J = p0;
       return;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.q = obj;
       this.r = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.H = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject<LivePlayCallerCon¡­allerContext::class.java\)");
       this.I = obj;
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceSingleChatPresenter.class, "23")) {
          return;
       }
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(o.class).close(7);
       return;
    }
    public void l6(String p0,boolean p1){
       boolean b;
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = BaseLiveAudienceSingleChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uBaseLiveAud, "28")) {
          return;
       }
       a.p(p0, "userId");
       b.Z(LiveLogTag.MULTI_CHAT, this.getTag()+"showLiveSmallScreen audience:"+p0+','+p1);
       uBaseLiveAud = this.q;
       if (uBaseLiveAud == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = uBaseLiveAud.a(o.class).p();
       if (uChatInfo != null) {
          Map map = uChatInfo.b();
          if (map != null) {
             a uoa = map.get(p0);
             if (uoa != null && uoa.f == 2) {
                b = true;
             label_006c :
                uBaseLiveAud = this.u;
                if (uBaseLiveAud == null) {
                   a.S("mLogPackageProvider");
                }
                ClientContent$LiveStreamPackage liveStreamPa = uBaseLiveAud.a();
                BaseLiveAudienceSingleChatPresenter tt = this.t;
                if (tt == null) {
                   a.S("mLiveInfoManager");
                }
                User user = tt.I();
                if (user != null) {
                   user = user.mId;
                   if (user != null) {
                   label_008f :
                      c0.U(liveStreamPa, user, p1, b, this.R8());
                      return;
                   }
                }
                String str = "";
                goto label_008f ;
             }
          }
       }
       b = false;
       goto label_006c ;
    }
    public boolean n3(String p0){
       boolean b;
       BaseLiveAudienceSingleChatPresenter obj = PatchProxy.applyOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       obj = this.q;
       if (obj == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = obj.a(o.class).p();
       if (uChatInfo != null) {
          uChatInfo = uChatInfo.b;
          ChatInfo$RoleType gUEST = ChatInfo$RoleType.GUEST;
          if (uChatInfo == gUEST) {
             if (uChatInfo == gUEST) {
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                if (TextUtils.n(p0, qCurrentUser.getId())) {
                label_004c :
                   b = false;
                label_004d :
                   return b;
                }
             }else {
                goto label_004c ;
             }
          }
          b = true;
          goto label_004d ;
       }else {
          goto label_004c ;
       }
    }
    public void onLiveTypeChange(int p0){
       BaseLiveAudienceSingleChatPresenter tq;
       BaseLiveAudienceSingleChatPresenter uBaseLiveAud = BaseLiveAudienceSingleChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "14")) {
          return;
       }
       LiveLogTag cHAT = LiveLogTag.CHAT;
       b.c0(cHAT, this.getTag()+"onLiveTypeChange", "type", Integer.valueOf(p0));
       if (p0 == 1) {
          tq = this.q;
          if (tq == null) {
             a.S("serviceManager");
          }
          c uoc = tq.a(c.class);
          a.o(uoc, "serviceManager.getServic¡­yViewService::class.java\)");
          if (!uoc.bk()) {
             f.i("baseSingleChat.enableBizIfCompatible", new BaseLiveAudienceSingleChatPresenter$f(this), this);
          }else {
             b.Z(cHAT, this.getTag()+"onLiveTypeChange isPlayViewSizeEmpty");
          }
       }else {
          b.Z(cHAT, this.getTag()+"onLiveTypeChange disableBiz");
          tq = this.q;
          if (tq == null) {
             a.S("serviceManager");
          }
          tq.a(d.class).yj(AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW);
       }
       return;
    }
    public void p2(String p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter.class, "27")) {
          return;
       }
       a.p(p0, "userId");
       BaseLiveAudienceSingleChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = tq.a(o.class).p();
       if (uChatInfo != null) {
          Map map = uChatInfo.b();
          if (map != null) {
             uoa = map.get(p0);
             if (uoa != null && uoa.f == 2) {
                uoa = 1;
             label_003d :
                if (uoa) {
                   f.c(p0);
                }else {
                   f.e(p0);
                }
                return;
             }
          }
       }
       uoa = 0;
       goto label_003d ;
    }
    public void pe(a p0,ByteBuffer p1,int p2,int p3,int p4){
       f0.b(this, p0, p1, p2, p3, p4);
    }
}
