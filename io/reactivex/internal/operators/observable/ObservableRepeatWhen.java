package io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen$RepeatWhenObserver;
import crd.b;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableRepeatWhen extends a	// class@00133e
{
    public final o c;

    public void ObservableRepeatWhen(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       c uoc = PublishSubject.g().f();
       Object obj = this.c.apply(uoc);
       a.c(obj, "The handler returned a null ObservableSource");
       ObservableRepeatWhen$RepeatWhenObserver repeatWhenOb = new ObservableRepeatWhen$RepeatWhenObserver(p0, uoc, this.b);
       p0.onSubscribe(repeatWhenOb);
       obj.subscribe(repeatWhenOb.inner);
       repeatWhenOb.subscribeNext();
    }
}
