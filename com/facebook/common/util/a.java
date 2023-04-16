package com.facebook.common.util.a;
import java.io.InputStream;
import java.lang.Object;
import ab.e;
import java.lang.Boolean;

public class a	// class@001074
{

    public static long a(InputStream p0,long p1){
       e.d(p0);
       boolean b = (p1 >= 0)? true: false;
       e.a(Boolean.valueOf(b));
       long l = p1;
       while (l > 0) {
          long l1 = p0.skip(l);
          if (l1 <= 0) {
             if (p0.read() != -1) {
                l1 = 1;
             }else {
                p1 = p1 - l;
                break ;
             }
          }
          l = l - l1;
       }
       return p1;
    }
}
