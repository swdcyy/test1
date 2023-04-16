package knd.n;
import erd.o;
import knd.m;
import java.util.List;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import jod.d;
import wnd.g;
import knd.k$a;
import knd.k;
import java.lang.RuntimeException;

public final class n implements o	// class@0017f5
{
    public final m b;
    public final List c;

    public void n(m p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       p0 = this.b;
       obj = this.c;
       Objects.requireNonNull(p0);
       Object obj1 = PatchProxy.applyOneRefs(obj, p0, m.class, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Iterator iterator = obj.iterator();
          while (true) {
             if (iterator.hasNext()) {
                d uod = iterator.next();
                int i = uod.d();
                int i1 = uod.c();
                k$a uoa = p0.e.n(g.a.b(i, i1, uod.g()));
                if (uoa == null || uoa.a() == null) {
                   b = true;
                }
             }else {
                b = false;
             }
          }
          return new Object();
       }
       if (!b) {
          goto label_0061 ;
       }else {
          throw new RuntimeException("TTSRepoV2 failed to download tts speech");
       }
    }
}
