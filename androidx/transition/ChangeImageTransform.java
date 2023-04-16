package androidx.transition.ChangeImageTransform;
import androidx.transition.Transition;
import java.lang.String;
import androidx.transition.ChangeImageTransform$a;
import androidx.transition.ChangeImageTransform$b;
import android.graphics.Matrix;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import androidx.transition.ChangeImageTransform$c;
import android.widget.ImageView$ScaleType;
import e3.o;
import android.view.View;
import android.graphics.Rect;
import java.lang.Object;
import java.util.Map;
import android.animation.ObjectAnimator;
import androidx.transition.f$a;
import android.util.Property;
import android.animation.TypeEvaluator;
import android.view.ViewGroup;
import android.animation.Animator;
import e3.h;

public class ChangeImageTransform extends Transition	// class@0009b4
{
    public static final String[] L;
    public static final TypeEvaluator M;
    public static final Property N;

    static {
       String[] stringArray = new String[]{"android:changeImageTransform:matrix","android:changeImageTransform:bounds"};
       ChangeImageTransform.L = stringArray;
       ChangeImageTransform.M = new ChangeImageTransform$a();
       ChangeImageTransform.N = new ChangeImageTransform$b(Matrix.class, "animatedTransform");
    }
    public void ChangeImageTransform(){
       super();
    }
    public void ChangeImageTransform(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public static Matrix k0(ImageView p0){
       Drawable drawable = p0.getDrawable();
       float f = (float)p0.getWidth();
       float f1 = (float)drawable.getIntrinsicWidth();
       float f2 = (float)p0.getHeight();
       float f3 = (float)drawable.getIntrinsicHeight();
       float f4 = Math.max((f / f1), (f2 / f3));
       Matrix matrix = new Matrix();
       matrix.postScale(f4, f4);
       matrix.postTranslate((float)Math.round(((f - (f1 * f4)) / 2.00f)), (float)Math.round(((f2 - (f3 * f4)) / 2.00f)));
       return matrix;
    }
    public static Matrix l0(ImageView p0){
       Drawable drawable = p0.getDrawable();
       if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
          int i = ChangeImageTransform$c.a[p0.getScaleType().ordinal()];
          if (i != 1) {
             if (i == 2) {
                return ChangeImageTransform.k0(p0);
             }
          }else {
             return ChangeImageTransform.o0(p0);
          }
       }
       return new Matrix(p0.getImageMatrix());
    }
    public static Matrix o0(ImageView p0){
       Drawable drawable = p0.getDrawable();
       Matrix matrix = new Matrix();
       matrix.postScale(((float)p0.getWidth() / (float)drawable.getIntrinsicWidth()), ((float)p0.getHeight() / (float)drawable.getIntrinsicHeight()));
       return matrix;
    }
    public String[] F(){
       return ChangeImageTransform.L;
    }
    public void g(o p0){
       this.j0(p0);
    }
    public void j(o p0){
       this.j0(p0);
    }
    public final void j0(o p0){
       o b = p0.b;
       if (b instanceof ImageView && !b.getVisibility()) {
          o oo = b;
          if (oo.getDrawable() == null) {
             return;
          }else {
             p0 = p0.a;
             p0.put("android:changeImageTransform:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
             p0.put("android:changeImageTransform:matrix", ChangeImageTransform.l0(oo));
          }
       }
       return;
    }
    public final ObjectAnimator m0(ImageView p0,Matrix p1,Matrix p2){
       Matrix[] matrixArray = new Matrix[]{p1,p2};
       return ObjectAnimator.ofObject(p0, ChangeImageTransform.N, new f$a(), matrixArray);
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       Animator uAnimator = null;
       if (p1 != null && p2 != null) {
          Rect rect = p1.a.get("android:changeImageTransform:bounds");
          Rect rect1 = p2.a.get("android:changeImageTransform:bounds");
          if (rect != null && rect1 != null) {
             Matrix matrix = p1.a.get("android:changeImageTransform:matrix");
             Matrix matrix1 = p2.a.get("android:changeImageTransform:matrix");
             int i = (matrix != null || (matrix1 == null || (matrix != null && matrix.equals(matrix1))))? 1: 0;
             if (rect.equals(rect1) && i) {
                return uAnimator;
             }else {
                o b = p2.b;
                Drawable drawable = b.getDrawable();
                int intrinsicWid = drawable.getIntrinsicWidth();
                int intrinsicHei = drawable.getIntrinsicHeight();
                if (intrinsicWid <= 0 || intrinsicHei <= 0) {
                   uAnimator = this.n0(b);
                }else if(matrix == null){
                   matrix = h.a;
                }
                if (matrix1 == null) {
                   matrix1 = h.a;
                }
                ChangeImageTransform.N.set(b, matrix);
                uAnimator = this.m0(b, matrix, matrix1);
             }
          }
       }
       return uAnimator;
    }
    public final ObjectAnimator n0(ImageView p0){
       Matrix a;
       Matrix[] matrixArray = new Matrix[]{a,a};
       a = h.a;
       return ObjectAnimator.ofObject(p0, ChangeImageTransform.N, ChangeImageTransform.M, matrixArray);
    }
}
