package e3.y;
import e3.x;
import android.view.View;
import android.graphics.Matrix;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.IllegalAccessException;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.String;

public class y extends x	// class@001ef9
{
    public static Method h;
    public static boolean i;
    public static Method j;
    public static boolean k;
    public static Method l;
    public static boolean m;

    public void y(){
       super();
    }
    public void e(View p0,Matrix p1){
       this.l();
       Method l = y.l;
       if (l != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p1;
             l.invoke(p0, objArray);
          }catch(java.lang.reflect.InvocationTargetException e0){
          }catch(java.lang.IllegalAccessException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public void h(View p0,Matrix p1){
       this.m();
       Method h = y.h;
       if (h != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p1;
             h.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public void i(View p0,Matrix p1){
       this.n();
       Method j = y.j;
       if (j != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p1;
             j.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public final void l(){
       if (!y.m) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Matrix.class;
             Method declaredMeth = View.class.getDeclaredMethod("setAnimationMatrix", uClassArray);
             y.l = declaredMeth;
             declaredMeth.setAccessible(i);
             y.m = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public final void m(){
       if (!y.i) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Matrix.class;
             Method declaredMeth = View.class.getDeclaredMethod("transformMatrixToGlobal", uClassArray);
             y.h = declaredMeth;
             declaredMeth.setAccessible(i);
             y.i = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public final void n(){
       if (!y.k) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Matrix.class;
             Method declaredMeth = View.class.getDeclaredMethod("transformMatrixToLocal", uClassArray);
             y.j = declaredMeth;
             declaredMeth.setAccessible(i);
             y.k = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
