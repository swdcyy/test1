package c12.n;
import java.lang.Runnable;
import c12.o;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import w51.a;
import java.util.concurrent.TimeUnit;

public final class n implements Runnable	// class@0004a8
{
    public final o b;
    public final List c;

    public void n(o p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       long l;
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, null, o.class, "14");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          l = a.b;
          if (l - null < 0) {
             l = 5;
          }
          l = TimeUnit.MILLISECONDS.toNanos(l);
       }
       tb.c(tc, l);
       tb.g(tc);
       return;
    }
}
