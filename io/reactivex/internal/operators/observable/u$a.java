package io.reactivex.internal.operators.observable.u$a;
import brd.y;
import io.reactivex.internal.operators.observable.u;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Object;
import io.reactivex.internal.operators.observable.u$a$a;
import brd.w;
import java.lang.Throwable;
import ird.a;
import crd.b;

public final class u$a implements y	// class@00141c
{
    public final SequentialDisposable b;
    public final y c;
    public boolean d;
    public final u e;

    public void u$a(u p0,SequentialDisposable p1,y p2){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.e.b.subscribe(new u$a$a(this));
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.c.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       this.onComplete();
    }
    public void onSubscribe(b p0){
       this.b.update(p0);
    }
}
