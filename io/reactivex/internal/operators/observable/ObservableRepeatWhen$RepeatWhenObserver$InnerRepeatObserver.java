package io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver extends AtomicReference implements y	// class@00133c
{
    public final ObservableRepeatWhen$RepeatWhenObserver this$0;
    public static final long serialVersionUID = 0x2d2b4e5564d98c4a;

    public void ObservableRepeatWhen$RepeatWhenObserver$InnerRepeatObserver(ObservableRepeatWhen$RepeatWhenObserver p0){
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
