package ou1.g$f;
import z0.a;
import ou1.g;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ut1.p;
import cu1.d;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ut1.n;
import java.lang.CharSequence;
import hu1.d;

public final class g$f implements a	// class@003598
{
    public final g a;

    public void g$f(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       LiveMultiPkColorInfo endColor;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, g$f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.g;
       d uod = null;
       LiveMultiPkColorInfo liveMultiPkC = PatchProxy.applyTwoRefs(obj, p0, uod, d.class, "2");
       if (liveMultiPkC != patchProxyRe) {
       }else {
          a.p(obj, "teamId");
          if (p0 != null) {
             p0 = p0.b();
             if (p0 != null) {
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      n on = p0.next();
                      if (a.g(on.c(), obj)) {
                         liveMultiPkC = on.a();
                      }
                   }
                }
             }
          }
          liveMultiPkC = uod;
       }
       if (liveMultiPkC != null) {
          p0 = liveMultiPkC.startColor;
          String str = "color.startColor";
          a.o(p0, str);
          obj = 1;
          p0 = (p0.length() > 0)? 1: null;
          if (p0) {
             p0 = liveMultiPkC.endColor;
             a.o(p0, "color.endColor");
             if (p0.length() <= 0) {
                obj = 0;
             }
             if (obj) {
                p0 = liveMultiPkC.startColor;
                a.o(p0, str);
                endColor = liveMultiPkC.endColor;
                a.o(endColor, "color.endColor");
                uod = new d(p0, endColor);
             }
          }
       }
       return uod;
    }
}
