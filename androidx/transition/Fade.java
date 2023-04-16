package androidx.transition.Fade;
import androidx.transition.Visibility;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import e3.o;
import java.lang.Object;
import java.util.Map;
import java.lang.Float;
import android.view.View;
import e3.w;
import android.view.ViewGroup;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import androidx.transition.Fade$b;
import android.animation.Animator$AnimatorListener;
import androidx.transition.Fade$a;
import androidx.transition.Transition$f;
import androidx.transition.Transition;

public class Fade extends Visibility	// class@0009c0
{

    public void Fade(){
       super();
    }
    public void Fade(int p0){
       super();
       this.q0(p0);
    }
    public void Fade(Context p0,AttributeSet p1){
       super(p0, p1);
       XmlResourceParser xmlResourceP = p0.obtainStyledAttributes(p1, c.f);
       this.q0(g.g(xmlResourceP, p1, "fadingMode", 0, this.k0()));
       xmlResourceP.recycle();
    }
    public static float s0(o p0,float p1){
       if (p0 != null) {
          Float uFloat = p0.a.get("android:fade:transitionAlpha");
          if (uFloat != null) {
             p1 = uFloat.floatValue();
          }
       }
       return p1;
    }
    public void j(o p0){
       super.j(p0);
       p0.a.put("android:fade:transitionAlpha", Float.valueOf(w.d(p0.b)));
    }
    public Animator m0(ViewGroup p0,View p1,o p2,o p3){
       float f = 0;
       float f1 = Fade.s0(p2, f);
       if (!f1 - 0x3f800000) {
       }else {
          f = f1;
       }
       return this.r0(p1, f, 0x3f800000);
    }
    public Animator o0(ViewGroup p0,View p1,o p2,o p3){
       w.f(p1);
       return this.r0(p1, Fade.s0(p2, 0x3f800000), 0);
    }
    public final Animator r0(View p0,float p1,float p2){
       if (!p1 - p2) {
          return null;
       }
       w.i(p0, p1);
       float[] uofloatArray = new float[]{p2};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, w.d, uofloatArray);
       objectAnimat.addListener(new Fade$b(p0));
       this.a(new Fade$a(this, p0));
       return objectAnimat;
    }
}
