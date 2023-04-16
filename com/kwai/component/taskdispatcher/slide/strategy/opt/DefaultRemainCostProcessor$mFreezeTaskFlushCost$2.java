package com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mFreezeTaskFlushCost$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import ih5.z;
import java.util.concurrent.TimeUnit;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$a;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import lh5.a;
import java.lang.Long;

public final class DefaultRemainCostProcessor$mFreezeTaskFlushCost$2 extends Lambda implements a	// class@000bad
{
    public final DefaultRemainCostProcessor this$0;

    public void DefaultRemainCostProcessor$mFreezeTaskFlushCost$2(DefaultRemainCostProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DefaultRemainCostProcessor$mFreezeTaskFlushCost$2 obj = PatchProxy.apply(objArray, this, DefaultRemainCostProcessor$mFreezeTaskFlushCost$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       z obj1 = PatchProxy.apply(objArray, obj, DefaultRemainCostProcessor.class, "5");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          obj1 = obj.g.freezeTaskRemainLimit;
          if (obj1 - null >= 0) {
             l = TimeUnit.MILLISECONDS.toNanos(obj1);
          }else if(!obj1 - -1){
             l = SlideVsyncMainSmartScatterStrategy.m.a();
          }else {
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             DispatchLogger.d.E(obj.a, "getFreezeFrameTaskFlushCost, mConfig.vsyncTimeThreshold--Nanos="+mILLISECONDS.toNanos(obj.f.b()));
             l = mILLISECONDS.toNanos(obj.f.b());
          }
       }
       DispatchLogger.d.E(this.this$0.a, "超过冻结执行任务帧个数后，强制执行调度任务耗时限制："+l+" nanoMill");
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
