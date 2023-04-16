package io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.a$a;
import java.lang.Object;
import erd.d;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class a	// class@00184f
{
    public static final d a;

    static {
       a.a = new a$a();
    }
    public static boolean a(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static d b(){
       return a.a;
    }
    public static Object c(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
    public static int d(int p0,String p1){
       if (p0 > 0) {
          return p0;
       }
       throw new IllegalArgumentException(p1+" > 0 required but it was "+p0);
    }
    public static long e(long p0,String p1){
       if (p0 - null > 0) {
          return p0;
       }
       throw new IllegalArgumentException(p1+" > 0 required but it was "+p0);
    }
}
