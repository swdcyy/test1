package io.reactivex.internal.operators.flowable.d$a$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.flowable.d$a;
import java.lang.Object;
import cxd.c;
import crd.b;

public final class d$a$a implements Runnable	// class@001269
{
    public final d$a b;

    public void d$a$a(d$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.actual.onComplete();
       this.b.d.dispose();
    }
}
