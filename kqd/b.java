package kqd.b;
import io.netty.buffer.a;
import java.nio.ByteBuffer;
import io.netty.buffer.d;
import wqd.n;
import java.lang.Object;

public abstract class b extends a	// class@001b52
{

    public void b(int p0){
       super(p0);
    }
    public ByteBuffer P4(int p0,int p1){
       return this.a5(p0, p1);
    }
    public final d Q5(){
       this.w6().Q5();
       return this;
    }
    public final d R5(int p0){
       this.w6().R5(p0);
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       return this.w6().a5(p0, p1);
    }
    public n b(){
       this.u6();
       return this;
    }
    public n d(Object p0){
       this.v6(p0);
       return this;
    }
    public final int g0(){
       return this.w6().g0();
    }
    public n l(int p0){
       this.R5(p0);
       return this;
    }
    public final boolean release(){
       return this.w6().release();
    }
    public n retain(){
       this.Q5();
       return this;
    }
    public final boolean u(int p0){
       return this.w6().u(p0);
    }
    public final d u6(){
       this.w6().u6();
       return this;
    }
    public final d v6(Object p0){
       this.w6().v6(p0);
       return this;
    }
}
