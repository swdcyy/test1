package com.kwai.nearby.startup.local.model.FilterBubbleConfig;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.FilterBubbleConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FilterBubbleConfig implements Serializable	// class@00101c
{
    public final int durationMs;
    public final long intervalMs;
    public static final FilterBubbleConfig$a Companion;
    public static final long serialVersionUID;

    static {
       FilterBubbleConfig.Companion = new FilterBubbleConfig$a(null);
    }
    public void FilterBubbleConfig(int p0,long p1){
       super();
       this.durationMs = p0;
       this.intervalMs = p1;
    }
    public static FilterBubbleConfig copy$default(FilterBubbleConfig p0,int p1,long p2,int p3,Object p4){
       FilterBubbleConfig durationMs;
       FilterBubbleConfig intervalMs;
       if (p3 & 0x01) {
          durationMs = p0.durationMs;
       }
       if (p3 & 0x02) {
          intervalMs = p0.intervalMs;
       }
       return p0.copy(durationMs, intervalMs);
    }
    public final int component1(){
       return this.durationMs;
    }
    public final long component2(){
       return this.intervalMs;
    }
    public final FilterBubbleConfig copy(int p0,long p1){
       if (PatchProxy.isSupport(FilterBubbleConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, FilterBubbleConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FilterBubbleConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FilterBubbleConfig && (this.durationMs == p0.durationMs && !this.intervalMs - p0.intervalMs))) {
          return true;
       }
       return false;
    }
    public final int getDurationMs(){
       return this.durationMs;
    }
    public final long getIntervalMs(){
       return this.intervalMs;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FilterBubbleConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       FilterBubbleConfig tintervalMs = this.intervalMs;
       return ((this.durationMs * 31) + (int)(tintervalMs ^ (tintervalMs >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterBubbleConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterBubbleConfig\(durationMs="+this.durationMs+", intervalMs="+this.intervalMs+"\)";
    }
}
