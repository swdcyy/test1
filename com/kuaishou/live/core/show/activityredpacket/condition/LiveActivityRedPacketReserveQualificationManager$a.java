package com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$a;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveActivityRedPacketReserveQualificationManager$a	// class@000943
{
    public boolean a;
    public LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource b;
    public String c;

    public void LiveActivityRedPacketReserveQualificationManager$a(boolean p0,LiveActivityRedPacketReserveQualificationManager$ReservationChangeSource p1,String p2){
       a.p(p1, "source");
       a.p(p2, "reservationId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReserveQualificationManager$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveActivityRedPacketReserveQualificationManager$a && (this.a == p0.a && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       LiveActivityRedPacketReserveQualificationManager$a obj = PatchProxy.apply(null, this, LiveActivityRedPacketReserveQualificationManager$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LiveActivityRedPacketReserveQualificationManager$a tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketReserveQualificationManager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReservationNotifyParams\(isReserved="+this.a+", source="+this.b+", reservationId="+this.c+"\)";
    }
}
