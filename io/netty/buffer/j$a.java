package io.netty.buffer.j$a;
import io.netty.util.concurrent.e;
import io.netty.buffer.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Math;
import io.netty.buffer.i;
import io.netty.buffer.PoolArena;
import wqd.q;
import java.lang.String;
import java.util.Objects;
import java.lang.Thread;
import java.lang.Runnable;

public final class j$a extends e	// class@001064
{
    public final AtomicInteger c;
    public final AtomicInteger d;
    public final j e;

    public void j$a(j p0){
       this.e = p0;
       super();
       this.c = new AtomicInteger();
       this.d = new AtomicInteger();
    }
    public Object d(){
       this.d.incrementAndGet();
       int andIncrement = this.c.getAndIncrement();
       j d = this.e.d;
       int i = 0;
       object oobject = (d != null)? d[Math.abs((andIncrement % d.length))]: i;
       d = this.e.e;
       if (d != null) {
          i = d[Math.abs((andIncrement % d.length))];
       }
       j$a te = this.e;
       i oi = new i(oobject, i, te.f, te.g, te.h, j.t, j.u);
       return andIncrement;
    }
    public void e(Object p0){
       i m = p0.m;
       i n = p0.n;
       Objects.requireNonNull(m, "thread");
       Objects.requireNonNull(n, "task");
       q.a(m, n, false);
       p0.i();
       this.d.decrementAndGet();
    }
}
