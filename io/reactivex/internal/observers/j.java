package io.reactivex.internal.observers.j;
import io.reactivex.internal.observers.InnerQueuedObserver;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract j	// class@0011e8
{

    void drain();
    void innerComplete(InnerQueuedObserver p0);
    void innerError(InnerQueuedObserver p0,Throwable p1);
    void innerNext(InnerQueuedObserver p0,Object p1);
}
