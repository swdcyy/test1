package com.kwai.library.wolverine.elements.temperature.device.TemperaturePerformanceItemConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class TemperaturePerformanceItemConfig implements Serializable	// class@000aba
{
    public final int score;
    public final String value;

    public void TemperaturePerformanceItemConfig(String p0,int p1){
       super();
       this.value = p0;
       this.score = p1;
    }
    public static TemperaturePerformanceItemConfig copy$default(TemperaturePerformanceItemConfig p0,String p1,int p2,int p3,Object p4){
       TemperaturePerformanceItemConfig value;
       TemperaturePerformanceItemConfig score;
       if (p3 & 0x01) {
          value = p0.value;
       }
       if (p3 & 0x02) {
          score = p0.score;
       }
       return p0.copy(value, score);
    }
    public final String component1(){
       return this.value;
    }
    public final int component2(){
       return this.score;
    }
    public final TemperaturePerformanceItemConfig copy(String p0,int p1){
       return new TemperaturePerformanceItemConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TemperaturePerformanceItemConfig && (a.g(this.value, p0.value) && this.score == p0.score))) {
          return true;
       }
       return false;
    }
    public final int getScore(){
       return this.score;
    }
    public final String getValue(){
       return this.value;
    }
    public int hashCode(){
       TemperaturePerformanceItemConfig tvalue = this.value;
       int i = (tvalue != null)? tvalue.hashCode(): 0;
       return ((i * 31) + this.score);
    }
    public String toString(){
       return "TemperaturePerformanceItemConfig\(value="+this.value+", score="+this.score+"\)";
    }
}
