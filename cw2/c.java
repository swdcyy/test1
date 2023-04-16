package cw2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView$a;

public final class c implements View$OnClickListener	// class@0023ed
{
    public final VoicePartyTeamPkTopScoreUserItemView b;

    public void c(VoicePartyTeamPkTopScoreUserItemView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       VoicePartyTeamPkTopScoreUserItemView d = tb.d;
       if (d != null) {
          VoicePartyTeamPkTopScoreUserItemView e = tb.e;
          if (e != null) {
             e.a(p0, d);
          }
       }
       return;
    }
}
