package jw1.b;
import lnc.a1;
import java.lang.Object;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.ObjectAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.util.Property;
import android.view.ViewGroup;
import java.lang.Float;

public class b	// class@002c17
{
    public AnimatorSet a;
    public static final float b;
    public static final float c;

    static {
       b.b = (float)a1.e(22.00f);
       b.c = (float)a1.e(11.00f);
    }
    public void b(){
       super();
    }
    public final ObjectAnimator a(ConstraintLayout p0,float[] p1){
       float[] uofloatArray;
       PropertyValuesHolder[] obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f99999a,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000})};
       uofloatArray = new float[]{p1[0],p1[1]};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, obj);
       objectAnimat.setDuration(200);
       return objectAnimat;
    }
    public final ObjectAnimator b(ConstraintLayout p0,float[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float[] uofloatArray = new float[]{p1[0],p1[1]};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(400);
       return objectAnimat;
    }
    public final ObjectAnimator c(ConstraintLayout p0,float[] p1){
       float[] uofloatArray;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray)};
       uofloatArray = new float[]{p1[0],p1[1]};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       objectAnimat.setDuration(400);
       return objectAnimat;
    }
    public final void d(ConstraintLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       p0.setScaleX(0x3f99999a);
       p0.setScaleY(0x3f99999a);
       p0.invalidate();
       return;
    }
    public final void e(ConstraintLayout p0,float p1,float p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, b.class, "6")) {
          return;
       }
       p0.setPivotX(p1);
       p0.setPivotY(p2);
       return;
    }
}
