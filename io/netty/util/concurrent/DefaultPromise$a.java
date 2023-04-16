package io.netty.util.concurrent.DefaultPromise$a;
import zqd.p;
import io.netty.util.concurrent.DefaultPromise;
import yqd.c;
import io.netty.util.concurrent.f;

public class DefaultPromise$a extends p	// class@0010f9
{
    public final c d;
    public final DefaultPromise e;

    public void DefaultPromise$a(DefaultPromise p0,c p1){
       this.e = p0;
       this.d = p1;
       super();
    }
    public void run(){
       DefaultPromise.E0(this.e, this.d);
       this.e.d = null;
    }
}
