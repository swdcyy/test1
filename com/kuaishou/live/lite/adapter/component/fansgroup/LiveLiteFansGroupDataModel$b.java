package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$b;
import erd.g;
import mrd.a;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class LiveLiteFansGroupDataModel$b implements g	// class@001d86
{
    public final a b;

    public void LiveLiteFansGroupDataModel$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupDataModel$b.class, "1")) {
       }else {
          this.b.onNext(Boolean.TRUE);
          this.b.onComplete();
       }
       return;
    }
}
