package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$c;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import mrd.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;

public final class LiveLiteFansGroupDataModel$c implements g	// class@001d87
{
    public final LiveLiteFansGroupDataModel b;
    public final a c;

    public void LiveLiteFansGroupDataModel$c(LiveLiteFansGroupDataModel p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupDataModel$c.class, "1")) {
       }else {
          b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "request fansGroupInfo error, error="+p0);
          this.c.onNext(Boolean.FALSE);
          this.c.onComplete();
       }
       return;
    }
}
