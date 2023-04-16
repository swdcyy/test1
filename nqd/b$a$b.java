package nqd.b$a$b;
import io.netty.channel.f;
import nqd.b$a;
import java.lang.Object;
import io.netty.util.concurrent.f;
import io.netty.channel.e;
import java.util.concurrent.Future;
import nqd.b;
import java.util.concurrent.ScheduledFuture;
import io.netty.channel.r;
import io.netty.channel.a$a;

public class b$a$b implements f	// class@001ead
{
    public final b$a d;

    public void b$a$b(b$a p0){
       this.d = p0;
       super();
    }
    public void a(f p0){
       if (p0.isCancelled()) {
          b b = this.d.f.B;
          if (b != null) {
             b.cancel(false);
          }
          b$a$b td = this.d;
          td.f.A = null;
          td.M(td.a0());
       }
       return;
    }
}
