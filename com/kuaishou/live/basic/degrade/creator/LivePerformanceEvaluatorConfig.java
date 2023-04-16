package com.kuaishou.live.basic.degrade.creator.LivePerformanceEvaluatorConfig;
import java.io.Serializable;
import com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfig;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import s41.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePerformanceEvaluatorConfig implements Serializable	// class@000cb8
{
    public final BatteryPerformanceConfig batteryConfig;
    public a deviceBenchmarkConfig;
    public final List deviceBenchmarkItemConfig;
    public final List temperatureConfig;
    public final String version;

    public void LivePerformanceEvaluatorConfig(BatteryPerformanceConfig p0,List p1,List p2,String p3){
       super();
       this.batteryConfig = p0;
       this.temperatureConfig = p1;
       this.deviceBenchmarkItemConfig = p2;
       this.version = p3;
    }
    public static LivePerformanceEvaluatorConfig copy$default(LivePerformanceEvaluatorConfig p0,BatteryPerformanceConfig p1,List p2,List p3,String p4,int p5,Object p6){
       LivePerformanceEvaluatorConfig batteryConfi;
       LivePerformanceEvaluatorConfig temperatureC;
       LivePerformanceEvaluatorConfig deviceBenchm;
       LivePerformanceEvaluatorConfig version;
       if (p5 & 0x01) {
          batteryConfi = p0.batteryConfig;
       }
       if (p5 & 0x02) {
          temperatureC = p0.temperatureConfig;
       }
       if (p5 & 0x04) {
          deviceBenchm = p0.deviceBenchmarkItemConfig;
       }
       if (p5 & 0x08) {
          version = p0.version;
       }
       return p0.copy(batteryConfi, temperatureC, deviceBenchm, version);
    }
    public final BatteryPerformanceConfig component1(){
       return this.batteryConfig;
    }
    public final List component2(){
       return this.temperatureConfig;
    }
    public final List component3(){
       return this.deviceBenchmarkItemConfig;
    }
    public final LivePerformanceEvaluatorConfig copy(BatteryPerformanceConfig p0,List p1,List p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LivePerformanceEvaluatorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LivePerformanceEvaluatorConfig(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePerformanceEvaluatorConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePerformanceEvaluatorConfig && (a.g(this.batteryConfig, p0.batteryConfig) && (a.g(this.temperatureConfig, p0.temperatureConfig) && (a.g(this.deviceBenchmarkItemConfig, p0.deviceBenchmarkItemConfig) && a.g(this.version, p0.version)))))) {
          return true;
       }
       return false;
    }
    public final BatteryPerformanceConfig getBatteryConfig(){
       return this.batteryConfig;
    }
    public final a getDeviceBenchmarkConfig(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceEvaluatorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.deviceBenchmarkConfig == null) {
          this.deviceBenchmarkConfig = new a(this.deviceBenchmarkItemConfig);
       }
       return this.deviceBenchmarkConfig;
    }
    public final List getDeviceBenchmarkItemConfig(){
       return this.deviceBenchmarkItemConfig;
    }
    public final List getTemperatureConfig(){
       return this.temperatureConfig;
    }
    public final String getVersion(){
       LivePerformanceEvaluatorConfig tversion = this.version;
       if (tversion != null) {
       }else {
          tversion = "";
       }
       return tversion;
    }
    public int hashCode(){
       LivePerformanceEvaluatorConfig obj = PatchProxy.apply(null, this, LivePerformanceEvaluatorConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.batteryConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LivePerformanceEvaluatorConfig ttemperature = this.temperatureConfig;
       int i2 = (ttemperature != null)? ttemperature.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttemperature = this.deviceBenchmarkItemConfig;
       i2 = (ttemperature != null)? ttemperature.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttemperature = this.version;
       if (ttemperature != null) {
          i = ttemperature.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceEvaluatorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePerformanceEvaluatorConfig\(batteryConfig="+this.batteryConfig+", temperatureConfig="+this.temperatureConfig+", deviceBenchmarkItemConfig="+this.deviceBenchmarkItemConfig+", version="+this.version+"\)";
    }
}
