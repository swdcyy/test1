package jqd.c$b;
import zqd.p;
import io.netty.channel.e;
import java.net.SocketAddress;
import io.netty.channel.d;
import io.netty.channel.r;
import io.netty.util.concurrent.f;
import io.netty.channel.f;
import io.netty.util.concurrent.g;
import java.lang.Throwable;

public final class c$b extends p	// class@00172c
{
    public final e d;
    public final SocketAddress e;
    public final d f;
    public final SocketAddress g;
    public final r h;

    public void c$b(e p0,SocketAddress p1,d p2,SocketAddress p3,r p4){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       super();
    }
    public void run(){
       if (this.d.isSuccess()) {
          c$b te = this.e;
          if (te == null) {
             this.f.V(this.g, this.h);
          }else {
             this.f.O(this.g, te, this.h);
          }
          this.h.f(f.b);
       }else {
          this.h.a(this.d.z());
       }
       return;
    }
}
