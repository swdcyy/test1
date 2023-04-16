package com.google.protobuf.UnsafeUtil$1;
import java.security.PrivilegedExceptionAction;
import java.lang.Object;
import sun.misc.Unsafe;
import java.lang.reflect.Field;
import java.lang.Class;

public final class UnsafeUtil$1 implements PrivilegedExceptionAction	// class@0004e4
{

    public void UnsafeUtil$1(){
       super();
    }
    public Object run(){
       return this.run();
    }
    public Unsafe run(){
       Object obj;
       Unsafe unsafe = Unsafe.class;
       Field[] declaredFiel = unsafe.getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (true) {
          obj = null;
          if (i >= len) {
             return obj;
          }
          object oobject = declaredFiel[i];
          oobject.setAccessible(true);
          obj = oobject.get(obj);
          if (unsafe.isInstance(obj)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return unsafe.cast(obj);
    }
}
