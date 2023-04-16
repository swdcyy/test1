package ekd.f$d;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import java.lang.Float;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import ekd.f$d$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ekd.f$d$b;
import ekd.f;

public final class f$d implements ViewTreeObserver$OnPreDrawListener	// class@000d3b
{
    public final View b;
    public final float c;
    public final int d;
    public final View e;
    public final Animator$AnimatorListener f;
    public final boolean g;

    public void f$d(View p0,float p1,int p2,View p3,Animator$AnimatorListener p4,boolean p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public boolean onPreDraw(){
       float f = (float)this.b.getMeasuredHeight();
       f$d tc = this.c;
       float f1 = -2.00f * tc;
       this.b.setTranslationY(f);
       float[] uofloatArray = new float[]{f,0};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setInterpolator(new OvershootInterpolator(this.c));
       valueAnimato.setDuration((long)this.d);
       valueAnimato.setCurrentPlayTime((long)((float)this.d * ((f1 / ((tc + 0x3f800000) * 3.00f)) + 0x3f800000)));
       int i = Math.round((0 - valueAnimato.getAnimatedValue().floatValue()));
       f$d te = this.e;
       if (te != null) {
          ViewGroup$LayoutParams layoutParams = te.getLayoutParams();
          layoutParams.height = layoutParams.height + i;
          te = this.e;
          te.setPadding(te.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), (this.e.getPaddingBottom() + i));
       }
       valueAnimato.setCurrentPlayTime(0);
       valueAnimato.addUpdateListener(new f$d$a(this, i));
       valueAnimato.addListener(new f$d$b(this, i));
       valueAnimato.start();
       f.b(this.b, this);
       return 0;
    }
}
