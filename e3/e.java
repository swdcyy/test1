package e3.e;
import e3.d;
import android.view.View;
import java.lang.Object;
import android.view.ViewGroup;
import android.graphics.Matrix;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.String;

public class e implements d	// class@001ee2
{
    public final View b;
    public static Class c;
    public static boolean d;
    public static Method e;
    public static boolean f;
    public static Method g;
    public static boolean h;

    public void e(View p0){
       super();
       this.b = p0;
    }
    public static d b(View p0,ViewGroup p1,Matrix p2){
       Method e;
       e.c();
       e = e.e;
       if (e == null) {
          return v1;
       }
       try{
          Object[] objArray = new Object[]{p0,p1,p2};
          return new e(e.invoke(null, objArray));
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new RuntimeException(e5.getCause());
       }
    }
    public static void c(){
       if (!e.f) {
          int i = 1;
          try{
             e.d();
             Class[] uClassArray = new Class[]{View.class,ViewGroup.class,Matrix.class};
             Method declaredMeth = e.c.getDeclaredMethod("addGhost", uClassArray);
             e.e = declaredMeth;
             declaredMeth.setAccessible(i);
             e.f = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static void d(){
       if (!e.d) {
          try{
             e.c = Class.forName("android.view.GhostView");
             e.d = true;
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
    }
    public static void e(){
       if (!e.h) {
          int i = 1;
          try{
             e.d();
             Class[] uClassArray = new Class[i];
             uClassArray[0] = View.class;
             Method declaredMeth = e.c.getDeclaredMethod("removeGhost", uClassArray);
             e.g = declaredMeth;
             declaredMeth.setAccessible(i);
             e.h = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static void f(View p0){
       e.e();
       Method g = e.g;
       if (g != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             g.invoke(null, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public void a(ViewGroup p0,View p1){
    }
    public void setVisibility(int p0){
       this.b.setVisibility(p0);
    }
}
