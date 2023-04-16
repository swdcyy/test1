package io.reactivex.internal.operators.observable.t$a$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.t$a;
import java.lang.Object;
import brd.y;
import crd.b;

public final class t$a$a implements Runnable	// class@001404
{
    public final t$a b;

    public void t$a$a(t$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.actual.onComplete();
       this.b.d.dispose();
    }
}
