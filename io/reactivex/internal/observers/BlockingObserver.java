package io.reactivex.internal.observers.BlockingObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.Queue;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;

public final class BlockingObserver extends AtomicReference implements y, b	// class@0011d9
{
    public final Queue queue;
    public static final Object TERMINATED;
    public static final long serialVersionUID;

    static {
       BlockingObserver.TERMINATED = new Object();
    }
    public void BlockingObserver(Queue p0){
       super();
       this.queue = p0;
    }
    public void dispose(){
       if (DisposableHelper.dispose(this)) {
          this.queue.offer(BlockingObserver.TERMINATED);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       this.queue.offer(NotificationLite.complete());
    }
    public void onError(Throwable p0){
       this.queue.offer(NotificationLite.error(p0));
    }
    public void onNext(Object p0){
       this.queue.offer(NotificationLite.next(p0));
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
