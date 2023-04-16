package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import id0.b;
import ld0.d;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import dd0.b;

public final class SectionPendantV2$c extends m	// class@000621
{
    public final SectionPendantV2 c;

    public void SectionPendantV2$c(SectionPendantV2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2$c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       d.b().a(this.c.getMParams());
       d.a().Y6(this.c, true);
       return;
    }
}
