package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$a;
import nsd.u;
import hu2.i;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$vcFactory$1;
import ss2.h;
import hu2.g;
import hf3.a;
import qu2.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$micSeatLongConnection$1;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$micSeatLongConnection$2;
import zo2.n;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyOpened;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import java.lang.Boolean;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import android.graphics.Rect;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$b;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$c;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$d;
import hp2.l;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import ru2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.a;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import qrd.l1;
import hu2.k;
import crd.b;
import ja2.a;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import xo1.j;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$2;
import msd.l;
import co2.f2;
import zo2.j;
import co2.g1;
import java.util.Objects;
import co2.f1;
import co2.i0;
import ok.x;
import hu2.j;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import z12.e;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import zo2.l;
import t02.a0;
import lo2.d;
import com.kuaishou.live.core.voiceparty.channel.feed.VoicePartyChannelFeedServiceImpl;
import android.app.Activity;
import yx2.i;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.voiceparty.util.ReleasableKt;
import pu2.a;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import qc2.a;
import wu2.a;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.g0;
import g81.c;
import pq5.c;
import eu2.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyPlayInfo;
import ks5.c;
import lo2.b;
import eu2.g;
import lp3.e;
import po2.b;
import brd.t;
import dq5.b;
import x43.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import tu2.c;
import zt2.a;
import com.kuaishou.live.core.voiceparty.a;
import qu2.c;
import com.kuaishou.live.core.voiceparty.b;
import fq5.b;
import p91.m;
import com.kuaishou.live.core.voiceparty.micseats.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.h;
import w02.g;
import mrd.c;
import s51.c;
import lp3.c;
import o63.a;
import bb1.o;
import wj2.r0;
import m91.b;
import bt2.e;
import dt2.b;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import bt2.a;
import hu2.h;
import aq5.d;
import hu2.b;
import qs2.a;
import ft2.h;
import q92.a;
import as2.a;
import gt2.a;
import yt2.b;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$5;
import msd.s;
import gt2.b;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$6;
import msd.u;
import hu2.n;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$setupApplyButtonLogic$1;
import u63.a;
import go2.j;
import androidx.fragment.app.FragmentActivity;
import hu2.o;
import go2.i;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher;
import ox2.b;
import x61.c;
import n91.e;
import ey2.d;
import zq5.b;
import com.kuaishou.live.core.voiceparty.invitebutton.audience.VoicePartyAudienceInviteButtonViewController;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyPlayModeSwitcher;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$7;
import msd.q;
import msd.p;
import hp2.s;
import zo2.l0;
import com.kuaishou.live.core.voiceparty.core.shared.a$d;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$start$1;
import crd.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$b;
import krd.a;
import zo2.h;
import zo2.i;
import erd.g;
import zo2.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import hp2.h;
import com.kuaishou.live.core.voiceparty.core.shared.KtvOpen;
import ut7.e;
import hp2.n;
import com.kuaishou.live.core.voiceparty.core.shared.TheaterOpen;
import hp2.m;
import com.kuaishou.live.core.voiceparty.core.shared.TeamPkOpen;
import hp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.MaybeAudioChatOpen;
import hp2.p;
import com.kuaishou.live.core.voiceparty.core.shared.MaybeVideoChatOpen;
import zo2.c;
import com.kuaishou.live.core.voiceparty.core.shared.CrossRoomPkOpen;
import hp2.f;
import zo2.d;
import com.kuaishou.live.core.voiceparty.core.shared.GridChatOpen;
import hp2.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.livestage.g;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import et5.a;
import com.kuaishou.live.comments.view.a;
import x43.c;
import xq5.c;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import co2.q1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import mw2.e;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import k2b.u1;
import hp2.c;
import com.kwai.robust.PatchProxyResult;
import vq5.d;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import ru2.c;
import ru2.d;
import ru2.a;
import ru2.g;
import lk2.c;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$1;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$2;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$3;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$4;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import vu2.e;
import vu2.c;
import vu2.d;
import vu2.a;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import vu2.b;
import erd.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$5;
import qx1.a;
import ry1.b;
import or5.d;
import hu2.a;

public final class VoicePartyAudienceViewController extends ViewController	// class@00184a
{
    public final a A;
    public final VoicePartyAudienceViewController$b B;
    public final VoicePartyAudienceViewController$c C;
    public final VoicePartyAudienceViewController$d D;
    public final l E;
    public int F;
    public ViewController G;
    public final i H;
    public final a I;
    public AudienceVoicePartyManager j;
    public final q k;
    public g l;
    public final h m;
    public a n;
    public a o;
    public VoicePartyChannelFeedServiceImpl p;
    public c q;
    public e r;
    public ViewController s;
    public b t;
    public a u;
    public final a v;
    public final PublishSubject w;
    public h x;
    public View y;
    public j z;
    public static final VoicePartyAudienceViewController$a J;

    static {
       VoicePartyAudienceViewController.J = new VoicePartyAudienceViewController$a(null);
    }
    public void VoicePartyAudienceViewController(i p0,a p1){
       a.p(p0, "dependence");
       a.p(p1, "closeReasonFetcher");
       super();
       this.H = p0;
       this.I = p1;
       this.k = new VoicePartyAudienceViewController$vcFactory$1(this);
       a uoa = p0.b().e();
       String str = p0.b().d().d();
       VoicePartyAudienceViewController$micSeatLongConnection$1 omicSeatLong = new VoicePartyAudienceViewController$micSeatLongConnection$1(this);
       VoicePartyAudienceViewController$micSeatLongConnection$2 omicSeatLong1 = new VoicePartyAudienceViewController$micSeatLongConnection$2(this);
       LiveStreamMessages$SCVoicePartyOpened micSeatDetai = p0.b().m().e().micSeatDetailInfo;
       if (micSeatDetai != null) {
       }else {
          micSeatDetai = new LiveStreamMessages$MicSeatDetailInfo[0];
       }
       h oh = new h(uoa, str, omicSeatLong, omicSeatLong1, micSeatDetai);
       this.m = new VoicePartyAudienceViewController$vcFactory$1(this);
       a uoa1 = a.h(Boolean.TRUE);
       a.o(uoa1, "BehaviorSubject.createDefault\(true\)");
       this.v = uoa1;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<VoicePartyEvent>\(\)");
       this.w = publishSubje;
       uoa1 = a.h(new Rect());
       a.o(uoa1, "BehaviorSubject.createDefault\(Rect\(\)\)");
       this.A = uoa1;
       this.B = new VoicePartyAudienceViewController$b(this);
       this.C = new VoicePartyAudienceViewController$c(this);
       this.D = new VoicePartyAudienceViewController$d(this);
       this.E = new l();
       return;
    }
    public static final AudienceVoicePartyManager V2(VoicePartyAudienceViewController p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("voicePartyManager");
       }
       return p0;
    }
    public static f Z2(VoicePartyAudienceViewController p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       return p0.Y2(p1);
    }
    public void F2(){
       VoicePartyAudienceViewController y;
       b uob;
       VoicePartyAudienceViewController d;
       k u;
       c uoc;
       a0 uoa02;
       VoicePartyAudienceViewController j1;
       VoicePartyAudienceViewController q;
       String str3;
       AudienceVoicePartyManager g1;
       AudienceVoicePartyManager i;
       String[] stringArray;
       View view = this;
       VoicePartyAudienceViewController voicePartyAu = VoicePartyAudienceViewController.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, view, voicePartyAu, str)) {
          return;
       }
       View view1 = a.a(view, this.D2(), R.layout.arg_RES_7f0d0d29);
       view1.setTag(d.a, LayoutViewType.VoicePartyContent.name());
       view.R2(view1);
       view.a3(view.H.b().m().e().isGoldenRoom);
       view.y = view.A2(0x7f0a273c);
       k f = view.H.e().F;
       String str1 = "bottomBarPlaceHolder";
       if (f != null) {
          y = view.y;
          if (y == null) {
             a.S(str1);
          }
          uob = f.a(y);
          if (uob != null) {
             AutoDisposeKt.b(uob, view);
          }
       }
       y = view.y;
       if (y == null) {
          a.S(str1);
       }
       boolean b = true;
       view.z = new j(y, b, new VoicePartyAudienceViewController$onCreate$2(view));
       view.H.b().l().D(view.E);
       VoicePartyAudienceViewController h = view.H;
       view.j = h.d.a(h.b().m());
       g1 og1 = view.H.f();
       d = view.D;
       Objects.requireNonNull(og1);
       if (!PatchProxy.applyVoidOneRefs(d, og1, g1.class, str)) {
          a.p(d, "delegate");
          og1.c = d;
          og1.d.C(new f1(d));
       }
       AudienceMicSeatsDataManager uAudienceMic = view.H.d().c();
       n on = view.H.b().m();
       y = view.j;
       if (y == null) {
          a.S("voicePartyManager");
       }
       Objects.requireNonNull(uAudienceMic);
       VoicePartyAudienceViewController voicePartyAu1 = null;
       if (!PatchProxy.applyVoidTwoRefs(on, y, uAudienceMic, AudienceMicSeatsDataManager.class, str)) {
          a.p(on, "param");
          a.p(y, "audienceManager");
          if (on.e().micSeatDetailInfo != null) {
             String str4 = "VoicePartyMicSeatsDataManager";
             if (a.g(uAudienceMic.q.y(), on.i()) ^ b) {
                stringArray = new String[voicePartyAu1];
                e.c(str4, "onReceiveStageSeats voice party id not match", stringArray);
             }else if(uAudienceMic.q.k > on.e().micSeatsVersion){
                stringArray = new String[voicePartyAu1];
                e.c(str4, "updateMicSeatList error because micSeatsVersion is overdue", stringArray);
             }else {
                LiveStreamMessages$SCVoicePartyOpened micSeatDetai = on.e().micSeatDetailInfo;
                str4 = "param.proto.micSeatDetailInfo";
                a.o(micSeatDetai, str4);
                uAudienceMic.D(micSeatDetai);
                LiveStreamMessages$SCVoicePartyOpened micSeatDetai1 = on.e().micSeatDetailInfo;
                a.o(micSeatDetai1, str4);
                uAudienceMic.L(micSeatDetai1);
             }
          }
          y.m(uAudienceMic.p);
       }
       if (view.H.b().f() != null && view.H.b().j() != null) {
          VoicePartyChannelFeedServiceImpl voicePartyCh = new VoicePartyChannelFeedServiceImpl(this.B2(), view.H.b().d(), view.H.b().l(), view.H.b().f(), view.H.b().j());
          view.p = ReleasableKt.a(uAudienceMic, view);
       }
       Activity uActivity = this.B2();
       VoicePartyAudienceViewController j = view.j;
       if (j == null) {
          a.S("voicePartyManager");
       }
       a uoa = new a(uActivity, j, this.P2(), view.H.b().l().t, view.H.e().e(), view.H.e().d(), view.H.e().f, view.H.e().e, view.H.e().a(), view.H.e().m());
       view.n = uAudienceMic;
       uAudienceMic.b();
       if (view.p != null) {
          u = view.H.e().u;
          a.m(u);
          y = view.p;
          a.m(y);
          uoc = new c(this.B2(), view.H.b().d(), view.H.b().l(), view.H.b().m().e().voicePartyPlayInfo.newPlayType, u, y);
          view.l = ReleasableKt.a(uAudienceMic, view);
       }
       e uoe = view.H.c();
       if (uoe != null) {
          f2 uof2 = view.H.b().l();
          a0 uoa0 = view.H.b().f();
          a0 uoa01 = (uoa0 != null)? uoa0.W: objArray;
          uoa0 = view.H.b().f();
          uoa02 = (uoa0 != null)? uoa0.H: objArray;
          u = view.H.e().E;
          a0 uoa03 = view.H.b().f();
          a0 uoa04 = (uoa03 != null)? uoa03.y2: objArray;
          b uob1 = new b(uof2, uoe, uoa01, uoa02, u, uoa04, view.A.hide());
          view.t = uAudienceMic;
       }
       view.q = new c(view.H.b().e());
       uoa = new a(view.H.b().d(), view.H.b().l(), view.H.b().b(), view.H.b().k().c(), view.H.d().c());
       view.u = uAudienceMic;
       str1 = "dependence.baseDependenc¡­llerContext.mAdminService";
       String str2 = "muteService";
       if (view.H.b().f() != null) {
          uob = view.H.b().f().b();
          a.o(uob, "dependence.baseDependenc¡­rContext.liveBasicContext");
          e uoe1 = uob.t5();
          uActivity = this.B2();
          c childFragmen = view.H.b().c().getChildFragmentManager();
          a.o(childFragmen, "dependence.baseDependenc¡­ment.childFragmentManager");
          a uoa1 = view.H.b().d();
          a0 uoa05 = view.H.b().f();
          f2 uof21 = view.H.b().l();
          j1 = view.j;
          if (j1 == null) {
             a.S("voicePartyManager");
          }
          h oh = view.H.d().b();
          b uob2 = view.H.b().k().c();
          AudienceMicSeatsDataManager uAudienceMic1 = view.H.d().c();
          q = view.q;
          if (q == null) {
             a.S("micSeatsEmojiDispatchService");
          }
          g og = view.H.e().f();
          voicePartyAu1 = view.u;
          if (voicePartyAu1 == null) {
             a.S(str2);
          }
          a.o(uoe1, "serviceManager");
          c uoc1 = uoe1.a(c.class);
          a.o(uoc1, "serviceManager.getServic¡­ManagerProxy::class.java\)");
          c uoc2 = uoc1;
          uoc1 = uoe1.a(a.class);
          a.o(uoc1, "serviceManager.getServic¡­ridgeService::class.java\)");
          c uoc3 = uoc1;
          a0 b2 = view.H.b().f().b2;
          a0 uoa06 = b2;
          a.o(b2, str1);
          b2 = view.H.b().f().U;
          a0 uoa07 = b2;
          a.o(b2, "dependence.baseDependenc¡­t.mShowLiveProfileService");
          b2 = view.H.b().f().Y0;
          a0 uoa08 = b2;
          a.o(b2, "dependence.baseDependenc¡­ntext.mBizRelationManager");
          str3 = str;
          uoa = new a(uActivity, childFragmen, uoa1, uoa05, uof21, j1, oh, uob2, uAudienceMic1, q, og, voicePartyAu1, view.H.d().d(), uoe1, uoc2, uoc3, uoa06, uoa07, uoa08);
          view.o = uoa02;
       }else {
          str3 = str;
       }
       e uoe2 = new e(view.H.b().l());
       Context uContext = this.D2();
       a uoa2 = view.H.b().d();
       f2 uof22 = uoe2.h();
       h = view.j;
       if (h == null) {
          a.S("voicePartyManager");
       }
       b uob3 = new b(uoe2, uContext, uoa2, uof22, h, view.H.d().c(), view.H.e().B);
       uoe2.c(str);
       uoe2.e();
       view.r = uoe2;
       VoicePartyAudienceViewController j2 = view.j;
       if (j2 == null) {
          a.S("voicePartyManager");
       }
       view.x = new h(j2, view.H.b().q);
       j2 = view.j;
       if (j2 == null) {
          a.S("voicePartyManager");
       }
       ReleasableKt.a(new b(j2, view.o), view);
       if (view.H.b().f() != null) {
          c childFragmen1 = view.H.b().c().getChildFragmentManager();
          a.o(childFragmen1, "dependence.baseDependenc¡­ment.childFragmentManager");
          h oh1 = new h(this.B2(), childFragmen1, view.H.b().d(), view.H.b().l(), view.H.b().e(), view.o, view.H.d().b(), view.H.d().c());
          ReleasableKt.a(uoe2, view);
       }
       if (view.H.c() != null && (view.H.b().f() != null && (view.H.b().k().c() != null && view.H.e().h() != null))) {
          j1 = view.j;
          if (j1 == null) {
             a.S("voicePartyManager");
          }
          b uob4 = view.H.b().k().c();
          a.m(uob4);
          a uoa3 = new a(j1, uob4, view.H.c(), view.H.b().f(), view.H.e().h());
          ReleasableKt.a(uoe2, view);
       }
    label_055b :
       b uob5 = view.H.b().k().c();
       if (uob5 != null) {
          h = view.j;
          if (h == null) {
             a.S("voicePartyManager");
          }
          q = view.u;
          if (q == null) {
             a.S(str2);
          }
          ReleasableKt.a(new a(h, uob5, q.K(), new VoicePartyAudienceViewController$onCreate$5(view)), view);
          h = view.j;
          if (h == null) {
             a.S("voicePartyManager");
          }
          q = view.u;
          if (q == null) {
             a.S(str2);
          }
          ReleasableKt.a(new b(h, uob5, q.K(), new VoicePartyAudienceViewController$onCreate$6(view)), view);
       }
       if (!PatchProxy.applyVoid(null, view, voicePartyAu, "19")) {
          n on1 = new n(view);
          h = view.j;
          if (h == null) {
             a.S("voicePartyManager");
          }
          h.m(on1);
          a.a(view, new VoicePartyAudienceViewController$setupApplyButtonLogic$1(view, on1));
       }
       FragmentActivity uFragmentAct = view.H.b().a();
       f2 uof23 = view.H.b().l();
       q = view.j;
       if (q == null) {
          a.S("voicePartyManager");
       }
       boolean b1 = false;
       view.H.a().a(new i(b1, new j(uFragmentAct, uof23, q), view.v));
       view.H.e().i().i(b1);
       e uoe3 = view.H.c();
       VoicePartyCommonWebpageLauncher voicePartyCo = (uoe3 != null)? new VoicePartyCommonWebpageLauncher(view.H.b().a(), uoe3): null;
       b uob6 = new b(view.H.b().d().d(), view.H.b().d(), view.H.b().l(), view.H.b().e(), view.H.e().c(), view.o, voicePartyCo);
       view.z2(uoe3);
       if (view.H.e().j() != null) {
          d uod = new d(view.H.b().d(), view.H.b().l(), view.H.b().e(), view.H.e().j(), view.H.e().z);
          view.z2(uoe3);
       }
       if (view.H.b().f() != null && (uob5 != null && view.H.e().c() != null)) {
          uoc = view.H.b().c().getChildFragmentManager();
          a.o(uoc, "dependence.baseDependenc¡­ment.childFragmentManager");
          a uoa4 = view.H.b().d();
          a0 uoa09 = view.H.b().f();
          VoicePartyAudienceViewController j3 = view.j;
          if (j3 == null) {
             a.S("voicePartyManager");
          }
          a0 b21 = view.H.b().f().b2;
          a.o(b21, str1);
          VoicePartyAudienceInviteButtonViewController voicePartyAu2 = new VoicePartyAudienceInviteButtonViewController(uoc, uoa4, uoa09, j3, view.H.b().l(), uob5, b21, view.H.e().c());
          view.z2(uoe3);
       }
    label_0722 :
       VoicePartyAudienceViewController j4 = view.j;
       if (j4 == null) {
          a.S("voicePartyManager");
       }
       j4.a(new VoicePartyPlayModeSwitcher(view.k, new VoicePartyAudienceViewController$onCreate$7(view)));
       j4 = view.j;
       if (j4 == null) {
          a.S("voicePartyManager");
       }
       Objects.requireNonNull(j4);
       if (!PatchProxy.applyVoid(null, j4, AudienceVoicePartyManager.class, str3)) {
          j4.g = new l0(j4.e(), j4.k, j4.f, new AudienceVoicePartyManager$start$1(j4));
          j4.i();
          a uoa5 = j4.g();
          AudienceVoicePartyManager g = j4.g;
          str1 = "switchLogic";
          if (g == null) {
             a.S(str1);
          }
          a.b(uoa5, j4.b(g));
          a.b(j4.g(), j4.b(j4.o));
          uob = j4.l.subscribe(new h(j4), i.b);
          a.o(uob, "offlineSignal.subscribe\(¡­ }\n      }, { throw it }\)");
          a.b(j4.g(), uob);
          j4.h = new a(j4.n, j4.e().getMode());
          g1 = j4.g;
          if (g1 == null) {
             a.S(str1);
          }
          i = j4.i;
          Objects.requireNonNull(g1);
          if (!PatchProxy.applyVoidOneRefs(i, g1, l0.class, "8")) {
             a.p(i, "open");
             if (i.d() != null) {
                g1.b(new KtvOpen(i.d()));
             }else if(i.g() != null){
                g1.b(new TheaterOpen(i.g()));
             }else if(i.f() != null){
                g1.b(new TeamPkOpen(i.f()));
             }else if(i.a() != null){
                g1.b(new MaybeAudioChatOpen());
             }else if(i.h() != null){
                g1.b(new MaybeVideoChatOpen());
             }else if(i.b() != null){
                g1.b(new CrossRoomPkOpen(i.b()));
             }else if(i.c() != null){
                g1.b(new GridChatOpen(i.c()));
             }
          }
       }
    label_084a :
       if (!PatchProxy.applyVoid(null, view, voicePartyAu, "18")) {
          a0 uoa010 = view.H.b().f();
          if (uoa010 != null && (uoa010.l == 167 && view.H.b().l().m == null)) {
             view.H.b().l().m = true;
             b.Z(LiveLogTag.LIVE_VOICE_PARTY, "onEnterVoiceParty-auto-applyMic");
             voicePartyAu = view.o;
             if (voicePartyAu != null) {
                voicePartyAu.H(4);
             }
          }
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceViewController.class, "5")) {
          return;
       }
       this.a3(false);
       AudienceMicSeatsDataManager uAudienceMic = this.H.d().c();
       VoicePartyAudienceViewController tj = this.j;
       if (tj == null) {
          a.S("voicePartyManager");
       }
       Objects.requireNonNull(uAudienceMic);
       if (!PatchProxy.applyVoidOneRefs(tj, uAudienceMic, AudienceMicSeatsDataManager.class, "3")) {
          a.p(tj, "audienceManager");
          tj.o(uAudienceMic.p);
       }
       this.H.e().l().release();
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceViewController onDestroy");
       VoicePartyAudienceViewController tn = this.n;
       if (tn == null) {
          a.S("layoutManager");
       }
       tn.a();
       this.G = null;
       this.H.e().i().d();
       this.m.d();
       tn = this.r;
       if (tn == null) {
          a.S("micSeatsGuideManager");
       }
       tn.destroy();
       tn = this.q;
       if (tn == null) {
          a.S("micSeatsEmojiDispatchService");
       }
       tn.a();
       tn = this.t;
       if (tn != null && !PatchProxy.applyVoid(null, tn, b.class, "1")) {
          b m = tn.m;
          if (m != null) {
             m.X1(tn.d);
          }
          m = tn.n;
          if (m != null) {
             m.a(tn.f);
          }
          m = tn.o;
          if (m != null) {
             m.d5(tn.e);
          }
          tn.b();
       }
       BulletinUtils.a(this.H.e().e(), this.H.e().d());
       this.H.a().a(null);
       ClientContent$LiveStreamPackage liveStreamPa = this.H.b().d().a();
       f2 uof2 = this.H.b().l();
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       VoicePartyMicSeatData voicePartyMi = this.H.d().c().j(id);
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, uof2, voicePartyMi, null, q1.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "EXIT_DIRECTLY";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          uContentPack.liveVoicePartyTheaterPackage = e.b(uof2);
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.j(uof2, voicePartyMi);
          if (liveVoicePar != null) {
             uContentWrap.liveVoicePartyPackage = liveVoicePar;
          }
          u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       }
       tn = this.j;
       if (tn == null) {
          a.S("voicePartyManager");
       }
       tn.k(this.I.invoke());
       tn = this.x;
       if (tn == null) {
          a.S("bizServiceEnabler");
       }
       tn.O();
       tn = this.z;
       if (tn != null) {
          tn.b();
       }
       g1 og1 = this.H.f();
       Objects.requireNonNull(og1);
       if (!PatchProxy.applyVoid(null, og1, g1.class, "3")) {
          og1.d.P();
          og1.c = null;
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceViewController.class, "3")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceViewController onStart");
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceViewController.class, "4")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "VoicePartyAudienceViewController onStop");
       return;
    }
    public final ViewController W2(){
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, this, VoicePartyAudienceViewController.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = this.H.b().k().c();
       obj = this.H.b().f();
       a0 uoa0 = (obj != null)? obj.Y0: objArray;
       c uoc = this.H.e().c();
       d uod = this.H.e().k();
       if (uoa0 != null && (uob != null && (this.o != null && (uoc != null && uod != null)))) {
          VoicePartyAudienceViewController to = this.o;
          a.m(to);
          VoicePartyAudienceMicApplyButtonViewController voicePartyAu = new VoicePartyAudienceMicApplyButtonViewController(uoa0, uob, this.H.d().c(), this.H.b().l(), to, uoc, uod);
       }
    label_006e :
       return objArray;
    }
    public final c X2(){
       Object obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = new c(this.H.b().l(), this.H.b().d(), this.m, this.H.b().k().c(), this.H.d().d(), this.o, this.H.b().e(), this.B, this.H.d().a());
       return obj;
    }
    public final f Y2(boolean p0){
       c obj1;
       t ot;
       Object obj = this;
       boolean b = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VoicePartyAudienceViewController voicePartyAu = VoicePartyAudienceViewController.class;
       if (PatchProxy.isSupport(voicePartyAu)) {
          obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, voicePartyAu, "8");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       f2 uof2 = obj.H.b().l();
       a uoa = obj.H.b().d();
       a uoa1 = (b)? obj.m.b(): obj.m.a();
       a uoa2 = uoa1;
       a uoa3 = obj.H.b().e();
       VoicePartyAudienceViewController r = obj.r;
       if (r == null) {
          a.S("micSeatsGuideManager");
       }
       c uoc = obj.H.e().g();
       VoicePartyAudienceViewController$createMicSeatPendantDependency$1 uocreateMicS = new VoicePartyAudienceViewController$createMicSeatPendantDependency$1(obj);
       VoicePartyAudienceViewController$createMicSeatPendantDependency$2 uocreateMicS1 = new VoicePartyAudienceViewController$createMicSeatPendantDependency$2(obj, b);
       VoicePartyAudienceViewController q = obj.q;
       if (q == null) {
          a.S("micSeatsEmojiDispatchService");
       }
       f uof = obj1;
       VoicePartyPlayerController voicePartyPl = obj.H.b().g();
       j oj = obj.H.d().e;
       RtcManager rtcManager = obj.H.b().k().a();
       VoicePartyAudienceViewController$createMicSeatPendantDependency$4 uocreateMicS2 = new VoicePartyAudienceViewController$createMicSeatPendantDependency$4(obj, b);
       VoicePartyAudienceViewController$createMicSeatPendantDependency$3 uocreateMicS3 = new VoicePartyAudienceViewController$createMicSeatPendantDependency$3(obj);
       VoicePartyAudienceViewController voicePartyAu1 = q;
       obj1 = PatchProxy.applyTwoRefs(voicePartyPl, rtcManager, null, e.class, "1");
       if (obj1 != patchProxyRe) {
          ot = obj1;
       }else {
          a.p(voicePartyPl, "playerController");
          PublishSubject publishSubje = PublishSubject.g();
          a.o(publishSubje, "PublishSubject.create<Set<String>>\(\)");
          obj1 = new c(publishSubje);
          d uod = new d(publishSubje);
          ot = publishSubje.doOnSubscribe(new a(rtcManager, obj1, voicePartyPl, uod)).doOnDispose(new b(rtcManager, obj1, voicePartyPl, uod)).share();
          a.o(ot, "subject\n    .doOnSubscri¡­ntListener\)\n    }.share\(\)");
       }
       g og = new g(uof2, uoa, uoa2, uoa3, r, uoc, uocreateMicS, uocreateMicS1, voicePartyAu1, uocreateMicS3, oj, uocreateMicS2, ot, new VoicePartyAudienceViewController$createMicSeatPendantDependency$5(obj));
       return new f(v15, obj.H.e().b(), obj.H.e().o);
    }
    public final void a3(boolean p0){
       VoicePartyAudienceViewController voicePartyAu = VoicePartyAudienceViewController.class;
       if (PatchProxy.isSupport(voicePartyAu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, voicePartyAu, "17")) {
          return;
       }
       i g = this.H.g;
       if (g != null) {
          g.a(p0);
       }
       return;
    }
}
