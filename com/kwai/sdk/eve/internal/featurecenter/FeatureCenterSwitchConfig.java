package com.kwai.sdk.eve.internal.featurecenter.FeatureCenterSwitchConfig;
import java.util.Map;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterLoggerConfig;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.t0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureCenterSwitchConfig	// class@0014e7
{
    public final int baseMaxRows;
    public final long baseTimeIntervalS;
    public final Map customTableControlMap;
    public final boolean enable;
    public final boolean enableVacuum;
    public final int featureMaxRows;
    public final long featureTimeIntervalS;
    public final FeatureCenterLoggerConfig loggerConfig;
    public final int mmapSize;
    public final int queryConcurrency;
    public final boolean useWal;
    public final long vacuumIntervalS;

    public void FeatureCenterSwitchConfig(){
       super(false, 0, 0, 0, 0, null, false, 0, 0, false, 0, null, 4095, null);
    }
    public void FeatureCenterSwitchConfig(boolean p0,int p1,int p2,long p3,long p4,Map p5,boolean p6,long p7,int p8,boolean p9,int p10,FeatureCenterLoggerConfig p11){
       int i = this;
       Object obj = p11;
       a.p(p5, "customTableControlMap");
       a.p(obj, "loggerConfig");
       super();
       i.enable = p0;
       i.baseMaxRows = p1;
       i.featureMaxRows = p2;
       i.baseTimeIntervalS = p3;
       i.featureTimeIntervalS = p4;
       i.customTableControlMap = p5;
       i.enableVacuum = p6;
       i.vacuumIntervalS = p7;
       i.queryConcurrency = p8;
       i.useWal = p9;
       i.mmapSize = p10;
       i.loggerConfig = obj;
    }
    public void FeatureCenterSwitchConfig(boolean p0,int p1,int p2,long p3,long p4,Map p5,boolean p6,long p7,int p8,boolean p9,int p10,FeatureCenterLoggerConfig p11,int p12,u p13){
       int i = p12;
       int i1 = 1;
       int i2 = (i & 0x01)? 1: p0;
       int i3 = (i & 0x02)? 0x186a0: p1;
       int i4 = (i & 0x04)? 0x2710: p2;
       int i5 = 0x93a80;
       int i6 = (i & 0x08)? i5: p3;
       if (!(i & 0x10)) {
          i5 = p4;
       }
       Map map = (i & 0x20)? t0.z(): p5;
       int i7 = (i & 0x40)? 1: p6;
       int i8 = (i & 0x0080)? 0x15180: p7;
       int i9 = (i & 0x0100)? 1: p8;
       if (!(i & 0x0200)) {
          i1 = p9;
       }
       int i10 = (i & 0x0400)? 0x1400000: p10;
       if (i & 0x0800) {
          FeatureCenterLoggerConfig uFeatureCent = new FeatureCenterLoggerConfig(0, 0, 0, 7, 0);
       }else {
          i = p11;
       }
       super(i2, i3, i4, i6, i5, map, i7, i8, i9, i1, i10, i);
       return;
    }
    public static FeatureCenterSwitchConfig copy$default(FeatureCenterSwitchConfig p0,boolean p1,int p2,int p3,long p4,long p5,Map p6,boolean p7,long p8,int p9,boolean p10,int p11,FeatureCenterLoggerConfig p12,int p13,Object p14){
       FeatureCenterSwitchConfig uFeatureCent = p0;
       int i = p13;
       FeatureCenterSwitchConfig enable = (i & 0x01)? uFeatureCent.enable: p1;
       FeatureCenterSwitchConfig baseMaxRows = (i & 0x02)? uFeatureCent.baseMaxRows: p2;
       FeatureCenterSwitchConfig uFeatureCent1 = (i & 0x04)? uFeatureCent.featureMaxRows: p3;
       FeatureCenterSwitchConfig baseTimeInte = (i & 0x08)? uFeatureCent.baseTimeIntervalS: p4;
       FeatureCenterSwitchConfig uFeatureCent2 = (i & 0x10)? uFeatureCent.featureTimeIntervalS: p5;
       FeatureCenterSwitchConfig customTableC = (i & 0x20)? uFeatureCent.customTableControlMap: p6;
       FeatureCenterSwitchConfig enableVacuum = (i & 0x40)? uFeatureCent.enableVacuum: p7;
       FeatureCenterSwitchConfig vacuumInterv = (i & 0x0080)? uFeatureCent.vacuumIntervalS: p8;
       FeatureCenterSwitchConfig queryConcurr = (i & 0x0100)? uFeatureCent.queryConcurrency: p9;
       FeatureCenterSwitchConfig useWal = (i & 0x0200)? uFeatureCent.useWal: p10;
       FeatureCenterSwitchConfig mmapSize = (i & 0x0400)? uFeatureCent.mmapSize: p11;
       FeatureCenterSwitchConfig loggerConfig = (i & 0x0800)? uFeatureCent.loggerConfig: p12;
       return p0.copy(enable, baseMaxRows, uFeatureCent1, baseTimeInte, uFeatureCent2, customTableC, enableVacuum, vacuumInterv, queryConcurr, useWal, mmapSize, loggerConfig);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final boolean component10(){
       return this.useWal;
    }
    public final int component11(){
       return this.mmapSize;
    }
    public final FeatureCenterLoggerConfig component12(){
       return this.loggerConfig;
    }
    public final int component2(){
       return this.baseMaxRows;
    }
    public final int component3(){
       return this.featureMaxRows;
    }
    public final long component4(){
       return this.baseTimeIntervalS;
    }
    public final long component5(){
       return this.featureTimeIntervalS;
    }
    public final Map component6(){
       return this.customTableControlMap;
    }
    public final boolean component7(){
       return this.enableVacuum;
    }
    public final long component8(){
       return this.vacuumIntervalS;
    }
    public final int component9(){
       return this.queryConcurrency;
    }
    public final FeatureCenterSwitchConfig copy(boolean p0,int p1,int p2,long p3,long p4,Map p5,boolean p6,long p7,int p8,boolean p9,int p10,FeatureCenterLoggerConfig p11){
       object oobject = p5;
       object oobject1 = p11;
       FeatureCenterSwitchConfig uFeatureCent = FeatureCenterSwitchConfig.class;
       if (PatchProxy.isSupport(uFeatureCent)) {
          Object[] objArray = new Object[12];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = oobject;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Long.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = oobject1;
          Object obj = PatchProxy.apply(objArray, this, uFeatureCent, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "customTableControlMap");
       a.p(oobject1, "loggerConfig");
       uFeatureCent = new FeatureCenterSwitchConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v16;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureCenterSwitchConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeatureCenterSwitchConfig && (this.enable == p0.enable && (this.baseMaxRows == p0.baseMaxRows && (this.featureMaxRows == p0.featureMaxRows && (!this.baseTimeIntervalS - p0.baseTimeIntervalS && (!this.featureTimeIntervalS - p0.featureTimeIntervalS && (a.g(this.customTableControlMap, p0.customTableControlMap) && (this.enableVacuum == p0.enableVacuum && (!this.vacuumIntervalS - p0.vacuumIntervalS && (this.queryConcurrency == p0.queryConcurrency && (this.useWal == p0.useWal && (this.mmapSize == p0.mmapSize && a.g(this.loggerConfig, p0.loggerConfig)))))))))))))) {
          return true;
       }
       return false;
    }
    public final int getBaseMaxRows(){
       return this.baseMaxRows;
    }
    public final long getBaseTimeIntervalS(){
       return this.baseTimeIntervalS;
    }
    public final Map getCustomTableControlMap(){
       return this.customTableControlMap;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final boolean getEnableVacuum(){
       return this.enableVacuum;
    }
    public final int getFeatureMaxRows(){
       return this.featureMaxRows;
    }
    public final long getFeatureTimeIntervalS(){
       return this.featureTimeIntervalS;
    }
    public final FeatureCenterLoggerConfig getLoggerConfig(){
       return this.loggerConfig;
    }
    public final int getMmapSize(){
       return this.mmapSize;
    }
    public final int getQueryConcurrency(){
       return this.queryConcurrency;
    }
    public final boolean getUseWal(){
       return this.useWal;
    }
    public final long getVacuumIntervalS(){
       return this.vacuumIntervalS;
    }
    public int hashCode(){
       int i1;
       FeatureCenterSwitchConfig tloggerConfi;
       FeatureCenterSwitchConfig obj = PatchProxy.apply(null, this, FeatureCenterSwitchConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       FeatureCenterSwitchConfig tbaseTimeInt = this.baseTimeIntervalS;
       long l = 32;
       tbaseTimeInt = this.featureTimeIntervalS;
       i1 = ((((((((i1 * 31) + this.baseMaxRows) * 31) + this.featureMaxRows) * 31) + (int)(tbaseTimeInt ^ (tbaseTimeInt >> l))) * 31) + (int)(tbaseTimeInt ^ (tbaseTimeInt >> l))) * 31;
       tbaseTimeInt = this.customTableControlMap;
       int i2 = 0;
       int i3 = (tbaseTimeInt != null)? tbaseTimeInt.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tbaseTimeInt = this.enableVacuum;
       if (tbaseTimeInt != null) {
          i3 = 1;
       }
       FeatureCenterSwitchConfig tvacuumInter = this.vacuumIntervalS;
       i1 = (((((i1 + i3) * 31) + (int)(tvacuumInter ^ (tvacuumInter >> l))) * 31) + this.queryConcurrency) * 31;
       tbaseTimeInt = this.useWal;
       if (tbaseTimeInt == null) {
          tloggerConfi = tbaseTimeInt;
       }
       i1 = (((i1 + i) * 31) + this.mmapSize) * 31;
       tloggerConfi = this.loggerConfig;
       if (tloggerConfi != null) {
          i2 = tloggerConfi.hashCode();
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureCenterSwitchConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureCenterSwitchConfig\(enable="+this.enable+", baseMaxRows="+this.baseMaxRows+", featureMaxRows="+this.featureMaxRows+", baseTimeIntervalS="+this.baseTimeIntervalS+", featureTimeIntervalS="+this.featureTimeIntervalS+", customTableControlMap="+this.customTableControlMap+", enableVacuum="+this.enableVacuum+", vacuumIntervalS="+this.vacuumIntervalS+", queryConcurrency="+this.queryConcurrency+", useWal="+this.useWal+", mmapSize="+this.mmapSize+", loggerConfig="+this.loggerConfig+"\)";
    }
}
