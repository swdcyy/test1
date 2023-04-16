package io.netty.util.internal.chmv8.Striped64$b;
import sun.misc.Unsafe;
import io.netty.util.internal.chmv8.Striped64;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import java.lang.Object;

public final class Striped64$b	// class@00117d
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public static final Unsafe p;
    public static final long q;

    static {
       try{
          Unsafe unsafe = Striped64.getUnsafe();
          Striped64$b.p = unsafe;
          Striped64$b.q = unsafe.objectFieldOffset(Striped64$b.class.getDeclaredField("h"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void Striped64$b(long p0){
       super();
       this.h = p0;
    }
    public final boolean a(long p0,long p1){
       return Striped64$b.p.compareAndSwapLong(this, Striped64$b.q, p0, p1);
    }
}
