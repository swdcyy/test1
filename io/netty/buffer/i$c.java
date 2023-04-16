package io.netty.buffer.i$c;
import io.netty.buffer.i$c$a;
import io.netty.buffer.PoolArena$SizeClass;
import java.lang.Object;
import zqd.f;
import io.netty.util.internal.PlatformDependent;
import zqd.g;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Queue;
import io.netty.buffer.i$c$b;
import kqd.k;
import io.netty.buffer.PoolArena;
import kqd.q;

public abstract class i$c	// class@001060
{
    public final int a;
    public final Queue b;
    public final PoolArena$SizeClass c;
    public int d;
    public static final Recycler e;

    static {
       i$c.e = new i$c$a();
    }
    public void i$c(int p0,PoolArena$SizeClass p1){
       super();
       p0 = f.a(p0);
       this.a = p0;
       g og = (PlatformDependent.q())? new g(p0): new LinkedBlockingQueue(p0);
       this.b = og;
       this.c = p1;
       return;
    }
    public final int a(int p0){
       for (int i = 0; i < p0; i = i + 1) {
          i$c$b uoc$b = this.b.poll();
          if (uoc$b != null) {
             i$c$b b = uoc$b.b;
             uoc$b.a();
             b.a.B(b, uoc$b.c, this.c);
          }else {
             break ;
          }
       }
       return i;
    }
    public abstract void b(k p0,long p1,q p2,int p3);
}
