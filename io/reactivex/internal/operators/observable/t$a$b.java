package io.reactivex.internal.operators.observable.t$a$b;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.t$a;
import java.lang.Throwable;
import java.lang.Object;
import brd.y;
import crd.b;

public final class t$a$b implements Runnable	// class@001405
{
    public final Throwable b;
    public final t$a c;

    public void t$a$b(t$a p0,Throwable p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.actual.onError(this.b);
       this.c.d.dispose();
    }
}
