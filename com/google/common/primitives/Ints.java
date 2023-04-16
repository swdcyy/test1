package com.google.common.primitives.Ints;
import ok.n;
import java.util.Collection;
import com.google.common.primitives.Ints$IntArrayAsList;
import java.lang.Object;
import java.lang.Number;

public final class Ints	// class@000539
{

    public static int a(int[] p0,int p1,int p2,int p3){
       while (true) {
          if (p2 >= p3) {
             return -1;
          }
          if (p0[p2] == p1) {
             break ;
          }else {
             p2++;
          }
       }
       return p2;
    }
    public static int b(int[] p0){
       int i = 0;
       int i1 = 1;
       int b = (p0.length > 0)? true: false;
       n.b(b);
       b = p0[i];
       while (i1 < p0.length) {
          if (p0[i1] > b) {
             b = p0[i1];
          }
          i1 = i1 + 1;
       }
       return b;
    }
    public static int c(int[] p0){
       int i = 0;
       int i1 = 1;
       int b = (p0.length > 0)? true: false;
       n.b(b);
       b = p0[i];
       while (i1 < p0.length) {
          if (p0[i1] < b) {
             b = p0[i1];
          }
          i1 = i1 + 1;
       }
       return b;
    }
    public static int d(long p0){
       if (p0 - 0x7fffffff > 0) {
          return Integer.MAX_VALUE;
       }
       if (p0 - -2147483648 < 0) {
          return Integer.MIN_VALUE;
       }
       return (int)p0;
    }
    public static int[] e(Collection p0){
       if (p0 instanceof Ints$IntArrayAsList) {
          return p0.toIntArray();
       }
       Object[] objArray = p0.toArray();
       int len = objArray.length;
       int[] ointArray = new int[len];
       for (int i = 0; i < len; i = i + 1) {
          object oobject = objArray[i];
          n.j(oobject);
          ointArray[i] = oobject.intValue();
       }
       return ointArray;
    }
    public static byte[] f(int p0){
       byte[] uobyteArray = new byte[]{(byte)(p0 >> 24),(byte)(p0 >> 16),(byte)(p0 >> 8),(byte)p0};
       return uobyteArray;
    }
}
