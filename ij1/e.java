package ij1.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import java.lang.Math;
import android.view.View;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@002905
{
    public final LiveGuideGiftAnimationView a;

    public void e(LiveGuideGiftAnimationView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       ta.h = Math.max(0, Math.min(0x3f800000, p0.getAnimatedValue().floatValue()));
       ta.invalidate();
    }
}
