package io.reactivex.internal.operators.observable.z$a;
import io.reactivex.internal.observers.a;
import brd.y;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.o;

public final class z$a extends a	// class@00143f
{
    public final g f;

    public void z$a(y p0,g p1){
       super(p0);
       this.f = p1;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
       if (this.e == null) {
          this.f.accept(p0);
       }
       return;
    }
    public Object poll(){
       Object obj = this.c.poll();
       if (obj != null) {
          this.f.accept(obj);
       }
       return obj;
    }
    public int requestFusion(int p0){
       return this.e(p0);
    }
}
