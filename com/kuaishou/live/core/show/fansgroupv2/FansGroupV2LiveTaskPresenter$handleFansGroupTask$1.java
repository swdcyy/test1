package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$handleFansGroupTask$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import i95.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class FansGroupV2LiveTaskPresenter$handleFansGroupTask$1 extends Lambda implements a	// class@000b4a
{
    public final f $task;

    public void FansGroupV2LiveTaskPresenter$handleFansGroupTask$1(f p0){
       this.$task = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, FansGroupV2LiveTaskPresenter$handleFansGroupTask$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskEvent: "+this.$task.d()+'-'+this.$task.c()+'-'+this.$task.a();
    }
}
