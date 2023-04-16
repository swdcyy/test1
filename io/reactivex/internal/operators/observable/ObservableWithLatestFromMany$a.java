package io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$a;
import erd.o;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class ObservableWithLatestFromMany$a implements o	// class@001397
{
    public final ObservableWithLatestFromMany b;

    public void ObservableWithLatestFromMany$a(ObservableWithLatestFromMany p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray = new Object[]{p0};
       p0 = this.b.e.apply(objArray);
       a.c(p0, "The combiner returned a null value");
       return p0;
    }
}
