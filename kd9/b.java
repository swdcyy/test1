package kd9.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002c48
{
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void b(View p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       b tb = this.b;
       b td = this.d;
       b te = this.e;
       float f = p0.getAnimatedValue().floatValue();
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       float f1 = (float)tb;
       layoutParams.height = (int)(f1 + ((float)(this.c - tb) * f));
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = (int)((float)td + ((float)(te - td) * f));
       }
       ta.setLayoutParams(layoutParams);
       return;
    }
}
