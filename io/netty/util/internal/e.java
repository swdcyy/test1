package io.netty.util.internal.e;
import zqd.i;
import io.netty.util.internal.f;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import sun.misc.Unsafe;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;

public abstract class e extends i	// class@001181
{
    public long L;
    public static final long M;

    static {
       try{
          e.M = f.b.objectFieldOffset(e.class.getDeclaredField("L"));
       }catch(java.lang.NoSuchFieldException e0){
          throw new RuntimeException(e0);
       }
    }
    public void e(int p0){
       super(p0);
    }
    public final boolean p(long p0,long p1){
       return f.b.compareAndSwapLong(this, e.M, p0, p1);
    }
    public final long q(){
       return this.L;
    }
}
