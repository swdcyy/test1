package bt7.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class g implements ValueAnimator$AnimatorUpdateListener	// class@000470
{
    public final View a;
    public final int b;
    public final int c;

    public void g(View p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationY(((float)(this.b - this.c) * (0x3f800000 - p0.getAnimatedValue().floatValue())));
    }
}
