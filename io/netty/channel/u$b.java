package io.netty.channel.u$b;
import zqd.p;
import io.netty.channel.u;
import io.netty.channel.b;

public class u$b extends p	// class@0010c4
{
    public final b d;
    public final u e;

    public void u$b(u p0,b p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       u$b te = this.e;
       _monitor_enter(te);
       this.e.a0(this.d);
       _monitor_exit(te);
    }
}
