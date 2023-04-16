package io.netty.channel.u$i;
import io.netty.channel.j;
import io.netty.channel.b;
import java.lang.Class;
import java.lang.String;
import io.netty.channel.u;
import lqd.f;
import lqd.e;
import java.lang.Throwable;
import ard.b;
import java.lang.Object;
import wqd.m;
import io.netty.channel.g;

public final class u$i extends b implements j	// class@0010cb
{
    public static final String o;

    static {
       u$i.o = u.E(u$i.class);
    }
    public void u$i(u p0){
       super(p0, null, u$i.o, true, false);
    }
    public void a(e p0,Throwable p1){
       u.g.warn("An exceptionCaught\(\) event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", p1);
       m.a(p1);
    }
    public void c(e p0){
    }
    public void d(e p0,Object p1){
       m.a(p1);
    }
    public void f(e p0){
    }
    public void j(e p0){
    }
    public void l(e p0,Object p1){
       u.g.debug("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", p1);
       m.a(p1);
    }
    public void m(e p0){
    }
    public g n0(){
       return this;
    }
    public void r(e p0){
    }
    public void u(e p0){
    }
    public void v(e p0){
    }
    public void z(e p0){
    }
}
