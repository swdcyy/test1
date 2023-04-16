package d22.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.basic.widget.LiveShimmerGradientTextView;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.widget.TextView;

public final class l implements ValueAnimator$AnimatorUpdateListener	// class@002431
{
    public final LiveShimmerGradientTextView a;

    public void l(LiveShimmerGradientTextView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.invalidate();
    }
}
