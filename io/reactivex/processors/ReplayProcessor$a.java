package io.reactivex.processors.ReplayProcessor$a;
import io.reactivex.processors.ReplayProcessor$ReplaySubscription;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract ReplayProcessor$a	// class@0014e4
{

    void a(ReplayProcessor$ReplaySubscription p0);
    void complete();
    void error(Throwable p0);
    Throwable getError();
    Object getValue();
    Object[] getValues(Object[] p0);
    boolean isDone();
    void next(Object p0);
    int size();
    void trimHead();
}
