package aw2.e;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView$a;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView$a;

public final class e implements VoicePartyTeamPkTopScoreUserItemView$a	// class@0002d6
{
    public final VoicePartyTeamPkPlayingContainerView a;

    public void e(VoicePartyTeamPkPlayingContainerView p0){
       this.a = p0;
    }
    public final void a(View p0,UserInfo p1){
       VoicePartyTeamPkPlayingContainerView h = this.a.h;
       if (h != null) {
          h.a(p0, p1, 1);
       }
       return;
    }
}
