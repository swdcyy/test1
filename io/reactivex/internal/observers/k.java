package io.reactivex.internal.observers.k;
import brd.y;
import io.reactivex.internal.util.i;
import io.reactivex.internal.observers.m;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.observers.n;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.util.m;
import java.lang.Throwable;

public abstract class k extends m implements y, i	// class@0011e9
{
    public final n G;
    public boolean H;
    public boolean I;
    public Throwable J;
    public final y actual;

    public void k(y p0,n p1){
       super();
       this.actual = p0;
       this.G = p1;
    }
    public final boolean a(){
       boolean b = (!this.q.getAndIncrement())? true: false;
       return b;
    }
    public final boolean b(){
       return this.H;
    }
    public final boolean c(){
       return this.I;
    }
    public final int d(int p0){
       return this.q.addAndGet(p0);
    }
    public void e(y p0,Object p1){
    }
    public final boolean f(){
       int i = 0;
       if (!this.q.get() && this.q.compareAndSet(i, 1)) {
          i = true;
       }
       return i;
    }
    public final void g(Object p0,boolean p1,b p2){
       k tactual = this.actual;
       k tG = this.G;
       if (!this.q.get() && this.q.compareAndSet(0, 1)) {
          this.e(tactual, p0);
          if (!this.d(-1)) {
             return;
          }
       }else {
          tG.offer(p0);
          if (!this.a()) {
             return;
          }
       }
       m.c(tG, tactual, p1, p2, this);
       return;
    }
    public final void h(Object p0,boolean p1,b p2){
       k tactual = this.actual;
       k tG = this.G;
       if (!this.q.get() && this.q.compareAndSet(0, 1)) {
          if (tG.isEmpty()) {
             this.e(tactual, p0);
             if (!this.d(-1)) {
                return;
             }
          }else {
             tG.offer(p0);
          }
       }else {
          tG.offer(p0);
          if (!this.a()) {
             return;
          }
       }
       m.c(tG, tactual, p1, p2, this);
       return;
    }
    public final Throwable w(){
       return this.J;
    }
}
