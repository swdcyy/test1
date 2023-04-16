package ah9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.widget.ImageView;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@0000c5
{
    public final IdentifyCircleImageView a;
    public final float b;

    public void a(IdentifyCircleImageView p0,float p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       ta.y = ((ta.B - tb) * p0.getAnimatedValue().floatValue()) + tb;
       ta.invalidate();
    }
}
