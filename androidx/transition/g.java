package androidx.transition.g;
import android.view.View;
import e3.o;
import android.animation.TimeInterpolator;
import androidx.transition.Transition;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Math;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import androidx.transition.g$a;
import androidx.transition.Transition$f;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.a;

public class g	// class@0009fa
{

    public static Animator a(View p0,o p1,int p2,int p3,float p4,float p5,float p6,float p7,TimeInterpolator p8,Transition p9){
       float f;
       float f1;
       float[] uofloatArray;
       float[] uofloatArray1;
       o oo = p1;
       float translationX = p0.getTranslationX();
       float translationY = p0.getTranslationY();
       int[] tag = oo.b.getTag(R.id.transition_position);
       int i = 1;
       if (tag != null) {
          f = (float)(tag[0] - p2) + translationX;
          f1 = (float)(tag[i] - p3) + translationY;
       }else {
          f = p4;
          f1 = p5;
       }
       int i1 = p2 + Math.round((f - translationX));
       int i2 = p3 + Math.round((f1 - translationY));
       p0.setTranslationX(f);
       p0.setTranslationY(f1);
       if (!f - p6 && !f1 - p7) {
          return null;
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1)};
          uofloatArray = new float[]{f,p6};
          uofloatArray1 = new float[]{f1,p7};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          g$a uoa = new g$a(p0, oo.b, i1, i2, translationX, translationY);
          p9.a(i);
          objectAnimat.addListener(i);
          a.a(objectAnimat, i);
          objectAnimat.setInterpolator(p8);
          return objectAnimat;
       }
    }
}
