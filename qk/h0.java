package qk.h0;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Array;

public final class h0	// class@00228c
{

    public static Object a(Object p0,int p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException("at index "+p1);
    }
    public static Object[] b(Object[] p0){
       h0.c(p0, p0.length);
       return p0;
    }
    public static Object[] c(Object[] p0,int p1){
       for (int i = 0; i < p1; i = i + 1) {
          h0.a(p0[i], i);
       }
       return p0;
    }
    public static Object[] d(Object[] p0,int p1){
       return Array.newInstance(p0.getClass().getComponentType(), p1);
    }
}
