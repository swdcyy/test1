package io.reactivex.internal.operators.observable.t0$o;
import erd.o;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Iterable;

public final class t0$o implements o	// class@001416
{
    public final o b;

    public void t0$o(o p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       return t.zipIterable(p0, this.b, false, t.bufferSize());
    }
}
