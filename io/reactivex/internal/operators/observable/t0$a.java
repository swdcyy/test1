package io.reactivex.internal.operators.observable.t0$a;
import java.util.concurrent.Callable;
import brd.t;
import java.lang.Object;
import frd.a;

public final class t0$a implements Callable	// class@001408
{
    public final int b;
    public final t parent;

    public void t0$a(t p0,int p1){
       super();
       this.parent = p0;
       this.b = p1;
    }
    public Object call(){
       return this.parent.replay(this.b);
    }
}
