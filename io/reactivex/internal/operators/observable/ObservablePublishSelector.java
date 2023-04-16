package io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.ObservablePublishSelector$TargetObserver;
import io.reactivex.internal.operators.observable.ObservablePublishSelector$a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservablePublishSelector extends a	// class@001330
{
    public final o c;

    public void ObservablePublishSelector(w p0,o p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       PublishSubject publishSubje = PublishSubject.g();
       Object obj = this.c.apply(publishSubje);
       a.c(obj, "The selector returned a null ObservableSource");
       ObservablePublishSelector$TargetObserver targetObserv = new ObservablePublishSelector$TargetObserver(p0);
       obj.subscribe(targetObserv);
       this.b.subscribe(new ObservablePublishSelector$a(publishSubje, targetObserv));
    }
}
