package io.reactivex.internal.operators.observable.p0$a;
import brd.g;
import crd.b;
import brd.y;
import erd.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.IllegalStateException;

public final class p0$a implements g, b	// class@0013ed
{
    public final y actual;
    public final c b;
    public final g c;
    public Object d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void p0$a(y p0,c p1,g p2,Object p3){
       super();
       this.actual = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(Object p0){
       this.c.accept(p0);
       return;
    }
    public void dispose(){
       this.e = true;
    }
    public boolean isDisposed(){
       return this.e;
    }
    public void onComplete(){
       if (this.f == null) {
          this.f = true;
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       NullPointerException nullPointerE;
       if (this.f != null) {
          a.l(p0);
       }else if(p0 == null){
          nullPointerE = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       }
       this.f = true;
       this.actual.onError(nullPointerE);
       return;
    }
    public void onNext(Object p0){
       if (this.f == null) {
          if (this.g != null) {
             this.onError(new IllegalStateException("onNext already called in this generate turn"));
          }else if(p0 == null){
             this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          }else {
             this.g = true;
             this.actual.onNext(p0);
          }
       }
       return;
    }
}
