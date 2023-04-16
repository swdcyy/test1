package kqd.s;
import io.netty.buffer.t;
import io.netty.buffer.d;
import wqd.o;
import wqd.n;
import java.lang.Object;
import java.nio.ByteOrder;

public final class s extends t	// class@001b64
{
    public final o c;

    public void s(d p0,o p1){
       super(p0);
       this.c = p1;
    }
    public d C5(int p0){
       return new s(super.C5(p0), this.c);
    }
    public n b(){
       return this;
    }
    public n d(Object p0){
       return this;
    }
    public d e5(ByteOrder p0){
       this.c.b();
       if (this.f5() == p0) {
          return this;
       }
       return new s(super.e5(p0), this.c);
    }
    public d n3(){
       return new s(super.n3(), this.c);
    }
    public d q6(){
       return new s(super.q6(), this.c);
    }
    public d r6(int p0,int p1){
       return new s(super.r6(p0, p1), this.c);
    }
    public boolean release(){
       boolean b = super.release();
       if (b) {
          this.c.close();
       }
       return b;
    }
    public boolean u(int p0){
       boolean b = super.u(p0);
       if (b) {
          this.c.close();
       }
       return b;
    }
    public d u6(){
       return this;
    }
    public d v6(Object p0){
       return this;
    }
}
