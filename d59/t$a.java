package d59.t$a;
import erd.g;
import d59.t;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import com.kwai.library.widget.refresh.path.PathLoadingView;

public final class t$a implements g	// class@00205a
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
       }else {
          a.o(p0, "it");
          Object[] objArray = null;
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, ot, "5")) {
                ot = p0.u;
                if (ot == null) {
                   a.S("mLoadingView");
                }
                ot.setVisibility(0);
                p0 = p0.u;
                if (p0 == null) {
                   a.S("mLoadingView");
                }
                p0.k();
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, ot, "6")) {
                ot = p0.u;
                if (ot == null) {
                   a.S("mLoadingView");
                }
                ot.setVisibility(8);
                p0 = p0.u;
                if (p0 == null) {
                   a.S("mLoadingView");
                }
                p0.a();
             }
          }
       }
       return;
    }
}
