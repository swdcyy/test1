package io.netty.channel.u$g;
import zqd.p;
import io.netty.channel.u;
import io.netty.channel.b;
import java.lang.Thread;

public class u$g extends p	// class@0010c9
{
    public final b d;
    public final u e;

    public void u$g(u p0,b p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       this.e.u(Thread.currentThread(), this.d, true);
    }
}
