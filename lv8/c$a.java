package lv8.c$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import java.lang.Float;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import lv8.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import lv8.c$a$a;
import android.animation.Animator$AnimatorListener;
import android.view.ViewTreeObserver;

public final class c$a implements ViewTreeObserver$OnPreDrawListener	// class@002dac
{
    public final View b;
    public final float c;
    public final int d;
    public final View e;
    public final boolean f;

    public void c$a(View p0,float p1,int p2,View p3,boolean p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public boolean onPreDraw(){
       ValueAnimator obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float f = (float)this.b.getMeasuredHeight();
       c$a tc = this.c;
       float f1 = -2.00f * tc;
       this.b.setTranslationY(f);
       float[] uofloatArray = new float[]{f,0};
       obj = ValueAnimator.ofFloat(uofloatArray);
       obj.setInterpolator(new OvershootInterpolator(this.c));
       obj.setDuration((long)this.d);
       obj.setCurrentPlayTime((long)((float)this.d * ((f1 / ((tc + 0x3f800000) * 3.00f)) + 0x3f800000)));
       int i = Math.round((0 - obj.getAnimatedValue().floatValue()));
       ViewGroup$LayoutParams layoutParams = this.e.getLayoutParams();
       layoutParams.height = layoutParams.height + i;
       tc = this.e;
       tc.setPadding(tc.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), (this.e.getPaddingBottom() + i));
       obj.setCurrentPlayTime(0);
       obj.addUpdateListener(new b(this.b, i));
       obj.addListener(new c$a$a(this, i));
       obj.start();
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       return 0;
    }
}
