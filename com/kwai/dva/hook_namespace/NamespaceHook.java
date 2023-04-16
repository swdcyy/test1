package com.kwai.dva.hook_namespace.NamespaceHook;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ClassLoader;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.util.b;
import android.os.Build$VERSION;
import java.lang.System;

public class NamespaceHook	// class@000d26
{
    public static boolean a = true;

    public void NamespaceHook(){
       super();
    }
    public static void a(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NamespaceHook.class, "3")) {
          return;
       }
       NamespaceHook.addSoArrayThatLoadedByTargetNamespace(p0);
       return;
    }
    public static native void addSoArrayThatLoadedByTargetNamespace(String[] p0);
    public static String b(ClassLoader p0,ClassLoader p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, NamespaceHook.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[0];
       return NamespaceHook.linkToHostNamespace(Build$VERSION.SDK_INT, p0, p1, b.a(p0, "getLdLibraryPath", obj));
    }
    public static String c(){
       String obj = PatchProxy.apply(null, null, NamespaceHook.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NamespaceHook.replaceToTargetNamespace(Build$VERSION.SDK_INT, "dva-nativeempty");
       if (obj != null && !obj.isEmpty()) {
          return obj;
       }
       if (NamespaceHook.a) {
          System.loadLibrary("dva-nativeempty");
          if (!NamespaceHook.targetNamespaceFound()) {
             return "host namespace not found.";
          }
       }
       return "";
    }
    public static native String linkToHostNamespace(int p0,ClassLoader p1,ClassLoader p2,String p3);
    public static native String replaceToTargetNamespace(int p0,String p1);
    public static native boolean targetNamespaceFound();
}
