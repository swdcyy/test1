package io.reactivex.internal.util.m;
import brd.y;
import io.reactivex.internal.fuseable.o;
import crd.b;
import io.reactivex.internal.util.i;
import java.lang.Throwable;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.observers.k;
import java.lang.Object;
import cxd.d;

public final class m	// class@0014df
{

    public static boolean a(boolean p0,boolean p1,y p2,boolean p3,o p4,b p5,i p6){
       Throwable throwable;
       if (p6.b()) {
          p4.clear();
          p5.dispose();
          return true;
       }else if(p0){
          if (p3) {
             if (p1) {
                if (p5 != null) {
                   p5.dispose();
                }
                throwable = p6.w();
                if (throwable != null) {
                   p2.onError(throwable);
                }else {
                   p2.onComplete();
                }
                return true;
             }
          }else {
             throwable = p6.w();
             if (throwable != null) {
                p4.clear();
                if (p5 != null) {
                   p5.dispose();
                }
                p2.onError(throwable);
                return true;
             }else if(p1){
                if (p5 != null) {
                   p5.dispose();
                }
                p2.onComplete();
                return true;
             }
          }
       }
       return false;
    }
    public static o b(int p0){
       if (p0 < 0) {
          return new a((- p0));
       }
       return new SpscArrayQueue(p0);
    }
    public static void c(n p0,y p1,boolean p2,b p3,i p4){
       int i1;
       i oi = p4;
       int i = 1;
       while (true) {
          k ok = oi;
          if (m.a(ok.c(), p0.isEmpty(), p1, p2, p0, p3, p4)) {
          }else {
             while (true) {
                int b = ok.c();
                Object obj = p0.poll();
                if (obj == null) {
                   i1 = 1;
                label_002b :
                   if (m.a(b, i1, p1, p2, p0, p3, p4)) {
                      return;
                   }
                   if (i1) {
                      b = - i;
                      if (!ok.d(b)) {
                         return;
                      }
                      continue ;
                   }else {
                      oi.e(p1, obj);
                   }
                }else {
                   i1 = 0;
                   goto label_002b ;
                }
             }
             return;
          }
       }
    }
    public static void d(d p0,int p1){
       long l = (p1 < 0)? Long.MAX_VALUE: (long)p1;
       p0.request(l);
       return;
    }
}
