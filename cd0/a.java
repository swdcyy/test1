package cd0.a;
import sf0.d;
import com.kuaishou.growth.pendant.coin.absorb.widget.AbsorbedLowActivePendant;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import mf0.b;
import java.util.Objects;

public final class a implements d	// class@00030e
{
    public final AbsorbedLowActivePendant a;

    public void a(AbsorbedLowActivePendant p0){
       a.p(p0, "pendant");
       super();
       this.a = p0;
    }
    public void a(TaskParamsV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "taskParamsV2");
       boolean b = a.g(b.g(this.a.getMParams()), b.g(p0));
       int i = (this.a.getMParams().getMWidgetStatus() != p0.getMWidgetStatus())? 1: 0;
       boolean b1 = b.k(p0);
       if (b && (b1 && i)) {
          a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, AbsorbedLowActivePendant.class, "16")) {
             ta.y();
          }
       }
       return;
    }
}
