package io.netty.channel.u$h;
import io.netty.channel.n;
import io.netty.channel.b;
import java.lang.Class;
import java.lang.String;
import io.netty.channel.u;
import lqd.f;
import io.netty.channel.d;
import io.netty.channel.d$a;
import lqd.e;
import java.lang.Object;
import io.netty.channel.r;
import java.lang.Throwable;
import java.net.SocketAddress;
import io.netty.channel.g;

public final class u$h extends b implements n	// class@0010ca
{
    public final d$a o;
    public static final String p;

    static {
       u$h.p = u.E(u$h.class);
    }
    public void u$h(u p0){
       super(p0, null, u$h.p, false, true);
       this.o = p0.o().W3();
    }
    public void D(e p0,Object p1,r p2){
       this.o.L(p1, p2);
    }
    public void a(e p0,Throwable p1){
       p0.A(p1);
    }
    public void b(e p0){
       this.o.flush();
    }
    public void e(e p0,SocketAddress p1,SocketAddress p2,r p3){
       this.o.O(p1, p2, p3);
    }
    public void f(e p0){
    }
    public void g(e p0,SocketAddress p1,r p2){
       this.o.K(p1, p2);
    }
    public void h(e p0,r p1){
       this.o.M(p1);
    }
    public void k(e p0,r p1){
       this.o.S(p1);
    }
    public void m(e p0){
    }
    public void n(e p0,r p1){
       this.o.I(p1);
    }
    public g n0(){
       return this;
    }
    public void p(e p0){
       this.o.l0();
    }
}
