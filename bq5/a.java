package bq5.a;
import bq5.b;
import android.animation.Animator;
import android.view.View;
import dp3.g;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import java.lang.Object;
import android.animation.ObjectAnimator;
import lnc.a1;

public final class a	// class@000563
{

    public static Animator a(b p0){
       float[] uofloatArray;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
       uofloatArray = new float[]{(float)p0.z(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0.getView(), propertyValu);
       objectAnimat.setDuration(300);
       return objectAnimat;
    }
    public static Animator b(b p0){
       float[] uofloatArray;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
       uofloatArray = new float[]{0,(float)p0.z()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0.getView(), propertyValu);
       objectAnimat.setDuration(300);
       return objectAnimat;
    }
    public static int c(b p0){
       return 2;
    }
    public static int d(b p0){
       return a1.d(0x7f070a81);
    }
    public static int e(b p0){
       return b.a;
    }
    public static int f(b p0){
       return 4;
    }
}
