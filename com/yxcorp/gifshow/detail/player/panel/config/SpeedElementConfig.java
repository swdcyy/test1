package com.yxcorp.gifshow.detail.player.panel.config.SpeedElementConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SpeedElementConfig implements Serializable	// class@001624
{
    public final boolean enable;
    public final List speedConfigs;

    public void SpeedElementConfig(boolean p0,List p1){
       super();
       this.enable = p0;
       this.speedConfigs = p1;
    }
    public static SpeedElementConfig copy$default(SpeedElementConfig p0,boolean p1,List p2,int p3,Object p4){
       SpeedElementConfig enable;
       SpeedElementConfig speedConfigs;
       if (p3 & 0x01) {
          enable = p0.enable;
       }
       if (p3 & 0x02) {
          speedConfigs = p0.speedConfigs;
       }
       return p0.copy(enable, speedConfigs);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final List component2(){
       return this.speedConfigs;
    }
    public final SpeedElementConfig copy(boolean p0,List p1){
       if (PatchProxy.isSupport(SpeedElementConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, SpeedElementConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SpeedElementConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SpeedElementConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SpeedElementConfig && (this.enable == p0.enable && a.g(this.speedConfigs, p0.speedConfigs)))) {
          return true;
       }
       return false;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final List getSpeedConfigs(){
       return this.speedConfigs;
    }
    public int hashCode(){
       int i;
       SpeedElementConfig obj = PatchProxy.apply(null, this, SpeedElementConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       SpeedElementConfig tspeedConfig = this.speedConfigs;
       int i1 = (tspeedConfig != null)? tspeedConfig.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SpeedElementConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SpeedElementConfig\(enable="+this.enable+", speedConfigs="+this.speedConfigs+"\)";
    }
}
