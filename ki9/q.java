package ki9.q;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class q implements ValueAnimator$AnimatorUpdateListener	// class@002c9e
{
    public final RecordButton a;

    public void q(RecordButton p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       q ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.K = f;
       ta.q(f);
    }
}
