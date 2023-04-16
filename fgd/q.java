package fgd.q;
import android.animation.AnimatorListenerAdapter;
import fgd.r;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.specific.misc.CleanUpView;
import fgd.q$a;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.graphics.RectF;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import b27.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b27.b;

public final class q extends AnimatorListenerAdapter	// class@000e33
{
    public final r a;

    public void q(r p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       Property r;
       CleanUpView q;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       r.P8(this.a).setAnimatorListener(new q$a(this));
       CleanUpView uCleanUpView = r.P8(this.a);
       uCleanUpView.k = 0;
       uCleanUpView.o = 0;
       uCleanUpView.a();
       uCleanUpView.invalidate();
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Property s = CleanUpView.s;
       r = CleanUpView.r;
       float[] uofloatArray = new float[]{uCleanUpView.c.height() / 2.00f,0};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(s, new int[2]{0,255}),PropertyValuesHolder.ofFloat(r, uofloatArray)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uCleanUpView, propertyValu);
       objectAnimat.setInterpolator(new LinearInterpolator());
       objectAnimat.setDuration(300);
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,360});
       valueAnimato.setInterpolator(new LinearInterpolator());
       valueAnimato.setDuration(700);
       valueAnimato.addUpdateListener(new a(uCleanUpView));
       float[] uofloatArray1 = new float[]{0,uCleanUpView.n};
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray1);
       valueAnimato1.setInterpolator(new LinearInterpolator());
       valueAnimato1.setDuration(400);
       valueAnimato1.addUpdateListener(new b(uCleanUpView));
       float[] uofloatArray2 = new float[]{0,uCleanUpView.c.height() / 2.00f};
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat(r, uofloatArray2);
       PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(s, new int[2]{255,0}),propertyValu1,PropertyValuesHolder.ofFloat(CleanUpView.t, new float[2]{0,0x3f800000})};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(uCleanUpView, propertyValu2);
       objectAnimat1.setInterpolator(new LinearInterpolator());
       objectAnimat1.setDuration(500);
       objectAnimat1.setStartDelay(100);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato,valueAnimato1,objectAnimat1};
       uAnimatorSet.playSequentially(uAnimatorArr);
       q = uCleanUpView.q;
       if (q != null) {
          uAnimatorSet.addListener(q);
       }
       uCleanUpView.p = uAnimatorSet;
       uAnimatorSet.start();
       return;
    }
}
