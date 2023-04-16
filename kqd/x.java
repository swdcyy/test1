package kqd.x;
import io.netty.buffer.q;
import kqd.e;
import io.netty.buffer.o;
import io.netty.util.internal.PlatformDependent;
import kqd.z;
import io.netty.buffer.a;
import io.netty.buffer.d;
import io.netty.buffer.s;

public final class x extends q	// class@001b69
{

    public void x(e p0,int p1,int p2){
       super(p0, p1, p2);
    }
    public o A7(){
       if (PlatformDependent.t()) {
          return new z(this);
       }
       return super.A7();
    }
    public short D4(int p0){
       this.r7(p0, 2);
       return this.b7(p0);
    }
    public int I4(int p0){
       this.r7(p0, 3);
       return this.d7(p0);
    }
    public d T5(int p0,int p1){
       this.q7(p0);
       this.f7(p0, p1);
       return this;
    }
    public byte W6(int p0){
       return s.c(this.n, p0);
    }
    public int X6(int p0){
       return s.i(this.n, p0);
    }
    public long Z6(int p0){
       return s.l(this.n, p0);
    }
    public short b7(int p0){
       return s.o(this.n, p0);
    }
    public int d7(int p0){
       return s.r(this.n, p0);
    }
    public void f7(int p0,int p1){
       s.u(this.n, p0, p1);
    }
    public d g6(int p0,int p1){
       this.r7(p0, 4);
       this.g7(p0, p1);
       return this;
    }
    public void g7(int p0,int p1){
       s.A(this.n, p0, p1);
    }
    public int getInt(int p0){
       this.r7(p0, 4);
       return this.X6(p0);
    }
    public long getLong(int p0){
       this.r7(p0, 8);
       return this.Z6(p0);
    }
    public d i6(int p0,long p1){
       this.r7(p0, 8);
       this.i7(p0, p1);
       return this;
    }
    public void i7(int p0,long p1){
       s.D(this.n, p0, p1);
    }
    public d k6(int p0,int p1){
       this.r7(p0, 3);
       this.k7(p0, p1);
       return this;
    }
    public void k7(int p0,int p1){
       s.G(this.n, p0, p1);
    }
    public d m6(int p0,int p1){
       this.r7(p0, 2);
       this.m7(p0, p1);
       return this;
    }
    public void m7(int p0,int p1){
       s.J(this.n, p0, p1);
    }
    public byte p4(int p0){
       this.q7(p0);
       return this.W6(p0);
    }
}
