package io.reactivex.internal.operators.observable.ObservableBuffer$a;
import brd.y;
import crd.b;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableBuffer$a implements y, b	// class@0012e7
{
    public final y actual;
    public final int b;
    public final Callable c;
    public Collection d;
    public int e;
    public b f;

    public void ObservableBuffer$a(y p0,int p1,Callable p2){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(){
       Object obj = this.c.call();
       a.c(obj, "Empty buffer supplied");
       this.d = obj;
       return true;
    }
    public void dispose(){
       this.f.dispose();
    }
    public boolean isDisposed(){
       return this.f.isDisposed();
    }
    public void onComplete(){
       ObservableBuffer$a td = this.d;
       if (td != null) {
          this.d = null;
          if (!td.isEmpty()) {
             this.actual.onNext(td);
          }
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.d = null;
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       ObservableBuffer$a td = this.d;
       if (td != null) {
          td.add(p0);
          int i = this.e + 1;
          this.e = i;
          if (i >= this.b) {
             this.actual.onNext(td);
             this.e = 0;
             this.a();
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.f, p0)) {
          this.f = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
