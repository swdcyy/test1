package com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$c;
import gd0.b;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant;
import java.lang.Object;
import com.kuaishou.growth.pendant.coin.core.config.view.PendantViewState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class UiStatusPendant$c implements b	// class@000629
{
    public final UiStatusPendant a;

    public void UiStatusPendant$c(UiStatusPendant p0){
       this.a = p0;
       super();
    }
    public void a(PendantViewState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant$c.class, "1")) {
          return;
       }
       a.p(p0, "viewState");
       if (p0 == PendantViewState.inflate2Main) {
          this.a.doBindView(this.a);
          this.a.v();
       }
       return;
    }
}
