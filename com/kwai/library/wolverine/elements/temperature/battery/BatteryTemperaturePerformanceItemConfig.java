package com.kwai.library.wolverine.elements.temperature.battery.BatteryTemperaturePerformanceItemConfig;
import t27.a;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Comparable;
import java.lang.String;
import java.lang.StringBuilder;

public final class BatteryTemperaturePerformanceItemConfig implements a, Serializable	// class@000ab8
{
    public final float lowBound;
    public final int score;

    public void BatteryTemperaturePerformanceItemConfig(float p0,int p1){
       super();
       this.lowBound = p0;
       this.score = p1;
    }
    public static BatteryTemperaturePerformanceItemConfig copy$default(BatteryTemperaturePerformanceItemConfig p0,float p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = p0.getLowBound().floatValue();
       }
       if (p3 & 0x02) {
          p2 = p0.getScore().intValue();
       }
       return p0.copy(p1, p2);
    }
    public final float component1(){
       return this.getLowBound().floatValue();
    }
    public final int component2(){
       return this.getScore().intValue();
    }
    public final BatteryTemperaturePerformanceItemConfig copy(float p0,int p1){
       return new BatteryTemperaturePerformanceItemConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BatteryTemperaturePerformanceItemConfig && (!Float.compare(this.getLowBound().floatValue(), p0.getLowBound().floatValue()) && this.getScore().intValue() == p0.getScore().intValue()))) {
          return true;
       }
       return false;
    }
    public Comparable getLowBound(){
       return this.getLowBound();
    }
    public Float getLowBound(){
       return Float.valueOf(this.lowBound);
    }
    public Integer getScore(){
       return Integer.valueOf(this.score);
    }
    public Object getScore(){
       return this.getScore();
    }
    public int hashCode(){
       return ((Float.floatToIntBits(this.getLowBound().floatValue()) * 31) + this.getScore().intValue());
    }
    public String toString(){
       return "BatteryTemperaturePerformanceItemConfig\(lowBound="+this.getLowBound()+", score="+this.getScore()+"\)";
    }
}
