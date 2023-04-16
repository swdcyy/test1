package com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mChunkDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import ih5.z;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import qrd.l1;
import java.lang.Long;

public final class DefaultRemainCostProcessor$mChunkDuration$2 extends Lambda implements a	// class@000bac
{
    public final DefaultRemainCostProcessor this$0;

    public void DefaultRemainCostProcessor$mChunkDuration$2(DefaultRemainCostProcessor p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, DefaultRemainCostProcessor$mChunkDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       DefaultRemainCostProcessor$mChunkDuration$2 tthis$0 = this.this$0;
       z frameRemain = tthis$0.g.frameRemain;
       DispatchLogger.d.E(tthis$0.a, "√ø÷°‘§¡Ù ±º‰£∫"+frameRemain+" ms");
       return TimeUnit.MILLISECONDS.toNanos(frameRemain);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
