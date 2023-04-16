package io.reactivex.android.a;
import crd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Looper;
import brd.z;
import io.reactivex.android.schedulers.a;
import io.reactivex.android.a$a;
import java.lang.Runnable;

public abstract class a implements b	// class@001191
{
    public final AtomicBoolean b;

    public void a(){
       super();
       this.b = new AtomicBoolean();
    }
    public abstract void a();
    public final void dispose(){
       if (this.b.compareAndSet(false, true)) {
          if (Looper.myLooper() == Looper.getMainLooper()) {
             this.a();
          }else {
             a.c().d(new a$a(this));
          }
       }
       return;
    }
    public final boolean isDisposed(){
       return this.b.get();
    }
}
