package fh2.f;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f extends AnimatorListenerAdapter	// class@002960
{
    public final LiveNormalRedPacketFloatTipsView a;

    public void f(LiveNormalRedPacketFloatTipsView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.removeAllListeners();
       LiveNormalRedPacketFloatTipsView s = this.a.s;
       if (s != null) {
          s.onAnimationEnd(p0);
       }
       return;
    }
}
