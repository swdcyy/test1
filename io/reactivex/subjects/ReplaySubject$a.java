package io.reactivex.subjects.ReplaySubject$a;
import java.lang.Object;
import io.reactivex.subjects.ReplaySubject$ReplayDisposable;

public interface abstract ReplaySubject$a	// class@0014f1
{

    void add(Object p0);
    void addFinal(Object p0);
    boolean compareAndSet(Object p0,Object p1);
    Object get();
    Object getValue();
    Object[] getValues(Object[] p0);
    void replay(ReplaySubject$ReplayDisposable p0);
    int size();
    void trimHead();
}
