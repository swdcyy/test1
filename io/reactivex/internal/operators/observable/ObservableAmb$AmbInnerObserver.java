package io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableAmb$a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import crd.b;

public final class ObservableAmb$AmbInnerObserver extends AtomicReference implements y	// class@0012e3
{
    public final y actual;
    public final int index;
    public final ObservableAmb$a parent;
    public boolean won;
    public static final long serialVersionUID = 0xef8a929d55ebd234;

    public void ObservableAmb$AmbInnerObserver(ObservableAmb$a p0,int p1,y p2){
       super();
       this.parent = p0;
       this.index = p1;
       this.actual = p2;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       if (this.won != null) {
          this.actual.onComplete();
       }else if(this.parent.a(this.index)){
          this.won = true;
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.won != null) {
          this.actual.onError(p0);
       }else if(this.parent.a(this.index)){
          this.won = true;
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.won != null) {
          this.actual.onNext(p0);
       }else if(this.parent.a(this.index)){
          this.won = true;
          this.actual.onNext(p0);
       }else {
          this.get().dispose();
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
