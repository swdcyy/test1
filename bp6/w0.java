package bp6.w0;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import qo6.p1;
import java.lang.Object;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import bp6.w1;
import qo6.c;

public final class w0 implements Runnable	// class@000557
{
    public final v b;
    public final int c;
    public final p1 d;

    public void w0(v p0,int p1,p1 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       w0 tb = this.b;
       w0 tc = this.c;
       w0 td = this.d;
       Objects.requireNonNull(tb);
       v ov = 3;
       if (tc != 2 && (tc == ov || tc == 4)) {
          if (tb.e.intValue() > ov) {
          label_0035 :
             return;
          }else {
             tb.e.incrementAndGet();
             td.d(new w1(tb));
          }
       }else if(tc == null){
          tb.e.set(0);
       }
       td.onStateChange(tc);
       goto label_0035 ;
    }
}
