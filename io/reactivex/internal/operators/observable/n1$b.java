package io.reactivex.internal.operators.observable.n1$b;
import brd.y;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class n1$b implements y	// class@0013e4
{
    public final y actual;
    public final ArrayCompositeDisposable b;
    public b c;
    public boolean d;
    public boolean e;

    public void n1$b(y p0,ArrayCompositeDisposable p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void onComplete(){
       this.b.dispose();
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.b.dispose();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       if (this.e != null) {
          this.actual.onNext(p0);
       }else if(this.d != null){
          this.e = true;
          this.actual.onNext(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.b.setResource(0, p0);
       }
       return;
    }
}
