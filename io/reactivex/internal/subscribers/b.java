package io.reactivex.internal.subscribers.b;
import brd.k;
import io.reactivex.internal.fuseable.l;
import cxd.c;
import java.lang.Object;
import cxd.d;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.fuseable.k;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import ird.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public abstract class b implements k, l	// class@0014bd
{
    public final c actual;
    public d b;
    public l c;
    public boolean d;
    public int e;

    public void b(c p0){
       super();
       this.actual = p0;
    }
    public void cancel(){
       this.b.cancel();
    }
    public void clear(){
       this.c.clear();
    }
    public final void e(Throwable p0){
       a.b(p0);
       this.b.cancel();
       this.onError(p0);
    }
    public final int f(int p0){
       b tc = this.c;
       if (tc == null || (p0 & 0x04)) {
          return 0;
       }
       p0 = tc.requestFusion(p0);
       if (p0) {
          this.e = p0;
       }
       return p0;
    }
    public boolean isEmpty(){
       return this.c.isEmpty();
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          this.d = true;
          this.actual.onError(p0);
          return;
       }
    }
    public final void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.b, p0)) {
          this.b = p0;
          if (p0 instanceof l) {
             this.c = p0;
          }
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
       this.b.request(p0);
    }
}
