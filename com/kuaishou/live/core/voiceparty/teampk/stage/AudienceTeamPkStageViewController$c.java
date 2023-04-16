package com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$c;
import np2.h;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import java.lang.Object;
import np2.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import co2.f2;
import java.lang.CharSequence;
import zsd.u;
import e17.i;
import np2.g;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.voiceparty.teampk.pkresult.VoicePartyTeamPkResultDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.util.List;
import bw2.b;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import qrd.l1;
import java.lang.Long;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import com.kuaishou.livestream.message.nano.TeamStatisticInfo;

public final class AudienceTeamPkStageViewController$c implements h	// class@001932
{
    public final AudienceTeamPkStageViewController b;

    public void AudienceTeamPkStageViewController$c(AudienceTeamPkStageViewController p0){
       this.b = p0;
       super();
    }
    public void A(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTeamPkStageViewController$c.class, "5")) {
          return;
       }
       a.p(p0, "stopInfo");
       AudienceTeamPkStageViewController$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, AudienceTeamPkStageViewController.class, "6")) {
          LiveVoicePartyLogTag tEAM_PK_AUDI = LiveVoicePartyLogTag.TEAM_PK_AUDIENCE;
          b.a0(tEAM_PK_AUDI, "onReceiveTeamPkEndMessage", c.j("message", p0));
          if (a.g(p0.a, tb.v.y()) ^ 0x01) {
             b.Z(tEAM_PK_AUDI, "onReceiveTeamPkEndMessage, invalidVoicePartyId");
          }else if(u.S1(p0.a()) ^ 0x01){
             i.d(R.style.arg_RES_7f11066a, p0.a());
          }
       }
       return;
    }
    public void C(){
       g.c(this);
    }
    public void M(VoicePartyTeamPkResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTeamPkStageViewController$c.class, "4")) {
          return;
       }
       a.p(p0, "result");
       AudienceTeamPkStageViewController$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, AudienceTeamPkStageViewController.class, "13")) {
          AudienceTeamPkStageViewController m = tb.m;
          if (m != null) {
             VoicePartyTeamPkResultDialogFragment voicePartyTe = m.get();
             if (voicePartyTe != null) {
                d0.c(voicePartyTe);
             }
          }
          VoicePartyTeamPkResultDialogFragment voicePartyTe1 = VoicePartyTeamPkResultDialogFragment.wh(p0, b.c(p0, tb.A));
          voicePartyTe1.Cb(tb.u, VoicePartyTeamPkResultDialogFragment.class.getName());
          tb.m = new WeakReference(voicePartyTe1);
       }
       return;
    }
    public void d(long p0){
       AudienceTeamPkStageViewController$c uoc = AudienceTeamPkStageViewController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "2")) {
          return;
       }
       uoc = this.b;
       Objects.requireNonNull(uoc);
       AudienceTeamPkStageViewController uAudienceTea = AudienceTeamPkStageViewController.class;
       if (!PatchProxy.isSupport(uAudienceTea) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), uoc, uAudienceTea, "8")) {
          uAudienceTea = uoc.j;
          if (uAudienceTea == null) {
             a.S("prepareView");
          }
          uAudienceTea.setVisibility(8);
          uAudienceTea = uoc.k;
          if (uAudienceTea == null) {
             a.S("playingView");
          }
          uAudienceTea.setVisibility(0);
          p0 = p0 / (long)1000;
          if (p0 > 0) {
             uAudienceTea = uoc.k;
             if (uAudienceTea == null) {
                a.S("playingView");
             }
             uAudienceTea.b(p0, 0);
          }
          uoc.W2(true);
       }
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, AudienceTeamPkStageViewController$c.class, "1")) {
          return;
       }
       this.b.Y2();
       return;
    }
    public void v(TeamStatisticInfo p0,TeamStatisticInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceTeamPkStageViewController$c.class, "6")) {
          return;
       }
       a.p(p0, "yellowInfo");
       a.p(p1, "blueInfo");
       AudienceTeamPkStageViewController$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tb, AudienceTeamPkStageViewController.class, "12")) {
          AudienceTeamPkStageViewController k = tb.k;
          if (k == null) {
             a.S("playingView");
          }
          k.c(p0, p1);
       }
       return;
    }
    public void w(long p0){
       AudienceTeamPkStageViewController$c uoc = AudienceTeamPkStageViewController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "3")) {
          return;
       }
       uoc = this.b;
       Objects.requireNonNull(uoc);
       AudienceTeamPkStageViewController uAudienceTea = AudienceTeamPkStageViewController.class;
       if (!PatchProxy.isSupport(uAudienceTea) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), uoc, uAudienceTea, "9")) {
          uAudienceTea = uoc.j;
          if (uAudienceTea == null) {
             a.S("prepareView");
          }
          uAudienceTea.setVisibility(8);
          uAudienceTea = uoc.k;
          String str = "playingView";
          if (uAudienceTea == null) {
             a.S(str);
          }
          uAudienceTea.setVisibility(0);
          uAudienceTea = uoc.k;
          if (uAudienceTea == null) {
             a.S(str);
          }
          uAudienceTea.b((p0 / (long)1000), true);
          uoc.W2(true);
       }
       return;
    }
}
