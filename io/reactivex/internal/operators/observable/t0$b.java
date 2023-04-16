package io.reactivex.internal.operators.observable.t0$b;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import frd.a;

public final class t0$b implements Callable	// class@001409
{
    public final int b;
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final t parent;

    public void t0$b(t p0,int p1,long p2,TimeUnit p3,z p4){
       super();
       this.parent = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public Object call(){
       return this.parent.replay(this.b, this.c, this.d, this.e);
    }
}
