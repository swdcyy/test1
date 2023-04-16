package io.netty.channel.t$q;
import io.netty.channel.f0$a;
import zqd.v;
import java.lang.String;
import zqd.x;
import io.netty.channel.t$q$a;
import io.netty.util.Recycler$e;
import java.lang.Object;
import io.netty.channel.d;
import lqd.e;
import io.netty.channel.d$a;
import io.netty.channel.m;
import io.netty.channel.r;
import io.netty.channel.i;

public final class t$q extends v implements f0$a	// class@0010c1
{
    public e e;
    public Object f;
    public r g;
    public int h;
    public static final boolean i;
    public static final int j;
    public static final Recycler k;

    static {
       t$q.i = x.c("io.netty.transport.estimateSizeOnSubmit", true);
       t$q.j = x.d("io.netty.transport.writeTaskSizeOverhead", 48);
       t$q.k = new t$q$a();
    }
    public void t$q(Recycler$e p0){
       super(p0);
    }
    public Object e(){
       return this;
    }
    public void run(){
       m om = this.e.o().W3().j0();
       if (t$q.i && om != null) {
          om.d((long)this.h, true, true);
       }
       i.q(this.e, this.f, this.g);
       this.e = null;
       this.f = null;
       this.g = null;
       return;
    }
}
