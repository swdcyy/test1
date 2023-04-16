package io.netty.util.concurrent.i$d;
import io.netty.util.concurrent.i$b;
import io.netty.util.concurrent.i;
import java.lang.Object;
import yqd.e;
import java.util.concurrent.atomic.AtomicInteger;

public final class i$d implements i$b	// class@00110c
{
    public final i a;

    public void i$d(i p0){
       this.a = p0;
       super();
    }
    public e next(){
       i$d ta = this.a;
       return ta.b[(ta.d.getAndIncrement() & (this.a.b.length - 1))];
    }
}
