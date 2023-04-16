package csb.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import com.kwai.library.widget.specific.misc.ClipWidthView;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@0023a6
{
    public final TipRefreshView a;

    public void a(TipRefreshView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.e.setClip(p0.getAnimatedValue().floatValue());
    }
}
