package io.netty.channel.g0$a;
import io.netty.channel.f;
import io.netty.channel.g0;
import java.lang.Object;
import io.netty.util.concurrent.f;
import io.netty.channel.e;
import java.lang.Throwable;

public class g0$a implements f	// class@001099
{
    public final g0 d;

    public void g0$a(g0 p0){
       this.d = p0;
       super();
    }
    public void a(f p0){
       if (!p0.isSuccess()) {
          this.d.t0(p0.z());
       }
       return;
    }
}
