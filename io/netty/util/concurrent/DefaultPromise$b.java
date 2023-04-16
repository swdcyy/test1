package io.netty.util.concurrent.DefaultPromise$b;
import zqd.p;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.g;
import io.netty.util.concurrent.f;

public class DefaultPromise$b extends p	// class@0010fa
{
    public final g d;
    public final DefaultPromise e;

    public void DefaultPromise$b(DefaultPromise p0,g p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       DefaultPromise.A0(this.e, this.d);
       this.e.d = null;
    }
}
