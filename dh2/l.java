package dh2.l;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class l extends AnimatorListenerAdapter	// class@002530
{
    public final View a;
    public final LiveRedPacketPendantContainerView b;

    public void l(LiveRedPacketPendantContainerView p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.e();
       this.b.removeView(this.a);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
