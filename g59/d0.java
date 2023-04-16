package g59.d0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class d0 implements ValueAnimator$AnimatorUpdateListener	// class@0023f9
{
    public final View a;

    public void d0(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationX((float)(- p0.getAnimatedValue().intValue()));
    }
}
