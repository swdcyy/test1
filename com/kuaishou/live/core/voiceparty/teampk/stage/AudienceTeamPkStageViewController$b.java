package com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$b;
import tu2.b;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.ref.WeakReference;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;

public final class AudienceTeamPkStageViewController$b implements b	// class@001931
{
    public final AudienceTeamPkStageViewController a;

    public void AudienceTeamPkStageViewController$b(AudienceTeamPkStageViewController p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTeamPkStageViewController$b.class, "1")) {
          return;
       }
       a.p(p0, "data");
       AudienceTeamPkStageViewController$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, AudienceTeamPkStageViewController.class, "11")) {
          AudienceTeamPkStageViewController l = ta.l;
          if (l != null) {
             VoicePartyAudienceTeamPkJoinBattleDialogFragment voicePartyAu = l.get();
             if (voicePartyAu != null) {
                voicePartyAu.zh(ta.A.m(false), ta.A.f(false));
             }
          }
          l = ta.j;
          if (l == null) {
             a.S("prepareView");
          }
          l.b(ta.A.m(false), MicSeatsDataManager.n(ta.A, false, 1, null), ta.A.f(false), MicSeatsDataManager.g(ta.A, false, 1, null));
       }
       return;
    }
}
