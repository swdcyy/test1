package io.reactivex.internal.schedulers.k$a;
import java.lang.Runnable;
import io.reactivex.internal.schedulers.k$c;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import java.lang.Thread;
import java.lang.Throwable;
import ird.a;

public final class k$a implements Runnable	// class@0014b4
{
    public final Runnable b;
    public final k$c c;
    public final long d;

    public void k$a(Runnable p0,k$c p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       if (this.c.e == null) {
          long l = this.c.a(TimeUnit.MILLISECONDS);
          k$a td = this.d;
          if (td - l > 0) {
             long l1 = td - l;
             try{
                Thread.sleep(l1);
             }catch(java.lang.InterruptedException e0){
                Thread.currentThread().interrupt();
                a.l(e0);
                return;
             }
          }
          if (this.c.e == null) {
             this.b.run();
          }
       }
       return;
    }
}
