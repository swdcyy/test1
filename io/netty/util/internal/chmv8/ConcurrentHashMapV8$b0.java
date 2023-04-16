package io.netty.util.internal.chmv8.ConcurrentHashMapV8$b0;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.lang.Object;
import java.lang.Class;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;

public final class ConcurrentHashMapV8$b0 extends ConcurrentHashMapV8$r	// class@00114c
{
    public ConcurrentHashMapV8$b0 f;
    public ConcurrentHashMapV8$b0 g;
    public ConcurrentHashMapV8$b0 h;
    public ConcurrentHashMapV8$b0 i;
    public boolean j;

    public void ConcurrentHashMapV8$b0(int p0,Object p1,Object p2,ConcurrentHashMapV8$r p3,ConcurrentHashMapV8$b0 p4){
       super(p0, p1, p2, p3);
       this.f = p4;
    }
    public ConcurrentHashMapV8$r a(int p0,Object p1){
       return this.b(p0, p1, null);
    }
    public final ConcurrentHashMapV8$b0 b(int p0,Object p1,Class p2){
       if (p1 != null) {
          ConcurrentHashMapV8$b0 uob0 = this;
          do {
             ConcurrentHashMapV8$b0 g = uob0.g;
             ConcurrentHashMapV8$b0 h = uob0.h;
             ConcurrentHashMapV8$r b = uob0.b;
             if (b <= p0) {
                if (b >= p0) {
                   b = uob0.c;
                   if (b == p1 || (b != null && p1.equals(b))) {
                      return uob0;
                   }else if(g == null && h == null){
                      if (p2 == null) {
                         p2 = ConcurrentHashMapV8.comparableClassFor(p1);
                         if (p2 == null) {
                         label_0036 :
                            if (g != null) {
                               if (h != null) {
                                  uob0 = h.b(p0, p1, p2);
                                  if (uob0 != null) {
                                     return uob0;
                                  }
                               }
                            }
                         }
                      }
                      int i = ConcurrentHashMapV8.compareComparables(p2, p1, b);
                      if (i) {
                         if (i >= 0) {
                            g = h;
                         }
                      }else {
                         goto label_0036 ;
                      }
                   }
                }
                uob0 = h;
             }
          label_000b :
             uob0 = g;
          } while (uob0 == null);
       }
       return null;
    }
}
