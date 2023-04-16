package ga.l$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ga.l;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import fa.d;
import com.yxcorp.utility.n;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import fa.g;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import ga.l$b$a;
import android.animation.Animator$AnimatorListener;

public class l$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@002070
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       int i;
       int i1;
       if (this.b.c.getMeasuredHeight() > 0) {
          this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          l$b tb = this.b;
          l c = tb.c;
          float f = (float)c.getMeasuredHeight();
          float f1 = 0x3f800000;
          double d = (double)((f * f1) / (float)n.j(d.a(c.getContext())));
          if (d - 0x3fbc28f5c28f5c29 < 0) {
             i = 200;
          }else if(d - 0x3fcc28f5c28f5c29 < 0){
             i = 250;
          }else if(d - 0x3fd999999999999a < 0){
             i = 300;
          }else if(d - 0x3fe8000000000000 < 0){
             i = 350;
          }else {
             i = 400;
          }
          float[] uofloatArray = new float[]{f,i1};
          i1 = 0;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, uofloatArray);
          objectAnimat.setInterpolator(a.b(i1, 0x3f19999a, 0.30f, f1));
          ValueAnimator valueAnimato = g.a(c, 0);
          if (valueAnimato != null) {
             valueAnimato.setInterpolator(a.b(0.25f, 0.10f, 0.25f, f1));
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration((long)i);
          if (valueAnimato != null) {
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato};
             uAnimatorSet.playTogether(uAnimatorArr);
          }else {
             uAnimatorSet.play(objectAnimat);
          }
          tb.j = uAnimatorSet;
          tb = this.b;
          if (tb.p != null) {
             tb.j.start();
          }
          tb = this.b;
          c = tb.c;
          uofloatArray = new float[]{i1,(float)c.getMeasuredHeight()};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, uofloatArray);
          objectAnimat1.setInterpolator(a.b(0x3f000000, i1, 0.30f, f1));
          valueAnimato = g.a(c, 1);
          if (valueAnimato != null) {
             valueAnimato.setInterpolator(a.b(0.05f, 0.20f, 0.20f, f1));
          }
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          uAnimatorSet1.setDuration(200);
          if (valueAnimato != null) {
             Animator[] uAnimatorArr1 = new Animator[]{objectAnimat1,valueAnimato};
             uAnimatorSet1.playTogether(uAnimatorArr1);
          }else {
             uAnimatorSet1.play(objectAnimat1);
          }
          tb.k = uAnimatorSet1;
          this.b.k.addListener(new l$b$a(this));
       }
       return;
    }
}
