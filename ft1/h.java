package ft1.h;
import erd.o;
import ft1.b;
import ut1.f;
import java.lang.Object;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import brd.t;
import ps1.e;
import zs1.b;
import du1.d;
import com.yxcorp.utility.TextUtils;
import qs1.a;
import qs1.a$a;
import zfc.b;
import cjd.e;
import ft1.d;
import erd.g;
import ft1.e;
import ft1.f;

public final class h implements o	// class@00239f
{
    public final b b;
    public final f c;

    public void h(b p0,f p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          obj = this.c.e();
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.applyOneRefs(obj, p0, b.class, "26");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             String str = TextUtils.k(p0.n.k().getLiveStreamId());
             String str1 = "liveStreamId";
             if (p0.n.k().e()) {
                a.o(str, str1);
                ot = a.a.a().c(str, obj);
             }else {
                a.o(str, str1);
                ot = a.a.a().f(str, obj);
             }
             p0 = ot.retryWhen(new b(3, 1000)).map(new e()).doOnNext(new d(p0)).doOnSubscribe(new e(p0)).doOnError(f.b);
             a.o(p0, "pkInfoRequest\n      .ret¡­kInfo error\", it\)\n      }");
             obj = p0;
          }
       }
       return obj;
    }
}
