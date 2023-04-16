package com.google.common.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.ClassLoader;
import java.lang.IllegalArgumentException;
import ok.n;
import java.lang.RuntimeException;
import java.lang.Error;

public final class b	// class@001736
{
    public static final Object a;
    public static final Method b;
    public static final Method c;

    static {
       Method method1;
       Class[] uClassArray;
       Method obj = b.a();
       b.a = obj;
       int i = 1;
       Method method = null;
       if (obj == null) {
          method1 = method;
       }else {
          uClassArray = new Class[]{Throwable.class,Integer.TYPE};
          method1 = b.b("getStackTraceElement", uClassArray);
       }
       b.b = method1;
       if (obj != null) {
          try{
             uClassArray = new Class[i];
             uClassArray[0] = Throwable.class;
             obj = b.b("getStackTraceDepth", uClassArray);
             if (obj != null) {
                Object[] objArray = new Object[i];
                objArray[0] = new Throwable();
                obj.invoke(b.a(), objArray);
                method = obj;
             }
          }catch(java.lang.UnsupportedOperationException e0){
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
       }
       b.c = method;
    }
    public static Object a(){
       ClassLoader uClassLoader = null;
       try{
          Class[] uClassArray = new Class[false];
          Object[] objArray = new Object[false];
          return Class.forName("sun.misc.SharedSecrets", false, uClassLoader).getMethod("getJavaLangAccess", uClassArray).invoke(uClassLoader, objArray);
       }catch(java.lang.ThreadDeath e0){
          throw e0;
       }
    }
    public static Method b(String p0,Class[] p1){
       ClassLoader uClassLoader = null;
       try{
          return Class.forName("sun.misc.JavaLangAccess", false, uClassLoader).getMethod(p0, p1);
       }catch(java.lang.ThreadDeath e3){
          throw e3;
       }
    }
    public static Throwable c(Throwable p0){
       Throwable cause;
       int i = 0;
       Throwable throwable = p0;
       while (true) {
          cause = p0.getCause();
          if (cause == null) {
             return p0;
          }
          if (cause != throwable) {
             if (i) {
                throwable = throwable.getCause();
             }
             i = i ^ 0x01;
             p0 = cause;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Loop in causal chain detected.", cause);
    }
    public static void d(Throwable p0,Class p1){
       n.j(p0);
       if (p1.isInstance(p0)) {
          throw p1.cast(p0);
       }
       b.e(p0);
       return;
    }
    public static void e(Throwable p0){
       n.j(p0);
       if (p0 instanceof RuntimeException) {
          throw p0;
       }
       if (!p0 instanceof Error) {
          return;
       }
       throw p0;
    }
}
