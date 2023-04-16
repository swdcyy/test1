package com.yxcorp.gifshow.detail.player.panel.config.SpeedConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SpeedConfig implements Serializable	// class@001623
{
    public final String displayName;
    public final float speed;
    public final String speedId;

    public void SpeedConfig(String p0,float p1,String p2){
       a.p(p0, "displayName");
       a.p(p2, "speedId");
       super();
       this.displayName = p0;
       this.speed = p1;
       this.speedId = p2;
    }
    public static SpeedConfig copy$default(SpeedConfig p0,String p1,float p2,String p3,int p4,Object p5){
       SpeedConfig displayName;
       SpeedConfig speed;
       SpeedConfig speedId;
       if (p4 & 0x01) {
          displayName = p0.displayName;
       }
       if (p4 & 0x02) {
          speed = p0.speed;
       }
       if (p4 & 0x04) {
          speedId = p0.speedId;
       }
       return p0.copy(displayName, speed, speedId);
    }
    public final String component1(){
       return this.displayName;
    }
    public final float component2(){
       return this.speed;
    }
    public final String component3(){
       return this.speedId;
    }
    public final SpeedConfig copy(String p0,float p1,String p2){
       if (PatchProxy.isSupport(SpeedConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), p2, this, SpeedConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "displayName");
       a.p(p2, "speedId");
       return new SpeedConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SpeedConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SpeedConfig && (a.g(this.displayName, p0.displayName) && (!Float.compare(this.speed, p0.speed) && a.g(this.speedId, p0.speedId))))) {
          return true;
       }
       return false;
    }
    public final String getDisplayName(){
       return this.displayName;
    }
    public final float getSpeed(){
       return this.speed;
    }
    public final String getSpeedId(){
       return this.speedId;
    }
    public int hashCode(){
       SpeedConfig obj = PatchProxy.apply(null, this, SpeedConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.displayName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + Float.floatToIntBits(this.speed)) * 31;
       SpeedConfig tspeedId = this.speedId;
       if (tspeedId != null) {
          i = tspeedId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SpeedConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SpeedConfig\(displayName="+this.displayName+", speed="+this.speed+", speedId="+this.speedId+"\)";
    }
}
