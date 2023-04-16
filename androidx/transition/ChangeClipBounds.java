package androidx.transition.ChangeClipBounds;
import androidx.transition.Transition;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import e3.o;
import android.view.View;
import android.graphics.Rect;
import a2.i0;
import java.lang.Object;
import java.util.Map;
import android.view.ViewGroup;
import android.animation.Animator;
import e3.k;
import e3.w;
import android.util.Property;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import androidx.transition.ChangeClipBounds$a;
import android.animation.Animator$AnimatorListener;

public class ChangeClipBounds extends Transition	// class@0009b0
{
    public static final String[] L;

    static {
       String[] stringArray = new String[]{"android:clipBounds:clip"};
       ChangeClipBounds.L = stringArray;
    }
    public void ChangeClipBounds(){
       super();
    }
    public void ChangeClipBounds(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public String[] F(){
       return ChangeClipBounds.L;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       o b = p0.b;
       if (b.getVisibility() == 8) {
          return;
       }
       Rect rect = i0.u(b);
       p0.a.put("android:clipBounds:clip", rect);
       if (rect == null) {
          p0.a.put("android:clipBounds:bounds", new Rect(0, 0, b.getWidth(), b.getHeight()));
       }
       return;
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       Animator uAnimator = null;
       if (p1 != null && p2 != null) {
          String str = "android:clipBounds:clip";
          if (p1.a.containsKey(str) && p2.a.containsKey(str)) {
             Rect rect = p1.a.get(str);
             Rect rect1 = p2.a.get(str);
             int i = (rect1 == null)? 1: 0;
             if (rect == null && rect1 == null) {
                return uAnimator;
             }else {
                String str1 = "android:clipBounds:bounds";
                if (rect == null) {
                   rect = p1.a.get(str1);
                }else if(rect1 == null){
                   rect1 = p2.a.get(str1);
                }
                if (rect.equals(rect1)) {
                   return uAnimator;
                }else {
                   i0.z0(p2.b, rect);
                   Rect[] rectArray = new Rect[]{rect,rect1};
                   uAnimator = ObjectAnimator.ofObject(p2.b, w.e, new k(new Rect()), rectArray);
                   if (i) {
                      uAnimator.addListener(new ChangeClipBounds$a(this, p2.b));
                   }
                }
             }
          }
       }
    label_007e :
       return uAnimator;
    }
}
