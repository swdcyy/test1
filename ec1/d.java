package ec1.d;
import fp3.e;
import ec1.i;
import bq5.f;
import java.lang.Object;
import dp3.g;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a;
import bq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import ec1.f;
import com.gifshow.tuna.player.poi.e;
import erd.g;

public final class d implements e	// class@0020d4
{
    public final i a;
    public final f b;

    public void d(i p0,f p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(g p0){
       d ta = this.a;
       d tb = this.b;
       i u = ta.u;
       if (u != null) {
          u.ee();
       }
       if (tb.b() != null) {
          tb.b().onShow();
       }
       if (!PatchProxy.applyVoid(null, ta, i.class, "12")) {
          ta.R8(ta.A);
          ta.A = t.interval(100, 100, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new f(ta), e.b);
       }
       return;
    }
}
