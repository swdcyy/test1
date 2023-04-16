package io.reactivex.internal.operators.observable.ObservableCache$a;
import brd.y;
import io.reactivex.internal.util.h;
import io.reactivex.internal.operators.observable.ObservableCache$ReplayDisposable;
import brd.t;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;
import crd.b;

public final class ObservableCache$a extends h implements y	// class@0012ee
{
    public final t g;
    public final SequentialDisposable h;
    public final AtomicReference i;
    public boolean j;
    public boolean k;
    public static final ObservableCache$ReplayDisposable[] l;
    public static final ObservableCache$ReplayDisposable[] m;

    static {
       ObservableCache$ReplayDisposable[] replayDispos = new ObservableCache$ReplayDisposable[0];
       ObservableCache$a.l = replayDispos;
       ObservableCache$ReplayDisposable[] replayDispos1 = new ObservableCache$ReplayDisposable[0];
       ObservableCache$a.m = replayDispos1;
    }
    public void ObservableCache$a(t p0,int p1){
       super(p1);
       this.g = p0;
       this.i = new AtomicReference(ObservableCache$a.l);
       this.h = new SequentialDisposable();
    }
    public void onComplete(){
       if (this.k == null) {
          this.k = true;
          this.a(NotificationLite.complete());
          this.h.dispose();
          ObservableCache$ReplayDisposable[] andSet = this.i.getAndSet(ObservableCache$a.m);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             andSet[i].replay();
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.k == null) {
          this.k = true;
          this.a(NotificationLite.error(p0));
          this.h.dispose();
          ObservableCache$ReplayDisposable[] andSet = this.i.getAndSet(ObservableCache$a.m);
          int len = andSet.length;
          for (int i = 0; i < len; i = i + 1) {
             andSet[i].replay();
          }
       }
       return;
    }
    public void onNext(Object p0){
       if (this.k == null) {
          this.a(NotificationLite.next(p0));
          p0 = this.i.get();
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             p0[i].replay();
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       this.h.update(p0);
    }
}
