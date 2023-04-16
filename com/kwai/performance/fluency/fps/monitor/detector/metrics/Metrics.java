package com.kwai.performance.fluency.fps.monitor.detector.metrics.Metrics;
import java.lang.Object;
import java.lang.Float;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class Metrics	// class@00107d
{
    public final long a;
    public final float animationDuration;
    public final float commandIssueDuration;
    public final float drawDuration;
    public final float inputHandlingDuration;
    public final float layoutMeasureDuration;
    public final float swapBuffersDuration;
    public final float syncDuration;
    public final float unknownDelayDuration;

    public void Metrics(float p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,long p8){
       super();
       this.inputHandlingDuration = p0;
       this.animationDuration = p1;
       this.layoutMeasureDuration = p2;
       this.drawDuration = p3;
       this.syncDuration = p4;
       this.commandIssueDuration = p5;
       this.swapBuffersDuration = p6;
       this.unknownDelayDuration = p7;
       this.a = p8;
    }
    public final long a(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Metrics) {
          return false;
       }
       if (!a.g(Float.valueOf(this.inputHandlingDuration), Float.valueOf(p0.inputHandlingDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.animationDuration), Float.valueOf(p0.animationDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.layoutMeasureDuration), Float.valueOf(p0.layoutMeasureDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.drawDuration), Float.valueOf(p0.drawDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.syncDuration), Float.valueOf(p0.syncDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.commandIssueDuration), Float.valueOf(p0.commandIssueDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.swapBuffersDuration), Float.valueOf(p0.swapBuffersDuration))) {
          return false;
       }
       if (!a.g(Float.valueOf(this.unknownDelayDuration), Float.valueOf(p0.unknownDelayDuration))) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       Metrics ta = this.a;
       return ((((((((((((((((Float.floatToIntBits(this.inputHandlingDuration) * 31) + Float.floatToIntBits(this.animationDuration)) * 31) + Float.floatToIntBits(this.layoutMeasureDuration)) * 31) + Float.floatToIntBits(this.drawDuration)) * 31) + Float.floatToIntBits(this.syncDuration)) * 31) + Float.floatToIntBits(this.commandIssueDuration)) * 31) + Float.floatToIntBits(this.swapBuffersDuration)) * 31) + Float.floatToIntBits(this.unknownDelayDuration)) * 31) + (int)(ta ^ (ta >> 32)));
    }
    public String toString(){
       return "Metrics\(inputHandlingDuration="+this.inputHandlingDuration+", animationDuration="+this.animationDuration+", layoutMeasureDuration="+this.layoutMeasureDuration+", drawDuration="+this.drawDuration+", syncDuration="+this.syncDuration+", commandIssueDuration="+this.commandIssueDuration+", swapBuffersDuration="+this.swapBuffersDuration+", unknownDelayDuration="+this.unknownDelayDuration+", vsyncTimestamp="+this.a+')';
    }
}
