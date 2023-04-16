package com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import zo2.f;
import qu2.a;
import co2.f2;
import hf3.a;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import androidx.fragment.app.c;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.h;
import qs2.a;
import wj2.r0;
import m91.b;
import wu2.a;
import lk2.c;
import qc2.a;
import i81.f;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import eu2.g;
import ru2.c;
import msd.t;
import lp3.e;
import ws5.c;
import msd.l;
import x61.c;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bw2.a;
import ss2.h;
import mrd.a;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$d;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fp2.b;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$onCreate$1;
import fp2.a;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$onCreate$2;
import hp2.m;
import tu2.f;
import android.view.View;
import android.widget.FrameLayout;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$onCreate$3$1;
import androidx.lifecycle.LifecycleOwner;
import u63.a;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import aw2.c;
import qrd.l1;
import vv2.b;
import ss2.e;
import ss2.e$a;
import ss2.e$b;
import ss2.c;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$1;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$3;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$4;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$createChatViewController$micSeatDataManager$5;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewController;
import com.kuaishou.live.core.voiceparty.b;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceTeamPkMicApplyButtonViewController;
import android.animation.Animator;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;
import qt2.b;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import uv2.d;
import android.animation.Animator$AnimatorListener;
import i81.f$a$b;
import i81.f$a;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import i81.c;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$c;
import android.view.View$OnClickListener;
import np2.a;
import hp2.c;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import e17.i;
import com.kuaishou.live.core.voiceparty.d0;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$a;
import androidx.fragment.app.KwaiDialogFragment;

public final class AudienceTeamPkViewController extends ViewController	// class@001924
{
    public final MicSeatsDataManager A;
    public final c B;
    public final AudienceVoicePartyManager C;
    public final h D;
    public final a E;
    public final r0 F;
    public final b G;
    public final a H;
    public final c I;
    public final a J;
    public final f K;
    public final LiveBulletinLayoutManager L;
    public final g M;
    public final c N;
    public final t O;
    public final e P;
    public final c Q;
    public final l R;
    public final c S;
    public final d T;
    public final a j;
    public FrameLayout k;
    public b l;
    public f m;
    public AudienceTeamPkStageViewController n;
    public b o;
    public Map p;
    public final b q;
    public PkMicSeatViewController r;
    public KwaiDialogFragment s;
    public WeakReference t;
    public final AudienceTeamPkViewController$b u;
    public final f v;
    public final a w;
    public final f2 x;
    public final a y;
    public final a z;

    public void AudienceTeamPkViewController(f p0,a p1,f2 p2,a p3,a p4,MicSeatsDataManager p5,c p6,AudienceVoicePartyManager p7,h p8,a p9,r0 p10,b p11,a p12,c p13,a p14,f p15,LiveBulletinLayoutManager p16,g p17,c p18,t p19,e p20,c p21,l p22,c p23,d p24){
       int i = this;
       Object obj = p4;
       Object obj1 = p5;
       Object obj2 = p18;
       Object obj3 = p19;
       Object obj4 = p22;
       a.p(p0, "param");
       a.p(p1, "liveBasicContext");
       a.p(p2, "voicePartyContext");
       a.p(p3, "liveLongConnection");
       a.p(obj, "closeReasonFetcher");
       a.p(obj1, "micSeatsDataManager");
       a.p(obj2, "micSeatDependency");
       a.p(obj3, "micSeatPendantsFactory");
       a.p(obj4, "contextDataSetter");
       super();
       i.v = p0;
       i.w = p1;
       i.x = p2;
       i.y = p3;
       i.z = obj;
       i.A = obj1;
       i.B = p6;
       i.C = p7;
       i.D = p8;
       i.E = p9;
       i.F = p10;
       i.G = p11;
       i.H = p12;
       i.I = p13;
       i.J = p14;
       i.K = p15;
       i.L = p16;
       i.M = p17;
       i.N = obj2;
       i.O = obj3;
       i.P = p20;
       i.Q = p21;
       i.R = obj4;
       i.S = p23;
       i.T = p24;
       i.j = new a(p1, p2);
       i.q = p18.d().c().subscribe(new AudienceTeamPkViewController$d(this));
       i.u = new AudienceTeamPkViewController$b(this);
    }
    public void F2(){
       PatchProxyResult patchProxyRe1;
       String str2;
       AudienceTeamPkViewController m;
       AudienceTeamPkViewController n;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       AudienceTeamPkViewController m1;
       AudienceTeamPkViewController c;
       b uob = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AudienceTeamPkViewController uAudienceTea = AudienceTeamPkViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, uAudienceTea, "1")) {
          return;
       }
       String str = uob.x.y();
       a.o(str, "voicePartyContext.voicePartyId");
       b uob1 = new b(uob.y, new AudienceTeamPkViewController$onCreate$1(uob), str, uob.v, new a(uob.w, uob.x, new AudienceTeamPkViewController$onCreate$2(uob)));
       uob.l = v4;
       uob.m = new f(uob.y, uob.v.a(), uob.j);
       uob.Q2(R.layout.arg_RES_7f0d16d8);
       FrameLayout uFrameLayout = uob.A2(R.id.voice_party_team_pk_chat_view_container);
       uob.k = uFrameLayout;
       AudienceTeamPkViewController h = uob.H;
       if (h != null) {
          if (uFrameLayout == null) {
             a.S("chatViewContainer");
          }
          h.b(uFrameLayout);
       }
       AudienceTeamPkViewController q = uob.Q;
       if (q != null) {
          a.a(uob, new AudienceTeamPkViewController$onCreate$3$1(q.a(uob.A2(R.id.top_bar_place_holder))));
       }
       String str1 = "teamPkManager";
       if (!PatchProxy.applyVoid(objArray, uob, uAudienceTea, "6") && (uob.B != null && (uob.C != null && (uob.D != null && (uob.F != null && uob.G != null))))) {
          str = uob.w.getLiveStreamId();
          m1 = uob.B;
          AudienceTeamPkViewController x = uob.x;
          c = uob.C;
          AudienceTeamPkViewController l = uob.l;
          if (l == null) {
             a.S(str1);
          }
          str2 = str1;
          patchProxyRe1 = patchProxyRe;
          AudienceTeamPkStageViewController uAudienceTea1 = new AudienceTeamPkStageViewController(str, m1, x, c, l, uob.j, uob.D, uob.A, uob.u, uob.F, uob.G, uob.I, uob.J);
          uob.x2(R.id.voice_party_team_pk_stage_container, q);
          uob.n = q;
       }else {
          patchProxyRe1 = patchProxyRe;
          str2 = str1;
       }
       b uob2 = PatchProxy.apply(null, uob, uAudienceTea, "7");
       String str3 = "pkAnimationDispatchService";
       PatchProxyResult patchProxyRe2 = patchProxyRe1;
       if (uob2 != patchProxyRe2) {
       }else if(uob.n != null){
          q = uob.l;
          if (q == null) {
             a.S(str2);
          }
          h = uob.m;
          if (h == null) {
             a.S(str3);
          }
          uob2 = new b(q, h);
       }else {
          uob2 = null;
       }
       uob.o = uob2;
       if (uob2 != null) {
          a.m(uob2);
          uob.x2(R.id.voice_party_team_pk_animation_container, uob2);
       }
       String str4 = "5";
       PkMicSeatViewController pkMicSeatVie = PatchProxy.apply(null, uob, uAudienceTea, str4);
       if (pkMicSeatVie != patchProxyRe2) {
       }else {
          e uoe = e.d.a().b(c.b(uob.N.d().a())).c(new AudienceTeamPkViewController$createChatViewController$micSeatDataManager$1(uob)).c(new AudienceTeamPkViewController$createChatViewController$micSeatDataManager$2(uob)).c(new AudienceTeamPkViewController$createChatViewController$micSeatDataManager$3(uob)).c(new AudienceTeamPkViewController$createChatViewController$micSeatDataManager$4(uob)).c(AudienceTeamPkViewController$createChatViewController$micSeatDataManager$5.INSTANCE).a();
          n = uob.O;
          a uoa = uob.N.d().c();
          m1 = uob.m;
          if (m1 == null) {
             a.S(str3);
          }
          pkMicSeatVie = new PkMicSeatViewController(uoe, n, uoa, m1);
          uob.r = pkMicSeatVie;
       }
       uob.x2(R.id.voice_party_team_pk_chat_view_container, pkMicSeatVie);
       if (uob.G != null && (uob.N.c() != null && (uob.N.b() != null && (uob.S != null && uob.T != null)))) {
          VoicePartyAudienceTeamPkMicApplyButtonViewController voicePartyAu = new VoicePartyAudienceTeamPkMicApplyButtonViewController(uob.G, uob.N.c(), uob.A, uob.x, uob.N.b(), uob.u, uob.j, uob.S, uob.T);
          uob.z2(str3);
       }
    label_01cd :
       Object[] objArray1 = null;
       if (!PatchProxy.applyVoid(objArray1, uob, uAudienceTea, "8")) {
          AudienceTeamPkViewController r = uob.r;
          if (r == null) {
             a.S("chatViewController");
          }
          Animator uAnimator = PkMicSeatViewController.V2(r, objArray1, 1, objArray1);
          n = uob.n;
          if (n != null) {
             objectAnimat = PatchProxy.apply(objArray1, n, AudienceTeamPkStageViewController.class, str4);
             if (objectAnimat != patchProxyRe2) {
             }else {
                AudienceTeamPkStageViewController j = n.j;
                String str5 = "prepareView";
                if (j == null) {
                   a.S(str5);
                }
                View prepareButto = j.getPrepareButtonLayout();
                a.o(prepareButto, "prepareView.prepareButtonLayout");
                b.e(prepareButto);
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{b.b(new float[2]{0x3dcccccd,0x3f800000}),b.a()};
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(prepareButto, propertyValu);
                a.o(objectAnimat, "ObjectAnimator.ofPropert¡­l.inAlphaProperty\(\)\n    \)");
                AudienceTeamPkStageViewController j1 = n.j;
                if (j1 == null) {
                   a.S(str5);
                }
                if (j1.getCanShowStartButton()) {
                   j1 = n.j;
                   if (j1 == null) {
                      a.S(str5);
                   }
                   View startButton = j1.getStartButton();
                   a.o(startButton, "prepareView.startButton");
                   b.d(startButton);
                   PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{b.a(),b.b(new float[3]{0x3f4ccccd,0x3f99999a,0x3f800000}),b.c(new float[3]{0x3f4ccccd,0x3f99999a,0x3f800000})};
                   objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(startButton, propertyValu1);
                }else {
                   objectAnimat1 = null;
                }
                if (objectAnimat1 != null) {
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   Animator[] uAnimatorArr2 = new Animator[]{objectAnimat1,objectAnimat};
                   uAnimatorSet1.playTogether(uAnimatorArr2);
                   objectAnimat = uAnimatorSet1;
                }
             }
          }else {
             objectAnimat = null;
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration(80);
          if (objectAnimat != null) {
             Animator[] uAnimatorArr = new Animator[]{uAnimator,objectAnimat};
             uAnimatorSet.playTogether(uAnimatorArr);
          }else {
             Animator[] uAnimatorArr1 = new Animator[]{uAnimator};
             uAnimatorSet.playTogether(uAnimatorArr1);
          }
          uAnimatorSet.addListener(new d(uob));
          uAnimatorSet.start();
       }
       if (!PatchProxy.applyVoid(null, uob, uAudienceTea, "2")) {
          m = uob.K;
          if (m != null) {
             m.b(new f$a$b(this.P2()));
          }
          m = uob.L;
          if (m != null) {
             m.i(LiveBulletinStageType.TeamPk, null);
          }
       }
       m = uob.M;
       if (m != null) {
          m.e(a1.p(R.string.arg_RES_7f105124));
       }
       m = uob.M;
       if (m != null) {
          m.n(new AudienceTeamPkViewController$c(uob));
       }
       m = uob.l;
       if (m == null) {
          a.S(str2);
       }
       m.h();
       m = uob.R;
       uAudienceTea = uob.l;
       if (uAudienceTea == null) {
          a.S(str2);
       }
       m.invoke(uAudienceTea.c());
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, AudienceTeamPkViewController.class, "3")) {
          return;
       }
       this.q.dispose();
       AudienceTeamPkViewController tH = this.H;
       if (tH != null) {
          AudienceTeamPkViewController tk = this.k;
          if (tk == null) {
             a.S("chatViewContainer");
          }
          tH.a(tk);
       }
       this.R.invoke(null);
       tH = this.l;
       if (tH == null) {
          a.S("teamPkManager");
       }
       tH.e(this.z.invoke());
       tH = this.M;
       if (tH != null) {
          tH.m();
       }
       tH = this.M;
       if (tH != null) {
          tH.n(null);
       }
       this.W2();
       return;
    }
    public final void V2(int p0){
       AudienceTeamPkViewController uAudienceTea = AudienceTeamPkViewController.class;
       if (PatchProxy.isSupport(uAudienceTea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudienceTea, "10")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (!qCurrentUser.isLogined()) {
          d.a(-1712118428).ne(this.B2(), "live_play", "voice_party_team_pk_apply_join", 0, this.B2().getString(R.string.arg_RES_7f103078), null, null, null, null).h();
       }else {
          uAudienceTea = this.G;
          if (uAudienceTea != null && uAudienceTea.r2(AudienceBizRelation.SPECIAL_ROLE) == true) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10381e);
          }else {
             d0.a(this.B2()).compose(AutoDisposeKt.a(this)).subscribe(new AudienceTeamPkViewController$a(this, p0), d0.s("AudienceTeamPkJoinBattlePresenter", "applyToJoinPk failed"));
          }
       }
       return;
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, AudienceTeamPkViewController.class, "4")) {
          return;
       }
       AudienceTeamPkViewController ts = this.s;
       if (ts != null) {
          d0.c(ts);
          this.s = null;
       }
       return;
    }
}
