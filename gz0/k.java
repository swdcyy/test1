package gz0.k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;

public final class k implements ValueAnimator$AnimatorUpdateListener	// class@0025cd
{
    public final LiveAudienceBottomBarGiftAnimationManger a;
    public final long b;

    public void k(LiveAudienceBottomBarGiftAnimationManger p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       k ta = this.a;
       Objects.requireNonNull(ta);
       ta.i.setText(String.valueOf((long)(p0.getAnimatedValue().floatValue() * (float)this.b)));
    }
}
