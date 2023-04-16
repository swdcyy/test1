package g61.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.basic.widget.LiveTransitionAvatarView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.widget.ImageView;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002429
{
    public final LiveTransitionAvatarView a;

    public void b(LiveTransitionAvatarView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.B.setAlpha(f);
       ta.C.setAlpha((0x3f800000 - f));
    }
}
