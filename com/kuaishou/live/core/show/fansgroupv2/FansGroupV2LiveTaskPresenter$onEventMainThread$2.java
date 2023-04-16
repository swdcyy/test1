package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$onEventMainThread$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import i95.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class FansGroupV2LiveTaskPresenter$onEventMainThread$2 extends Lambda implements a	// class@000b4c
{
    public final int $actionActionType;
    public final f $taskEvent;

    public void FansGroupV2LiveTaskPresenter$onEventMainThread$2(int p0,f p1){
       this.$actionActionType = p0;
       this.$taskEvent = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, FansGroupV2LiveTaskPresenter$onEventMainThread$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "actionType: "+this.$actionActionType+", scheme: "+this.$taskEvent.c();
    }
}
