package androidx.transition.Slide;
import androidx.transition.Visibility;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.transition.Slide$a;
import androidx.transition.Slide$b;
import androidx.transition.Slide$c;
import androidx.transition.Slide$d;
import androidx.transition.Slide$e;
import androidx.transition.Slide$f;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import e3.o;
import android.view.View;
import java.lang.Object;
import java.util.Map;
import android.view.ViewGroup;
import android.animation.Animator;
import androidx.transition.Slide$g;
import android.animation.TimeInterpolator;
import androidx.transition.Transition;
import androidx.transition.g;
import java.lang.IllegalArgumentException;
import e3.m;
import e3.n;

public class Slide extends Visibility	// class@0009cf
{
    public Slide$g N;
    public int O;
    public static final TimeInterpolator P;
    public static final TimeInterpolator Q;
    public static final Slide$g R;
    public static final Slide$g S;
    public static final Slide$g T;
    public static final Slide$g U;
    public static final Slide$g V;
    public static final Slide$g W;

    static {
       Slide.P = new DecelerateInterpolator();
       Slide.Q = new AccelerateInterpolator();
       Slide.R = new Slide$a();
       Slide.S = new Slide$b();
       Slide.T = new Slide$c();
       Slide.U = new Slide$d();
       Slide.V = new Slide$e();
       Slide.W = new Slide$f();
    }
    public void Slide(){
       super();
       this.N = Slide.W;
       this.O = 80;
       this.r0(80);
    }
    public void Slide(int p0){
       super();
       this.N = Slide.W;
       this.O = 80;
       this.r0(p0);
    }
    public void Slide(Context p0,AttributeSet p1){
       super(p0, p1);
       this.N = Slide.W;
       this.O = 80;
       XmlPullParser xmlPullParse = p0.obtainStyledAttributes(p1, c.h);
       xmlPullParse.recycle();
       this.r0(g.g(xmlPullParse, p1, "slideEdge", 0, 80));
    }
    private void j0(o p0){
       int[] ointArray = new int[2];
       p0.b.getLocationOnScreen(ointArray);
       p0.a.put("android:slide:screenPosition", ointArray);
    }
    public void g(o p0){
       super.g(p0);
       this.j0(p0);
    }
    public void j(o p0){
       super.j(p0);
       this.j0(p0);
    }
    public Animator m0(ViewGroup p0,View p1,o p2,o p3){
       int[] ointArray = p3.a.get("android:slide:screenPosition");
       return g.a(p1, p3, ointArray[0], ointArray[1], this.N.b(p0, p1), this.N.a(p0, p1), p1.getTranslationX(), p1.getTranslationY(), Slide.P, this);
    }
    public Animator o0(ViewGroup p0,View p1,o p2,o p3){
       int[] ointArray = p2.a.get("android:slide:screenPosition");
       return g.a(p1, p2, ointArray[0], ointArray[1], p1.getTranslationX(), p1.getTranslationY(), this.N.b(p0, p1), this.N.a(p0, p1), Slide.Q, this);
    }
    public void r0(int p0){
       if (p0 != 3) {
          if (p0 != 5) {
             if (p0 != 48) {
                if (p0 != 80) {
                   if (p0 != 0x800003) {
                      if (p0 == 0x800005) {
                         this.N = Slide.V;
                      }else {
                         throw new IllegalArgumentException("Invalid slide direction");
                      }
                   }else {
                      this.N = Slide.S;
                   }
                }else {
                   this.N = Slide.W;
                }
             }else {
                this.N = Slide.T;
             }
          }else {
             this.N = Slide.U;
          }
       }else {
          this.N = Slide.R;
       }
       this.O = p0;
       m om = new m();
       om.j(p0);
       this.e0(om);
       return;
    }
}
