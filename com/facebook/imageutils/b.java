package com.facebook.imageutils.b;
import java.lang.Object;
import java.io.InputStream;
import com.facebook.imageutils.b$b;
import com.facebook.imageutils.b$a;
import com.facebook.imageutils.a;
import java.lang.Class;
import java.lang.String;
import cb.a;

public class b	// class@001155
{
    public static final Class a;

    static {
       b.a = b.class;
    }
    public void b(){
       super();
    }
    public static int a(InputStream p0,int p1){
       b$b a;
       b$b uob = new b$b(null);
       int i = 0;
       int i1 = 8;
       if (p1 <= i1) {
       }else {
          boolean i2 = a.a(p0, 4, i);
          uob.b = i2;
          p1 = p1 - 4;
          long l = 0x49492a00;
          if (i2 != l && i2 != 0x4d4d002a) {
             a.c(b.a, "Invalid TIFF header");
          }else if(i2 == l){
             i2 = true;
          }else {
             i2 = false;
          }
          uob.a = i2;
          i2 = a.a(p0, 4, i2);
          uob.c = i2;
          p1 = p1 - 4;
          if (i2 < i1 || (i2 - i1) > p1) {
             a.c(b.a, "Invalid offset");
          }else {
          label_0044 :
             i2 = uob.c - i1;
             if (p1 && i2 <= p1) {
                p0.skip((long)i2);
                p1 = p1 - i2;
                a = uob.a;
                if (p1 >= 14) {
                   int i3 = a.a(p0, 2, a);
                   p1 = p1 - 2;
                   while (true) {
                      int i4 = i3 - 1;
                      if (i3 > 0 && p1 >= 12) {
                         p1 = p1 - 2;
                         if (a.a(p0, 2, a) == 274) {
                            break ;
                         }else {
                            p0.skip(10);
                            p1 = p1 - 10;
                            i3 = i4;
                         }
                      }
                   }
                   uob = uob.a;
                   if (p1 >= 10 && (a.a(p0, 2, uob) == 3 && a.a(p0, 4, uob) == 1)) {
                      i = a.a(p0, 2, uob);
                   }
                }
                p1 = 0;
                goto label_007c ;
             }
          label_0096 :
             return i;
          }
       }
       p1 = 0;
       goto label_0044 ;
    }
}
