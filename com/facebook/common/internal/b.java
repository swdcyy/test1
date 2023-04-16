package com.facebook.common.internal.b;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import java.io.Closeable;
import java.util.logging.Level;
import java.lang.Throwable;
import java.io.InputStream;
import java.lang.AssertionError;

public final class b	// class@00105b
{
    public static final Logger a;

    static {
       b.a = Logger.getLogger(b.class.getName());
    }
    public void b(){
       super();
    }
    public static void a(Closeable p0,boolean p1){
       if (p0 == null) {
          return;
       }
       try{
          p0.close();
       }catch(java.io.IOException e2){
          if (!p1) {
             throw e2;
          }
          b.a.log(Level.WARNING, "IOException thrown while closing Closeable.", e2);
       }
       return;
    }
    public static void b(InputStream p0){
       boolean b = true;
       try{
          b.a(p0, b);
          return;
       }catch(java.io.IOException e1){
          throw new AssertionError(e1);
       }
    }
}
