package e45.a;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.app.Application;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;

public final class a	// class@00150e
{
    public static final a a;
    public static String b;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final String a(Context p0){
       a.p(p0, "context");
       if (!TextUtils.isEmpty(a.b)) {
          return a.b;
       }
       ActivityManager$RunningAppProcessInfo runningAppPr = null;
       String processName = (Build$VERSION.SDK_INT >= 28)? Application.getProcessName(): runningAppPr;
       a.b = processName;
       if (!TextUtils.isEmpty(processName)) {
          return a.b;
       }else {
          boolean b = false;
          Class[] uClassArray = new Class[b];
          Method declaredMeth = Class.forName("android.app.ActivityThread", b, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[b];
          Object obj = declaredMeth.invoke(runningAppPr, objArray);
          if (obj instanceof String) {
          }else {
             obj = runningAppPr;
          }
          a.b = obj;
          if (!TextUtils.isEmpty(obj)) {
             return a.b;
          }else {
             int i = Process.myPid();
             p0 = p0.getSystemService("activity");
             if (p0 instanceof ActivityManager) {
             }else {
                p0 = runningAppPr;
             }
             if (p0 != null) {
                List runningAppPr1 = p0.getRunningAppProcesses();
                if (runningAppPr1 != null) {
                   Iterator iterator = runningAppPr1.iterator();
                   while (iterator.hasNext()) {
                      ActivityManager$RunningAppProcessInfo runningAppPr2 = iterator.next();
                      if (runningAppPr2.pid == i) {
                         runningAppPr = runningAppPr2.processName;
                         break ;
                      }
                   }
                }
             }
             a.b = runningAppPr;
             return runningAppPr;
          }
       }
    }
}
