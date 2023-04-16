package mk9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.graphics.Matrix;
import android.widget.ImageView;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@003042
{
    public final XfScalableImageView a;

    public void a(XfScalableImageView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.q0();
       ta.x = f;
       ta.y.postScale(f, f, ta.B, ta.C);
       ta.invalidate();
    }
}
