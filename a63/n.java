package a63.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class n implements ValueAnimator$AnimatorUpdateListener	// class@00005e
{
    public final KwaiZoomImageView a;
    public final float b;
    public final float c;

    public void n(KwaiZoomImageView p0,float p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.g(p0.getAnimatedValue().floatValue(), this.b, this.c, false);
    }
}
