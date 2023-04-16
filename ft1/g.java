package ft1.g;
import erd.o;
import ft1.b;
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
import androidx.lifecycle.MutableLiveData;
import zs1.b;
import androidx.lifecycle.LiveData;
import ut1.f;
import ps1.e;
import du1.d;
import ssd.e;
import ssd.e$a;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.android.live.log.b;
import java.util.concurrent.TimeUnit;

public final class g implements o	// class@00239e
{
    public final b b;

    public void g(b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, b.class, "25");
          if (obj != patchProxyRe) {
          }else {
             f value = p0.n.l().getValue();
             long l = 0;
             f o = (value != null)? value.o: l;
             if (!p0.n.k().e() && o - l > 0) {
                l = e.b.o(o);
             }
             b.T(LiveMultiPkDebugLogKt.b(), "createPkInfoScatterDelayObservable", "scatterDelayMs", Long.valueOf(l), "param", p0.n.p());
             p0 = t.timer(l, TimeUnit.MILLISECONDS);
             a.o(p0, "Observable.timer\(scatter¡­s, TimeUnit.MILLISECONDS\)");
             obj = p0;
          }
       }
       return obj;
    }
}
