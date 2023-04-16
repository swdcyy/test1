package fs2.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import co2.f2;
import fs2.p;
import android.view.View;
import com.kuaishou.live.core.voiceparty.g0;

public final class k extends AnimatorListenerAdapter	// class@0029b1
{
    public final VoicePartyKtvAudienceController a;

    public void k(VoicePartyKtvAudienceController p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       f2 t = this.a.v.l().t;
       VoicePartyKtvAudienceController u = this.a.u;
       if (u == null) {
          a.S("chatViewContainer");
       }
       t.b(1, u);
       return;
    }
}
