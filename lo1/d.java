package lo1.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.ImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.graphics.PointF;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@002fdc
{
    public final ImageView a;

    public void d(ImageView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       PointF animatedValu = p0.getAnimatedValue();
       ta.setTranslationX(animatedValu.x);
       ta.setTranslationY(animatedValu.y);
    }
}
