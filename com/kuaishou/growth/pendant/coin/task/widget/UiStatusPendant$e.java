package com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$e;
import erd.g;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant;
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

public final class UiStatusPendant$e implements g	// class@00062b
{
    public final UiStatusPendant b;

    public void UiStatusPendant$e(UiStatusPendant p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant$e.class, "1")) {
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
