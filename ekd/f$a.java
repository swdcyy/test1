package ekd.f$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import ekd.f;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import ekd.f$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class f$a implements ViewTreeObserver$OnPreDrawListener	// class@000d36
{
    public final View b;
    public final int c;
    public final Animator$AnimatorListener d;

    public void f$a(View p0,int p1,Animator$AnimatorListener p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public boolean onPreDraw(){
       float f;
       f.b(this.b, this);
       f = (float)this.b.getMeasuredHeight();
       this.b.setTranslationY(f);
       float[] uofloatArray = new float[]{f,0};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setInterpolator(a.b(0x3f251eb8, 0.05f, 0x3eb5c28f, 0x3f800000));
       valueAnimato.setDuration((long)this.c);
       valueAnimato.addUpdateListener(new f$a$a(this));
       f$a td = this.d;
       if (td != null) {
          valueAnimato.addListener(td);
       }
       valueAnimato.start();
       return 0;
    }
}
