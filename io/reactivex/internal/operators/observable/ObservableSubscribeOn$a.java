package io.reactivex.internal.operators.observable.ObservableSubscribeOn$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver;
import java.lang.Object;
import io.reactivex.internal.operators.observable.a;
import brd.y;
import brd.w;

public final class ObservableSubscribeOn$a implements Runnable	// class@0018b9
{
    public final ObservableSubscribeOn b;
    public final ObservableSubscribeOn$SubscribeOnObserver parent;

    public void ObservableSubscribeOn$a(ObservableSubscribeOn p0,ObservableSubscribeOn$SubscribeOnObserver p1){
       this.b = p0;
       super();
       this.parent = p1;
    }
    public void run(){
       this.b.b.subscribe(this.parent);
    }
}
