package ou1.g$g;
import z0.a;
import ou1.g;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut1.p;
import cu1.d;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ut1.n;
import java.util.Collection;
import ut1.m;
import com.kwai.framework.model.user.UserInfo;

public final class g$g implements a	// class@003599
{
    public final g a;
    public final String b;

    public void g$g(g p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, g$g.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.g;
       g$g tb = this.b;
       m om = PatchProxy.applyThreeRefs(obj, tb, p0, null, d.class, "3");
       if (om != patchProxyRe) {
       }else {
          a.p(obj, "teamId");
          a.p(tb, "userId");
          if (p0 != null) {
             p0 = p0.b();
             if (p0 != null) {
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      n on = p0.next();
                      if (a.g(on.c(), obj)) {
                         int i = on.d().isEmpty() ^ 0x01;
                         if (i) {
                            p0 = on.d().iterator();
                            while (true) {
                               if (p0.hasNext()) {
                                  obj1 = p0.next();
                                  if (!(obj1.a.mId).equals(tb)) {
                                     continue ;
                                  }
                               }else {
                                  obj1 = null;
                               }
                               if (obj1 != null) {
                                  om = obj1.b;
                                  break ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          om = null;
       }
       return om;
    }
}
