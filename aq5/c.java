package aq5.c;
import aq5.d;
import aq5.a;

public final class c	// class@000390
{

    public static void a(d p0,a[] p1){
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.yj(p1[i]);
       }
       return;
    }
    public static boolean b(d p0,a[] p1){
       boolean len = p1.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             if (!p0.ck(p1[i1])) {
                len = false;
             label_0013 :
                if (len) {
                   i1 = p1.length;
                   for (; i < i1; i = i + 1) {
                      p0.Pj(p1[i]);
                   }
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             len = true;
             goto label_0013 ;
          }
       }
       return len;
    }
}
