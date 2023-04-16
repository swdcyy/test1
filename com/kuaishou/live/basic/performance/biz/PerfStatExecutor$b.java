package com.kuaishou.live.basic.performance.biz.PerfStatExecutor$b;
import java.lang.String;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor$StatPeriod;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PerfStatExecutor$b	// class@000cf0
{
    public final List bizList;
    public final String liveStreamId;
    public final PerfStatExecutor$StatPeriod statPeriod;

    public void PerfStatExecutor$b(String p0,PerfStatExecutor$StatPeriod p1,List p2){
       a.p(p0, "liveStreamId");
       a.p(p1, "statPeriod");
       a.p(p2, "bizList");
       super();
       this.liveStreamId = p0;
       this.statPeriod = p1;
       this.bizList = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PerfStatExecutor$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PerfStatExecutor$b && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.statPeriod, p0.statPeriod) && a.g(this.bizList, p0.bizList))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PerfStatExecutor$b obj = PatchProxy.apply(null, this, PerfStatExecutor$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PerfStatExecutor$b tstatPeriod = this.statPeriod;
       int i2 = (tstatPeriod != null)? tstatPeriod.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tstatPeriod = this.bizList;
       if (tstatPeriod != null) {
          i = tstatPeriod.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PerfStatExecutor$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PeriodBizData\(liveStreamId="+this.liveStreamId+", statPeriod="+this.statPeriod+", bizList="+this.bizList+"\)";
    }
}
