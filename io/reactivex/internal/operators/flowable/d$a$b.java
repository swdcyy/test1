package io.reactivex.internal.operators.flowable.d$a$b;
import java.lang.Runnable;
import io.reactivex.internal.operators.flowable.d$a;
import java.lang.Throwable;
import java.lang.Object;
import cxd.c;
import crd.b;

public final class d$a$b implements Runnable	// class@00126a
{
    public final Throwable b;
    public final d$a c;

    public void d$a$b(d$a p0,Throwable p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.actual.onError(this.b);
       this.c.d.dispose();
    }
}
