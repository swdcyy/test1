package io.netty.buffer.i$c$b;
import io.netty.util.Recycler$e;
import java.lang.Object;
import io.netty.buffer.i$c;
import io.netty.util.Recycler;

public final class i$c$b	// class@00105f
{
    public final Recycler$e a;
    public k b;
    public long c;

    public void i$c$b(Recycler$e p0){
       super();
       this.c = -1;
       this.a = p0;
    }
    public void a(){
       this.b = null;
       this.c = -1;
       i$c.e.c(this, this.a);
    }
}
