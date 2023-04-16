package g59.f0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.TextView;
import java.lang.Object;
import android.animation.ValueAnimator;

public final class f0 implements ValueAnimator$AnimatorUpdateListener	// class@0023fd
{
    public final TextView a;
    public final TextView b;
    public final float c;

    public void f0(TextView p0,TextView p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       f0 ta = this.a;
       f0 tb = this.b;
       f0 tc = this.c;
       float animatedFrac = p0.getAnimatedFraction();
       ta.setAlpha(animatedFrac);
       float f = 0x3f800000 - animatedFrac;
       tb.setAlpha(f);
       tb.setTranslationY(((- tc) * animatedFrac));
       ta.setTranslationY((tc * f));
    }
}
