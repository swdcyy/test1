package io.netty.handler.codec.a$b;
import io.netty.handler.codec.a$c;
import java.lang.Object;
import kqd.e;
import io.netty.buffer.d;
import wqd.n;
import io.netty.handler.codec.a;
import io.netty.buffer.g;
import io.netty.buffer.a;

public final class a$b implements a$c	// class@0010d9
{

    public void a$b(){
       super();
    }
    public d a(e p0,d p1,d p2){
       d uod;
       if (p1.g0() > 1) {
          uod = a.w(p0, p1, p2.L5());
          uod.C6(p2);
          p2.release();
       }else if(p1 instanceof g){
          uod = p1;
       }else {
          uod = p0.g();
          uod.E7(p1).W8(p1.L5());
       }
       uod.E7(p2).W8((uod.U6() + p2.L5()));
       return uod;
    }
}
