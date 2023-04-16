package com.kwai.performance.stability.crash.monitor.excluded.b;
import sg7.d;
import sg7.b;
import sg7.a;
import com.kwai.performance.stability.crash.monitor.excluded.b$a;
import java.lang.Exception;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.util.g;
import android.app.ActivityManager;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.ClassLoader;
import com.kwai.performance.stability.crash.monitor.excluded.b$b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class b extends d	// class@0011d5
{

    public void b(b p0){
       super(p0);
    }
    public static a e(){
       return new b$a();
    }
    public boolean b(Exception p0){
       return false;
    }
    public void d(){
       if (this.a()) {
          return;
       }
       String str = null;
       try{
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 24 && sDK_INT <= 25) {
             str = g.h("android.app.ActivityManagerNative", "gDefault");
          }else if(sDK_INT >= 26 && sDK_INT <= 28){
             str = g.g(ActivityManager.class, "IActivityManagerSingleton");
          }
          if (str == null) {
             return;
          }else {
             Class superclass = str.getClass().getSuperclass();
             if (superclass == null) {
                return;
             }else {
                Field declaredFiel = superclass.getDeclaredField("mInstance");
                declaredFiel.setAccessible(true);
                Class uClass = Class.forName("android.app.IActivityManager");
                Class[] uClassArray = new Class[true];
                uClassArray[0] = uClass;
                declaredFiel.set(str, Proxy.newProxyInstance(uClass.getClassLoader(), uClassArray, new b$b(declaredFiel.get(str))));
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
