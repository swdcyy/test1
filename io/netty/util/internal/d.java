package io.netty.util.internal.d;
import zqd.j;
import io.netty.util.internal.f;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import sun.misc.Unsafe;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;

public abstract class d extends j	// class@001180
{
    public long m1;
    public static final long n1;

    static {
       try{
          d.n1 = f.b.objectFieldOffset(d.class.getDeclaredField("m1"));
       }catch(java.lang.NoSuchFieldException e0){
          throw new RuntimeException(e0);
       }
    }
    public void d(int p0){
       super(p0);
    }
    public final long r(){
       return this.m1;
    }
    public void s(long p0){
       f.b.putOrderedLong(this, d.n1, p0);
    }
}
