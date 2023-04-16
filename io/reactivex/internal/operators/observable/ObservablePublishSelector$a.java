package io.reactivex.internal.operators.observable.ObservablePublishSelector$a;
import brd.y;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservablePublishSelector$a implements y	// class@00132f
{
    public final PublishSubject b;
    public final AtomicReference c;

    public void ObservablePublishSelector$a(PublishSubject p0,AtomicReference p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onComplete(){
       this.b.onComplete();
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onNext(Object p0){
       this.b.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.c, p0);
    }
}
