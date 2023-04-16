package d5c.l;
import erd.g;
import d5c.g0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.profile.widget.RadioDotButton;
import s1c.o;

public final class l implements g	// class@002100
{
    public final g0 b;

    public void l(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       tb.q9(p0.intValue());
       int i = p0.intValue();
       g0 og0 = g0.class;
       if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, og0, "24")) {
          g0 u0 = tb.U0;
          if (u0 != null && i == 5) {
             u0.setShowDot(false);
             o.A(true);
          }
       }
       return;
    }
}
