package com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$e;
import erd.g;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import mf0.a;
import sf0.f;
import java.util.List;

public final class PendantStatusVM$e implements g	// class@000705
{
    public final Ref$IntRef b;

    public void PendantStatusVM$e(Ref$IntRef p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantStatusVM$e.class, "1")) {
       }else {
          a.c("pendantCloseOrOpenReport->"+p0.getMessage());
          f.d.c(this.b.element, null, false);
       }
       return;
    }
}
