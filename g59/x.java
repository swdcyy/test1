package g59.x;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class x implements ValueAnimator$AnimatorUpdateListener	// class@00241c
{
    public final View a;

    public void x(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationX((float)(- p0.getAnimatedValue().intValue()));
    }
}
