package com.meizu.cloud.pushsdk.c.g.o;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Object;
import java.lang.Long;
import java.lang.Throwable;

public final class o	// class@0014fc
{
    public static final Charset a;

    static {
       o.a = Charset.forName("UTF-8");
    }
    public static void a(long p0,long p1,long p2){
       if ((p1 | p2) >= 0 && (p1 - p0 <= 0 && (p0 - p1) - p2 >= 0)) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2)};
       throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", objArray));
    }
    public static void a(Throwable p0){
       o.b(p0);
    }
    public static boolean a(byte[] p0,int p1,byte[] p2,int p3,int p4){
       int i = 0;
       while (true) {
          if (i >= p4) {
             return true;
          }
          int i1 = i + p1;
          int i2 = i + p3;
          if (p0[i1] != p2[i2]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static void b(Throwable p0){
       throw p0;
    }
}
