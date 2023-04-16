package com.facebook.common.internal.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Object;
import ab.e;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;

public final class a	// class@00105a
{

    public static long a(InputStream p0,OutputStream p1){
       e.d(p0);
       e.d(p1);
       byte[] uobyteArray = new byte[4096];
       long l = 0;
       int i = p0.read(uobyteArray);
       while (i != -1) {
          p1.write(uobyteArray, 0, i);
          l = l + (long)i;
       }
       return l;
    }
    public static int b(InputStream p0,byte[] p1,int p2,int p3){
       e.d(p0);
       e.d(p1);
       if (p3 < 0) {
          throw new IndexOutOfBoundsException("len is negative");
       }
       int i = 0;
       while (i < p3) {
          int i1 = p2 + i;
          int i2 = p3 - i;
          i1 = p0.read(p1, i1, i2);
          if (i1 == -1) {
             break ;
          }else {
             i = i + i1;
          }
       }
       return i;
    }
}
