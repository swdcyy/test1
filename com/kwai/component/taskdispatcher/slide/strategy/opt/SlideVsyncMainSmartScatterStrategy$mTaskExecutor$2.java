package com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.taskdispatcher.slide.strategy.opt.SlideVsyncMainSmartScatterStrategy;
import java.lang.Object;
import kh5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import java.util.Queue;
import lh5.a;
import ih5.z;

public final class SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2 extends Lambda implements a	// class@000bb2
{
    public final SlideVsyncMainSmartScatterStrategy this$0;

    public void SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2(SlideVsyncMainSmartScatterStrategy p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DispatchLogger.d.E("SmartScatterStrategy", "create Executor£¬"+this.this$0.j+", "+this.this$0.i);
       SlideVsyncMainSmartScatterStrategy$mTaskExecutor$2 tthis$0 = this.this$0;
       return new c(tthis$0.h, tthis$0.i, tthis$0.j);
    }
}
