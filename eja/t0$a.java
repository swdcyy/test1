package eja.t0$a;
import erd.g;
import eja.t0;
import java.lang.Object;
import dha.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;

public final class t0$a implements g	// class@0026f8
{
    public final t0 b;

    public void t0$a(t0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0$a.class, "1")) {
       }else {
          a.o(p0, "status");
          if (p0.a()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             t0 ot0 = PatchProxy.apply(null, p0, t0.class, "2");
             if (ot0 != PatchProxyResult.class) {
             }else {
                ot0 = p0.p;
                if (ot0 == null) {
                   a.S("mRefreshLayout");
                }
             }
             ot0.setEnabled(true);
          }
       }
       return;
    }
}
