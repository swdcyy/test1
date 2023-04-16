package com.yxcorp.gifshow.ad.webview.jshandler.ReserveData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.webview.jshandler.ReserveData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ReserveData implements Serializable	// class@0018f3
{
    public final String orderId;
    public final long reserveTimeMs;
    public final int state;
    public static final ReserveData$a Companion;
    public static final long serialVersionUID;

    static {
       ReserveData.Companion = new ReserveData$a(null);
    }
    public void ReserveData(){
       super(0, null, 0, 7, null);
    }
    public void ReserveData(int p0,String p1,long p2){
       a.p(p1, "orderId");
       super();
       this.state = p0;
       this.orderId = p1;
       this.reserveTimeMs = p2;
    }
    public void ReserveData(int p0,String p1,long p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static ReserveData copy$default(ReserveData p0,int p1,String p2,long p3,int p4,Object p5){
       ReserveData state;
       ReserveData orderId;
       ReserveData reserveTimeM;
       if (p4 & 0x01) {
          state = p0.state;
       }
       if (p4 & 0x02) {
          orderId = p0.orderId;
       }
       if (p4 & 0x04) {
          reserveTimeM = p0.reserveTimeMs;
       }
       return p0.copy(state, orderId, reserveTimeM);
    }
    public final int component1(){
       return this.state;
    }
    public final String component2(){
       return this.orderId;
    }
    public final long component3(){
       return this.reserveTimeMs;
    }
    public final ReserveData copy(int p0,String p1,long p2){
       if (PatchProxy.isSupport(ReserveData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, ReserveData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "orderId");
       return new ReserveData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReserveData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ReserveData && (this.state == p0.state && (a.g(this.orderId, p0.orderId) && !this.reserveTimeMs - p0.reserveTimeMs)))) {
          return true;
       }
       return false;
    }
    public final String getOrderId(){
       return this.orderId;
    }
    public final long getReserveTimeMs(){
       return this.reserveTimeMs;
    }
    public final int getState(){
       return this.state;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ReserveData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.state * 31;
       ReserveData torderId = this.orderId;
       int i1 = (torderId != null)? torderId.hashCode(): 0;
       torderId = this.reserveTimeMs;
       return (((i + i1) * 31) + (int)(torderId ^ (torderId >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReserveData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReserveData\(state="+this.state+", orderId="+this.orderId+", reserveTimeMs="+this.reserveTimeMs+"\)";
    }
}
