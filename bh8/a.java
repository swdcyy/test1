package bh8.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@00035f
{
    public final View a;
    public final int b;
    public final int c;

    public void a(View p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       a tb = this.b;
       FrameLayout$LayoutParams layoutParams = ta.getLayoutParams();
       float f = (float)tb;
       layoutParams.bottomMargin = (int)(f + ((float)(this.c - tb) * p0.getAnimatedValue().floatValue()));
       ta.setLayoutParams(layoutParams);
    }
}
