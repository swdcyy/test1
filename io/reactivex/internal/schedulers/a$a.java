package io.reactivex.internal.schedulers.a$a;
import brd.z$c;
import io.reactivex.internal.schedulers.a$c;
import io.reactivex.internal.disposables.b;
import crd.a;
import crd.b;
import java.lang.Runnable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import io.reactivex.internal.disposables.a;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.schedulers.f;

public final class a$a extends z$c	// class@001934
{
    public final b b;
    public final a c;
    public final b d;
    public final a$c e;
    public boolean f;

    public void a$a(a$c p0){
       super();
       this.e = p0;
       b uob = new b();
       this.b = uob;
       a uoa = new a();
       this.c = uoa;
       b uob1 = new b();
       this.d = uob1;
       uob1.c(uob);
       uob1.c(uoa);
    }
    public b b(Runnable p0){
       if (this.f != null) {
          return EmptyDisposable.INSTANCE;
       }
       return this.e.e(p0, 0, TimeUnit.MILLISECONDS, this.b);
    }
    public b c(Runnable p0,long p1,TimeUnit p2){
       if (this.f != null) {
          return EmptyDisposable.INSTANCE;
       }
       return this.e.e(p0, p1, p2, this.c);
    }
    public void dispose(){
       if (this.f == null) {
          this.f = true;
          this.d.dispose();
       }
       return;
    }
    public boolean isDisposed(){
       return this.f;
    }
}
