package ck.j;
import androidx.transition.Transition;
import e3.o;
import android.widget.TextView;
import java.lang.Float;
import java.lang.Object;
import java.util.Map;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.ValueAnimator;
import ck.j$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class j extends Transition	// class@000d2d
{

    public void j(){
       super();
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       o b = p0.b;
       if (b instanceof TextView) {
          p0.a.put("android:textscale:scale", Float.valueOf(b.getScaleX()));
       }
       return;
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       Animator uAnimator = null;
       if (p1 != null && (p2 != null && p1.b instanceof TextView)) {
          o b = p2.b;
          if (b instanceof TextView) {
             p1 = p1.a;
             p2 = p2.a;
             float f = 0x3f800000;
             float f1 = (p1.get("android:textscale:scale") != null)? p1.get("android:textscale:scale").floatValue(): 0x3f800000;
             if (p2.get("android:textscale:scale") != null) {
                f = p2.get("android:textscale:scale").floatValue();
             }
             if (!f1 - f) {
                return uAnimator;
             }else {
                float[] uofloatArray = new float[]{f1,f};
                uAnimator = ValueAnimator.ofFloat(uofloatArray);
                uAnimator.addUpdateListener(new j$a(this, b));
             }
          }
       }
       return uAnimator;
    }
}
