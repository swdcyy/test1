package io.netty.util.Recycler$WeakOrderQueue;
import io.netty.util.Recycler$f;
import java.lang.Thread;
import java.lang.Object;
import io.netty.util.Recycler;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.Recycler$WeakOrderQueue$Link;
import io.netty.util.Recycler$a;
import java.lang.ref.WeakReference;
import java.lang.Math;
import java.util.Arrays;
import io.netty.util.Recycler$d;
import java.lang.IllegalStateException;
import java.lang.String;

public final class Recycler$WeakOrderQueue	// class@0010e1
{
    public Recycler$WeakOrderQueue$Link a;
    public Recycler$WeakOrderQueue$Link b;
    public Recycler$WeakOrderQueue c;
    public final WeakReference d;
    public final int e;

    public void Recycler$WeakOrderQueue(Recycler$f p0,Thread p1){
       super();
       this.e = Recycler.e.getAndIncrement();
       Recycler$WeakOrderQueue$Link weakOrderQue = new Recycler$WeakOrderQueue$Link(null);
       this.b = weakOrderQue;
       this.a = weakOrderQue;
       this.d = new WeakReference(p1);
       _monitor_enter(p0);
       this.c = p0.f;
       p0.f = this;
       _monitor_exit(p0);
    }
    public boolean a(Recycler$f p0){
       Recycler$WeakOrderQueue ta = this.a;
       boolean b = false;
       if (ta == null) {
          return b;
       }
       if (ta.readIndex == 16) {
          ta = ta.next;
          if (ta == null) {
             return b;
          }else {
             this.a = ta;
          }
       }
       Recycler$WeakOrderQueue$Link readIndex = ta.readIndex;
       int i = ta.get();
       int i1 = i - readIndex;
       if (!i1) {
          return b;
       }else {
          Recycler$f e = p0.e;
          i1 = i1 + e;
          Recycler$f c = p0.c;
          if (i1 > c.length) {
             int len = c.length;
             Recycler$f d = p0.d;
             do {
                len = len << 1;
             } while (len >= i1 || len >= d);
             i1 = Math.min(len, d);
             c = p0.c;
             if (i1 != c.length) {
                p0.c = Arrays.copyOf(c, i1);
             }
             i = Math.min(((i1 + readIndex) - e), i);
          }
          if (readIndex != i) {
             Recycler$WeakOrderQueue$Link elements = ta.elements;
             Recycler$f c1 = p0.c;
             while (true) {
                if (readIndex < i) {
                   object oobject = elements[readIndex];
                   Recycler$d b1 = oobject.b;
                   if (b1 == null) {
                      oobject.b = oobject.a;
                   }else if(b1 == oobject.a){
                      throw new IllegalStateException("recycled already");
                   }
                   oobject.c = p0;
                   int i2 = e + 1;
                   c1[e] = oobject;
                   elements[readIndex] = null;
                   readIndex = readIndex + 1;
                   e = i2;
                }else {
                   p0.e = e;
                   if (i == 16) {
                      Recycler$WeakOrderQueue$Link next = ta.next;
                      if (next != null) {
                         this.a = next;
                         break ;
                      }
                   }
                   break ;
                }
             }
             ta.readIndex = i;
             return 1;
          }else {
             return b;
          }
       }
    }
}
