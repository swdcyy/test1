package io.reactivex.internal.operators.observable.ObservableTimeoutTimed$c;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$b;
import java.lang.Object;

public final class ObservableTimeoutTimed$c implements Runnable	// class@001382
{
    public final long b;
    public final ObservableTimeoutTimed$b parent;

    public void ObservableTimeoutTimed$c(long p0,ObservableTimeoutTimed$b p1){
       super();
       this.b = p0;
       this.parent = p1;
    }
    public void run(){
       this.parent.onTimeout(this.b);
    }
}
