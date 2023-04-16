package com.kuaishou.live.basic.performance.biz.PerfStatExecutor$StatPeriod;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PerfStatExecutor$StatPeriod	// class@000cee
{
    public final long beginTime;
    public final long endTime;

    public void PerfStatExecutor$StatPeriod(long p0,long p1){
       super();
       this.beginTime = p0;
       this.endTime = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PerfStatExecutor$StatPeriod && (!this.beginTime - p0.beginTime && !this.endTime - p0.endTime))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PerfStatExecutor$StatPeriod obj = PatchProxy.apply(null, this, PerfStatExecutor$StatPeriod.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.beginTime;
       PerfStatExecutor$StatPeriod tendTime = this.endTime;
       return (((int)(obj ^ (obj >> 32)) * 31) + (int)(tendTime ^ (tendTime >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PerfStatExecutor$StatPeriod.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StatPeriod\(beginTime="+this.beginTime+", endTime="+this.endTime+"\)";
    }
}
