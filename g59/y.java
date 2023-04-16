package g59.y;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class y implements ValueAnimator$AnimatorUpdateListener	// class@00241d
{
    public final View a;
    public final int b;

    public void y(View p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       y ta = this.a;
       float f = (float)p0.getAnimatedValue().intValue();
       ta.setTranslationY(f);
       ta.setAlpha((0x3f800000 - (f / (float)this.b)));
    }
}
