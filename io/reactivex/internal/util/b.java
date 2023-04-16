package io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import ird.a;

public final class b	// class@0014d4
{

    public static long a(AtomicLong p0,long p1){
       long l;
       while (true) {
          l = p0.get();
          long l1 = Long.MAX_VALUE;
          if (!l - l1) {
             return l1;
          }
          if (p0.compareAndSet(l, b.b(l, p1))) {
             break ;
          }
       }
       return l;
    }
    public static long b(long p0,long p1){
       p0 = p0 + p1;
       if (p0 < 0) {
          p0 = Long.MAX_VALUE;
       }
       return p0;
    }
    public static long c(AtomicLong p0,long p1){
       long l1;
       while (true) {
          long l = p0.get();
          l1 = Long.MAX_VALUE;
          if (!l - l1) {
             return l1;
          }
          l1 = l - p1;
          int i = 0;
          if (l1 - i < 0) {
             a.l(new IllegalStateException("More produced than requested: "+l1));
             l1 = i;
          }
          if (p0.compareAndSet(l, l1)) {
             break ;
          }
       }
       return l1;
    }
}
