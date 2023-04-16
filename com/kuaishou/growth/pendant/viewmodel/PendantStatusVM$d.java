package com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$d;
import erd.g;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import com.kuaishou.growth.pendant.model.PendantChangeWidgetStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.pendant.core.model.ChangeWidgetStatusBtnConfig$Status;
import tkd.b;
import tkd.d;
import vt5.g;
import sf0.f;
import java.util.List;

public final class PendantStatusVM$d implements g	// class@000704
{
    public final boolean b;
    public final Ref$IntRef c;

    public void PendantStatusVM$d(boolean p0,Ref$IntRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       ChangeWidgetStatusBtnConfig$Status cLOSE;
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantStatusVM$d.class, "1")) {
       }else if(this.b != null){
          cLOSE = ChangeWidgetStatusBtnConfig$Status.CLOSE;
       }else {
          cLOSE = ChangeWidgetStatusBtnConfig$Status.OPEN;
       }
       d.a(0x348c642a).GI(cLOSE);
       f.d.c(this.c.element, p0.getMEncourageWidgetParams(), true);
       return;
    }
}
