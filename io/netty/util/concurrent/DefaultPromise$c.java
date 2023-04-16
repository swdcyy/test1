package io.netty.util.concurrent.DefaultPromise$c;
import zqd.p;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.g;
import io.netty.util.concurrent.DefaultPromise;

public final class DefaultPromise$c extends p	// class@0010fb
{
    public final f d;
    public final g e;

    public void DefaultPromise$c(f p0,g p1){
       this.d = p0;
       this.e = p1;
       super();
    }
    public void run(){
       DefaultPromise.A0(this.d, this.e);
    }
}
