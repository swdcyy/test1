package androidx.transition.Explode;
import androidx.transition.Visibility;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import e3.b;
import e3.n;
import androidx.transition.Transition;
import android.content.Context;
import android.util.AttributeSet;
import e3.o;
import android.view.View;
import android.graphics.Rect;
import java.lang.Object;
import java.util.Map;
import java.lang.Math;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import androidx.transition.g;

public class Explode extends Visibility	// class@0009bd
{
    public int[] N;
    public static final TimeInterpolator O;
    public static final TimeInterpolator P;

    static {
       Explode.O = new DecelerateInterpolator();
       Explode.P = new AccelerateInterpolator();
    }
    public void Explode(){
       super();
       int[] ointArray = new int[2];
       this.N = ointArray;
       this.e0(new b());
    }
    public void Explode(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.N = ointArray;
       this.e0(new b());
    }
    private void j0(o p0){
       o b = p0.b;
       b.getLocationOnScreen(this.N);
       Explode tN = this.N;
       int i = tN[0];
       int i1 = tN[1];
       p0.a.put("android:explode:screenBounds", new Rect(i, i1, (b.getWidth() + i), (b.getHeight() + i1)));
    }
    public static float r0(float p0,float p1){
       return (float)Math.sqrt((double)((p0 * p0) + (p1 * p1)));
    }
    public static float s0(View p0,int p1,int p2){
       return Explode.r0((float)Math.max(p1, (p0.getWidth() - p1)), (float)Math.max(p2, (p0.getHeight() - p2)));
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
       Rect rect = p3.a.get("android:explode:screenBounds");
       float translationX = p1.getTranslationX();
       float translationY = p1.getTranslationY();
       this.t0(p0, rect, this.N);
       Explode tN = this.N;
       return g.a(p1, p3, rect.left, rect.top, (translationX + (float)tN[0]), (translationY + (float)tN[1]), translationX, translationY, Explode.O, this);
    }
    public Animator o0(ViewGroup p0,View p1,o p2,o p3){
       float f;
       float f1;
       Rect rect = p2.a.get("android:explode:screenBounds");
       Rect left = rect.left;
       Rect top = rect.top;
       float translationX = p1.getTranslationX();
       float translationY = p1.getTranslationY();
       int[] tag = p2.b.getTag(R.id.transition_position);
       int i = 1;
       int i1 = 0;
       if (tag != null) {
          f = (float)(tag[i1] - rect.left) + translationX;
          f1 = (float)(tag[i] - rect.top) + translationY;
          rect.offsetTo(tag[i1], tag[i]);
       }else {
          f = translationX;
          f1 = translationY;
       }
       this.t0(p0, rect, this.N);
       Explode tN = this.N;
       return g.a(p1, p2, left, top, translationX, translationY, (f + (float)tN[i1]), (f1 + (float)tN[i]), Explode.P, this);
    }
    public final void t0(View p0,Rect p1,int[] p2){
       int i2;
       int i3;
       Explode uExplode = this;
       View view = p0;
       view.getLocationOnScreen(uExplode.N);
       Explode n = uExplode.N;
       int i = n[0];
       int i1 = n[1];
       Rect rect = this.s();
       if (rect == null) {
          i2 = ((p0.getWidth() / 2) + i) + Math.round(p0.getTranslationX());
          i3 = ((p0.getHeight() / 2) + i1) + Math.round(p0.getTranslationY());
       }else {
          i3 = rect.centerY();
          i2 = rect.centerX();
       }
       float f = (float)(p1.centerX() - i2);
       float f1 = (float)(p1.centerY() - i3);
       float f2 = 0;
       if (!f - f2 && !f1 - f2) {
          f = (float)(Math.random() * 2.00f) - 0x3f800000;
          f1 = (float)(Math.random() * 2.00f) - 0x3f800000;
       }
       f2 = Explode.r0(f, f1);
       float f3 = Explode.s0(view, (i2 - i), (i3 - i1));
       p2[0] = Math.round(((f / f2) * f3));
       p2[1] = Math.round((f3 * (f1 / f2)));
       return;
    }
}
