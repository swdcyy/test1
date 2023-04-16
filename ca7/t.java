package ca7.t;
import java.lang.String;
import android.app.Application;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.io.Reader;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import android.content.Context;
import android.os.Build$VERSION;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Locale;
import android.os.LocaleList;
import ca7.u;
import ca7.o;
import ca7.k;
import c97.d;
import h97.g;
import vk7.g0;
import android.bluetooth.BluetoothAdapter;
import q97.c;
import android.os.Build;
import tb7.b;

public final class t	// class@0003a8
{
    public static String a;
    public static String b;
    public static String c;
    public static int d;

    public static String a(){
       Object obj = null;
       Class[] uClassArray = new Class[false];
       Method declaredMeth = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[false];
       Object obj1 = declaredMeth.invoke(obj, objArray);
       if (obj1 instanceof String) {
          obj = obj1;
       }
       return obj;
    }
    public static String b(int p0){
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/"+p0+"/cmdline"));
          String str = uBufferedRea.readLine();
          if (!TextUtils.isEmpty(str)) {
             str = str.trim();
          }
          uBufferedRea.close();
          return str;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String c(Context p0){
       if (Build$VERSION.SDK_INT >= 28) {
          String processName = Application.getProcessName();
          if (!TextUtils.isEmpty(processName)) {
             return processName;
          }
       }
       int i = Process.myPid();
       String str = t.b(i);
       if (!TextUtils.isEmpty(str)) {
          return str;
       }else {
          str = t.a();
          if (!TextUtils.isEmpty(str)) {
             return str;
          }else {
             ActivityManager systemServic = p0.getSystemService("activity");
             if (systemServic != null && systemServic.getRunningAppProcesses() != null) {
                Iterator iterator = systemServic.getRunningAppProcesses().iterator();
                while (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
                   if (runningAppPr.pid == i) {
                      runningAppPr = runningAppPr.processName;
                      if (!TextUtils.isEmpty(runningAppPr)) {
                         return runningAppPr;
                      }
                   }
                }
             }
             return null;
          }
       }
    }
    public static Locale d(){
       Locale locale = (Build$VERSION.SDK_INT >= 24)? LocaleList.getDefault().get(0): Locale.getDefault();
       if (locale == null) {
          locale = Locale.ROOT;
       }
       return locale;
    }
    public static String e(Context p0){
       String str = "";
       if (u.c(str) && o.c()) {
          Object[] objArray = new Object[]{"persist.sys.device_name",str};
          str = k.a("android.os.SystemProperties", "get", objArray);
       }
       if (u.c(str) && d.a().b().b()) {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 23 || (!g0.a(p0, "android.permission.BLUETOOTH") || (sDK_INT >= 23 && !p0.checkSelfPermission("android.permission.BLUETOOTH")))) {
             BluetoothAdapter defaultAdapt = BluetoothAdapter.getDefaultAdapter();
             if (defaultAdapt != null) {
                str = defaultAdapt.getName();
             }
          }
       }
       if (u.c(str)) {
          str = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       }
       return str;
    }
    public static boolean f(Context p0){
       return b.i(p0);
    }
}
