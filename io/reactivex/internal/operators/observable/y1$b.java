package io.reactivex.internal.operators.observable.y1$b;
import crd.b;
import java.lang.Runnable;
import io.reactivex.internal.observers.k;
import java.lang.Object;
import brd.y;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import io.reactivex.subjects.UnicastSubject;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.fuseable.o;

public final class y1$b extends k implements b, Runnable	// class@001439
{
    public final long K;
    public final TimeUnit L;
    public final z M;
    public final int N;
    public b O;
    public UnicastSubject P;
    public final AtomicReference Q;
    public boolean R;
    public static final Object S;

    static {
       y1$b.S = new Object();
    }
    public void y1$b(y p0,long p1,TimeUnit p2,z p3,int p4){
       super(p0, new MpscLinkedQueue());
       this.Q = new AtomicReference();
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
    }
    public void dispose(){
       this.H = true;
    }
    public void i(){
       DisposableHelper.dispose(this.Q);
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void j(){
       k tG = this.G;
       k tactual = this.actual;
       y1$b tP = this.P;
       int i = 1;
       while (true) {
          y1$b tR = this.R;
          Object obj = tG.poll();
          if (this.I != null && (obj == null || obj == y1$b.S)) {
             this.P = null;
             tG.clear();
             this.i();
             tG = this.J;
             if (tG != null) {
                tP.onError(tG);
                break ;
             }else {
                tP.onComplete();
                break ;
             }
          }else if(obj == null){
             i = - i;
             if (!this.d(i)) {
                return;
             }
             continue ;
          }else if(obj == y1$b.S){
             tP.onComplete();
             if (tR == null) {
                tP = UnicastSubject.g(this.N);
                this.P = tP;
                tactual.onNext(tP);
             }else {
                this.O.dispose();
             }
          }else {
             tP.onNext(NotificationLite.getValue(obj));
          }
       }
       return;
    }
    public void onComplete(){
       this.I = true;
       if (this.a()) {
          this.j();
       }
       this.i();
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       this.J = p0;
       this.I = true;
       if (this.a()) {
          this.j();
       }
       this.i();
       this.actual.onError(p0);
       return;
    }
    public void onNext(Object p0){
       if (this.R != null) {
          return;
       }
       if (this.f()) {
          this.P.onNext(p0);
          if (!this.d(-1)) {
             return;
          }
       }else {
          this.G.offer(NotificationLite.next(p0));
          if (!this.a()) {
             return;
          }
       }
       this.j();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.O, p0)) {
          this.O = p0;
          this.P = UnicastSubject.g(this.N);
          k tactual = this.actual;
          tactual.onSubscribe(this);
          tactual.onNext(this.P);
          if (this.H == null) {
             y1$b tK = this.K;
             DisposableHelper.replace(this.Q, this.M.f(this, tK, tK, this.L));
          }
       }
       return;
    }
    public void run(){
       if (this.H != null) {
          this.R = true;
          this.i();
       }
       this.G.offer(y1$b.S);
       if (this.a()) {
          this.j();
       }
       return;
    }
}
