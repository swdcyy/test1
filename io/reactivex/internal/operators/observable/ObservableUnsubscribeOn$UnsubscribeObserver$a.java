package io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver;
import java.lang.Object;
import crd.b;

public final class ObservableUnsubscribeOn$UnsubscribeObserver$a implements Runnable	// class@001384
{
    public final ObservableUnsubscribeOn$UnsubscribeObserver b;

    public void ObservableUnsubscribeOn$UnsubscribeObserver$a(ObservableUnsubscribeOn$UnsubscribeObserver p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.s.dispose();
    }
}
