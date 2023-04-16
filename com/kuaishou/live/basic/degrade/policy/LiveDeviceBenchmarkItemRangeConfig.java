package com.kuaishou.live.basic.degrade.policy.LiveDeviceBenchmarkItemRangeConfig;
import java.io.Serializable;
import com.google.common.collect.Range;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveDeviceBenchmarkItemRangeConfig implements Serializable	// class@000cbd
{
    public final Range range;
    public final int score;

    public void LiveDeviceBenchmarkItemRangeConfig(Range p0,int p1){
       a.p(p0, "range");
       super();
       this.range = p0;
       this.score = p1;
    }
    public static LiveDeviceBenchmarkItemRangeConfig copy$default(LiveDeviceBenchmarkItemRangeConfig p0,Range p1,int p2,int p3,Object p4){
       LiveDeviceBenchmarkItemRangeConfig range;
       LiveDeviceBenchmarkItemRangeConfig score;
       if (p3 & 0x01) {
          range = p0.range;
       }
       if (p3 & 0x02) {
          score = p0.score;
       }
       return p0.copy(range, score);
    }
    public final Range component1(){
       return this.range;
    }
    public final int component2(){
       return this.score;
    }
    public final LiveDeviceBenchmarkItemRangeConfig copy(Range p0,int p1){
       if (PatchProxy.isSupport(LiveDeviceBenchmarkItemRangeConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, LiveDeviceBenchmarkItemRangeConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "range");
       return new LiveDeviceBenchmarkItemRangeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDeviceBenchmarkItemRangeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveDeviceBenchmarkItemRangeConfig && (a.g(this.range, p0.range) && this.score == p0.score))) {
          return true;
       }
       return false;
    }
    public final Range getRange(){
       return this.range;
    }
    public final int getScore(){
       return this.score;
    }
    public int hashCode(){
       LiveDeviceBenchmarkItemRangeConfig obj = PatchProxy.apply(null, this, LiveDeviceBenchmarkItemRangeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.range;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.score);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveDeviceBenchmarkItemRangeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveDeviceBenchmarkItemRangeConfig\(range="+this.range+", score="+this.score+"\)";
    }
}
