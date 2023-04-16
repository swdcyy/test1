package vk.c;
import com.google.common.primitives.Longs;
import java.lang.String;
import ok.n;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Character;

public final class c	// class@0026c7
{

    public static int a(long p0,long p1){
       return Longs.a(c.c(p0), c.c(p1));
    }
    public static long b(long p0,long p1){
       long l = 0;
       if (p1 - l < 0) {
          if (c.a(p0, p1) < 0) {
             return l;
          }else {
             return 1;
          }
       }else if(p0 - l >= 0){
          return (p0 / p1);
       }else {
          l = 1;
          long l1 = ((p0 >> l) / p1) << l;
          if (c.a((p0 - (l1 * p1)), p1) < 0) {
             int i = 0;
          }
          return (l1 + (long)l);
       }
    }
    public static long c(long p0){
       return (p0 ^ Long.MIN_VALUE);
    }
    public static long d(long p0,long p1){
       int i = 0;
       if (p1 - i < 0) {
          if (c.a(p0, p1) < 0) {
             return p0;
          }else {
             return (p0 - p1);
          }
       }else if(p0 - i >= 0){
          return (p0 % p1);
       }else {
          p0 = p0 - ((((p0 >> 1) / p1) << 1) * p1);
          if (c.a(p0, p1) < 0) {
             int i1 = i;
          }
          return (p0 - p1);
       }
    }
    public static String e(long p0,int p1){
       long l;
       int i = 1;
       boolean b = (p1 >= 2 && p1 <= 36)? true: false;
       n.d(b, "radix \(%s\) must be between Character.MIN_RADIX and Character.MAX_RADIX", p1);
       if (!(v3 = p0)) {
          return "0";
       }else if(v3 > 0){
          return Long.toString(p0, p1);
       }else {
          int i1 = 64;
          char[] uocharArray = new char[i1];
          int i2 = p1 - 1;
          if (!(p1 & i2)) {
             int i3 = Integer.numberOfTrailingZeros(p1);
             do {
                i1 = i1 - 1;
                i = (int)p0 & i2;
                uocharArray[i1] = Character.forDigit(i, p1);
                p0 = p0 >> i3;
             } while (!p0);
          }else if(!(p1 & 0x01)){
             l = (p0 >> i) / (long)(p1 >> 1);
          }else {
             l = c.b(p0, (long)p1);
          }
          long l1 = (long)p1;
          uocharArray[63] = Character.forDigit((int)(p0 - (l * l1)), p1);
          i1 = 63;
          while (l > 0) {
             i1 = i1 - 1;
             p0 = l % l1;
             uocharArray[i1] = Character.forDigit((int)p0, p1);
             l = l / l1;
          }
          return new String(uocharArray, i1, (i1 - 64));
       }
    }
}
