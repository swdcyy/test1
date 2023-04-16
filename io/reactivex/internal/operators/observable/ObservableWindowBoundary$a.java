package io.reactivex.internal.operators.observable.ObservableWindowBoundary$a;
import grd.c;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;

public final class ObservableWindowBoundary$a extends c	// class@00138d
{
    public boolean b;
    public final ObservableWindowBoundary$WindowBoundaryMainObserver parent;

    public void ObservableWindowBoundary$a(ObservableWindowBoundary$WindowBoundaryMainObserver p0){
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
       this.parent.innerNext();
       return;
    }
}
