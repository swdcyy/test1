package gz0.u;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class u extends AnimatorListenerAdapter	// class@0025d7
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void u(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.g.setScaleY(0x3f800000);
       this.a.g.setScaleX(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.g.setVisibility(0);
       return;
    }
}
