package io.netty.channel.m$c;
import zqd.p;
import io.netty.channel.m;
import java.nio.channels.ClosedChannelException;

public class m$c extends p	// class@0010a5
{
    public final ClosedChannelException d;
    public final m e;

    public void m$c(m p0,ClosedChannelException p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       this.e.b(this.d);
    }
}
