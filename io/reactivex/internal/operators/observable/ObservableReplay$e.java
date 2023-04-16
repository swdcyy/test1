package io.reactivex.internal.operators.observable.ObservableReplay$e;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;

public interface abstract ObservableReplay$e	// class@00134a
{

    void complete();
    void error(Throwable p0);
    void next(Object p0);
    void replay(ObservableReplay$InnerDisposable p0);
}
