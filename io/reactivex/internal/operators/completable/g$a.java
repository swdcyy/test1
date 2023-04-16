package io.reactivex.internal.operators.completable.g$a;
import brd.d0;
import brd.d;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;

public final class g$a implements d0	// class@001207
{
    public final d b;

    public void g$a(d p0){
       super();
       this.b = p0;
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       this.b.onComplete();
    }
}
