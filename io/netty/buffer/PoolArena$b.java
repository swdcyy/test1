package io.netty.buffer.PoolArena$b;
import io.netty.buffer.PoolArena;
import io.netty.buffer.j;
import java.lang.Object;
import java.nio.ByteBuffer;
import io.netty.util.internal.PlatformDependent;
import java.nio.Buffer;
import kqd.q;
import io.netty.buffer.m;
import io.netty.util.Recycler;
import io.netty.buffer.k;
import kqd.k;

public final class PoolArena$b extends PoolArena	// class@00103f
{

    public void PoolArena$b(j p0,int p1,int p2,int p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public boolean C(){
       return true;
    }
    public void F(Object p0,int p1,Object p2,int p3,int p4){
       if (!p4) {
       }else if(PoolArena.y){
          PlatformDependent.a((PlatformDependent.d(p0) + (long)p1), (PlatformDependent.d(p2) + (long)p3), (long)p4);
       }else {
          p0 = p0.duplicate();
          p2 = p2.duplicate();
          p0.position(p1).limit((p1 + p4));
          p2.position(p3);
          p2.put(p0);
       }
       return;
    }
    public q G(int p0){
       if (PoolArena.y) {
          m om = m.x.a();
          om.J7(p0);
          return om;
       }else {
          k ok = k.w.a();
          ok.J7(p0);
          return ok;
       }
    }
    public k H(int p0,int p1,int p2,int p3){
       k ok = new k(this, ByteBuffer.allocateDirect(p3), p0, p1, p2, p3);
       return v7;
    }
    public k K(int p0){
       return new k(this, ByteBuffer.allocateDirect(p0), p0);
    }
    public void y(k p0){
       PlatformDependent.f(p0.b);
    }
}
