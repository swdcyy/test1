package com.kuaishou.live.basic.performance.biz.MemoryPerfStatExecutor$onStartStat$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.performance.biz.MemoryPerfStatExecutor;
import java.lang.Object;
import eg7.a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor$b;
import n66.f;

public final class MemoryPerfStatExecutor$onStartStat$1 extends Lambda implements p	// class@000cec
{
    public final long $periodDuration;
    public final MemoryPerfStatExecutor this$0;

    public void MemoryPerfStatExecutor$onStartStat$1(MemoryPerfStatExecutor p0,long p1){
       this.this$0 = p0;
       this.$periodDuration = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(a p0,a p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, MemoryPerfStatExecutor$onStartStat$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.p(p1, "<anonymous parameter 1>");
       boolean b = (this.this$0.c() - this.$periodDuration >= 0)? true: false;
       if (b) {
          f.a("live_biz_data", this.this$0.a());
       }
       return b;
    }
}
