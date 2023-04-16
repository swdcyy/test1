package com.yxcorp.gifshow.follow.common.degrade.policy.FollowDeviceBenchmarkItemRangeConfig;
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

public final class FollowDeviceBenchmarkItemRangeConfig implements Serializable	// class@001048
{
    public final Range range;
    public final int score;

    public void FollowDeviceBenchmarkItemRangeConfig(Range p0,int p1){
       a.p(p0, "range");
       super();
       this.range = p0;
       this.score = p1;
    }
    public static FollowDeviceBenchmarkItemRangeConfig copy$default(FollowDeviceBenchmarkItemRangeConfig p0,Range p1,int p2,int p3,Object p4){
       FollowDeviceBenchmarkItemRangeConfig range;
       FollowDeviceBenchmarkItemRangeConfig score;
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
    public final FollowDeviceBenchmarkItemRangeConfig copy(Range p0,int p1){
       if (PatchProxy.isSupport(FollowDeviceBenchmarkItemRangeConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, FollowDeviceBenchmarkItemRangeConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "range");
       return new FollowDeviceBenchmarkItemRangeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowDeviceBenchmarkItemRangeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowDeviceBenchmarkItemRangeConfig && (a.g(this.range, p0.range) && this.score == p0.score))) {
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
       FollowDeviceBenchmarkItemRangeConfig obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemRangeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.range;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.score);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemRangeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowDeviceBenchmarkItemRangeConfig\(range="+this.range+", score="+this.score+"\)";
    }
}
