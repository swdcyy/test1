package com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mMaxFreezeCountLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ih5.z;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class DefaultRemainCostProcessor$mMaxFreezeCountLimit$2 extends Lambda implements a	// class@000bae
{
    public final DefaultRemainCostProcessor this$0;

    public void DefaultRemainCostProcessor$mMaxFreezeCountLimit$2(DefaultRemainCostProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       DefaultRemainCostProcessor$mMaxFreezeCountLimit$2 obj = PatchProxy.apply(null, this, DefaultRemainCostProcessor$mMaxFreezeCountLimit$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0;
       z freezeFrameC = obj.g.freezeFrameCountLimit;
       DispatchLogger.d.E(obj.a, "最多允许"+freezeFrameC+" 帧不执行调度");
       return freezeFrameC;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
