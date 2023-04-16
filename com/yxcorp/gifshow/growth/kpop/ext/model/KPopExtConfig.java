package com.yxcorp.gifshow.growth.kpop.ext.model.KPopExtConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.KPopExtConfig$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.growth.kpop.ext.model.MinVersion;
import com.yxcorp.gifshow.growth.kpop.ext.model.WebConfig;
import com.yxcorp.gifshow.growth.kpop.ext.model.TkConfig;
import com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KPopExtConfig implements Serializable	// class@001409
{
    public final int demotionSupport;
    public final String fromBubbleId;
    public final String kwaiBubbleId;
    public final int maxTimes;
    public final MinVersion minVersion;
    public final int priority;
    public final int recordStrategy;
    public final long showInterval;
    public final int timesPerDay;
    public final List timing;
    public final TkConfig tkConfig;
    public final int type;
    public final VideoConfig videoConfig;
    public final WebConfig webConfig;
    public static final KPopExtConfig$a Companion;
    public static final long serialVersionUID;

    static {
       KPopExtConfig.Companion = new KPopExtConfig$a(null);
    }
    public void KPopExtConfig(){
       super(null, 0, 0, null, null, 0, 0, 0, 0, 0, null, null, null, null, 0x3fff, null);
    }
    public void KPopExtConfig(String p0){
       super(p0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null, null, null, 0x3ffe, null);
    }
    public void KPopExtConfig(String p0,int p1){
       super(p0, p1, 0, null, null, 0, 0, 0, 0, 0, null, null, null, null, 0x3ffc, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2){
       super(p0, p1, p2, null, null, 0, 0, 0, 0, 0, null, null, null, null, 0x3ff8, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3){
       super(p0, p1, p2, p3, null, 0, 0, 0, 0, 0, null, null, null, null, 0x3ff0, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4){
       super(p0, p1, p2, p3, p4, 0, 0, 0, 0, 0, null, null, null, null, 0x3fe0, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5){
       super(p0, p1, p2, p3, p4, p5, 0, 0, 0, 0, null, null, null, null, 0x3fc0, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6){
       super(p0, p1, p2, p3, p4, p5, p6, 0, 0, 0, null, null, null, null, 0x3f80, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7, 0, 0, null, null, null, null, 0x3f00, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, 0, null, null, null, null, 0x3e00, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, null, null, null, null, 0x3c00, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, null, null, null, 0x3800, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10,WebConfig p11){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, null, null, 0x3000, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10,WebConfig p11,TkConfig p12){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, null, 8192, null);
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10,WebConfig p11,TkConfig p12,VideoConfig p13){
       int i = this;
       Object obj = p10;
       a.p(p0, "kwaiBubbleId");
       a.p(p3, "timing");
       a.p(p4, "fromBubbleId");
       a.p(obj, "minVersion");
       super();
       i.kwaiBubbleId = p0;
       i.type = p1;
       i.priority = p2;
       i.timing = p3;
       i.fromBubbleId = p4;
       i.demotionSupport = p5;
       i.maxTimes = p6;
       i.timesPerDay = p7;
       i.showInterval = p8;
       i.recordStrategy = p9;
       i.minVersion = obj;
       i.webConfig = p11;
       i.tkConfig = p12;
       i.videoConfig = p13;
    }
    public void KPopExtConfig(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10,WebConfig p11,TkConfig p12,VideoConfig p13,int p14,u p15){
       int i = p14;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       int i1 = 0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x04)? 0: p2;
       List list = (i & 0x08)? CollectionsKt__CollectionsKt.E(): p3;
       if (!(i & 0x10)) {
          str = p4;
       }
       int i4 = (i & 0x20)? 0: p5;
       int i5 = (i & 0x40)? 0: p6;
       int i6 = (i & 0x0080)? 0: p7;
       int i7 = (i & 0x0100)? 0: p8;
       if (!(i & 0x0200)) {
          i1 = p9;
       }
       if (i & 0x0400) {
          MinVersion minVersion = new MinVersion(0, 0, 0, 7, 0);
       }else {
          int i11 = p10;
       }
       int i8 = 0;
       int i9 = (i & 0x0800)? i8: p11;
       int i10 = (i & 0x1000)? i8: p12;
       if (!(i & 0x2000)) {
          i8 = p13;
       }
       super(str1, i2, i3, list, str, i4, i5, i6, i7, i1, v12, i9, i10, i8);
       return;
    }
    public static KPopExtConfig copy$default(KPopExtConfig p0,String p1,int p2,int p3,List p4,String p5,int p6,int p7,int p8,long p9,int p10,MinVersion p11,WebConfig p12,TkConfig p13,VideoConfig p14,int p15,Object p16){
       KPopExtConfig kPopExtConfi = p0;
       int i = p15;
       KPopExtConfig kwaiBubbleId = (i & 0x01)? kPopExtConfi.kwaiBubbleId: p1;
       KPopExtConfig type = (i & 0x02)? kPopExtConfi.type: p2;
       KPopExtConfig priority = (i & 0x04)? kPopExtConfi.priority: p3;
       KPopExtConfig timing = (i & 0x08)? kPopExtConfi.timing: p4;
       KPopExtConfig fromBubbleId = (i & 0x10)? kPopExtConfi.fromBubbleId: p5;
       KPopExtConfig demotionSupp = (i & 0x20)? kPopExtConfi.demotionSupport: p6;
       KPopExtConfig maxTimes = (i & 0x40)? kPopExtConfi.maxTimes: p7;
       KPopExtConfig timesPerDay = (i & 0x0080)? kPopExtConfi.timesPerDay: p8;
       KPopExtConfig showInterval = (i & 0x0100)? kPopExtConfi.showInterval: p9;
       KPopExtConfig recordStrate = (i & 0x0200)? kPopExtConfi.recordStrategy: p10;
       KPopExtConfig minVersion = (i & 0x0400)? kPopExtConfi.minVersion: p11;
       KPopExtConfig webConfig = (i & 0x0800)? kPopExtConfi.webConfig: p12;
       KPopExtConfig tkConfig = (i & 0x1000)? kPopExtConfi.tkConfig: p13;
       KPopExtConfig videoConfig = (i & 0x2000)? kPopExtConfi.videoConfig: p14;
       return p0.copy(kwaiBubbleId, type, priority, timing, fromBubbleId, demotionSupp, maxTimes, timesPerDay, showInterval, recordStrate, minVersion, webConfig, tkConfig, videoConfig);
    }
    public final String component1(){
       return this.kwaiBubbleId;
    }
    public final int component10(){
       return this.recordStrategy;
    }
    public final MinVersion component11(){
       return this.minVersion;
    }
    public final WebConfig component12(){
       return this.webConfig;
    }
    public final TkConfig component13(){
       return this.tkConfig;
    }
    public final VideoConfig component14(){
       return this.videoConfig;
    }
    public final int component2(){
       return this.type;
    }
    public final int component3(){
       return this.priority;
    }
    public final List component4(){
       return this.timing;
    }
    public final String component5(){
       return this.fromBubbleId;
    }
    public final int component6(){
       return this.demotionSupport;
    }
    public final int component7(){
       return this.maxTimes;
    }
    public final int component8(){
       return this.timesPerDay;
    }
    public final long component9(){
       return this.showInterval;
    }
    public final KPopExtConfig copy(String p0,int p1,int p2,List p3,String p4,int p5,int p6,int p7,long p8,int p9,MinVersion p10,WebConfig p11,TkConfig p12,VideoConfig p13){
       KPopExtConfig obj;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p10;
       if (PatchProxy.isSupport(KPopExtConfig.class)) {
          Object[] objArray = new Object[14];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = oobject1;
          objArray[4] = oobject2;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Long.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = oobject3;
          objArray[11] = p11;
          objArray[12] = p12;
          objArray[13] = p13;
          obj = PatchProxy.apply(objArray, this, KPopExtConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "kwaiBubbleId");
       a.p(oobject1, "timing");
       a.p(oobject2, "fromBubbleId");
       a.p(oobject3, "minVersion");
       obj = new KPopExtConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
       return v16;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KPopExtConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KPopExtConfig && (a.g(this.kwaiBubbleId, p0.kwaiBubbleId) && (this.type == p0.type && (this.priority == p0.priority && (a.g(this.timing, p0.timing) && (a.g(this.fromBubbleId, p0.fromBubbleId) && (this.demotionSupport == p0.demotionSupport && (this.maxTimes == p0.maxTimes && (this.timesPerDay == p0.timesPerDay && (!this.showInterval - p0.showInterval && (this.recordStrategy == p0.recordStrategy && (a.g(this.minVersion, p0.minVersion) && (a.g(this.webConfig, p0.webConfig) && (a.g(this.tkConfig, p0.tkConfig) && a.g(this.videoConfig, p0.videoConfig)))))))))))))))) {
          return true;
       }
       return false;
    }
    public final int getDemotionSupport(){
       return this.demotionSupport;
    }
    public final String getFromBubbleId(){
       return this.fromBubbleId;
    }
    public final String getKwaiBubbleId(){
       return this.kwaiBubbleId;
    }
    public final int getMaxTimes(){
       return this.maxTimes;
    }
    public final MinVersion getMinVersion(){
       return this.minVersion;
    }
    public final int getPriority(){
       return this.priority;
    }
    public final int getRecordStrategy(){
       return this.recordStrategy;
    }
    public final long getShowInterval(){
       return this.showInterval;
    }
    public final int getTimesPerDay(){
       return this.timesPerDay;
    }
    public final List getTiming(){
       return this.timing;
    }
    public final TkConfig getTkConfig(){
       return this.tkConfig;
    }
    public final int getType(){
       return this.type;
    }
    public final VideoConfig getVideoConfig(){
       return this.videoConfig;
    }
    public final WebConfig getWebConfig(){
       return this.webConfig;
    }
    public int hashCode(){
       KPopExtConfig obj = PatchProxy.apply(null, this, KPopExtConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.kwaiBubbleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.type) * 31) + this.priority) * 31;
       KPopExtConfig ttiming = this.timing;
       int i2 = (ttiming != null)? ttiming.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttiming = this.fromBubbleId;
       i2 = (ttiming != null)? ttiming.hashCode(): 0;
       ttiming = this.showInterval;
       i1 = (((((((((((i1 + i2) * 31) + this.demotionSupport) * 31) + this.maxTimes) * 31) + this.timesPerDay) * 31) + (int)(ttiming ^ (ttiming >> 32))) * 31) + this.recordStrategy) * 31;
       ttiming = this.minVersion;
       i2 = (ttiming != null)? ttiming.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttiming = this.webConfig;
       i2 = (ttiming != null)? ttiming.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttiming = this.tkConfig;
       i2 = (ttiming != null)? ttiming.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttiming = this.videoConfig;
       if (ttiming != null) {
          i = ttiming.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KPopExtConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KPopExtConfig\(kwaiBubbleId="+this.kwaiBubbleId+", type="+this.type+", priority="+this.priority+", timing="+this.timing+", fromBubbleId="+this.fromBubbleId+", demotionSupport="+this.demotionSupport+", maxTimes="+this.maxTimes+", timesPerDay="+this.timesPerDay+", showInterval="+this.showInterval+", recordStrategy="+this.recordStrategy+", minVersion="+this.minVersion+", webConfig="+this.webConfig+", tkConfig="+this.tkConfig+", videoConfig="+this.videoConfig+"\)";
    }
}
