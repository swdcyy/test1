package com.kwai.performance.overhead.traffic.monitor.TrafficBucket;
import java.lang.Boolean;
import java.lang.Object;
import nsd.u;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class TrafficBucket	// class@001177
{
    public long duration;
    public long initialTimeStamp;
    public Boolean isBackground;
    public boolean isPendingBucket;
    public boolean isWifi;
    public long rxBytes;
    public int trafficStat;
    public long txBytes;

    public void TrafficBucket(long p0,long p1,long p2,Boolean p3,boolean p4,long p5,boolean p6,int p7){
       super();
       this.duration = p0;
       this.rxBytes = p1;
       this.txBytes = p2;
       this.isBackground = p3;
       this.isPendingBucket = p4;
       this.initialTimeStamp = p5;
       this.isWifi = p6;
       this.trafficStat = p7;
    }
    public void TrafficBucket(long p0,long p1,long p2,Boolean p3,boolean p4,long p5,boolean p6,int p7,int p8,u p9){
       int i = p8;
       long l = (i & 0x01)? 0: p0;
       int i1 = (i & 0x0080)? 2: p7;
       super(l, p1, p2, p3, p4, p5, p6, i1);
       return;
    }
    public static TrafficBucket copy$default(TrafficBucket p0,long p1,long p2,long p3,Boolean p4,boolean p5,long p6,boolean p7,int p8,int p9,Object p10){
       TrafficBucket trafficBucke = p0;
       int i = p9;
       TrafficBucket duration = (i & 0x01)? trafficBucke.duration: p1;
       TrafficBucket rxBytes = (i & 0x02)? trafficBucke.rxBytes: p2;
       TrafficBucket txBytes = (i & 0x04)? trafficBucke.txBytes: p3;
       TrafficBucket isBackground = (i & 0x08)? trafficBucke.isBackground: p4;
       TrafficBucket isPendingBuc = (i & 0x10)? trafficBucke.isPendingBucket: p5;
       TrafficBucket initialTimeS = (i & 0x20)? trafficBucke.initialTimeStamp: p6;
       TrafficBucket isWifi = (i & 0x40)? trafficBucke.isWifi: p7;
       TrafficBucket trafficStat = (i & 0x0080)? trafficBucke.trafficStat: p8;
       return p0.copy(duration, rxBytes, txBytes, isBackground, isPendingBuc, initialTimeS, isWifi, trafficStat);
    }
    public final long component1(){
       return this.duration;
    }
    public final long component2(){
       return this.rxBytes;
    }
    public final long component3(){
       return this.txBytes;
    }
    public final Boolean component4(){
       return this.isBackground;
    }
    public final boolean component5(){
       return this.isPendingBucket;
    }
    public final long component6(){
       return this.initialTimeStamp;
    }
    public final boolean component7(){
       return this.isWifi;
    }
    public final int component8(){
       return this.trafficStat;
    }
    public final TrafficBucket copy(long p0,long p1,long p2,Boolean p3,boolean p4,long p5,boolean p6,int p7){
       TrafficBucket trafficBucke = new TrafficBucket(p0, p1, p2, p3, p4, p5, p6, p7);
       return v13;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TrafficBucket && (!this.duration - p0.duration && (!this.rxBytes - p0.rxBytes && (!this.txBytes - p0.txBytes && (a.g(this.isBackground, p0.isBackground) && (this.isPendingBucket == p0.isPendingBucket && (!this.initialTimeStamp - p0.initialTimeStamp && (this.isWifi == p0.isWifi && this.trafficStat == p0.trafficStat))))))))) {
          return true;
       }
       return false;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final long getInitialTimeStamp(){
       return this.initialTimeStamp;
    }
    public final long getRxBytes(){
       return this.rxBytes;
    }
    public final int getTrafficStat(){
       return this.trafficStat;
    }
    public final long getTxBytes(){
       return this.txBytes;
    }
    public int hashCode(){
       TrafficBucket tduration = this.duration;
       TrafficBucket trxBytes = this.rxBytes;
       trxBytes = this.txBytes;
       int i = (((((int)(tduration ^ (tduration >> 32)) * 31) + (int)(trxBytes ^ (trxBytes >> 32))) * 31) + (int)(trxBytes ^ (trxBytes >> 32))) * 31;
       tduration = this.isBackground;
       int i1 = (tduration != null)? tduration.hashCode(): 0;
       i = (i + i1) * 31;
       tduration = this.isPendingBucket;
       int i2 = 1;
       if (tduration != null) {
          i1 = 1;
       }
       TrafficBucket tinitialTime = this.initialTimeStamp;
       i = (((i + i1) * 31) + (int)(tinitialTime ^ (tinitialTime >> 32))) * 31;
       tduration = this.isWifi;
       if (tduration == null) {
          i2 = tduration;
       }
       return (((i + i2) * 31) + this.trafficStat);
    }
    public final Boolean isBackground(){
       return this.isBackground;
    }
    public final boolean isPendingBucket(){
       return this.isPendingBucket;
    }
    public final boolean isWifi(){
       return this.isWifi;
    }
    public final void setBackground(Boolean p0){
       this.isBackground = p0;
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
    public final void setInitialTimeStamp(long p0){
       this.initialTimeStamp = p0;
    }
    public final void setPendingBucket(boolean p0){
       this.isPendingBucket = p0;
    }
    public final void setRxBytes(long p0){
       this.rxBytes = p0;
    }
    public final void setTrafficStat(int p0){
       this.trafficStat = p0;
    }
    public final void setTxBytes(long p0){
       this.txBytes = p0;
    }
    public final void setWifi(boolean p0){
       this.isWifi = p0;
    }
    public String toString(){
       return "TrafficBucket\(duration="+this.duration+", rxBytes="+this.rxBytes+", txBytes="+this.txBytes+", isBackground="+this.isBackground+", isPendingBucket="+this.isPendingBucket+", initialTimeStamp="+this.initialTimeStamp+", isWifi="+this.isWifi+", trafficStat="+this.trafficStat+"\)";
    }
}
