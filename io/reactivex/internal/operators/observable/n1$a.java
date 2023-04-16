package io.reactivex.internal.operators.observable.n1$a;
import brd.y;
import io.reactivex.internal.operators.observable.n1;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.operators.observable.n1$b;
import grd.g;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class n1$a implements y	// class@0013e3
{
    public final ArrayCompositeDisposable b;
    public final n1$b c;
    public final g d;
    public b e;
    public final n1 f;

    public void n1$a(n1 p0,ArrayCompositeDisposable p1,n1$b p2,g p3){
       this.f = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void onComplete(){
       this.c.d = true;
    }
    public void onError(Throwable p0){
       this.b.dispose();
       this.d.onError(p0);
    }
    public void onNext(Object p0){
       this.e.dispose();
       p0.d = true;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.e, p0)) {
          this.e = p0;
          this.b.setResource(1, p0);
       }
       return;
    }
}
