package com.kuaishou.live.basic.degrade.creator.LivePerformanceGradeConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import q41.b;
import java.lang.Integer;
import com.kuaishou.live.basic.degrade.creator.LivePerformanceGradeConfigKt$convert$1;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import msd.p;
import t27.c;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePerformanceGradeConfig implements Serializable	// class@000cb9
{
    public final List _gradeConfig;
    public final boolean batteryLoopEnable;
    public final long batteryLoopInterval;
    public final long coolDownIntervalMs;
    public List gradeConfig;
    public final String version;

    public void LivePerformanceGradeConfig(List p0,long p1,long p2,boolean p3,String p4){
       super();
       this._gradeConfig = p0;
       this.coolDownIntervalMs = p1;
       this.batteryLoopInterval = p2;
       this.batteryLoopEnable = p3;
       this.version = p4;
    }
    public static LivePerformanceGradeConfig copy$default(LivePerformanceGradeConfig p0,List p1,long p2,long p3,boolean p4,String p5,int p6,Object p7){
       LivePerformanceGradeConfig _gradeConfig;
       LivePerformanceGradeConfig coolDownInte;
       LivePerformanceGradeConfig batteryLoopI;
       LivePerformanceGradeConfig batteryLoopE;
       LivePerformanceGradeConfig version;
       if (p6 & 0x01) {
          _gradeConfig = p0._gradeConfig;
       }
       if (p6 & 0x02) {
          coolDownInte = p0.coolDownIntervalMs;
       }
       LivePerformanceGradeConfig livePerforma = coolDownInte;
       if (p6 & 0x04) {
          batteryLoopI = p0.batteryLoopInterval;
       }
       LivePerformanceGradeConfig livePerforma1 = batteryLoopI;
       if (p6 & 0x08) {
          batteryLoopE = p0.batteryLoopEnable;
       }
       p7 = batteryLoopE;
       if (p6 & 0x10) {
          version = p0.version;
       }
       return p0.copy(_gradeConfig, livePerforma, livePerforma1, p7, version);
    }
    public final long component2(){
       return this.coolDownIntervalMs;
    }
    public final long component3(){
       return this.batteryLoopInterval;
    }
    public final boolean component4(){
       return this.batteryLoopEnable;
    }
    public final LivePerformanceGradeConfig copy(List p0,long p1,long p2,boolean p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(LivePerformanceGradeConfig.class)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Long.valueOf(p2),Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, LivePerformanceGradeConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       LivePerformanceGradeConfig livePerforma = new LivePerformanceGradeConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePerformanceGradeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePerformanceGradeConfig && (a.g(this._gradeConfig, p0._gradeConfig) && (!this.coolDownIntervalMs - p0.coolDownIntervalMs && (!this.batteryLoopInterval - p0.batteryLoopInterval && (this.batteryLoopEnable == p0.batteryLoopEnable && a.g(this.version, p0.version))))))) {
          return true;
       }
       return false;
    }
    public final boolean getBatteryLoopEnable(){
       return this.batteryLoopEnable;
    }
    public final long getBatteryLoopInterval(){
       return this.batteryLoopInterval;
    }
    public final long getCoolDownIntervalMs(){
       return this.coolDownIntervalMs;
    }
    public final String getVersion(){
       LivePerformanceGradeConfig tversion = this.version;
       if (tversion != null) {
       }else {
          tversion = "";
       }
       return tversion;
    }
    public final List gradeConfig(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LivePerformanceGradeConfig obj = PatchProxy.apply(null, this, LivePerformanceGradeConfig.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this._gradeConfig;
       obj = (obj == null || obj.isEmpty())? 1: null;
       if (obj) {
          return null;
       }else if(this.gradeConfig == null){
          LivePerformanceGradeConfig t_gradeConfi = this._gradeConfig;
          List list = PatchProxy.applyOneRefs(t_gradeConfi, null, b.class, "1");
          if (list != patchProxyRe) {
          }else {
             list = c.a(t_gradeConfi, Integer.valueOf(Integer.MAX_VALUE), null, LivePerformanceGradeConfigKt$convert$1.INSTANCE, 2, null);
          }
          this.gradeConfig = list;
       }
       return this.gradeConfig;
    }
    public int hashCode(){
       int i2;
       LivePerformanceGradeConfig obj = PatchProxy.apply(null, this, LivePerformanceGradeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this._gradeConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       LivePerformanceGradeConfig tcoolDownInt = this.coolDownIntervalMs;
       tcoolDownInt = this.batteryLoopInterval;
       i1 = ((((i1 * 31) + (int)(tcoolDownInt ^ (tcoolDownInt >> 32))) * 31) + (int)(tcoolDownInt ^ (tcoolDownInt >> 32))) * 31;
       tcoolDownInt = this.batteryLoopEnable;
       if (tcoolDownInt != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tcoolDownInt = this.version;
       if (tcoolDownInt != null) {
          i = tcoolDownInt.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceGradeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePerformanceGradeConfig\(_gradeConfig="+this._gradeConfig+", coolDownIntervalMs="+this.coolDownIntervalMs+", batteryLoopInterval="+this.batteryLoopInterval+", batteryLoopEnable="+this.batteryLoopEnable+", version="+this.version+"\)";
    }
}
