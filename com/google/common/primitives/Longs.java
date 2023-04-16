package com.google.common.primitives.Longs;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import ok.n;
import com.google.common.primitives.Longs$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class Longs	// class@0018f0
{

    public static int a(long p0,long p1){
       int i;
       if ((v0 = p0 - p1) < 0) {
          i = -1;
       }else if(v0 > 0){
          i = 1;
       }else {
          i = 0;
       }
       return i;
    }
    public static int b(long p0){
       return (int)(p0 ^ (p0 >> 32));
    }
    public static int c(long[] p0,long p1,int p2,int p3){
       while (true) {
          if (p2 >= p3) {
             return -1;
          }
          if (!p0[p2] - p1) {
             break ;
          }else {
             p2++;
          }
       }
       return p2;
    }
    public static Long d(String p0,int p1){
       String str = p0;
       int i = p1;
       n.j(p0);
       Long longx = null;
       if (p0.isEmpty()) {
          return longx;
       }
       if (i < 2 || i > 36) {
          throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was "+i);
       }
       int i1 = 0;
       if (str.charAt(i1) == '-') {
          i1 = 1;
       }
       if (i1 == p0.length()) {
          return longx;
       }else {
          int i2 = i1 + 1;
          int i3 = Longs$a.a(str.charAt(i1));
          if (i3 < 0 || i3 >= i) {
             return longx;
          }else {
             long l = (long)(- i3);
             long l1 = (long)i;
             long l2 = Long.MIN_VALUE / l1;
             while (true) {
                if (i2 < p0.length()) {
                   int i4 = i2 + 1;
                   i2 = Longs$a.a(str.charAt(i2));
                   if (i2 >= 0 && (i2 >= i || l - l2 < 0)) {
                      break ;
                   }else {
                      l = l * l1;
                      long l3 = (long)i2;
                      long l4 = l3 + Long.MIN_VALUE;
                      if (l - l4 < 0) {
                         return longx;
                      }else {
                         l = l - l3;
                         i2 = i4;
                      }
                   }
                }else if(i1){
                   return Long.valueOf(l);
                }else if(!l - Long.MIN_VALUE){
                   return longx;
                }else {
                   return Long.valueOf((- l));
                }
             }
             return longx;
          }
       }
    }
}
