package e3.a;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalStateException;

public class a	// class@001edb
{
    public static Method a;
    public static Method b;
    public static boolean c;

    public static void a(Canvas p0,boolean p1){
       Method a;
       Object[] objArray;
       Method b1;
       Object[] objArray1;
       if (Build$VERSION.SDK_INT >= 28) {
          throw new IllegalStateException("This method doesn\'t work on Pie!");
       }
       if (!a.c) {
          boolean b = true;
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = Canvas.class.getDeclaredMethod("insertReorderBarrier", uClassArray);
             a.a = declaredMeth;
             declaredMeth.setAccessible(b);
             uClassArray = new Class[0];
             declaredMeth = Canvas.class.getDeclaredMethod("insertInorderBarrier", uClassArray);
             a.b = declaredMeth;
             declaredMeth.setAccessible(b);
             a.c = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
