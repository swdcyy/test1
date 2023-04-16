package com.kwai.performance.stability.crash.monitor.excluded.c;
import sg7.d;
import sg7.b;
import com.kwai.performance.stability.crash.monitor.excluded.c$b;
import com.kwai.performance.stability.crash.monitor.excluded.c$a;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Thread;
import java.lang.ClassLoader;
import com.kwai.performance.stability.crash.monitor.excluded.c$c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class c extends d	// class@0011d9
{
    public boolean f;
    public static c$a g;

    public void c(b p0){
       super(p0);
       this.f = false;
    }
    public static c$b e(){
       return new c$b();
    }
    public static void f(c$a p0){
       c.g = p0;
    }
    public boolean a(){
       boolean b = false;
       if (this.f != null) {
          return b;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29 && ("vivo").equals((Build.MANUFACTURER).toLowerCase(Locale.US))) {
          return b;
       }
       if (sDK_INT > 28) {
          b = true;
       }
       return b;
    }
    public boolean b(Exception p0){
       return false;
    }
    public void d(){
       if (this.a()) {
          return;
       }
       Object[] objArray = new Object[0];
       Field declaredFiel = Class.forName("android.view.WindowManagerGlobal").getDeclaredField("sWindowSession");
       declaredFiel.setAccessible(true);
       Class[] uClassArray = new Class[true];
       uClassArray[0] = Class.forName("android.view.IWindowSession");
       declaredFiel.set(null, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), uClassArray, new c$c(g.b("android.view.WindowManagerGlobal", "getWindowSession", objArray))));
       return;
    }
}
