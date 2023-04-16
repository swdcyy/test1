package nqd.b$a$a;
import zqd.p;
import nqd.b$a;
import java.net.SocketAddress;
import nqd.b;
import io.netty.channel.ConnectTimeoutException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import io.netty.util.concurrent.l;
import io.netty.channel.r;
import io.netty.channel.a$a;

public class b$a$a extends p	// class@001eac
{
    public final SocketAddress d;
    public final b$a e;

    public void b$a$a(b$a p0,SocketAddress p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       b a = this.e.f.A;
       ConnectTimeoutException uConnectTime = new ConnectTimeoutException("connection timed out: "+this.d);
       if (a != null && a.y(uConnectTime)) {
          b$a$a te = this.e;
          te.M(te.a0());
       }
       return;
    }
}
