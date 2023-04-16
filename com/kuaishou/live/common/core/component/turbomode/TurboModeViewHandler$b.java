package com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler$b;
import erd.g;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.View;
import msd.l;

public final class TurboModeViewHandler$b implements g	// class@0017be
{
    public final TurboModeViewHandler b;

    public void TurboModeViewHandler$b(TurboModeViewHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TurboModeViewHandler$b.class, "1")) {
       }else {
          a.o(p0, "isEnabled");
          int i = (p0.booleanValue())? 0: 4;
          Iterator iterator = this.b.c.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (view != null) {
                view.setVisibility(i);
             }
          }
          this.b.d.invoke(p0);
          PatchProxy.onMethodExit(TurboModeViewHandler$b.class, "1");
       }
       return;
    }
}
