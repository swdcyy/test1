package io.reactivex.internal.operators.observable.ObservableMergeWithSingle$MergeWithObserver$OtherObserver;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle$MergeWithObserver;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class ObservableMergeWithSingle$MergeWithObserver$OtherObserver extends AtomicReference implements d0	// class@001327
{
    public final ObservableMergeWithSingle$MergeWithObserver parent;
    public static final long serialVersionUID = 0xd743442d415c4a17;

    public void ObservableMergeWithSingle$MergeWithObserver$OtherObserver(ObservableMergeWithSingle$MergeWithObserver p0){
       super();
       this.parent = p0;
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
