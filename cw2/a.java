package cw2.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class a extends AnimatorListenerAdapter	// class@0023eb
{
    public final VoicePartyTeamPkCountDownTextView a;

    public void a(VoicePartyTeamPkCountDownTextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.setScaleX(0x3f800000);
       this.a.setScaleY(0x3f800000);
       return;
    }
}
