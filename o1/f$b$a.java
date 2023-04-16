package o1.f$b$a;
import java.lang.Object;
import android.content.res.Resources$Theme;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;

public class f$b$a	// class@002742
{
    public static final Object a;
    public static Method b;
    public static boolean c;

    static {
       f$b$a.a = new Object();
    }
    public static void a(Resources$Theme p0){
       Method b1;
       Object[] objArray;
       Object a = f$b$a.a;
       _monitor_enter(a);
       int i = 0;
       if (!f$b$a.c) {
          boolean b = true;
          try{
             Class[] uClassArray = new Class[i];
             Method declaredMeth = Resources$Theme.class.getDeclaredMethod("rebase", uClassArray);
             f$b$a.b = declaredMeth;
             declaredMeth.setAccessible(b);
             f$b$a.c = b;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
}
