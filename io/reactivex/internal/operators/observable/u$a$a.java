package io.reactivex.internal.operators.observable.u$a$a;
import brd.y;
import io.reactivex.internal.operators.observable.u$a;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class u$a$a implements y	// class@00141b
{
    public final u$a b;

    public void u$a$a(u$a p0){
       this.b = p0;
       super();
    }
    public void onComplete(){
       this.b.c.onComplete();
    }
    public void onError(Throwable p0){
       this.b.c.onError(p0);
    }
    public void onNext(Object p0){
       this.b.c.onNext(p0);
    }
    public void onSubscribe(b p0){
       this.b.b.update(p0);
    }
}
