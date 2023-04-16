package io.reactivex.internal.operators.flowable.e$a;
import io.reactivex.internal.subscribers.a;
import io.reactivex.internal.fuseable.a;
import erd.g;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import cxd.c;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.fuseable.o;
import java.lang.Exception;
import io.reactivex.internal.util.ExceptionHelper;

public final class e$a extends a	// class@00126e
{
    public final a f;
    public final a onComplete;
    public final g onError;
    public final g onNext;

    public void e$a(a p0,g p1,g p2,a p3,a p4){
       super(p0);
       this.onNext = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.f = p4;
    }
    public boolean d(Object p0){
       if (this.d != null) {
          return false;
       }
       this.onNext.accept(p0);
       return this.actual.d(p0);
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.onComplete.run();
       this.d = true;
       this.actual.onComplete();
       this.f.run();
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          boolean b = true;
          this.d = b;
          this.onError.accept(p0);
          if (b) {
             this.actual.onError(p0);
          }
          this.f.run();
          return;
       }
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (this.e != null) {
          this.actual.onNext(null);
          return;
       }else {
          this.onNext.accept(p0);
          this.actual.onNext(p0);
          return;
       }
    }
    public Object poll(){
       Object obj = this.c.poll();
       if (obj != null) {
          this.onNext.accept(obj);
          this.f.run();
       }else if(this.e == 1){
          this.onComplete.run();
          this.f.run();
       }
       return obj;
    }
    public int requestFusion(int p0){
       return this.f(p0);
    }
}
