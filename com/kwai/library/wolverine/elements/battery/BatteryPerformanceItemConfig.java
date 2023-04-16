package com.kwai.library.wolverine.elements.battery.BatteryPerformanceItemConfig;
import t27.a;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Comparable;
import java.lang.String;
import java.lang.StringBuilder;

public final class BatteryPerformanceItemConfig implements a, Serializable	// class@000aad
{
    public final int lowBound;
    public final int score;

    public void BatteryPerformanceItemConfig(int p0,int p1){
       super();
       this.lowBound = p0;
       this.score = p1;
    }
    public static BatteryPerformanceItemConfig copy$default(BatteryPerformanceItemConfig p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = p0.getLowBound().intValue();
       }
       if (p3 & 0x02) {
          p2 = p0.getScore().intValue();
       }
       return p0.copy(p1, p2);
    }
    public final int component1(){
       return this.getLowBound().intValue();
    }
    public final int component2(){
       return this.getScore().intValue();
    }
    public final BatteryPerformanceItemConfig copy(int p0,int p1){
       return new BatteryPerformanceItemConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BatteryPerformanceItemConfig && (this.getLowBound().intValue() == p0.getLowBound().intValue() && this.getScore().intValue() == p0.getScore().intValue()))) {
          return true;
       }
       return false;
    }
    public Comparable getLowBound(){
       return this.getLowBound();
    }
    public Integer getLowBound(){
       return Integer.valueOf(this.lowBound);
    }
    public Integer getScore(){
       return Integer.valueOf(this.score);
    }
    public Object getScore(){
       return this.getScore();
    }
    public int hashCode(){
       return ((this.getLowBound().intValue() * 31) + this.getScore().intValue());
    }
    public String toString(){
       return "BatteryPerformanceItemConfig\(lowBound="+this.getLowBound()+", score="+this.getScore()+"\)";
    }
}
