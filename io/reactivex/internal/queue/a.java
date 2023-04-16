package io.reactivex.internal.queue.a;
import io.reactivex.internal.fuseable.n;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Objects;

public final class a implements n	// class@001927
{
    public final AtomicLong b;
    public int c;
    public long d;
    public final int e;
    public AtomicReferenceArray f;
    public final int g;
    public AtomicReferenceArray h;
    public final AtomicLong i;
    public static final int j;
    public static final Object k;

    static {
       a.j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
       a.k = new Object();
    }
    public void a(int p0){
       super();
       this.b = new AtomicLong();
       this.i = new AtomicLong();
       p0 = k.a(Math.max(8, p0));
       int i = p0 - 1;
       AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray((p0 + 1));
       this.f = uAtomicRefer;
       this.e = i;
       this.c = Math.min((p0 / 4), a.j);
       this.h = uAtomicRefer;
       this.g = i;
       this.d = (long)(i - 1);
       this.m(0);
    }
    public static int d(long p0,int p1){
       return ((int)p0 & p1);
    }
    public static Object g(AtomicReferenceArray p0,int p1){
       return p0.get(p1);
    }
    public static void k(AtomicReferenceArray p0,int p1,Object p2){
       p0.lazySet(p1, p2);
    }
    public void clear(){
       do {
          if (this.poll() == null) {
          }
       } while (!this.isEmpty());
       return;
    }
    public final long e(){
       return this.i.get();
    }
    public final long f(){
       return this.i.get();
    }
    public final AtomicReferenceArray h(AtomicReferenceArray p0,int p1){
       a.k(p0, p1, null);
       return a.g(p0, p1);
    }
    public final long i(){
       return this.b.get();
    }
    public boolean isEmpty(){
       boolean b = (!this.i() - this.f())? true: false;
       return b;
    }
    public final void j(long p0){
       this.i.lazySet(p0);
    }
    public final void l(AtomicReferenceArray p0,AtomicReferenceArray p1){
       a.k(p0, (p0.length() - 1), p1);
    }
    public final void m(long p0){
       this.b.lazySet(p0);
    }
    public final boolean n(AtomicReferenceArray p0,Object p1,long p2,int p3){
       a.k(p0, p3, p1);
       this.m((p2 + 1));
       return true;
    }
    public boolean offer(Object p0){
       Objects.requireNonNull(p0, "Null is not a valid element");
       a tf = this.f;
       long l = this.b.get();
       a te = this.e;
       int i = a.d(l, te);
       if (l - this.d < 0) {
          this.n(tf, p0, l, i);
          return true;
       }else {
          long l1 = (long)this.c + l;
          if (a.g(tf, a.d(l1, te)) == null) {
             this.d = l1 - 1;
             this.n(tf, p0, l, i);
             return true;
          }else {
             l1 = l + 1;
             if (a.g(tf, a.d(l1, te)) == null) {
                this.n(tf, p0, l, i);
                return true;
             }else {
                AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(tf.length());
                this.f = uAtomicRefer;
                this.d = ((long)te + l) - 1;
                a.k(uAtomicRefer, i, p0);
                this.l(tf, uAtomicRefer);
                a.k(tf, i, a.k);
                this.m(l1);
                return true;
             }
          }
       }
    }
    public boolean offer(Object p0,Object p1){
       int i;
       a tf = this.f;
       long l = this.i();
       a te = this.e;
       long l1 = 2 + l;
       if (a.g(tf, a.d(l1, te)) == null) {
          i = a.d(l, te);
          a.k(tf, (i + 1), p1);
          a.k(tf, i, p0);
          this.m(l1);
       }else {
          AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(tf.length());
          this.f = uAtomicRefer;
          i = a.d(l, te);
          a.k(uAtomicRefer, (i + 1), p1);
          a.k(uAtomicRefer, i, p0);
          this.l(tf, uAtomicRefer);
          a.k(tf, i, a.k);
          this.m(l1);
       }
       return true;
    }
    public Object peek(){
       a th = this.h;
       long l = this.e();
       a tg = this.g;
       Object obj = a.g(th, a.d(l, tg));
       if (obj != a.k) {
          return obj;
       }
       AtomicReferenceArray uAtomicRefer = this.h(th, (tg + 1));
       this.h = uAtomicRefer;
       return a.g(uAtomicRefer, a.d(l, tg));
    }
    public Object poll(){
       a th = this.h;
       long l = this.e();
       a tg = this.g;
       int i = a.d(l, tg);
       Object obj = a.g(th, i);
       int i1 = (obj == a.k)? 1: 0;
       if (obj != null && !i1) {
          a.k(th, i, null);
          this.j((l + 1));
          return obj;
       }else if(i1){
          AtomicReferenceArray uAtomicRefer = this.h(th, (tg + 1));
          this.h = uAtomicRefer;
          int i2 = a.d(l, tg);
          Object obj1 = a.g(uAtomicRefer, i2);
          if (obj1 != null) {
             a.k(uAtomicRefer, i2, null);
             this.j((l + 1));
          }
          return obj1;
       }else {
          return null;
       }
    }
}
