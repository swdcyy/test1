package e3.x;
import e3.a0;
import android.view.View;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Float;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.String;

public class x extends a0	// class@001ef8
{
    public static Method d;
    public static boolean e;
    public static Method f;
    public static boolean g;

    public void x(){
       super();
    }
    public void a(View p0){
    }
    public float c(View p0){
       this.j();
       Method f = x.f;
       if (f == null) {
          return super.c(p0);
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          return f.invoke(p0, objArray).floatValue();
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw new RuntimeException(e3.getCause());
       }
    }
    public void d(View p0){
    }
    public void g(View p0,float p1){
       this.k();
       Method d = x.d;
       if (d != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = Float.valueOf(p1);
             d.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }else {
          p0.setAlpha(p1);
       }
       return;
    }
    public final void j(){
       if (!x.g) {
          boolean b = true;
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = View.class.getDeclaredMethod("getTransitionAlpha", uClassArray);
             x.f = declaredMeth;
             declaredMeth.setAccessible(b);
             x.g = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public final void k(){
       if (!x.e) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Float.TYPE;
             Method declaredMeth = View.class.getDeclaredMethod("setTransitionAlpha", uClassArray);
             x.d = declaredMeth;
             declaredMeth.setAccessible(i);
             x.e = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
