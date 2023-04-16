package s7.a;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import android.app.Application;

public class a	// class@0023f1
{
    public static Context a;

    public static Context a(){
       Context a = a.a;
       if (a != null) {
          return a.getApplicationContext();
       }
       Class uClass = Class.forName("android.app.ActivityThread");
       Class[] uClassArray = new Class[0];
       Method declaredMeth = uClass.getDeclaredMethod("currentActivityThread", uClassArray);
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[0];
       Class[] uClassArray1 = new Class[0];
       Method declaredMeth1 = uClass.getDeclaredMethod("getApplication", uClassArray1);
       declaredMeth1.setAccessible(true);
       Object[] objArray1 = new Object[0];
       Context applicationC = declaredMeth1.invoke(declaredMeth.invoke(null, objArray), objArray1).getApplicationContext();
       a.a = applicationC;
       return applicationC.getApplicationContext();
    }
    public static void b(Context p0){
       a.a = p0;
    }
}
