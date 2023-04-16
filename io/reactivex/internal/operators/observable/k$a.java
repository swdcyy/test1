package io.reactivex.internal.operators.observable.k$a;
import grd.c;
import io.reactivex.internal.operators.observable.k$b;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;

public final class k$a extends c	// class@0013cb
{
    public boolean b;
    public final k$b parent;

    public void k$a(k$b p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.parent.i();
       return;
    }
    public void onError(Throwable p0){
       if (this.b != null) {
          a.l(p0);
          return;
       }else {
          this.b = true;
          this.parent.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.dispose();
       this.parent.i();
       return;
    }
}
