package io.reactivex.internal.observers.a;
import brd.y;
import io.reactivex.internal.fuseable.j;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import drd.a;
import crd.b;
import io.reactivex.internal.fuseable.k;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public abstract class a implements y, j	// class@00185a
{
    public final y actual;
    public b b;
    public j c;
    public boolean d;
    public int e;

    public void a(y p0){
       super();
       this.actual = p0;
    }
    public void clear(){
       this.c.clear();
    }
    public final void d(Throwable p0){
       a.b(p0);
       this.b.dispose();
       this.onError(p0);
    }
    public void dispose(){
       this.b.dispose();
    }
    public final int e(int p0){
       a tc = this.c;
       if (tc == null || (p0 & 0x04)) {
          return 0;
       }
       p0 = tc.requestFusion(p0);
       if (p0) {
          this.e = p0;
       }
       return p0;
    }
    public boolean isDisposed(){
       return this.b.isDisposed();
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
    public final void onSubscribe(b p0){
       if (DisposableHelper.validate(this.b, p0)) {
          this.b = p0;
          if (p0 instanceof j) {
             this.c = p0;
          }
          this.actual.onSubscribe(this);
       }
       return;
    }
}
