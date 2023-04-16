package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$d;
import gd0.b;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import com.kuaishou.growth.pendant.coin.core.config.view.PendantViewState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class SectionPendantV2$d implements b	// class@000622
{
    public final SectionPendantV2 a;

    public void SectionPendantV2$d(SectionPendantV2 p0){
       this.a = p0;
       super();
    }
    public void a(PendantViewState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectionPendantV2$d.class, "1")) {
          return;
       }
       a.p(p0, "viewState");
       if (p0 == PendantViewState.inflate2Main) {
          this.a.doBindView(this.a);
          this.a.x();
       }
       return;
    }
}
