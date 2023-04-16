package com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import androidx.fragment.app.c;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import bw2.a;
import com.kuaishou.live.core.voiceparty.h;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import aw2.c;
import wj2.r0;
import m91.b;
import lk2.c;
import qc2.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$d;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$c;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$b;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$stickerCoverInterceptor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import aw2.a;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView$a;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import aw2.b;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView$a;
import zo2.l;
import np2.h;
import tu2.b;
import fk2.b;
import java.lang.Boolean;
import qc2.u;
import qc2.u$a;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$a;
import android.view.View$OnLayoutChangeListener;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.voiceparty.teampk.pkresult.VoicePartyTeamPkResultDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import android.widget.RelativeLayout;
import com.kwai.robust.PatchProxyResult;

public final class AudienceTeamPkStageViewController extends ViewController	// class@001936
{
    public final MicSeatsDataManager A;
    public final c B;
    public final r0 C;
    public final b D;
    public c E;
    public final a F;
    public VoicePartyTeamPkPrepareContainerView j;
    public VoicePartyTeamPkPlayingContainerView k;
    public WeakReference l;
    public WeakReference m;
    public boolean n;
    public final a o;
    public final AudienceTeamPkStageViewController$d p;
    public final AudienceTeamPkStageViewController$c q;
    public final AudienceTeamPkStageViewController$b r;
    public final p s;
    public final String t;
    public final c u;
    public final f2 v;
    public final AudienceVoicePartyManager w;
    public final TeamPkManager x;
    public final a y;
    public final h z;

    public void AudienceTeamPkStageViewController(String p0,c p1,f2 p2,AudienceVoicePartyManager p3,TeamPkManager p4,a p5,h p6,MicSeatsDataManager p7,c p8,r0 p9,b p10,c p11,a p12){
       a.p(p0, "liveStreamId");
       a.p(p1, "fragmentManager");
       a.p(p2, "voicePartyContext");
       a.p(p3, "voicePartyManager");
       a.p(p4, "teamPkManager");
       a.p(p5, "teamPkLogger");
       a.p(p6, "micSeatManager");
       a.p(p7, "micSeatsDataManager");
       a.p(p8, "battleService");
       a.p(p9, "showLiveProfileService");
       a.p(p10, "bizRelationService");
       super();
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
       this.x = p4;
       this.y = p5;
       this.z = p6;
       this.A = p7;
       this.B = p8;
       this.C = p9;
       this.D = p10;
       this.E = p11;
       this.F = p12;
       this.o = new a();
       this.p = new AudienceTeamPkStageViewController$d(this);
       this.q = new AudienceTeamPkStageViewController$c(this);
       this.r = new AudienceTeamPkStageViewController$b(this);
       this.s = s.c(new AudienceTeamPkStageViewController$stickerCoverInterceptor$2(this));
    }
    public static final VoicePartyTeamPkPrepareContainerView V2(AudienceTeamPkStageViewController p0){
       p0 = p0.j;
       if (p0 == null) {
          a.S("prepareView");
       }
       return p0;
    }
    public void F2(){
       AudienceTeamPkStageViewController uAudienceTea = AudienceTeamPkStageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAudienceTea, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16d9);
       if (!PatchProxy.applyVoid(objArray, this, uAudienceTea, "3")) {
          VoicePartyTeamPkPrepareContainerView voicePartyTe = this.A2(R.id.voice_party_team_pk_prepare_operation_container);
          this.j = voicePartyTe;
          if (voicePartyTe == null) {
             a.S("prepareView");
          }
          voicePartyTe.setOnViewClickListener(new a(this));
          VoicePartyTeamPkPlayingContainerView voicePartyTe1 = this.A2(R.id.voice_party_team_pk_playing_container);
          this.k = voicePartyTe1;
          if (voicePartyTe1 == null) {
             a.S("playingView");
          }
          voicePartyTe1.setOnTopScoreUserClickListener(new b(this));
       }
       this.Y2();
       this.w.m(this.p);
       this.x.a(this.q);
       this.A.a(this.r);
       uAudienceTea = this.E;
       if (uAudienceTea != null) {
          uAudienceTea.d(this.Z2());
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, AudienceTeamPkStageViewController.class, "4")) {
          return;
       }
       this.o.dispose();
       this.w.o(this.p);
       this.x.f(this.q);
       this.A.x(this.r);
       this.X2();
       AudienceTeamPkStageViewController tE = this.E;
       if (tE != null) {
          tE.b(this.Z2());
       }
       return;
    }
    public final void W2(boolean p0){
       AudienceTeamPkStageViewController tk;
       View countDownVie;
       AudienceTeamPkStageViewController uAudienceTea = AudienceTeamPkStageViewController.class;
       if (PatchProxy.isSupport(uAudienceTea) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudienceTea, "10")) {
          return;
       }
       if (this.F == null) {
          return;
       }
       int b = u.c.a();
       if (p0) {
          tk = this.k;
          if (tk == null) {
             a.S("playingView");
          }
          countDownVie = tk.getCountDownView();
          a.o(countDownVie, "playingView.countDownView");
          if (b) {
             b = a1.d(R.dimen.arg_RES_7f070888);
          }else {
             b = a1.d(R.dimen.arg_RES_7f070887);
          }
       }else {
          tk = this.j;
          if (tk == null) {
             a.S("prepareView");
          }
          countDownVie = tk.getTeamPkTipView();
          a.o(countDownVie, "prepareView.teamPkTipView");
          if (b) {
             b = a1.d(R.dimen.arg_RES_7f070886);
          }else {
             b = a1.d(R.dimen.arg_RES_7f070885);
          }
       }
       countDownVie.addOnLayoutChangeListener(new AudienceTeamPkStageViewController$a(this, countDownVie, b));
       return;
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, AudienceTeamPkStageViewController.class, "14")) {
          return;
       }
       AudienceTeamPkStageViewController tm = this.m;
       if (tm != null) {
          VoicePartyTeamPkResultDialogFragment voicePartyTe = tm.get();
          if (voicePartyTe != null) {
             d0.c(voicePartyTe);
             this.m = null;
          }
       }
       tm = this.l;
       if (tm != null) {
          VoicePartyAudienceTeamPkJoinBattleDialogFragment voicePartyAu = tm.get();
          if (voicePartyAu != null) {
             d0.c(voicePartyAu);
             this.l = null;
          }
       }
       return;
    }
    public final void Y2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudienceTeamPkStageViewController.class, "7")) {
          return;
       }
       AudienceTeamPkStageViewController tk = this.k;
       if (tk == null) {
          a.S("playingView");
       }
       tk.setVisibility(8);
       tk = this.j;
       String str = "prepareView";
       if (tk == null) {
          a.S(str);
       }
       tk.setVisibility(0);
       tk = this.j;
       if (tk == null) {
          a.S(str);
       }
       tk.b(this.A.m(0), MicSeatsDataManager.n(this.A, 0, 1, objArray), this.A.f(0), MicSeatsDataManager.g(this.A, 0, 1, objArray));
       if (this.n == null) {
          this.y.c(1, 1);
          this.y.c(2, 1);
          this.n = true;
       }
       this.W2(0);
       return;
    }
    public final b Z2(){
       Object obj = PatchProxy.apply(null, this, AudienceTeamPkStageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
}
