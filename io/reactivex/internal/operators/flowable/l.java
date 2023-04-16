package io.reactivex.internal.operators.flowable.l;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightEndSubscriber;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin$LeftRightSubscriber;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract l	// class@00127c
{

    void a(boolean p0,FlowableGroupJoin$LeftRightEndSubscriber p1);
    void b(FlowableGroupJoin$LeftRightSubscriber p0);
    void innerCloseError(Throwable p0);
    void innerError(Throwable p0);
    void innerValue(boolean p0,Object p1);
}
