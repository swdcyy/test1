package dh2.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import android.view.View;
import java.util.List;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vw1.b;

public class k extends AnimatorListenerAdapter	// class@00252f
{
    public final View a;
    public final List b;
    public final LiveRedPacketPendantContainerView c;

    public void k(LiveRedPacketPendantContainerView p0,View p1,List p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       k ta = this.a;
       if (ta instanceof b) {
          this.c.g(ta, this.b);
          this.a.d();
       }
       return;
    }
}
