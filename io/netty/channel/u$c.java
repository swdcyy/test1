package io.netty.channel.u$c;
import zqd.p;
import io.netty.channel.u;
import io.netty.channel.b;

public class u$c extends p	// class@0010c5
{
    public final b d;
    public final b e;
    public final u f;

    public void u$c(u p0,b p1,b p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void run(){
       u$c tf = this.f;
       _monitor_enter(tf);
       this.f.d0(this.d, this.e);
       _monitor_exit(tf);
    }
}
