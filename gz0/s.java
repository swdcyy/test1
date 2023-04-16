package gz0.s;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s extends AnimatorListenerAdapter	// class@0025d5
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void s(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       s ta = this.a;
       ta.m = null;
       ta.i();
       return;
    }
}
