package io.netty.channel.l;
import io.netty.channel.k;
import java.lang.Class;
import ard.b;
import ard.c;
import lqd.e;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import io.netty.channel.d;
import java.lang.Object;
import lqd.i;
import io.netty.channel.g;
import io.netty.channel.e;

public abstract class l extends k	// class@0010a2
{
    public static final b c;

    static {
       l.c = c.a(l.class);
    }
    public void l(){
       super();
    }
    public void a(e p0,Throwable p1){
       l.c.warn("Failed to initialize a channel. Closing: "+p0.o(), p1);
       i oi = p0.d0();
       if (oi.Z2(this) != null) {
          oi.T2(this);
       }
       p0.close();
       return;
    }
    public abstract void o(d p0);
    public final void v(e p0){
       this.o(p0.o());
       p0.d0().T2(this);
       p0.x();
    }
}
