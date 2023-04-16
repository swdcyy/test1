package brd.z$c$a;
import java.lang.Runnable;
import lrd.a;
import brd.z$c;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import brd.z;
import crd.b;

public final class z$c$a implements Runnable, a	// class@0002da
{
    public final Runnable b;
    public final SequentialDisposable c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public final z$c h;

    public void z$c$a(z$c p0,long p1,Runnable p2,long p3,SequentialDisposable p4,long p5){
       this.h = p0;
       super();
       this.b = p2;
       this.c = p4;
       this.d = p5;
       this.f = p3;
       this.g = p1;
    }
    public Runnable getWrappedRunnable(){
       return this.b;
    }
    public void run(){
       long l2;
       this.b.run();
       if (!this.c.isDisposed()) {
          TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
          long l = this.h.a(nANOSECONDS);
          long a = z.a;
          z$c$a tf = this.f;
          if ((l + a) - tf >= 0) {
             z$c$a td = this.d;
             if (l - ((tf + td) + a) < 0) {
                l2 = this.e + 1;
                this.e = l2;
                a = this.g + (l2 * td);
             label_0045 :
                this.f = l;
                this.c.replace(this.h.c(this, (a - l), nANOSECONDS));
             }
          }
          z$c$a td1 = this.d;
          long l1 = l + td1;
          l2 = this.e + 1;
          this.e = l2;
          this.g = l1 - (td1 * l2);
          a = l1;
          goto label_0045 ;
       }
       return;
    }
}
