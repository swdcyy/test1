package fh2.d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends AnimatorListenerAdapter	// class@00295e
{
    public final LiveNormalRedPacketFloatTipsView a;

    public void d(LiveNormalRedPacketFloatTipsView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.removeAllListeners();
       d ta = this.a;
       if (ta.c != null) {
          ta.j();
       }
       return;
    }
}
