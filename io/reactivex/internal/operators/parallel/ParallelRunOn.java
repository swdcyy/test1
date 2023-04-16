package io.reactivex.internal.operators.parallel.ParallelRunOn;
import hrd.a;
import brd.z;
import cxd.c;
import io.reactivex.internal.schedulers.h;
import io.reactivex.internal.operators.parallel.ParallelRunOn$a;
import io.reactivex.internal.schedulers.h$a;
import brd.z$c;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnConditionalSubscriber;
import io.reactivex.internal.operators.parallel.ParallelRunOn$RunOnSubscriber;

public final class ParallelRunOn extends a	// class@001451
{
    public final a a;
    public final z b;
    public final int c;

    public void ParallelRunOn(a p0,z p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public int b(){
       return this.a.b();
    }
    public void e(c[] p0){
       if (!this.f(p0)) {
          return;
       }
       int len = p0.length;
       c[] uocArray = new c[len];
       ParallelRunOn tb = this.b;
       if (tb instanceof h) {
          tb.a(len, new ParallelRunOn$a(this, p0, uocArray));
       }else {
          for (int i = 0; i < len; i = i + 1) {
             this.g(i, p0, uocArray, this.b.b());
          }
       }
       this.a.e(uocArray);
       return;
    }
    public void g(int p0,c[] p1,c[] p2,z$c p3){
       object oobject = p1[p0];
       SpscArrayQueue spscArrayQue = new SpscArrayQueue(this.c);
       p2[p0] = (oobject instanceof a)? new ParallelRunOn$RunOnConditionalSubscriber(oobject, this.c, spscArrayQue, p3): new ParallelRunOn$RunOnSubscriber(oobject, this.c, spscArrayQue, p3);
       return;
    }
}
