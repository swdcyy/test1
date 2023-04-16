package io.netty.util.internal.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.IllegalArgumentException;
import java.lang.Object;

public final class i extends AtomicReferenceFieldUpdater	// class@001186
{
    public final long a;
    public final Unsafe b;

    public void i(Unsafe p0,Class p1,String p2){
       super();
       Field declaredFiel = p1.getDeclaredField(p2);
       if (!Modifier.isVolatile(declaredFiel.getModifiers())) {
          throw new IllegalArgumentException("Must be volatile");
       }
       this.b = p0;
       this.a = p0.objectFieldOffset(declaredFiel);
       return;
    }
    public boolean compareAndSet(Object p0,Object p1,Object p2){
       return this.b.compareAndSwapObject(p0, this.a, p1, p2);
    }
    public Object get(Object p0){
       return this.b.getObjectVolatile(p0, this.a);
    }
    public void lazySet(Object p0,Object p1){
       this.b.putOrderedObject(p0, this.a, p1);
    }
    public void set(Object p0,Object p1){
       this.b.putObjectVolatile(p0, this.a, p1);
    }
    public boolean weakCompareAndSet(Object p0,Object p1,Object p2){
       return this.b.compareAndSwapObject(p0, this.a, p1, p2);
    }
}
