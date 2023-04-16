package fsd.o;
import qrd.n1;
import qrd.x0;
import qrd.b1;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class o	// class@000e6b
{

    public static final int a(int p0,int p1,int p2){
       p0 = n1.e(p0, p2);
       p1 = n1.e(p1, p2);
       int i = n1.c(p0, p1);
       p0 = x0.h((p0 - p1));
       if (i >= 0) {
       }else {
          p0 = x0.h((p0 + p2));
       }
       return p0;
    }
    public static final long b(long p0,long p1,long p2){
       p0 = n1.i(p0, p2);
       p1 = n1.i(p1, p2);
       int i = n1.g(p0, p1);
       p0 = b1.h((p0 - p1));
       if (i >= 0) {
       }else {
          p0 = b1.h((p0 + p2));
       }
       return p0;
    }
    public static final long c(long p0,long p1,long p2){
       if ((v2 = p2) > 0) {
          if (n1.g(p0, p1) < 0) {
             p1 = b1.h((p1 - o.b(p1, p0, b1.h(p2))));
          }
       }else if(v2 < 0){
          if (n1.g(p0, p1) > 0) {
             p1 = b1.h((p1 + o.b(p0, p1, b1.h((- p2)))));
          }
       }else {
          throw new IllegalArgumentException("Step is zero.");
       }
       return p1;
    }
    public static final int d(int p0,int p1,int p2){
       if (p2 > 0) {
          if (n1.c(p0, p1) < 0) {
             p1 = x0.h((p1 - o.a(p1, p0, x0.h(p2))));
          }
       }else if(p2 < 0){
          if (n1.c(p0, p1) > 0) {
             p1 = x0.h((p1 + o.a(p0, p1, x0.h((- p2)))));
          }
       }else {
          throw new IllegalArgumentException("Step is zero.");
       }
       return p1;
    }
}
