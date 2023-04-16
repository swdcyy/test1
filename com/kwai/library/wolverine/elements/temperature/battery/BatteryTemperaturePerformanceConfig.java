package com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Float;
import com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceConfigKt$convert$1;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import msd.p;
import t27.c;
import java.lang.String;
import java.lang.StringBuilder;

public final class BatteryTemperaturePerformanceConfig implements Serializable	// class@000ab6
{
    public final List _battery_temperature;
    public List normalConfig;

    public void BatteryTemperaturePerformanceConfig(List p0){
       super();
       this._battery_temperature = p0;
    }
    public static BatteryTemperaturePerformanceConfig copy$default(BatteryTemperaturePerformanceConfig p0,List p1,int p2,Object p3){
       BatteryTemperaturePerformanceConfig _battery_tem;
       if (p2 & 0x01) {
          _battery_tem = p0._battery_temperature;
       }
       return p0.copy(_battery_tem);
    }
    public final BatteryTemperaturePerformanceConfig copy(List p0){
       return new BatteryTemperaturePerformanceConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BatteryTemperaturePerformanceConfig && a.g(this._battery_temperature, p0._battery_temperature))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BatteryTemperaturePerformanceConfig t_battery_te = this._battery_temperature;
       int i = (t_battery_te != null)? t_battery_te.hashCode(): 0;
       return i;
    }
    public final List normalConfig(){
       BatteryTemperaturePerformanceConfig t_battery_te = this._battery_temperature;
       t_battery_te = (t_battery_te == null || t_battery_te.isEmpty())? 1: null;
       if (t_battery_te) {
          return null;
       }else if(this.normalConfig == null){
          this.normalConfig = c.a(this._battery_temperature, Float.valueOf(Float.MAX_VALUE), null, BatteryTemperaturePerformanceConfigKt$convert$1.INSTANCE, 2, null);
       }
       return this.normalConfig;
    }
    public String toString(){
       return "BatteryTemperaturePerformanceConfig\(_battery_temperature="+this._battery_temperature+"\)";
    }
}
