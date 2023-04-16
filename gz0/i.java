package gz0.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@0025cb
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void i(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       i ta = this.a;
       if (ta.n == null) {
          ta.d();
          ta.i();
       }
       return;
    }
}
