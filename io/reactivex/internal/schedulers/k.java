package io.reactivex.internal.schedulers.k;
import brd.z;
import brd.z$c;
import io.reactivex.internal.schedulers.k$c;
import java.lang.Runnable;
import crd.b;
import ird.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.lang.Throwable;

public final class k extends z	// class@00194b
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public z$c b(){
       return new k$c();
    }
    public b d(Runnable p0){
       a.m(p0).run();
       return EmptyDisposable.INSTANCE;
    }
    public b e(Runnable p0,long p1,TimeUnit p2){
       try{
          p2.sleep(p1);
          a.m(p0).run();
       }catch(java.lang.InterruptedException e1){
          Thread.currentThread().interrupt();
          a.l(e1);
       }
       return EmptyDisposable.INSTANCE;
    }
}
