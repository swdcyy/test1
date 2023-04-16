package com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$b;
import aw2.c;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import uv2.c;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import qrd.l1;
import bw2.a;

public final class AudienceTeamPkViewController$b implements c	// class@001918
{
    public final AudienceTeamPkViewController a;

    public void AudienceTeamPkViewController$b(AudienceTeamPkViewController p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       AudienceTeamPkViewController$b uob = AudienceTeamPkViewController$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.V2(p0);
       return;
    }
    public void b(){
       VoicePartyAudienceTeamPkJoinBattleDialogFragment voicePartyAu;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudienceTeamPkViewController$b.class, "2")) {
          return;
       }
       AudienceTeamPkViewController$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, AudienceTeamPkViewController.class, "9")) {
          AudienceTeamPkViewController t = ta.t;
          if (t != null) {
             voicePartyAu = t.get();
             if (voicePartyAu != null) {
                d0.c(voicePartyAu);
             }
          }
          voicePartyAu = VoicePartyAudienceTeamPkJoinBattleDialogFragment.xh(new c(ta));
          voicePartyAu.zh(ta.A.m(false), ta.A.f(false));
          voicePartyAu.Cb(ta.B, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class.getName());
          ta.t = new WeakReference(voicePartyAu);
          ta.j.c(1, 2);
          ta.j.c(2, 2);
       }
       return;
    }
}
