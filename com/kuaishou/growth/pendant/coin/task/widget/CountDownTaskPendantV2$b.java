package com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2$b;
import gd0.b;
import com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2;
import java.lang.Object;
import com.kuaishou.growth.pendant.coin.core.config.view.PendantViewState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class CountDownTaskPendantV2$b implements b	// class@00061c
{
    public final CountDownTaskPendantV2 a;

    public void CountDownTaskPendantV2$b(CountDownTaskPendantV2 p0){
       this.a = p0;
       super();
    }
    public void a(PendantViewState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2$b.class, "1")) {
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
