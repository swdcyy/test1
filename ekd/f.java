package ekd.f;
import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver;
import android.graphics.PointF;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import ekd.f$g;
import java.lang.Object;
import android.animation.TypeEvaluator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import ekd.f$a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import ekd.f$d;
import android.view.animation.RotateAnimation;
import android.animation.PropertyValuesHolder;
import android.view.animation.OvershootInterpolator;
import ekd.f$e;
import dg.h;
import dg.e;
import dg.j;
import dg.c;
import dg.f;
import ekd.f$c;
import android.widget.TextView;
import ekd.f$h;
import ekd.f$f;
import ekd.f$b;

public final class f	// class@000d47
{

    public static void a(Animator p0){
       if (p0 != null && p0.isRunning()) {
          p0.cancel();
       }
       return;
    }
    public static void b(View p0,ViewTreeObserver$OnPreDrawListener p1){
       ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
       if (viewTreeObse != null && viewTreeObse.isAlive()) {
          viewTreeObse.removeOnPreDrawListener(p1);
       }
       return;
    }
    public static ValueAnimator c(PointF p0,PointF p1,PointF p2,PointF p3,int p4,ValueAnimator$AnimatorUpdateListener p5){
       Object[] objArray = new Object[]{p0,p3};
       ValueAnimator valueAnimato = ValueAnimator.ofObject(new f$g(p1, p2), objArray);
       valueAnimato.setDuration((long)p4);
       valueAnimato.addUpdateListener(p5);
       return valueAnimato;
    }
    public static AnimatorSet d(View p0,float p1,float p2,long p3,TimeInterpolator p4){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       float[] uofloatArray = new float[]{p1,p2};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(p3);
       uAnimatorSet.setInterpolator(p4);
       return uAnimatorSet;
    }
    public static AnimatorSet e(View p0,float p1,float p2,long p3,TimeInterpolator p4){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       float[] uofloatArray = new float[]{p1,p2};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(p3);
       uAnimatorSet.setInterpolator(p4);
       return uAnimatorSet;
    }
    public static void f(View p0){
       f.g(p0, 300, null);
    }
    public static void g(View p0,int p1,Animator$AnimatorListener p2){
       p0.getViewTreeObserver().addOnPreDrawListener(new f$a(p0, p1, p2));
    }
    public static void h(Context p0,View p1){
       int i = n.z(p0);
       TranslateAnimation translateAni = new TranslateAnimation((float)(- i), (float)i, 0, 0);
       translateAni.setDuration(1300);
       translateAni.setRepeatCount(-1);
       translateAni.setInterpolator(new LinearInterpolator());
       p1.startAnimation(translateAni);
    }
    public static void i(View p0,View p1){
       f.j(p0, null, 0, false, 300, null);
    }
    public static void j(View p0,View p1,float p2,boolean p3,int p4,Animator$AnimatorListener p5){
       f$d uod = new f$d(p0, p2, p4, p1, p5, p3);
       p0.getViewTreeObserver().addOnPreDrawListener(v8);
    }
    public static Animation k(View p0){
       RotateAnimation rotateAnimat = new RotateAnimation(0, 360.00f, 1, 0x3f000000, 1, 0x3f000000);
       v7.setDuration(800);
       v7.setRepeatCount(-1);
       v7.setInterpolator(new LinearInterpolator());
       p0.startAnimation(v7);
       return v7;
    }
    public static Animator l(View p0,float p1,Animator$AnimatorListener p2,long p3,float[] p4){
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, p4),PropertyValuesHolder.ofFloat(View.SCALE_Y, p4)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration(p3);
       objectAnimat.setInterpolator(new OvershootInterpolator(p1));
       if (p2 != null) {
          objectAnimat.addListener(p2);
       }
       if (p0.getMeasuredWidth() > 0) {
          objectAnimat.start();
       }else {
          p0.getViewTreeObserver().addOnPreDrawListener(new f$e(p0, objectAnimat));
       }
       return objectAnimat;
    }
    public static Animator m(View p0){
       return f.l(p0, 2.00f, null, 300, new float[3]{0x3f800000,0x3f666666,0x3f800000});
    }
    public static e n(float p0,float p1,double p2,double p3,h p4){
       e uoe = j.d().b();
       uoe.g(new f(p2, p3));
       uoe.a(p4);
       uoe.e((double)p0);
       uoe.f((double)p1);
       return uoe;
    }
    public static e o(View p0,float p1,float p2,double p3,double p4){
       e uoe = j.d().b();
       uoe.g(new f(p3, p4));
       uoe.a(new f$c(p0));
       uoe.e((double)p1);
       uoe.f((double)p2);
       return uoe;
    }
    public static Animator p(TextView p0,long p1,long p2,f$h p3){
       p0.clearAnimation();
       ValueAnimator valueAnimato = new ValueAnimator();
       float[] uofloatArray = new float[]{(float)p1,(float)p2};
       valueAnimato.setFloatValues(uofloatArray);
       valueAnimato.setDuration(500);
       valueAnimato.addUpdateListener(new f$f(p0, p3));
       valueAnimato.addListener(new f$b(p0, p3, p2));
       valueAnimato.start();
       return valueAnimato;
    }
}
