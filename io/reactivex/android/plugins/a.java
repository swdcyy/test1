package io.reactivex.android.plugins.a;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.RuntimeException;
import drd.a;
import java.util.concurrent.Callable;
import brd.z;
import java.lang.String;
import java.util.Objects;
import java.lang.NullPointerException;

public final class a	// class@001810
{
    public static o a;
    public static o b;

    public static Object a(o p0,Object p1){
       return p0.apply(p1);
    }
    public static z b(o p0,Callable p1){
       z oz = a.a(p0, p1);
       Objects.requireNonNull(oz, "Scheduler Callable returned null");
       return oz;
    }
    public static z c(Callable p0){
       z oz = p0.call();
       if (oz != null) {
          return oz;
       }
       throw new NullPointerException("Scheduler Callable returned null");
    }
    public static z d(Callable p0){
       o a = a.a;
       if (a == null) {
          return a.c(p0);
       }
       return a.b(a, p0);
    }
    public static z e(z p0){
       Objects.requireNonNull(p0, "scheduler == null");
       o b = a.b;
       if (b == null) {
          return p0;
       }
       return a.a(b, p0);
    }
}
