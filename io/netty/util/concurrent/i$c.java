package io.netty.util.concurrent.i$c;
import io.netty.util.concurrent.i$b;
import io.netty.util.concurrent.i;
import java.lang.Object;
import yqd.e;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Math;

public final class i$c implements i$b	// class@00110b
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public e next(){
       i$c ta = this.a;
       return ta.b[Math.abs((ta.d.getAndIncrement() % this.a.b.length))];
    }
}
