package io.reactivex.internal.subscribers.c;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract c	// class@0014be
{

    void a(InnerQueuedSubscriber p0);
    void b(InnerQueuedSubscriber p0,Throwable p1);
    void c(InnerQueuedSubscriber p0,Object p1);
    void drain();
}
