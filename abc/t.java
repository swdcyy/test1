package abc.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Float;
import android.widget.FrameLayout;

public final class t implements ValueAnimator$AnimatorUpdateListener	// class@0000df
{
    public final p a;
    public final int b;

    public void t(p p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       t ta = this.a;
       t tb = this.b;
       ta.d.setTranslationX(((float)(- tb) * p0.getAnimatedValue().floatValue()));
       ta.e.setTranslationX(((float)tb * p0.getAnimatedValue().floatValue()));
       ta.d.setAlpha((0x3f800000 - p0.getAnimatedValue().floatValue()));
       ta.e.setAlpha((0x3f800000 - p0.getAnimatedValue().floatValue()));
    }
}
