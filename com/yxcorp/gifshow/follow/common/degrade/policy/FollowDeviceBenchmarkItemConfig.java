package com.yxcorp.gifshow.follow.common.degrade.policy.FollowDeviceBenchmarkItemConfig;
import t27.a;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Comparable;
import java.lang.StringBuilder;

public final class FollowDeviceBenchmarkItemConfig implements a, Serializable	// class@001047
{
    public final int lowBound;
    public final int score;

    public void FollowDeviceBenchmarkItemConfig(int p0,int p1){
       super();
       this.lowBound = p0;
       this.score = p1;
    }
    public static FollowDeviceBenchmarkItemConfig copy$default(FollowDeviceBenchmarkItemConfig p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = p0.getLowBound().intValue();
       }
       if (p3 & 0x02) {
          p2 = p0.getScore().intValue();
       }
       return p0.copy(p1, p2);
    }
    public final int component1(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getLowBound().intValue();
    }
    public final int component2(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getScore().intValue();
    }
    public final FollowDeviceBenchmarkItemConfig copy(int p0,int p1){
       if (PatchProxy.isSupport(FollowDeviceBenchmarkItemConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FollowDeviceBenchmarkItemConfig.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FollowDeviceBenchmarkItemConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowDeviceBenchmarkItemConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowDeviceBenchmarkItemConfig && (this.getLowBound().intValue() == p0.getLowBound().intValue() && this.getScore().intValue() == p0.getScore().intValue()))) {
          return true;
       }
       return false;
    }
    public Comparable getLowBound(){
       return this.getLowBound();
    }
    public Integer getLowBound(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(this.lowBound);
    }
    public Integer getScore(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(this.score);
    }
    public Object getScore(){
       return this.getScore();
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.getLowBound().intValue() * 31) + this.getScore().intValue());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowDeviceBenchmarkItemConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowDeviceBenchmarkItemConfig\(lowBound="+this.getLowBound()+", score="+this.getScore()+"\)";
    }
}
