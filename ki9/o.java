package ki9.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class o implements ValueAnimator$AnimatorUpdateListener	// class@002c9c
{
    public final RecordButton a;

    public void o(RecordButton p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       o ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.K = f;
       ta.q(f);
    }
}
