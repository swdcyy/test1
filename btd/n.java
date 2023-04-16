package btd.n;
import btd.b;
import java.util.concurrent.TimeUnit;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import btd.d;

public final class n extends b	// class@0002ee
{
    public long c;

    public void n(){
       super(TimeUnit.NANOSECONDS);
    }
    public long c(){
       return this.c;
    }
    public final void d(double p0){
       throw new IllegalStateException("TestTimeSource will overflow if its reading "+this.c+"ns is advanced by "+d.B0(p0)+'.');
    }
    public final void e(double p0){
       double d = d.u0(p0, this.b());
       long l = (long)d;
       long l1 = Long.MAX_VALUE;
       long l2 = Long.MIN_VALUE;
       if (l - l2 && l - l1) {
          n tc = this.c;
          l1 = tc + l;
          if ((l ^ tc) >= 0 && (tc ^ l1) < 0) {
             this.d(p0);
          }
       }else {
          double d1 = (double)this.c + d;
          if (d1 - (double)l1 > 0 || d1 - (double)l2 < 0) {
             this.d(p0);
          }
          l1 = (long)d1;
       }
       this.c = l1;
       return;
    }
}
