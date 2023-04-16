package io.reactivex.internal.operators.observable.ObservableReplay$b;
import erd.g;
import io.reactivex.internal.operators.observable.ObserverResourceWrapper;
import java.lang.Object;
import crd.b;

public final class ObservableReplay$b implements g	// class@001347
{
    public final ObserverResourceWrapper b;

    public void ObservableReplay$b(ObserverResourceWrapper p0){
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       this.b.setResource(p0);
    }
}
