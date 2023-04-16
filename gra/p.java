package gra.p;
import erd.o;
import gra.q;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import gra.v;
import brd.t;
import gra.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gra.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import gra.r;

public final class p implements o	// class@002bc0
{
    public final q b;

    public void p(q p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "newFollow");
          if (p0.booleanValue()) {
             p0 = this.b.b;
             Objects.requireNonNull(p0);
             obj = PatchProxy.apply(null, p0, v.class, "21");
             if (obj != patchProxyRe) {
             }else {
                obj = PatchProxy.apply(null, p0, b.class, "2");
                if (obj != patchProxyRe) {
                }else {
                   QCurrentUser mE = QCurrentUser.ME;
                   String str = "QCurrentUser.ME";
                   a.o(mE, str);
                   if (!mE.isLogined()) {
                      obj = t.just(Boolean.FALSE);
                      a.o(obj, "Observable.just\(false\)");
                   }else {
                      mE = QCurrentUser.ME;
                      a.o(mE, str);
                      if (TextUtils.n(mE.getId(), p0.c9())) {
                         obj = p0.d9();
                         if (obj == null) {
                         }
                      }else {
                      }
                   }
                }
                p0 = obj.observeOn(d.a).flatMap(new r(p0));
                a.o(p0, "callFollow\(\).observeOn\(K¡­.just\(true\)\n      }\n    }");
             }
          }else {
             p0 = t.just(Boolean.FALSE);
          }
          obj = p0;
       }
       return obj;
    }
}
