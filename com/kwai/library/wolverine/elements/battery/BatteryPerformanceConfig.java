package com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfig;
import java.io.Serializable;
import java.util.List;
import com.kwai.library.wolverine.entity.ScoreConfig;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Integer;
import com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfigKt$convert$1;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import msd.p;
import t27.c;
import java.lang.String;
import java.lang.StringBuilder;

public final class BatteryPerformanceConfig implements Serializable	// class@000aab
{
    public final List _normalConfig;
    public final ScoreConfig chargingConfig;
    public List normalConfig;
    public final ScoreConfig powerSaveModeConfig;

    public void BatteryPerformanceConfig(List p0,ScoreConfig p1,ScoreConfig p2){
       super();
       this._normalConfig = p0;
       this.chargingConfig = p1;
       this.powerSaveModeConfig = p2;
    }
    public static BatteryPerformanceConfig copy$default(BatteryPerformanceConfig p0,List p1,ScoreConfig p2,ScoreConfig p3,int p4,Object p5){
       BatteryPerformanceConfig _normalConfi;
       BatteryPerformanceConfig chargingConf;
       BatteryPerformanceConfig powerSaveMod;
       if (p4 & 0x01) {
          _normalConfi = p0._normalConfig;
       }
       if (p4 & 0x02) {
          chargingConf = p0.chargingConfig;
       }
       if (p4 & 0x04) {
          powerSaveMod = p0.powerSaveModeConfig;
       }
       return p0.copy(_normalConfi, chargingConf, powerSaveMod);
    }
    public final ScoreConfig component2(){
       return this.chargingConfig;
    }
    public final ScoreConfig component3(){
       return this.powerSaveModeConfig;
    }
    public final BatteryPerformanceConfig copy(List p0,ScoreConfig p1,ScoreConfig p2){
       return new BatteryPerformanceConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BatteryPerformanceConfig && (a.g(this._normalConfig, p0._normalConfig) && (a.g(this.chargingConfig, p0.chargingConfig) && a.g(this.powerSaveModeConfig, p0.powerSaveModeConfig))))) {
          return true;
       }
       return false;
    }
    public final ScoreConfig getChargingConfig(){
       return this.chargingConfig;
    }
    public final ScoreConfig getPowerSaveModeConfig(){
       return this.powerSaveModeConfig;
    }
    public int hashCode(){
       BatteryPerformanceConfig t_normalConf = this._normalConfig;
       int i = 0;
       int i1 = (t_normalConf != null)? t_normalConf.hashCode(): 0;
       i1 = i1 * 31;
       BatteryPerformanceConfig tchargingCon = this.chargingConfig;
       int i2 = (tchargingCon != null)? tchargingCon.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchargingCon = this.powerSaveModeConfig;
       if (tchargingCon != null) {
          i = tchargingCon.hashCode();
       }
       return (i1 + i);
    }
    public final List normalConfig(){
       BatteryPerformanceConfig t_normalConf = this._normalConfig;
       t_normalConf = (t_normalConf == null || t_normalConf.isEmpty())? 1: null;
       if (t_normalConf) {
          return null;
       }else if(this.normalConfig == null){
          this.normalConfig = c.a(this._normalConfig, Integer.valueOf(Integer.MAX_VALUE), null, BatteryPerformanceConfigKt$convert$1.INSTANCE, 2, null);
       }
       return this.normalConfig;
    }
    public String toString(){
       return "BatteryPerformanceConfig\(_normalConfig="+this._normalConfig+", chargingConfig="+this.chargingConfig+", powerSaveModeConfig="+this.powerSaveModeConfig+"\)";
    }
}
