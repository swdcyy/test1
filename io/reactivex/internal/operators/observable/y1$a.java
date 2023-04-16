package io.reactivex.internal.operators.observable.y1$a;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import brd.z$c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.operators.observable.y1$a$a;
import java.lang.Throwable;
import io.reactivex.subjects.UnicastSubject;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Runnable;
import io.reactivex.internal.fuseable.o;

public final class y1$a extends k implements b	// class@001438
{
    public final long K;
    public final TimeUnit L;
    public final z M;
    public final int N;
    public final boolean O;
    public final long P;
    public final z$c Q;
    public long R;
    public long S;
    public b T;
    public UnicastSubject U;
    public boolean V;
    public final AtomicReference W;

    public void y1$a(y p0,long p1,TimeUnit p2,z p3,int p4,long p5,boolean p6){
       super(p0, new MpscLinkedQueue());
       this.W = new AtomicReference();
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.P = p5;
       this.O = p6;
       this.Q = (p6)? p3.b(): null;
       return;
    }
    public void dispose(){
       this.H = true;
    }
    public void i(){
       DisposableHelper.dispose(this.W);
       y1$a tQ = this.Q;
       if (tQ != null) {
          tQ.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void j(){
       k tG = this.G;
       k tactual = this.actual;
       y1$a tU = this.U;
       int i = 1;
       while (true) {
          if (this.V != null) {
             this.T.dispose();
             tG.clear();
             this.i();
             return;
          }else {
             k tI = this.I;
             b obj = tG.poll();
             y1$a uoa = (obj == null)? 1: null;
             v8 = obj instanceof y1$a$a;
             if (tI != null && (uoa || v8)) {
                this.U = null;
                tG.clear();
                this.i();
                tG = this.J;
                if (tG != null) {
                   tU.onError(tG);
                   break ;
                }else {
                   tU.onComplete();
                   break ;
                }
             }else if(uoa){
                i = - i;
                if (!this.d(i)) {
                   return;
                }
             }else if(v8){
                if (this.O != null || !this.S - obj.b) {
                   tU.onComplete();
                   this.R = 0;
                   tU = UnicastSubject.g(this.N);
                   this.U = tU;
                   tactual.onNext(tU);
                }
             }else {
                tU.onNext(NotificationLite.getValue(obj));
                long l = 1;
                long l1 = this.R + l;
                if (l1 - this.P >= 0) {
                   l1 = this.S + l;
                   this.S = l1;
                   this.R = 0;
                   tU.onComplete();
                   tU = UnicastSubject.g(this.N);
                   this.U = tU;
                   this.actual.onNext(tU);
                   if (this.O != null) {
                      b uob = this.W.get();
                      uob.dispose();
                      y1$a tK = this.K;
                      obj = this.Q.d(new y1$a$a(this.S, this), tK, tK, this.L);
                      if (!this.W.compareAndSet(uob, obj)) {
                         obj.dispose();
                      }
                   }
                }else {
                   this.R = l1;
                }
             }
          }
       }
       return;
    }
    public void onComplete(){
       this.I = true;
       if (this.a()) {
          this.j();
       }
       this.actual.onComplete();
       this.i();
       return;
    }
    public void onError(Throwable p0){
       this.J = p0;
       this.I = true;
       if (this.a()) {
          this.j();
       }
       this.actual.onError(p0);
       this.i();
       return;
    }
    public void onNext(Object p0){
       if (this.V != null) {
          return;
       }
       if (this.f()) {
          y1$a tU = this.U;
          tU.onNext(p0);
          long l = this.R + 1;
          if (l - this.P >= 0) {
             this.S = this.S + 1;
             this.R = 0;
             tU.onComplete();
             p0 = UnicastSubject.g(this.N);
             this.U = p0;
             this.actual.onNext(p0);
             if (this.O != null) {
                this.W.get().dispose();
                y1$a tK = this.K;
                DisposableHelper.replace(this.W, this.Q.d(new y1$a$a(this.S, this), tK, tK, this.L));
             }
          }else {
             this.R = l;
          }
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
       y1$a tK;
       if (DisposableHelper.validate(this.T, p0)) {
          this.T = p0;
          k tactual = this.actual;
          tactual.onSubscribe(this);
          if (this.H != null) {
             return;
          }else {
             UnicastSubject unicastSubje = UnicastSubject.g(this.N);
             this.U = unicastSubje;
             tactual.onNext(unicastSubje);
             y1$a$a uoa$a = new y1$a$a(this.S, this);
             if (this.O != null) {
                tK = this.K;
                tactual = this.Q.d(uoa$a, tK, tK, this.L);
             }else {
                tK = this.K;
                tactual = this.M.f(uoa$a, tK, tK, this.L);
             }
             DisposableHelper.replace(this.W, tactual);
          }
       }
       return;
    }
}
