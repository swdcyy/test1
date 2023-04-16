package com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter;
import xd1.a;
import zd1.b$a;
import rd1.i;
import mq5.h;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$b;
import k51.c;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$a;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$c;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$b;
import t02.a0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import rd1.m;
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
import ox0.o;
import android.view.View;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$onBind$1;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$onBind$2;
import lp3.e;
import msd.a;
import ww0.k;
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
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$d;
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
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$g;
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
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$e;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatCountdownDialog$a;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import com.kwai.framework.model.user.QCurrentUser;
import xd1.g;
import ae1.c;
import com.yxcorp.utility.n;
import tkd.b;
import tkd.d;
import ym5.a;
import va1.b0;
import qsd.d;
import com.kuaishou.live.basic.playview.LivePlayViewHelper;
import java.lang.Math;
import lnc.a1;
import java.util.List;
import yd1.b;
import i81.g;
import dp3.g;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import n91.b;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kuaishou.live.common.core.component.comments.LiveCommentsBizInScene;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$BizType;
import le1.a;
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
import com.kuaishou.live.audience.component.chat.multi.BaseLiveAudienceMultiChatPresenter$f;
import zd1.f;
import java.nio.ByteBuffer;

public abstract class BaseLiveAudienceMultiChatPresenter extends c implements a, b$a, i, h, LivePlayerTypeChangeListener, LiveAudienceChatService$b	// class@000a82
{
    public o A;
    public b B;
    public boolean C;
    public Handler D;
    public HandlerThread E;
    public a F;
    public m G;
    public a0 H;
    public ViewGroup I;
    public a J;
    public final c K;
    public final c L;
    public final c$b M;
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
    public l z;
    public static String sLivePresenterClassName = "BaseLiveAudienceMultiChatPresenter";

    public void BaseLiveAudienceMultiChatPresenter(){
       super();
       this.K = new BaseLiveAudienceMultiChatPresenter$a(this);
       this.L = new BaseLiveAudienceMultiChatPresenter$c(this);
       this.M = new BaseLiveAudienceMultiChatPresenter$b(this);
    }
    public static final a0 P8(BaseLiveAudienceMultiChatPresenter p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("livePlayCallerContext");
       }
       return p0;
    }
    public void B2(int p0){
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "12")) {
          return;
       }
       uBaseLiveAud = this.q;
       if (uBaseLiveAud == null) {
          a.S("serviceManager");
       }
       m om = uBaseLiveAud.a(m.class);
       if (om.p() != null) {
          om.close(p0);
       }
       return;
    }
    public void D7(String[] p0){
       f0.f(this, p0);
    }
    public void E8(){
       m om = m.class;
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "11")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter tq = this.q;
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
       View view = this.m8();
       a.o(view, "rootView");
       BaseLiveAudienceMultiChatPresenter tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       o oo = new o(view, tq1, this.w, new BaseLiveAudienceMultiChatPresenter$onBind$1(this), new BaseLiveAudienceMultiChatPresenter$onBind$2(this));
       this.A = uoc;
       BaseLiveAudienceMultiChatPresenter tH = this.H;
       if (tH == null) {
          a.S("livePlayCallerContext");
       }
       this.p = new k(tH);
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
       m om1 = tq.a(om);
       tH = this.p;
       if (tH == null) {
          a.S("chatWidgetHelper");
       }
       om1.i5(tH);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(om).i5(this);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.a(om).r1(this.K);
       BaseLiveAudienceMultiChatPresenter tq2 = this.q;
       if (tq2 == null) {
          a.S(str);
       }
       c uoc1 = tq2.a(e.class);
       a.o(uoc1, "serviceManager.getServic¡­layerService::class.java\)");
       uoc1.Vc().addLivePlayerTypeChangeListener(this);
       tq2 = this.r;
       a.m(tq2);
       tq2.c(this.M);
       tq2 = this.s;
       a.m(tq2);
       tq2.W0(this.L, true);
       tq2 = this.I;
       if (tq2 == null) {
          a.S("chatSmallScreenContainer");
       }
       tq2.setVisibility(4);
       a uoa = new a(ViewElement.CHAT_SMALL_SCREEN, new BaseLiveAudienceMultiChatPresenter$d(this));
       uoa.c();
       this.J = uoa;
       return;
    }
    public void En(boolean p0,float p1,a p2){
       AutoInviteFriendsGuidingPanel$a d;
       if (PatchProxy.isSupport(BaseLiveAudienceMultiChatPresenter.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Float.valueOf(p1), p2, this, BaseLiveAudienceMultiChatPresenter.class, "18")) {
          return;
       }
       a.p(p2, "chatUserInfo");
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       c uoc = tq.a(m.class);
       a.o(uoc, "serviceManager.getServic¡­iChatService::class.java\)");
       BaseLiveAudienceMultiChatPresenter tu = this.u;
       String str1 = "mLogPackageProvider";
       if (tu == null) {
          a.S(str1);
       }
       c0.Q(true, tu.a());
       if (this.C == null) {
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
             tq = this.A;
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
                   BaseLiveAudienceMultiChatPresenter tq1 = this.q;
                   if (tq1 == null) {
                      a.S(str);
                   }
                   tq1.a(LiveSlideSwitchService.class).o7(this.w, LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, 0);
                   tq1 = this.F;
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
                   tq = this.G;
                   if (tq == null) {
                      a.S("liveBasicContext");
                   }
                   d uod1 = new d(tq);
                   tq = this.H;
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
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "13")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       m om = tq.a(m.class);
       if (om.p() != null) {
          om.G0();
       }
       return;
    }
    public void J2(int p0,String p1){
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBaseLiveAud, "21")) {
          return;
       }
       uBaseLiveAud = PatchProxy.apply(null, this, uBaseLiveAud, "22");
       if (uBaseLiveAud != PatchProxyResult.class) {
       }else if(this.D == null){
          HandlerThread handlerThrea = new HandlerThread("LiveChatQosEventHandlerThread");
          this.E = handlerThrea;
          handlerThrea.start();
          this.D = new Handler(handlerThrea.getLooper());
       }
       uBaseLiveAud = this.D;
       if (uBaseLiveAud != null) {
          uBaseLiveAud.post(new BaseLiveAudienceMultiChatPresenter$g(p0, p1));
       }
       return;
    }
    public void J8(){
       m om = m.class;
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "24")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(LiveAudienceChatService.class).Mg(this);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(om).close(9);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       m om1 = tq.a(om);
       BaseLiveAudienceMultiChatPresenter tp = this.p;
       if (tp == null) {
          a.S("chatWidgetHelper");
       }
       om1.Y5(tp);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(om).Y5(this);
       tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(om).H1(this.K);
       BaseLiveAudienceMultiChatPresenter tq1 = this.q;
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
       tq1 = this.E;
       if (tq1 != null && tq1.isAlive()) {
          tq1.quit();
       }
       tq1 = this.D;
       if (tq1 != null) {
          tq1.removeCallbacksAndMessages(null);
       }
       tq1 = this.z;
       if (tq1 != null) {
          tq1.d();
       }
       this.z = null;
       tq1 = this.q;
       if (tq1 == null) {
          a.S("serviceManager");
       }
       tq1.a(g.class).qd();
       tq1 = this.B;
       if (tq1 != null) {
          tq1.d();
       }
       tq1 = this.s;
       a.m(tq1);
       tq1.Q0(this.L);
       tq1 = this.r;
       a.m(tq1);
       tq1.a(this.M);
       f.g(this);
       tq1 = this.J;
       if (tq1 == null) {
          a.S("choreographer");
       }
       tq1.b();
       return;
    }
    public void Kj(int p0,boolean p1,int p2,boolean p3){
       BaseLiveAudienceMultiChatPresenter this;
       BaseLiveAudienceMultiChatPresenter w;
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = this;
       if (PatchProxy.isSupport(BaseLiveAudienceMultiChatPresenter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, BaseLiveAudienceMultiChatPresenter.class, "16")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter q = uBaseLiveAud.q;
       String str = "serviceManager";
       if (q == null) {
          a.S(str);
       }
       q.a(d.class).J0();
       BaseLiveAudienceMultiChatPresenter t = uBaseLiveAud.t;
       if (t == null) {
          a.S("mLiveInfoManager");
       }
       String liveStreamId = t.getLiveStreamId();
       this = uBaseLiveAud.u;
       if (this == null) {
          a.S("mLogPackageProvider");
       }
       ClientContent$LiveStreamPackage this1 = this.a();
       BaseLiveAudienceMultiChatPresenter u = uBaseLiveAud.u;
       if (u == null) {
          a.S("mLogPackageProvider");
       }
       e0 page = u.getPage();
       BaseLiveAudienceMultiChatPresenter q1 = uBaseLiveAud.q;
       if (q1 == null) {
          a.S(str);
       }
       uBaseLiveAud.z = new l(liveStreamId, this1, page, q1.a(m.class));
       q = uBaseLiveAud.H;
       if (q == null) {
          a.S("livePlayCallerContext");
       }
       boolean b = (q.N().r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL))? false: p1;
       if (p2) {
          int i = (b)? 2: 1;
          BaseLiveAudienceMultiChatPresenter u1 = uBaseLiveAud.u;
          if (u1 == null) {
             a.S("mLogPackageProvider");
          }
          c0.w(i, u1.a());
          q1 = uBaseLiveAud.z;
          a.m(q1);
          w = uBaseLiveAud.w;
          q = uBaseLiveAud.t;
          if (q == null) {
             a.S("mLiveInfoManager");
          }
          q1.j(w, f.o(q.I()).mProfile, p0, b, p3);
       }else {
          q1 = uBaseLiveAud.z;
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
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "17")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       tq.a(LiveSlideSwitchService.class).Xj();
       if (this.w instanceof FragmentActivity) {
          BaseLiveAudienceMultiChatPresenter tw = this.w;
          Objects.requireNonNull(tw, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          new LiveChatCountdownDialog(LiveChatCountdownDialog$DialogMode.AUDIENCE, BaseLiveAudienceMultiChatPresenter$e.a).Cb(tw.getSupportFragmentManager(), "LiveAudienceChatWithGuestPresenter");
       }
       a uoa = new a();
       this.F = uoa;
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
       g obj = PatchProxy.apply(null, this, BaseLiveAudienceMultiChatPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = g.a;
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       return obj.a(tq, false);
    }
    public final c S8(float p0,float p1,float p2,float p3){
       BaseLiveAudienceMultiChatPresenter obj;
       float this;
       int i2;
       BaseLiveAudienceMultiChatPresenter tx;
       int i3;
       int i4;
       int i5;
       float f3;
       if (PatchProxy.isSupport(BaseLiveAudienceMultiChatPresenter.class)) {
          obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, BaseLiveAudienceMultiChatPresenter.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.w;
       a.m(obj);
       int i = n.k(obj);
       BaseLiveAudienceMultiChatPresenter tw = this.w;
       a.m(tw);
       int i1 = n.j(tw);
       float f = (float)i;
       float f1 = 0x3f800000;
       this = (float)i1;
       float f2 = (f * f1) / this;
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       c uoc = tq.a(e.class);
       a.o(uoc, "serviceManager.getServic¡­layerService::class.java\)");
       LivePlayerController livePlayerCo = uoc.Vc();
       a.o(livePlayerCo, "serviceManager.getServic¡­ava\).livePlayerController");
       float videoSizeRat = livePlayerCo.getVideoSizeRatio();
       p0 = (float)(int)(p0 * 720.00f) / 720.00f;
       p1 = (float)(int)(p1 * 1280.00f) / 1280.00f;
       p2 = (float)(int)(p2 * 720.00f) / 720.00f;
       p3 = (float)(int)(p3 * 1280.00f) / 1280.00f;
       boolean b = b0.a();
       if (d.a(0x4c5dd1b8).f2() && (b && videoSizeRat - (float)1 < 0)) {
          BaseLiveAudienceMultiChatPresenter ty = this.y;
          if (ty != null) {
             a.m(ty);
             i = ty.getBottom();
             videoSizeRat = videoSizeRat * this;
             i2 = d.H0((((f1 - p0) - p2) * videoSizeRat));
             f1 = ((f1 - p1) - p3) * this;
             tx = this.x;
             if (tx == null) {
                a.S("mBottomView");
             }
             i3 = d.H0((f1 - (float)tx.getHeight())) + (i1 - i);
             i4 = d.H0((this * p3));
             i5 = d.H0((videoSizeRat * p2));
          }else if(videoSizeRat - f2 >= 0){
             videoSizeRat = videoSizeRat * this;
             i2 = d.H0((((f1 - p0) - p2) * videoSizeRat));
             f1 = ((f1 - p1) - p3) * this;
             tx = this.x;
             if (tx == null) {
                a.S("mBottomView");
             }
             i3 = d.H0((f1 - (float)tx.getHeight()));
             i4 = d.H0((this * p3));
             i5 = d.H0((videoSizeRat * p2));
          }else {
             BaseLiveAudienceMultiChatPresenter tw1 = this.w;
             a.m(tw1);
             if (LivePlayViewHelper.c(i, i1, videoSizeRat, tw1)) {
                this = this * videoSizeRat;
                i2 = d.H0(((((f1 - p0) - p2) * this) + Math.max(((f - this) / (float)2), 0)));
                f3 = this / videoSizeRat;
                f1 = ((f1 - p1) - p3) * f3;
                tx = this.x;
                if (tx == null) {
                   a.S("mBottomView");
                }
                i3 = d.H0((f1 - (float)tx.getHeight()));
                i4 = d.H0((f3 * p3));
                i5 = d.H0((this * p2));
             }else {
                i2 = d.H0((((f1 - p0) - p2) * f));
                f3 = f / videoSizeRat;
                f1 = ((f1 - p1) - p3) * f3;
                tx = this.x;
                if (tx == null) {
                   a.S("mBottomView");
                }
                i3 = d.H0((f1 - (float)tx.getHeight()));
                i4 = d.H0((f3 * p3));
                i5 = d.H0((f * p2));
             }
          }
       }else {
          goto label_00d4 ;
       }
       c uoc1 = new c(i2, i3, (i5 + a1.d(0x7f0702ac)), i4);
       b.S(LiveLogTag.CHAT.appendTag(this.getTag()), "getChatWindowPositionInfo", "chatWindowPositionInfo", uoc1);
       return uoc1;
    }
    public int T7(){
       return f0.a(this);
    }
    public final i V8(){
       BaseLiveAudienceMultiChatPresenter obj = PatchProxy.apply(null, this, BaseLiveAudienceMultiChatPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
    public final void W8(boolean p0,boolean p1,b p2){
       ViewGroup$LayoutParams layoutParams;
       int i1;
       ViewGroup$MarginLayoutParams rightMargin;
       ViewGroup$LayoutParams width;
       LiveBulletinLayoutManager liveBulletin;
       g og = g.class;
       if (PatchProxy.isSupport(BaseLiveAudienceMultiChatPresenter.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, BaseLiveAudienceMultiChatPresenter.class, "31")) {
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
                         BaseLiveAudienceMultiChatPresenter tq = this.q;
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
                            BaseLiveAudienceMultiChatPresenter tq2 = this.q;
                            if (tq2 == null) {
                               a.S("serviceManager");
                            }
                            liveBulletin = tq2.a(og).i7();
                            if (liveBulletin != null) {
                               liveBulletin.k(LiveBulletinLayoutManager$BizType.LIVE_LINE_CHAT);
                            }
                         }
                         BaseLiveAudienceMultiChatPresenter tq1 = this.q;
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
    public void Yd(int p0){
       ChatInfo b;
       g a;
       BaseLiveAudienceMultiChatPresenter tz1;
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "19")) {
          return;
       }
       b.Z(LiveLogTag.CHAT, this.getTag()+" onLiveChatEnded");
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       String str = "serviceManager";
       if (tq == null) {
          a.S(str);
       }
       ChatInfo uChatInfo = tq.a(m.class).p();
       l ol = null;
       b = (uChatInfo != null)? uChatInfo.b: ol;
       if (b == ChatInfo$RoleType.GUEST) {
          BaseLiveAudienceMultiChatPresenter tA = this.A;
          if (tA == null) {
             a.S("liveAudienceChatPlayViewLogic");
          }
          tA.f();
          tA = this.F;
          if (tA != null) {
             tA.f = uChatInfo.e;
             tA.g = true;
             tA.h = uChatInfo.g;
             tA.a = System.currentTimeMillis() - tA.d;
          }
          a = g.a;
          BaseLiveAudienceMultiChatPresenter tz = this.z;
          boolean b1 = (tz != null && tz.f() == true)? true: false;
          BaseLiveAudienceMultiChatPresenter tt = this.t;
          if (tt == null) {
             a.S("mLiveInfoManager");
          }
          a.i(p0, b1, tt, uChatInfo, this.F);
          tz1 = this.z;
          if (tz1 != null) {
             tz1.d();
          }
          this.z = ol;
          tz1 = this.q;
          if (tz1 == null) {
             a.S(str);
          }
          tz1.a(c.class).n3();
          tz1 = this.u;
          if (tz1 == null) {
             a.S("mLogPackageProvider");
          }
          c0.Q(false, tz1.a());
       }
       if (!PatchProxy.applyVoid(ol, this, uBaseLiveAud, "20")) {
          f.g(this);
          tz1 = this.q;
          if (tz1 == null) {
             a.S(str);
          }
          tz1.a(LiveSlideSwitchService.class).o7(this.w, LiveSlideSwitchService$DisableSlidePlayFunction.LIVE_CHAT, true);
          tz1 = this.q;
          if (tz1 == null) {
             a.S(str);
          }
          a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_VIDEO_VIEW,AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW};
          tz1.a(d.class).Jh(uoaArray);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceMultiChatPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.y = m1.f(p0, 0x7f0a30e6);
       ViewGroup viewGroup = a.a(p0);
       a.o(viewGroup, "LiveAudienceBottomBarUti¡­ntBottomBarView\(rootView\)");
       this.x = viewGroup;
       p0 = m1.f(p0, R.id.live_chat_small_screen_container_wrapper);
       a.o(p0, "ViewBindUtils.bindWidget¡­screen_container_wrapper\)");
       this.I = p0;
       return;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.q = obj;
       this.r = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.G = obj;
       obj = this.q8(a0.class);
       a.o(obj, "inject<LivePlayCallerCon¡­allerContext::class.java\)");
       this.H = obj;
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, BaseLiveAudienceMultiChatPresenter.class, "23")) {
          return;
       }
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       tq.a(m.class).close(7);
       return;
    }
    public void l6(String p0,boolean p1){
       boolean b;
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uBaseLiveAud, "28")) {
          return;
       }
       a.p(p0, "userId");
       b.Z(LiveLogTag.MULTI_CHAT, this.getTag()+"showLiveSmallScreen audience:"+p0+','+p1);
       uBaseLiveAud = this.q;
       if (uBaseLiveAud == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = uBaseLiveAud.a(m.class).p();
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
                BaseLiveAudienceMultiChatPresenter tt = this.t;
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
       BaseLiveAudienceMultiChatPresenter obj = PatchProxy.applyOneRefs(p0, this, BaseLiveAudienceMultiChatPresenter.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       obj = this.q;
       if (obj == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = obj.a(m.class).p();
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
       BaseLiveAudienceMultiChatPresenter tq;
       BaseLiveAudienceMultiChatPresenter uBaseLiveAud = BaseLiveAudienceMultiChatPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveAud) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLiveAud, "15")) {
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
             f.i("baseMultiChat.enableBizIfCompatible", new BaseLiveAudienceMultiChatPresenter$f(this), this);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceMultiChatPresenter.class, "27")) {
          return;
       }
       a.p(p0, "userId");
       BaseLiveAudienceMultiChatPresenter tq = this.q;
       if (tq == null) {
          a.S("serviceManager");
       }
       ChatInfo uChatInfo = tq.a(m.class).p();
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
