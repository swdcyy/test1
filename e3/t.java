package e3.t;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;

public class t	// class@001ef2
{
    public static Method a;
    public static boolean b;

    public static void a(){
       if (!t.b) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Boolean.TYPE;
             Method declaredMeth = ViewGroup.class.getDeclaredMethod("suppressLayout", uClassArray);
             t.a = declaredMeth;
             declaredMeth.setAccessible(i);
             t.b = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static void b(ViewGroup p0,boolean p1){
       try{
          t.a();
          Method a = t.a;
          if (a != null) {
             int i = 1;
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.valueOf(p1);
             a.invoke(p0, objArray);
          }
       label_0014 :
          return;
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
}
