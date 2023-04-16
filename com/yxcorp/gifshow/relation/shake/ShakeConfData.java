package com.yxcorp.gifshow.relation.shake.ShakeConfData;
import java.io.Serializable;
import com.yxcorp.gifshow.relation.shake.ShakeConfData$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ShakeConfData implements Serializable	// class@0019cd
{
    public final int rockCount;
    public final int rockThreshold;
    public final int shakeDuration;
    public static final ShakeConfData$a Companion;
    public static final long serialVersionUID;

    static {
       ShakeConfData.Companion = new ShakeConfData$a(null);
    }
    public void ShakeConfData(int p0,int p1,int p2){
       super();
       this.shakeDuration = p0;
       this.rockCount = p1;
       this.rockThreshold = p2;
    }
    public static ShakeConfData copy$default(ShakeConfData p0,int p1,int p2,int p3,int p4,Object p5){
       ShakeConfData shakeDuratio;
       ShakeConfData rockCount;
       ShakeConfData rockThreshol;
       if (p4 & 0x01) {
          shakeDuratio = p0.shakeDuration;
       }
       if (p4 & 0x02) {
          rockCount = p0.rockCount;
       }
       if (p4 & 0x04) {
          rockThreshol = p0.rockThreshold;
       }
       return p0.copy(shakeDuratio, rockCount, rockThreshol);
    }
    public final int component1(){
       return this.shakeDuration;
    }
    public final int component2(){
       return this.rockCount;
    }
    public final int component3(){
       return this.rockThreshold;
    }
    public final ShakeConfData copy(int p0,int p1,int p2){
       if (PatchProxy.isSupport(ShakeConfData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ShakeConfData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ShakeConfData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ShakeConfData && (this.shakeDuration == p0.shakeDuration && (this.rockCount == p0.rockCount && this.rockThreshold == p0.rockThreshold)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ShakeConfData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((this.shakeDuration * 31) + this.rockCount) * 31) + this.rockThreshold);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShakeConfData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShakeConfData\(shakeDuration="+this.shakeDuration+", rockCount="+this.rockCount+", rockThreshold="+this.rockThreshold+"\)";
    }
}
