package io.reactivex.subjects.UnicastSubject;
import mrd.c;
import java.lang.Runnable;
import io.reactivex.internal.queue.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import io.reactivex.internal.fuseable.o;
import ird.a;
import crd.b;
import java.lang.IllegalStateException;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class UnicastSubject extends c	// class@0014f6
{
    public final AtomicReference actual;
    public final a b;
    public final AtomicReference c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public Throwable g;
    public final AtomicBoolean h;
    public final BasicIntQueueDisposable i;
    public boolean j;

    public void UnicastSubject(int p0,Runnable p1,boolean p2){
       super();
       a.d(p0, "capacityHint");
       this.b = new a(p0);
       a.c(p1, "onTerminate");
       this.c = new AtomicReference(p1);
       this.d = p2;
       this.actual = new AtomicReference();
       this.h = new AtomicBoolean();
       this.i = new UnicastSubject$UnicastQueueDisposable(this);
    }
    public void UnicastSubject(int p0,boolean p1){
       super();
       a.d(p0, "capacityHint");
       this.b = new a(p0);
       this.c = new AtomicReference();
       this.d = p1;
       this.actual = new AtomicReference();
       this.h = new AtomicBoolean();
       this.i = new UnicastSubject$UnicastQueueDisposable(this);
    }
    public static UnicastSubject g(int p0){
       return new UnicastSubject(p0, true);
    }
    public static UnicastSubject h(int p0,Runnable p1){
       return new UnicastSubject(p0, p1, true);
    }
    public Throwable b(){
       if (this.f != null) {
          return this.g;
       }
       return null;
    }
    public boolean c(){
       boolean b = (this.f != null && this.g == null)? true: false;
       return b;
    }
    public boolean d(){
       boolean b = (this.actual.get() != null)? true: false;
       return b;
    }
    public boolean e(){
       boolean b = (this.f != null && this.g != null)? true: false;
       return b;
    }
    public void i(){
       Runnable runnable = this.c.get();
       if (runnable != null && this.c.compareAndSet(runnable, null)) {
          runnable.run();
       }
       return;
    }
    public void j(){
       int b;
       if (this.i.getAndIncrement()) {
          return;
       }
       y oy = this.actual.get();
       int i = 1;
       UnicastSubject unicastSubje = 1;
       while (true) {
          if (oy != null) {
             if (this.j != null) {
                unicastSubje = this.b;
                int i1 = this.d ^ i;
                do {
                   if (this.e != null) {
                      this.actual.lazySet(null);
                      unicastSubje.clear();
                      break ;
                   }else {
                      UnicastSubject tf = this.f;
                      if (!i1 || (tf == null || !this.l(unicastSubje, oy))) {
                         oy.onNext(null);
                         if (tf != null) {
                            this.k(oy);
                            break ;
                         }
                      }
                   }
                   i = - i;
                } while (!this.i.addAndGet(i));
             }else {
                UnicastSubject tb = this.b;
                int i2 = this.d ^ 0x01;
                b = true;
                int i3 = 1;
                do {
                   if (this.e != null) {
                      this.actual.lazySet(null);
                      tb.clear();
                      break ;
                   }else {
                      UnicastSubject tf1 = this.f;
                      Object obj = this.b.poll();
                      int i4 = (obj == null)? 1: 0;
                      if (tf1 != null) {
                         if (i2 && b) {
                            if (!this.l(tb, oy)) {
                               b = false;
                            }
                         }
                         if (i4) {
                            this.k(oy);
                            break ;
                         }
                      }
                      if (i4) {
                         i3 = - i3;
                         if (this.i.addAndGet(i3)) {
                            continue ;
                         }
                      }else {
                         oy.onNext(obj);
                         continue ;
                      }
                   }
                } while (!this.i.addAndGet(i3));
             }
             break ;
          }else {
             b = - unicastSubje;
             if (!this.i.addAndGet(b)) {
                return;
             }
             oy = this.actual.get();
          }
       }
       return;
    }
    public void k(y p0){
       this.actual.lazySet(null);
       UnicastSubject tg = this.g;
       if (tg != null) {
          p0.onError(tg);
       }else {
          p0.onComplete();
       }
       return;
    }
    public boolean l(o p0,y p1){
       UnicastSubject tg = this.g;
       if (tg == null) {
          return false;
       }
       this.actual.lazySet(null);
       p0.clear();
       p1.onError(tg);
       return true;
    }
    public void onComplete(){
       if (this.f == null && this.e == null) {
          this.f = true;
          this.i();
          this.j();
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.f != null || this.e != null) {
          a.l(p0);
          return;
       }else {
          this.g = p0;
          this.f = true;
          this.i();
          this.j();
          return;
       }
    }
    public void onNext(Object p0){
       a.c(p0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.f == null && this.e == null) {
          this.b.offer(p0);
          this.j();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (this.f != null || this.e != null) {
          p0.dispose();
       }
       return;
    }
    public void subscribeActual(y p0){
       if (!this.h.get() && this.h.compareAndSet(false, true)) {
          p0.onSubscribe(this.i);
          this.actual.lazySet(p0);
          if (this.e != null) {
             this.actual.lazySet(null);
             return;
          }else {
             this.j();
          }
       }else {
          EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), p0);
       }
       return;
    }
}
