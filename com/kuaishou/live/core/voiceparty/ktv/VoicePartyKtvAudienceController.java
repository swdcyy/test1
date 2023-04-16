package com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController;
import fs2.h;
import ku2.b;
import cp2.d;
import fs2.o;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$a;
import nsd.u;
import fs2.l;
import brd.t;
import ru2.c;
import msd.t;
import msd.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fs2.p;
import com.kuaishou.live.core.voiceparty.music.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import hf3.a;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$onCreate$1;
import co2.f2;
import qu2.a;
import com.kwai.framework.model.user.QCurrentUser;
import zo2.e;
import kp2.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import tt2.b;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import do2.a;
import com.kuaishou.live.core.voiceparty.a;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import android.widget.FrameLayout;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import qrd.l1;
import fs2.n;
import androidx.fragment.app.FragmentActivity;
import m91.b;
import android.app.Activity;
import pq5.c;
import tt2.z;
import hp2.h;
import ne1.h;
import gs2.i;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import nc1.k;
import is2.a;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.h;
import mrd.a;
import ku2.c;
import ss2.c;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$onCreate$micSeatDataManager$1;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$onCreate$micSeatDataManager$2;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$onCreate$micSeatDataManager$3;
import com.kuaishou.live.core.voiceparty.playway.ktv.KtvMicSeatViewController;
import ru2.d;
import ru2.a;
import android.view.ViewGroup;
import v12.f;
import ks2.a;
import androidx.lifecycle.LifecycleOwner;
import wu2.a;
import lk2.c;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt;
import com.kuaishou.live.core.voiceparty.b;
import qs2.a;
import x61.c;
import vq5.d;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import android.animation.Animator;
import fs2.k;
import android.animation.Animator$AnimatorListener;
import i81.f;
import i81.f$a$b;
import i81.f$a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import java.util.Objects;
import cp2.f;
import pp2.a;
import cp2.a;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$b;
import erd.g;
import crd.b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;
import hp2.e;
import jp2.a;
import hp2.c;
import eu2.g;
import cp2.c;
import java.lang.Integer;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import fs2.a;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.KtvMusicInfo;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;

public final class VoicePartyKtvAudienceController extends o implements h, b, d	// class@001523
{
    public final l A;
    public AudienceKtvManager k;
    public b l;
    public a m;
    public final m n;
    public VoicePartyKtvAudienceStageViewController o;
    public KtvMicSeatViewController p;
    public z q;
    public i r;
    public n s;
    public a t;
    public FrameLayout u;
    public final l v;
    public final t w;
    public final c x;
    public final t y;
    public final a z;
    public static final VoicePartyKtvAudienceController$a B;

    static {
       VoicePartyKtvAudienceController.B = new VoicePartyKtvAudienceController$a(null);
    }
    public void VoicePartyKtvAudienceController(l p0,t p1,c p2,t p3,a p4,l p5){
       a.p(p0, "dependency");
       a.p(p1, "eventDispatcher");
       a.p(p2, "micSeatDependency");
       a.p(p3, "micSeatPendantsFactory");
       a.p(p4, "closeReasonFetcher");
       a.p(p5, "contextDataSetter");
       super(p0);
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
       this.z = p4;
       this.A = p5;
       this.n = new m("VoicePartyKtvAudienceController");
    }
    public void F2(){
       i oi;
       a uoa6;
       AudienceKtvManager uAudienceKtv = this;
       if (PatchProxy.applyVoid(null, uAudienceKtv, VoicePartyKtvAudienceController.class, "1")) {
          return;
       }
       super.F2();
       VoicePartyKtvAudienceController v = uAudienceKtv.v;
       a uoa = v.i();
       String str = uAudienceKtv.v.l().y();
       a.o(str, "dependency.voicePartyContext.voicePartyId");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       VoicePartyKtvAudienceController v1 = uAudienceKtv.v;
       AudienceKtvManager uAudienceKtv1 = new AudienceKtvManager(v.F, uoa, new VoicePartyKtvAudienceController$onCreate$1(uAudienceKtv), str, uAudienceKtv.v.h().d(), id, uAudienceKtv.v.x(), v1.H, v1.G, new a(v1.l(), uAudienceKtv.v.h()));
       uAudienceKtv.k = v0;
       v = uAudienceKtv.n;
       a uoa1 = uAudienceKtv.v.h();
       a uoa2 = uAudienceKtv.v.m();
       VoicePartyKtvAudienceController k = uAudienceKtv.k;
       if (k == null) {
          a.S("ktvManager");
       }
       uAudienceKtv.l = new b(v, uoa1, uoa2, k);
       uoa = uAudienceKtv.v.h();
       a uoa3 = uAudienceKtv.v.m();
       VoicePartyKtvAudienceController k1 = uAudienceKtv.k;
       if (k1 == null) {
          a.S("ktvManager");
       }
       a uoa4 = new a(uoa, uoa3, k1, uAudienceKtv.v.i(), uAudienceKtv.v.a());
       uAudienceKtv.m = v0;
       uAudienceKtv.u = uAudienceKtv.A2(0x7f0a2784);
       uAudienceKtv.n.d(true);
       LiveVoicePartyKtvMusicDownloadHelper liveVoicePar = new LiveVoicePartyKtvMusicDownloadHelper();
       v = uAudienceKtv.v;
       v1 = uAudienceKtv.k;
       if (v1 == null) {
          a.S("ktvManager");
       }
       VoicePartyKtvAudienceController m = uAudienceKtv.m;
       if (m == null) {
          a.S("applauseManager");
       }
       k = uAudienceKtv.l;
       String str1 = "orderMusicService";
       if (k == null) {
          a.S(str1);
       }
       VoicePartyKtvAudienceStageViewController voicePartyKt = new VoicePartyKtvAudienceStageViewController(v, v1, m, k, liveVoicePar, this);
       uAudienceKtv.x2(R.id.live_voice_party_ktv_stage_view_container, uoa);
       uAudienceKtv.o = uoa;
       n on = new n(uAudienceKtv.v.l(), uAudienceKtv.v.h(), uAudienceKtv.v.d(), uAudienceKtv.v.b(), uAudienceKtv.v.w, this);
       uAudienceKtv.z2(uoa);
       uAudienceKtv.s = uoa;
       id = uAudienceKtv.v.x().a();
       v1 = uAudienceKtv.v;
       m = uAudienceKtv.l;
       if (m == null) {
          a.S(str1);
       }
       z oz = new z(id, v1, m, liveVoicePar);
       uAudienceKtv.z2(oz);
       uAudienceKtv.q = oz;
       if (uAudienceKtv.v.q() != null) {
          uoa3 = uAudienceKtv.v.h();
          AudienceVoicePartyManager uAudienceVoi = uAudienceKtv.v.o();
          v = uAudienceKtv.k;
          if (v == null) {
             a.S("ktvManager");
          }
          oi = new i(uoa3, uAudienceVoi, v, uAudienceKtv.n, uAudienceKtv.v.q(), uAudienceKtv.v.i(), liveVoicePar);
          uAudienceKtv.z2(oz);
          uAudienceKtv.r = oz;
       }
       if (uAudienceKtv.v.p() != null) {
          uoa1 = uAudienceKtv.v.h();
          AudienceVoicePartyManager uAudienceVoi1 = uAudienceKtv.v.o();
          k = uAudienceKtv.k;
          if (k == null) {
             a.S("ktvManager");
          }
          a uoa5 = new a(uoa1, uAudienceVoi1, k, uAudienceKtv.v.p(), uAudienceKtv.v.d());
          uAudienceKtv.z2(oz);
          uAudienceKtv.t = oz;
       }
       VoicePartyKtvAudienceController x = uAudienceKtv.x;
       KtvMicSeatViewController ktvMicSeatVi = new KtvMicSeatViewController(e.d.a().b(c.b(c.a(uAudienceKtv.x.d().a()))).c(new VoicePartyKtvAudienceController$onCreate$micSeatDataManager$1(uAudienceKtv)).c(new VoicePartyKtvAudienceController$onCreate$micSeatDataManager$2(uAudienceKtv)).c(new VoicePartyKtvAudienceController$onCreate$micSeatDataManager$3(uAudienceKtv)).a(), uAudienceKtv.y, uAudienceKtv.x.d(), x.g, this, x.h, x.a().a());
       uAudienceKtv.p = oi;
       x = uAudienceKtv.u;
       id = "chatViewContainer";
       if (x == null) {
          a.S(id);
       }
       v1 = uAudienceKtv.p;
       String str2 = "chatViewController";
       if (v1 == null) {
          a.S(str2);
       }
       uAudienceKtv.y2(x, v1);
       if (uAudienceKtv.v.y() != null) {
          v1 = uAudienceKtv.k;
          if (v1 == null) {
             a.S("ktvManager");
          }
          uoa6 = new a(v1, uAudienceKtv.v.y(), uAudienceKtv);
       }
       uoa6 = uAudienceKtv.v.v();
       if (uoa6 != null) {
          v1 = uAudienceKtv.u;
          if (v1 == null) {
             a.S(id);
          }
          uoa6.b(v1);
       }
       c uoc = uAudienceKtv.v.k();
       if (uoc != null) {
          v1 = uAudienceKtv.u;
          if (v1 == null) {
             a.S(id);
          }
          StickerhelperKt.a(uoc, v1, uAudienceKtv);
       }
       if (uAudienceKtv.v.s() != null && (uAudienceKtv.x.c() != null && (uAudienceKtv.v.w() != null && (uAudienceKtv.v.t() != null && uAudienceKtv.v.u() != null)))) {
          v1 = uAudienceKtv.v;
          f2 uof2 = v1.l();
          VoicePartyAudienceMicApplyButtonViewController voicePartyAu = new VoicePartyAudienceMicApplyButtonViewController(uAudienceKtv.v.s(), uAudienceKtv.x.c(), v1.o, uof2, uAudienceKtv.v.w(), uAudienceKtv.v.t(), uAudienceKtv.v.u());
          uAudienceKtv.z2(uoc);
       }
    label_02b6 :
       if (!PatchProxy.applyVoid(null, uAudienceKtv, VoicePartyKtvAudienceController.class, "8")) {
          x = uAudienceKtv.p;
          if (x == null) {
             a.S(str2);
          }
          Animator uAnimator = KtvMicSeatViewController.V2(x, null, true, null);
          uAnimator.setDuration(80);
          uAnimator.addListener(new k(uAudienceKtv));
          uAnimator.start();
          f uof = uAudienceKtv.v.e();
          if (uof != null) {
             m = uAudienceKtv.u;
             if (m == null) {
                a.S(id);
             }
             uof.b(new f$a$b(m));
          }
          LiveBulletinLayoutManager liveBulletin = uAudienceKtv.v.c();
          if (liveBulletin != null) {
             liveBulletin.i(LiveBulletinStageType.KTV, null);
          }
       }
       x = uAudienceKtv.k;
       if (x == null) {
          a.S("ktvManager");
       }
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoidOneRefs(uAudienceKtv, x, AudienceKtvManager.class, "2")) {
          a.p(uAudienceKtv, "observer");
          x.v().j0(uAudienceKtv);
       }
       x = uAudienceKtv.k;
       if (x == null) {
          a.S("ktvManager");
       }
       x.s();
       x = uAudienceKtv.A;
       v = uAudienceKtv.k;
       if (v == null) {
          a.S("ktvManager");
       }
       x.invoke(v.u());
       uAudienceKtv.w.compose(AutoDisposeKt.a(this)).subscribe(new VoicePartyKtvAudienceController$b(uAudienceKtv));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvAudienceController.class, "2")) {
          return;
       }
       VoicePartyKtvAudienceController tk = this.k;
       if (tk == null) {
          a.S("ktvManager");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoidOneRefs(this, tk, AudienceKtvManager.class, "3")) {
          a.p(this, "observer");
          tk.v().l0(this);
       }
       e0 uoe0 = this.v.h().c();
       f2 uof2 = this.v.l();
       ClientContent$LiveStreamPackage liveStreamPa = this.v.h().a();
       if (!PatchProxy.applyVoidThreeRefs(uoe0, uof2, liveStreamPa, null, q1.class, "88")) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = System.currentTimeMillis() - uof2.j();
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "VOICE_PARTY_KTV_PLAY timeCost: "+resultPackag.timeCost);
          n$a uoa1 = new n$a();
          uoa1.h(n.h(uof2));
          uoa1.f(liveStreamPa);
          uoa1.i(resultPackag);
          n.A(uoe0, 10, "VOICE_PARTY_KTV_PLAY", uoa1);
       }
       tk = this.m;
       if (tk == null) {
          a.S("applauseManager");
       }
       tk.b();
       this.n.d(false);
       this.n.b();
       tk = this.n;
       String liveStreamId = this.v.h().getLiveStreamId();
       String str = this.v.m().f().g0();
       VoicePartyKtvAudienceController tk1 = this.k;
       if (tk1 == null) {
          a.S("ktvManager");
       }
       tk.a(liveStreamId, str, tk1.u().d());
       a uoa = this.v.v();
       if (uoa != null) {
          VoicePartyKtvAudienceController tu = this.u;
          if (tu == null) {
             a.S("chatViewContainer");
          }
          uoa.a(tu);
       }
       this.A.invoke(objArray);
       tk = this.k;
       if (tk == null) {
          a.S("ktvManager");
       }
       tk.p(this.z.invoke());
       g og = this.v.z();
       if (og != null) {
          og.m();
       }
       return;
    }
    public void S1(boolean p0){
       c.a(this, p0);
    }
    public void V1(int p0){
       VoicePartyKtvAudienceController voicePartyKt = VoicePartyKtvAudienceController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, voicePartyKt, "4")) {
          return;
       }
       b uob = this.v.b();
       if (uob != null && uob.r2(AudienceBizRelation.SPECIAL_ROLE) == true) {
          VoicePartyKtvAudienceController tv = this.v;
          l t = tv.t;
          if (t != null) {
             t.a(tv.d());
          }
          return;
       }else {
          voicePartyKt = this.q;
          if (voicePartyKt == null) {
             a.S("musicController");
          }
          voicePartyKt.a0(p0);
          return;
       }
    }
    public final String V2(KtvMusicOrderInfo p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, VoicePartyKtvAudienceController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       String str = this.v.l().b();
       if (str == null) {
          str = "";
       }
       String str1 = obj+str+"¡¡ÕýÔÚ³ª£º"+p0.musicInfo.musicName;
       a.o(str1, "StringBuilder\(\)\n      .a¡­icName\)\n      .toString\(\)");
       return str1;
    }
    public void Z(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController.class, "10")) {
          return;
       }
       a.p(p0, "music");
       g og = this.v.z();
       if (og != null) {
          og.e(this.V2(p0));
       }
       return;
    }
    public void a0(int p0){
       VoicePartyKtvAudienceController voicePartyKt = VoicePartyKtvAudienceController.class;
       if (PatchProxy.isSupport(voicePartyKt) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, voicePartyKt, "7")) {
          return;
       }
       voicePartyKt = this.q;
       if (voicePartyKt == null) {
          a.S("musicController");
       }
       voicePartyKt.a0(p0);
       return;
    }
    public void b2(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController.class, "9")) {
          return;
       }
       a.p(p0, "music");
       g og = this.v.z();
       if (og != null) {
          og.e(this.V2(p0));
       }
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvAudienceController.class, "3")) {
          return;
       }
       VoicePartyKtvAudienceController tq = this.q;
       if (tq == null) {
          a.S("musicController");
       }
       tq.V2();
       return;
    }
    public void p0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController.class, "13")) {
          return;
       }
       a.p(p0, "music");
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f10254c));
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvAudienceController.class, "11")) {
          return;
       }
       g og = this.v.z();
       if (og != null) {
          og.m();
       }
       return;
    }
    public void x1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController.class, "14")) {
          return;
       }
       a.p(p0, "music");
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f10254c));
       return;
    }
    public void z1(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController.class, "5")) {
          return;
       }
       a.p(p0, "userInfo");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (a.g(qCurrentUser.getId(), p0.mId) ^ 0x01) {
          l l = this.v.L;
          if (l != null) {
             l.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, false, 34);
          }
       }
       return;
    }
}
