package hf2.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import hf2.o;
import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import androidx.core.graphics.drawable.a;

public final class n implements ValueAnimator$AnimatorUpdateListener	// class@002d8a
{
    public final o a;
    public final boolean b;
    public final ArgbEvaluator c;
    public final int d;
    public final int e;
    public final Drawable f;
    public final TextView g;

    public void n(o p0,boolean p1,ArgbEvaluator p2,int p3,int p4,Drawable p5,TextView p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       n ta = this.a;
       n tc = this.c;
       n td = this.d;
       n te = this.e;
       n tf = this.f;
       n tg = this.g;
       Objects.requireNonNull(ta);
       float animatedFrac = p0.getAnimatedFraction();
       ta.a = (this.b != null)? tc.evaluate(animatedFrac, Integer.valueOf(td), Integer.valueOf(te)).intValue(): tc.evaluate(animatedFrac, Integer.valueOf(te), Integer.valueOf(td)).intValue();
       a.n(tf, ta.a);
       tg.setBackground(tf);
       return;
    }
}
