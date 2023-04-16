package com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketQueryReservationResponse;
import java.io.Serializable;
import com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketQueryReservationData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveActivityRedPacketQueryReservationResponse implements Serializable	// class@00094b
{
    public LiveActivityRedPacketQueryReservationData data;

    public void LiveActivityRedPacketQueryReservationResponse(LiveActivityRedPacketQueryReservationData p0){
       a.p(p0, "data");
       super();
       this.data = p0;
    }
    public final LiveActivityRedPacketQueryReservationData getData(){
       return this.data;
    }
    public final void setData(LiveActivityRedPacketQueryReservationData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketQueryReservationResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.data = p0;
       return;
    }
}
