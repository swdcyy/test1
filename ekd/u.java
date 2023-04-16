package ekd.u;
import io.reactivex.g;
import com.yxcorp.utility.f;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.utility.f$c;
import com.yxcorp.utility.f$a;
import java.util.Queue;
import android.os.Message;
import android.os.Handler;

public final class u implements g	// class@000d7e
{
    public final f b;
    public final long c;
    public final long d;
    public final long e;
    public final AtomicReference f;

    public void u(f p0,long p1,long p2,long p3,AtomicReference p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       f$c uoc = new f$c(this.c, this.d, this.e, p0, null);
       this.f.set(v11);
       _monitor_enter(tb);
       f$c uoc1 = tb.b.peek();
       if (uoc1 == null || v11.e - uoc1.e < 0) {
          tb.a();
       }
       tb.b.offer(v11);
       if (tb.a != null) {
          tb.a = false;
          f c = tb.c;
          c.sendMessage(c.obtainMessage(1));
       }
       _monitor_exit(tb);
       return;
    }
}
