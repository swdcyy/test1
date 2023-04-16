package com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$b;
import erd.g;
import java.lang.Object;
import com.kwai.feature.api.feed.growth.model.ResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sf0.f;

public final class PendantStatusVM$b implements g	// class@000702
{
    public static final PendantStatusVM$b b;

    static {
       PendantStatusVM$b.b = new PendantStatusVM$b();
    }
    public void PendantStatusVM$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantStatusVM$b.class, "1")) {
       }else {
          f.d.a(p0.isSuccess());
       }
       return;
    }
}
