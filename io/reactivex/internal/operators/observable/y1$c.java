package io.reactivex.internal.operators.observable.y1$c;
import crd.b;
import java.lang.Runnable;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;
import io.reactivex.internal.operators.observable.y1$c$b;
import java.util.Iterator;
import io.reactivex.subjects.UnicastSubject;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.y1$c$a;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.disposables.DisposableHelper;

public final class y1$c extends k implements b, Runnable	// class@00143c
{
    public final long K;
    public final long L;
    public final TimeUnit M;
    public final z$c N;
    public final int O;
    public final List P;
    public b Q;
    public boolean R;

    public void y1$c(y p0,long p1,long p2,TimeUnit p3,z$c p4,int p5){
       super(p0, new MpscLinkedQueue());
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.O = p5;
       this.P = new LinkedList();
    }
    public void dispose(){
       this.H = true;
    }
    public void i(){
       this.N.dispose();
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void j(){
       k tG = this.G;
       k tactual = this.actual;
       y1$c tP = this.P;
       boolean b = true;
       int i = 1;
       while (true) {
          if (this.R != null) {
             this.Q.dispose();
             this.i();
             tG.clear();
             tP.clear();
             return;
          }else {
             k tI = this.I;
             Object obj = tG.poll();
             y1$c$a uoc$a = (obj == null)? 1: null;
             v8 = obj instanceof y1$c$b;
             if (tI != null && (uoc$a || v8)) {
                tG.clear();
                tG = this.J;
                if (tG != null) {
                   Iterator iterator = tP.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onError(tG);
                   }
                }else {
                   Iterator iterator1 = tP.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().onComplete();
                   }
                }
                break ;
             }else if(uoc$a){
                i = - i;
                if (!this.d(i)) {
                   return;
                }
             }else if(v8){
                if (obj.b != null) {
                   if (this.H != null) {
                      continue ;
                   }else {
                      UnicastSubject unicastSubje = UnicastSubject.g(this.O);
                      tP.add(unicastSubje);
                      tactual.onNext(unicastSubje);
                      uoc$a = new y1$c$a(this, unicastSubje);
                      this.N.c(uoc$a, this.K, this.M);
                   }
                }else {
                   tP.remove(obj.a);
                   obj.a.onComplete();
                   if (tP.isEmpty() && this.H != null) {
                      this.R = b;
                   }
                }
             }else {
                Iterator iterator2 = tP.iterator();
                while (iterator2.hasNext()) {
                   iterator2.next().onNext(obj);
                }
             }
          }
       }
       this.i();
       tP.clear();
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
       if (this.f()) {
          Iterator iterator = this.P.iterator();
          while (iterator.hasNext()) {
             iterator.next().onNext(p0);
          }
          if (!this.d(-1)) {
             return;
          }
       }else {
          this.G.offer(p0);
          if (!this.a()) {
             return;
          }
       }
       this.j();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.Q, p0)) {
          this.Q = p0;
          this.actual.onSubscribe(this);
          if (this.H != null) {
             return;
          }else {
             UnicastSubject unicastSubje = UnicastSubject.g(this.O);
             this.P.add(unicastSubje);
             this.actual.onNext(unicastSubje);
             y1$c$a uoc$a = new y1$c$a(this, unicastSubje);
             this.N.c(uoc$a, this.K, this.M);
             y1$c tL = this.L;
             this.N.d(this, tL, tL, this.M);
          }
       }
       return;
    }
    public void run(){
       y1$c$b uoc$b = new y1$c$b(UnicastSubject.g(this.O), true);
       if (this.H == null) {
          this.G.offer(uoc$b);
       }
       if (this.a()) {
          this.j();
       }
       return;
    }
}
