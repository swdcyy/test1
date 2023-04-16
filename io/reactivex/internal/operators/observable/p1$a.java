package io.reactivex.internal.operators.observable.p1$a;
import brd.y;
import brd.w;
import java.lang.Object;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Throwable;
import crd.b;

public final class p1$a implements y	// class@0013ef
{
    public final y actual;
    public final w b;
    public final SequentialDisposable c;
    public boolean d;

    public void p1$a(y p0,w p1){
       super();
       this.actual = p0;
       this.b = p1;
       this.d = true;
       this.c = new SequentialDisposable();
    }
    public void onComplete(){
       if (this.d != null) {
          this.d = false;
          this.b.subscribe(this);
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       if (this.d != null) {
          this.d = false;
       }
       this.actual.onNext(p0);
       return;
    }
    public void onSubscribe(b p0){
       this.c.update(p0);
    }
}
