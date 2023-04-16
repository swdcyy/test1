package iv8.b;
import erd.o;
import iv8.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.concurrent.TimeUnit;

public class b implements o	// class@00272c
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          b tb = this.b;
          c d = tb.d;
          tb.d = d + 1;
          ot = (d < tb.b)? t.timer((long)tb.c, TimeUnit.MILLISECONDS): t.error(p0);
       }
       return ot;
    }
}
