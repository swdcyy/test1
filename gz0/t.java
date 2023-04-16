package gz0.t;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class t extends AnimatorListenerAdapter	// class@0025d6
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void t(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.l = null;
       return;
    }
}
