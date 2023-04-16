package com.kuaishou.webkit.WebViewFactory$PackageDexClassLoaderEx;
import dalvik.system.DexClassLoader;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;

public class WebViewFactory$PackageDexClassLoaderEx extends DexClassLoader	// class@001297
{

    public void WebViewFactory$PackageDexClassLoaderEx(String p0,String p1,String p2,ClassLoader p3){
       super(p0, p1, p2, p3);
    }
    public Class loadClass(String p0,boolean p1){
       if (p0.startsWith("com.kuaishou.webkit")) {
          return super.loadClass(p0, p1);
       }
       try{
          return this.findClass(p0);
       }catch(java.lang.Exception e0){
          return super.loadClass(p0, p1);
       }
    }
}
