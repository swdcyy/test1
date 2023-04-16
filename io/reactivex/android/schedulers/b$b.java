package io.reactivex.android.schedulers.b$b;
import java.lang.Runnable;
import crd.b;
import android.os.Handler;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public final class b$b implements Runnable, b	// class@001193
{
    public final Handler b;
    public boolean c;
    public final Runnable delegate;

    public void b$b(Handler p0,Runnable p1){
       super();
       this.b = p0;
       this.delegate = p1;
    }
    public void dispose(){
       this.b.removeCallbacks(this);
       this.c = true;
    }
    public boolean isDisposed(){
       return this.c;
    }
    public void run(){
       this.delegate.run();
       return;
    }
}
