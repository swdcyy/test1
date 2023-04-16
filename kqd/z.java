package kqd.z;
import kqd.d;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.util.internal.PlatformDependent;

public final class z extends d	// class@001b6b
{

    public void z(a p0){
       super(p0);
    }
    public static int c7(d p0,int p1){
       return (p0.L0() + p1);
    }
    public int W6(a p0,int p1){
       return PlatformDependent.k(p0.w0(), z.c7(p0, p1));
    }
    public long X6(a p0,int p1){
       return PlatformDependent.m(p0.w0(), z.c7(p0, p1));
    }
    public short Y6(a p0,int p1){
       return PlatformDependent.o(p0.w0(), z.c7(p0, p1));
    }
    public void Z6(a p0,int p1,int p2){
       PlatformDependent.C(p0.w0(), z.c7(p0, p1), p2);
    }
    public void a7(a p0,int p1,long p2){
       PlatformDependent.E(p0.w0(), z.c7(p0, p1), p2);
    }
    public void b7(a p0,int p1,short p2){
       PlatformDependent.G(p0.w0(), z.c7(p0, p1), p2);
    }
}
