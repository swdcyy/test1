package io.reactivex.internal.operators.flowable.e$b;
import io.reactivex.internal.subscribers.b;
import cxd.c;
import erd.g;
import erd.a;
import java.lang.Throwable;
import drd.a;
import ird.a;
import java.lang.Object;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.fuseable.o;
import java.lang.Exception;
import io.reactivex.internal.util.ExceptionHelper;

public final class e$b extends b	// class@00126f
{
    public final a f;
    public final a onComplete;
    public final g onError;
    public final g onNext;

    public void e$b(c p0,g p1,g p2,a p3,a p4){
       super(p0);
       this.onNext = p1;
       this.onError = p2;
       this.onComplete = p3;
       this.f = p4;
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
