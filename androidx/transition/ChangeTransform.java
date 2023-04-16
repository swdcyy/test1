package androidx.transition.ChangeTransform;
import androidx.transition.Transition;
import java.lang.String;
import androidx.transition.ChangeTransform$a;
import java.lang.Class;
import androidx.transition.ChangeTransform$b;
import android.graphics.PointF;
import android.graphics.Matrix;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import o1.g;
import android.view.View;
import a2.i0;
import e3.o;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Map;
import androidx.transition.ChangeTransform$f;
import e3.w;
import e3.d;
import e3.f;
import androidx.transition.ChangeTransform$d;
import androidx.transition.Transition$f;
import android.animation.ObjectAnimator;
import e3.h;
import androidx.transition.ChangeTransform$e;
import e3.c;
import android.util.Property;
import android.animation.TypeEvaluator;
import android.animation.PropertyValuesHolder;
import androidx.transition.PathMotion;
import android.graphics.Path;
import e3.j;
import androidx.transition.ChangeTransform$c;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.a;

public class ChangeTransform extends Transition	// class@0009bc
{
    public boolean L;
    public boolean M;
    public Matrix N;
    public static final String[] O;
    public static final Property P;
    public static final Property Q;
    public static final boolean R;

    static {
       String[] stringArray = new String[]{"android:changeTransform:matrix","android:changeTransform:transforms","android:changeTransform:parentMatrix"};
       ChangeTransform.O = stringArray;
       ChangeTransform.P = new ChangeTransform$a(float[].class, "nonTranslations");
       ChangeTransform.Q = new ChangeTransform$b(PointF.class, "translations");
       ChangeTransform.R = true;
    }
    public void ChangeTransform(){
       super();
       this.L = true;
       this.M = true;
       this.N = new Matrix();
    }
    public void ChangeTransform(Context p0,AttributeSet p1){
       super(p0, p1);
       this.L = true;
       this.M = true;
       this.N = new Matrix();
       XmlPullParser xmlPullParse = p0.obtainStyledAttributes(p1, c.g);
       this.L = g.a(xmlPullParse, p1, "reparentWithOverlay", true, true);
       this.M = g.a(xmlPullParse, p1, "reparent", 0, true);
       xmlPullParse.recycle();
    }
    public static void n0(View p0){
       ChangeTransform.p0(p0, 0, 0, 0, 0x3f800000, 0x3f800000, 0, 0, 0);
    }
    public static void p0(View p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8){
       p0.setTranslationX(p1);
       p0.setTranslationY(p2);
       i0.O0(p0, p3);
       p0.setScaleX(p4);
       p0.setScaleY(p5);
       p0.setRotationX(p6);
       p0.setRotationY(p7);
       p0.setRotation(p8);
    }
    public String[] F(){
       return ChangeTransform.O;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
       if (!ChangeTransform.R) {
          p0.b.getParent().startViewTransition(p0.b);
       }
       return;
    }
    public final void j0(o p0){
       ViewGroup parent;
       o b = p0.b;
       if (b.getVisibility() == 8) {
          return;
       }
       p0.a.put("android:changeTransform:parent", b.getParent());
       p0.a.put("android:changeTransform:transforms", new ChangeTransform$f(b));
       Matrix matrix = b.getMatrix();
       Matrix matrix1 = (matrix == null || matrix.isIdentity())? null: new Matrix(matrix);
       p0.a.put("android:changeTransform:matrix", matrix1);
       if (this.M != null) {
          matrix = new Matrix();
          parent = b.getParent();
          w.k(parent, matrix);
          matrix.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
          p0.a.put("android:changeTransform:parentMatrix", matrix);
          p0.a.put("android:changeTransform:intermediateMatrix", b.getTag(R.id.transition_transform));
          p0.a.put("android:changeTransform:intermediateParentMatrix", b.getTag(R.id.parent_matrix));
       }
       return;
    }
    public final void k0(ViewGroup p0,o p1,o p2){
       o b = p2.b;
       Matrix matrix = new Matrix(p2.a.get("android:changeTransform:parentMatrix"));
       w.l(p0, matrix);
       d uod = f.a(b, p0, matrix);
       if (uod == null) {
          return;
       }
       uod.a(p1.a.get("android:changeTransform:parent"), p1.b);
       Transition transition = this;
       Transition s = transition.s;
       while (s != null) {
          transition = s;
       }
       transition.a(new ChangeTransform$d(b, uod));
       if (ChangeTransform.R) {
          o b1 = p1.b;
          if (b1 != p2.b) {
             w.i(b1, 0);
          }
          w.i(b, 0x3f800000);
       }
       return;
    }
    public final ObjectAnimator l0(o p0,o p1,boolean p2){
       Matrix matrix = p0.a.get("android:changeTransform:matrix");
       Matrix matrix1 = p1.a.get("android:changeTransform:matrix");
       if (matrix == null) {
          matrix = h.a;
       }
       if (matrix1 == null) {
          matrix1 = h.a;
       }
       Matrix matrix2 = matrix1;
       if (matrix.equals(matrix2)) {
          return null;
       }else {
          o b = p1.b;
          ChangeTransform.n0(b);
          float[] uofloatArray = new float[9];
          matrix.getValues(uofloatArray);
          float[] uofloatArray1 = new float[9];
          matrix2.getValues(uofloatArray1);
          ChangeTransform$e uoe = new ChangeTransform$e(b, uofloatArray);
          float[] uofloatArray2 = new float[9];
          float[][] uofloatArray3 = new float[][2]{uofloatArray,uofloatArray1};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[2];
          propertyValu[0] = PropertyValuesHolder.ofObject(ChangeTransform.P, new c(uofloatArray2), uofloatArray3);
          propertyValu[1] = j.a(ChangeTransform.Q, this.x().a(uofloatArray[2], uofloatArray[5], uofloatArray1[2], uofloatArray1[5]));
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uoe, propertyValu);
          ChangeTransform$c uoc = new ChangeTransform$c(this, p2, matrix2, b, p1.a.get("android:changeTransform:transforms"), uoe);
          objectAnimat.addListener(propertyValu);
          a.a(objectAnimat, propertyValu);
          return objectAnimat;
       }
    }
    public final boolean m0(ViewGroup p0,ViewGroup p1){
       boolean b = true;
       boolean b1 = false;
       if (!this.J(p0) || !this.J(p1)) {
          if (p0 != p1) {
          label_001d :
             b = 0;
          }
       }else {
          o oo = this.v(p0, b);
          if (oo != null) {
             if (p1 != oo.b) {
             }
          }else {
          label_001f :
             return b1;
          }
       }
       b1 = b;
       goto label_001f ;
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       if (p1 != null && p2 != null) {
          String str = "android:changeTransform:parent";
          if (p1.a.containsKey(str) && p2.a.containsKey(str)) {
             ViewGroup viewGroup = p1.a.get(str);
             ViewGroup viewGroup1 = p2.a.get(str);
             boolean b = (this.M != null && !this.m0(viewGroup, viewGroup1))? true: false;
             Matrix matrix = p1.a.get("android:changeTransform:intermediateMatrix");
             if (matrix != null) {
                p1.a.put("android:changeTransform:matrix", matrix);
             }
             matrix = p1.a.get("android:changeTransform:intermediateParentMatrix");
             if (matrix != null) {
                p1.a.put("android:changeTransform:parentMatrix", matrix);
             }
             if (b) {
                this.o0(p1, p2);
             }
             ObjectAnimator objectAnimat = this.l0(p1, p2, b);
             if (b && (objectAnimat != null && this.L != null)) {
                this.k0(p0, p1, p2);
             }else if(!ChangeTransform.R){
                viewGroup.endViewTransition(p1.b);
             }
             return objectAnimat;
          }
       }
       return null;
    }
    public final void o0(o p0,o p1){
       Matrix matrix = p1.a.get("android:changeTransform:parentMatrix");
       p1.b.setTag(R.id.parent_matrix, matrix);
       ChangeTransform tN = this.N;
       tN.reset();
       matrix.invert(tN);
       matrix = p0.a.get("android:changeTransform:matrix");
       if (matrix == null) {
          matrix = new Matrix();
          p0.a.put("android:changeTransform:matrix", matrix);
       }
       matrix.postConcat(p0.a.get("android:changeTransform:parentMatrix"));
       matrix.postConcat(tN);
       return;
    }
}
