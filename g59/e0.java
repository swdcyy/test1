package g59.e0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class e0 implements ValueAnimator$AnimatorUpdateListener	// class@0023fb
{
    public final View a;

    public void e0(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationX((float)(- p0.getAnimatedValue().intValue()));
    }
}
