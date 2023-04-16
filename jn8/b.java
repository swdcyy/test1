package jn8.b;
import androidx.transition.Visibility;
import e3.o;
import android.view.View;
import java.lang.Float;
import java.lang.Object;
import java.util.Map;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import jn8.b$a;
import androidx.transition.Transition$f;
import androidx.transition.Transition;

public class b extends Visibility	// class@002981
{

    public void b(){
       super();
    }
    public void j(o p0){
       super.j(p0);
       p0.a.put("scale:scaleX", Float.valueOf(p0.b.getScaleX()));
       p0.a.put("scale:scaleY", Float.valueOf(p0.b.getScaleY()));
    }
    public Animator m0(ViewGroup p0,View p1,o p2,o p3){
       return this.r0(p1, 0, 0x3f800000, p2);
    }
    public Animator o0(ViewGroup p0,View p1,o p2,o p3){
       return this.r0(p1, 0x3f800000, 0, p2);
    }
    public final Animator r0(View p0,float p1,float p2,o p3){
       float[] uofloatArray;
       float[] uofloatArray1;
       float scaleX = p0.getScaleX();
       float scaleY = p0.getScaleY();
       float f = scaleX * p1;
       float f1 = scaleX * p2;
       p1 = p1 * scaleY;
       p2 = p2 * scaleY;
       if (p3 != null) {
          Float uFloat = p3.a.get("scale:scaleX");
          Float uFloat1 = p3.a.get("scale:scaleY");
          if (uFloat != null && uFloat.floatValue() - scaleX) {
             f = uFloat.floatValue();
          }
          if (uFloat1 != null && uFloat1.floatValue() - scaleY) {
             p1 = uFloat1.floatValue();
          }
       }
    label_0042 :
       p0.setScaleX(f);
       p0.setScaleY(p1);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.SCALE_X, uofloatArray),ObjectAnimator.ofFloat(p0, View.SCALE_Y, uofloatArray1)};
       uofloatArray = new float[]{f,f1};
       uofloatArray1 = new float[]{p1,p2};
       uAnimatorSet.playTogether(uAnimatorArr);
       this.a(new b$a(this, p0, scaleX, scaleY));
       return uAnimatorSet;
    }
}
