package com.kwai.nearby.startup.local.model.NearbyInnerLocationGuide;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyInnerLocationGuide$a;
import nsd.u;
import com.kwai.nearby.startup.local.model.NearbyLocationTriggerConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyInnerLocationGuide implements Serializable	// class@001021
{
    public final boolean enableUseRatio;
    public final int intervalHours;
    public final float ratioAfterPlay;
    public final int secondsAfterPlay;
    public final int secondsAfterPlayForPic;
    public final NearbyLocationTriggerConfig triggerConfig;
    public static final NearbyInnerLocationGuide$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyInnerLocationGuide.Companion = new NearbyInnerLocationGuide$a(null);
    }
    public void NearbyInnerLocationGuide(int p0,int p1,float p2,boolean p3,int p4,NearbyLocationTriggerConfig p5){
       a.p(p5, "triggerConfig");
       super();
       this.secondsAfterPlay = p0;
       this.secondsAfterPlayForPic = p1;
       this.ratioAfterPlay = p2;
       this.enableUseRatio = p3;
       this.intervalHours = p4;
       this.triggerConfig = p5;
    }
    public static NearbyInnerLocationGuide copy$default(NearbyInnerLocationGuide p0,int p1,int p2,float p3,boolean p4,int p5,NearbyLocationTriggerConfig p6,int p7,Object p8){
       NearbyInnerLocationGuide secondsAfter;
       NearbyInnerLocationGuide secondsAfter1;
       NearbyInnerLocationGuide ratioAfterPl;
       NearbyInnerLocationGuide enableUseRat;
       NearbyInnerLocationGuide intervalHour;
       NearbyInnerLocationGuide triggerConfi;
       if (p7 & 0x01) {
          secondsAfter = p0.secondsAfterPlay;
       }
       if (p7 & 0x02) {
          secondsAfter1 = p0.secondsAfterPlayForPic;
       }
       p8 = secondsAfter1;
       if (p7 & 0x04) {
          ratioAfterPl = p0.ratioAfterPlay;
       }
       NearbyInnerLocationGuide nearbyInnerL = ratioAfterPl;
       if (p7 & 0x08) {
          enableUseRat = p0.enableUseRatio;
       }
       NearbyInnerLocationGuide nearbyInnerL1 = enableUseRat;
       if (p7 & 0x10) {
          intervalHour = p0.intervalHours;
       }
       NearbyInnerLocationGuide nearbyInnerL2 = intervalHour;
       if (p7 & 0x20) {
          triggerConfi = p0.triggerConfig;
       }
       return p0.copy(secondsAfter, p8, nearbyInnerL, nearbyInnerL1, nearbyInnerL2, triggerConfi);
    }
    public final int component1(){
       return this.secondsAfterPlay;
    }
    public final int component2(){
       return this.secondsAfterPlayForPic;
    }
    public final float component3(){
       return this.ratioAfterPlay;
    }
    public final boolean component4(){
       return this.enableUseRatio;
    }
    public final int component5(){
       return this.intervalHours;
    }
    public final NearbyLocationTriggerConfig component6(){
       return this.triggerConfig;
    }
    public final NearbyInnerLocationGuide copy(int p0,int p1,float p2,boolean p3,int p4,NearbyLocationTriggerConfig p5){
       Object obj;
       if (PatchProxy.isSupport(NearbyInnerLocationGuide.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Float.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, this, NearbyInnerLocationGuide.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p5, "triggerConfig");
       NearbyInnerLocationGuide nearbyInnerL = new NearbyInnerLocationGuide(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyInnerLocationGuide.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyInnerLocationGuide && (this.secondsAfterPlay == p0.secondsAfterPlay && (this.secondsAfterPlayForPic == p0.secondsAfterPlayForPic && (!Float.compare(this.ratioAfterPlay, p0.ratioAfterPlay) && (this.enableUseRatio == p0.enableUseRatio && (this.intervalHours == p0.intervalHours && a.g(this.triggerConfig, p0.triggerConfig)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyInnerLocationGuide.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((this.secondsAfterPlay * 31) + this.secondsAfterPlayForPic) * 31) + Float.floatToIntBits(this.ratioAfterPlay)) * 31;
       NearbyInnerLocationGuide tenableUseRa = this.enableUseRatio;
       if (tenableUseRa != null) {
          tenableUseRa = 1;
       }
       i = (((i + tenableUseRa) * 31) + this.intervalHours) * 31;
       tenableUseRa = this.triggerConfig;
       int i1 = (tenableUseRa != null)? tenableUseRa.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyInnerLocationGuide.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyInnerLocationGuide\(secondsAfterPlay="+this.secondsAfterPlay+", secondsAfterPlayForPic="+this.secondsAfterPlayForPic+", ratioAfterPlay="+this.ratioAfterPlay+", enableUseRatio="+this.enableUseRatio+", intervalHours="+this.intervalHours+", triggerConfig="+this.triggerConfig+"\)";
    }
}
