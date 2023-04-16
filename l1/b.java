package l1.b;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.String;
import android.app.Activity;
import android.os.IBinder;
import java.lang.Boolean;
import java.util.List;
import java.lang.Integer;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import java.lang.Object;
import l1.b$c;
import java.lang.Runnable;
import android.app.Application;
import l1.b$d;
import android.app.Application$ActivityLifecycleCallbacks;
import l1.b$a;
import l1.b$b;

public final class b	// class@0024f0
{
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    static {
       b.g = new Handler(Looper.getMainLooper());
       Class uClass = b.a();
       b.a = uClass;
       b.b = b.b();
       b.c = b.f();
       b.d = b.d(uClass);
       b.e = b.c(uClass);
       b.f = b.e(uClass);
    }
    public static Class a(){
       return Class.forName("android.app.ActivityThread");
    }
    public static Field b(){
       Field declaredFiel = Activity.class.getDeclaredField("mMainThread");
       declaredFiel.setAccessible(true);
       return declaredFiel;
    }
    public static Method c(Class p0){
       if (p0 == null) {
          return null;
       }
       Class[] uClassArray = new Class[]{IBinder.class,Boolean.TYPE};
       Method declaredMeth = p0.getDeclaredMethod("performStopActivity", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
    public static Method d(Class p0){
       if (p0 == null) {
          return null;
       }
       Class[] uClassArray = new Class[]{IBinder.class,Boolean.TYPE,String.class};
       Method declaredMeth = p0.getDeclaredMethod("performStopActivity", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
    public static Method e(Class p0){
       if (!b.g() || p0 == null) {
          return null;
       }
       Class[] uClassArray = new Class[9];
       uClassArray[0] = IBinder.class;
       uClassArray[1] = List.class;
       uClassArray[2] = List.class;
       uClassArray[3] = Integer.TYPE;
       Class tYPE = Boolean.TYPE;
       uClassArray[4] = tYPE;
       uClassArray[5] = Configuration.class;
       uClassArray[6] = Configuration.class;
       uClassArray[7] = tYPE;
       uClassArray[8] = tYPE;
       Method declaredMeth = p0.getDeclaredMethod("requestRelaunchActivity", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
    public static Field f(){
       Field declaredFiel = Activity.class.getDeclaredField("mToken");
       declaredFiel.setAccessible(true);
       return declaredFiel;
    }
    public static boolean g(){
       boolean sDK_INT = Build$VERSION.SDK_INT;
       sDK_INT = (sDK_INT == 26 || sDK_INT == 27)? true: false;
       return sDK_INT;
    }
    public static boolean h(Object p0,int p1,Activity p2){
       Object obj = b.c.get(p2);
       if (obj != p0 || p2.hashCode() != p1) {
          return false;
       }
       b.g.postAtFrontOfQueue(new b$c(b.b.get(p2), obj));
       return true;
    }
    public static boolean i(Activity p0){
       if (Build$VERSION.SDK_INT >= 28) {
          p0.recreate();
          return true;
       }else if(b.g() && b.f == null){
          return false;
       }else if(b.e == null && b.d == null){
          return false;
       }else {
          Object obj = b.c.get(p0);
          if (obj == null) {
             return false;
          }
          Object obj1 = b.b.get(p0);
          if (obj1 == null) {
             return false;
          }
          Application application = p0.getApplication();
          b$d uod = new b$d(p0);
          application.registerActivityLifecycleCallbacks(uod);
          Handler g = b.g;
          g.post(new b$a(uod, obj));
          if (b.g()) {
             Object[] objArray = new Object[9];
             objArray[0] = obj;
             objArray[1] = null;
             objArray[2] = null;
             objArray[3] = Integer.valueOf(false);
             Boolean fALSE = Boolean.FALSE;
             objArray[4] = fALSE;
             objArray[5] = null;
             objArray[6] = null;
             objArray[7] = fALSE;
             objArray[8] = fALSE;
             b.f.invoke(obj1, objArray);
          }else {
             p0.recreate();
          }
          g.post(new b$b(application, uod));
          return true;
       }
    }
}
