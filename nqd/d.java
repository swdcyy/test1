package nqd.d;
import io.netty.channel.c0;
import java.nio.channels.spi.SelectorProvider;
import java.lang.Object;
import java.util.concurrent.Executor;
import yqd.e;
import lqd.m;
import nqd.c;

public class d extends c0	// class@001eb3
{

    public void d(){
       super(0);
    }
    public void d(int p0){
       Object[] objArray = new Object[]{SelectorProvider.provider()};
       super(p0, null, objArray);
    }
    public e b(Executor p0,Object[] p1){
       return this.m(p0, p1);
    }
    public m m(Executor p0,Object[] p1){
       return new c(this, p0, p1[0]);
    }
}
