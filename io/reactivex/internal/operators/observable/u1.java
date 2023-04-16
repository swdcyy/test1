package io.reactivex.internal.operators.observable.u1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.u1$a;

public final class u1 extends a	// class@00141f
{
    public final z c;
    public final TimeUnit d;

    public void u1(w p0,TimeUnit p1,z p2){
       super(p0);
       this.c = p2;
       this.d = p1;
    }
    public void subscribeActual(y p0){
       this.b.subscribe(new u1$a(p0, this.d, this.c));
    }
}
