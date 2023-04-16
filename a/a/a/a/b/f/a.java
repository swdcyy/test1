package a.a.a.a.b.f.a;
import a.a.a.a.b.f.a$a;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.Integer;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import a.a.a.a.b.a.c;
import android.os.Build$VERSION;

public class a	// class@00001b
{
    public static a$a a;

    public static a$a a(){
       Class[] uClassArray;
       Object[] objArray;
       Object obj1;
       a$a a = a.a;
       if (a != null) {
          return a;
       }
       Object obj = null;
       int i = 0;
       if (!a.c()) {
          uClassArray = new Class[i];
          objArray = new Object[i];
          obj1 = Class.forName("dalvik.system.VMRuntime").getMethod("getRuntime", uClassArray).invoke(obj, objArray);
          Class[] uClassArray1 = new Class[i];
          Object[] objArray1 = new Object[i];
          a = (obj1.getClass().getDeclaredMethod("is64Bit", uClassArray1).invoke(obj1, objArray1).booleanValue())? a$a.c: a$a.b;
          a.a = a;
          return a;
       }else {
          uClassArray = new Class[i];
          objArray = new Object[i];
          obj1 = Class.forName("sun.misc.Unsafe").getMethod("getUnsafe", uClassArray).invoke(obj, objArray);
          uClassArray = new Class[i];
          Object[] objArray2 = new Object[i];
          a = (obj1.getClass().getDeclaredMethod("addressSize", uClassArray).invoke(obj1, objArray2).intValue() == 8)? a$a.c: a$a.b;
          a.a = a;
          return a;
       }
    }
    public static String b(){
       a$a uoa = a.a();
       if (uoa == a$a.c) {
          return c.Q;
       }
       if (uoa == a$a.b) {
          return c.P;
       }
       return "";
    }
    public static boolean c(){
       boolean b = (m$e.c() && Build$VERSION.SDK_INT == 28)? true: false;
       return b;
    }
}
