package io.netty.util.internal.b;
import zqd.a;
import java.lang.Object;
import io.netty.util.internal.f;
import java.lang.Class;
import sun.misc.Unsafe;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Integer;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public abstract class b extends a	// class@001123
{
    public final long r;
    public final Object[] s;
    public static final int t;
    public static final long u;
    public static final int v;

    static {
       Object[] objArray = Object[].class;
       Unsafe b = f.b;
       int i = b.arrayIndexScale(objArray);
       if (4 == i) {
          b.v = 2;
       }else if(8 == i){
          b.v = 3;
       }else {
          throw new IllegalStateException("Unknown pointer size");
       }
       int i1 = 128 / i;
       b.t = i1;
       b.u = (long)(b.arrayBaseOffset(objArray) + (i1 * i));
    }
    public void b(int p0){
       super();
       p0 = 1 << (Integer.numberOfLeadingZeros((p0 - 1)) - 32);
       this.r = (long)(p0 - 1);
       Object[] objArray = new Object[(p0 + (b.t * 2))];
       this.s = objArray;
    }
    public static final long d(long p0,long p1){
       return (b.u + ((p0 & p1) << b.v));
    }
    public static final Object l(Object[] p0,long p1){
       return f.b.getObjectVolatile(p0, p1);
    }
    public static final void m(Object[] p0,long p1,Object p2){
       f.b.putOrderedObject(p0, p1, p2);
    }
    public static final void n(Object[] p0,long p1,Object p2){
       f.b.putObject(p0, p1, null);
    }
    public final long b(long p0){
       return b.d(p0, this.r);
    }
    public void clear(){
       do {
          if (this.poll() == null) {
          }
       } while (!this.isEmpty());
       return;
    }
    public Iterator iterator(){
       throw new UnsupportedOperationException();
    }
}
