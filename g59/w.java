package g59.w;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class w implements ValueAnimator$AnimatorUpdateListener	// class@00241b
{
    public final View a;

    public void w(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationX((float)(- p0.getAnimatedValue().intValue()));
    }
}
