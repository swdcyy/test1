package kqd.r;
import io.netty.buffer.l;
import kqd.r$a;
import io.netty.util.Recycler$e;
import io.netty.buffer.o;
import io.netty.util.internal.PlatformDependent;
import kqd.z;
import io.netty.buffer.a;
import kqd.q;
import io.netty.buffer.s;

public final class r extends l	// class@001b63
{
    public static final Recycler x;

    static {
       r.x = new r$a();
    }
    public void r(Recycler$e p0,int p1,r$a p2){
       super(p0, p1);
    }
    public o A7(){
       if (PlatformDependent.t()) {
          return new z(this);
       }
       return super.A7();
    }
    public byte W6(int p0){
       return s.c(this.p, this.E7(p0));
    }
    public int X6(int p0){
       return s.i(this.p, this.E7(p0));
    }
    public long Z6(int p0){
       return s.l(this.p, this.E7(p0));
    }
    public short b7(int p0){
       return s.o(this.p, this.E7(p0));
    }
    public int d7(int p0){
       return s.r(this.p, this.E7(p0));
    }
    public void f7(int p0,int p1){
       s.u(this.p, this.E7(p0), p1);
    }
    public void g7(int p0,int p1){
       s.A(this.p, this.E7(p0), p1);
    }
    public void i7(int p0,long p1){
       s.D(this.p, this.E7(p0), p1);
    }
    public void k7(int p0,int p1){
       s.G(this.p, this.E7(p0), p1);
    }
    public void m7(int p0,int p1){
       s.J(this.p, this.E7(p0), p1);
    }
}
