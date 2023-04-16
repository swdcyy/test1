package io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$a;
import grd.c;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;

public final class ObservableWindowBoundarySupplier$a extends c	// class@001390
{
    public boolean b;
    public final ObservableWindowBoundarySupplier$WindowBoundaryMainObserver parent;

    public void ObservableWindowBoundarySupplier$a(ObservableWindowBoundarySupplier$WindowBoundaryMainObserver p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.parent.innerComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.b != null) {
          a.l(p0);
          return;
       }else {
          this.b = true;
          this.parent.innerError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.dispose();
       this.parent.innerNext(this);
       return;
    }
}
