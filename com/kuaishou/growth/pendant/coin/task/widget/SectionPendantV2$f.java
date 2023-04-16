package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$f;
import erd.g;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ld0.c;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import yd0.f;
import fd0.l;

public final class SectionPendantV2$f implements g	// class@000624
{
    public final SectionPendantV2 b;

    public void SectionPendantV2$f(SectionPendantV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2$f.class, "1")) {
       }else {
          a.p(p0, "s");
          c.c("postUiTransformEvent subscribe by SectionPendant in value "+p0);
          if (a.g(p0, "ADSORBED_LOW_ACTIVE_SHOW_ANIM_DONE") || a.g(p0, "ADSORBED_LOW_ACTIVE_HIDE_ANIM_DONE")) {
             l.b(this.b, true);
          }else if(a.g(p0, "ADSORBED_LOW_ACTIVE_CLOSE_CLICK")){
             f.j(this.b);
          }
       }
       return;
    }
}
