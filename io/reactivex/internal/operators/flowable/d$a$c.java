package io.reactivex.internal.operators.flowable.d$a$c;
import java.lang.Runnable;
import io.reactivex.internal.operators.flowable.d$a;
import java.lang.Object;
import cxd.c;

public final class d$a$c implements Runnable	// class@00126b
{
    public final Object b;
    public final d$a c;

    public void d$a$c(d$a p0,Object p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.c.actual.onNext(this.b);
    }
}
