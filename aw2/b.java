package aw2.b;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView$a;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;

public final class b implements VoicePartyTeamPkPlayingContainerView$a	// class@0002d3
{
    public final AudienceTeamPkStageViewController a;

    public void b(AudienceTeamPkStageViewController p0){
       this.a = p0;
       super();
    }
    public final void a(View p0,UserInfo p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       if (p1 != null) {
          this.a.C.w0(new UserProfile(p1), LiveStreamClickType.VOICE_PARTY_TEAM_PK, 18, false, 73);
       }
       return;
    }
}
