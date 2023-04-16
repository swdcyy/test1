package io.netty.buffer.f$c;
import io.netty.buffer.p;
import io.netty.buffer.f$c$a;
import io.netty.util.Recycler$e;
import kqd.w;
import kqd.e;
import io.netty.buffer.f;
import io.netty.buffer.d;
import io.netty.buffer.a;
import java.lang.Object;
import io.netty.util.Recycler;

public final class f$c extends p	// class@001054
{
    public final Recycler$e r;
    public static final Recycler s;

    static {
       f$c.s = new f$c$a();
    }
    public void f$c(Recycler$e p0){
       super(w.d, 256, Integer.MAX_VALUE);
       this.r = p0;
    }
    public void C7(){
       if (this.y1() > f.d) {
          super.C7();
       }else {
          this.Y1();
          f$c.s.c(this, this.r);
       }
       return;
    }
}
