package dh2.j;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;
import vw1.b;
import java.lang.StringBuilder;
import po3.h;
import java.util.List;
import com.kuaishou.android.live.log.b;

public class j extends AnimatorListenerAdapter	// class@00252e
{
    public final View a;
    public final LiveRedPacketPendantContainerView b;

    public void j(LiveRedPacketPendantContainerView p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.e();
       this.b.setBackground(a1.f(R.drawable.arg_RES_7f081494));
       j ta = this.a;
       if (ta instanceof LiveActivityRedPacketPendantView) {
          ta.setCurrentIsShowingEntryAnimation(false);
       }else if(ta instanceof b){
          ta.e();
       }
       b.P(LiveRedPacketPendantContainerView.h, " firstAddAnimator end, viewInfo = "+h.c(this.a)+" logMsg = "+LiveRedPacketPendantContainerView.b(this.a));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       this.b.setBackground(null);
       j ta = this.a;
       if (ta instanceof LiveActivityRedPacketPendantView) {
          ta.setCurrentIsShowingEntryAnimation(true);
       }else if(ta instanceof b){
          ta.f();
       }
       b.P(LiveRedPacketPendantContainerView.h, "firstAddAnimator start, viewInfo = "+h.c(this.a)+" logMsg = "+LiveRedPacketPendantContainerView.b(this.a));
       return;
    }
}
