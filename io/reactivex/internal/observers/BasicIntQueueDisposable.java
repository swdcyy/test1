package io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.fuseable.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class BasicIntQueueDisposable extends AtomicInteger implements j	// class@001856
{
    public static final long serialVersionUID = 0xf21923b03613c92f;

    public void BasicIntQueueDisposable(){
       super();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called");
    }
    public final boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called");
    }
}
