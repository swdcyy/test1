package io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.fuseable.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class BasicIntQueueSubscription extends AtomicInteger implements l	// class@0014bf
{
    public static final long serialVersionUID = 0xa36a0055d1c5e19a;

    public void BasicIntQueueSubscription(){
       super();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
}
