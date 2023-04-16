package io.reactivex.internal.operators.observable.ObservableGroupJoin$a;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver;
import java.lang.Object;

public interface abstract ObservableGroupJoin$a	// class@001319
{

    void innerClose(boolean p0,ObservableGroupJoin$LeftRightEndObserver p1);
    void innerCloseError(Throwable p0);
    void innerComplete(ObservableGroupJoin$LeftRightObserver p0);
    void innerError(Throwable p0);
    void innerValue(boolean p0,Object p1);
}
