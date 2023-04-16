package g12.c;
import erd.g;
import g12.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import b51.d;
import c51.h;
import wg3.b;
import ew6.a;
import c51.i;
import io.reactivex.subjects.PublishSubject;

public final class c implements g	// class@002a22
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "6")) {
       }else if(tb.v == null){
          p0.mIsSoloLiveStream = tb.u;
          tb.P8();
          p0 = tb.r;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, d.class, "13")) {
             d k = p0.k;
             if (k != null) {
                p0.r(p0.l, k);
                p0.k = null;
                p0.l = null;
                p0.o.a(p0.a);
             }
          }
          p0 = tb.r;
          e t = tb.t;
          boolean b = (t.mDisablePullRefresh == null && t.mIsSoloLiveStream == null)? true: false;
          p0.s(b);
          tb.p = null;
          tb.v = false;
          p0 = tb.s;
          if (p0 != null) {
             p0.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
