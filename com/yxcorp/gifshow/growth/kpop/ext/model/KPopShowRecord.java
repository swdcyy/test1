package com.yxcorp.gifshow.growth.kpop.ext.model.KPopShowRecord;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.KPopShowRecord$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KPopShowRecord implements Serializable	// class@00140b
{
    public long lastShowTime;
    public int showCountToday;
    public int showCountTotal;
    public static final KPopShowRecord$a Companion;
    public static final long serialVersionUID;

    static {
       KPopShowRecord.Companion = new KPopShowRecord$a(null);
    }
    public void KPopShowRecord(){
       super(0, 0, 0, 7, null);
    }
    public void KPopShowRecord(long p0){
       super(p0, 0, 0, 6, null);
    }
    public void KPopShowRecord(long p0,int p1){
       super(p0, p1, 0, 4, null);
    }
    public void KPopShowRecord(long p0,int p1,int p2){
       super();
       this.lastShowTime = p0;
       this.showCountToday = p1;
       this.showCountTotal = p2;
    }
    public void KPopShowRecord(long p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static KPopShowRecord copy$default(KPopShowRecord p0,long p1,int p2,int p3,int p4,Object p5){
       KPopShowRecord lastShowTime;
       KPopShowRecord showCountTod;
       KPopShowRecord showCountTot;
       if (p4 & 0x01) {
          lastShowTime = p0.lastShowTime;
       }
       if (p4 & 0x02) {
          showCountTod = p0.showCountToday;
       }
       if (p4 & 0x04) {
          showCountTot = p0.showCountTotal;
       }
       return p0.copy(lastShowTime, showCountTod, showCountTot);
    }
    public final long component1(){
       return this.lastShowTime;
    }
    public final int component2(){
       return this.showCountToday;
    }
    public final int component3(){
       return this.showCountTotal;
    }
    public final KPopShowRecord copy(long p0,int p1,int p2){
       if (PatchProxy.isSupport(KPopShowRecord.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KPopShowRecord.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KPopShowRecord(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof KPopShowRecord && (!this.lastShowTime - p0.lastShowTime && (this.showCountToday == p0.showCountToday && this.showCountTotal == p0.showCountTotal)))) {
          return true;
       }
       return false;
    }
    public final long getLastShowTime(){
       return this.lastShowTime;
    }
    public final int getShowCountToday(){
       return this.showCountToday;
    }
    public final int getShowCountTotal(){
       return this.showCountTotal;
    }
    public int hashCode(){
       KPopShowRecord obj = PatchProxy.apply(null, this, KPopShowRecord.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lastShowTime;
       return (((((int)(obj ^ (obj >> 32)) * 31) + this.showCountToday) * 31) + this.showCountTotal);
    }
    public final void setLastShowTime(long p0){
       this.lastShowTime = p0;
    }
    public final void setShowCountToday(int p0){
       this.showCountToday = p0;
    }
    public final void setShowCountTotal(int p0){
       this.showCountTotal = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KPopShowRecord.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KPopShowRecord\(lastShowTime="+this.lastShowTime+", showCountToday="+this.showCountToday+", showCountTotal="+this.showCountTotal+"\)";
    }
}
