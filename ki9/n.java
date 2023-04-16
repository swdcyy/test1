package ki9.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.PieChartProgress;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import android.view.View;

public final class n implements ValueAnimator$AnimatorUpdateListener	// class@002c9b
{
    public final PieChartProgress a;

    public void n(PieChartProgress p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       n ta = this.a;
       Objects.requireNonNull(ta);
       ta.f = (float)p0.getAnimatedValue().intValue();
       ta.invalidate();
    }
}
