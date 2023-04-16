package com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor;
import kh5.a;
import lh5.a;
import ih5.z;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mChunkDuration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mMaxFreezeCountLimit$2;
import com.kwai.component.taskdispatcher.slide.strategy.opt.DefaultRemainCostProcessor$mFreezeTaskFlushCost$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Number;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;

public final class DefaultRemainCostProcessor implements a	// class@000baf
{
    public final String a;
    public int b;
    public final p c;
    public final p d;
    public final p e;
    public final a f;
    public final z g;

    public void DefaultRemainCostProcessor(a p0,z p1){
       a.p(p0, "mConfig");
       a.p(p1, "mSlideDispatchSmartConfig");
       super();
       this.f = p0;
       this.g = p1;
       this.a = "SmartScatterStrategy";
       this.c = s.c(new DefaultRemainCostProcessor$mChunkDuration$2(this));
       this.d = s.c(new DefaultRemainCostProcessor$mMaxFreezeCountLimit$2(this));
       this.e = s.c(new DefaultRemainCostProcessor$mFreezeTaskFlushCost$2(this));
    }
    public long a(long p0,long p1){
       if (PatchProxy.isSupport(DefaultRemainCostProcessor.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, DefaultRemainCostProcessor.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       Number number = PatchProxy.apply(null, this, DefaultRemainCostProcessor.class, "2");
       if (number == PatchProxyResult.class) {
          number = this.c.getValue();
       }
       p0 = p0 - number.longValue();
       if (p0 - null > 0) {
          if (this.b > null) {
             this.b = 0;
          }
       }else {
          this.b = this.b + 1;
          DispatchLogger.d.E(this.a, 0x7b2c+p1+" frame freeze,current freezeCount : "+this.b);
          DefaultRemainCostProcessor tb = this.b;
          Number number1 = PatchProxy.apply(null, this, DefaultRemainCostProcessor.class, "3");
          if (number1 == PatchProxyResult.class) {
             number1 = this.d.getValue();
          }
          if (tb >= number1.intValue()) {
             Number number2 = PatchProxy.apply(null, this, DefaultRemainCostProcessor.class, "4");
             if (number2 == PatchProxyResult.class) {
                number2 = this.e.getValue();
             }
             number2 = number2.longValue();
             this.b = 0;
          }
       }
       return p0;
    }
}
