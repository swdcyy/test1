package androidx.transition.ChangeScroll;
import androidx.transition.Transition;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import e3.o;
import android.view.View;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import androidx.transition.f;

public class ChangeScroll extends Transition	// class@0009b5
{
    public static final String[] L;

    static {
       String[] stringArray = new String[]{"android:changeScroll:x","android:changeScroll:y"};
       ChangeScroll.L = stringArray;
    }
    public void ChangeScroll(){
       super();
    }
    public void ChangeScroll(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public String[] F(){
       return ChangeScroll.L;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       p0.a.put("android:changeScroll:x", Integer.valueOf(p0.b.getScrollX()));
       p0.a.put("android:changeScroll:y", Integer.valueOf(p0.b.getScrollY()));
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       ObjectAnimator objectAnimat;
       Animator uAnimator = null;
       if (p1 != null && p2 != null) {
          o b = p2.b;
          int i = p1.a.get("android:changeScroll:x").intValue();
          int i1 = p2.a.get("android:changeScroll:x").intValue();
          int i2 = p1.a.get("android:changeScroll:y").intValue();
          int i3 = p2.a.get("android:changeScroll:y").intValue();
          if (i != i1) {
             b.setScrollX(i);
             int[] ointArray = new int[]{i,i1};
             objectAnimat = ObjectAnimator.ofInt(b, "scrollX", ointArray);
          }else {
             objectAnimat = uAnimator;
          }
          if (i2 != i3) {
             b.setScrollY(i2);
             int[] ointArray1 = new int[]{i2,i3};
             uAnimator = ObjectAnimator.ofInt(b, "scrollY", ointArray1);
          }
          uAnimator = f.c(objectAnimat, uAnimator);
       }
       return uAnimator;
    }
}
