package io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableMergeWithCompletable$MergeWithObserver$OtherObserver extends AtomicReference implements d	// class@001321
{
    public final ObservableMergeWithCompletable$MergeWithObserver parent;
    public static final long serialVersionUID = 0xd743442d415c4a17;

    public void ObservableMergeWithCompletable$MergeWithObserver$OtherObserver(ObservableMergeWithCompletable$MergeWithObserver p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       this.parent.otherComplete();
    }
    public void onError(Throwable p0){
       this.parent.otherError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
