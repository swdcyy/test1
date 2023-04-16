package androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import java.lang.String;
import androidx.transition.ChangeBounds$b;
import android.graphics.PointF;
import java.lang.Class;
import androidx.transition.ChangeBounds$c;
import androidx.transition.ChangeBounds$d;
import androidx.transition.ChangeBounds$e;
import androidx.transition.ChangeBounds$f;
import androidx.transition.ChangeBounds$g;
import e3.k;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import o1.g;
import e3.o;
import android.view.View;
import a2.i0;
import android.graphics.Rect;
import java.lang.Object;
import java.util.Map;
import android.view.ViewParent;
import java.lang.Integer;
import android.view.ViewGroup;
import android.animation.Animator;
import e3.w;
import androidx.transition.PathMotion;
import android.graphics.Path;
import android.util.Property;
import android.animation.ObjectAnimator;
import e3.i;
import androidx.transition.ChangeBounds$k;
import android.animation.AnimatorSet;
import androidx.transition.ChangeBounds$h;
import android.animation.Animator$AnimatorListener;
import java.lang.Math;
import android.animation.TypeEvaluator;
import androidx.transition.ChangeBounds$i;
import androidx.transition.f;
import e3.s;
import androidx.transition.ChangeBounds$j;
import androidx.transition.Transition$f;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import e3.v;
import e3.u;
import android.graphics.drawable.Drawable;
import android.animation.PropertyValuesHolder;
import e3.j;
import androidx.transition.ChangeBounds$a;

public class ChangeBounds extends Transition	// class@0009ae
{
    public int[] L;
    public boolean M;
    public boolean N;
    public static final String[] O;
    public static final Property P;
    public static final Property Q;
    public static final Property R;
    public static final Property S;
    public static final Property T;
    public static final Property U;
    public static k V;

    static {
       String[] stringArray = new String[]{"android:changeBounds:bounds","android:changeBounds:clip","android:changeBounds:parent","android:changeBounds:windowX","android:changeBounds:windowY"};
       ChangeBounds.O = stringArray;
       ChangeBounds.P = new ChangeBounds$b(PointF.class, "boundsOrigin");
       ChangeBounds.Q = new ChangeBounds$c(PointF.class, "topLeft");
       ChangeBounds.R = new ChangeBounds$d(PointF.class, "bottomRight");
       ChangeBounds.S = new ChangeBounds$e(PointF.class, "bottomRight");
       ChangeBounds.T = new ChangeBounds$f(PointF.class, "topLeft");
       ChangeBounds.U = new ChangeBounds$g(PointF.class, "position");
       ChangeBounds.V = new k();
    }
    public void ChangeBounds(){
       super();
       int[] ointArray = new int[2];
       this.L = ointArray;
       this.M = false;
       this.N = false;
    }
    public void ChangeBounds(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.L = ointArray;
       this.M = false;
       this.N = false;
       XmlResourceParser xmlResourceP = p0.obtainStyledAttributes(p1, c.d);
       xmlResourceP.recycle();
       this.l0(g.a(xmlResourceP, p1, "resizeClip", false, false));
    }
    public String[] F(){
       return ChangeBounds.O;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       o b = p0.b;
       if (!i0.Y(b) && (b.getWidth() || b.getHeight())) {
          p0.a.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
          p0.a.put("android:changeBounds:parent", p0.b.getParent());
          if (this.N != null) {
             p0.b.getLocationInWindow(this.L);
             p0.a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
             p0.a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
          }
          if (this.M != null) {
             p0.a.put("android:changeBounds:clip", i0.u(b));
          }
       }
       return;
    }
    public final boolean k0(View p0,View p1){
       boolean b = true;
       if (this.N != null) {
          o oo = this.v(p0, b);
          if (oo == null) {
             if (p0 != p1) {
             }
          }else if(p1 == oo.b){
          }
       }
    label_0014 :
       return b;
    }
    public void l0(boolean p0){
       this.M = p0;
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       int i1;
       int i4;
       ObjectAnimator objectAnimat;
       ViewGroup parent;
       int i5;
       Rect rect4;
       ObjectAnimator objectAnimat2;
       ObjectAnimator objectAnimat3;
       ChangeBounds uChangeBound = this;
       o oo = p1;
       o oo1 = p2;
       if (!oo || !oo1) {
          return null;
       }
       String str = "android:changeBounds:parent";
       ViewGroup viewGroup = oo.a.get(str);
       ViewGroup viewGroup1 = oo1.a.get(str);
       if (viewGroup == null || viewGroup1 == null) {
          return null;
       }
       o b = oo1.b;
       if (uChangeBound.k0(viewGroup, viewGroup1)) {
          Rect rect = oo.a.get("android:changeBounds:bounds");
          Rect rect1 = oo1.a.get("android:changeBounds:bounds");
          Rect left = rect.left;
          Rect left1 = rect1.left;
          Rect top = rect.top;
          Rect top1 = rect1.top;
          Rect right = rect.right;
          Rect right1 = rect1.right;
          rect = rect.bottom;
          Rect bottom = rect1.bottom;
          int i = right - left;
          i1 = rect - top;
          int i2 = right1 - left1;
          int i3 = bottom - top1;
          o oo2 = b;
          Rect rect2 = oo.a.get("android:changeBounds:clip");
          Object obj = oo1.a.get("android:changeBounds:clip");
          if (!i || (i1 || (i2 && i3))) {
             i4 = (left != left1 || top != top1)? 1: 0;
             if (right != right1 || rect != bottom) {
                i4 = i4 + 1;
             }
          }else {
             i4 = 0;
          }
          if (rect2 == null || (!rect2.equals(obj) || (rect2 == null && obj != null))) {
             i4 = i4 + 1;
          }
          if (i4 > 0) {
             p0 = obj;
             Rect rect3 = rect2;
             PathMotion pathMotion = 2;
             if (uChangeBound.M == null) {
                b = oo2;
                w.h(b, left, top, right, rect);
                if (i4 == pathMotion) {
                   if (i == i2 && i1 == i3) {
                      objectAnimat = i.a(b, ChangeBounds.U, this.x().a((float)left, (float)top, (float)left1, (float)top1));
                   }else {
                      ChangeBounds$k ok = new ChangeBounds$k(b);
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[pathMotion];
                      uAnimatorArr[0] = i.a(ok, ChangeBounds.Q, this.x().a((float)left, (float)top, (float)left1, (float)top1));
                      uAnimatorArr[1] = i.a(ok, ChangeBounds.R, this.x().a((float)right, (float)rect, (float)right1, (float)bottom));
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.addListener(new ChangeBounds$h(uChangeBound, ok));
                      objectAnimat = uAnimatorSet;
                   }
                }else if(left != left1 || top != top1){
                   objectAnimat = i.a(b, ChangeBounds.T, this.x().a((float)left, (float)top, (float)left1, (float)top1));
                }else {
                   objectAnimat = i.a(b, ChangeBounds.S, this.x().a((float)right, (float)rect, (float)right1, (float)bottom));
                }
             }else {
                b = oo2;
                w.h(b, left, top, (Math.max(i, i2) + left), (Math.max(i1, i3) + top));
                ObjectAnimator objectAnimat1 = (left != left1 || top != top1)? i.a(b, ChangeBounds.U, this.x().a((float)left, (float)top, (float)left1, (float)top1)): null;
                if (rect3 == null) {
                   i5 = 0;
                   rect4 = new Rect(i5, i5, i, i1);
                }else {
                   i5 = 0;
                   rect4 = rect3;
                }
                Rect rect5 = (p0 == null)? new Rect(i5, i5, i2, i3): p0;
                if (!rect4.equals(rect5)) {
                   i0.z0(b, rect4);
                   Object[] objArray = new Object[pathMotion];
                   objArray[i5] = rect4;
                   objArray[1] = rect5;
                   objectAnimat2 = ObjectAnimator.ofObject(b, "clipBounds", ChangeBounds.V, objArray);
                   ChangeBounds$i oi = new ChangeBounds$i(this, b, p0, left1, top1, right1, bottom);
                   objectAnimat2.addListener(right);
                   objectAnimat3 = objectAnimat2;
                }else {
                   objectAnimat3 = null;
                }
                objectAnimat = f.c(objectAnimat1, objectAnimat3);
             }
             if (b.getParent() instanceof ViewGroup) {
                parent = b.getParent();
                s.c(parent, true);
                uChangeBound.a(new ChangeBounds$j(uChangeBound, parent));
             }
             return objectAnimat;
          }
       }else {
          i1 = oo.a.get("android:changeBounds:windowX").intValue();
          String str1 = "android:changeBounds:windowY";
          int i6 = oo.a.get(str1).intValue();
          i5 = oo1.a.get("android:changeBounds:windowX").intValue();
          i4 = oo1.a.get(str1).intValue();
          if (i1 != i5 || i6 != i4) {
             p0.getLocationInWindow(uChangeBound.L);
             Bitmap uBitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap$Config.ARGB_8888);
             b.draw(new Canvas(uBitmap));
             BitmapDrawable uBitmapDrawa = new BitmapDrawable(uBitmap);
             w.i(b, 0);
             w.c(p0).b(uBitmapDrawa);
             ChangeBounds l = uChangeBound.L;
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{j.a(ChangeBounds.P, this.x().a((float)(i1 - l[0]), (float)(i6 - l[1]), (float)(i5 - l[0]), (float)(i4 - l[1])))};
             objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(uBitmapDrawa, propertyValu);
             ChangeBounds$a uoa = new ChangeBounds$a(this, p0, uBitmapDrawa, b, w.d(b));
             objectAnimat2.addListener(v11);
             return objectAnimat2;
          }
       }
       return null;
    }
}
