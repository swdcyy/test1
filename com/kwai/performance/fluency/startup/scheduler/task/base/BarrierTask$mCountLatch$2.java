package com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$mCountLatch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask$b;
import java.util.List;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.Object;

public final class BarrierTask$mCountLatch$2 extends Lambda implements a	// class@000da2
{
    public final BarrierTask this$0;

    public void BarrierTask$mCountLatch$2(BarrierTask p0){
       this.this$0 = p0;
       super(0);
    }
    public final BarrierTask$b invoke(){
       return new BarrierTask$b(this.this$0.u().size());
    }
    public Object invoke(){
       return this.invoke();
    }
}
