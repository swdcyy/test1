package kxd.c;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.NullPointerException;

public final class c	// class@001c09
{

    public static void a(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
    public static Object b(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
}
