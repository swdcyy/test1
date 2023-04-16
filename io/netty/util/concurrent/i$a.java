package io.netty.util.concurrent.i$a;
import yqd.i;
import io.netty.util.concurrent.i;
import java.lang.Object;
import io.netty.util.concurrent.f;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.concurrent.l;

public class i$a implements i	// class@001109
{
    public final i d;

    public void i$a(i p0){
       this.d = p0;
       super();
    }
    public void a(f p0){
       i$a td = this.d;
       if (this.d.e.incrementAndGet() == td.b.length) {
          td.f.p(null);
       }
       return;
    }
}
