package io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter;
import io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter;
import cxd.c;
import io.reactivex.exceptions.MissingBackpressureException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter;

public final class FlowableCreate$ErrorAsyncEmitter extends FlowableCreate$NoOverflowBaseAsyncEmitter	// class@001224
{
    public static final long serialVersionUID = 0x4b43427a9c2e580;

    public void FlowableCreate$ErrorAsyncEmitter(c p0){
       super(p0);
    }
    public void onOverflow(){
       this.onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
    }
}
