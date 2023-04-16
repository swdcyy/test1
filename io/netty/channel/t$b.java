package io.netty.channel.t$b;
import zqd.p;
import io.netty.channel.t;
import lqd.e;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.channel.i;

public class t$b extends p	// class@0010b1
{
    public final e d;
    public final SocketAddress e;
    public final SocketAddress f;
    public final r g;
    public final t h;

    public void t$b(t p0,e p1,SocketAddress p2,SocketAddress p3,r p4){
       this.h = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void run(){
       i.j(this.d, this.e, this.f, this.g);
    }
}
