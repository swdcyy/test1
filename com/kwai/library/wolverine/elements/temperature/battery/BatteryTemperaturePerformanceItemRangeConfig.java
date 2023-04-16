package com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceItemRangeConfig;
import java.io.Serializable;
import com.google.common.collect.Range;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class BatteryTemperaturePerformanceItemRangeConfig implements Serializable	// class@000ab9
{
    public final Range range;
    public final int score;

    public void BatteryTemperaturePerformanceItemRangeConfig(Range p0,int p1){
       a.p(p0, "range");
       super();
       this.range = p0;
       this.score = p1;
    }
    public static BatteryTemperaturePerformanceItemRangeConfig copy$default(BatteryTemperaturePerformanceItemRangeConfig p0,Range p1,int p2,int p3,Object p4){
       BatteryTemperaturePerformanceItemRangeConfig range;
       BatteryTemperaturePerformanceItemRangeConfig score;
       if (p3 & 0x01) {
          range = p0.range;
       }
       if (p3 & 0x02) {
          score = p0.score;
       }
       return p0.copy(range, score);
    }
    public final Range component1(){
       return this.range;
    }
    public final int component2(){
       return this.score;
    }
    public final BatteryTemperaturePerformanceItemRangeConfig copy(Range p0,int p1){
       a.p(p0, "range");
       return new BatteryTemperaturePerformanceItemRangeConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BatteryTemperaturePerformanceItemRangeConfig && (a.g(this.range, p0.range) && this.score == p0.score))) {
          return true;
       }
       return false;
    }
    public final Range getRange(){
       return this.range;
    }
    public final int getScore(){
       return this.score;
    }
    public int hashCode(){
       BatteryTemperaturePerformanceItemRangeConfig trange = this.range;
       int i = (trange != null)? trange.hashCode(): 0;
       return ((i * 31) + this.score);
    }
    public String toString(){
       return "BatteryTemperaturePerformanceItemRangeConfig\(range="+this.range+", score="+this.score+"\)";
    }
}
