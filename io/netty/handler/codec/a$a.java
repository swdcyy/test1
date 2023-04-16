package io.netty.handler.codec.a$a;
import io.netty.handler.codec.a$c;
import java.lang.Object;
import kqd.e;
import io.netty.buffer.d;
import wqd.n;
import io.netty.handler.codec.a;

public final class a$a implements a$c	// class@0010d8
{

    public void a$a(){
       super();
    }
    public d a(e p0,d p1,d p2){
       if (p1.U6() > (p1.W4() - p2.L5()) || p1.g0() > 1) {
          p1 = a.w(p0, p1, p2.L5());
       }
       p1.C6(p2);
       p2.release();
       return p1;
    }
}
