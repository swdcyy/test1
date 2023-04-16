package o1.e;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import java.lang.reflect.Array;

public final class e	// class@00273e
{

    public static int[] a(int[] p0,int p1,int p2){
       if ((p1 + 1) > p0.length) {
          int[] ointArray = new int[e.c(p1)];
          System.arraycopy(p0, 0, ointArray, 0, p1);
          p0 = ointArray;
       }
       p0[p1] = p2;
       return p0;
    }
    public static Object[] b(Object[] p0,int p1,Object p2){
       if ((p1 + 1) > p0.length) {
          Object[] objArray = Array.newInstance(p0.getClass().getComponentType(), e.c(p1));
          System.arraycopy(p0, 0, objArray, 0, p1);
          p0 = objArray;
       }
       p0[p1] = p2;
       return p0;
    }
    public static int c(int p0){
       p0 = (p0 <= 4)? 8: p0 * 2;
       return p0;
    }
}
