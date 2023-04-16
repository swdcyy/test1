package io.netty.util.internal.c;
import java.lang.Class;
import ard.b;
import ard.c;
import javassist.ClassPool;
import javassist.ClassClassPath;
import zqd.n;
import javassist.ClassPath;
import java.lang.Object;
import zqd.y;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.f;
import java.lang.SecurityManager;
import java.lang.System;
import java.lang.Thread;
import java.lang.ClassLoader;
import zqd.r;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.lang.String;
import java.lang.StringBuilder;
import javassist.CtClass;
import javassist.CtMethod;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class c	// class@001124
{
    public static final b a;
    public static final ClassPool b;

    static {
       c.a = c.a(c.class);
       ClassPool uClassPool = new ClassPool(true);
       c.b = uClassPool;
       uClassPool.appendClassPath(new ClassClassPath(n.class));
    }
    public void c(){
       super();
    }
    public static y a(Class p0){
       ClassLoader contextClass = (System.getSecurityManager() == null)? Thread.currentThread().getContextClassLoader(): AccessController.doPrivileged(new r());
       if (contextClass == null) {
          contextClass = PlatformDependent.p();
       }
       return c.b(p0, contextClass);
    }
    public static y b(Class p0,ClassLoader p1){
       int i;
       String str = "io.netty.util.internal.__matchers__."+c.c(p0)+"Matcher";
       try{
          i = 1;
          return Class.forName(str, i, p1).newInstance();
       }catch(java.lang.Exception e0){
          try{
             CtClass andRename = c.b.getAndRename(n.class.getName(), str);
             andRename.setModifiers((andRename.getModifiers() | 0x10));
             andRename.getDeclaredMethod("match").setBody("{ return $1 instanceof "+e0+"; }");
             byte[] uobyteArray = andRename.toBytecode();
             andRename.detach();
             Class[] uClassArray = new Class[4];
             uClassArray[0] = String.class;
             uClassArray[i] = byte[].class;
             Class tYPE = Integer.TYPE;
             uClassArray[2] = tYPE;
             uClassArray[3] = tYPE;
             Method declaredMeth = ClassLoader.class.getDeclaredMethod("defineClass", uClassArray);
             declaredMeth.setAccessible(i);
             Object[] objArray = new Object[4];
             objArray[0] = str;
             objArray[i] = uobyteArray;
             objArray[2] = Integer.valueOf(0);
             objArray[3] = Integer.valueOf(uobyteArray.length);
             Class uClass = declaredMeth.invoke(p1, objArray);
             if (p0 != Object.class) {
                c.a.debug("Generated: {}", uClass.getName());
             }
             return uClass.newInstance();
          }catch(java.lang.RuntimeException e11){
             throw e11;
          }catch(java.lang.Exception e11){
             throw new RuntimeException(e11);
          }
       }
    }
    public static String c(Class p0){
       if (p0.isArray()) {
          return c.c(p0.getComponentType())+"[]";
       }
       return p0.getName();
    }
}
