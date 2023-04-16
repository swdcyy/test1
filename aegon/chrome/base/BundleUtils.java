package aegon.chrome.base.BundleUtils;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import android.content.Context;
import java.lang.String;
import android.os.Build$VERSION;
import b0.c;
import java.lang.ClassLoader;
import a0.f;
import java.lang.Class;
import android.content.pm.ApplicationInfo;
import java.util.Arrays;
import dalvik.system.PathClassLoader;
import java.lang.StringBuilder;
import e0.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.Field;
import java.lang.System;
import android.content.ContextWrapper;
import android.app.Application;
import java.util.List;
import h0.a;
import a0.s;
import dalvik.system.BaseDexClassLoader;
import aegon.chrome.base.h;
import java.lang.Boolean;

public final class BundleUtils	// class@000130
{
    public static Boolean a;
    public static final Object b;
    public static final SimpleArrayMap c;
    public static final boolean d;

    static {
       BundleUtils.b = new Object();
       BundleUtils.c = new SimpleArrayMap();
    }
    public void BundleUtils(){
       super();
    }
    public static Context a(Context p0,String p1){
       SimpleArrayMap c;
       if (Build$VERSION.SDK_INT < 26) {
          return p0;
       }
       try{
          if (BundleUtils.d(p0)) {
             p0 = c.a(p0, p1);
          }else {
             Object obj = BundleUtils.c();
             _monitor_enter(obj);
             p0 = c.a(p0, p1);
             _monitor_exit(obj);
          }
          ClassLoader parent = p0.getClassLoader().getParent();
          Context uContext = f.a();
          boolean b = true;
          StringBuilder str = (BundleUtils.f() && (!parent.equals(BundleUtils.class.getClassLoader()) && (uContext != null && !parent.equals(uContext.getClassLoader()))))? 1: null;
          c = BundleUtils.c;
          _monitor_enter(c);
          if (str && !c.containsKey(p1)) {
             c.put(p1, new PathClassLoader(p0.getApplicationInfo().splitSourceDirs[Arrays.binarySearch(c.b(p0.getApplicationInfo()), p1)], uContext.getClassLoader()));
          }
          ClassLoader uClassLoader = c.get(p1);
          if (uClassLoader != null) {
             if (!uClassLoader.equals(p0.getClassLoader())) {
                BundleUtils.g(p0, uClassLoader);
             label_0093 :
                _monitor_exit(c);
                try{
                   c.a("Android.IsolatedSplits.ClassLoaderReplaced."+p1, b);
                   return p0;
                }catch(android.content.pm.PackageManager$NameNotFoundException e7){
                   throw new RuntimeException(e7);
                }
             }
          }else {
             c.put(p1, p0.getClassLoader());
          }
          b = str;
          goto label_0093 ;
       }catch(android.content.pm.PackageManager$NameNotFoundException e7){
       }
    }
    public static String b(String p0,String p1){
       String str = null;
       if (Build$VERSION.SDK_INT < 26) {
          return str;
       }
       ApplicationInfo applicationI = f.a().getApplicationInfo();
       String[] stringArray = c.b(applicationI);
       if (stringArray == null) {
          return str;
       }
       int i = Arrays.binarySearch(stringArray, p1);
       if (i < 0) {
          return str;
       }
       try{
          return applicationI.splitSourceDirs[i]+"!/lib/"+applicationI.getClass().getField("primaryCpuAbi").get(applicationI)+"/"+System.mapLibraryName(p0);
       }catch(java.lang.ReflectiveOperationException e3){
          throw new RuntimeException(e3);
       }
    }
    public static Object c(){
       return BundleUtils.b;
    }
    public static boolean d(Context p0){
       while (true) {
          if (!p0 instanceof ContextWrapper) {
             return false;
          }
          if (p0 instanceof Application) {
             break ;
          }else {
             p0 = p0.getBaseContext();
          }
       }
       return true;
    }
    public static boolean e(Context p0,String p1){
       boolean b = false;
       if (Build$VERSION.SDK_INT < 26) {
          return b;
       }
       String[] stringArray = c.b(p0.getApplicationInfo());
       if (stringArray != null && Arrays.asList(stringArray).contains(p1)) {
          b = true;
       }
       return b;
    }
    public static boolean f(){
       return a.j;
    }
    public static void g(Context p0,ClassLoader p1){
       while (p0 instanceof ContextWrapper) {
          p0 = p0.getBaseContext();
       }
       try{
          Field declaredFiel = p0.getClass().getDeclaredField("mClassLoader");
          declaredFiel.setAccessible(true);
          declaredFiel.set(p0, p1);
          return;
       }catch(java.lang.ReflectiveOperationException e2){
          throw new RuntimeException("Error setting ClassLoader.", e2);
       }
    }
    public static String getNativeLibraryPath(String p0,String p1){
       s os = s.a();
       String str = BundleUtils.class.getClassLoader().findLibrary(p0);
       if (str != null) {
          os.close();
          return str;
       }else {
          ClassLoader classLoader = f.a().getClassLoader();
          if (classLoader instanceof BaseDexClassLoader) {
             str = classLoader.findLibrary(p0);
          }else if(classLoader instanceof h){
             str = classLoader.findLibrary(p0);
          }
          if (str != null) {
             os.close();
             return str;
          }else {
             os.close();
             return BundleUtils.b(p0, p1);
          }
       }
    }
    public static boolean isBundleForNative(){
       boolean b = (!a.g)? false: BundleUtils.a.booleanValue();
       return b;
    }
}
