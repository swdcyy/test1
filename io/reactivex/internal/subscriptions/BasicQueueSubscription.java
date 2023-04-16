package io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.fuseable.l;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class BasicQueueSubscription extends AtomicLong implements l	// class@0014c0
{
    public static final long serialVersionUID = 0xa36a0055d1c5e19a;

    public void BasicQueueSubscription(){
       super();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
}
