package io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed$a;
import grd.g;
import brd.z$c;

public final class ObservableDebounceTimed extends a	// class@001303
{
    public final long c;
    public final TimeUnit d;
    public final z e;

    public void ObservableDebounceTimed(w p0,long p1,TimeUnit p2,z p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       ObservableDebounceTimed$a uoa = new ObservableDebounceTimed$a(new g(p0), this.c, this.d, this.e.b());
       this.b.subscribe(v7);
    }
}