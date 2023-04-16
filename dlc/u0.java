package dlc.u0;
import erd.g;
import dlc.v0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.view.View;
import com.yxcorp.utility.n;

public final class u0 implements g	// class@002273
{
    public final v0 b;

    public void u0(v0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u0 tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       v0 ov0 = v0.class;
       if (!PatchProxy.isSupport(ov0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ov0, "4")) {
          if (b) {
             n.Y(tb.q, 0, 0);
             n.Y(tb.r, 0, 0);
             n.Y(tb.s, 0, 0);
          }else {
             n.Y(tb.q, 8, 0);
             n.Y(tb.r, 8, 0);
             n.Y(tb.s, 8, 0);
          }
       }
       return;
    }
}
