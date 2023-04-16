package io.reactivex.internal.operators.observable.c1$a;
import brd.y;
import erd.o;
import java.lang.Object;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Throwable;
import ird.a;
import java.lang.Exception;
import brd.w;
import java.lang.NullPointerException;
import java.lang.String;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import crd.b;

public final class c1$a implements y	// class@0013a7
{
    public final y actual;
    public final o b;
    public final boolean c;
    public final SequentialDisposable d;
    public boolean e;
    public boolean f;

    public void c1$a(y p0,o p1,boolean p2){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = new SequentialDisposable();
    }
    public void onComplete(){
       if (this.f != null) {
          return;
       }
       this.f = true;
       this.e = true;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.e != null) {
          if (this.f != null) {
             a.l(p0);
             return;
          }else {
             this.actual.onError(p0);
             return;
          }
       }else {
          this.e = true;
          if (this.c != null && !p0 instanceof Exception) {
             this.actual.onError(p0);
             return;
          }else {
             w ow = this.b.apply(p0);
             if (ow == null) {
                NullPointerException nullPointerE = new NullPointerException("Observable is null");
                nullPointerE.initCause(p0);
                this.actual.onError(nullPointerE);
                return;
             }else {
                ow.subscribe(this);
                return;
             }
          }
       }
    }
    public void onNext(Object p0){
       if (this.f != null) {
          return;
       }
       this.actual.onNext(p0);
       return;
    }
    public void onSubscribe(b p0){
       this.d.replace(p0);
    }
}
