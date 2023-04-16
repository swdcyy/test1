package com.yxcorp.gifshow.post.growth.TriggerTaskGroup$createGuideTaskAndExecute$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TriggerTaskGroup$createGuideTaskAndExecute$1 extends Lambda implements a	// class@000ffb
{
    public final GrowthGuideItemConfig $guideItem;

    public void TriggerTaskGroup$createGuideTaskAndExecute$1(GrowthGuideItemConfig p0){
       this.$guideItem = p0;
       super(0);
    }
    public final t invoke(){
       t obj = PatchProxy.apply(null, this, TriggerTaskGroup$createGuideTaskAndExecute$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.just(this.$guideItem);
       a.o(obj, "Observable.just\(guideItem\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
