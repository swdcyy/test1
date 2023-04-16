package com.yxcorp.gifshow.follow.common.degrade.creator.FollowPerformanceEvaluatorConfig;
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
import rga.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FollowPerformanceEvaluatorConfig implements Serializable	// class@001043
{
    public final BatteryPerformanceConfig batteryConfig;
    public final List batteryTemperatureConfig;
    public a deviceBenchmarkConfig;
    public final List deviceBenchmarkItemConfig;
    public final List temperatureConfig;
    public final String version;

    public void FollowPerformanceEvaluatorConfig(BatteryPerformanceConfig p0,List p1,List p2,List p3,String p4){
       super();
       this.batteryConfig = p0;
       this.batteryTemperatureConfig = p1;
       this.temperatureConfig = p2;
       this.deviceBenchmarkItemConfig = p3;
       this.version = p4;
    }
    public static FollowPerformanceEvaluatorConfig copy$default(FollowPerformanceEvaluatorConfig p0,BatteryPerformanceConfig p1,List p2,List p3,List p4,String p5,int p6,Object p7){
       FollowPerformanceEvaluatorConfig batteryConfi;
       FollowPerformanceEvaluatorConfig batteryTempe;
       FollowPerformanceEvaluatorConfig temperatureC;
       FollowPerformanceEvaluatorConfig deviceBenchm;
       FollowPerformanceEvaluatorConfig version;
       if (p6 & 0x01) {
          batteryConfi = p0.batteryConfig;
       }
       if (p6 & 0x02) {
          batteryTempe = p0.batteryTemperatureConfig;
       }
       p7 = batteryTempe;
       if (p6 & 0x04) {
          temperatureC = p0.temperatureConfig;
       }
       FollowPerformanceEvaluatorConfig uFollowPerfo = temperatureC;
       if (p6 & 0x08) {
          deviceBenchm = p0.deviceBenchmarkItemConfig;
       }
       FollowPerformanceEvaluatorConfig uFollowPerfo1 = deviceBenchm;
       if (p6 & 0x10) {
          version = p0.version;
       }
       return p0.copy(batteryConfi, p7, uFollowPerfo, uFollowPerfo1, version);
    }
    public final BatteryPerformanceConfig component1(){
       return this.batteryConfig;
    }
    public final List component2(){
       return this.batteryTemperatureConfig;
    }
    public final List component3(){
       return this.temperatureConfig;
    }
    public final List component4(){
       return this.deviceBenchmarkItemConfig;
    }
    public final FollowPerformanceEvaluatorConfig copy(BatteryPerformanceConfig p0,List p1,List p2,List p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(FollowPerformanceEvaluatorConfig.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, FollowPerformanceEvaluatorConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       FollowPerformanceEvaluatorConfig uFollowPerfo = new FollowPerformanceEvaluatorConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPerformanceEvaluatorConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowPerformanceEvaluatorConfig && (a.g(this.batteryConfig, p0.batteryConfig) && (a.g(this.batteryTemperatureConfig, p0.batteryTemperatureConfig) && (a.g(this.temperatureConfig, p0.temperatureConfig) && (a.g(this.deviceBenchmarkItemConfig, p0.deviceBenchmarkItemConfig) && a.g(this.version, p0.version))))))) {
          return true;
       }
       return false;
    }
    public final BatteryPerformanceConfig getBatteryConfig(){
       return this.batteryConfig;
    }
    public final List getBatteryTemperatureConfig(){
       return this.batteryTemperatureConfig;
    }
    public final a getDeviceBenchmarkConfig(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceEvaluatorConfig.class, "1");
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
       FollowPerformanceEvaluatorConfig tversion = this.version;
       if (tversion != null) {
       }else {
          tversion = "";
       }
       return tversion;
    }
    public int hashCode(){
       FollowPerformanceEvaluatorConfig obj = PatchProxy.apply(null, this, FollowPerformanceEvaluatorConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.batteryConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FollowPerformanceEvaluatorConfig tbatteryTemp = this.batteryTemperatureConfig;
       int i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.temperatureConfig;
       i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.deviceBenchmarkItemConfig;
       i2 = (tbatteryTemp != null)? tbatteryTemp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbatteryTemp = this.version;
       if (tbatteryTemp != null) {
          i = tbatteryTemp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceEvaluatorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowPerformanceEvaluatorConfig\(batteryConfig="+this.batteryConfig+", batteryTemperatureConfig="+this.batteryTemperatureConfig+", temperatureConfig="+this.temperatureConfig+", deviceBenchmarkItemConfig="+this.deviceBenchmarkItemConfig+", version="+this.version+"\)";
    }
}
