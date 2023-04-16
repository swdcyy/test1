package io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class ObservableMergeWithMaybe$MergeWithObserver$OtherObserver extends AtomicReference implements p	// class@001324
{
    public final ObservableMergeWithMaybe$MergeWithObserver parent;
    public static final long serialVersionUID = 0xd743442d415c4a17;

    public void ObservableMergeWithMaybe$MergeWithObserver$OtherObserver(ObservableMergeWithMaybe$MergeWithObserver p0){
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
    public void onSuccess(Object p0){
       this.parent.otherSuccess(p0);
    }
}
