package jqd.b;
import yqd.i;
import jqd.c;
import io.netty.channel.d;
import io.netty.channel.r;
import java.net.SocketAddress;
import io.netty.channel.e;
import java.lang.Object;
import io.netty.util.concurrent.f;
import java.lang.Throwable;

public class b implements i	// class@00172a
{
    public final d d;
    public final r e;
    public final SocketAddress f;
    public final e g;
    public final c h;

    public void b(c p0,d p1,r p2,SocketAddress p3,e p4){
       this.h = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void a(f p0){
       if (p0.z() != null) {
          this.d.close();
          this.e.a(p0.z());
       }else {
          c.g(p0.A(), this.f, this.g, this.e);
       }
       return;
    }
}
