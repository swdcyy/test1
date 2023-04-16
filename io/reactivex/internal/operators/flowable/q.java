package io.reactivex.internal.operators.flowable.q;
import io.reactivex.internal.operators.flowable.FlowableReplay$InnerSubscription;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract q	// class@001285
{

    void a(FlowableReplay$InnerSubscription p0);
    void complete();
    void error(Throwable p0);
    void next(Object p0);
}
