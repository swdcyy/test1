package io.reactivex.internal.operators.observable.t$a$c;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.t$a;
import java.lang.Object;
import brd.y;

public final class t$a$c implements Runnable	// class@001406
{
    public final Object b;
    public final t$a c;

    public void t$a$c(t$a p0,Object p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.actual.onNext(this.b);
    }
}
