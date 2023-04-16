package e3.z;
import e3.y;
import android.view.View;
import java.lang.Object;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.String;

public class z extends y	// class@001efa
{
    public static Method n;
    public static boolean o;

    public void z(){
       super();
    }
    public void f(View p0,int p1,int p2,int p3,int p4){
       this.o();
       Method n = z.n;
       if (n != null) {
          int i = 4;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(p1);
             objArray[1] = Integer.valueOf(p2);
             objArray[2] = Integer.valueOf(p3);
             objArray[3] = Integer.valueOf(p4);
             n.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw new RuntimeException(e4.getCause());
          }
       }
       return;
    }
    public final void o(){
       Class tYPE;
       if (!z.o) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[]{tYPE,tYPE,tYPE,tYPE};
             tYPE = Integer.TYPE;
             Method declaredMeth = View.class.getDeclaredMethod("setLeftTopRightBottom", uClassArray);
             z.n = declaredMeth;
             declaredMeth.setAccessible(i);
             z.o = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
