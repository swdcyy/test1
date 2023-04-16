package dh2.m;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.widget.TextView;

public class m extends AnimatorListenerAdapter	// class@002531
{
    public final LiveMediumTextView a;
    public final View b;
    public final View c;
    public final LiveRedPacketPendantContainerView d;

    public void m(LiveRedPacketPendantContainerView p0,LiveMediumTextView p1,View p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.d.removeView(this.a);
       this.d.d(this.b, this.c);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       this.d.d(this.b, this.c);
       return;
    }
}
