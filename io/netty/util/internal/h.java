package io.netty.util.internal.h;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.IllegalArgumentException;
import java.lang.Object;

public final class h extends AtomicLongFieldUpdater	// class@001185
{
    public final long a;
    public final Unsafe b;

    public void h(Unsafe p0,Class p1,String p2){
       super();
       Field declaredFiel = p1.getDeclaredField(p2);
       if (!Modifier.isVolatile(declaredFiel.getModifiers())) {
          throw new IllegalArgumentException("Must be volatile");
       }
       this.b = p0;
       this.a = p0.objectFieldOffset(declaredFiel);
       return;
    }
    public boolean compareAndSet(Object p0,long p1,long p2){
       return this.b.compareAndSwapLong(p0, this.a, p1, p2);
    }
    public long get(Object p0){
       return this.b.getLongVolatile(p0, this.a);
    }
    public void lazySet(Object p0,long p1){
       this.b.putOrderedLong(p0, this.a, p1);
    }
    public void set(Object p0,long p1){
       this.b.putLongVolatile(p0, this.a, p1);
    }
    public boolean weakCompareAndSet(Object p0,long p1,long p2){
       return this.b.compareAndSwapLong(p0, this.a, p1, p2);
    }
}
