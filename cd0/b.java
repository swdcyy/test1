package cd0.b;
import sf0.b;
import com.kuaishou.growth.pendant.coin.absorb.widget.AbsorbedLowActivePendant;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.util.Objects;
import mf0.b;

public final class b implements b	// class@00030f
{
    public final AbsorbedLowActivePendant b;

    public void b(AbsorbedLowActivePendant p0){
       a.p(p0, "absorbedLowActivePendant");
       super();
       this.b = p0;
    }
    public void a(boolean p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0) {
          this.b.getMParams().setMWidgetStatus(4);
          b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, AbsorbedLowActivePendant.class, "15") && !b.s(tb.getMParams())) {
             tb.y();
          }
       }
       return;
    }
}
