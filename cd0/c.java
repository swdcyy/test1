package cd0.c;
import sf0.a;
import com.kuaishou.growth.pendant.coin.absorb.widget.AbsorbedLowActivePendant;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;

public final class c implements a	// class@000310
{
    public final AbsorbedLowActivePendant a;

    public void c(AbsorbedLowActivePendant p0){
       a.p(p0, "absorbedLowActivePendant");
       super();
       this.a = p0;
    }
    public void a(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0) {
          this.a.getMParams().setMWidgetStatus(1);
       }
       this.a.w();
       return;
    }
}
