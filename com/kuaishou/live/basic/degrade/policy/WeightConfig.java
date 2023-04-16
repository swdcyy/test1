package com.kuaishou.live.basic.degrade.policy.WeightConfig;
import java.io.Serializable;
import com.kuaishou.live.basic.degrade.policy.LiveLevelWeightType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class WeightConfig implements Serializable	// class@000cc1
{
    public final LiveLevelWeightType type;
    public final double weight;

    public void WeightConfig(LiveLevelWeightType p0,double p1){
       super();
       this.type = p0;
       this.weight = p1;
    }
    public static WeightConfig copy$default(WeightConfig p0,LiveLevelWeightType p1,double p2,int p3,Object p4){
       WeightConfig type;
       WeightConfig weight;
       if (p3 & 0x01) {
          type = p0.type;
       }
       if (p3 & 0x02) {
          weight = p0.weight;
       }
       return p0.copy(type, weight);
    }
    public final LiveLevelWeightType component1(){
       return this.type;
    }
    public final double component2(){
       return this.weight;
    }
    public final WeightConfig copy(LiveLevelWeightType p0,double p1){
       if (PatchProxy.isSupport(WeightConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, WeightConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new WeightConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WeightConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof WeightConfig && (a.g(this.type, p0.type) && !Double.compare(this.weight, p0.weight)))) {
          return true;
       }
       return false;
    }
    public final LiveLevelWeightType getType(){
       return this.type;
    }
    public final double getWeight(){
       return this.weight;
    }
    public int hashCode(){
       WeightConfig obj = PatchProxy.apply(null, this, WeightConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = (obj != null)? obj.hashCode(): 0;
       long l = Double.doubleToLongBits(this.weight);
       return ((i * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WeightConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WeightConfig\(type="+this.type+", weight="+this.weight+"\)";
    }
}
