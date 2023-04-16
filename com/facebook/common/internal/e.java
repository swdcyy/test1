package com.facebook.common.internal.e;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Object;
import ab.e;
import java.lang.Class;
import java.lang.Error;

public final class e	// class@00105e
{

    public static RuntimeException a(Throwable p0){
       e.d(p0);
       e.c(p0);
       throw new RuntimeException(p0);
    }
    public static void b(Throwable p0,Class p1){
       if (p0 == null || !p1.isInstance(p0)) {
          return;
       }
       throw p1.cast(p0);
    }
    public static void c(Throwable p0){
       e.b(p0, Error.class);
       e.b(p0, RuntimeException.class);
    }
}
