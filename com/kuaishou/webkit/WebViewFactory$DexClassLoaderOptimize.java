package com.kuaishou.webkit.WebViewFactory$DexClassLoaderOptimize;
import dalvik.system.DexClassLoader;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.Object;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;

public class WebViewFactory$DexClassLoaderOptimize extends DexClassLoader	// class@001295
{

    public void WebViewFactory$DexClassLoaderOptimize(String p0,String p1,ClassLoader p2){
       super("", null, null, p2);
       Class[] uClassArray = new Class[]{ClassLoader.class,String.class,String.class,File.class};
       Constructor declaredCons = Class.forName("dalvik.system.DexPathList").getDeclaredConstructor(uClassArray);
       declaredCons.setAccessible(1);
       Object[] objArray = new Object[]{this,p0,p1,null};
       p0 = declaredCons.newInstance(objArray);
       Field declaredFiel = BaseDexClassLoader.class.getDeclaredField("pathList");
       declaredFiel.setAccessible(1);
       declaredFiel.set(this, p0);
    }
    public void WebViewFactory$DexClassLoaderOptimize(String p0,String p1,String p2,ClassLoader p3){
       super(p0, p1, p2, p3);
    }
    public Class loadClass(String p0,boolean p1){
       int i = (p0.startsWith("java.") || (!p0.startsWith("android.") || (!p0.startsWith("android.support.") || p0.startsWith("com.kuaishou.webkit"))))? 1: 0;
       if (i) {
          return super.loadClass(p0, p1);
       }else {
          try{
             return this.findClass(p0);
          }catch(java.lang.Exception e0){
             return super.loadClass(p0, p1);
          }
       }
    }
}
