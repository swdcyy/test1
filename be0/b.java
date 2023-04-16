package be0.b;
import sf0.b;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;

public final class b implements b	// class@000350
{
    public final SectionPendantV2 b;

    public void b(SectionPendantV2 p0){
       a.p(p0, "sectionPendantV2");
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
          this.b.C(p1);
       }
       return;
    }
}
