package com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketReservationData;
import java.io.Serializable;
import java.lang.Boolean;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveActivityRedPacketReservationData implements Serializable	// class@00094c
{
    public Boolean isReservationSuccess;

    public void LiveActivityRedPacketReservationData(){
       super(null, 1, null);
    }
    public void LiveActivityRedPacketReservationData(Boolean p0){
       super();
       this.isReservationSuccess = p0;
    }
    public void LiveActivityRedPacketReservationData(Boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static LiveActivityRedPacketReservationData copy$default(LiveActivityRedPacketReservationData p0,Boolean p1,int p2,Object p3){
       LiveActivityRedPacketReservationData isReservatio;
       if (p2 & 0x01) {
          isReservatio = p0.isReservationSuccess;
       }
       return p0.copy(isReservatio);
    }
    public final Boolean component1(){
       return this.isReservationSuccess;
    }
    public final LiveActivityRedPacketReservationData copy(Boolean p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReservationData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveActivityRedPacketReservationData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReservationData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveActivityRedPacketReservationData && a.g(this.isReservationSuccess, p0.isReservationSuccess))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveActivityRedPacketReservationData obj = PatchProxy.apply(null, this, LiveActivityRedPacketReservationData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isReservationSuccess;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final Boolean isReservationSuccess(){
       return this.isReservationSuccess;
    }
    public final void setReservationSuccess(Boolean p0){
       this.isReservationSuccess = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketReservationData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveActivityRedPacketReservationData\(isReservationSuccess="+this.isReservationSuccess+"\)";
    }
}
