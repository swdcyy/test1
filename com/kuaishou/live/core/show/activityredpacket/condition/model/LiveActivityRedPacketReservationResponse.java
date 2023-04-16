package com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketReservationResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketReservationData;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveActivityRedPacketReservationResponse implements Serializable	// class@00094d
{
    public final LiveActivityRedPacketReservationData reservationData;

    public void LiveActivityRedPacketReservationResponse(){
       super(null, 1, null);
    }
    public void LiveActivityRedPacketReservationResponse(LiveActivityRedPacketReservationData p0){
       super();
       this.reservationData = p0;
    }
    public void LiveActivityRedPacketReservationResponse(LiveActivityRedPacketReservationData p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static LiveActivityRedPacketReservationResponse copy$default(LiveActivityRedPacketReservationResponse p0,LiveActivityRedPacketReservationData p1,int p2,Object p3){
       LiveActivityRedPacketReservationResponse reservationD;
       if (p2 & 0x01) {
          reservationD = p0.reservationData;
       }
       return p0.copy(reservationD);
    }
    public final LiveActivityRedPacketReservationData component1(){
       return this.reservationData;
    }
    public final LiveActivityRedPacketReservationResponse copy(LiveActivityRedPacketReservationData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReservationResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveActivityRedPacketReservationResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReservationResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveActivityRedPacketReservationResponse && a.g(this.reservationData, p0.reservationData))) {
          return true;
       }
       return false;
    }
    public final LiveActivityRedPacketReservationData getReservationData(){
       return this.reservationData;
    }
    public int hashCode(){
       LiveActivityRedPacketReservationResponse obj = PatchProxy.apply(null, this, LiveActivityRedPacketReservationResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.reservationData;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketReservationResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveActivityRedPacketReservationResponse\(reservationData="+this.reservationData+"\)";
    }
}
