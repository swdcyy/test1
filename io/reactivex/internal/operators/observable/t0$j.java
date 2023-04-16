package io.reactivex.internal.operators.observable.t0$j;
import java.util.concurrent.Callable;
import brd.t;
import java.lang.Object;
import frd.a;

public final class t0$j implements Callable	// class@001411
{
    public final t parent;

    public void t0$j(t p0){
       super();
       this.parent = p0;
    }
    public Object call(){
       return this.parent.replay();
    }
}
