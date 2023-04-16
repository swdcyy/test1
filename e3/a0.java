package e3.a0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Float;
import android.graphics.Matrix;
import java.lang.Math;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import android.view.ViewParent;

public class a0	// class@001eda
{
    public float[] a;
    public static Method b;
    public static boolean c;

    public void a0(){
       super();
    }
    public void a(View p0){
       if (!p0.getVisibility()) {
          p0.setTag(R.id.save_non_transition_alpha, null);
       }
       return;
    }
    public final void b(){
       Class tYPE;
       if (!a0.c) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[]{tYPE,tYPE,tYPE,tYPE};
             tYPE = Integer.TYPE;
             Method declaredMeth = View.class.getDeclaredMethod("setFrame", uClassArray);
             a0.b = declaredMeth;
             declaredMeth.setAccessible(i);
             a0.c = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public float c(View p0){
       Float tag = p0.getTag(R.id.save_non_transition_alpha);
       if (tag != null) {
          return (p0.getAlpha() / tag.floatValue());
       }
       return p0.getAlpha();
    }
    public void d(View p0){
       if (p0.getTag(0x7f0a36fc) == null) {
          p0.setTag(R.id.save_non_transition_alpha, Float.valueOf(p0.getAlpha()));
       }
       return;
    }
    public void e(View p0,Matrix p1){
       float f = 0x3f800000;
       int i = 2;
       if (p1 == null || p1.isIdentity()) {
          p0.setPivotX((float)(p0.getWidth() / i));
          p0.setPivotY((float)(p0.getHeight() / i));
          p0.setTranslationX(0);
          p0.setTranslationY(0);
          p0.setScaleX(f);
          p0.setScaleY(f);
          p0.setRotation(0);
       }else {
          a0 ta = this.a;
          if (ta == null) {
             ta = new float[9];
             this.a = ta;
          }
          p1.getValues(ta);
          int i1 = ta[3];
          f = (float)Math.sqrt((double)(f - (i1 * i1)));
          int i2 = 0;
          int i3 = (ta[i2] < 0)? -1: 1;
          f = f * (float)i3;
          float f1 = ta[i2] / f;
          float f2 = ta[4] / f;
          p0.setPivotX(0);
          p0.setPivotY(0);
          p0.setTranslationX(ta[i]);
          p0.setTranslationY(ta[5]);
          p0.setRotation((float)Math.toDegrees(Math.atan2((double)i1, (double)f)));
          p0.setScaleX(f1);
          p0.setScaleY(f2);
       }
       return;
    }
    public void f(View p0,int p1,int p2,int p3,int p4){
       this.b();
       Method b = a0.b;
       if (b != null) {
          int i = 4;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(p1);
             objArray[1] = Integer.valueOf(p2);
             objArray[2] = Integer.valueOf(p3);
             objArray[3] = Integer.valueOf(p4);
             b.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public void g(View p0,float p1){
       Float tag = p0.getTag(R.id.save_non_transition_alpha);
       if (tag != null) {
          p0.setAlpha((tag.floatValue() * p1));
       }else {
          p0.setAlpha(p1);
       }
       return;
    }
    public void h(View p0,Matrix p1){
       ViewParent parent = p0.getParent();
       if (parent instanceof View) {
          this.h(parent, p1);
          p1.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
       }
       p1.preTranslate((float)p0.getLeft(), (float)p0.getTop());
       Matrix matrix = p0.getMatrix();
       if (!matrix.isIdentity()) {
          p1.preConcat(matrix);
       }
       return;
    }
    public void i(View p0,Matrix p1){
       ViewParent parent = p0.getParent();
       if (parent instanceof View) {
          this.i(parent, p1);
          p1.postTranslate((float)parent.getScrollX(), (float)parent.getScrollY());
       }
       p1.postTranslate((float)(- p0.getLeft()), (float)(- p0.getTop()));
       Matrix matrix = p0.getMatrix();
       if (!matrix.isIdentity()) {
          Matrix matrix1 = new Matrix();
          if (matrix.invert(matrix1)) {
             p1.postConcat(matrix1);
          }
       }
       return;
    }
}
