package io.netty.util.Recycler$d;
import io.netty.util.Recycler$e;
import io.netty.util.Recycler$f;
import java.lang.Object;
import java.lang.Thread;
import java.util.Objects;
import io.netty.util.Recycler;
import java.lang.Math;
import java.util.Arrays;
import java.lang.IllegalStateException;
import java.lang.String;
import io.netty.util.concurrent.e;
import java.util.Map;
import io.netty.util.Recycler$WeakOrderQueue;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.Recycler$WeakOrderQueue$Link;
import io.netty.util.Recycler$a;
import java.lang.IllegalArgumentException;

public final class Recycler$d implements Recycler$e	// class@0010e5
{
    public int a;
    public int b;
    public Recycler$f c;
    public Object d;

    public void Recycler$d(Recycler$f p0){
       super();
       this.c = p0;
    }
    public void a(Object p0){
       if (p0 != this.d) {
          throw new IllegalArgumentException("object does not belong to handle");
       }
       p0 = Thread.currentThread();
       Recycler$d tc = this.c;
       if (p0 == tc.b) {
          Objects.requireNonNull(tc);
          if (!(this.b | this.a)) {
             int f = Recycler.f;
             this.a = f;
             this.b = f;
             f = tc.e;
             Recycler$f d = tc.d;
             if (f < d) {
                Recycler$f c = tc.c;
                if (f == c.length) {
                   tc.c = Arrays.copyOf(c, Math.min((f << 1), d));
                }
                tc.c[f] = this;
                f++;
                tc.e = f;
             }
             return;
          }else {
             throw new IllegalStateException("recycled already");
          }
       }else {
          Map map = Recycler.i.b();
          Recycler$WeakOrderQueue weakOrderQue = map.get(this.c);
          if (weakOrderQue == null) {
             Recycler$d tc1 = this.c;
             Recycler$WeakOrderQueue weakOrderQue1 = new Recycler$WeakOrderQueue(tc1, p0);
             map.put(tc1, weakOrderQue1);
             weakOrderQue = weakOrderQue1;
          }
          this.a = weakOrderQue.e;
          p0 = weakOrderQue.b;
          int i = p0.get();
          if (i == 16) {
             Recycler$WeakOrderQueue$Link weakOrderQue2 = new Recycler$WeakOrderQueue$Link(null);
             p0.next = weakOrderQue2;
             weakOrderQue.b = weakOrderQue2;
             Recycler$WeakOrderQueue$Link weakOrderQue3 = weakOrderQue2;
             i = weakOrderQue2.get();
             p0 = weakOrderQue3;
          }
          p0.elements[i] = this;
          this.c = null;
          p0.lazySet((i + 1));
          return;
       }
    }
}
