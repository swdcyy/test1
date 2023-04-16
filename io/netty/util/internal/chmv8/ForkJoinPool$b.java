package io.netty.util.internal.chmv8.ForkJoinPool$b;
import java.security.PrivilegedExceptionAction;
import java.lang.Object;
import sun.misc.Unsafe;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.NoSuchFieldError;
import java.lang.String;

public final class ForkJoinPool$b implements PrivilegedExceptionAction	// class@00116d
{

    public void ForkJoinPool$b(){
       super();
    }
    public Unsafe a(){
       Object obj;
       Unsafe unsafe = Unsafe.class;
       Field[] declaredFiel = unsafe.getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new NoSuchFieldError("the Unsafe");
          }
          object oobject = declaredFiel[i];
          oobject.setAccessible(true);
          obj = oobject.get(null);
          if (unsafe.isInstance(obj)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return unsafe.cast(obj);
    }
    public Object run(){
       return this.a();
    }
}
