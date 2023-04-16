package io.reactivex.internal.operators.single.f$a;
import brd.d0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import crd.b;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class f$a implements d0	// class@00148e
{
    public final d0 actual;
    public boolean b;
    public final g onSubscribe;

    public void f$a(d0 p0,g p1){
       super();
       this.actual = p0;
       this.onSubscribe = p1;
    }
    public void onError(Throwable p0){
       if (this.b != null) {
          a.l(p0);
          return;
       }else {
          this.actual.onError(p0);
          return;
       }
    }
    public void onSubscribe(b p0){
       this.onSubscribe.accept(p0);
       this.actual.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       if (this.b != null) {
          return;
       }
       this.actual.onSuccess(p0);
       return;
    }
}
