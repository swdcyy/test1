package io.reactivex.internal.operators.mixed.SingleFlatMapObservable$FlatMapObserver;
import brd.y;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import drd.a;

public final class SingleFlatMapObservable$FlatMapObserver extends AtomicReference implements y, d0, b	// class@0012de
{
    public final y downstream;
    public final o mapper;
    public static final long serialVersionUID = 0x83d160f5b9057b50;

    public void SingleFlatMapObservable$FlatMapObserver(y p0,o p1){
       super();
       this.downstream = p0;
       this.mapper = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.downstream.onComplete();
    }
    public void onError(Throwable p0){
       this.downstream.onError(p0);
    }
    public void onNext(Object p0){
       this.downstream.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this, p0);
    }
    public void onSuccess(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null Publisher");
       p0.subscribe(this);
    }
}
