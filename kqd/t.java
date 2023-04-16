package kqd.t;
import io.netty.buffer.u;
import io.netty.buffer.g;
import wqd.o;
import io.netty.buffer.d;
import kqd.s;
import java.nio.ByteOrder;

public final class t extends u	// class@001b65
{
    public final o v;

    public void t(g p0,o p1){
       super(p0);
       this.v = p1;
    }
    public d C5(int p0){
       return new s(super.C5(p0), this.v);
    }
    public d e5(ByteOrder p0){
       this.v.b();
       if (this.f5() == p0) {
          return this;
       }
       return new s(super.e5(p0), this.v);
    }
    public d n3(){
       return new s(super.n3(), this.v);
    }
    public d q6(){
       return new s(super.q6(), this.v);
    }
    public d r6(int p0,int p1){
       return new s(super.r6(p0, p1), this.v);
    }
    public boolean release(){
       boolean b = super.release();
       if (b) {
          this.v.close();
       }
       return b;
    }
    public boolean u(int p0){
       boolean b = super.u(p0);
       if (b) {
          this.v.close();
       }
       return b;
    }
}
