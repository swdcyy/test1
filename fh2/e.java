package fh2.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class e extends AnimatorListenerAdapter	// class@00295f
{
    public final LiveNormalRedPacketFloatTipsView a;

    public void e(LiveNormalRedPacketFloatTipsView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.removeAllListeners();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       LiveNormalRedPacketFloatTipsView c = this.a.c;
       if (c != null) {
          c.setVisibility(0);
       }
       return;
    }
}
