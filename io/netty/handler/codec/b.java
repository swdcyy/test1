package io.netty.handler.codec.b;
import io.netty.channel.o;
import java.lang.Class;
import zqd.y;
import java.lang.Object;
import java.lang.String;
import lqd.e;
import io.netty.channel.r;
import kqd.e;
import io.netty.buffer.d;
import wqd.m;
import io.netty.channel.e;
import wqd.n;
import kqd.v;
import io.netty.handler.codec.EncoderException;
import java.lang.Throwable;

public abstract class b extends o	// class@0010dc
{
    public final y c;
    public final boolean d;

    public void b(){
       super(true);
    }
    public void b(Class p0){
       super();
       this.c = y.c(p0);
       this.d = true;
    }
    public void b(boolean p0){
       super();
       this.c = y.b(this, b.class, "I");
       this.d = p0;
    }
    public void D(e p0,Object p1,r p2){
       d uod = null;
       try{
          if (this.c.d(p1)) {
             uod = (this.d != null)? p0.m0().l(): p0.m0().s();
             this.o(p0, p1, uod);
             m.a(p1);
             if (uod.R4()) {
                p0.L(uod, p2);
             }else {
                uod.release();
                p0.L(v.d, p2);
             }
          }else {
             p0.L(p1, p2);
          }
          return;
       }catch(io.netty.handler.codec.EncoderException e3){
          throw e3;
       }
    }
    public abstract void o(e p0,Object p1,d p2);
}
