package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$g;
import erd.g;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import te0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import yd0.a;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import dd0.k$b;

public final class SectionPendantV2$g implements g	// class@000625
{
    public final SectionPendantV2 b;

    public void SectionPendantV2$g(SectionPendantV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2$g.class, "1")) {
       }else {
          a.p(p0, "eventV2");
          if (a.i(this.b.getMParams(), p0.a())) {
             SectionPendantV2.E(this.b, p0.a(), p0.b, null, 4, null);
          }
       }
       return;
    }
}
