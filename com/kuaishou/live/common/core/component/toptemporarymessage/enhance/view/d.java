package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.d;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.c;
import yb7.p;

public final class d implements Runnable	// class@0017b2
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       LiveTempEnhanceView k = tb.a.k;
       Runnable runnable = null;
       if (k != null) {
          k.run();
          tb.a.k = runnable;
       }
       e a = tb.a;
       a.i = true;
       if (!PatchProxy.applyVoid(runnable, a, LiveTempEnhanceView.class, "8")) {
          p.f(new c(a), a, 1000);
       }
       return;
    }
}
