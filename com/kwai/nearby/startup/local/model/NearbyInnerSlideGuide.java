package com.kwai.nearby.startup.local.model.NearbyInnerSlideGuide;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyInnerSlideGuide$a;
import nsd.u;
import java.lang.String;
import com.kwai.nearby.startup.local.model.NearbyInnerSlideGuideParam;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyInnerSlideGuide implements Serializable	// class@001023
{
    public final int intervalHours;
    public final boolean invalidUser;
    public final int liveStreamIntervalHours;
    public final int liveStreamScene;
    public final NearbyInnerSlideGuideParam liveStreamTriggerConfig;
    public final int secondsBeforeEnding;
    public final NearbyInnerSlideGuideParam triggerConfig;
    public final String upSlideText;
    public static final NearbyInnerSlideGuide$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyInnerSlideGuide.Companion = new NearbyInnerSlideGuide$a(null);
    }
    public void NearbyInnerSlideGuide(String p0,int p1,int p2,int p3,int p4,NearbyInnerSlideGuideParam p5,NearbyInnerSlideGuideParam p6,boolean p7){
       super();
       this.upSlideText = p0;
       this.secondsBeforeEnding = p1;
       this.intervalHours = p2;
       this.liveStreamIntervalHours = p3;
       this.liveStreamScene = p4;
       this.triggerConfig = p5;
       this.liveStreamTriggerConfig = p6;
       this.invalidUser = p7;
    }
    public void NearbyInnerSlideGuide(String p0,int p1,int p2,int p3,int p4,NearbyInnerSlideGuideParam p5,NearbyInnerSlideGuideParam p6,boolean p7,int p8,u p9){
       int i = p8;
       int i1 = (i & 0x02)? 3: p1;
       int i2 = (i & 0x04)? 3: p2;
       int i3 = (i & 0x08)? 3: p3;
       int i4 = (i & 0x10)? 0: p4;
       boolean b = (i & 0x0080)? false: p7;
       super(p0, i1, i2, i3, i4, p5, p6, b);
       return;
    }
    public static NearbyInnerSlideGuide copy$default(NearbyInnerSlideGuide p0,String p1,int p2,int p3,int p4,int p5,NearbyInnerSlideGuideParam p6,NearbyInnerSlideGuideParam p7,boolean p8,int p9,Object p10){
       NearbyInnerSlideGuide nearbyInnerS = p0;
       int i = p9;
       NearbyInnerSlideGuide upSlideText = (i & 0x01)? nearbyInnerS.upSlideText: p1;
       NearbyInnerSlideGuide secondsBefor = (i & 0x02)? nearbyInnerS.secondsBeforeEnding: p2;
       NearbyInnerSlideGuide intervalHour = (i & 0x04)? nearbyInnerS.intervalHours: p3;
       NearbyInnerSlideGuide liveStreamIn = (i & 0x08)? nearbyInnerS.liveStreamIntervalHours: p4;
       NearbyInnerSlideGuide liveStreamSc = (i & 0x10)? nearbyInnerS.liveStreamScene: p5;
       NearbyInnerSlideGuide triggerConfi = (i & 0x20)? nearbyInnerS.triggerConfig: p6;
       NearbyInnerSlideGuide liveStreamTr = (i & 0x40)? nearbyInnerS.liveStreamTriggerConfig: p7;
       NearbyInnerSlideGuide invalidUser = (i & 0x0080)? nearbyInnerS.invalidUser: p8;
       return p0.copy(upSlideText, secondsBefor, intervalHour, liveStreamIn, liveStreamSc, triggerConfi, liveStreamTr, invalidUser);
    }
    public final String component1(){
       return this.upSlideText;
    }
    public final int component2(){
       return this.secondsBeforeEnding;
    }
    public final int component3(){
       return this.intervalHours;
    }
    public final int component4(){
       return this.liveStreamIntervalHours;
    }
    public final int component5(){
       return this.liveStreamScene;
    }
    public final NearbyInnerSlideGuideParam component6(){
       return this.triggerConfig;
    }
    public final NearbyInnerSlideGuideParam component7(){
       return this.liveStreamTriggerConfig;
    }
    public final boolean component8(){
       return this.invalidUser;
    }
    public final NearbyInnerSlideGuide copy(String p0,int p1,int p2,int p3,int p4,NearbyInnerSlideGuideParam p5,NearbyInnerSlideGuideParam p6,boolean p7){
       Object obj;
       if (PatchProxy.isSupport(NearbyInnerSlideGuide.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,p6,Boolean.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, NearbyInnerSlideGuide.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       NearbyInnerSlideGuide nearbyInnerS = new NearbyInnerSlideGuide(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyInnerSlideGuide.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyInnerSlideGuide && (a.g(this.upSlideText, p0.upSlideText) && (this.secondsBeforeEnding == p0.secondsBeforeEnding && (this.intervalHours == p0.intervalHours && (this.liveStreamIntervalHours == p0.liveStreamIntervalHours && (this.liveStreamScene == p0.liveStreamScene && (a.g(this.triggerConfig, p0.triggerConfig) && (a.g(this.liveStreamTriggerConfig, p0.liveStreamTriggerConfig) && this.invalidUser == p0.invalidUser))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NearbyInnerSlideGuide obj = PatchProxy.apply(null, this, NearbyInnerSlideGuide.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.upSlideText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((((((i1 * 31) + this.secondsBeforeEnding) * 31) + this.intervalHours) * 31) + this.liveStreamIntervalHours) * 31) + this.liveStreamScene) * 31;
       NearbyInnerSlideGuide ttriggerConf = this.triggerConfig;
       int i2 = (ttriggerConf != null)? ttriggerConf.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttriggerConf = this.liveStreamTriggerConfig;
       if (ttriggerConf != null) {
          i = ttriggerConf.hashCode();
       }
       i1 = (i1 + i) * 31;
       NearbyInnerSlideGuide tinvalidUser = this.invalidUser;
       if (tinvalidUser != null) {
          tinvalidUser = 1;
       }
       return (i1 + tinvalidUser);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyInnerSlideGuide.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyInnerSlideGuide\(upSlideText="+this.upSlideText+", secondsBeforeEnding="+this.secondsBeforeEnding+", intervalHours="+this.intervalHours+", liveStreamIntervalHours="+this.liveStreamIntervalHours+", liveStreamScene="+this.liveStreamScene+", triggerConfig="+this.triggerConfig+", liveStreamTriggerConfig="+this.liveStreamTriggerConfig+", invalidUser="+this.invalidUser+"\)";
    }
}
