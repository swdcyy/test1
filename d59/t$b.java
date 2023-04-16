package d59.t$b;
import erd.g;
import d59.t;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.FrameLayout;

public final class t$b implements g	// class@00205b
{
    public final t b;

    public void t$b(t p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, ot, "7")) {
                p0 = p0.v;
                if (p0 == null) {
                   a.S("mErrorEmptyView");
                }
                p0.setVisibility(0);
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, ot, "8")) {
                p0 = p0.v;
                if (p0 == null) {
                   a.S("mErrorEmptyView");
                }
                p0.setVisibility(4);
             }
          }
       }
       return;
    }
}
