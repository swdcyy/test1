package bp6.o0;
import erd.o;
import com.kwai.imsdk.internal.v;
import wp6.a;
import java.lang.Object;
import bp6.j2;
import java.util.Iterator;
import java.util.List;
import com.kwai.imsdk.internal.config.ResourceRule;

public final class o0 implements o	// class@00053f
{
    public final v b;
    public final a c;

    public void o0(v p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       o0 tc = this.c;
       p0 = this.b.f.d;
       if (p0 != null) {
          p0 = p0.iterator();
          while (true) {
             if (p0.hasNext()) {
                ResourceRule resourceRule = p0.next();
                if (resourceRule != null && resourceRule.mType == tc.b()) {
                   p0 = resourceRule.mChannel;
                   break ;
                }
             }
          }
          return p0;
       }
       p0 = "";
       goto label_002b ;
    }
}
