package io.reactivex.internal.operators.observable.z1$a;
import brd.y;
import crd.b;
import java.util.Iterator;
import erd.c;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class z1$a implements y, b	// class@001442
{
    public final y actual;
    public final Iterator b;
    public final c c;
    public b d;
    public boolean e;

    public void z1$a(y p0,Iterator p1,c p2){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(Throwable p0){
       this.e = true;
       this.d.dispose();
       this.actual.onError(p0);
    }
    public void dispose(){
       this.d.dispose();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.e != null) {
          a.l(p0);
          return;
       }else {
          this.e = true;
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.e != null) {
          return;
       }
       Object obj = this.b.next();
       a.c(obj, "The iterator returned a null value");
       p0 = this.c.a(p0, obj);
       a.c(p0, "The zipper function returned a null value");
       this.actual.onNext(p0);
       if (!this.b.hasNext()) {
          this.e = true;
          this.d.dispose();
          this.actual.onComplete();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
