package io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver extends AtomicReference implements y	// class@001354
{
    public final ObservableRetryWhen$RepeatWhenObserver this$0;
    public static final long serialVersionUID = 0x2d2b4e5564d98c4a;

    public void ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver(ObservableRetryWhen$RepeatWhenObserver p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(){
       this.this$0.innerComplete();
    }
    public void onError(Throwable p0){
       this.this$0.innerError(p0);
    }
    public void onNext(Object p0){
       this.this$0.innerNext();
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
