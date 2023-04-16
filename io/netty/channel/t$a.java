package io.netty.channel.t$a;
import zqd.p;
import io.netty.channel.t;
import lqd.e;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.channel.i;

public class t$a extends p	// class@0010b0
{
    public final e d;
    public final SocketAddress e;
    public final r f;
    public final t g;

    public void t$a(t p0,e p1,SocketAddress p2,r p3){
       this.g = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
    }
    public void run(){
       i.a(this.d, this.e, this.f);
    }
}
