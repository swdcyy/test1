package io.netty.buffer.f$d;
import io.netty.buffer.r;
import io.netty.buffer.f$d$a;
import io.netty.util.Recycler$e;
import kqd.w;
import kqd.e;
import io.netty.buffer.f;
import io.netty.buffer.d;
import io.netty.buffer.a;
import java.lang.Object;
import io.netty.util.Recycler;

public final class f$d extends r	// class@001056
{
    public final Recycler$e s;
    public static final Recycler t;

    static {
       f$d.t = new f$d$a();
    }
    public void f$d(Recycler$e p0){
       super(w.d, 256, Integer.MAX_VALUE);
       this.s = p0;
    }
    public void C7(){
       if (this.y1() > f.d) {
          super.C7();
       }else {
          this.Y1();
          f$d.t.c(this, this.s);
       }
       return;
    }
}
