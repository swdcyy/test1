package io.netty.util.internal.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.IllegalArgumentException;
import java.lang.Object;

public final class g extends AtomicIntegerFieldUpdater	// class@001184
{
    public final long a;
    public final Unsafe b;

    public void g(Unsafe p0,Class p1,String p2){
       super();
       Field declaredFiel = p1.getDeclaredField(p2);
       if (!Modifier.isVolatile(declaredFiel.getModifiers())) {
          throw new IllegalArgumentException("Must be volatile");
       }
       this.b = p0;
       this.a = p0.objectFieldOffset(declaredFiel);
       return;
    }
    public boolean compareAndSet(Object p0,int p1,int p2){
       return this.b.compareAndSwapInt(p0, this.a, p1, p2);
    }
    public int get(Object p0){
       return this.b.getIntVolatile(p0, this.a);
    }
    public void lazySet(Object p0,int p1){
       this.b.putOrderedInt(p0, this.a, p1);
    }
    public void set(Object p0,int p1){
       this.b.putIntVolatile(p0, this.a, p1);
    }
    public boolean weakCompareAndSet(Object p0,int p1,int p2){
       return this.b.compareAndSwapInt(p0, this.a, p1, p2);
    }
}
