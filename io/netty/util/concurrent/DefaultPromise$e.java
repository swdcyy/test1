package io.netty.util.concurrent.DefaultPromise$e;
import zqd.p;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.j;
import io.netty.util.concurrent.h;

public class DefaultPromise$e extends p	// class@0010fd
{
    public final j d;
    public final h e;
    public final long f;
    public final long g;
    public final DefaultPromise h;

    public void DefaultPromise$e(DefaultPromise p0,j p1,h p2,long p3,long p4){
       this.h = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super();
    }
    public void run(){
       DefaultPromise.F0(this.d, this.e, this.f, this.g);
    }
}
