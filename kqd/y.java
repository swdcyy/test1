package kqd.y;
import kqd.d;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.util.internal.PlatformDependent;

public final class y extends d	// class@001b6a
{

    public void y(a p0){
       super(p0);
    }
    public static long c7(a p0,int p1){
       return (p0.Y4() + (long)p1);
    }
    public int W6(a p0,int p1){
       return PlatformDependent.j(y.c7(p0, p1));
    }
    public long X6(a p0,int p1){
       return PlatformDependent.l(y.c7(p0, p1));
    }
    public short Y6(a p0,int p1){
       return PlatformDependent.n(y.c7(p0, p1));
    }
    public void Z6(a p0,int p1,int p2){
       PlatformDependent.B(y.c7(p0, p1), p2);
    }
    public void a7(a p0,int p1,long p2){
       PlatformDependent.D(y.c7(p0, p1), p2);
    }
    public void b7(a p0,int p1,short p2){
       PlatformDependent.F(y.c7(p0, p1), p2);
    }
}
