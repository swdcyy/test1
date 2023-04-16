package com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.io.Serializable;
import com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfig;
import com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceConfig;
import java.util.List;
import com.kwai.library.wolverine.elements.devicelevel.DeviceLevelConfig;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Collection;
import u27.a;
import java.lang.Integer;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfigKt$convert$1;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import msd.p;
import t27.c;
import java.lang.StringBuilder;

public final class WolverinePerformanceConfig implements Serializable	// class@000ac2
{
    public final BatteryPerformanceConfig batteryConfig;
    public final boolean batteryLoopEnable;
    public final long batteryLoopInterval;
    public final BatteryTemperaturePerformanceConfig batteryTemperatureConfig;
    public final boolean batteryTemperatureLoopEnable;
    public final long batteryTemperatureLoopInterval;
    public final long coolDownInterval;
    public final DeviceLevelConfig deviceLevelConfig;
    public final List grade;
    public List gradeConfig;
    public final List temperatureConfig;
    public final String version;

    public void WolverinePerformanceConfig(BatteryPerformanceConfig p0,BatteryTemperaturePerformanceConfig p1,List p2,DeviceLevelConfig p3,List p4,long p5,long p6,boolean p7,long p8,boolean p9,String p10){
       super();
       this.batteryConfig = p0;
       this.batteryTemperatureConfig = p1;
       this.temperatureConfig = p2;
       this.deviceLevelConfig = p3;
       this.grade = p4;
       this.coolDownInterval = p5;
       this.batteryLoopInterval = p6;
       this.batteryLoopEnable = p7;
       this.batteryTemperatureLoopInterval = p8;
       this.batteryTemperatureLoopEnable = p9;
       this.version = p10;
    }
    public static WolverinePerformanceConfig copy$default(WolverinePerformanceConfig p0,BatteryPerformanceConfig p1,BatteryTemperaturePerformanceConfig p2,List p3,DeviceLevelConfig p4,List p5,long p6,long p7,boolean p8,long p9,boolean p10,String p11,int p12,Object p13){
       WolverinePerformanceConfig wolverinePer = p0;
       int i = p12;
       WolverinePerformanceConfig batteryConfi = (i & 0x01)? wolverinePer.batteryConfig: p1;
       WolverinePerformanceConfig batteryTempe = (i & 0x02)? wolverinePer.batteryTemperatureConfig: p2;
       WolverinePerformanceConfig temperatureC = (i & 0x04)? wolverinePer.temperatureConfig: p3;
       WolverinePerformanceConfig deviceLevelC = (i & 0x08)? wolverinePer.deviceLevelConfig: p4;
       WolverinePerformanceConfig grade = (i & 0x10)? wolverinePer.grade: p5;
       WolverinePerformanceConfig coolDownInte = (i & 0x20)? wolverinePer.coolDownInterval: p6;
       WolverinePerformanceConfig batteryLoopI = (i & 0x40)? wolverinePer.batteryLoopInterval: p7;
       WolverinePerformanceConfig batteryLoopE = (i & 0x0080)? wolverinePer.batteryLoopEnable: p8;
       WolverinePerformanceConfig batteryTempe1 = (i & 0x0100)? wolverinePer.batteryTemperatureLoopInterval: p9;
       WolverinePerformanceConfig batteryTempe2 = (i & 0x0200)? wolverinePer.batteryTemperatureLoopEnable: p10;
       WolverinePerformanceConfig version = (i & 0x0400)? wolverinePer.version: p11;
       return p0.copy(batteryConfi, batteryTempe, temperatureC, deviceLevelC, grade, coolDownInte, batteryLoopI, batteryLoopE, batteryTempe1, batteryTempe2, version);
    }
    public final BatteryPerformanceConfig component1(){
       return this.batteryConfig;
    }
    public final boolean component10(){
       return this.batteryTemperatureLoopEnable;
    }
    public final String component11(){
       return this.version;
    }
    public final BatteryTemperaturePerformanceConfig component2(){
       return this.batteryTemperatureConfig;
    }
    public final List component3(){
       return this.temperatureConfig;
    }
    public final DeviceLevelConfig component4(){
       return this.deviceLevelConfig;
    }
    public final long component6(){
       return this.coolDownInterval;
    }
    public final long component7(){
       return this.batteryLoopInterval;
    }
    public final boolean component8(){
       return this.batteryLoopEnable;
    }
    public final long component9(){
       return this.batteryTemperatureLoopInterval;
    }
    public final WolverinePerformanceConfig copy(BatteryPerformanceConfig p0,BatteryTemperaturePerformanceConfig p1,List p2,DeviceLevelConfig p3,List p4,long p5,long p6,boolean p7,long p8,boolean p9,String p10){
       WolverinePerformanceConfig wolverinePer = new WolverinePerformanceConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v15;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof WolverinePerformanceConfig && (a.g(this.batteryConfig, p0.batteryConfig) && (a.g(this.batteryTemperatureConfig, p0.batteryTemperatureConfig) && (a.g(this.temperatureConfig, p0.temperatureConfig) && (a.g(this.deviceLevelConfig, p0.deviceLevelConfig) && (a.g(this.grade, p0.grade) && (!this.coolDownInterval - p0.coolDownInterval && (!this.batteryLoopInterval - p0.batteryLoopInterval && (this.batteryLoopEnable == p0.batteryLoopEnable && (!this.batteryTemperatureLoopInterval - p0.batteryTemperatureLoopInterval && (this.batteryTemperatureLoopEnable == p0.batteryTemperatureLoopEnable && a.g(this.version, p0.version))))))))))))) {
          return true;
       }
       return false;
    }
    public final BatteryPerformanceConfig getBatteryConfig(){
       return this.batteryConfig;
    }
    public final boolean getBatteryLoopEnable(){
       return this.batteryLoopEnable;
    }
    public final long getBatteryLoopInterval(){
       return this.batteryLoopInterval;
    }
    public final BatteryTemperaturePerformanceConfig getBatteryTemperatureConfig(){
       return this.batteryTemperatureConfig;
    }
    public final boolean getBatteryTemperatureLoopEnable(){
       return this.batteryTemperatureLoopEnable;
    }
    public final long getBatteryTemperatureLoopInterval(){
       return this.batteryTemperatureLoopInterval;
    }
    public final long getCoolDownInterval(){
       return this.coolDownInterval;
    }
    public final DeviceLevelConfig getDeviceLevelConfig(){
       return this.deviceLevelConfig;
    }
    public final List getTemperatureConfig(){
       return this.temperatureConfig;
    }
    public final String getVersion(){
       return this.version;
    }
    public final List gradeConfig(){
       WolverinePerformanceConfig tgrade = this.grade;
       tgrade = (tgrade == null || tgrade.isEmpty())? 1: null;
       if (tgrade) {
          return null;
       }else if(this.gradeConfig == null){
          this.gradeConfig = c.a(this.grade, Integer.valueOf(Integer.MAX_VALUE), null, WolverinePerformanceConfigKt$convert$1.INSTANCE, 2, null);
       }
       return this.gradeConfig;
    }
    public int hashCode(){
       WolverinePerformanceConfig tbatteryConf = this.batteryConfig;
       int i = 0;
       int i1 = (tbatteryConf != null)? tbatteryConf.hashCode(): 0;
       i1 = i1 * 31;
       WolverinePerformanceConfig tbatteryTemp = this.batteryTemperatureConfig;
       int i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.temperatureConfig;
       i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.deviceLevelConfig;
       i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.grade;
       i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       tbatteryTemp = this.coolDownInterval;
       long l = 32;
       tbatteryTemp = this.batteryLoopInterval;
       i1 = (((((i1 + i2) * 31) + (int)(tbatteryTemp ^ (tbatteryTemp >> l))) * 31) + (int)(tbatteryTemp ^ (tbatteryTemp >> l))) * 31;
       tbatteryTemp = this.batteryLoopEnable;
       int i3 = 1;
       if (tbatteryTemp != null) {
          i2 = 1;
       }
       WolverinePerformanceConfig tbatteryTemp1 = this.batteryTemperatureLoopInterval;
       i1 = (((i1 + i2) * 31) + (int)(tbatteryTemp1 ^ (tbatteryTemp1 >> l))) * 31;
       tbatteryTemp = this.batteryTemperatureLoopEnable;
       if (tbatteryTemp == null) {
          i3 = tbatteryTemp;
       }
       i1 = (i1 + i3) * 31;
       tbatteryTemp = this.version;
       if (tbatteryTemp != null) {
          i = tbatteryTemp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return "WolverinePerformanceConfig\(batteryConfig="+this.batteryConfig+", batteryTemperatureConfig="+this.batteryTemperatureConfig+", temperatureConfig="+this.temperatureConfig+", deviceLevelConfig="+this.deviceLevelConfig+", grade="+this.grade+", coolDownInterval="+this.coolDownInterval+", batteryLoopInterval="+this.batteryLoopInterval+", batteryLoopEnable="+this.batteryLoopEnable+", batteryTemperatureLoopInterval="+this.batteryTemperatureLoopInterval+", batteryTemperatureLoopEnable="+this.batteryTemperatureLoopEnable+", version="+this.version+"\)";
    }
}
