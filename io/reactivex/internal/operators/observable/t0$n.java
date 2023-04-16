package io.reactivex.internal.operators.observable.t0$n;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import frd.a;

public final class t0$n implements Callable	// class@001415
{
    public final long b;
    public final TimeUnit c;
    public final z d;
    public final t parent;

    public void t0$n(t p0,long p1,TimeUnit p2,z p3){
       super();
       this.parent = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public Object call(){
       return this.parent.replay(this.b, this.c, this.d);
    }
}
